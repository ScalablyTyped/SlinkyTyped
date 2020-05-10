package typingsSlinky.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDisplayOptions extends js.Object {
  /**
    * Enable or disable the display of the file size next to the file after it has been submitted
    *
    * @default `false`
    */
  var fileSizeOnSubmit: js.UndefOr[Boolean] = js.native
  /**
    * When `true` batches of files are added to the top of the UI's file list. The default is to append file(s) to the bottom of the list
    *
    * @default `false`
    */
  var prependFiles: js.UndefOr[Boolean] = js.native
}

object UIDisplayOptions {
  @scala.inline
  def apply(): UIDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDisplayOptions]
  }
  @scala.inline
  implicit class UIDisplayOptionsOps[Self <: UIDisplayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSizeOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizeOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSizeOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizeOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withPrependFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrependFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependFiles")(js.undefined)
        ret
    }
  }
  
}

