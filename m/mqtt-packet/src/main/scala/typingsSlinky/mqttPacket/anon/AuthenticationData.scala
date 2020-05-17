package typingsSlinky.mqttPacket.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationData extends js.Object {
  var authenticationData: js.UndefOr[Buffer] = js.native
  var authenticationMethod: js.UndefOr[String] = js.native
  var maximumPacketSize: js.UndefOr[Double] = js.native
  var receiveMaximum: js.UndefOr[Double] = js.native
  var requestProblemInformation: js.UndefOr[Boolean] = js.native
  var requestResponseInformation: js.UndefOr[Boolean] = js.native
  var sessionExpiryInterval: js.UndefOr[Double] = js.native
  var topicAliasMaximum: js.UndefOr[Double] = js.native
  var userProperties: js.UndefOr[js.Object] = js.native
}

object AuthenticationData {
  @scala.inline
  def apply(): AuthenticationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationData]
  }
  @scala.inline
  implicit class AuthenticationDataOps[Self <: AuthenticationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationData")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticationMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumPacketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPacketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPacketSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPacketSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiveMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiveMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestProblemInformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProblemInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestProblemInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProblemInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestResponseInformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestResponseInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestResponseInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestResponseInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionExpiryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionExpiryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionExpiryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionExpiryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicAliasMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicAliasMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicAliasMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicAliasMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperties")(js.undefined)
        ret
    }
  }
  
}

