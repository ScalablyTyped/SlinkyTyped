package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesAttributeDimensionMod.UnmarshalledAttributeDimension
import typingsSlinky.awsSdkClientPinpointBrowser.typesMetricDimensionMod.UnmarshalledMetricDimension
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod.UnmarshalledSegmentBehaviors
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod.UnmarshalledSegmentDemographics
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentLocationMod.UnmarshalledSegmentLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentDimensions extends SegmentDimensions {
  /**
    * Custom segment attributes.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledAttributeDimension]] = js.native
  /**
    * The segment behaviors attributes.
    */
  @JSName("Behavior")
  var Behavior_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentBehaviors] = js.native
  /**
    * The segment demographics attributes.
    */
  @JSName("Demographic")
  var Demographic_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentDemographics] = js.native
  /**
    * The segment location attributes.
    */
  @JSName("Location")
  var Location_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentLocation] = js.native
  /**
    * Custom segment metrics.
    */
  @JSName("Metrics")
  var Metrics_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledMetricDimension]] = js.native
  /**
    * Custom segment user attributes.
    */
  @JSName("UserAttributes")
  var UserAttributes_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledAttributeDimension]] = js.native
}

object UnmarshalledSegmentDimensions {
  @scala.inline
  def apply(): UnmarshalledSegmentDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentDimensions]
  }
  @scala.inline
  implicit class UnmarshalledSegmentDimensionsOps[Self <: UnmarshalledSegmentDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[UnmarshalledAttributeDimension]): Self = {
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
    def withBehavior(value: UnmarshalledSegmentBehaviors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDemographic(value: UnmarshalledSegmentDemographics): Self = {
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
    def withLocation(value: UnmarshalledSegmentLocation): Self = {
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
    def withMetrics(value: StringDictionary[UnmarshalledMetricDimension]): Self = {
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
    def withUserAttributes(value: StringDictionary[UnmarshalledAttributeDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAttributes")(js.undefined)
        ret
    }
  }
  
}

