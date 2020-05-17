package typingsSlinky.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemotePlayerController extends js.Object {
  def addEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]
  ): Unit = js.native
  def getFormattedTime(timeInSec: Double): String = js.native
  def getSeekPosition(currentTime: Double, duration: Double): Double = js.native
  def getSeekTime(currentPosition: Double, duration: Double): Double = js.native
  def muteOrUnmute(): Unit = js.native
  def playOrPause(): Unit = js.native
  def removeEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]
  ): Unit = js.native
  def seek(): Unit = js.native
  def setVolumeLevel(): Unit = js.native
  def stop(): Unit = js.native
}

object RemotePlayerController {
  @scala.inline
  def apply(
    addEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit,
    getFormattedTime: Double => String,
    getSeekPosition: (Double, Double) => Double,
    getSeekTime: (Double, Double) => Double,
    muteOrUnmute: () => Unit,
    playOrPause: () => Unit,
    removeEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit,
    seek: () => Unit,
    setVolumeLevel: () => Unit,
    stop: () => Unit
  ): RemotePlayerController = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getFormattedTime = js.Any.fromFunction1(getFormattedTime), getSeekPosition = js.Any.fromFunction2(getSeekPosition), getSeekTime = js.Any.fromFunction2(getSeekTime), muteOrUnmute = js.Any.fromFunction0(muteOrUnmute), playOrPause = js.Any.fromFunction0(playOrPause), removeEventListener = js.Any.fromFunction2(removeEventListener), seek = js.Any.fromFunction0(seek), setVolumeLevel = js.Any.fromFunction0(setVolumeLevel), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RemotePlayerController]
  }
  @scala.inline
  implicit class RemotePlayerControllerOps[Self <: RemotePlayerController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetFormattedTime(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattedTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSeekPosition(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeekPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSeekTime(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeekTime")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMuteOrUnmute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteOrUnmute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlayOrPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playOrPause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeek(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetVolumeLevel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVolumeLevel")(js.Any.fromFunction0(value))
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

