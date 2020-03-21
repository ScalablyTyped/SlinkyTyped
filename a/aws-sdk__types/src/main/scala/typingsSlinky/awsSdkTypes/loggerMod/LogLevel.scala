package typingsSlinky.awsSdkTypes.loggerMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.all
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.log
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.info
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.warn
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.error_
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def all: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: error_ = this.cast("error")
  @scala.inline
  def info: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.info = this.cast("info")
  @scala.inline
  def log: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.log = this.cast("log")
  @scala.inline
  def off: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.warn = this.cast("warn")
}

