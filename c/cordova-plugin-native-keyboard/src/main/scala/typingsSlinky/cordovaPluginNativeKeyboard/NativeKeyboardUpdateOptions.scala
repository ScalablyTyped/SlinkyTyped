package typingsSlinky.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeKeyboardUpdateOptions extends js.Object {
  /**
    * Position the cursor anywhere in the text range. Defaults to the end of the text.
    */
  var caretIndex: js.UndefOr[Double] = js.native
  /**
    * If false or omitted no changes to the keyboard state are made.
    */
  var showKeyboard: js.UndefOr[Boolean] = js.native
  /**
    * Replace the messenger's text by this. The current text remains if omitted.
    */
  var text: js.UndefOr[String] = js.native
}

object NativeKeyboardUpdateOptions {
  @scala.inline
  def apply(): NativeKeyboardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeKeyboardUpdateOptions]
  }
  @scala.inline
  implicit class NativeKeyboardUpdateOptionsOps[Self <: NativeKeyboardUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaretIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShowKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

