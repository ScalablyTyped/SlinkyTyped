package typingsSlinky.fineUploader.azureMod.azure

import typingsSlinky.fineUploader.coreMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureCoreOptions extends CoreOptions {
  /**
    * blobProperties
    */
  var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.native
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_AzureCoreOptions: js.UndefOr[AzureChunkingOptions] = js.native
  /**
    * cors options
    */
  @JSName("cors")
  var cors_AzureCoreOptions: js.UndefOr[AzureCorsOptions] = js.native
  /**
    * RequestOptions
    */
  @JSName("request")
  var request_AzureCoreOptions: js.UndefOr[AzureRequestOptions] = js.native
  /**
    * AzureSignatureOptions
    */
  var signature: js.UndefOr[AzureSignatureOptions] = js.native
  /**
    * AzureUploadSuccessOptions
    */
  var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.native
}

object AzureCoreOptions {
  @scala.inline
  def apply(): AzureCoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureCoreOptions]
  }
  @scala.inline
  implicit class AzureCoreOptionsOps[Self <: AzureCoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlobProperties(value: AzureBlobPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withChunking(value: AzureChunkingOptions): Self = {
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
    def withCors(value: AzureCorsOptions): Self = {
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
    def withRequest(value: AzureRequestOptions): Self = {
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
    def withSignature(value: AzureSignatureOptions): Self = {
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
    def withUploadSuccess(value: AzureUploadSuccessOptions): Self = {
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

