package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatDigitInternalSlots extends js.Object {
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: Double = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var notation: js.UndefOr[NumberFormatNotation] = js.native
  var roundingType: NumberFormatRoundingType = js.native
}

object NumberFormatDigitInternalSlots {
  @scala.inline
  def apply(minimumIntegerDigits: Double, roundingType: NumberFormatRoundingType): NumberFormatDigitInternalSlots = {
    val __obj = js.Dynamic.literal(minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatDigitInternalSlots]
  }
  @scala.inline
  implicit class NumberFormatDigitInternalSlotsOps[Self <: NumberFormatDigitInternalSlots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumIntegerDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumIntegerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundingType(value: NumberFormatRoundingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFractionDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumSignificantDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSignificantDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumFractionDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSignificantDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSignificantDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withNotation(value: NumberFormatNotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(js.undefined)
        ret
    }
  }
  
}

