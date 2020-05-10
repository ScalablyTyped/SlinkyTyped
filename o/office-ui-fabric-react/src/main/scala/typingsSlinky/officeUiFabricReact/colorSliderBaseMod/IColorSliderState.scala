package typingsSlinky.officeUiFabricReact.colorSliderBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorSliderState extends js.Object {
  var currentValue: Double = js.native
}

object IColorSliderState {
  @scala.inline
  def apply(currentValue: Double): IColorSliderState = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderState]
  }
  @scala.inline
  implicit class IColorSliderStateOps[Self <: IColorSliderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

