package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewShortcut extends js.Object {
  val NewShortcut: OutlookBarShortcut = js.native
}

object AnonNewShortcut {
  @scala.inline
  def apply(NewShortcut: OutlookBarShortcut): AnonNewShortcut = {
    val __obj = js.Dynamic.literal(NewShortcut = NewShortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewShortcut]
  }
  @scala.inline
  implicit class AnonNewShortcutOps[Self <: AnonNewShortcut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewShortcut(value: OutlookBarShortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewShortcut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

