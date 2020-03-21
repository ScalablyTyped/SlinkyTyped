package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupMod.SegmentGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentGroupList extends js.Object {
  /**
    * A set of segment criteria to evaluate.
    */
  var Groups: js.UndefOr[js.Array[SegmentGroup] | js.Iterable[SegmentGroup]] = js.undefined
  /**
    * Specify how to handle multiple segment groups. For example, if the segment includes three segment groups, should the resulting segment include endpoints that are matched by all, any, or none of the segment groups you created. Acceptable values: ALL, ANY, or NONE.
    */
  var Include: js.UndefOr[ALL | ANY | NONE | String] = js.undefined
}

object SegmentGroupList {
  @scala.inline
  def apply(
    Groups: js.Array[SegmentGroup] | js.Iterable[SegmentGroup] = null,
    Include: ALL | ANY | NONE | String = null
  ): SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentGroupList]
  }
}

