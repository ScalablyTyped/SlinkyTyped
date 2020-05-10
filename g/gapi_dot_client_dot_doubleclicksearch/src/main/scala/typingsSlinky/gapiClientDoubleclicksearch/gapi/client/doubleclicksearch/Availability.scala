package typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Availability extends js.Object {
  /** DS advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.native
  /** DS agency ID. */
  var agencyId: js.UndefOr[String] = js.native
  /** The time by which all conversions have been uploaded, in epoch millis UTC. */
  var availabilityTimestamp: js.UndefOr[String] = js.native
  /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
  var segmentationId: js.UndefOr[String] = js.native
  /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
  var segmentationName: js.UndefOr[String] = js.native
  /** The segmentation type that this availability is for (its default value is FLOODLIGHT). */
  var segmentationType: js.UndefOr[String] = js.native
}

object Availability {
  @scala.inline
  def apply(): Availability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Availability]
  }
  @scala.inline
  implicit class AvailabilityOps[Self <: Availability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withAgencyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgencyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationId")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationName")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationType")(js.undefined)
        ret
    }
  }
  
}

