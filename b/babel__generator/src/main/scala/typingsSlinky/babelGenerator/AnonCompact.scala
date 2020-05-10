package typingsSlinky.babelGenerator

import typingsSlinky.babelGenerator.babelGeneratorStrings.backtick
import typingsSlinky.babelGenerator.babelGeneratorStrings.binary
import typingsSlinky.babelGenerator.babelGeneratorStrings.decimal
import typingsSlinky.babelGenerator.babelGeneratorStrings.double
import typingsSlinky.babelGenerator.babelGeneratorStrings.hexadecimal
import typingsSlinky.babelGenerator.babelGeneratorStrings.octal
import typingsSlinky.babelGenerator.babelGeneratorStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompact extends js.Object {
  /**
    * The compact option takes a boolean value (true or false), and defaults to true (enabled). When enabled,
    * the output for arrays and objects is as compact as possible; it’s not formatted nicely.
    */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * The es6 option takes a boolean value (true or false), and defaults to false (disabled). When enabled, any
    * astral Unicode symbols in the input are escaped using ECMAScript 6 Unicode code point escape sequences
    * instead of using separate escape sequences for each surrogate half. If backwards compatibility with ES5
    * environments is a concern, don’t enable this setting. If the json setting is enabled, the value for the es6
    * setting is ignored (as if it was false).
    */
  var es6: js.UndefOr[Boolean] = js.native
  /**
    * The escapeEverything option takes a boolean value (true or false), and defaults to false (disabled). When
    * enabled, all the symbols in the output are escaped — even printable ASCII symbols.
    */
  var escapeEverything: js.UndefOr[Boolean] = js.native
  /**
    * The indent option takes a string value, and defaults to '\t'. When the compact setting is enabled (true),
    * the value of the indent option is used to format the output for arrays and objects.
    */
  var indent: js.UndefOr[String] = js.native
  /**
    * The indentLevel option takes a numeric value, and defaults to 0. It represents the current indentation level,
    * i.e. the number of times the value of the indent option is repeated.
    */
  var indentLevel: js.UndefOr[Double] = js.native
  /**
    * The isScriptContext option takes a boolean value (true or false), and defaults to false (disabled). When
    * enabled, occurrences of </script and </style in the output are escaped as <\/script and <\/style, and <!--
    * is escaped as \x3C!-- (or \\u003C!-- when the json option is enabled). This setting is useful when jsesc’s
    * output ends up as part of a <script> or <style> element in an HTML document.
    */
  var isScriptContext: js.UndefOr[Boolean] = js.native
  /**
    * The json option takes a boolean value (true or false), and defaults to false (disabled). When enabled, the
    * output is valid JSON. Hexadecimal character escape sequences and the \v or \0 escape sequences are not used.
    * Setting json: true implies quotes: 'double', wrap: true, es6: false, although these values can still be
    * overridden if needed — but in such cases, the output won’t be valid JSON anymore.
    */
  var json: js.UndefOr[Boolean] = js.native
  /**
    * The lowercaseHex option takes a boolean value (true or false), and defaults to false (disabled). When enabled,
    * any alphabetical hexadecimal digits in escape sequences as well as any hexadecimal integer literals (see the
    * numbers option) in the output are in lowercase.
    */
  var lowercaseHex: js.UndefOr[Boolean] = js.native
  /**
    * The minimal option takes a boolean value (true or false), and defaults to false (disabled). When enabled,
    * only a limited set of symbols in the output are escaped: \0, \b, \t, \n, \f, \r, \\, \\u2028, \\u2029.
    */
  var minimal: js.UndefOr[Boolean] = js.native
  /**
    * The default value for the numbers option is 'decimal'. This means that any numeric values are represented
    * using decimal integer literals. Other valid options are binary, octal, and hexadecimal, which result in
    * binary integer literals, octal integer literals, and hexadecimal integer literals, respectively.
    */
  var numbers: js.UndefOr[binary | octal | decimal | hexadecimal] = js.native
  /**
    * The default value for the quotes option is 'single'. This means that any occurrences of ' in the input
    * string are escaped as \', so that the output can be used in a string literal wrapped in single quotes.
    */
  var quotes: js.UndefOr[single | double | backtick] = js.native
  /**
    * The wrap option takes a boolean value (true or false), and defaults to false (disabled). When enabled, the
    * output is a valid JavaScript string literal wrapped in quotes. The type of quotes can be specified through
    * the quotes setting.
    */
  var wrap: js.UndefOr[Boolean] = js.native
}

object AnonCompact {
  @scala.inline
  def apply(): AnonCompact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCompact]
  }
  @scala.inline
  implicit class AnonCompactOps[Self <: AnonCompact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withEs6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEs6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es6")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeEverything(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeEverything")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeEverything: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeEverything")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScriptContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScriptContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScriptContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScriptContext")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercaseHex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseHex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercaseHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseHex")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(js.undefined)
        ret
    }
    @scala.inline
    def withNumbers(value: binary | octal | decimal | hexadecimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotes(value: single | double | backtick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

