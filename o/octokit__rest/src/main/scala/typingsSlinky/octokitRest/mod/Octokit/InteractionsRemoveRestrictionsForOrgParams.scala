package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionsRemoveRestrictionsForOrgParams extends js.Object {
  @JSName("org")
  var org_ : String = js.native
}

object InteractionsRemoveRestrictionsForOrgParams {
  @scala.inline
  def apply(org_ : String): InteractionsRemoveRestrictionsForOrgParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsRemoveRestrictionsForOrgParams]
  }
  @scala.inline
  implicit class InteractionsRemoveRestrictionsForOrgParamsOps[Self <: InteractionsRemoveRestrictionsForOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

