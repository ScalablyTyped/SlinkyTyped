package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssetRequest extends js.Object {
  /**
    * The unique identifier for the Asset.
    */
  var Id: string = js.native
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: string = js.native
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.native
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: string = js.native
  /**
    * The IAM role ARN used to access the source S3 bucket.
    */
  var SourceRoleArn: string = js.native
}

object CreateAssetRequest {
  @scala.inline
  def apply(Id: string, PackagingGroupId: string, SourceArn: string, SourceRoleArn: string): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceRoleArn = SourceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
  @scala.inline
  implicit class CreateAssetRequestOps[Self <: CreateAssetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackagingGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRoleArn")(value.asInstanceOf[js.Any])
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
  }
  
}

