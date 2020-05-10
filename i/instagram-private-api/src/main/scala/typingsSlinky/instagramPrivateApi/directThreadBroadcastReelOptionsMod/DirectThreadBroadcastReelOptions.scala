package typingsSlinky.instagramPrivateApi.directThreadBroadcastReelOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.photo_
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.video_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadBroadcastReelOptions extends js.Object {
  var mediaId: String = js.native
  var mediaType: js.UndefOr[photo_ | video_] = js.native
  var reelId: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object DirectThreadBroadcastReelOptions {
  @scala.inline
  def apply(mediaId: String): DirectThreadBroadcastReelOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastReelOptions]
  }
  @scala.inline
  implicit class DirectThreadBroadcastReelOptionsOps[Self <: DirectThreadBroadcastReelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: photo_ | video_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withReelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reelId")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

