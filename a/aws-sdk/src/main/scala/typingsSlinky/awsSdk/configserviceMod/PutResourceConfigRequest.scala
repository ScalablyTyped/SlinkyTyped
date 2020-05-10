package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourceConfigRequest extends js.Object {
  /**
    * The configuration object of the resource in valid JSON format. It must match the schema registered with AWS CloudFormation.  The configuration JSON must not exceed 64 KB. 
    */
  var Configuration: typingsSlinky.awsSdk.configserviceMod.Configuration = js.native
  /**
    * Unique identifier of the resource.
    */
  var ResourceId: typingsSlinky.awsSdk.configserviceMod.ResourceId = js.native
  /**
    * Name of the resource.
    */
  var ResourceName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceName] = js.native
  /**
    * The type of the resource. The custom resource type must be registered with AWS CloudFormation.   You cannot use the organization names “aws”, “amzn”, “amazon”, “alexa”, “custom” with custom resource types. It is the first part of the ResourceType up to the first ::. 
    */
  var ResourceType: ResourceTypeString = js.native
  /**
    * Version of the schema registered for the ResourceType in AWS CloudFormation.
    */
  var SchemaVersionId: typingsSlinky.awsSdk.configserviceMod.SchemaVersionId = js.native
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Tags] = js.native
}

object PutResourceConfigRequest {
  @scala.inline
  def apply(
    Configuration: Configuration,
    ResourceId: ResourceId,
    ResourceType: ResourceTypeString,
    SchemaVersionId: SchemaVersionId
  ): PutResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SchemaVersionId = SchemaVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceConfigRequest]
  }
  @scala.inline
  implicit class PutResourceConfigRequestOps[Self <: PutResourceConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceTypeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaVersionId(value: SchemaVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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

