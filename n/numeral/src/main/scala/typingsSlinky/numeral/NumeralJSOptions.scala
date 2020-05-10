package typingsSlinky.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumeralJSOptions extends js.Object {
  var currentLocale: String = js.native
  var defaultFormat: String = js.native
  var nullFormat: String = js.native
  var scalePercentBy100: Boolean = js.native
  var zeroFormat: String = js.native
}

object NumeralJSOptions {
  @scala.inline
  def apply(
    currentLocale: String,
    defaultFormat: String,
    nullFormat: String,
    scalePercentBy100: Boolean,
    zeroFormat: String
  ): NumeralJSOptions = {
    val __obj = js.Dynamic.literal(currentLocale = currentLocale.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any], scalePercentBy100 = scalePercentBy100.asInstanceOf[js.Any], zeroFormat = zeroFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumeralJSOptions]
  }
  @scala.inline
  implicit class NumeralJSOptionsOps[Self <: NumeralJSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalePercentBy100(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalePercentBy100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

