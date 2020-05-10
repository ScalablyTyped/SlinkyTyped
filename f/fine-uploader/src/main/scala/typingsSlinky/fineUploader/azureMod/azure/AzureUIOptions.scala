package typingsSlinky.fineUploader.azureMod.azure

import typingsSlinky.fineUploader.mod.UIOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fineUploader.coreMod.CoreOptions because Already inherited
- typingsSlinky.fineUploader.azureMod.azure.AzureCoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined blobProperties, signature, uploadSuccess */ @js.native
trait AzureUIOptions extends UIOptions {
  /**
    * blobProperties
    */
  var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.native
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_AzureUIOptions: js.UndefOr[AzureChunkingOptions] = js.native
  /**
    * cors options
    */
  @JSName("cors")
  var cors_AzureUIOptions: js.UndefOr[AzureCorsOptions] = js.native
  /**
    * failedUploadText options
    */
  @JSName("failedUploadTextDisplay")
  var failedUploadTextDisplay_AzureUIOptions: js.UndefOr[AzureFailedUploadTextDisplayOptions] = js.native
  /**
    * RequestOptions
    */
  @JSName("request")
  var request_AzureUIOptions: js.UndefOr[AzureRequestOptions] = js.native
  /**
    * AzureSignatureOptions
    */
  var signature: js.UndefOr[AzureSignatureOptions] = js.native
  /**
    * AzureUploadSuccessOptions
    */
  var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.native
}

object AzureUIOptions {
  @scala.inline
  def apply(): AzureUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureUIOptions]
  }
  @scala.inline
  implicit class AzureUIOptionsOps[Self <: AzureUIOptions] (val x: Self) extends AnyVal {
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
    def withFailedUploadTextDisplay(value: AzureFailedUploadTextDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedUploadTextDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedUploadTextDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedUploadTextDisplay")(js.undefined)
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

