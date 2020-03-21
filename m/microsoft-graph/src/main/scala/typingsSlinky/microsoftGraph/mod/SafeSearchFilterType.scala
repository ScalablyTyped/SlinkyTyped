package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.strict
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.moderate
*/
trait SafeSearchFilterType extends js.Object

object SafeSearchFilterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderate: typingsSlinky.microsoftGraph.microsoftGraphStrings.moderate = this.cast("moderate")
  @scala.inline
  def strict: typingsSlinky.microsoftGraph.microsoftGraphStrings.strict = this.cast("strict")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

