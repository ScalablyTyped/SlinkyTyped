package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsUpdateMembershipParams extends js.Object {
  @JSName("org")
  var org_ : String = js.native
  /**
    * The state that the membership should be in. Only `"active"` will be accepted.
    */
  var state: active = js.native
}

object OrgsUpdateMembershipParams {
  @scala.inline
  def apply(org_ : String, state: active): OrgsUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipParams]
  }
  @scala.inline
  implicit class OrgsUpdateMembershipParamsOps[Self <: OrgsUpdateMembershipParams] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withState(value: active): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

