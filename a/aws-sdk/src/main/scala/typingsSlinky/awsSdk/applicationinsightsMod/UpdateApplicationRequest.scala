package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    *  When set to true, creates opsItems for any problems detected on an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.OpsCenterEnabled] = js.native
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
    */
  var OpsItemSNSTopicArn: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.OpsItemSNSTopicArn] = js.native
  /**
    *  Disassociates the SNS topic from the opsItem created for detected problems.
    */
  var RemoveSNSTopic: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.RemoveSNSTopic] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(ResourceGroupName: ResourceGroupName): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  @scala.inline
  implicit class UpdateApplicationRequestOps[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpsCenterEnabled(value: OpsCenterEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsCenterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpsCenterEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsCenterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemSNSTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpsItemSNSTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemSNSTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSNSTopic(value: RemoveSNSTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSNSTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveSNSTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSNSTopic")(js.undefined)
        ret
    }
  }
  
}

