package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inbound
  - typings.microsoftDashGraph.microsoftDashGraphStrings.outbound
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait ConnectionDirection extends js.Object

object ConnectionDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.inbound = this.cast("inbound")
  @scala.inline
  def outbound: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.outbound = this.cast("outbound")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

