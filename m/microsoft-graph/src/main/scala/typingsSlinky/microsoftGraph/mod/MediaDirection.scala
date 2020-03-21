package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inactive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sendOnly
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.receiveOnly
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sendReceive
*/
trait MediaDirection extends js.Object

object MediaDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsSlinky.microsoftGraph.microsoftGraphStrings.inactive = this.cast("inactive")
  @scala.inline
  def receiveOnly: typingsSlinky.microsoftGraph.microsoftGraphStrings.receiveOnly = this.cast("receiveOnly")
  @scala.inline
  def sendOnly: typingsSlinky.microsoftGraph.microsoftGraphStrings.sendOnly = this.cast("sendOnly")
  @scala.inline
  def sendReceive: typingsSlinky.microsoftGraph.microsoftGraphStrings.sendReceive = this.cast("sendReceive")
}

