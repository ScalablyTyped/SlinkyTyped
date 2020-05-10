package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHookid extends js.Object {
  var hook_id: AnonRequired = js.native
  var org: AnonRequired = js.native
}

object AnonHookid {
  @scala.inline
  def apply(hook_id: AnonRequired, org: AnonRequired): AnonHookid = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHookid]
  }
  @scala.inline
  implicit class AnonHookidOps[Self <: AnonHookid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHook_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

