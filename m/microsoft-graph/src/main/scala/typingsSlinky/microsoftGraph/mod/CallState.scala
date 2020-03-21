package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.incoming
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.establishing
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.established
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.hold
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.transferring
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.transferAccepted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.redirecting
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.terminating
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.terminated
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait CallState extends js.Object

object CallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def established: typingsSlinky.microsoftGraph.microsoftGraphStrings.established = this.cast("established")
  @scala.inline
  def establishing: typingsSlinky.microsoftGraph.microsoftGraphStrings.establishing = this.cast("establishing")
  @scala.inline
  def hold: typingsSlinky.microsoftGraph.microsoftGraphStrings.hold = this.cast("hold")
  @scala.inline
  def incoming: typingsSlinky.microsoftGraph.microsoftGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def redirecting: typingsSlinky.microsoftGraph.microsoftGraphStrings.redirecting = this.cast("redirecting")
  @scala.inline
  def terminated: typingsSlinky.microsoftGraph.microsoftGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def terminating: typingsSlinky.microsoftGraph.microsoftGraphStrings.terminating = this.cast("terminating")
  @scala.inline
  def transferAccepted: typingsSlinky.microsoftGraph.microsoftGraphStrings.transferAccepted = this.cast("transferAccepted")
  @scala.inline
  def transferring: typingsSlinky.microsoftGraph.microsoftGraphStrings.transferring = this.cast("transferring")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

