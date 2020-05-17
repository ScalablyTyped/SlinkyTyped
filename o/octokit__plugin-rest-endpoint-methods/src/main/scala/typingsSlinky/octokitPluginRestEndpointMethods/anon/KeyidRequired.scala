package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyidRequired extends js.Object {
  var key_id: Required = js.native
}

object KeyidRequired {
  @scala.inline
  def apply(key_id: Required): KeyidRequired = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyidRequired]
  }
  @scala.inline
  implicit class KeyidRequiredOps[Self <: KeyidRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

