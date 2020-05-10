package typingsSlinky.officeUiFabricReact.textFieldCustomRenderExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldCustomRenderExampleState extends js.Object {
  var isCalloutVisible: Boolean = js.native
}

object ITextFieldCustomRenderExampleState {
  @scala.inline
  def apply(isCalloutVisible: Boolean): ITextFieldCustomRenderExampleState = {
    val __obj = js.Dynamic.literal(isCalloutVisible = isCalloutVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldCustomRenderExampleState]
  }
  @scala.inline
  implicit class ITextFieldCustomRenderExampleStateOps[Self <: ITextFieldCustomRenderExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCalloutVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalloutVisible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

