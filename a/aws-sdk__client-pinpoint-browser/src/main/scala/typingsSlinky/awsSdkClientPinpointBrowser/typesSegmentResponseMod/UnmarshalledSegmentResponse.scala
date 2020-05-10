package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.UnmarshalledSegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentResponse extends SegmentResponse {
  /**
    * The segment dimensions attributes.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentDimensions] = js.native
  /**
    * The import job settings.
    */
  @JSName("ImportDefinition")
  var ImportDefinition_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentImportResource] = js.native
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  @JSName("SegmentGroups")
  var SegmentGroups_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentGroupList] = js.native
}

object UnmarshalledSegmentResponse {
  @scala.inline
  def apply(): UnmarshalledSegmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentResponse]
  }
  @scala.inline
  implicit class UnmarshalledSegmentResponseOps[Self <: UnmarshalledSegmentResponse] (val x: Self) extends AnyVal {
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
    def withImportDefinition(value: UnmarshalledSegmentImportResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefinition")(js.undefined)
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

