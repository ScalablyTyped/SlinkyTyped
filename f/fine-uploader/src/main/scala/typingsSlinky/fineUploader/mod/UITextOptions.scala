package typingsSlinky.fineUploader.mod

import typingsSlinky.fineUploader.coreMod.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITextOptions extends TextOptions {
  /**
    * Text that appears next to a failed item
    *
    * @default `'Upload failed'`
    */
  var failUpload: js.UndefOr[String] = js.native
  /**
    * Appears next to a currently uploading item
    *
    * @default `'{percent}% of {total_size}'`
    */
  var formatProgress: js.UndefOr[String] = js.native
  /**
    * Appears next to a paused item
    *
    * @default `'paused'`
    */
  var paused: js.UndefOr[String] = js.native
  /**
    * Appears next to item once the last bytes have been sent (differs on the user-agent)
    *
    * @default `'Processing...'`
    */
  var waitingForResponse: js.UndefOr[String] = js.native
}

object UITextOptions {
  @scala.inline
  def apply(): UITextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UITextOptions]
  }
  @scala.inline
  implicit class UITextOptionsOps[Self <: UITextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailUpload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitingForResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingForResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitingForResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingForResponse")(js.undefined)
        ret
    }
  }
  
}

