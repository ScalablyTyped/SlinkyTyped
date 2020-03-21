package typingsSlinky.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.debug
  - typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.error
  - typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.error = this.cast("error")
  @scala.inline
  def silent: typingsSlinky.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.silent = this.cast("silent")
}

