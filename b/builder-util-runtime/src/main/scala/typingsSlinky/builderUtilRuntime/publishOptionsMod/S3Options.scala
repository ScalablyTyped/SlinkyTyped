package typingsSlinky.builderUtilRuntime.publishOptionsMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.AES256
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.REDUCED_REDUNDANCY
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.STANDARD_IA
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.awsColonkms
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.s3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Options
  extends BaseS3Options
     with AllPublishOptions {
  /**
    * The bucket name.
    */
  val bucket: String = js.native
  /**
    * Server-side encryption algorithm to use for the object.
    */
  val encryption: js.UndefOr[AES256 | awsColonkms | Null] = js.native
  /**
    * The endpoint URI to send requests to. The default endpoint is built from the configured region.
    * The endpoint should be a string like `https://{service}.{region}.amazonaws.com`.
    */
  val endpoint: js.UndefOr[String | Null] = js.native
  /**
    * The provider. Must be `s3`.
    */
  @JSName("provider")
  val provider_S3Options: s3 = js.native
  /**
    * The region. Is determined and set automatically when publishing.
    */
  var region: js.UndefOr[String | Null] = js.native
  /**
    * The type of storage to use for the object.
    * @default STANDARD
    */
  val storageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | Null] = js.native
}

object S3Options {
  @scala.inline
  def apply(bucket: String, provider: s3): S3Options = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Options]
  }
  @scala.inline
  implicit class S3OptionsOps[Self <: S3Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: s3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryption(value: AES256 | awsColonkms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(null)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(null)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(null)
        ret
    }
    @scala.inline
    def withStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClassNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(null)
        ret
    }
  }
  
}

