package typingsSlinky.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeItem extends js.Object {
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.InstanceType] = js.native
}

object InstanceTypeItem {
  @scala.inline
  def apply(): InstanceTypeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeItem]
  }
  @scala.inline
  implicit class InstanceTypeItemOps[Self <: InstanceTypeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
  }
  
}

