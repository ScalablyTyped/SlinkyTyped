package typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatusList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var statusListList: js.Array[typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(statusListList: js.Array[typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(statusListList = statusListList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusListList(value: js.Array[typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusListList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

