package typingsSlinky.ionicCliFramework.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.DEBUG
  - typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.INFO
  - typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.WARN
  - typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.ERROR
*/
trait LoggerLevel extends js.Object

object LoggerLevel {
  @scala.inline
  def DEBUG: typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARN: typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.WARN = this.cast("WARN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

