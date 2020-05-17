package typingsSlinky.inputmask.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.inputmask.anon.Back
import typingsSlinky.inputmask.inputmaskStrings.number
import typingsSlinky.inputmask.inputmaskStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The alias to use.
    *
    * @default null
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Allow to enter -.
    *
    * @default true
    */
  var allowMinus: js.UndefOr[Boolean] = js.native
  /**
    * Definition of the symbols used to indicate an alternator part in the mask.
    *
    * @default "|"
    */
  var alternatormarker: js.UndefOr[String] = js.native
  /**
    * Enable grouping of the integer part.
    *
    * @default false
    */
  var autoGroup: js.UndefOr[Boolean] = js.native
  /**
    * Automatically unmask the value when retrieved.
    *
    * When setting this option to true the plugin also expects the initial value from the server to be unmasked.
    *
    * @default false
    */
  var autoUnmask: js.UndefOr[Boolean] = js.native
  /**
    * Apply casing at the mask-level.
    *
    * @default undefined
    */
  var casing: js.UndefOr[Casing] = js.native
  /**
    * Clear the incomplete input on blur.
    *
    * @default false
    */
  var clearIncomplete: js.UndefOr[Boolean] = js.native
  /**
    * Remove the empty mask on blur or when not empty removes the optional trailing part.
    *
    * @default true
    */
  var clearMaskOnLostFocus: js.UndefOr[Boolean] = js.native
  /**
    * Create a css styleable mask.
    *
    * You need to include the inputmask.css in your page to use this option.
    *
    * See the inputmask.css for more info about the used styling. You can override the
    * Inputmask.prototype.positionColorMask`if you need some custom positioning.
    *
    * @default false
    */
  var colorMask: js.UndefOr[Boolean] = js.native
  /**
    * Do not allow assumption of decimals input without entering the radixpoint.
    *
    * @default true
    */
  var decimalProtect: js.UndefOr[Boolean] = js.native
  /**
    * Add new definitions to this inputmask.
    */
  var definitions: js.UndefOr[StringDictionary[Definition]] = js.native
  /**
    * Number of fractionalDigits.
    *
    * Possible values:
    *
    * * A number describing the number of fractional digits.
    * * `*`
    * * Quantifier syntax like `2,4`. When the quantifier syntax is used, the `digitsOptional` option is ignored
    *
    * @default "*"
    */
  var digits: js.UndefOr[String] = js.native
  /**
    * Specify wheter the digits are optional.
    *
    * @default true
    */
  var digitsOptional: js.UndefOr[Boolean] = js.native
  /**
    * Disables predictive text on mobile devices.
    *
    * What it does:
    *
    * * changes the input type to password => disables predictive text
    * * enables the colorMask option which creates a div, which surrounds the input. So we type in the hidden
    *   password input and render the mask in the a created div.
    *
    * To use the colorMask, you need to include the inputmask.css. You might need to add some css-tweaks to make
    * it all visually correct in your page.
    *
    * @default false
    */
  var disablePredictiveText: js.UndefOr[Boolean] = js.native
  /**
    * Enforces the decimal part when leaving the input field.
    *
    * @default false
    */
  var enforceDigitsOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * Definition of the symbols used to escape a part in the mask.
    *
    * @default "\\"
    */
  var escapeChar: js.UndefOr[String] = js.native
  /**
    * Toggle to allocate as much possible or the opposite. Non-greedy repeat function. With the non-greedy option
    * set to `false`, you can specify `*` as repeat. This makes an endless repeat.
    *
    * @default false
    */
  var greedy: js.UndefOr[Boolean] = js.native
  /**
    * Define the groupseparator.
    *
    * @default ""
    */
  var groupSeparator: js.UndefOr[String] = js.native
  /**
    * Define the grouping of the integer part.
    *
    * @default 3
    */
  var groupSize: js.UndefOr[Double] = js.native
  /**
    * Definition of the symbols used to indicate a group in the mask.
    *
    * @default { start: "(", end: ")" }
    */
  var groupmarker: js.UndefOr[Range] = js.native
  /**
    * Specify keyCodes which should not be considered in the keypress event, otherwise the `preventDefault` will
    * stop their default behavior especially in FF.
    */
  var ignorables: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Specify to use the `data-inputmask` attributes or to ignore them.
    *
    * If you don't use data attributes you can disable the import by specifying `importDataAttributes: false`.
    *
    * @default true
    */
  var importDataAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Format used to input a date. This option is only effective for the datetime alias.
    *
    * Supported symbols
    *
    * * `d` - Day of the month as digits; no leading zero for single-digit days.
    * * `dd` - Day of the month as digits; leading zero for single-digit days.
    * * `ddd` - Day of the week as a three-letter abbreviation.
    * * `dddd` - Day of the week as its full name.
    * * `m` - Month as digits; no leading zero for single-digit months.
    * * `mm` - Month as digits; leading zero for single-digit months.
    * * `mmm` - Month as a three-letter abbreviation.
    * * `mmmm` - Month as its full name.
    * * `yy` - Year as last two digits; leading zero for years less than 10.
    * * `yyyy` - Year as 4 digits.
    * * `h` - Hours; no leading zero for single-digit hours (12-hour clock).
    * * `hh` - Hours; leading zero for single-digit hours (12-hour clock).
    * * `hhh` - Hours; no limit
    * * `H` - Hours; no leading zero for single-digit hours (24-hour clock).
    * * `HH` - Hours; leading zero for single-digit hours (24-hour clock).
    * * `HHH` - Hours; no limit
    * * `M` - Minutes; no leading zero for single-digit minutes. Uppercase M unlike CF timeFormat's m to avoid
    *         conflict with months.
    * * `MM` - Minutes; leading zero for single-digit minutes. Uppercase MM unlike CF timeFormat's mm to avoid
    *          conflict with months.
    * * `s` - Seconds; no leading zero for single-digit seconds.
    * * `ss` - Seconds; leading zero for single-digit seconds.
    * * `l` - Milliseconds. 3 digits.
    * * `L` - Milliseconds. 2 digits.
    * * `t` - Lowercase, single-character time marker string: a or p.
    * * `tt` - Two-character time marker string: am or pm.
    * * `T` - Single-character time marker string: A or P.
    * * `TT` - Two-character time marker string: AM or PM.
    * * `Z` - US timezone abbreviation, e.g. EST or MDT. With non-US timezones or in the Opera browser, the
    *         GMT/UTC offset is returned, e.g. GMT-0500
    * * `o` - GMT/UTC timezone offset, e.g. -0500 or +0230.
    * * `S` - The date's ordinal suffix (st, nd, rd, or th). Works well with d.
    *
    * @default "isoDateTime"
    */
  var inputFormat: js.UndefOr[String] = js.native
  /**
    * Indicates whether the value passed for initialization is text or a number
    *
    * @default "text"
    */
  var inputType: js.UndefOr[text | number] = js.native
  /**
    * Specify the inputmode - already in place for when browsers start to support them
    * https://html.spec.whatwg.org/#input-modalities:-the-inputmode-attribute
    *
    * @default "verbatim"
    */
  var inputmode: js.UndefOr[InputMode] = js.native
  /**
    * Toggle to insert or overwrite input. This option can be altered by pressing the Insert key.
    *
    * @default true
    */
  var insertMode: js.UndefOr[Boolean] = js.native
  /**
    * Number of integerDigits
    *
    * @default "+"
    */
  var integerDigits: js.UndefOr[String] = js.native
  /**
    * Specify wheter the integerdigits are optional.
    *
    * @default true
    */
  var integerOptional: js.UndefOr[Boolean] = js.native
  /**
    * With this call-in (hook) you can override the default implementation of the isComplete function.
    */
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Array[String], /* opts */ Options, Boolean]] = js.native
  /**
    * Just in time masking. With the `jitMasking` option you can enable jit masking. The mask will only be
    * visible for the user entered characters.
    *
    * @default false
    */
  var jitMasking: js.UndefOr[Boolean] = js.native
  /**
    * Use in combination with the alternator syntax Try to keep the mask static while typing. Decisions to alter the
    * mask will be postponed if possible.
    *
    * ex. $(selector).inputmask({ mask: ["+55-99-9999-9999", "+55-99-99999-9999", ], keepStatic: true });
    *
    * typing 1212345123 => should result in +55-12-1234-5123 type extra 4 => switch to +55-12-12345-1234
    *
    * When passing multiple masks (an array of masks) keepStatic is automatically set to true unless explicitly set
    * through the options.
    *
    * @default null
    */
  var keepStatic: js.UndefOr[Boolean | Null] = js.native
  /**
    * The mask to use.
    */
  var mask: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* opts */ this.type, String | js.Array[String]])
  ] = js.native
  /**
    * Maximum value. This needs to be in the same format as the `inputFormat` when used with the datetime alias.
    */
  var max: js.UndefOr[String] = js.native
  /**
    * Minimum value. This needs to be in the same format as the `inputFormat` when used with the datetime alias.
    */
  var min: js.UndefOr[String] = js.native
  /**
    * Define your negationSymbol.
    *
    * @default { front: "-", back: "" }
    */
  var negationSymbol: js.UndefOr[Back] = js.native
  /**
    * Disable value property patching
    *
    * @default false
    */
  var noValuePatching: js.UndefOr[Boolean] = js.native
  /**
    * Return nothing from the input `value` property when the user hasn't entered anything. If this is false,
    * the mask might be returned.
    *
    * @default true
    */
  var nullable: js.UndefOr[Boolean] = js.native
  /**
    * Numeric input direction. Keeps the caret at the end.
    *
    * @default false
    */
  var numericInput: js.UndefOr[Boolean] = js.native
  /**
    * Executes before masking the initial value to allow preprocessing of the initial value.
    */
  var onBeforeMask: js.UndefOr[js.Function2[/* initialValue */ String, /* opts */ Options, String]] = js.native
  /**
    * This callback allows for preprocessing the pasted value before actually handling the value for masking.
    * This can be useful for stripping away some characters before processing. You can also disable pasting
    * a value by returning false in the `onBeforePaste` call.
    */
  var onBeforePaste: js.UndefOr[js.Function2[/* pastedValue */ String, /* opts */ Options, String]] = js.native
  /**
    * Executes before writing to the masked element Use this to do some extra processing of the input. This can
    * be useful when implementing an alias, ex. decimal alias, autofill the digits when leaving the inputfield.
    */
  var onBeforeWrite: js.UndefOr[
    js.Function4[
      /* event */ KeyboardEvent, 
      /* buffer */ js.Array[String], 
      /* caretPos */ Double, 
      /* opts */ Options, 
      CommandObject
    ]
  ] = js.native
  /**
    * Callback to implement autocomplete on certain keys for example.
    */
  var onKeyDown: js.UndefOr[
    js.Function4[
      /* event */ KeyboardEvent, 
      /* buffer */ js.Array[String], 
      /* caretPos */ Double, 
      /* opts */ Options, 
      Unit
    ]
  ] = js.native
  /**
    * Callback function is executed on every keyvalidation with the key & result as parameter.
    */
  var onKeyValidation: js.UndefOr[js.Function2[/* key */ Double, /* result */ Boolean, Unit]] = js.native
  /**
    * Executes after unmasking to allow post-processing of the unmaskedvalue.
    *
    * @returns New unmasked value
    */
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ String, /* unmaskedValue */ String, String]] = js.native
  /**
    * Execute a function when the mask is cleared.
    */
  var oncleared: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Execute a function when the mask is completed.
    */
  var oncomplete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Execute a function when the mask is cleared.
    */
  var onincomplete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Definition of the symbols used to indicate an optional part in the mask.
    *
    * @default { start: "[", end: "]" }
    */
  var optionalmarker: js.UndefOr[Range] = js.native
  /**
    * Format of the unmasked value. This is only effective when used with the datetime alias.
    */
  var outputFormat: js.UndefOr[String] = js.native
  /**
    * Change the mask placeholder. Instead of "_", you can change the unfilled characters mask as you like, simply
    * by adding the placeholder option. For example, placeholder: " " will change the default autofill with empty
    * values.
    *
    * @default "_"
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Positioning of the caret on click.
    *
    * Options:
    *
    * * `none`
    * * `lvp` - based on the last valid position (default)
    * * `radixFocus` - position caret to radixpoint on initial click
    * * `select` - select the whole input
    * * `ignore` - ignore the click and continue the mask
    *
    * @default "lvp"
    */
  var positionCaretOnClick: js.UndefOr[PositionCaretOnClick] = js.native
  /**
    * When enabled the caret position is set after the latest valid position on TAB.
    *
    * @default true
    */
  var positionCaretOnTab: js.UndefOr[Boolean] = js.native
  /**
    * Hook to postValidate the result from isValid. Useful for validating the entry as a whole.
    */
  var postValidation: js.UndefOr[
    js.Function4[
      /* buffer */ js.Array[String], 
      /* pos */ Double, 
      /* currentResult */ CommandObject, 
      /* opts */ Options, 
      Boolean | CommandObject
    ]
  ] = js.native
  /**
    * Hook to preValidate the input. Useful for validating regardless the definition. When return true, the normal
    * validation kicks in, otherwise it is skipped.
    */
  var preValidation: js.UndefOr[
    js.Function5[
      /* buffer */ js.Array[String], 
      /* pos */ Double, 
      /* char */ String, 
      /* isSelection */ Boolean, 
      /* opts */ Options, 
      Boolean | CommandObject
    ]
  ] = js.native
  /**
    * Define a prefix.
    *
    * @default ""
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Definition of the symbols used to indicate a quantifier in the mask.
    *
    * @default { start: "{", end: "}" }
    */
  var quantifiermarker: js.UndefOr[Range] = js.native
  /**
    * Define the radixpoint (decimal separator)
    *
    * @default ""
    */
  var radixPoint: js.UndefOr[String] = js.native
  /**
    * Use a regular expression as a mask. When using shorthands be aware that you need to double escape or use
    * String.raw with a string literal.
    */
  var regex: js.UndefOr[String] = js.native
  /**
    * Remove the mask before submitting the form.
    *
    * @default false
    */
  var removeMaskOnSubmit: js.UndefOr[Boolean] = js.native
  /**
    * Mask repeat function. Repeat the mask definition x-times.
    * `*` ~ forever, otherwise specify an integer
    *
    * @default 0
    */
  var repeat: js.UndefOr[Double | String] = js.native
  /**
    * Align the input to the right
    *
    * By setting the rightAlign you can specify to right align an inputmask. This is only applied in combination of
    * the `numericInput` option or the `dir-attribute`.
    *
    * @default true
    */
  var rightAlign: js.UndefOr[Boolean] = js.native
  /**
    * Shift position of the mask entries on entry and deletion. In some cases shift the mask enties isn't desired.
    *
    * Ex. date masks. Shifting month to day makes no sense
    *
    * @default true
    */
  var shiftPositions: js.UndefOr[Boolean] = js.native
  /**
    * Shows the mask when the input gets focus.
    *
    * @default true
    */
  var showMaskOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Shows the mask when the input is hevered by the mouse cursor.
    *
    * @default true
    */
  var showMaskOnHover: js.UndefOr[Boolean] = js.native
  /**
    * A character which can be used to skip an optional part of a mask.
    *
    * @default " "
    */
  var skipOptionalPartCharacter: js.UndefOr[String] = js.native
  /**
    * The `staticDefinitionSymbol` option is used to indicate that the static entries in the mask can match a
    * certain definition. Especially useful with alternators so that static element in the mask can match
    * another alternation.
    *
    * @default undefined
    */
  var staticDefinitionSymbol: js.UndefOr[String] = js.native
  /**
    * Define the step the ctrl-up & ctrl-down must take.
    *
    * @default 1
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Define a suffix.
    *
    * @default ""
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * List with the supported input types
    *
    * @default ["text", "tel", "url", "password", "search"]
    */
  var supportsInputType: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows for tabbing through the different parts of the masked field.
    *
    * @default false
    */
  var tabThrough: js.UndefOr[Boolean] = js.native
  /**
    * Make escape behave like undo. (ctrl-Z) Pressing escape reverts the value to the value before focus.
    *
    * @default true
    */
  var undoOnEscape: js.UndefOr[Boolean] = js.native
  /**
    * Make unmasking returning a number instead of a string.
    *
    * Be warned that using the unmaskAsNumber option together with jQuery.serialize will fail as serialize expects a string. (See issue #1288)
    *
    * @default false
    */
  var unmaskAsNumber: js.UndefOr[Boolean] = js.native
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
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMinus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMinus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMinus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMinus")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternatormarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatormarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternatormarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatormarker")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUnmask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUnmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUnmask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUnmask")(js.undefined)
        ret
    }
    @scala.inline
    def withCasing(value: Casing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(js.undefined)
        ret
    }
    @scala.inline
    def withClearIncomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIncomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIncomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIncomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withClearMaskOnLostFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMaskOnLostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearMaskOnLostFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMaskOnLostFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMask")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalProtect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalProtect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalProtect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalProtect")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitions(value: StringDictionary[Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.undefined)
        ret
    }
    @scala.inline
    def withDigits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(js.undefined)
        ret
    }
    @scala.inline
    def withDigitsOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digitsOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigitsOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digitsOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePredictiveText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePredictiveText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePredictiveText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePredictiveText")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceDigitsOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceDigitsOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceDigitsOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceDigitsOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(js.undefined)
        ret
    }
    @scala.inline
    def withGreedy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreedy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupmarker(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupmarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupmarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupmarker")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorables(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorables")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDataAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importDataAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportDataAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importDataAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInputType(value: text | number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputmode(value: InputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmode")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerDigits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withIsComplete(value: (/* buffer */ js.Array[String], /* opts */ Options) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withJitMasking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitMasking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJitMasking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitMasking")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepStaticNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepStatic")(null)
        ret
    }
    @scala.inline
    def withMaskFunction1(value: Options => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMask(value: String | js.Array[String] | (js.Function1[Options, String | js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNegationSymbol(value: Back): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negationSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegationSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negationSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withNoValuePatching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValuePatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValuePatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValuePatching")(js.undefined)
        ret
    }
    @scala.inline
    def withNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeMask(value: (/* initialValue */ String, /* opts */ Options) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeMask")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeMask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforePaste(value: (/* pastedValue */ String, /* opts */ Options) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePaste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforePaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeWrite(
      value: (/* event */ KeyboardEvent, /* buffer */ js.Array[String], /* caretPos */ Double, /* opts */ Options) => CommandObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeWrite")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(
      value: (/* event */ KeyboardEvent, /* buffer */ js.Array[String], /* caretPos */ Double, /* opts */ Options) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyValidation(value: (/* key */ Double, /* result */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyValidation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeyValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnMask(value: (/* maskedValue */ String, /* unmaskedValue */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnMask")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUnMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnMask")(js.undefined)
        ret
    }
    @scala.inline
    def withOncleared(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncleared")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOncleared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncleared")(js.undefined)
        ret
    }
    @scala.inline
    def withOncomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOncomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnincomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onincomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnincomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onincomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalmarker(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalmarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalmarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalmarker")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionCaretOnClick(value: PositionCaretOnClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionCaretOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionCaretOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionCaretOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionCaretOnTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionCaretOnTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionCaretOnTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionCaretOnTab")(js.undefined)
        ret
    }
    @scala.inline
    def withPostValidation(
      value: (/* buffer */ js.Array[String], /* pos */ Double, /* currentResult */ CommandObject, /* opts */ Options) => Boolean | CommandObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postValidation")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPostValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreValidation(
      value: (/* buffer */ js.Array[String], /* pos */ Double, /* char */ String, /* isSelection */ Boolean, /* opts */ Options) => Boolean | CommandObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preValidation")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutPreValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantifiermarker(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantifiermarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantifiermarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantifiermarker")(js.undefined)
        ret
    }
    @scala.inline
    def withRadixPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radixPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadixPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radixPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMaskOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMaskOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveMaskOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMaskOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withRightAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftPositions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaskOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaskOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaskOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaskOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipOptionalPartCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOptionalPartCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOptionalPartCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOptionalPartCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticDefinitionSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticDefinitionSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticDefinitionSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticDefinitionSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsInputType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsInputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsInputType")(js.undefined)
        ret
    }
    @scala.inline
    def withTabThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withUndoOnEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoOnEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndoOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoOnEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmaskAsNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmaskAsNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmaskAsNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmaskAsNumber")(js.undefined)
        ret
    }
  }
  
}

