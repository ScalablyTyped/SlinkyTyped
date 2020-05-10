package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChannel extends js.Object {
  /**
    * The channel object encapsulates branding properties of the channel page.
    */
  var channel: AnonDefaultTab = js.native
  /**
    * The hints object encapsulates additional branding properties
    */
  var hints: js.Array[AnonProperty] = js.native
  /**
    * The image object encapsulates information about images that display on the channels channel page or video watch pages.
    */
  var image: AnonBackgroundImageUrl = js.native
  /**
    * The watch object encapsulates branding properties of the watch pages for the channels videos.
    */
  var watch: AnonBackgroundColor = js.native
}

object AnonChannel {
  @scala.inline
  def apply(
    channel: AnonDefaultTab,
    hints: js.Array[AnonProperty],
    image: AnonBackgroundImageUrl,
    watch: AnonBackgroundColor
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
  @scala.inline
  implicit class AnonChannelOps[Self <: AnonChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: AnonDefaultTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHints(value: js.Array[AnonProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: AnonBackgroundImageUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: AnonBackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

