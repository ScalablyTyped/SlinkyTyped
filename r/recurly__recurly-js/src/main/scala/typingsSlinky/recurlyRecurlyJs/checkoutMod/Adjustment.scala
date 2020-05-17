package typingsSlinky.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.recurlyRecurlyJs.checkoutMod.ItemAdjustment
  - typingsSlinky.recurlyRecurlyJs.checkoutMod.NonItemAdjustment
*/
trait Adjustment extends js.Object

object Adjustment {
  @scala.inline
  implicit def apply(value: ItemAdjustment): Adjustment = value.asInstanceOf[Adjustment]
  @scala.inline
  implicit def apply(value: NonItemAdjustment): Adjustment = value.asInstanceOf[Adjustment]
}

