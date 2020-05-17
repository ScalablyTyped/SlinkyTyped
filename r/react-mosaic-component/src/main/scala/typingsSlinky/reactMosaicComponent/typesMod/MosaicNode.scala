package typingsSlinky.reactMosaicComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactMosaicComponent.typesMod.MosaicParent[T]
  - T
*/
trait MosaicNode[T /* <: MosaicKey */] extends js.Object

object MosaicNode {
  @scala.inline
  implicit def apply[T](value: MosaicParent[T]): MosaicNode[T] = value.asInstanceOf[MosaicNode[T]]
  @scala.inline
  implicit def apply[T](value: T): MosaicNode[T] = value.asInstanceOf[MosaicNode[T]]
}

