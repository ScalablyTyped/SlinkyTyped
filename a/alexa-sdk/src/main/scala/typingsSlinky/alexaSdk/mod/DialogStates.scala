package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.alexaSdk.alexaSdkStrings.STARTED
  - typingsSlinky.alexaSdk.alexaSdkStrings.IN_PROGRESS
  - typingsSlinky.alexaSdk.alexaSdkStrings.COMPLETED
*/
trait DialogStates extends js.Object

object DialogStates {
  @scala.inline
  def COMPLETED: typingsSlinky.alexaSdk.alexaSdkStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def IN_PROGRESS: typingsSlinky.alexaSdk.alexaSdkStrings.IN_PROGRESS = this.cast("IN_PROGRESS")
  @scala.inline
  def STARTED: typingsSlinky.alexaSdk.alexaSdkStrings.STARTED = this.cast("STARTED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

