package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentReferenceMod.UnmarshalledSegmentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentGroup extends SegmentGroup {
  /**
    * List of dimensions to include or exclude.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentDimensions]] = js.native
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    *
    * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  @JSName("SourceSegments")
  var SourceSegments_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentReference]] = js.native
}

object UnmarshalledSegmentGroup {
  @scala.inline
  def apply(): UnmarshalledSegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentGroup]
  }
  @scala.inline
  implicit class UnmarshalledSegmentGroupOps[Self <: UnmarshalledSegmentGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: js.Array[UnmarshalledSegmentDimensions]): Self = {
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
    def withSourceSegments(value: js.Array[UnmarshalledSegmentReference]): Self = {
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
  }
  
}

