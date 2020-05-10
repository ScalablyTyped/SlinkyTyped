package typingsSlinky.officeJsPreview.OneNote

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.StickyNotesContextMenuExecuted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the StickyNotesContextMenuExecuted event
  *
  * [Api set: OneNoteApi 1.5]
  */
@js.native
trait StickyNotesContextMenuExecutedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.5]
    */
  var `type`: StickyNotesContextMenuExecuted = js.native
}

object StickyNotesContextMenuExecutedEventArgs {
  @scala.inline
  def apply(`type`: StickyNotesContextMenuExecuted): StickyNotesContextMenuExecutedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyNotesContextMenuExecutedEventArgs]
  }
  @scala.inline
  implicit class StickyNotesContextMenuExecutedEventArgsOps[Self <: StickyNotesContextMenuExecutedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: StickyNotesContextMenuExecuted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

