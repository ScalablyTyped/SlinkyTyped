package typingsSlinky.awsSdkClientPinpointBrowser

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
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.UnmarshalledEndpointDemographic
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointLocationMod.EndpointLocation
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointLocationMod.UnmarshalledEndpointLocation
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointUserMod.EndpointUser
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointUserMod.UnmarshalledEndpointUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPublicEndpointMod {
  
  @js.native
  trait PublicEndpoint extends StObject {
    
    /**
      * The unique identifier for the recipient. For example, an address could be a device token, email address, or mobile phone number.
      */
    var Address: js.UndefOr[String] = js.native
    
    /**
      * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create a segment.
      */
    var Attributes: js.UndefOr[
        (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ] = js.native
    
    /**
      * The channel type.
      *
      * Valid values: APNS, GCM
      */
    var ChannelType: js.UndefOr[
        GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ] = js.native
    
    /**
      * The endpoint demographic attributes.
      */
    var Demographic: js.UndefOr[EndpointDemographic] = js.native
    
    /**
      * The date and time when the endpoint was last updated, in  ISO 8601 format.
      */
    var EffectiveDate: js.UndefOr[String] = js.native
    
    /**
      * The status of the endpoint. If the update fails, the value is INACTIVE. If the endpoint is updated successfully, the value is ACTIVE.
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
      * A unique identifier that is generated each time the endpoint is updated.
      */
    var RequestId: js.UndefOr[String] = js.native
    
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
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
    implicit class PublicEndpointMutableBuilder[Self <: PublicEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
      
      @scala.inline
      def setAttributes(
        value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesIterable(value: js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setChannelType(
        value: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
      ): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
      
      @scala.inline
      def setDemographic(value: EndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      @scala.inline
      def setEffectiveDate(value: String): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveDateUndefined: Self = StObject.set(x, "EffectiveDate", js.undefined)
      
      @scala.inline
      def setEndpointStatus(value: String): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
      
      @scala.inline
      def setLocation(value: EndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]])): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsIterable(value: js.Iterable[js.Tuple2[String, Double]]): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setOptOut(value: String): Self = StObject.set(x, "OptOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptOutUndefined: Self = StObject.set(x, "OptOut", js.undefined)
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      @scala.inline
      def setUser(value: EndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledPublicEndpoint extends PublicEndpoint {
    
    /**
      * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create a segment.
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledPublicEndpoint: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
    
    /**
      * The endpoint demographic attributes.
      */
    @JSName("Demographic")
    var Demographic_UnmarshalledPublicEndpoint: js.UndefOr[UnmarshalledEndpointDemographic] = js.native
    
    /**
      * The endpoint location attributes.
      */
    @JSName("Location")
    var Location_UnmarshalledPublicEndpoint: js.UndefOr[UnmarshalledEndpointLocation] = js.native
    
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    @JSName("Metrics")
    var Metrics_UnmarshalledPublicEndpoint: js.UndefOr[StringDictionary[Double]] = js.native
    
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    @JSName("User")
    var User_UnmarshalledPublicEndpoint: js.UndefOr[UnmarshalledEndpointUser] = js.native
  }
  object UnmarshalledPublicEndpoint {
    
    @scala.inline
    def apply(): UnmarshalledPublicEndpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPublicEndpoint]
    }
    
    @scala.inline
    implicit class UnmarshalledPublicEndpointMutableBuilder[Self <: UnmarshalledPublicEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setDemographic(value: UnmarshalledEndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      @scala.inline
      def setLocation(value: UnmarshalledEndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double]): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setUser(value: UnmarshalledEndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    }
  }
}
