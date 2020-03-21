package typingsSlinky.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.full
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.autowatch
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.minimal
  - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.noFailures
*/
trait OutputOptions extends js.Object

object OutputOptions {
  @scala.inline
  def autowatch: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.autowatch = this.cast("autowatch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def full: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.full = this.cast("full")
  @scala.inline
  def minimal: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.minimal = this.cast("minimal")
  @scala.inline
  def noFailures: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.noFailures = this.cast("noFailures")
}

