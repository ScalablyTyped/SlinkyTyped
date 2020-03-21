package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedSafe
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.remediated
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.dismissed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.atRisk
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedCompromised
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskState extends js.Object

object RiskState {
  @scala.inline
  def atRisk: typingsSlinky.microsoftGraph.microsoftGraphStrings.atRisk = this.cast("atRisk")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmedCompromised: typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedCompromised = this.cast("confirmedCompromised")
  @scala.inline
  def confirmedSafe: typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedSafe = this.cast("confirmedSafe")
  @scala.inline
  def dismissed: typingsSlinky.microsoftGraph.microsoftGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def remediated: typingsSlinky.microsoftGraph.microsoftGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

