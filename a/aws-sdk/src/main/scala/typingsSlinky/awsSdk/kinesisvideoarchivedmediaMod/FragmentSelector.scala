package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentSelector extends js.Object {
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.FragmentSelectorType = js.native
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.TimestampRange = js.native
}

object FragmentSelector {
  @scala.inline
  def apply(FragmentSelectorType: FragmentSelectorType, TimestampRange: TimestampRange): FragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FragmentSelector]
  }
}

