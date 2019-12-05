package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inactive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.sendOnly
  - typings.microsoftDashGraph.microsoftDashGraphStrings.receiveOnly
  - typings.microsoftDashGraph.microsoftDashGraphStrings.sendReceive
*/
trait MediaDirection extends js.Object

object MediaDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.inactive = this.cast("inactive")
  @scala.inline
  def receiveOnly: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.receiveOnly = this.cast("receiveOnly")
  @scala.inline
  def sendOnly: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.sendOnly = this.cast("sendOnly")
  @scala.inline
  def sendReceive: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.sendReceive = this.cast("sendReceive")
}

