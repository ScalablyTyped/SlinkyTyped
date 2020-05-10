package typingsSlinky.officeUiFabricReact.focusTrapZoneBoxClickExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusTrapZoneBoxClickExampleState extends js.Object {
  var useTrapZone: Boolean = js.native
}

object IFocusTrapZoneBoxClickExampleState {
  @scala.inline
  def apply(useTrapZone: Boolean): IFocusTrapZoneBoxClickExampleState = {
    val __obj = js.Dynamic.literal(useTrapZone = useTrapZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFocusTrapZoneBoxClickExampleState]
  }
  @scala.inline
  implicit class IFocusTrapZoneBoxClickExampleStateOps[Self <: IFocusTrapZoneBoxClickExampleState] (val x: Self) extends AnyVal {
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

