package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DUPLICATE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPT_OUT
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PERMANENT_FAILURE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SUCCESSFUL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TEMPORARY_FAILURE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.THROTTLED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.UNKNOWN_FAILURE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointMessageResult extends js.Object {
  /**
    * Address that endpoint message was delivered to.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The delivery status of the message. Possible values:
    *
    * SUCCESS - The message was successfully delivered to the endpoint.
    *
    * TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later.
    *
    * FAILURE_PERMANENT - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.
    *
    * TIMEOUT - The message couldn't be sent within the timeout period.
    *
    * QUIET_TIME - The local time for the endpoint was within the Quiet Hours for the campaign.
    *
    * DAILY_CAP - The endpoint has received the maximum number of messages it can receive within a 24-hour period.
    *
    * HOLDOUT - The endpoint was in a hold out treatment for the campaign.
    *
    * THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
    *
    * EXPIRED - The endpoint address is expired.
    *
    * CAMPAIGN_CAP - The endpoint received the maximum number of messages allowed by the campaign.
    *
    * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from delivering the message.
    *
    * UNKNOWN - An unknown error occurred.
    */
  var DeliveryStatus: js.UndefOr[
    SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String
  ] = js.native
  /**
    * Unique message identifier associated with the message that was sent.
    */
  var MessageId: js.UndefOr[String] = js.native
  /**
    * Downstream service status code.
    */
  var StatusCode: js.UndefOr[Double] = js.native
  /**
    * Status message for message delivery.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * If token was updated as part of delivery. (This is GCM Specific)
    */
  var UpdatedToken: js.UndefOr[String] = js.native
}

object EndpointMessageResult {
  @scala.inline
  def apply(): EndpointMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointMessageResult]
  }
  @scala.inline
  implicit class EndpointMessageResultOps[Self <: EndpointMessageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryStatus(
      value: SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedToken")(js.undefined)
        ret
    }
  }
  
}

