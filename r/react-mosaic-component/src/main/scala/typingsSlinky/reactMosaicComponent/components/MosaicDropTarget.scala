package typingsSlinky.reactMosaicComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMosaicComponent.internalTypesMod.MosaicDropTargetPosition
import typingsSlinky.reactMosaicComponent.mosaicDropTargetMod.MosaicDropTargetProps
import typingsSlinky.reactMosaicComponent.typesMod.MosaicPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MosaicDropTarget {
  @JSImport("react-mosaic-component/lib/MosaicDropTarget", "MosaicDropTarget")
  @js.native
  object component extends js.Object
  
  def withProps(p: MosaicDropTargetProps): Default[tag.type, typingsSlinky.reactMosaicComponent.mosaicDropTargetMod.MosaicDropTarget] = new Default[tag.type, typingsSlinky.reactMosaicComponent.mosaicDropTargetMod.MosaicDropTarget](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(path: MosaicPath, position: MosaicDropTargetPosition): Default[tag.type, typingsSlinky.reactMosaicComponent.mosaicDropTargetMod.MosaicDropTarget] = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactMosaicComponent.mosaicDropTargetMod.MosaicDropTarget](js.Array(this.component, __props.asInstanceOf[MosaicDropTargetProps]))
  }
}

