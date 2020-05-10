package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Job compensation details.
  */
@js.native
trait SchemaCompensationInfo extends js.Object {
  /**
    * Deprecated. Use entries instead.  Optional.  The amount of compensation
    * or pay for the job. As an alternative, compensation_amount_min and
    * compensation_amount_max may be used to define a range of compensation.
    */
  var amount: js.UndefOr[SchemaMoney] = js.native
  /**
    * Output only.  Annualized base compensation range. Computed as base
    * compensation entry&#39;s CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Output only.  Annualized total compensation range. Computed as all
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
  /**
    * Deprecated. Use entries instead.  Optional.  An upper bound on a range
    * for compensation or pay for the job. The currency type is specified in
    * compensation_amount.
    */
  var max: js.UndefOr[SchemaMoney] = js.native
  /**
    * Deprecated. Use entries instead.  Optional.  A lower bound on a range for
    * compensation or pay for the job. The currency type is specified in
    * compensation_amount.
    */
  var min: js.UndefOr[SchemaMoney] = js.native
  /**
    * Deprecated. Use entries instead.  Optional.  Type of job compensation.
    */
  var `type`: js.UndefOr[String] = js.native
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
    def withAmount(value: SchemaMoney): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
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
    @scala.inline
    def withMax(value: SchemaMoney): Self = {
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
    def withMin(value: SchemaMoney): Self = {
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

