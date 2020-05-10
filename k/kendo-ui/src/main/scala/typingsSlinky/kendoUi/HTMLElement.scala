package typingsSlinky.kendoUi

import typingsSlinky.kendoUi.kendo.data.BindingTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  var kendoBindingTarget: BindingTarget = js.native
}

object HTMLElement {
  @scala.inline
  def apply(kendoBindingTarget: BindingTarget): HTMLElement = {
    val __obj = js.Dynamic.literal(kendoBindingTarget = kendoBindingTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKendoBindingTarget(value: BindingTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kendoBindingTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

