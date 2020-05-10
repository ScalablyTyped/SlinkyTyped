package typingsSlinky.fineUploader.azureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureUploadSuccessOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.native
  /**
    * An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The request method (i.e. POST/PUT)
    *
    * @default `POST`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Any additional parameters to attach to upload success file requests.
    *
    * ###Note:
    * Fine Uploader will still send the `bucket`, `key`, `filename`, `UUID`, and `etag` (if available) as well
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.native
}

object AzureUploadSuccessOptions {
  @scala.inline
  def apply(): AzureUploadSuccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureUploadSuccessOptions]
  }
  @scala.inline
  implicit class AzureUploadSuccessOptionsOps[Self <: AzureUploadSuccessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
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
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

