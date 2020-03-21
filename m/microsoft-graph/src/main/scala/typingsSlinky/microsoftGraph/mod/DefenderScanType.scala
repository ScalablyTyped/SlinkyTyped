package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.quick
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.full
*/
trait DefenderScanType extends js.Object

object DefenderScanType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def full: typingsSlinky.microsoftGraph.microsoftGraphStrings.full = this.cast("full")
  @scala.inline
  def quick: typingsSlinky.microsoftGraph.microsoftGraphStrings.quick = this.cast("quick")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

