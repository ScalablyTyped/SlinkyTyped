package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsDataPoint extends js.Object {
  /**
    * Number of times the type of event occurred.
    * Meaning depends on context (e.g. profile views, contacts, etc.).
    */
  var eventCount: js.UndefOr[Double] = js.native
  /** Location information of where these events occurred. */
  var eventLocations: js.UndefOr[js.Array[LatLng]] = js.native
}

object AnalyticsDataPoint {
  @scala.inline
  def apply(): AnalyticsDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsDataPoint]
  }
  @scala.inline
  implicit class AnalyticsDataPointOps[Self <: AnalyticsDataPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLocations(value: js.Array[LatLng]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLocations")(js.undefined)
        ret
    }
  }
  
}

