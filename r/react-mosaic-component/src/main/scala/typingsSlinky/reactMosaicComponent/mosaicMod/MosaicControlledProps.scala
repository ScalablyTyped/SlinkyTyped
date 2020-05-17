package typingsSlinky.reactMosaicComponent.mosaicMod

import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicControlledProps[T /* <: MosaicKey */]
  extends MosaicBaseProps[T]
     with MosaicProps[T] {
  /**
    * The tree to render
    */
  var value: MosaicNode[T] | Null = js.native
  @JSName("onChange")
  def onChange_MMosaicControlledProps(): Unit = js.native
  @JSName("onChange")
  def onChange_MMosaicControlledProps(newNode: MosaicNode[T]): Unit = js.native
}

