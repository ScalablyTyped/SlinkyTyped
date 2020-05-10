package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifierSummary extends js.Object {
  /**
    * The logical IDs of the target resources of the specified ResourceType, as defined in the import template.
    */
  var LogicalResourceIds: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.LogicalResourceIds] = js.native
  /**
    * The resource properties you can provide during the import to identify your target resources. For example, BucketName is a possible identifier property for AWS::S3::Bucket resources.
    */
  var ResourceIdentifiers: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceIdentifiers] = js.native
  /**
    * The template resource type of the target resources, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceType] = js.native
}

object ResourceIdentifierSummary {
  @scala.inline
  def apply(): ResourceIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifierSummary]
  }
  @scala.inline
  implicit class ResourceIdentifierSummaryOps[Self <: ResourceIdentifierSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogicalResourceIds(value: LogicalResourceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalResourceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdentifiers(value: ResourceIdentifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

