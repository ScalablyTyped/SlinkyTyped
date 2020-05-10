package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Always use CompensationFilter.  Input only.  Filter on job
  * compensation type and amount.
  */
@js.native
trait SchemaExtendedCompensationFilter extends js.Object {
  /**
    * Optional.  Compensation range.
    */
  var compensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  /**
    * Required.  Specify desired `base compensation entry&#39;s`
    * ExtendedCompensationInfo.CompensationUnit.
    */
  var compensationUnits: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  Specify currency in 3-letter [ISO
    * 4217](https://www.iso.org/iso-4217-currency-codes.html) format. If
    * unspecified, jobs are returned regardless of currency.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Optional.  Whether to include jobs whose compensation range is
    * unspecified.
    */
  var includeJobWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.native
  /**
    * Required.  Type of filter.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaExtendedCompensationFilter {
  @scala.inline
  def apply(): SchemaExtendedCompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationFilter]
  }
  @scala.inline
  implicit class SchemaExtendedCompensationFilterOps[Self <: SchemaExtendedCompensationFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompensationRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationRange")(js.undefined)
        ret
    }
    @scala.inline
    def withCompensationUnits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompensationUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeJobWithUnspecifiedCompensationRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobWithUnspecifiedCompensationRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeJobWithUnspecifiedCompensationRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobWithUnspecifiedCompensationRange")(js.undefined)
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

