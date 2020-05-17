package typingsSlinky.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSaveAsUI extends js.Object {
  var Cancel: Boolean = js.native
  val SaveAsUI: Boolean = js.native
}

object CancelSaveAsUI {
  @scala.inline
  def apply(Cancel: Boolean, SaveAsUI: Boolean): CancelSaveAsUI = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSaveAsUI]
  }
  @scala.inline
  implicit class CancelSaveAsUIOps[Self <: CancelSaveAsUI] (val x: Self) extends AnyVal {
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
    def withSaveAsUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveAsUI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

