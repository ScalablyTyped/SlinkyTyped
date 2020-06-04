package typingsSlinky.qs.mod

import typingsSlinky.qs.qsBooleans.`false`
import typingsSlinky.qs.qsStrings.`iso-8859-1`
import typingsSlinky.qs.qsStrings.`utf-8`
import typingsSlinky.qs.qsStrings.key
import typingsSlinky.qs.qsStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParseOptions extends js.Object {
  var allowDots: js.UndefOr[Boolean] = js.undefined
  var allowPrototypes: js.UndefOr[Boolean] = js.undefined
  var arrayLimit: js.UndefOr[Double] = js.undefined
  var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.undefined
  var charsetSentinel: js.UndefOr[Boolean] = js.undefined
  var comma: js.UndefOr[Boolean] = js.undefined
  var decoder: js.UndefOr[
    js.Function4[
      /* str */ String, 
      /* defaultDecoder */ defaultDecoder, 
      /* charset */ String, 
      /* type */ key | value, 
      _
    ]
  ] = js.undefined
  var delimiter: js.UndefOr[String | js.RegExp] = js.undefined
  var depth: js.UndefOr[Double | `false`] = js.undefined
  var ignoreQueryPrefix: js.UndefOr[Boolean] = js.undefined
  var interpretNumericEntities: js.UndefOr[Boolean] = js.undefined
  var parameterLimit: js.UndefOr[Double] = js.undefined
  var parseArrays: js.UndefOr[Boolean] = js.undefined
  var plainObjects: js.UndefOr[Boolean] = js.undefined
  var strictNullHandling: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDots(value: Boolean): Self = this.set("allowDots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDots: Self = this.set("allowDots", js.undefined)
    @scala.inline
    def setAllowPrototypes(value: Boolean): Self = this.set("allowPrototypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPrototypes: Self = this.set("allowPrototypes", js.undefined)
    @scala.inline
    def setArrayLimit(value: Double): Self = this.set("arrayLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayLimit: Self = this.set("arrayLimit", js.undefined)
    @scala.inline
    def setCharset(value: `utf-8` | `iso-8859-1`): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setCharsetSentinel(value: Boolean): Self = this.set("charsetSentinel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharsetSentinel: Self = this.set("charsetSentinel", js.undefined)
    @scala.inline
    def setComma(value: Boolean): Self = this.set("comma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComma: Self = this.set("comma", js.undefined)
    @scala.inline
    def setDecoder(
      value: (/* str */ String, /* defaultDecoder */ defaultDecoder, /* charset */ String, /* type */ key | value) => _
    ): Self = this.set("decoder", js.Any.fromFunction4(value))
    @scala.inline
    def deleteDecoder: Self = this.set("decoder", js.undefined)
    @scala.inline
    def setDelimiterRegExp(value: js.RegExp): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: String | js.RegExp): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDepth(value: Double | `false`): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setIgnoreQueryPrefix(value: Boolean): Self = this.set("ignoreQueryPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreQueryPrefix: Self = this.set("ignoreQueryPrefix", js.undefined)
    @scala.inline
    def setInterpretNumericEntities(value: Boolean): Self = this.set("interpretNumericEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpretNumericEntities: Self = this.set("interpretNumericEntities", js.undefined)
    @scala.inline
    def setParameterLimit(value: Double): Self = this.set("parameterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterLimit: Self = this.set("parameterLimit", js.undefined)
    @scala.inline
    def setParseArrays(value: Boolean): Self = this.set("parseArrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseArrays: Self = this.set("parseArrays", js.undefined)
    @scala.inline
    def setPlainObjects(value: Boolean): Self = this.set("plainObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlainObjects: Self = this.set("plainObjects", js.undefined)
    @scala.inline
    def setStrictNullHandling(value: Boolean): Self = this.set("strictNullHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictNullHandling: Self = this.set("strictNullHandling", js.undefined)
  }
  
}

