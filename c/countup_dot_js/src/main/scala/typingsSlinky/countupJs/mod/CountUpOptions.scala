package typingsSlinky.countupJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountUpOptions extends js.Object {
  var decimal: js.UndefOr[String] = js.native
  var decimalPlaces: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.native
  var formattingFn: js.UndefOr[js.Function1[/* n */ Double, String]] = js.native
  var numerals: js.UndefOr[js.Array[String]] = js.native
  var prefix: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
  var smartEasingAmount: js.UndefOr[Double] = js.native
  var smartEasingThreshold: js.UndefOr[Double] = js.native
  var startVal: js.UndefOr[Double] = js.native
  var suffix: js.UndefOr[String] = js.native
  var useEasing: js.UndefOr[Boolean] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
}

object CountUpOptions {
  @scala.inline
  def apply(): CountUpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountUpOptions]
  }
  @scala.inline
  implicit class CountUpOptionsOps[Self <: CountUpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEasingFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattingFn(value: /* n */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattingFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormattingFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattingFn")(js.undefined)
        ret
    }
    @scala.inline
    def withNumerals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numerals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumerals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numerals")(js.undefined)
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
    def withSmartEasingAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartEasingAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartEasingAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartEasingAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartEasingThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartEasingThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartEasingThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartEasingThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withStartVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVal")(js.undefined)
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
    def withUseEasing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(js.undefined)
        ret
    }
  }
  
}

