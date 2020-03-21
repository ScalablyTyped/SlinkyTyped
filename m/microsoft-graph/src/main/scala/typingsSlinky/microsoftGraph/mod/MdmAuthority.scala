package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.intune
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sccm
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.office365
*/
trait MdmAuthority extends js.Object

object MdmAuthority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intune: typingsSlinky.microsoftGraph.microsoftGraphStrings.intune = this.cast("intune")
  @scala.inline
  def office365: typingsSlinky.microsoftGraph.microsoftGraphStrings.office365 = this.cast("office365")
  @scala.inline
  def sccm: typingsSlinky.microsoftGraph.microsoftGraphStrings.sccm = this.cast("sccm")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

