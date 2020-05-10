package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. See CompensationInfo.  Compensation range.
  */
@js.native
trait SchemaExtendedCompensationInfoCompensationRange extends js.Object {
  /**
    * Required.  Maximum value.
    */
  var max: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  /**
    * Required.  Minimum value.
    */
  var min: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
}

object SchemaExtendedCompensationInfoCompensationRange {
  @scala.inline
  def apply(): SchemaExtendedCompensationInfoCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationRange]
  }
  @scala.inline
  implicit class SchemaExtendedCompensationInfoCompensationRangeOps[Self <: SchemaExtendedCompensationInfoCompensationRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: SchemaExtendedCompensationInfoDecimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: SchemaExtendedCompensationInfoDecimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
  }
  
}

