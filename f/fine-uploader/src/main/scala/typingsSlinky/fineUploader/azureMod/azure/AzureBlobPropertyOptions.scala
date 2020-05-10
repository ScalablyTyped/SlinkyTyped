package typingsSlinky.fineUploader.azureMod.azure

import typingsSlinky.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureBlobPropertyOptions extends js.Object {
  /**
    * Describes the blob name used to identify the file in your Azure Blob Storage container.
    *
    * Possible values are
    * * `'uuid'`
    * * `'filename'`
    * * `function`
    *
    * If the value is a function, Fine Uploader Azure will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return one of a `qq.Promise` or a `String`
    *
    * @default `'uuid'`
    */
  var name: js.UndefOr[String | AzureBlobPropertyNameFunction] = js.native
}

object AzureBlobPropertyOptions {
  @scala.inline
  def apply(): AzureBlobPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureBlobPropertyOptions]
  }
  @scala.inline
  implicit class AzureBlobPropertyOptionsOps[Self <: AzureBlobPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameFunction1(value: /* id */ Double => PromiseOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String | AzureBlobPropertyNameFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

