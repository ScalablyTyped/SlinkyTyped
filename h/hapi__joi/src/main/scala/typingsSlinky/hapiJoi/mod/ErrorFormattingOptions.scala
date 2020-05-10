package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.hapiJoiBooleans.`false`
import typingsSlinky.hapiJoi.hapiJoiStrings.key
import typingsSlinky.hapiJoi.hapiJoiStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorFormattingOptions extends js.Object {
  /**
    * when true, error message templates will escape special characters to HTML entities, for security purposes.
    *
    * @default false
    */
  var escapeHtml: js.UndefOr[Boolean] = js.native
  /**
    * defines the value used to set the label context variable.
    */
  var label: js.UndefOr[path | key | `false`] = js.native
  /**
    * The preferred language code for error messages.
    * The value is matched against keys at the root of the messages object, and then the error code as a child key of that.
    * Can be a reference to the value, global context, or local context which is the root value passed to the validation function.
    *
    * Note that references to the value are usually not what you want as they move around the value structure relative to where the error happens.
    * Instead, either use the global context, or the absolute value (e.g. `Joi.ref('/variable')`)
    */
  var language: js.UndefOr[/* keyof @hapi/joi.@hapi/joi.LanguageMessages */ String] = js.native
  /**
    * when false, skips rendering error templates. Useful when error messages are generated elsewhere to save processing time.
    *
    * @default true
    */
  var render: js.UndefOr[Boolean] = js.native
  /**
    * when true, the main error will possess a stack trace, otherwise it will be disabled.
    * Defaults to false for performances reasons. Has no effect on platforms other than V8/node.js as it uses the Stack trace API.
    *
    * @default false
    */
  var stack: js.UndefOr[Boolean] = js.native
  /**
    * if true, array values in error messages are wrapped in [].
    *
    * @default true
    */
  var wrapArrays: js.UndefOr[Boolean] = js.native
}

object ErrorFormattingOptions {
  @scala.inline
  def apply(): ErrorFormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorFormattingOptions]
  }
  @scala.inline
  implicit class ErrorFormattingOptionsOps[Self <: ErrorFormattingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapeHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: path | key | `false`): Self = {
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
    def withLanguage(value: /* keyof @hapi/joi.@hapi/joi.LanguageMessages */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapArrays")(js.undefined)
        ret
    }
  }
  
}

