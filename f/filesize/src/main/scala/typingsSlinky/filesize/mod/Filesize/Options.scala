package typingsSlinky.filesize.mod.Filesize

import typingsSlinky.filesize.filesizeStrings.`object`
import typingsSlinky.filesize.filesizeStrings.array
import typingsSlinky.filesize.filesizeStrings.exponent
import typingsSlinky.filesize.filesizeStrings.iec
import typingsSlinky.filesize.filesizeStrings.jedec
import typingsSlinky.filesize.filesizeStrings.string
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Number base, default is 2
    */
  var base: js.UndefOr[Double] = js.native
  /**
    * Enables bit sizes, default is false
    */
  var bits: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the SI suffix via exponent, e.g. 2 is MB for bytes, default is -1
    */
  var exponent: js.UndefOr[Double] = js.native
  /**
    * Enables full form of unit of measure, default is false
    */
  var fullform: js.UndefOr[Boolean] = js.native
  /**
    * Array of full form overrides, default is []
    */
  var fullforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * BCP 47 language tag to specify a locale, or true to use default locale, default is ""
    */
  var locale: js.UndefOr[String | Boolean] = js.native
  /**
    * ECMA-402 number format option overrides, default is "{}"
    */
  var localeOptions: js.UndefOr[NumberFormatOptions] = js.native
  /**
    * Output of function (array, exponent, object, or string), default is string
    */
  var output: js.UndefOr[array | exponent | `object` | string] = js.native
  /**
    * Decimal place, default is 2
    */
  var round: js.UndefOr[Double] = js.native
  /**
    * Decimal separator character, default is `.`
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Character between the result and suffix, default is ` `
    */
  var spacer: js.UndefOr[String] = js.native
  /**
    * Standard unit of measure, can be iec or jedec, default is jedec; can be overruled by base
    */
  var standard: js.UndefOr[iec | jedec] = js.native
  /**
    * Dictionary of SI/JEDEC symbols to replace for localization, defaults to english if no match is found
    */
  var symbols: js.UndefOr[SiJedec] = js.native
  /**
    *  Enables unix style human readable output, e.g ls -lh, default is false
    */
  var unix: js.UndefOr[Boolean] = js.native
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
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits")(js.undefined)
        ret
    }
    @scala.inline
    def withExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(js.undefined)
        ret
    }
    @scala.inline
    def withFullform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullform")(js.undefined)
        ret
    }
    @scala.inline
    def withFullforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullforms")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleOptions(value: NumberFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: array | exponent | `object` | string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacer")(js.undefined)
        ret
    }
    @scala.inline
    def withStandard(value: iec | jedec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: SiJedec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
    @scala.inline
    def withUnix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unix")(js.undefined)
        ret
    }
  }
  
}

