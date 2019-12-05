package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Note")
@js.native
class Note ()
  extends typingsSlinky.nodegit.noteMod.Note

/* static members */
@JSImport("nodegit", "Note")
@js.native
object Note extends js.Object {
  def create(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsSlinky.nodegit.signatureMod.Signature,
    committer: typingsSlinky.nodegit.signatureMod.Signature,
    oid: typingsSlinky.nodegit.oidMod.Oid,
    note: String,
    force: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  def foreach(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    noteCb: js.Function,
    payload: js.Any
  ): js.Promise[Double] = js.native
  def iteratorNew(repo: typingsSlinky.nodegit.repositoryMod.Repository, notesRef: String): js.Promise[_] = js.native
  def next(
    noteId: typingsSlinky.nodegit.oidMod.Oid,
    annotatedId: typingsSlinky.nodegit.oidMod.Oid,
    it: js.Any
  ): Double = js.native
  def read(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    oid: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[typingsSlinky.nodegit.noteMod.Note] = js.native
  def remove(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsSlinky.nodegit.signatureMod.Signature,
    committer: typingsSlinky.nodegit.signatureMod.Signature,
    oid: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}

