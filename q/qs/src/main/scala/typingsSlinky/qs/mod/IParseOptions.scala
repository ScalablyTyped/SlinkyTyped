package typingsSlinky.qs.mod

import typingsSlinky.qs.qsBooleans.`false`
import typingsSlinky.qs.qsStrings.`iso-8859-1`
import typingsSlinky.qs.qsStrings.`utf-8`
import typingsSlinky.qs.qsStrings.key
import typingsSlinky.qs.qsStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParseOptions extends js.Object {
  var allowDots: js.UndefOr[Boolean] = js.native
  var allowPrototypes: js.UndefOr[Boolean] = js.native
  var arrayLimit: js.UndefOr[Double] = js.native
  var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.native
  var charsetSentinel: js.UndefOr[Boolean] = js.native
  var comma: js.UndefOr[Boolean] = js.native
  var decoder: js.UndefOr[
    js.Function4[
      /* str */ String, 
      /* defaultDecoder */ defaultDecoder, 
      /* charset */ String, 
      /* type */ key | value, 
      _
    ]
  ] = js.native
  var delimiter: js.UndefOr[String | js.RegExp] = js.native
  var depth: js.UndefOr[Double | `false`] = js.native
  var ignoreQueryPrefix: js.UndefOr[Boolean] = js.native
  var interpretNumericEntities: js.UndefOr[Boolean] = js.native
  var parameterLimit: js.UndefOr[Double] = js.native
  var parseArrays: js.UndefOr[Boolean] = js.native
  var plainObjects: js.UndefOr[Boolean] = js.native
  var strictNullHandling: js.UndefOr[Boolean] = js.native
}

object IParseOptions {
  @scala.inline
  def apply(): IParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParseOptions]
  }
  @scala.inline
  implicit class IParseOptionsOps[Self <: IParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDots")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPrototypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrototypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPrototypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrototypes")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withCharset(value: `utf-8` | `iso-8859-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withCharsetSentinel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsetSentinel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharsetSentinel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsetSentinel")(js.undefined)
        ret
    }
    @scala.inline
    def withComma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comma")(js.undefined)
        ret
    }
    @scala.inline
    def withDecoder(
      value: (/* str */ String, /* defaultDecoder */ defaultDecoder, /* charset */ String, /* type */ key | value) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDecoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiter(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreQueryPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreQueryPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreQueryPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreQueryPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpretNumericEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpretNumericEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpretNumericEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpretNumericEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withParseArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withPlainObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlainObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictNullHandling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNullHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictNullHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNullHandling")(js.undefined)
        ret
    }
  }
  
}

