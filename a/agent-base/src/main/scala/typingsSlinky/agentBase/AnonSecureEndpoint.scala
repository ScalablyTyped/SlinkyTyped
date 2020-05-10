package typingsSlinky.agentBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSecureEndpoint extends js.Object {
  var secureEndpoint: Boolean = js.native
}

object AnonSecureEndpoint {
  @scala.inline
  def apply(secureEndpoint: Boolean): AnonSecureEndpoint = {
    val __obj = js.Dynamic.literal(secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSecureEndpoint]
  }
  @scala.inline
  implicit class AnonSecureEndpointOps[Self <: AnonSecureEndpoint] (val x: Self) extends AnyVal {
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

