package typingsSlinky.firebase.firebaseMod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.debug
  - typings.firebase.firebaseStrings.error
  - typings.firebase.firebaseStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.firebase.firebaseStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.firebase.firebaseStrings.error = this.cast("error")
  @scala.inline
  def silent: typingsSlinky.firebase.firebaseStrings.silent = this.cast("silent")
}

