package typingsSlinky.qs.mod

import typingsSlinky.qs.qsStrings.RFC1738
import typingsSlinky.qs.qsStrings.RFC3986
import typingsSlinky.qs.qsStrings.`iso-8859-1`
import typingsSlinky.qs.qsStrings.`utf-8`
import typingsSlinky.qs.qsStrings.brackets
import typingsSlinky.qs.qsStrings.comma
import typingsSlinky.qs.qsStrings.indices
import typingsSlinky.qs.qsStrings.key
import typingsSlinky.qs.qsStrings.repeat
import typingsSlinky.qs.qsStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStringifyOptions extends js.Object {
  var addQueryPrefix: js.UndefOr[Boolean] = js.native
  var allowDots: js.UndefOr[Boolean] = js.native
  var arrayFormat: js.UndefOr[indices | brackets | repeat | comma] = js.native
  var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.native
  var charsetSentinel: js.UndefOr[Boolean] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var encode: js.UndefOr[Boolean] = js.native
  var encodeValuesOnly: js.UndefOr[Boolean] = js.native
  var encoder: js.UndefOr[
    js.Function4[
      /* str */ js.Any, 
      /* defaultEncoder */ defaultEncoder, 
      /* charset */ String, 
      /* type */ key | value, 
      String
    ]
  ] = js.native
  var filter: js.UndefOr[
    (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])
  ] = js.native
  var format: js.UndefOr[RFC1738 | RFC3986] = js.native
  var indices: js.UndefOr[Boolean] = js.native
  var serializeDate: js.UndefOr[js.Function1[/* d */ js.Date, String]] = js.native
  var skipNulls: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
  var strictNullHandling: js.UndefOr[Boolean] = js.native
}

object IStringifyOptions {
  @scala.inline
  def apply(): IStringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStringifyOptions]
  }
  @scala.inline
  implicit class IStringifyOptionsOps[Self <: IStringifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddQueryPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addQueryPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddQueryPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addQueryPrefix")(js.undefined)
        ret
    }
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
    def withArrayFormat(value: indices | brackets | repeat | comma): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(js.undefined)
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
    def withDelimiter(value: String): Self = {
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
    def withEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeValuesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeValuesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeValuesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeValuesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoder(
      value: (/* str */ js.Any, /* defaultEncoder */ defaultEncoder, /* charset */ String, /* type */ key | value) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEncoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction2(value: (/* prefix */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilter(value: (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: RFC1738 | RFC3986): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeDate(value: /* d */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipNulls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipNulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNulls")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
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

