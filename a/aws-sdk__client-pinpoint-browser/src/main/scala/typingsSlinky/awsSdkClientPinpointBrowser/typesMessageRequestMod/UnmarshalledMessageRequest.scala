package typingsSlinky.awsSdkClientPinpointBrowser.typesMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesAddressConfigurationMod.UnmarshalledAddressConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.UnmarshalledDirectMessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.UnmarshalledEndpointSendConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMessageRequest extends MessageRequest {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
    */
  @JSName("Addresses")
  var Addresses_UnmarshalledMessageRequest: js.UndefOr[StringDictionary[UnmarshalledAddressConfiguration]] = js.native
  /**
    * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  @JSName("Context")
  var Context_UnmarshalledMessageRequest: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
    */
  @JSName("Endpoints")
  var Endpoints_UnmarshalledMessageRequest: js.UndefOr[StringDictionary[UnmarshalledEndpointSendConfiguration]] = js.native
  /**
    * Message configuration.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledMessageRequest: js.UndefOr[UnmarshalledDirectMessageConfiguration] = js.native
}

object UnmarshalledMessageRequest {
  @scala.inline
  def apply(): UnmarshalledMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMessageRequest]
  }
  @scala.inline
  implicit class UnmarshalledMessageRequestOps[Self <: UnmarshalledMessageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: StringDictionary[UnmarshalledAddressConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: StringDictionary[UnmarshalledEndpointSendConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageConfiguration(value: UnmarshalledDirectMessageConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(js.undefined)
        ret
    }
  }
  
}

