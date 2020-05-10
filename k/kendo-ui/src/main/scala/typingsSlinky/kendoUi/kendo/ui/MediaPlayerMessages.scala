package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPlayerMessages extends js.Object {
  var fullscreen: js.UndefOr[String] = js.native
  var mute: js.UndefOr[String] = js.native
  var pause: js.UndefOr[String] = js.native
  var play: js.UndefOr[String] = js.native
  var quality: js.UndefOr[String] = js.native
  var unmute: js.UndefOr[String] = js.native
}

object MediaPlayerMessages {
  @scala.inline
  def apply(): MediaPlayerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerMessages]
  }
  @scala.inline
  implicit class MediaPlayerMessagesOps[Self <: MediaPlayerMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPlay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmute")(js.undefined)
        ret
    }
  }
  
}

