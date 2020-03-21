package typingsSlinky.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.trace
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.debug
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.info
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.warn
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.error
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.fatal
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.elasticApmNode.elasticApmNodeStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.elasticApmNode.elasticApmNodeStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.elasticApmNode.elasticApmNodeStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.elasticApmNode.elasticApmNodeStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsSlinky.elasticApmNode.elasticApmNodeStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.elasticApmNode.elasticApmNodeStrings.warn = this.cast("warn")
}

