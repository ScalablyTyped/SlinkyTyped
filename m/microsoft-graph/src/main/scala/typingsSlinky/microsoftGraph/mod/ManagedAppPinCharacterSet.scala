package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.numeric
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.alphanumericAndSymbol
*/
trait ManagedAppPinCharacterSet extends js.Object

object ManagedAppPinCharacterSet {
  @scala.inline
  def alphanumericAndSymbol: typingsSlinky.microsoftGraph.microsoftGraphStrings.alphanumericAndSymbol = this.cast("alphanumericAndSymbol")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def numeric: typingsSlinky.microsoftGraph.microsoftGraphStrings.numeric = this.cast("numeric")
}

