package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsResponse extends js.Object {
  /**
    * A list of findings.
    */
  var Findings: typingsSlinky.awsSdk.guarddutyMod.Findings = js.native
}

object GetFindingsResponse {
  @scala.inline
  def apply(Findings: Findings): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsResponse]
  }
  @scala.inline
  implicit class GetFindingsResponseOps[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindings(value: Findings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Findings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

