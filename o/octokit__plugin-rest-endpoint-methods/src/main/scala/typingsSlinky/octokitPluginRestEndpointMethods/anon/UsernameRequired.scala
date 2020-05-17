package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsernameRequired extends js.Object {
  var username: Required = js.native
}

object UsernameRequired {
  @scala.inline
  def apply(username: Required): UsernameRequired = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsernameRequired]
  }
  @scala.inline
  implicit class UsernameRequiredOps[Self <: UsernameRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsername(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

