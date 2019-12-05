package typingsSlinky.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.IDLE
  - typings.alexaDashSdk.alexaDashSdkStrings.PAUSED
  - typings.alexaDashSdk.alexaDashSdkStrings.PLAYING
  - typings.alexaDashSdk.alexaDashSdkStrings.BUFFER_UNDERRUN
  - typings.alexaDashSdk.alexaDashSdkStrings.FINISHED
  - typings.alexaDashSdk.alexaDashSdkStrings.STOPPED
*/
trait AudioPlayerActivity extends js.Object

object AudioPlayerActivity {
  @scala.inline
  def BUFFER_UNDERRUN: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.BUFFER_UNDERRUN = this.cast("BUFFER_UNDERRUN")
  @scala.inline
  def FINISHED: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.FINISHED = this.cast("FINISHED")
  @scala.inline
  def IDLE: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.IDLE = this.cast("IDLE")
  @scala.inline
  def PAUSED: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PAUSED = this.cast("PAUSED")
  @scala.inline
  def PLAYING: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PLAYING = this.cast("PLAYING")
  @scala.inline
  def STOPPED: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.STOPPED = this.cast("STOPPED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

