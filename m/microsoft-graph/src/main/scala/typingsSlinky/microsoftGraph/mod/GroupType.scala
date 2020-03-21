package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unifiedGroups
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.azureAD
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait GroupType extends js.Object

object GroupType {
  @scala.inline
  def azureAD: typingsSlinky.microsoftGraph.microsoftGraphStrings.azureAD = this.cast("azureAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unifiedGroups: typingsSlinky.microsoftGraph.microsoftGraphStrings.unifiedGroups = this.cast("unifiedGroups")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

