package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupMod.UnmarshalledSegmentGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentGroupList extends SegmentGroupList {
  /**
    * A set of segment criteria to evaluate.
    */
  @JSName("Groups")
  var Groups_UnmarshalledSegmentGroupList: js.UndefOr[js.Array[UnmarshalledSegmentGroup]] = js.native
}

object UnmarshalledSegmentGroupList {
  @scala.inline
  def apply(): UnmarshalledSegmentGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentGroupList]
  }
  @scala.inline
  implicit class UnmarshalledSegmentGroupListOps[Self <: UnmarshalledSegmentGroupList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[UnmarshalledSegmentGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
  }
  
}

