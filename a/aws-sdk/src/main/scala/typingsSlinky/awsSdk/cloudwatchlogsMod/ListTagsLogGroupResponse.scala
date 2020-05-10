package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsLogGroupResponse extends js.Object {
  /**
    * The tags for the log group.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object ListTagsLogGroupResponse {
  @scala.inline
  def apply(): ListTagsLogGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsLogGroupResponse]
  }
  @scala.inline
  implicit class ListTagsLogGroupResponseOps[Self <: ListTagsLogGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

