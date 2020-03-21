package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Tag")
@js.native
class Tag ()
  extends typingsSlinky.nodegit.tagMod.Tag

/* static members */
@JSImport("nodegit", "Tag")
@js.native
object Tag extends js.Object {
  def annotationCreate(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsSlinky.nodegit.objectMod.Object,
    tagger: typingsSlinky.nodegit.signatureMod.Signature,
    message: String
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  def create(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsSlinky.nodegit.objectMod.Object,
    tagger: typingsSlinky.nodegit.signatureMod.Signature,
    message: String,
    force: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  def createLightweight(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsSlinky.nodegit.objectMod.Object,
    force: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  def delete(repo: typingsSlinky.nodegit.repositoryMod.Repository, tagName: String): js.Promise[Double] = js.native
  def list(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def listMatch(tagNames: String, pattern: String, repo: typingsSlinky.nodegit.repositoryMod.Repository): Double = js.native
  def listMatch(tagNames: js.Array[String], pattern: String, repo: typingsSlinky.nodegit.repositoryMod.Repository): Double = js.native
  def listMatch(
    tagNames: typingsSlinky.nodegit.strArrayMod.Strarray,
    pattern: String,
    repo: typingsSlinky.nodegit.repositoryMod.Repository
  ): Double = js.native
  /**
    * Retrieves the tag pointed to by the oid
    *
    *
    */
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.oidMod.Oid): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.tagMod.Tag): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
  def lookupPrefix(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
}

