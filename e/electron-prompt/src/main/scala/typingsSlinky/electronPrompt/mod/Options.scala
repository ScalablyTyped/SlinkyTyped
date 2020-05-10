package typingsSlinky.electronPrompt.mod

import typingsSlinky.electronPrompt.electronPromptStrings.ApostropheinputApostrophe
import typingsSlinky.electronPrompt.electronPromptStrings.select
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The local path of a CSS file to stylize the prompt window.
    * Defaults to `null`.
    */
  var customStylesheet: js.UndefOr[String | Null] = js.native
  /** The height of the prompt window. Defaults to `130`. */
  var height: js.UndefOr[Double] = js.native
  /**
    * The path to an icon image to use in the title bar. Defaults to `null`
    * and uses electron's icon.
    */
  var icon: js.UndefOr[String | Null] = js.native
  /**
    * The attributes of the input field, analagous to the HTML attributes:
    * `{type: 'text', required: true}` -> `<input type="text" required>`.
    * Used if the type is `'input'`.
    */
  var inputAttrs: js.UndefOr[Record[String, _]] = js.native
  /**
    * The label which appears on the prompt for the input field. Defaults
    * to `'Please input a value:'`.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Whether the prompt window can be resized or not. Defaults to
    * `false`.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * The items for the select dropdown if using the `'select'` type in the
    * format `'value'`: `'display text'`, where the value is what will be
    * given to the then block and the display text is what the user will
    * see.
    */
  var selectOptions: js.UndefOr[js.Object] = js.native
  /** The title of the prompt window. Defaults to `'Prompt'`. */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of input field, either `'input'` for a standard text input
    * field or 'select' for a dropdown type input. Defaults to `'input'`.
    */
  var `type`: js.UndefOr[ApostropheinputApostrophe | select] = js.native
  /**
    * Whether the label should be interpreted as HTML or not. Defaults to
    * `false`.
    */
  var useHtmlLabel: js.UndefOr[Boolean] = js.native
  /** The default value for the input field. Defaults to `null`. */
  var value: js.UndefOr[String | Null] = js.native
  /** The width of the prompt window. Defaults to `370`. */
  var width: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomStylesheet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStylesheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStylesheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStylesheet")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStylesheetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStylesheet")(null)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withInputAttrs(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ApostropheinputApostrophe | select): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHtmlLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtmlLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHtmlLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtmlLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

