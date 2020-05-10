package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelShortcut extends js.Object {
  var Cancel: Boolean = js.native
  val Shortcut: OutlookBarShortcut = js.native
}

object AnonCancelShortcut {
  @scala.inline
  def apply(Cancel: Boolean, Shortcut: OutlookBarShortcut): AnonCancelShortcut = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelShortcut]
  }
  @scala.inline
  implicit class AnonCancelShortcutOps[Self <: AnonCancelShortcut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcut(value: OutlookBarShortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortcut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

