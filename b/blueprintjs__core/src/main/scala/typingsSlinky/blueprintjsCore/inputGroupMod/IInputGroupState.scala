package typingsSlinky.blueprintjsCore.inputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputGroupState extends js.Object {
  var rightElementWidth: Double = js.native
}

object IInputGroupState {
  @scala.inline
  def apply(rightElementWidth: Double): IInputGroupState = {
    val __obj = js.Dynamic.literal(rightElementWidth = rightElementWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputGroupState]
  }
  @scala.inline
  implicit class IInputGroupStateOps[Self <: IInputGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRightElementWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElementWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

