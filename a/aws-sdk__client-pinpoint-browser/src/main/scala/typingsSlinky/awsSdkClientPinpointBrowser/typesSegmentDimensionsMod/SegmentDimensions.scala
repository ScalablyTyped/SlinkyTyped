package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesAttributeDimensionMod.AttributeDimension
import typingsSlinky.awsSdkClientPinpointBrowser.typesMetricDimensionMod.MetricDimension
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod.SegmentBehaviors
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod.SegmentDemographics
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentLocationMod.SegmentLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDimensions extends js.Object {
  /**
    * Custom segment attributes.
    */
  var Attributes: js.UndefOr[
    StringDictionary[AttributeDimension] | (js.Iterable[js.Tuple2[String, AttributeDimension]])
  ] = js.native
  /**
    * The segment behaviors attributes.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.native
  /**
    * The segment demographics attributes.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.native
  /**
    * The segment location attributes.
    */
  var Location: js.UndefOr[SegmentLocation] = js.native
  /**
    * Custom segment metrics.
    */
  var Metrics: js.UndefOr[
    StringDictionary[MetricDimension] | (js.Iterable[js.Tuple2[String, MetricDimension]])
  ] = js.native
  /**
    * Custom segment user attributes.
    */
  var UserAttributes: js.UndefOr[
    StringDictionary[AttributeDimension] | (js.Iterable[js.Tuple2[String, AttributeDimension]])
  ] = js.native
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
    def withAttributesIterable(value: js.Iterable[js.Tuple2[String, AttributeDimension]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: StringDictionary[AttributeDimension] | (js.Iterable[js.Tuple2[String, AttributeDimension]])): Self = {
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
    def withMetricsIterable(value: js.Iterable[js.Tuple2[String, MetricDimension]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: StringDictionary[MetricDimension] | (js.Iterable[js.Tuple2[String, MetricDimension]])): Self = {
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
    def withUserAttributesIterable(value: js.Iterable[js.Tuple2[String, AttributeDimension]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAttributes(value: StringDictionary[AttributeDimension] | (js.Iterable[js.Tuple2[String, AttributeDimension]])): Self = {
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

