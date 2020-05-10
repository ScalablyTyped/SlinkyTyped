package typingsSlinky.fineUploader.mod

import typingsSlinky.fineUploader.coreMod.PasteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIPasteOptions extends PasteOptions {
  /**
    * Text that will appear in the `showPrompt` dialog.
    *
    * @default `Please name this image`
    */
  var namePromptMessage: js.UndefOr[String] = js.native
  /**
    * Enable or disable the usage of `showPrompt` by Fine Uploader to prompt the user for a filename for a pasted file
    *
    * @default `false`
    */
  var promptForName: js.UndefOr[Boolean] = js.native
}

object UIPasteOptions {
  @scala.inline
  def apply(): UIPasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIPasteOptions]
  }
  @scala.inline
  implicit class UIPasteOptionsOps[Self <: UIPasteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamePromptMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePromptMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePromptMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePromptMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptForName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptForName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptForName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptForName")(js.undefined)
        ret
    }
  }
  
}

