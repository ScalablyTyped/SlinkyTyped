package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. See CompensationInfo.  Decimal number.
  */
@js.native
trait SchemaExtendedCompensationInfoDecimal extends js.Object {
  /**
    * Micro (10^-6) units. The value must be between -999,999 and +999,999
    * inclusive. If `units` is positive, `micros` must be positive or zero. If
    * `units` is zero, `micros` can be positive, zero, or negative. If `units`
    * is negative, `micros` must be negative or zero. For example -1.75 is
    * represented as `units`=-1 and `micros`=-750,000.
    */
  var micros: js.UndefOr[Double] = js.native
  /**
    * Whole units.
    */
  var units: js.UndefOr[String] = js.native
}

object SchemaExtendedCompensationInfoDecimal {
  @scala.inline
  def apply(): SchemaExtendedCompensationInfoDecimal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoDecimal]
  }
  @scala.inline
  implicit class SchemaExtendedCompensationInfoDecimalOps[Self <: SchemaExtendedCompensationInfoDecimal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMicros(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micros")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

