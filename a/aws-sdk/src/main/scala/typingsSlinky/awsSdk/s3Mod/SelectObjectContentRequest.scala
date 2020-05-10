package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectObjectContentRequest extends js.Object {
  /**
    * The S3 bucket.
    */
  var Bucket: BucketName = js.native
  /**
    * The expression that is used to query the object.
    */
  var Expression: typingsSlinky.awsSdk.s3Mod.Expression = js.native
  /**
    * The type of the provided expression (for example, SQL).
    */
  var ExpressionType: typingsSlinky.awsSdk.s3Mod.ExpressionType = js.native
  /**
    * Describes the format of the data in the object that is being queried.
    */
  var InputSerialization: typingsSlinky.awsSdk.s3Mod.InputSerialization = js.native
  /**
    * The object key.
    */
  var Key: ObjectKey = js.native
  /**
    * Describes the format of the data that you want Amazon S3 to return in response.
    */
  var OutputSerialization: typingsSlinky.awsSdk.s3Mod.OutputSerialization = js.native
  /**
    * Specifies if periodic request progress information should be enabled.
    */
  var RequestProgress: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestProgress] = js.native
  /**
    * The SSE Algorithm used to encrypt the object. For more information, see Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerAlgorithm: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * The SSE Customer Key. For more information, see Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerKey: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKey] = js.native
  /**
    * The SSE Customer Key MD5. For more information, see Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerKeyMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * Specifies the byte range of the object to get the records from. A record is processed when its first byte is contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616, Section 14.35.1 about how to specify the start and end of the range.  ScanRangemay be used in the following ways:    &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt; - process only the records starting between the bytes 50 and 100 (inclusive, counting from zero)    &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt; - process only the records starting after the byte 50    &lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt; - process only the records within the last 50 bytes of the file.  
    */
  var ScanRange: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ScanRange] = js.native
}

object SelectObjectContentRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    Key: ObjectKey,
    OutputSerialization: OutputSerialization
  ): SelectObjectContentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentRequest]
  }
  @scala.inline
  implicit class SelectObjectContentRequestOps[Self <: SelectObjectContentRequest] (val x: Self) extends AnyVal {
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
    def withExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionType(value: ExpressionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSerialization(value: InputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: ObjectKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSerialization(value: OutputSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSerialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestProgress(value: RequestProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSSECustomerKey(value: SSECustomerKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKeyMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSECustomerKeyMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSECustomerKeyMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withScanRange(value: ScanRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanRange")(js.undefined)
        ret
    }
  }
  
}

