package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  var agentLogin: String = js.native
  var endpointARN: String = js.native
  var endpointId: String = js.native
  var name: String = js.native
  var phoneNumber: String = js.native
  var queue: String = js.native
  var `type`: EndpointType = js.native
}

object Endpoint {
  @scala.inline
  def apply(
    agentLogin: String,
    endpointARN: String,
    endpointId: String,
    name: String,
    phoneNumber: String,
    queue: String,
    `type`: EndpointType
  ): Endpoint = {
    val __obj = js.Dynamic.literal(agentLogin = agentLogin.asInstanceOf[js.Any], endpointARN = endpointARN.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

