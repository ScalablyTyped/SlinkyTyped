package typingsSlinky.fineUploader.s3Mod.s3

import typingsSlinky.fineUploader.coreMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3CoreOptions extends CoreOptions {
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_S3CoreOptions: js.UndefOr[S3ChunkingOptions] = js.native
  /**
    * cors options
    */
  @JSName("cors")
  var cors_S3CoreOptions: js.UndefOr[S3CorsOptions] = js.native
  /**
    * credentials
    */
  var credentials: js.UndefOr[S3CredentialsOptions] = js.native
  /**
    * iframeSupport options
    */
  var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.native
  /**
    * objectProperties
    */
  var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.native
  /**
    * request options
    */
  @JSName("request")
  var request_S3CoreOptions: js.UndefOr[S3RequestOptions] = js.native
  /**
    * signature options
    */
  var signature: js.UndefOr[S3SignatureOptions] = js.native
  /**
    * upload success options
    */
  var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.native
}

object S3CoreOptions {
  @scala.inline
  def apply(): S3CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3CoreOptions]
  }
  @scala.inline
  implicit class S3CoreOptionsOps[Self <: S3CoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunking(value: S3ChunkingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunking")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: S3CorsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: S3CredentialsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeSupport(value: S3iFrameSupportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectProperties(value: S3ObjectPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: S3RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: S3SignatureOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSuccess(value: S3UploadSuccessOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSuccess")(js.undefined)
        ret
    }
  }
  
}

