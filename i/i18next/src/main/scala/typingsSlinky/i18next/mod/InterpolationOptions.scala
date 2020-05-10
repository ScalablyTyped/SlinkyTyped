package typingsSlinky.i18next.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationOptions extends js.Object {
  /**
    * Global variables to use in interpolation replacements
    * @default undefined
    */
  var defaultVariables: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Escape function
    * @default str => str
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  /**
    * Escape passed in values to avoid xss injection
    * @default true
    */
  var escapeValue: js.UndefOr[Boolean] = js.native
  /**
    * Format function see formatting for details
    * @default noop
    */
  var format: js.UndefOr[FormatFunction] = js.native
  /**
    * Used to separate format from interpolation value
    * @default ','
    */
  var formatSeparator: js.UndefOr[String] = js.native
  /**
    * After how many interpolation runs to break out before throwing a stack overflow
    * @default 1000
    */
  var maxReplaces: js.UndefOr[Double] = js.native
  /**
    * Prefix for nesting
    * @default '$t('
    */
  var nestingPrefix: js.UndefOr[String] = js.native
  /**
    * Escaped prefix for nesting (regexSafe)
    * @default undefined
    */
  var nestingPrefixEscaped: js.UndefOr[String] = js.native
  /**
    * Suffix for nesting
    * @default ')'
    */
  var nestingSuffix: js.UndefOr[String] = js.native
  /**
    * Escaped suffix for nesting (regexSafe)
    * @default undefined
    */
  var nestingSuffixEscaped: js.UndefOr[String] = js.native
  /**
    * Prefix for interpolation
    * @default '{{'
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Escaped prefix for interpolation (regexSafe)
    * @default undefined
    */
  var prefixEscaped: js.UndefOr[String] = js.native
  /**
    * Suffix for interpolation
    * @default '}}'
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Escaped suffix for interpolation (regexSafe)
    * @default undefined
    */
  var suffixEscaped: js.UndefOr[String] = js.native
  /**
    * Prefix to unescaped mode
    * @default '-'
    */
  var unescapePrefix: js.UndefOr[String] = js.native
  /**
    * Suffix to unescaped mode
    * @default undefined
    */
  var unescapeSuffix: js.UndefOr[String] = js.native
  /**
    * If true, then value passed into escape function is not casted to string, use with custom escape function that does its own type check
    * @default false
    */
  var useRawValueToEscape: js.UndefOr[Boolean] = js.native
}

object InterpolationOptions {
  @scala.inline
  def apply(): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationOptions]
  }
  @scala.inline
  implicit class InterpolationOptionsOps[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVariables(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: /* str */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(
      value: (/* value */ js.Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReplaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReplaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReplaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReplaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingPrefixEscaped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingPrefixEscaped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingPrefixEscaped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingPrefixEscaped")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingSuffixEscaped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingSuffixEscaped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingSuffixEscaped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingSuffixEscaped")(js.undefined)
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
    def withPrefixEscaped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixEscaped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixEscaped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixEscaped")(js.undefined)
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
    def withSuffixEscaped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixEscaped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixEscaped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixEscaped")(js.undefined)
        ret
    }
    @scala.inline
    def withUnescapePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescapePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnescapePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescapePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withUnescapeSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescapeSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnescapeSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescapeSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withUseRawValueToEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRawValueToEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRawValueToEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRawValueToEscape")(js.undefined)
        ret
    }
  }
  
}

