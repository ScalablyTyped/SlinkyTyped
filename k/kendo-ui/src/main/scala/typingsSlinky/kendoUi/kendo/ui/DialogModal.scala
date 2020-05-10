package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogModal extends js.Object {
  var preventScroll: js.UndefOr[String] = js.native
}

object DialogModal {
  @scala.inline
  def apply(): DialogModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogModal]
  }
  @scala.inline
  implicit class DialogModalOps[Self <: DialogModal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventScroll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScroll")(js.undefined)
        ret
    }
  }
  
}

