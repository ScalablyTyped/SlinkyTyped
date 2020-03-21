package typingsSlinky.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.axeCore.axeCoreStrings.inapplicable
  - typingsSlinky.axeCore.axeCoreStrings.passes
  - typingsSlinky.axeCore.axeCoreStrings.incomplete
  - typingsSlinky.axeCore.axeCoreStrings.violations
*/
trait resultGroups extends js.Object

object resultGroups {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inapplicable: typingsSlinky.axeCore.axeCoreStrings.inapplicable = this.cast("inapplicable")
  @scala.inline
  def incomplete: typingsSlinky.axeCore.axeCoreStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def passes: typingsSlinky.axeCore.axeCoreStrings.passes = this.cast("passes")
  @scala.inline
  def violations: typingsSlinky.axeCore.axeCoreStrings.violations = this.cast("violations")
}

