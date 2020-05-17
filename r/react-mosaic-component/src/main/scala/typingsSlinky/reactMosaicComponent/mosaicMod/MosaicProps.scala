package typingsSlinky.reactMosaicComponent.mosaicMod

import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactMosaicComponent.mosaicMod.MosaicControlledProps[T]
  - typingsSlinky.reactMosaicComponent.mosaicMod.MosaicUncontrolledProps[T]
*/
trait MosaicProps[T /* <: MosaicKey */] extends js.Object

object MosaicProps {
  @scala.inline
  implicit def apply[T](value: MosaicControlledProps[T]): MosaicProps[T] = value.asInstanceOf[MosaicProps[T]]
  @scala.inline
  implicit def apply[T](value: MosaicUncontrolledProps[T]): MosaicProps[T] = value.asInstanceOf[MosaicProps[T]]
}

