package typingsSlinky.chromecastCafSender.global.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayerController")
@js.native
class RemotePlayerController protected ()
  extends typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerController {
  def this(player: typingsSlinky.chromecastCafSender.cast.framework.RemotePlayer) = this()
  /* CompleteClass */
  override def addEventListener(
    `type`: typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerEventType,
    handler: js.Function1[
      /* event */ typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[_], 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def getFormattedTime(timeInSec: Double): String = js.native
  /* CompleteClass */
  override def getSeekPosition(currentTime: Double, duration: Double): Double = js.native
  /* CompleteClass */
  override def getSeekTime(currentPosition: Double, duration: Double): Double = js.native
  /* CompleteClass */
  override def muteOrUnmute(): Unit = js.native
  /* CompleteClass */
  override def playOrPause(): Unit = js.native
  /* CompleteClass */
  override def removeEventListener(
    `type`: typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerEventType,
    handler: js.Function1[
      /* event */ typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[_], 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def seek(): Unit = js.native
  /* CompleteClass */
  override def setVolumeLevel(): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

