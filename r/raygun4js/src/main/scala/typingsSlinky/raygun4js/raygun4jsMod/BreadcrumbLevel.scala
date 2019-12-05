package typingsSlinky.raygun4js.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.raygun4js.raygun4jsStrings.debug
  - typings.raygun4js.raygun4jsStrings.error
  - typings.raygun4js.raygun4jsStrings.warning
  - typings.raygun4js.raygun4jsStrings.info
*/
trait BreadcrumbLevel extends js.Object

object BreadcrumbLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.raygun4js.raygun4jsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.raygun4js.raygun4jsStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.raygun4js.raygun4jsStrings.info = this.cast("info")
  @scala.inline
  def warning: typingsSlinky.raygun4js.raygun4jsStrings.warning = this.cast("warning")
}

