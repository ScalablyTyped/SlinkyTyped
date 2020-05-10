package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicEndpoint extends js.Object {
  /**
    * The unique identifier for the recipient, such as a device token, email address, or mobile phone number.
    */
  var Address: js.UndefOr[string] = js.native
  /**
    * One or more custom attributes that describe the endpoint by associating a name with an array of values. You can use these attributes as filter criteria when you create segments.
    */
  var Attributes: js.UndefOr[MapOfListOfString] = js.native
  /**
    * The channel that's used when sending messages or push notifications to the endpoint.
    */
  var ChannelType: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.ChannelType] = js.native
  /**
    * The demographic information for the endpoint, such as the time zone and platform.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.native
  /**
    * The date and time, in ISO 8601 format, when the endpoint was last updated.
    */
  var EffectiveDate: js.UndefOr[string] = js.native
  /**
    * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint. Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the same address specified by the Address property.
    */
  var EndpointStatus: js.UndefOr[string] = js.native
  /**
    * The geographic information for the endpoint.
    */
  var Location: js.UndefOr[EndpointLocation] = js.native
  /**
    * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.native
  /**
    * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push notifications.
    */
  var OptOut: js.UndefOr[string] = js.native
  /**
    * A unique identifier that's generated each time the endpoint is updated.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with the endpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.native
}

object PublicEndpoint {
  @scala.inline
  def apply(): PublicEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicEndpoint]
  }
  @scala.inline
  implicit class PublicEndpointOps[Self <: PublicEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: string): Self = {
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
    def withAttributes(value: MapOfListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelType(value: ChannelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelType")(js.undefined)
        ret
    }
    @scala.inline
    def withDemographic(value: EndpointDemographic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Demographic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemographic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Demographic")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointStatus(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: EndpointLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: MapOfDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withOptOut(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: EndpointUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(js.undefined)
        ret
    }
  }
  
}

