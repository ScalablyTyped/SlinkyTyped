package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.work
  - typings.microsoftDashGraph.microsoftDashGraphStrings.personal
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unrestricted
*/
trait ActivityDomain extends js.Object

object ActivityDomain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def personal: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unrestricted: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unrestricted = this.cast("unrestricted")
  @scala.inline
  def work: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.work = this.cast("work")
}

