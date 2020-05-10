package typingsSlinky.fineUploader.azureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureSignatureOptions extends js.Object {
  /**
    * Additional headers sent along with each signature request.
    *
    * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any | AzureCustomHeaderFunction] = js.native
  /**
    * The endpoint that Fine Uploader can use to send GET for a SAS before sending requests off to Azure.
    *
    * The blob URL and underlying method type associated with the underlying REST request will be included in the query string
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.native
}

object AzureSignatureOptions {
  @scala.inline
  def apply(): AzureSignatureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureSignatureOptions]
  }
  @scala.inline
  implicit class AzureSignatureOptionsOps[Self <: AzureSignatureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeadersFunction1(value: /* id */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomHeaders(value: js.Any | AzureCustomHeaderFunction): Self = {
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
  }
  
}

