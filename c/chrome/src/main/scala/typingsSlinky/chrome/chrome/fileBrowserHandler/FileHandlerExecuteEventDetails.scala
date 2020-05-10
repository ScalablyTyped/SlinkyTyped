package typingsSlinky.chrome.chrome.fileBrowserHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileHandlerExecuteEventDetails extends js.Object {
  /** Array of Entry instances representing files that are targets of this action (selected in ChromeOS file browser). */
  var entries: js.Array[_] = js.native
  /** Optional. The ID of the tab that raised this event. Tab IDs are unique within a browser session.  */
  var tab_id: js.UndefOr[Double] = js.native
}

object FileHandlerExecuteEventDetails {
  @scala.inline
  def apply(entries: js.Array[_]): FileHandlerExecuteEventDetails = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHandlerExecuteEventDetails]
  }
  @scala.inline
  implicit class FileHandlerExecuteEventDetailsOps[Self <: FileHandlerExecuteEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_id")(js.undefined)
        ret
    }
  }
  
}

