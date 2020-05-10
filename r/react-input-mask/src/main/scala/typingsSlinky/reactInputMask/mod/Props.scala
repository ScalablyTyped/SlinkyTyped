package typingsSlinky.reactInputMask.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * Show mask even in empty input without focus.
    */
  var alwaysShowMask: js.UndefOr[Boolean] = js.native
  /**
    * In case you need to implement more complex masking behavior, you can provide
    * beforeMaskedValueChange function to change masked value and cursor position
    * before it will be applied to the input.
    */
  var beforeMaskedValueChange: js.UndefOr[
    js.Function4[
      /* newState */ InputState, 
      /* oldState */ InputState, 
      /* userInput */ String, 
      /* maskOptions */ MaskOptions, 
      InputState
    ]
  ] = js.native
  /**
    * Defines format characters with characters as keys and corresponding RegExp string as values. Default ones:
    * ```
    * {
    *   "9": "[0-9]",
    *   "a": "[A-Za-z]",
    *   "*": "[A-Za-z0-9]"
    * }```
    */
  var formatChars: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Use inputRef instead of ref if you need input node to manage focus, selection, etc.
    */
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  /**
    * Mask string. Format characters are:
    * * `9`: `0-9`
    * * `a`: `A-Z, a-z`
    * * `\*`: `A-Z, a-z, 0-9`
    *
    * Any character can be escaped with backslash, which usually will appear as double backslash in JS strings.
    * For example, German phone mask with unremoveable prefix +49 will look like `mask="+4\\9 99 999 99"` or `mask={"+4\\\\9 99 999 99"}`
    */
  var mask: String | (js.Array[String | js.RegExp]) = js.native
  /**
    * Character to cover unfilled editable parts of mask. Default character is "_". If set to null, unfilled parts will be empty, like in ordinary input.
    */
  var maskChar: js.UndefOr[String | Null] = js.native
}

object Props {
  @scala.inline
  def apply(mask: String | (js.Array[String | js.RegExp])): Props = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMask(value: String | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysShowMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowMask")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeMaskedValueChange(
      value: (/* newState */ InputState, /* oldState */ InputState, /* userInput */ String, /* maskOptions */ MaskOptions) => InputState
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMaskedValueChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeMaskedValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMaskedValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatChars(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatChars")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRefRefObject(value: ReactRef[HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputRef(value: Ref[HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(null)
        ret
    }
    @scala.inline
    def withMaskChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskCharNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(null)
        ret
    }
  }
  
}

