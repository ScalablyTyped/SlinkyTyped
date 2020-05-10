package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use CompensationInfo.  Describes job compensation.
  */
@js.native
trait SchemaExtendedCompensationInfo extends js.Object {
  /**
    * Output only.  Annualized base compensation range.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  /**
    * Output only.  Indicates annualized base compensation range cannot be
    * derived, due to the job&#39;s base compensation entry cannot be
    * annualized. See CompensationEntry for explanation on annualization and
    * base compensation entry.
    */
  var annualizedBaseCompensationUnspecified: js.UndefOr[Boolean] = js.native
  /**
    * Output only.  Annualized total compensation range.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  /**
    * Output only.  Indicates annualized total compensation range cannot be
    * derived, due to the job&#39;s all CompensationEntry cannot be annualized.
    * See CompensationEntry for explanation on annualization and base
    * compensation entry.
    */
  var annualizedTotalCompensationUnspecified: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  A 3-letter [ISO
    * 4217](https://www.iso.org/iso-4217-currency-codes.html) currency code.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Optional.  Job compensation information.  At most one entry can be of
    * type ExtendedCompensationInfo.CompensationType.BASE, which is referred as
    * ** base compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaExtendedCompensationInfoCompensationEntry]] = js.native
}

object SchemaExtendedCompensationInfo {
  @scala.inline
  def apply(): SchemaExtendedCompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfo]
  }
  @scala.inline
  implicit class SchemaExtendedCompensationInfoOps[Self <: SchemaExtendedCompensationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnualizedBaseCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = {
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
    def withAnnualizedBaseCompensationUnspecified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedBaseCompensationUnspecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnualizedBaseCompensationUnspecified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedBaseCompensationUnspecified")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnualizedTotalCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = {
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
    def withAnnualizedTotalCompensationUnspecified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedTotalCompensationUnspecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnualizedTotalCompensationUnspecified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annualizedTotalCompensationUnspecified")(js.undefined)
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
    def withEntries(value: js.Array[SchemaExtendedCompensationInfoCompensationEntry]): Self = {
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

