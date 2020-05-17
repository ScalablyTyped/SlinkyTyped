package typingsSlinky.reactMosaicComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMosaicComponent.mosaicZeroStateMod.MosaicZeroStateProps
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MosaicZeroState {
  @JSImport("react-mosaic-component", "MosaicZeroState")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: MosaicKey] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMosaicComponent.mod.MosaicZeroState[js.Any]] {
    @scala.inline
    def createNode(value: /* repeated */ js.Any => js.Promise[MosaicNode[T]] | MosaicNode[T]): this.type = set("createNode", js.Any.fromFunction1(value))
  }
  
  def withProps[T <: MosaicKey](p: MosaicZeroStateProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T <: MosaicKey](companion: MosaicZeroState.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

