package typingsSlinky.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://numeraljs.com/#custom-formats
@js.native
trait NumeralJsFormat extends js.Object {
  var regexps: AnonFormat = js.native
  def format(value: js.Any, format: String, roundingFunction: RoundingFunction): String = js.native
  def unformat(value: String): Double = js.native
}

object NumeralJsFormat {
  @scala.inline
  def apply(
    format: (js.Any, String, RoundingFunction) => String,
    regexps: AnonFormat,
    unformat: String => Double
  ): NumeralJsFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), regexps = regexps.asInstanceOf[js.Any], unformat = js.Any.fromFunction1(unformat))
    __obj.asInstanceOf[NumeralJsFormat]
  }
  @scala.inline
  implicit class NumeralJsFormatOps[Self <: NumeralJsFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: (js.Any, String, RoundingFunction) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRegexps(value: AnonFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnformat(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unformat")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

