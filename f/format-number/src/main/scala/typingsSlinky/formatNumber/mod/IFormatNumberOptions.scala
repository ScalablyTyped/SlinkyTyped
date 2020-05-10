package typingsSlinky.formatNumber.mod

import typingsSlinky.formatNumber.formatNumberStrings.brackets
import typingsSlinky.formatNumber.formatNumberStrings.left
import typingsSlinky.formatNumber.formatNumberStrings.none
import typingsSlinky.formatNumber.formatNumberStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatNumberOptions extends js.Object {
  var decimal: js.UndefOr[String] = js.native
  var decimalsSeparator: js.UndefOr[String] = js.native
  var integerSeparator: js.UndefOr[String] = js.native
  var negativeLeftOut: js.UndefOr[Boolean] = js.native
  var negativeLeftSymbol: js.UndefOr[String] = js.native
  var negativeRightOut: js.UndefOr[Boolean] = js.native
  var negativeRightSymbol: js.UndefOr[String] = js.native
  var negativeType: js.UndefOr[right | left | brackets | none] = js.native
  var padLeft: js.UndefOr[Double] = js.native
  var padRight: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var round: js.UndefOr[Double] = js.native
  var suffix: js.UndefOr[String] = js.native
  var truncate: js.UndefOr[Double] = js.native
}

object IFormatNumberOptions {
  @scala.inline
  def apply(): IFormatNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormatNumberOptions]
  }
  @scala.inline
  implicit class IFormatNumberOptionsOps[Self <: IFormatNumberOptions] (val x: Self) extends AnyVal {
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
    def withDecimalsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalsSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeLeftOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeLeftOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeLeftOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeLeftOut")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeLeftSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeLeftSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeLeftSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeLeftSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeRightOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeRightOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeRightOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeRightOut")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeRightSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeRightSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeRightSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeRightSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeType(value: right | left | brackets | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPadLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPadRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padRight")(js.undefined)
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
    def withTruncate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.undefined)
        ret
    }
  }
  
}

