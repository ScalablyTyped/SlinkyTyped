package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListObjectsV2Request extends StObject {
  
  /**
    * Bucket name to list.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  
  /**
    * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  
  /**
    * A delimiter is a character you use to group keys.
    */
  var Delimiter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Delimiter] = js.native
  
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response.
    */
  var EncodingType: js.UndefOr[typingsSlinky.awsSdk.s3Mod.EncodingType] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The owner field is not present in listV2 by default, if you want to return owner field with each key in the result then set the fetch owner field to true.
    */
  var FetchOwner: js.UndefOr[typingsSlinky.awsSdk.s3Mod.FetchOwner] = js.native
  
  /**
    * Sets the maximum number of keys returned in the response. By default the API returns up to 1,000 key names. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MaxKeys] = js.native
  
  /**
    * Limits the response to keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
  
  /**
    * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style. Bucket owners need not specify this parameter in their requests.
    */
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  
  /**
    * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket.
    */
  var StartAfter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.StartAfter] = js.native
}
object ListObjectsV2Request {
  
  @scala.inline
  def apply(Bucket: BucketName): ListObjectsV2Request = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsV2Request]
  }
  
  @scala.inline
  implicit class ListObjectsV2RequestMutableBuilder[Self <: ListObjectsV2Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    @scala.inline
    def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    @scala.inline
    def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setFetchOwner(value: FetchOwner): Self = StObject.set(x, "FetchOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchOwnerUndefined: Self = StObject.set(x, "FetchOwner", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: MaxKeys): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    @scala.inline
    def setStartAfter(value: StartAfter): Self = StObject.set(x, "StartAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAfterUndefined: Self = StObject.set(x, "StartAfter", js.undefined)
  }
}
