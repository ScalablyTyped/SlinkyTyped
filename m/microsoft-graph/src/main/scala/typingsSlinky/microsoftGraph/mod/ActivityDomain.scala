package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.work
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.personal
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unrestricted
*/
trait ActivityDomain extends js.Object

object ActivityDomain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def personal: typingsSlinky.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unrestricted: typingsSlinky.microsoftGraph.microsoftGraphStrings.unrestricted = this.cast("unrestricted")
  @scala.inline
  def work: typingsSlinky.microsoftGraph.microsoftGraphStrings.work = this.cast("work")
}

