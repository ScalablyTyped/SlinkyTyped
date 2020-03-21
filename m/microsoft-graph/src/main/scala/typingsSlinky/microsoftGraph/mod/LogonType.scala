package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.interactive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.remoteInteractive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.network
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.batch
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.service
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait LogonType extends js.Object

object LogonType {
  @scala.inline
  def batch: typingsSlinky.microsoftGraph.microsoftGraphStrings.batch = this.cast("batch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interactive: typingsSlinky.microsoftGraph.microsoftGraphStrings.interactive = this.cast("interactive")
  @scala.inline
  def network: typingsSlinky.microsoftGraph.microsoftGraphStrings.network = this.cast("network")
  @scala.inline
  def remoteInteractive: typingsSlinky.microsoftGraph.microsoftGraphStrings.remoteInteractive = this.cast("remoteInteractive")
  @scala.inline
  def service: typingsSlinky.microsoftGraph.microsoftGraphStrings.service = this.cast("service")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

