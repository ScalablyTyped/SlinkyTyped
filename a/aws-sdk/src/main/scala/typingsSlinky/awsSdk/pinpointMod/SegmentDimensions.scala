package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDimensions extends js.Object {
  /**
    * One or more custom attributes to use as criteria for the segment.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.native
  /**
    * The behavior-based criteria, such as how recently users have used your app, for the segment.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.native
  /**
    * The demographic-based criteria, such as device platform, for the segment.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.native
  /**
    * The location-based criteria, such as region or GPS coordinates, for the segment.
    */
  var Location: js.UndefOr[SegmentLocation] = js.native
  /**
    * One or more custom metrics to use as criteria for the segment.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.native
  /**
    * One or more custom user attributes to use as criteria for the segment.
    */
  var UserAttributes: js.UndefOr[MapOfAttributeDimension] = js.native
}

object SegmentDimensions {
  @scala.inline
  def apply(): SegmentDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDimensions]
  }
  @scala.inline
  implicit class SegmentDimensionsOps[Self <: SegmentDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: MapOfAttributeDimension): Self = {
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
    def withBehavior(value: SegmentBehaviors): Self = {
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
    def withDemographic(value: SegmentDemographics): Self = {
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
    def withLocation(value: SegmentLocation): Self = {
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
    def withMetrics(value: MapOfMetricDimension): Self = {
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
    def withUserAttributes(value: MapOfAttributeDimension): Self = {
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

