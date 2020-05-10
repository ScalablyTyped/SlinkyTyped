package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Job compensation details.
  */
@js.native
trait SchemaCompensationInfo extends js.Object {
  /**
    * Output only. Annualized base compensation range. Computed as base
    * compensation entry&#39;s CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Output only. Annualized total compensation range. Computed as all
    * compensation entries&#39; CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Optional.  Job compensation information.  At most one entry can be of
    * type CompensationInfo.CompensationType.BASE, which is referred as ** base
    * compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaCompensationEntry]] = js.native
}

object SchemaCompensationInfo {
  @scala.inline
  def apply(): SchemaCompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationInfo]
  }
  @scala.inline
  implicit class SchemaCompensationInfoOps[Self <: SchemaCompensationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnualizedBaseCompensationRange(value: SchemaCompensationRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedBaseCompensationRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnualizedBaseCompensationRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedBaseCompensationRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnualizedTotalCompensationRange(value: SchemaCompensationRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedTotalCompensationRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnualizedTotalCompensationRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedTotalCompensationRange")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: js.Array[SchemaCompensationEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
  }
  
}

