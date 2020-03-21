package typingsSlinky.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.success
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.info
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.warning
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.error
*/
trait ReporterColor extends js.Object

object ReporterColor {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.warning = this.cast("warning")
}

