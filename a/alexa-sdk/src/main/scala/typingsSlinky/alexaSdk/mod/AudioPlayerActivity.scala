package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.alexaSdk.alexaSdkStrings.IDLE
  - typingsSlinky.alexaSdk.alexaSdkStrings.PAUSED
  - typingsSlinky.alexaSdk.alexaSdkStrings.PLAYING
  - typingsSlinky.alexaSdk.alexaSdkStrings.BUFFER_UNDERRUN
  - typingsSlinky.alexaSdk.alexaSdkStrings.FINISHED
  - typingsSlinky.alexaSdk.alexaSdkStrings.STOPPED
*/
trait AudioPlayerActivity extends js.Object

object AudioPlayerActivity {
  @scala.inline
  def BUFFER_UNDERRUN: typingsSlinky.alexaSdk.alexaSdkStrings.BUFFER_UNDERRUN = this.cast("BUFFER_UNDERRUN")
  @scala.inline
  def FINISHED: typingsSlinky.alexaSdk.alexaSdkStrings.FINISHED = this.cast("FINISHED")
  @scala.inline
  def IDLE: typingsSlinky.alexaSdk.alexaSdkStrings.IDLE = this.cast("IDLE")
  @scala.inline
  def PAUSED: typingsSlinky.alexaSdk.alexaSdkStrings.PAUSED = this.cast("PAUSED")
  @scala.inline
  def PLAYING: typingsSlinky.alexaSdk.alexaSdkStrings.PLAYING = this.cast("PLAYING")
  @scala.inline
  def STOPPED: typingsSlinky.alexaSdk.alexaSdkStrings.STOPPED = this.cast("STOPPED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

