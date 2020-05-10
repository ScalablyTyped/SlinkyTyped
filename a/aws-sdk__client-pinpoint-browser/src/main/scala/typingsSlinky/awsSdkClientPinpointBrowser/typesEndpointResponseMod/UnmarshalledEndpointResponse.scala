package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.UnmarshalledEndpointDemographic
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointLocationMod.UnmarshalledEndpointLocation
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointUserMod.UnmarshalledEndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEndpointResponse extends EndpointResponse {
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    *
    * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledEndpointResponse: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * The endpoint demographic attributes.
    */
  @JSName("Demographic")
  var Demographic_UnmarshalledEndpointResponse: js.UndefOr[UnmarshalledEndpointDemographic] = js.native
  /**
    * The endpoint location attributes.
    */
  @JSName("Location")
  var Location_UnmarshalledEndpointResponse: js.UndefOr[UnmarshalledEndpointLocation] = js.native
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  @JSName("Metrics")
  var Metrics_UnmarshalledEndpointResponse: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  @JSName("User")
  var User_UnmarshalledEndpointResponse: js.UndefOr[UnmarshalledEndpointUser] = js.native
}

object UnmarshalledEndpointResponse {
  @scala.inline
  def apply(): UnmarshalledEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointResponse]
  }
  @scala.inline
  implicit class UnmarshalledEndpointResponseOps[Self <: UnmarshalledEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[js.Array[String]]): Self = {
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
    def withDemographic(value: UnmarshalledEndpointDemographic): Self = {
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
    def withLocation(value: UnmarshalledEndpointLocation): Self = {
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
    def withMetrics(value: StringDictionary[Double]): Self = {
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
    def withUser(value: UnmarshalledEndpointUser): Self = {
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

