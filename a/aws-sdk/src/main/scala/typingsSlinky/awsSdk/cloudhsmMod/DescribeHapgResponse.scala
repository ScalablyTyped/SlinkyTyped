package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HapgArn] = js.native
  /**
    * The serial number of the high-availability partition group.
    */
  var HapgSerial: js.UndefOr[String] = js.native
  /**
    * 
    */
  var HsmsLastActionFailed: js.UndefOr[HsmList] = js.native
  /**
    * 
    */
  var HsmsPendingDeletion: js.UndefOr[HsmList] = js.native
  /**
    * 
    */
  var HsmsPendingRegistration: js.UndefOr[HsmList] = js.native
  /**
    * The label for the high-availability partition group.
    */
  var Label: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.Label] = js.native
  /**
    * The date and time the high-availability partition group was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The list of partition serial numbers that belong to the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.PartitionSerialList] = js.native
  /**
    * The state of the high-availability partition group.
    */
  var State: js.UndefOr[CloudHsmObjectState] = js.native
}

object DescribeHapgResponse {
  @scala.inline
  def apply(): DescribeHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHapgResponse]
  }
  @scala.inline
  implicit class DescribeHapgResponseOps[Self <: DescribeHapgResponse] (val x: Self) extends AnyVal {
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
    def withoutHapgArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HapgArn")(js.undefined)
        ret
    }
    @scala.inline
    def withHapgSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HapgSerial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHapgSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HapgSerial")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmsLastActionFailed(value: HsmList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmsLastActionFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmsLastActionFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmsLastActionFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmsPendingDeletion(value: HsmList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmsPendingDeletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmsPendingDeletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmsPendingDeletion")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmsPendingRegistration(value: HsmList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmsPendingRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmsPendingRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmsPendingRegistration")(js.undefined)
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
    def withLastModifiedTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(js.undefined)
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
    @scala.inline
    def withState(value: CloudHsmObjectState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

