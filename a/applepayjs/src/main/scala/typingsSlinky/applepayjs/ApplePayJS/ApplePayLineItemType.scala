package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that indicates whether a line item is final or pending.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.`final`
  - typings.applepayjs.applepayjsStrings.pending
*/
trait ApplePayLineItemType extends js.Object

object ApplePayLineItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `final`: typingsSlinky.applepayjs.applepayjsStrings.`final` = this.cast("final")
  @scala.inline
  def pending: typingsSlinky.applepayjs.applepayjsStrings.pending = this.cast("pending")
}

