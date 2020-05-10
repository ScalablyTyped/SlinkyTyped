package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.interfaceMod.NavOutletElement
import typingsSlinky.ionicCore.interfaceMod.RouteID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIds extends js.Object {
  var ids: js.Array[RouteID] = js.native
  var outlet: js.UndefOr[NavOutletElement] = js.native
}

object AnonIds {
  @scala.inline
  def apply(ids: js.Array[RouteID]): AnonIds = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIds]
  }
  @scala.inline
  implicit class AnonIdsOps[Self <: AnonIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[RouteID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlet(value: NavOutletElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlet")(js.undefined)
        ret
    }
  }
  
}

