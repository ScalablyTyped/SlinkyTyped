package typingsSlinky.awsSdkClientS3Node.typesCreateBucketInputMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`authenticated-read`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`private`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read-write`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read`
import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesCreateBucketConfigurationMod.CreateBucketConfiguration
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
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
    * <p>The canned ACL to apply to the bucket.</p>
    */
  var ACL: js.UndefOr[`private` | `public-read` | `public-read-write` | `authenticated-read` | String] = js.native
  /**
    * _BucketName shape
    */
  var Bucket: String = js.native
  /**
    * _CreateBucketConfiguration shape
    */
  var CreateBucketConfiguration: js.UndefOr[
    typingsSlinky.awsSdkClientS3Node.typesCreateBucketConfigurationMod.CreateBucketConfiguration
  ] = js.native
  /**
    * <p>Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p>
    */
  var GrantFullControl: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to list the objects in the bucket.</p>
    */
  var GrantRead: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to read the bucket ACL.</p>
    */
  var GrantReadACP: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to create, overwrite, and delete any object in the bucket.</p>
    */
  var GrantWrite: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to write the ACL for the applicable bucket.</p>
    */
  var GrantWriteACP: js.UndefOr[String] = js.native
}

object CreateBucketInput {
  @scala.inline
  def apply(Bucket: String): CreateBucketInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketInput]
  }
  @scala.inline
  implicit class CreateBucketInputOps[Self <: CreateBucketInput] (val x: Self) extends AnyVal {
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
    def withACL(value: `private` | `public-read` | `public-read-write` | `authenticated-read` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutACL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACL")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateBucketConfiguration(value: CreateBucketConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateBucketConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateBucketConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateBucketConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantFullControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantFullControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantFullControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantFullControl")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantRead")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantReadACP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantReadACP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantReadACP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantReadACP")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantWrite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantWriteACP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWriteACP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantWriteACP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantWriteACP")(js.undefined)
        ret
    }
  }
  
}

