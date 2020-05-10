package typingsSlinky.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFeedResponsePaginationInfo extends js.Object {
  var group_id: Null = js.native
  var source: Null = js.native
}

object TimelineFeedResponsePaginationInfo {
  @scala.inline
  def apply(group_id: Null, source: Null): TimelineFeedResponsePaginationInfo = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponsePaginationInfo]
  }
  @scala.inline
  implicit class TimelineFeedResponsePaginationInfoOps[Self <: TimelineFeedResponsePaginationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup_id(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

