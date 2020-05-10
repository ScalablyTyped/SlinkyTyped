package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteSegmentRequest extends js.Object {
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  /**
    * The name of segment
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
}

object WriteSegmentRequest {
  @scala.inline
  def apply(): WriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteSegmentRequest]
  }
  @scala.inline
  implicit class WriteSegmentRequestOps[Self <: WriteSegmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: SegmentDimensions): Self = {
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
    def withName(value: String): Self = {
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
    def withSegmentGroups(value: SegmentGroupList): Self = {
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

