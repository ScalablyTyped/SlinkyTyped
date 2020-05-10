package typingsSlinky.firebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JS SDK supports 5 log levels and also allows a user the ability to
  * silence the logs altogether.
  *
  * The order is as follows:
  * silent < debug < verbose < info < warn < error
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.firebaseStrings.debug
  - typingsSlinky.firebase.firebaseStrings.verbose
  - typingsSlinky.firebase.firebaseStrings.info
  - typingsSlinky.firebase.firebaseStrings.warn
  - typingsSlinky.firebase.firebaseStrings.error
  - typingsSlinky.firebase.firebaseStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def debug: typingsSlinky.firebase.firebaseStrings.debug = "debug".asInstanceOf[typingsSlinky.firebase.firebaseStrings.debug]
  @scala.inline
  def error: typingsSlinky.firebase.firebaseStrings.error = "error".asInstanceOf[typingsSlinky.firebase.firebaseStrings.error]
  @scala.inline
  def info: typingsSlinky.firebase.firebaseStrings.info = "info".asInstanceOf[typingsSlinky.firebase.firebaseStrings.info]
  @scala.inline
  def silent: typingsSlinky.firebase.firebaseStrings.silent = "silent".asInstanceOf[typingsSlinky.firebase.firebaseStrings.silent]
  @scala.inline
  def verbose: typingsSlinky.firebase.firebaseStrings.verbose = "verbose".asInstanceOf[typingsSlinky.firebase.firebaseStrings.verbose]
  @scala.inline
  def warn: typingsSlinky.firebase.firebaseStrings.warn = "warn".asInstanceOf[typingsSlinky.firebase.firebaseStrings.warn]
}

