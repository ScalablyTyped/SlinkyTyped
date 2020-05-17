package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.device
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceObject
  extends BaseObject
     with AnyObject {
  @JSName("common")
  var common_DeviceObject: DeviceCommon = js.native
  @JSName("type")
  var type_DeviceObject: device = js.native
}

object DeviceObject {
  @scala.inline
  def apply(_id: String, common: DeviceCommon, native: Record[String, ObjectField], `type`: device): DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceObject]
  }
  @scala.inline
  implicit class DeviceObjectOps[Self <: DeviceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommon(value: DeviceCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

