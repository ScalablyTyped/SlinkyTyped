package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evidence extends js.Object {
  /**
    * A list of threat intelligence details related to the evidence.
    */
  var ThreatIntelligenceDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ThreatIntelligenceDetails] = js.native
}

object Evidence {
  @scala.inline
  def apply(): Evidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evidence]
  }
  @scala.inline
  implicit class EvidenceOps[Self <: Evidence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreatIntelligenceDetails(value: ThreatIntelligenceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelligenceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatIntelligenceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelligenceDetails")(js.undefined)
        ret
    }
  }
  
}

