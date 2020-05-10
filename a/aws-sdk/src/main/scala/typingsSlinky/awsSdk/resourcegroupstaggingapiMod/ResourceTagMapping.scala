package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTagMapping extends js.Object {
  /**
    * Information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
    */
  var ComplianceDetails: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ComplianceDetails] = js.native
  /**
    * The ARN of the resource.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ResourceARN] = js.native
  /**
    * The tags that have been applied to one or more AWS resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ResourceTagMapping {
  @scala.inline
  def apply(): ResourceTagMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagMapping]
  }
  @scala.inline
  implicit class ResourceTagMappingOps[Self <: ResourceTagMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceDetails(value: ComplianceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

