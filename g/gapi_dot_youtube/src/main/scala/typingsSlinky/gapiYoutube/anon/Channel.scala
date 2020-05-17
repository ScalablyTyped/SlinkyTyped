package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  /**
    * The channel object encapsulates branding properties of the channel page.
    */
  var channel: DefaultTab = js.native
  /**
    * The hints object encapsulates additional branding properties
    */
  var hints: js.Array[Property] = js.native
  /**
    * The image object encapsulates information about images that display on the channels channel page or video watch pages.
    */
  var image: BackgroundImageUrl = js.native
  /**
    * The watch object encapsulates branding properties of the watch pages for the channels videos.
    */
  var watch: BackgroundColor = js.native
}

object Channel {
  @scala.inline
  def apply(channel: DefaultTab, hints: js.Array[Property], image: BackgroundImageUrl, watch: BackgroundColor): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: DefaultTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHints(value: js.Array[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: BackgroundImageUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: BackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

