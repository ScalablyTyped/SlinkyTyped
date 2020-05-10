package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInfo extends js.Object {
  /**
    * The lifecycle of the application. 
    */
  var LifeCycle: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.LifeCycle] = js.native
  /**
    *  Indicates whether Application Insights will create opsItems for any problem detected by Application Insights for an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.OpsCenterEnabled] = js.native
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItems to receive SNS notifications for opsItem updates. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.OpsItemSNSTopicArn] = js.native
  /**
    * The issues on the user side that block Application Insights from successfully monitoring an application. Example remarks include:   “Configuring application, detected 1 Errors, 3 Warnings”   “Configuring application, detected 1 Unconfigured Components”  
    */
  var Remarks: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Remarks] = js.native
  /**
    * The name of the resource group used for the application.
    */
  var ResourceGroupName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object ApplicationInfo {
  @scala.inline
  def apply(): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInfo]
  }
  @scala.inline
  implicit class ApplicationInfoOps[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifeCycle(value: LifeCycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifeCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycle")(js.undefined)
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
    def withRemarks(value: Remarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remarks")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(js.undefined)
        ret
    }
  }
  
}

