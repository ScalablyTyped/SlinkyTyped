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
  def atRisk: typingsSlinky.microsoftGraph.microsoftGraphStrings.atRisk = "atRisk".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.atRisk]
  @scala.inline
  def confirmedCompromised: typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedCompromised = "confirmedCompromised".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedCompromised]
  @scala.inline
  def confirmedSafe: typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedSafe = "confirmedSafe".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.confirmedSafe]
  @scala.inline
  def dismissed: typingsSlinky.microsoftGraph.microsoftGraphStrings.dismissed = "dismissed".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.dismissed]
  @scala.inline
  def none: none_ = "none".asInstanceOf[none_]
  @scala.inline
  def remediated: typingsSlinky.microsoftGraph.microsoftGraphStrings.remediated = "remediated".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.remediated]
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = "unknownFutureValue".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue]
}

