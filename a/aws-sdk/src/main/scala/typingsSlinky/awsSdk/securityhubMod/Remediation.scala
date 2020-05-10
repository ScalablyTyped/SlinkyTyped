package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remediation extends js.Object {
  /**
    * A recommendation on the steps to take to remediate the issue identified by a finding.
    */
  var Recommendation: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.Recommendation] = js.native
}

object Remediation {
  @scala.inline
  def apply(): Remediation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remediation]
  }
  @scala.inline
  implicit class RemediationOps[Self <: Remediation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecommendation(value: Recommendation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recommendation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recommendation")(js.undefined)
        ret
    }
  }
  
}

