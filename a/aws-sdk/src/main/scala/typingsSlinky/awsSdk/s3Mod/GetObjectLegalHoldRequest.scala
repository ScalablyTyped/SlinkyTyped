package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectLegalHoldRequest extends js.Object {
  
  /**
    * The bucket name containing the object whose Legal Hold status you want to retrieve.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The key name for the object whose Legal Hold status you want to retrieve.
    */
  var Key: ObjectKey = js.native
  
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  
  /**
    * The version ID of the object whose Legal Hold status you want to retrieve.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object GetObjectLegalHoldRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): GetObjectLegalHoldRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectLegalHoldRequest]
  }
  
  @scala.inline
  implicit class GetObjectLegalHoldRequestOps[Self <: GetObjectLegalHoldRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = this.set("ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedBucketOwner: Self = this.set("ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
