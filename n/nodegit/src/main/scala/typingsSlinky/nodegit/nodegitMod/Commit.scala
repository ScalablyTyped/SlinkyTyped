package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Commit")
@js.native
class Commit ()
  extends typingsSlinky.nodegit.commitMod.Commit

/* static members */
@JSImport("nodegit", "Commit")
@js.native
object Commit extends js.Object {
  def create(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typingsSlinky.nodegit.signatureMod.Signature,
    committer: typingsSlinky.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typingsSlinky.nodegit.treeMod.Tree,
    parentCount: Double,
    parents: js.Array[_]
  ): typingsSlinky.nodegit.oidMod.Oid = js.native
  def createV(
    id: typingsSlinky.nodegit.oidMod.Oid,
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typingsSlinky.nodegit.signatureMod.Signature,
    committer: typingsSlinky.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typingsSlinky.nodegit.treeMod.Tree,
    parentCount: Double
  ): Double = js.native
  def createWithSignature(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commitContent: String,
    signature: String,
    signatureField: String
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  /**
    * Retrieves the commit pointed to by the oid
    *
    *
    */
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsSlinky.nodegit.commitMod.Commit] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.commitMod.Commit): js.Promise[typingsSlinky.nodegit.commitMod.Commit] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.oidMod.Oid): js.Promise[typingsSlinky.nodegit.commitMod.Commit] = js.native
  def lookupPrefix(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsSlinky.nodegit.commitMod.Commit] = js.native
}

