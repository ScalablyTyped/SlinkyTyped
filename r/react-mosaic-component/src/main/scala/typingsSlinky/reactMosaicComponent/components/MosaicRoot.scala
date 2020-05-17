package typingsSlinky.reactMosaicComponent.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMosaicComponent.mosaicRootMod.MosaicRootProps
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import typingsSlinky.reactMosaicComponent.typesMod.ResizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MosaicRoot {
  @JSImport("react-mosaic-component/lib/MosaicRoot", "MosaicRoot")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: MosaicKey] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMosaicComponent.mosaicRootMod.MosaicRoot[js.Any]] {
    @scala.inline
    def resize(value: ResizeOptions): this.type = set("resize", value.asInstanceOf[js.Any])
  }
  
  def withProps[T <: MosaicKey](p: MosaicRootProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T <: MosaicKey](renderTile: (T, /* path */ js.Array[MosaicBranch]) => ReactElement, root: MosaicNode[T]): Builder[T] = {
    val __props = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile), root = root.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[MosaicRootProps[T]]))
  }
}

