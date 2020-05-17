package typingsSlinky.bitcoinjsLib.paymentsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - scala.Double
*/
trait StackElement extends js.Object

object StackElement {
  @scala.inline
  implicit def apply(value: Buffer): StackElement = value.asInstanceOf[StackElement]
  @scala.inline
  implicit def apply(value: Double): StackElement = value.asInstanceOf[StackElement]
}

