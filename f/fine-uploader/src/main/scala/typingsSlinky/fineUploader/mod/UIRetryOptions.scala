package typingsSlinky.fineUploader.mod

import typingsSlinky.fineUploader.coreMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIRetryOptions extends RetryOptions {
  /**
    * The text of the note that will optionally appear next to the item during automatic retry attempts.
    *
    * Ignored if `showAutoRetryNote` is false.
    *
    * @default `'Retrying {retryNum}/{maxAuto} ...'`
    */
  var autoRetryNote: js.UndefOr[String] = js.native
  /**
    * Enable or disable a status message appearing next to the item during auto retry attempts
    *
    * @default `true`
    */
  var showAutoRetryNote: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable the showing of a button/link next to the failed item after all retry attempts have been exhausted.
    *
    * Clicking the button/link will force the uploader to make another attempt
    *
    * @default `false`
    */
  var showButton: js.UndefOr[Boolean] = js.native
}

object UIRetryOptions {
  @scala.inline
  def apply(): UIRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIRetryOptions]
  }
  @scala.inline
  implicit class UIRetryOptionsOps[Self <: UIRetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRetryNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetryNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRetryNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetryNote")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAutoRetryNote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAutoRetryNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAutoRetryNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAutoRetryNote")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButton")(js.undefined)
        ret
    }
  }
  
}

