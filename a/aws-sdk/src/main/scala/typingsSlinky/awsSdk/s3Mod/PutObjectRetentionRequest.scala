package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectRetentionRequest extends js.Object {
  /**
    * The bucket name that contains the object you want to apply this Object Retention configuration to.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Indicates whether this operation should bypass Governance-mode restrictions.
    */
  var BypassGovernanceRetention: js.UndefOr[typingsSlinky.awsSdk.s3Mod.BypassGovernanceRetention] = js.native
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The key name for the object that you want to apply this Object Retention configuration to.
    */
  var Key: ObjectKey = js.native
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * The container element for the Object Retention configuration.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.native
  /**
    * The version ID for the object that you want to apply this Object Retention configuration to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectRetentionRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): PutObjectRetentionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectRetentionRequest]
  }
  @scala.inline
  implicit class PutObjectRetentionRequestOps[Self <: PutObjectRetentionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: ObjectKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBypassGovernanceRetention(value: BypassGovernanceRetention): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BypassGovernanceRetention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassGovernanceRetention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BypassGovernanceRetention")(js.undefined)
        ret
    }
    @scala.inline
    def withContentMD5(value: ContentMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayer(value: RequestPayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(js.undefined)
        ret
    }
    @scala.inline
    def withRetention(value: ObjectLockRetention): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retention")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: ObjectVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

