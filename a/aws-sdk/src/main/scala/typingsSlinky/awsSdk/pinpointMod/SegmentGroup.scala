package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentGroup extends js.Object {
  /**
    * An array that defines the dimensions for the segment.
    */
  var Dimensions: js.UndefOr[ListOfSegmentDimensions] = js.native
  /**
    * The base segment to build the segment on. A base segment, also referred to as a source segment, defines the initial population of endpoints for a segment. When you add dimensions to a segment, Amazon Pinpoint filters the base segment by using the dimensions that you specify. You can specify more than one dimensional segment or only one imported segment. If you specify an imported segment, the Amazon Pinpoint console displays a segment size estimate that indicates the size of the imported segment without any filters applied to it.
    */
  var SourceSegments: js.UndefOr[ListOfSegmentReference] = js.native
  /**
    * Specifies how to handle multiple base segments for the segment. For example, if you specify three base segments for the segment, whether the resulting segment is based on all, any, or none of the base segments.
    */
  var SourceType: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.SourceType] = js.native
  /**
    * Specifies how to handle multiple dimensions for the segment. For example, if you specify three dimensions for the segment, whether the resulting segment includes endpoints that match all, any, or none of the dimensions.
    */
  var Type: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Type] = js.native
}

object SegmentGroup {
  @scala.inline
  def apply(): SegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentGroup]
  }
  @scala.inline
  implicit class SegmentGroupOps[Self <: SegmentGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: ListOfSegmentDimensions): Self = {
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
    def withSourceSegments(value: ListOfSegmentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: SourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

