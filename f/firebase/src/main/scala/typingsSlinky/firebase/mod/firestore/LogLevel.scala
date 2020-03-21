package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.firebaseStrings.debug
  - typingsSlinky.firebase.firebaseStrings.error
  - typingsSlinky.firebase.firebaseStrings.silent
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

