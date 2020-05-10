package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LivePlayerContext extends js.Object {
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[_, _]): Unit = js.native
  /** 静音 */
  def mute(options: BaseOptions[_, _]): Unit = js.native
  /** 暂停 */
  def pause(options: BaseOptions[_, _]): Unit = js.native
  /** 播放 */
  def play(options: BaseOptions[_, _]): Unit = js.native
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): Unit = js.native
  /** 回复 */
  def resume(options: BaseOptions[_, _]): Unit = js.native
  /** 停止 */
  def stop(options: BaseOptions[_, _]): Unit = js.native
}

object LivePlayerContext {
  @scala.inline
  def apply(
    exitFullScreen: BaseOptions[_, _] => Unit,
    mute: BaseOptions[_, _] => Unit,
    pause: BaseOptions[_, _] => Unit,
    play: BaseOptions[_, _] => Unit,
    requestFullScreen: RequestFullScreenOptions => Unit,
    resume: BaseOptions[_, _] => Unit,
    stop: BaseOptions[_, _] => Unit
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction1(exitFullScreen), mute = js.Any.fromFunction1(mute), pause = js.Any.fromFunction1(pause), play = js.Any.fromFunction1(play), requestFullScreen = js.Any.fromFunction1(requestFullScreen), resume = js.Any.fromFunction1(resume), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LivePlayerContext]
  }
  @scala.inline
  implicit class LivePlayerContextOps[Self <: LivePlayerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitFullScreen(value: BaseOptions[_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullScreen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMute(value: BaseOptions[_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPause(value: BaseOptions[_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlay(value: BaseOptions[_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestFullScreen(value: RequestFullScreenOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullScreen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResume(value: BaseOptions[_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: BaseOptions[_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

