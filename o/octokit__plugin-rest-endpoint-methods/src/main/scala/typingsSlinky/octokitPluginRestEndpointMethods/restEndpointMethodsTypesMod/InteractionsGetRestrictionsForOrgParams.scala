package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionsGetRestrictionsForOrgParams extends js.Object {
  @JSName("org")
  var org_ : String = js.native
}

object InteractionsGetRestrictionsForOrgParams {
  @scala.inline
  def apply(org_ : String): InteractionsGetRestrictionsForOrgParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForOrgParams]
  }
  @scala.inline
  implicit class InteractionsGetRestrictionsForOrgParamsOps[Self <: InteractionsGetRestrictionsForOrgParams] (val x: Self) extends AnyVal {
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

