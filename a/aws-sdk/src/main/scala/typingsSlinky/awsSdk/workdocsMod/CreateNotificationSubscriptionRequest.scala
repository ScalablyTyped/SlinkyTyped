package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationSubscriptionRequest extends js.Object {
  /**
    * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with https.
    */
  var Endpoint: SubscriptionEndPointType = js.native
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType = js.native
  /**
    * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
    */
  var Protocol: SubscriptionProtocolType = js.native
  /**
    * The notification type.
    */
  var SubscriptionType: typingsSlinky.awsSdk.workdocsMod.SubscriptionType = js.native
}

object CreateNotificationSubscriptionRequest {
  @scala.inline
  def apply(
    Endpoint: SubscriptionEndPointType,
    OrganizationId: IdType,
    Protocol: SubscriptionProtocolType,
    SubscriptionType: SubscriptionType
  ): CreateNotificationSubscriptionRequest = {
    val __obj = js.Dynamic.literal(Endpoint = Endpoint.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationSubscriptionRequest]
  }
  @scala.inline
  implicit class CreateNotificationSubscriptionRequestOps[Self <: CreateNotificationSubscriptionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: SubscriptionEndPointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: SubscriptionProtocolType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionType(value: SubscriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

