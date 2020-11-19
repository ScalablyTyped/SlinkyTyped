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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setAttributesIterable(value: js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(
      value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
    ): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setChannelType(
      value: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
    ): Self = this.set("ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("ChannelType", js.undefined)
    
    @scala.inline
    def setDemographic(value: EndpointDemographic): Self = this.set("Demographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemographic: Self = this.set("Demographic", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: String): Self = this.set("EffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDate: Self = this.set("EffectiveDate", js.undefined)
    
    @scala.inline
    def setEndpointStatus(value: String): Self = this.set("EndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointStatus: Self = this.set("EndpointStatus", js.undefined)
    
    @scala.inline
    def setLocation(value: EndpointLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setMetricsIterable(value: js.Iterable[js.Tuple2[String, Double]]): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]])): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setOptOut(value: String): Self = this.set("OptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptOut: Self = this.set("OptOut", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setUser(value: EndpointUser): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
