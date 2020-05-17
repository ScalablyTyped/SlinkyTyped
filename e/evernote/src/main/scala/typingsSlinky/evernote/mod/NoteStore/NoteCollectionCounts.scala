package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.NotebookCounts
import typingsSlinky.evernote.mod.Types.Guid
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteCollectionCounts")
@js.native
class NoteCollectionCounts () extends js.Object {
  def this(args: NotebookCounts) = this()
  var notebookCounts: js.UndefOr[Map[Guid, Double]] = js.native
  var tagCounts: js.UndefOr[Map[Guid, Double]] = js.native
  var trashCount: js.UndefOr[Double] = js.native
}

