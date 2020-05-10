package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoContext extends js.Object {
  /** [VideoContext.exitFullScreen()](VideoContext.exitFullScreen.md)
    *
    * 退出全屏
    *
    * 最低基础库： `1.4.0` */
  def exitFullScreen(): Unit = js.native
  /** [VideoContext.hideStatusBar()](VideoContext.hideStatusBar.md)
    *
    * 隐藏状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def hideStatusBar(): Unit = js.native
  /** [VideoContext.pause()](VideoContext.pause.md)
    *
    * 暂停视频 */
  def pause(): Unit = js.native
  /** [VideoContext.play()](VideoContext.play.md)
    *
    * 播放视频 */
  def play(): Unit = js.native
  /** [VideoContext.playbackRate(number rate)](VideoContext.playbackRate.md)
    *
    * 设置倍速播放
    *
    * 最低基础库： `1.4.0` */
  def playbackRate(/** 倍率，支持 0.5/0.8/1.0/1.25/1.5 */
  rate: Double): Unit = js.native
  /** [VideoContext.requestFullScreen(Object object)](VideoContext.requestFullScreen.md)
    *
    * 进入全屏
    *
    * 最低基础库： `1.4.0` */
  def requestFullScreen(option: VideoContextRequestFullScreenOption): Unit = js.native
  /** [VideoContext.seek(number position)](VideoContext.seek.md)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转到的位置，单位 s */
  position: Double): Unit = js.native
  /** [VideoContext.sendDanmu(Object data)](VideoContext.sendDanmu.md)
    *
    * 发送弹幕 */
  def sendDanmu(/** 弹幕内容 */
  data: Danmu): Unit = js.native
  /** [VideoContext.showStatusBar()](VideoContext.showStatusBar.md)
    *
    * 显示状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def showStatusBar(): Unit = js.native
  /** [VideoContext.stop()](VideoContext.stop.md)
    *
    * 停止视频
    *
    * 最低基础库： `1.7.0` */
  def stop(): Unit = js.native
}

object VideoContext {
  @scala.inline
  def apply(
    exitFullScreen: () => Unit,
    hideStatusBar: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    playbackRate: Double => Unit,
    requestFullScreen: VideoContextRequestFullScreenOption => Unit,
    seek: Double => Unit,
    sendDanmu: Danmu => Unit,
    showStatusBar: () => Unit,
    stop: () => Unit
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction0(exitFullScreen), hideStatusBar = js.Any.fromFunction0(hideStatusBar), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), playbackRate = js.Any.fromFunction1(playbackRate), requestFullScreen = js.Any.fromFunction1(requestFullScreen), seek = js.Any.fromFunction1(seek), sendDanmu = js.Any.fromFunction1(sendDanmu), showStatusBar = js.Any.fromFunction0(showStatusBar), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[VideoContext]
  }
  @scala.inline
  implicit class VideoContextOps[Self <: VideoContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitFullScreen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullScreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideStatusBar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideStatusBar")(js.Any.fromFunction0(value))
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
    def withPlaybackRate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestFullScreen(value: VideoContextRequestFullScreenOption => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullScreen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendDanmu(value: Danmu => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendDanmu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowStatusBar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStatusBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

