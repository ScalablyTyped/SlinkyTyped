package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectsV2Output extends js.Object {
  /**
    * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns. A response can contain CommonPrefixes only if you specify a delimiter.  CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by a delimiter.  CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix. For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when calculating the number of returns. 
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.native
  /**
    * Metadata about each object returned.
    */
  var Contents: js.UndefOr[ObjectList] = js.native
  /**
    *  If ContinuationToken was sent with the request, it is included in the response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the CommonPrefixes collection. These rolled-up keys are not returned elsewhere in the response. Each rolled-up result counts as only one return against the MaxKeys value.
    */
  var Delimiter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Delimiter] = js.native
  /**
    * Encoding type used by Amazon S3 to encode object key names in the XML response. If you specify the encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  Delimiter, Prefix, Key, and StartAfter.
    */
  var EncodingType: js.UndefOr[typingsSlinky.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * Set to false if all of the results were returned. Set to true if more keys are available to return. If the number of results exceeds that specified by MaxKeys, all of the results might not be returned.
    */
  var IsTruncated: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys 
    */
  var KeyCount: js.UndefOr[typingsSlinky.awsSdk.s3Mod.KeyCount] = js.native
  /**
    * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MaxKeys] = js.native
  /**
    * Bucket name.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Name: js.UndefOr[BucketName] = js.native
  /**
    *  NextContinuationToken is sent when isTruncated is true, which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
  /**
    *  Keys that begin with the indicated prefix.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
  /**
    * If StartAfter was sent with the request, it is included in the response.
    */
  var StartAfter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.StartAfter] = js.native
}

object ListObjectsV2Output {
  @scala.inline
  def apply(): ListObjectsV2Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectsV2Output]
  }
  @scala.inline
  implicit class ListObjectsV2OutputOps[Self <: ListObjectsV2Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonPrefixes(value: CommonPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withContents(value: ObjectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contents")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuationToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: Delimiter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingType(value: EncodingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTruncated(value: IsTruncated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyCount(value: KeyCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeys(value: MaxKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNextContinuationToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextContinuationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextContinuationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextContinuationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAfter(value: StartAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartAfter")(js.undefined)
        ret
    }
  }
  
}

