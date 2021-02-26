package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartsOutput extends StObject {
  
  /**
    * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the prefix in the lifecycle rule matches the object name in the request, then the response includes this header indicating when the initiated multipart upload will become eligible for abort operation. For more information, see Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy. The response will also include the x-amz-abort-rule-id header that will provide the ID of the lifecycle configuration rule that defines this action.
    */
  var AbortDate: js.UndefOr[js.Date] = js.native
  
  /**
    * This header is returned along with the x-amz-abort-date header. It identifies applicable lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
    */
  var AbortRuleId: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AbortRuleId] = js.native
  
  /**
    * The name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  
  /**
    * Container element that identifies who initiated the multipart upload. If the initiator is an AWS account, this element provides the same information as the Owner element. If the initiator is an IAM User, this element provides the user ARN and display name.
    */
  var Initiator: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Initiator] = js.native
  
  /**
    *  Indicates whether the returned list of parts is truncated. A true value indicates that the list was truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts element.
    */
  var IsTruncated: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IsTruncated] = js.native
  
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  
  /**
    * Maximum number of parts that were allowed in the response.
    */
  var MaxParts: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MaxParts] = js.native
  
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var NextPartNumberMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.NextPartNumberMarker] = js.native
  
  /**
    *  Container element that identifies the object owner, after the object is created. If multipart upload is initiated by an IAM user, this element provides the parent account ID and display name.
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Owner] = js.native
  
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var PartNumberMarker: js.UndefOr[typingsSlinky.awsSdk.s3Mod.PartNumberMarker] = js.native
  
  /**
    *  Container for elements related to a particular part. A response can contain zero or more Part elements.
    */
  var Parts: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Parts] = js.native
  
  var RequestCharged: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestCharged] = js.native
  
  /**
    * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.s3Mod.StorageClass] = js.native
  
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.native
}
object ListPartsOutput {
  
  @scala.inline
  def apply(): ListPartsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartsOutput]
  }
  
  @scala.inline
  implicit class ListPartsOutputMutableBuilder[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortDate(value: js.Date): Self = StObject.set(x, "AbortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortDateUndefined: Self = StObject.set(x, "AbortDate", js.undefined)
    
    @scala.inline
    def setAbortRuleId(value: AbortRuleId): Self = StObject.set(x, "AbortRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortRuleIdUndefined: Self = StObject.set(x, "AbortRuleId", js.undefined)
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setInitiator(value: Initiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
    
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setMaxParts(value: MaxParts): Self = StObject.set(x, "MaxParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPartsUndefined: Self = StObject.set(x, "MaxParts", js.undefined)
    
    @scala.inline
    def setNextPartNumberMarker(value: NextPartNumberMarker): Self = StObject.set(x, "NextPartNumberMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPartNumberMarkerUndefined: Self = StObject.set(x, "NextPartNumberMarker", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setPartNumberMarker(value: PartNumberMarker): Self = StObject.set(x, "PartNumberMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumberMarkerUndefined: Self = StObject.set(x, "PartNumberMarker", js.undefined)
    
    @scala.inline
    def setParts(value: Parts): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: Part*): Self = StObject.set(x, "Parts", js.Array(value :_*))
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
  }
}
