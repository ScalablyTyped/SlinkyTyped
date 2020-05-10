package typingsSlinky.officeUiFabricReact.focusTrapZoneFocusZoneExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusTrapZoneFocusZoneExampleState extends js.Object {
  var useTrapZone: Boolean = js.native
}

object IFocusTrapZoneFocusZoneExampleState {
  @scala.inline
  def apply(useTrapZone: Boolean): IFocusTrapZoneFocusZoneExampleState = {
    val __obj = js.Dynamic.literal(useTrapZone = useTrapZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFocusTrapZoneFocusZoneExampleState]
  }
  @scala.inline
  implicit class IFocusTrapZoneFocusZoneExampleStateOps[Self <: IFocusTrapZoneFocusZoneExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseTrapZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTrapZone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

