package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectTaggingRequest extends js.Object {
  /**
    * The bucket name containing the object.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * Name of the tag.
    */
  var Key: ObjectKey = js.native
  /**
    * Container for the TagSet and Tag elements
    */
  var Tagging: typingsSlinky.awsSdk.s3Mod.Tagging = js.native
  /**
    * The versionId of the object that the tag-set will be added to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, Tagging: Tagging): PutObjectTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectTaggingRequest]
  }
  @scala.inline
  implicit class PutObjectTaggingRequestOps[Self <: PutObjectTaggingRequest] (val x: Self) extends AnyVal {
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
    def withTagging(value: Tagging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(value.asInstanceOf[js.Any])
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

