package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ADM
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_SANDBOX
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP_SANDBOX
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.BAIDU
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CUSTOM
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EMAIL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.GCM
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SMS
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.EndpointDemographic
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointLocationMod.EndpointLocation
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointUserMod.EndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointRequest extends js.Object {
  /**
    * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push channels, use the token provided by the push notification service, such as the APNs device token or the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
    *
    * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
    */
  var Attributes: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.native
  /**
    * The channel type.
    *
    * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
    */
  var ChannelType: js.UndefOr[
    GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
  ] = js.native
  /**
    * Demographic attributes for the endpoint.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.native
  /**
    * The date and time when the endpoint was updated, shown in ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[String] = js.native
  /**
    * Unused.
    */
  var EndpointStatus: js.UndefOr[String] = js.native
  /**
    * The endpoint location attributes.
    */
  var Location: js.UndefOr[EndpointLocation] = js.native
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  var Metrics: js.UndefOr[StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]])] = js.native
  /**
    * Indicates whether a user has opted out of receiving messages with one of the following values:
    *
    * ALL - User has opted out of all messages.
    *
    * NONE - Users has not opted out and receives all messages.
    */
  var OptOut: js.UndefOr[String] = js.native
  /**
    * The unique ID for the most recent request to update the endpoint.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.native
}

object EndpointRequest {
  @scala.inline
  def apply(): EndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointRequest]
  }
  @scala.inline
  implicit class EndpointRequestOps[Self <: EndpointRequest] (val x: Self) extends AnyVal {
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
    def withAttributesIterable(value: js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(
      value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
    ): Self = {
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
    def withChannelType(
      value: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
    ): Self = {
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
    def withEffectiveDate(value: String): Self = {
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
    def withEndpointStatus(value: String): Self = {
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
    def withMetricsIterable(value: js.Iterable[js.Tuple2[String, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]])): Self = {
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
    def withOptOut(value: String): Self = {
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
    def withRequestId(value: String): Self = {
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

