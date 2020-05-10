package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupMod.SegmentGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentGroupList extends js.Object {
  /**
    * A set of segment criteria to evaluate.
    */
  var Groups: js.UndefOr[js.Array[SegmentGroup] | js.Iterable[SegmentGroup]] = js.native
  /**
    * Specify how to handle multiple segment groups. For example, if the segment includes three segment groups, should the resulting segment include endpoints that are matched by all, any, or none of the segment groups you created. Acceptable values: ALL, ANY, or NONE.
    */
  var Include: js.UndefOr[ALL | ANY | NONE | String] = js.native
}

object SegmentGroupList {
  @scala.inline
  def apply(): SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentGroupList]
  }
  @scala.inline
  implicit class SegmentGroupListOps[Self <: SegmentGroupList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupsIterable(value: js.Iterable[SegmentGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[SegmentGroup] | js.Iterable[SegmentGroup]): Self = {
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
    @scala.inline
    def withInclude(value: ALL | ANY | NONE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Include")(js.undefined)
        ret
    }
  }
  
}

