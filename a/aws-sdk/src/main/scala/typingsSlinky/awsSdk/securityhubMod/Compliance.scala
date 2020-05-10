package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compliance extends js.Object {
  /**
    * List of requirements that are related to a standards control.
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.native
  /**
    * The result of a standards check.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
}

object Compliance {
  @scala.inline
  def apply(): Compliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compliance]
  }
  @scala.inline
  implicit class ComplianceOps[Self <: Compliance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelatedRequirements(value: RelatedRequirementsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedRequirements")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ComplianceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

