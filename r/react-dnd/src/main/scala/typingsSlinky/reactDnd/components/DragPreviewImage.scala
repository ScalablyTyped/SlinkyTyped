package typingsSlinky.reactDnd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragPreviewImage {
  
  @scala.inline
  def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    src: String
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DragPreviewImageProps]))
  }
  
  @JSImport("react-dnd", "DragPreviewImage")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DragPreviewImageProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
