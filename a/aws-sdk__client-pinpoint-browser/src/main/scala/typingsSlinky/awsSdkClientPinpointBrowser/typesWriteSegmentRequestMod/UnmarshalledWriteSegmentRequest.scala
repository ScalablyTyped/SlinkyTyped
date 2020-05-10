package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledWriteSegmentRequest extends WriteSegmentRequest {
  /**
    * The segment dimensions attributes.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentDimensions] = js.native
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  @JSName("SegmentGroups")
  var SegmentGroups_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentGroupList] = js.native
}

object UnmarshalledWriteSegmentRequest {
  @scala.inline
  def apply(): UnmarshalledWriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteSegmentRequest]
  }
  @scala.inline
  implicit class UnmarshalledWriteSegmentRequestOps[Self <: UnmarshalledWriteSegmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: UnmarshalledSegmentDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentGroups(value: UnmarshalledSegmentGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentGroups")(js.undefined)
        ret
    }
  }
  
}

