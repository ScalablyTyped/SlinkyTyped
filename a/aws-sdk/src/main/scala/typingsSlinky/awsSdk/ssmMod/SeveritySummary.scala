package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeveritySummary extends js.Object {
  /**
    * The total number of resources or compliance items that have a severity level of critical. Critical severity is determined by the organization that published the compliance items.
    */
  var CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of high. High severity is determined by the organization that published the compliance items.
    */
  var HighCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of informational. Informational severity is determined by the organization that published the compliance items.
    */
  var InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of low. Low severity is determined by the organization that published the compliance items.
    */
  var LowCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of medium. Medium severity is determined by the organization that published the compliance items.
    */
  var MediumCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity is determined by the organization that published the compliance items.
    */
  var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.native
}

object SeveritySummary {
  @scala.inline
  def apply(): SeveritySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeveritySummary]
  }
  @scala.inline
  implicit class SeveritySummaryOps[Self <: SeveritySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriticalCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CriticalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriticalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CriticalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHighCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInformationalCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InformationalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInformationalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InformationalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLowCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMediumCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediumCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediumCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediumCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnspecifiedCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnspecifiedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnspecifiedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnspecifiedCount")(js.undefined)
        ret
    }
  }
  
}

