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
  @scala.inline
  implicit class FragmentSelectorOps[Self <: FragmentSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragmentSelectorType(value: FragmentSelectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSelectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestampRange(value: TimestampRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimestampRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

