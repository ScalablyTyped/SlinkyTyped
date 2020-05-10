package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChapCredentialsOutput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target. This is the same initiator name specified in the request.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target. This is the same target specified in the request.
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
}

object UpdateChapCredentialsOutput {
  @scala.inline
  def apply(): UpdateChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChapCredentialsOutput]
  }
  @scala.inline
  implicit class UpdateChapCredentialsOutputOps[Self <: UpdateChapCredentialsOutput] (val x: Self) extends AnyVal {
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
    def withoutInitiatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitiatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetARN(value: TargetARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(js.undefined)
        ret
    }
  }
  
}

