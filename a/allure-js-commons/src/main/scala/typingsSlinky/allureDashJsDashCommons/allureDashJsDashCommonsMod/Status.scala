package typingsSlinky.allureDashJsDashCommons.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.passed
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.pending
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.skipped
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.failed
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.broken
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def broken: typingsSlinky.allureDashJsDashCommons.allureDashJsDashCommonsStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.allureDashJsDashCommons.allureDashJsDashCommonsStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typingsSlinky.allureDashJsDashCommons.allureDashJsDashCommonsStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typingsSlinky.allureDashJsDashCommons.allureDashJsDashCommonsStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typingsSlinky.allureDashJsDashCommons.allureDashJsDashCommonsStrings.skipped = this.cast("skipped")
}

