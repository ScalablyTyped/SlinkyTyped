package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatIntelligenceDetail extends js.Object {
  /**
    * The name of the threat intelligence list that triggered the finding.
    */
  var ThreatListName: js.UndefOr[String] = js.native
  /**
    * A list of names of the threats in the threat intelligence list that triggered the finding.
    */
  var ThreatNames: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ThreatNames] = js.native
}

object ThreatIntelligenceDetail {
  @scala.inline
  def apply(): ThreatIntelligenceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelligenceDetail]
  }
  @scala.inline
  implicit class ThreatIntelligenceDetailOps[Self <: ThreatIntelligenceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreatListName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatListName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatListName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatListName")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatNames(value: ThreatNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatNames")(js.undefined)
        ret
    }
  }
  
}

