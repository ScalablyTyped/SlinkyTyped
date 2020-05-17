package typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentInputMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import typingsSlinky.awsSdkClientS3Node.typesRequestProgressMod.RequestProgress
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectObjectContentInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Whether to use the bucket name as the endpoint for this request. The bucket
    * name must be a domain name with a CNAME record alias to an appropriate virtual
    * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
    * record of:
    *
    * ```
    * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
    * ```
    *
    * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
    */
  @JSName("$bucketEndpoint")
  var $bucketEndpoint: js.UndefOr[String] = js.native
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the `SSECustomerAlgorithm` parameter
    */
  @JSName("$serverSideEncryptionKey")
  var $serverSideEncryptionKey: js.UndefOr[SourceData] = js.native
  /**
    * Whether to use the S3 Transfer Acceleration endpoint by default
    */
  @JSName("$useAccelerateEndpoint")
  var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  @JSName("$useDualstackEndpoint")
  var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * <p>The S3 Bucket.</p>
    */
  var Bucket: String = js.native
  /**
    * <p>The expression that is used to query the object.</p>
    */
  var Expression: String = js.native
  /**
    * <p>The type of the provided expression (e.g., SQL).</p>
    */
  var ExpressionType: SQL | String = js.native
  /**
    * <p>Describes the format of the data in the object that is being queried.</p>
    */
  var InputSerialization: typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization = js.native
  /**
    * <p>The Object Key.</p>
    */
  var Key: String = js.native
  /**
    * <p>Describes the format of the data that you want Amazon S3 to return in response.</p>
    */
  var OutputSerialization: typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization = js.native
  /**
    * <p>Specifies if periodic request progress information should be enabled.</p>
    */
  var RequestProgress: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesRequestProgressMod.RequestProgress] = js.native
  /**
    * <p>The SSE Algorithm used to encrypt the object. For more information, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"> Server-Side Encryption (Using Customer-Provided Encryption Keys</a>. </p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.native
}

object SelectObjectContentInput {
  @scala.inline
  def apply(
    Bucket: String,
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: InputSerialization,
    Key: String,
    OutputSerialization: OutputSerialization
  ): SelectObjectContentInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentInput]
  }
  @scala.inline
  implicit class SelectObjectContentInputOps[Self <: SelectObjectContentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionType(value: SQL | String): Self = {
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
    def withKey(value: String): Self = {
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
    def with$abortSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$abortSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$abortSignal")(js.undefined)
        ret
    }
    @scala.inline
    def with$bucketEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bucketEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bucketEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$forcePathStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$forcePathStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$forcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def with$httpOptions(value: NodeHttpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$httpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def with$serverSideEncryptionKeyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$serverSideEncryptionKeyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$serverSideEncryptionKey(value: SourceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$serverSideEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$serverSideEncryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def with$useAccelerateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useAccelerateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useAccelerateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$useDualstackEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$useDualstackEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$useDualstackEndpoint")(js.undefined)
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
    def withSSECustomerAlgorithm(value: String): Self = {
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
  }
  
}

