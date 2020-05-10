package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOrgAnonRequired extends js.Object {
  var org: AnonRequired = js.native
}

object AnonOrgAnonRequired {
  @scala.inline
  def apply(org: AnonRequired): AnonOrgAnonRequired = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrgAnonRequired]
  }
  @scala.inline
  implicit class AnonOrgAnonRequiredOps[Self <: AnonOrgAnonRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

