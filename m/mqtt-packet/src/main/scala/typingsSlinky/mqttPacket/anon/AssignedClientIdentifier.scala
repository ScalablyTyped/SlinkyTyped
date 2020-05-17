package typingsSlinky.mqttPacket.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignedClientIdentifier extends js.Object {
  var assignedClientIdentifier: js.UndefOr[String] = js.native
  var authenticationData: js.UndefOr[Buffer] = js.native
  var authenticationMethod: js.UndefOr[String] = js.native
  var maximumPacketSize: js.UndefOr[Double] = js.native
  var maximumQoS: js.UndefOr[Double] = js.native
  var reasonString: js.UndefOr[String] = js.native
  var receiveMaximum: js.UndefOr[Double] = js.native
  var responseInformation: js.UndefOr[String] = js.native
  var retainAvailable: js.UndefOr[Boolean] = js.native
  var serverKeepAlive: js.UndefOr[Double] = js.native
  var serverReference: js.UndefOr[String] = js.native
  var sessionExpiryInterval: js.UndefOr[Double] = js.native
  var sharedSubscriptionAvailable: js.UndefOr[Boolean] = js.native
  var subscriptionIdentifiersAvailable: js.UndefOr[Boolean] = js.native
  var topicAliasMaximum: js.UndefOr[Double] = js.native
  var userProperties: js.UndefOr[js.Object] = js.native
  var wildcardSubscriptionAvailable: js.UndefOr[Boolean] = js.native
}

object AssignedClientIdentifier {
  @scala.inline
  def apply(): AssignedClientIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedClientIdentifier]
  }
  @scala.inline
  implicit class AssignedClientIdentifierOps[Self <: AssignedClientIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedClientIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedClientIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedClientIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedClientIdentifier")(js.undefined)
        ret
    }
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
    def withMaximumQoS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumQoS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumQoS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumQoS")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonString")(js.undefined)
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
    def withResponseInformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withServerKeepAlive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverKeepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverKeepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withServerReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReference")(js.undefined)
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
    def withSharedSubscriptionAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedSubscriptionAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedSubscriptionAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedSubscriptionAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionIdentifiersAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionIdentifiersAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionIdentifiersAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionIdentifiersAvailable")(js.undefined)
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
    @scala.inline
    def withWildcardSubscriptionAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardSubscriptionAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcardSubscriptionAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardSubscriptionAvailable")(js.undefined)
        ret
    }
  }
  
}

