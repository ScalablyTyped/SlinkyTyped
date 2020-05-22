package typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.once
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.story
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastVideoStoryOptions extends DirectThreadBroadcastStoryOptions {
  var coverImage: Buffer
  var video: Buffer
}

object DirectThreadBroadcastVideoStoryOptions {
  @scala.inline
  def apply(
    coverImage: Buffer,
    video: Buffer,
    replyType: story | String = null,
    uploadId: js.UndefOr[Double] = js.undefined,
    viewMode: replayable | once | String = null
  ): DirectThreadBroadcastVideoStoryOptions = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (replyType != null) __obj.updateDynamic("replyType")(replyType.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadId)) __obj.updateDynamic("uploadId")(uploadId.get.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVideoStoryOptions]
  }
}

