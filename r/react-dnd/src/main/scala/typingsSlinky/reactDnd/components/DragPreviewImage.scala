package typingsSlinky.reactDnd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragPreviewImage {
  @JSImport("react-dnd", "DragPreviewImage")
  @js.native
  object component extends js.Object
  
  def withProps(p: DragPreviewImageProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    src: String
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DragPreviewImageProps]))
  }
}

