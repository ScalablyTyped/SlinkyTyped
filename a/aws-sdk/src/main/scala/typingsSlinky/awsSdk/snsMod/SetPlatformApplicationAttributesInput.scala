package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetPlatformApplicationAttributesInput extends js.Object {
  /**
    * A map of the platform application attributes. Attributes in this map include the following:    PlatformCredential – The credential received from the notification service. For APNS/APNS_SANDBOX, PlatformCredential is private key. For FCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret".    PlatformPrincipal – The principal received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL certificate. For FCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id".    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.    SuccessFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    FailureFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    SuccessFeedbackSampleRate – Sample rate percentage (0-100) of successfully delivered messages.  
    */
  var Attributes: MapStringToString = js.native
  /**
    * PlatformApplicationArn for SetPlatformApplicationAttributes action.
    */
  var PlatformApplicationArn: String = js.native
}

object SetPlatformApplicationAttributesInput {
  @scala.inline
  def apply(Attributes: MapStringToString, PlatformApplicationArn: String): SetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPlatformApplicationAttributesInput]
  }
  @scala.inline
  implicit class SetPlatformApplicationAttributesInputOps[Self <: SetPlatformApplicationAttributesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: MapStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformApplicationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplicationArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

