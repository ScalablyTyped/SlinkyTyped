package typingsSlinky.awsSdkClientPinpointBrowser.typesPublicEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.UnmarshalledEndpointDemographic
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointLocationMod.UnmarshalledEndpointLocation
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointUserMod.UnmarshalledEndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class UnmarshalledPublicEndpointOps[Self <: UnmarshalledPublicEndpoint] (val x: Self) extends AnyVal {
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

