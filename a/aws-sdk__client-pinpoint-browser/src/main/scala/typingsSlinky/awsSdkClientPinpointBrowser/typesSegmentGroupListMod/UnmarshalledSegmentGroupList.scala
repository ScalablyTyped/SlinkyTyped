package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupMod.UnmarshalledSegmentGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentGroupList extends SegmentGroupList {
  /**
    * A set of segment criteria to evaluate.
    */
  @JSName("Groups")
  var Groups_UnmarshalledSegmentGroupList: js.UndefOr[js.Array[UnmarshalledSegmentGroup]] = js.undefined
}

object UnmarshalledSegmentGroupList {
  @scala.inline
  def apply(Groups: js.Array[UnmarshalledSegmentGroup] = null, Include: ALL | ANY | NONE | String = null): UnmarshalledSegmentGroupList = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentGroupList]
  }
}

