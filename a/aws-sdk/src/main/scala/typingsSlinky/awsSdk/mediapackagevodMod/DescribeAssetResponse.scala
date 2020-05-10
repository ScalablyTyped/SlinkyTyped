package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetResponse extends js.Object {
  /**
    * The ARN of the Asset.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time the Asset was initially submitted for Ingest.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The list of egress endpoints available for the Asset.
    */
  var EgressEndpoints: js.UndefOr[listOfEgressEndpoint] = js.native
  /**
    * The unique identifier for the Asset.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.native
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: js.UndefOr[string] = js.native
  /**
    * The IAM role_arn used to access the source S3 bucket.
    */
  var SourceRoleArn: js.UndefOr[string] = js.native
}

object DescribeAssetResponse {
  @scala.inline
  def apply(): DescribeAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssetResponse]
  }
  @scala.inline
  implicit class DescribeAssetResponseOps[Self <: DescribeAssetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressEndpoints(value: listOfEgressEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withPackagingGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackagingGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRoleArn")(js.undefined)
        ret
    }
  }
  
}

