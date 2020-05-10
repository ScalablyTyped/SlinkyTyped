package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackComplianceSummary extends js.Object {
  /**
    * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT. 
    */
  var ConformancePackComplianceStatus: ConformancePackComplianceType = js.native
  /**
    * The name of the conformance pack name.
    */
  var ConformancePackName: typingsSlinky.awsSdk.configserviceMod.ConformancePackName = js.native
}

object ConformancePackComplianceSummary {
  @scala.inline
  def apply(
    ConformancePackComplianceStatus: ConformancePackComplianceType,
    ConformancePackName: ConformancePackName
  ): ConformancePackComplianceSummary = {
    val __obj = js.Dynamic.literal(ConformancePackComplianceStatus = ConformancePackComplianceStatus.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackComplianceSummary]
  }
  @scala.inline
  implicit class ConformancePackComplianceSummaryOps[Self <: ConformancePackComplianceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackComplianceStatus(value: ConformancePackComplianceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackComplianceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackName(value: ConformancePackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

