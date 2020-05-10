package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reservation extends js.Object {
  /**
    * Unique reservation ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * Number of reserved resources
    */
  var Count: js.UndefOr[integer] = js.native
  /**
    * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
    */
  var CurrencyCode: js.UndefOr[string] = js.native
  /**
    * Lease duration, e.g. '12'
    */
  var Duration: js.UndefOr[integer] = js.native
  /**
    * Units for duration, e.g. 'MONTHS'
    */
  var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.native
  /**
    * Reservation UTC end date and time in ISO-8601 format, e.g. '2019-03-01T00:00:00'
    */
  var End: js.UndefOr[string] = js.native
  /**
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[double] = js.native
  /**
    * User specified reservation name
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
    */
  var OfferingDescription: js.UndefOr[string] = js.native
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: js.UndefOr[string] = js.native
  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  var OfferingType: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.OfferingType] = js.native
  /**
    * AWS region, e.g. 'us-west-2'
    */
  var Region: js.UndefOr[string] = js.native
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: js.UndefOr[string] = js.native
  /**
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.native
  /**
    * Reservation UTC start date and time in ISO-8601 format, e.g. '2018-03-01T00:00:00'
    */
  var Start: js.UndefOr[string] = js.native
  /**
    * Current state of reservation, e.g. 'ACTIVE'
    */
  var State: js.UndefOr[ReservationState] = js.native
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[double] = js.native
}

object Reservation {
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  @scala.inline
  implicit class ReservationOps[Self <: Reservation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationUnits(value: OfferingDurationUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedPrice(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingType(value: OfferingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingType")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withReservationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceSpecification(value: ReservationResourceSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ReservationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUsagePrice(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsagePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsagePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsagePrice")(js.undefined)
        ret
    }
  }
  
}

