package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Note")
@js.native
class Note ()
  extends typingsSlinky.nodegit.noteMod.Note
/* static members */
object Note {
  
  @JSImport("nodegit", "Note.create")
  @js.native
  def create(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsSlinky.nodegit.signatureMod.Signature,
    committer: typingsSlinky.nodegit.signatureMod.Signature,
    oid: typingsSlinky.nodegit.oidMod.Oid,
    note: String,
    force: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Note.foreach")
  @js.native
  def foreach(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    noteCb: js.Function,
    payload: js.Any
  ): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Note.iteratorNew")
  @js.native
  def iteratorNew(repo: typingsSlinky.nodegit.repositoryMod.Repository, notesRef: String): js.Promise[_] = js.native
  
  @JSImport("nodegit", "Note.next")
  @js.native
  def next(
    noteId: typingsSlinky.nodegit.oidMod.Oid,
    annotatedId: typingsSlinky.nodegit.oidMod.Oid,
    it: js.Any
  ): Double = js.native
  
  @JSImport("nodegit", "Note.read")
  @js.native
  def read(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    oid: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[typingsSlinky.nodegit.noteMod.Note] = js.native
  
  @JSImport("nodegit", "Note.remove")
  @js.native
  def remove(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsSlinky.nodegit.signatureMod.Signature,
    committer: typingsSlinky.nodegit.signatureMod.Signature,
    oid: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}
