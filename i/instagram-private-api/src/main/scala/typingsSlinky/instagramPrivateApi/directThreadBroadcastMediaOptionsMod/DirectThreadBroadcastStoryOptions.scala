package typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.once
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadBroadcastStoryOptions extends js.Object {
  var replyType: js.UndefOr[story | String] = js.native
  var uploadId: js.UndefOr[Double] = js.native
  var viewMode: js.UndefOr[replayable | once | String] = js.native
}

object DirectThreadBroadcastStoryOptions {
  @scala.inline
  def apply(): DirectThreadBroadcastStoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectThreadBroadcastStoryOptions]
  }
  @scala.inline
  implicit class DirectThreadBroadcastStoryOptionsOps[Self <: DirectThreadBroadcastStoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplyType(value: story | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyType")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: replayable | once | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
  }
  
}

