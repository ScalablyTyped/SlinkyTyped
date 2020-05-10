package typingsSlinky.officeUiFabricReact.focusTrapZoneNestedExampleMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusTrapZoneNestedExampleState extends js.Object {
  var activeStates: NumberDictionary[Boolean] = js.native
}

object IFocusTrapZoneNestedExampleState {
  @scala.inline
  def apply(activeStates: NumberDictionary[Boolean]): IFocusTrapZoneNestedExampleState = {
    val __obj = js.Dynamic.literal(activeStates = activeStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFocusTrapZoneNestedExampleState]
  }
  @scala.inline
  implicit class IFocusTrapZoneNestedExampleStateOps[Self <: IFocusTrapZoneNestedExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveStates(value: NumberDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

