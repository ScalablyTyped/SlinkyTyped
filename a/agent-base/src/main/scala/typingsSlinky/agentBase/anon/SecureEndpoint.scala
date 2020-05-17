package typingsSlinky.agentBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureEndpoint extends js.Object {
  var secureEndpoint: Boolean = js.native
}

object SecureEndpoint {
  @scala.inline
  def apply(secureEndpoint: Boolean): SecureEndpoint = {
    val __obj = js.Dynamic.literal(secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureEndpoint]
  }
  @scala.inline
  implicit class SecureEndpointOps[Self <: SecureEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecureEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

