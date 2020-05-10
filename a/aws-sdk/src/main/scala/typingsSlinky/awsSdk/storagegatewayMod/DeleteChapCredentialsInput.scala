package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChapCredentialsInput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName = js.native
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: typingsSlinky.awsSdk.storagegatewayMod.TargetARN = js.native
}

object DeleteChapCredentialsInput {
  @scala.inline
  def apply(InitiatorName: IqnName, TargetARN: TargetARN): DeleteChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName.asInstanceOf[js.Any], TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChapCredentialsInput]
  }
  @scala.inline
  implicit class DeleteChapCredentialsInputOps[Self <: DeleteChapCredentialsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitiatorName(value: IqnName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitiatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetARN(value: TargetARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

