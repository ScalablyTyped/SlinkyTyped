package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIoT1ClickDevicesSer extends js.Object {
  val Types: this.type = js.native
}

object TypeofIoT1ClickDevicesSer {
  @scala.inline
  def apply(Types: TypeofIoT1ClickDevicesSer): TypeofIoT1ClickDevicesSer = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIoT1ClickDevicesSer]
  }
  @scala.inline
  implicit class TypeofIoT1ClickDevicesSerOps[Self <: TypeofIoT1ClickDevicesSer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: TypeofIoT1ClickDevicesSer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

