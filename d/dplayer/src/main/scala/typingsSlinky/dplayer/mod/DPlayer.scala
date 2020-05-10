package typingsSlinky.dplayer.mod

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DPlayer extends js.Object {
  var danmaku: Danmaku = js.native
  var events: js.Any = js.native
  var fullScreen: FullScreen = js.native
  var video: HTMLVideoElement = js.native
  def destroy(): Unit = js.native
  def notice(text: String, time: Double, opacity: Double): Unit = js.native
  def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def seek(time: Double): Unit = js.native
  def speed(rate: Double): Unit = js.native
  def switchQuality(index: Double): Unit = js.native
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit = js.native
  def toggle(): Unit = js.native
  def volume(percentage: Double, nostorage: Boolean, nonotice: Boolean): Unit = js.native
}

object DPlayer {
  @scala.inline
  def apply(
    danmaku: Danmaku,
    destroy: () => Unit,
    events: js.Any,
    fullScreen: FullScreen,
    notice: (String, Double, Double) => Unit,
    on: (DPlayerEvents, js.Function0[Unit]) => Unit,
    pause: () => Unit,
    play: () => Unit,
    seek: Double => Unit,
    speed: Double => Unit,
    switchQuality: Double => Unit,
    switchVideo: (DPlayerVideo, DPlayerDanmaku) => Unit,
    toggle: () => Unit,
    video: HTMLVideoElement,
    volume: (Double, Boolean, Boolean) => Unit
  ): DPlayer = {
    val __obj = js.Dynamic.literal(danmaku = danmaku.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], notice = js.Any.fromFunction3(notice), on = js.Any.fromFunction2(on), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), speed = js.Any.fromFunction1(speed), switchQuality = js.Any.fromFunction1(switchQuality), switchVideo = js.Any.fromFunction2(switchVideo), toggle = js.Any.fromFunction0(toggle), video = video.asInstanceOf[js.Any], volume = js.Any.fromFunction3(volume))
    __obj.asInstanceOf[DPlayer]
  }
  @scala.inline
  implicit class DPlayerOps[Self <: DPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDanmaku(value: Danmaku): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danmaku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullScreen(value: FullScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotice(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOn(value: (DPlayerEvents, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpeed(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSwitchQuality(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchQuality")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSwitchVideo(value: (DPlayerVideo, DPlayerDanmaku) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchVideo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVideo(value: HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: (Double, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

