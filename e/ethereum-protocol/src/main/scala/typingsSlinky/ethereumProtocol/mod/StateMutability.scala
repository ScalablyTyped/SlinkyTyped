package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ethereumProtocol.ethereumProtocolStrings.pure
  - typingsSlinky.ethereumProtocol.ethereumProtocolStrings.view
  - typingsSlinky.ethereumProtocol.ethereumProtocolStrings.nonpayable
  - typingsSlinky.ethereumProtocol.ethereumProtocolStrings.payable
*/
trait StateMutability extends js.Object

object StateMutability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typingsSlinky.ethereumProtocol.ethereumProtocolStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typingsSlinky.ethereumProtocol.ethereumProtocolStrings.payable = this.cast("payable")
  @scala.inline
  def pure: typingsSlinky.ethereumProtocol.ethereumProtocolStrings.pure = this.cast("pure")
  @scala.inline
  def view: typingsSlinky.ethereumProtocol.ethereumProtocolStrings.view = this.cast("view")
}

