package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to modify.
    */
  var HapgArn: typingsSlinky.awsSdk.cloudhsmMod.HapgArn = js.native
  /**
    * The new label for the high-availability partition group.
    */
  var Label: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.Label] = js.native
  /**
    * The list of partition serial numbers to make members of the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.PartitionSerialList] = js.native
}

object ModifyHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): ModifyHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHapgRequest]
  }
  @scala.inline
  implicit class ModifyHapgRequestOps[Self <: ModifyHapgRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHapgArn(value: HapgArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HapgArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionSerialList(value: PartitionSerialList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionSerialList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionSerialList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionSerialList")(js.undefined)
        ret
    }
  }
  
}

