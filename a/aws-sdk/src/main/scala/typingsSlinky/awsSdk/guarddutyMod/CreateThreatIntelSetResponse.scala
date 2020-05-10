package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThreatIntelSetResponse extends js.Object {
  /**
    * The ID of the ThreatIntelSet resource.
    */
  var ThreatIntelSetId: String = js.native
}

object CreateThreatIntelSetResponse {
  @scala.inline
  def apply(ThreatIntelSetId: String): CreateThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThreatIntelSetResponse]
  }
  @scala.inline
  implicit class CreateThreatIntelSetResponseOps[Self <: CreateThreatIntelSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreatIntelSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

