package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.active
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inactive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait MediaState extends js.Object

object MediaState {
  @scala.inline
  def active: typingsSlinky.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsSlinky.microsoftGraph.microsoftGraphStrings.inactive = this.cast("inactive")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

