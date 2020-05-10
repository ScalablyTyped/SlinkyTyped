package typingsSlinky.fineUploader.azureMod.azure

import typingsSlinky.fineUploader.coreMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureRequestOptions extends RequestOptions {
  /**
    * URL for your Azure Blob Storage container
    *
    * @default `null`
    */
  var containerUrl: js.UndefOr[String] = js.native
}

object AzureRequestOptions {
  @scala.inline
  def apply(): AzureRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureRequestOptions]
  }
  @scala.inline
  implicit class AzureRequestOptionsOps[Self <: AzureRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerUrl")(js.undefined)
        ret
    }
  }
  
}

