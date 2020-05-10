package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentPricing extends js.Object {
  /** A segment identifier unique within a single solution. It is used to refer to different parts of the same solution. */
  var fareId: js.UndefOr[String] = js.native
  /** Details of the free baggage allowance on this segment. */
  var freeBaggageOption: js.UndefOr[js.Array[FreeBaggageAllowance]] = js.native
  /** Identifies this as a segment pricing object, representing the price of this segment. Value: the fixed string qpxexpress#segmentPricing. */
  var kind: js.UndefOr[String] = js.native
  /** Unique identifier in the response of this segment. */
  var segmentId: js.UndefOr[String] = js.native
}

object SegmentPricing {
  @scala.inline
  def apply(): SegmentPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentPricing]
  }
  @scala.inline
  implicit class SegmentPricingOps[Self <: SegmentPricing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFareId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fareId")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeBaggageOption(value: js.Array[FreeBaggageAllowance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeBaggageOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeBaggageOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeBaggageOption")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(js.undefined)
        ret
    }
  }
  
}

