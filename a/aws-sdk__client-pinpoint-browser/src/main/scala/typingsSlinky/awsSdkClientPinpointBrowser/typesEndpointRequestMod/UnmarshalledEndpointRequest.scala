package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.UnmarshalledEndpointDemographic
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointLocationMod.UnmarshalledEndpointLocation
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointUserMod.UnmarshalledEndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledEndpointRequest extends EndpointRequest {
  
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
    *
    * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledEndpointRequest: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  /**
    * Demographic attributes for the endpoint.
    */
  @JSName("Demographic")
  var Demographic_UnmarshalledEndpointRequest: js.UndefOr[UnmarshalledEndpointDemographic] = js.native
  
  /**
    * The endpoint location attributes.
    */
  @JSName("Location")
  var Location_UnmarshalledEndpointRequest: js.UndefOr[UnmarshalledEndpointLocation] = js.native
  
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  @JSName("Metrics")
  var Metrics_UnmarshalledEndpointRequest: js.UndefOr[StringDictionary[Double]] = js.native
  
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  @JSName("User")
  var User_UnmarshalledEndpointRequest: js.UndefOr[UnmarshalledEndpointUser] = js.native
}
object UnmarshalledEndpointRequest {
  
  @scala.inline
  def apply(): UnmarshalledEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointRequest]
  }
  
  @scala.inline
  implicit class UnmarshalledEndpointRequestOps[Self <: UnmarshalledEndpointRequest] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[js.Array[String]]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setDemographic(value: UnmarshalledEndpointDemographic): Self = this.set("Demographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemographic: Self = this.set("Demographic", js.undefined)
    
    @scala.inline
    def setLocation(value: UnmarshalledEndpointLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setMetrics(value: StringDictionary[Double]): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setUser(value: UnmarshalledEndpointUser): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
