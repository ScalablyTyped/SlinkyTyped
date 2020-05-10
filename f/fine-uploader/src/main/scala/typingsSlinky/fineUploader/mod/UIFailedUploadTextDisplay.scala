package typingsSlinky.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIFailedUploadTextDisplay extends js.Object {
  /**
    * Enable or disable a tooltip that will display the full contents of the error message when the mouse pointer hovers over the failed item.
    *
    * @default `true`
    */
  var enableTooltip: js.UndefOr[Boolean] = js.native
  /**
    * Set the message to display next to each failed file.
    *
    * One of: 'default' which displays the failedUploadText, 'custom' which displays the error response from the server, or 'none' which displays no text
    *
    * @default `'default'`
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The property from the server response that contains the error text to display next to a failed item. Ignored unless `mode` is `'custom'`
    *
    * @default `'error'`
    */
  var responseProperty: js.UndefOr[String] = js.native
}

object UIFailedUploadTextDisplay {
  @scala.inline
  def apply(): UIFailedUploadTextDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIFailedUploadTextDisplay]
  }
  @scala.inline
  implicit class UIFailedUploadTextDisplayOps[Self <: UIFailedUploadTextDisplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseProperty")(js.undefined)
        ret
    }
  }
  
}

