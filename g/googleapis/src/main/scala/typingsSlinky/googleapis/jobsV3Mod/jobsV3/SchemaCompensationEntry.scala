package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A compensation entry that represents one component of compensation, such as
  * base pay, bonus, or other compensation type.  Annualization: One
  * compensation entry can be annualized if - it contains valid amount or
  * range. - and its expected_units_per_year is set or can be derived. Its
  * annualized range is determined as (amount or range) times
  * expected_units_per_year.
  */
@js.native
trait SchemaCompensationEntry extends js.Object {
  /**
    * Optional.  Compensation amount.
    */
  var amount: js.UndefOr[SchemaMoney] = js.native
  /**
    * Optional.  Compensation description.  For example, could indicate equity
    * terms or provide additional context to an estimated bonus.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional.  Expected number of units paid each year. If not specified,
    * when Job.employment_types is FULLTIME, a default value is inferred based
    * on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 -
    * MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[Double] = js.native
  /**
    * Optional.  Compensation range.
    */
  var range: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Optional.  Compensation type.  Default is
    * CompensationUnit.OTHER_COMPENSATION_TYPE.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Optional.  Frequency of the specified amount.  Default is
    * CompensationUnit.OTHER_COMPENSATION_UNIT.
    */
  var unit: js.UndefOr[String] = js.native
}

object SchemaCompensationEntry {
  @scala.inline
  def apply(): SchemaCompensationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationEntry]
  }
  @scala.inline
  implicit class SchemaCompensationEntryOps[Self <: SchemaCompensationEntry] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedUnitsPerYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedUnitsPerYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedUnitsPerYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedUnitsPerYear")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: SchemaCompensationRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
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
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

