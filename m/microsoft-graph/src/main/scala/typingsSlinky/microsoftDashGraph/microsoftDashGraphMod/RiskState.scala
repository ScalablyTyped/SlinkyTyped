package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.confirmedSafe
  - typings.microsoftDashGraph.microsoftDashGraphStrings.remediated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.dismissed
  - typings.microsoftDashGraph.microsoftDashGraphStrings.atRisk
  - typings.microsoftDashGraph.microsoftDashGraphStrings.confirmedCompromised
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait RiskState extends js.Object

object RiskState {
  @scala.inline
  def atRisk: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.atRisk = this.cast("atRisk")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmedCompromised: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.confirmedCompromised = this.cast("confirmedCompromised")
  @scala.inline
  def confirmedSafe: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.confirmedSafe = this.cast("confirmedSafe")
  @scala.inline
  def dismissed: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def remediated: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

