package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOfferingResponse extends js.Object {
  /**
    * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
    */
  var Arn: js.UndefOr[string] = js.native
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
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[double] = js.native
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
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.native
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[double] = js.native
}

object DescribeOfferingResponse {
  @scala.inline
  def apply(): DescribeOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOfferingResponse]
  }
  @scala.inline
  implicit class DescribeOfferingResponseOps[Self <: DescribeOfferingResponse] (val x: Self) extends AnyVal {
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

