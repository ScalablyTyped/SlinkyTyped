package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGpgkeyid extends js.Object {
  var gpg_key_id: AnonRequired = js.native
}

object AnonGpgkeyid {
  @scala.inline
  def apply(gpg_key_id: AnonRequired): AnonGpgkeyid = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGpgkeyid]
  }
  @scala.inline
  implicit class AnonGpgkeyidOps[Self <: AnonGpgkeyid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGpg_key_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpg_key_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

