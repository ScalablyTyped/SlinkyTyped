package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTargetRequest extends js.Object {
  /**
    * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
    */
  var ForceUnsubscribeAll: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ForceUnsubscribeAll] = js.native
  /**
    * The Amazon Resource Name (ARN) of the SNS topic to delete.
    */
  var TargetAddress: typingsSlinky.awsSdk.codestarnotificationsMod.TargetAddress = js.native
}

object DeleteTargetRequest {
  @scala.inline
  def apply(TargetAddress: TargetAddress): DeleteTargetRequest = {
    val __obj = js.Dynamic.literal(TargetAddress = TargetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTargetRequest]
  }
  @scala.inline
  implicit class DeleteTargetRequestOps[Self <: DeleteTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetAddress(value: TargetAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceUnsubscribeAll(value: ForceUnsubscribeAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceUnsubscribeAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceUnsubscribeAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceUnsubscribeAll")(js.undefined)
        ret
    }
  }
  
}

