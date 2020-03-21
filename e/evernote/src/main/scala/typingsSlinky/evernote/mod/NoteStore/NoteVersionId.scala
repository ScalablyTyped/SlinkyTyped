package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.AnonLastEditorId
import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteVersionId")
@js.native
class NoteVersionId () extends js.Object {
  def this(args: AnonLastEditorId) = this()
  var lastEditorId: js.UndefOr[UserID] = js.native
  var saved: js.UndefOr[Timestamp] = js.native
  var title: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}

