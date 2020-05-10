package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35SegmentationDescriptor extends js.Object {
  /**
    * Holds the four SCTE-35 delivery restriction parameters.
    */
  var DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions] = js.native
  /**
    * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentNum: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
    */
  var SegmentationCancelIndicator: Scte35SegmentationCancelIndicator = js.native
  /**
    * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a duration, the time_signal will continue until you insert a cancellation message.
    */
  var SegmentationDuration: js.UndefOr[longMin0Max1099511627775] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_event_id. 
    */
  var SegmentationEventId: longMin0Max4294967295 = js.native
  /**
    * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35 specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the ID in hex (for example, "0x34") or decimal (for example, "52").
    */
  var SegmentationTypeId: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
    */
  var SegmentationUpid: js.UndefOr[string] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example, "0x0C" ) or in decimal (for example, "12").
    */
  var SegmentationUpidType: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentsExpected: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentNum: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentsExpected: js.UndefOr[integerMin0Max255] = js.native
}

object Scte35SegmentationDescriptor {
  @scala.inline
  def apply(
    SegmentationCancelIndicator: Scte35SegmentationCancelIndicator,
    SegmentationEventId: longMin0Max4294967295
  ): Scte35SegmentationDescriptor = {
    val __obj = js.Dynamic.literal(SegmentationCancelIndicator = SegmentationCancelIndicator.asInstanceOf[js.Any], SegmentationEventId = SegmentationEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35SegmentationDescriptor]
  }
  @scala.inline
  implicit class Scte35SegmentationDescriptorOps[Self <: Scte35SegmentationDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentationCancelIndicator(value: Scte35SegmentationCancelIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationCancelIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegmentationEventId(value: longMin0Max4294967295): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryRestrictions(value: Scte35DeliveryRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentNum(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentNum")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationDuration(value: longMin0Max1099511627775): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationTypeId(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationUpid(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationUpid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationUpid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationUpid")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationUpidType(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationUpidType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationUpidType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationUpidType")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsExpected(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsExpected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentsExpected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsExpected")(js.undefined)
        ret
    }
    @scala.inline
    def withSubSegmentNum(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubSegmentNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubSegmentNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubSegmentNum")(js.undefined)
        ret
    }
    @scala.inline
    def withSubSegmentsExpected(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubSegmentsExpected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubSegmentsExpected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubSegmentsExpected")(js.undefined)
        ret
    }
  }
  
}

