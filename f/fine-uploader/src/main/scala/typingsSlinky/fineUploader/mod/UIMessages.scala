package typingsSlinky.fineUploader.mod

import typingsSlinky.fineUploader.coreMod.Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIMessages extends Messages {
  /**
    * Text sent to `showMessage` when `multiple` is `false` and more than one file is dropped at once
    *
    * @default `'You may only drop one file.'`
    */
  var tooManyFilesError: js.UndefOr[String] = js.native
  /**
    * Text displayed to users who have ancient browsers
    *
    * @default `'Unrecoverable error - the browser does not permit uploading of any kind.'`
    */
  var unsupportedBrowser: js.UndefOr[String] = js.native
}

object UIMessages {
  @scala.inline
  def apply(): UIMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIMessages]
  }
  @scala.inline
  implicit class UIMessagesOps[Self <: UIMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooManyFilesError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooManyFilesError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooManyFilesError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooManyFilesError")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsupportedBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupportedBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsupportedBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupportedBrowser")(js.undefined)
        ret
    }
  }
  
}

