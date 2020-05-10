package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  /**
    * In the event of non-200 response from the server sans the 'error' property, this message will be passed to the 'error' event handler
    *
    * @default `'Upload failure reason unknown'`
    */
  var defaultResponseError: js.UndefOr[String] = js.native
  /**
    * The value for the `title` attribute attached to the `<input type="file">` maintained by Fine Uploader for each upload button.
    *
    * This is used as hover text, among other things.
    *
    * @default `'file input'`
    */
  var fileInputTitle: js.UndefOr[String] = js.native
  /**
    * Symbols used to represent file size, in ascending order
    *
    * @default `['kB', 'MB', 'GB', 'TB', 'PB', 'EB']`
    */
  var sizeSymbols: js.UndefOr[js.Array[String]] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultResponseError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResponseError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultResponseError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResponseError")(js.undefined)
        ret
    }
    @scala.inline
    def withFileInputTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInputTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSymbols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSymbols")(js.undefined)
        ret
    }
  }
  
}

