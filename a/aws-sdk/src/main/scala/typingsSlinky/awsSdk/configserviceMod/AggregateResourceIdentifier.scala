package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateResourceIdentifier extends js.Object {
  /**
    * The ID of the AWS resource.
    */
  var ResourceId: typingsSlinky.awsSdk.configserviceMod.ResourceId = js.native
  /**
    * The name of the AWS resource.
    */
  var ResourceName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceName] = js.native
  /**
    * The type of the AWS resource.
    */
  var ResourceType: typingsSlinky.awsSdk.configserviceMod.ResourceType = js.native
  /**
    * The 12-digit account ID of the source account.
    */
  var SourceAccountId: AccountId = js.native
  /**
    * The source region where data is aggregated.
    */
  var SourceRegion: AwsRegion = js.native
}

object AggregateResourceIdentifier {
  @scala.inline
  def apply(
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    SourceAccountId: AccountId,
    SourceRegion: AwsRegion
  ): AggregateResourceIdentifier = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SourceAccountId = SourceAccountId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateResourceIdentifier]
  }
  @scala.inline
  implicit class AggregateResourceIdentifierOps[Self <: AggregateResourceIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegion")(value.asInstanceOf[js.Any])
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
  }
  
}

