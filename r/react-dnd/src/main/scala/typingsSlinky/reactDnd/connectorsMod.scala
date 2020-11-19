package typingsSlinky.reactDnd

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import typingsSlinky.reactDnd.optionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd/lib/interfaces/connectors", JSImport.Namespace)
@js.native
object connectorsMod extends js.Object {
  
  type ConnectDragPreview = DragElementWrapper[DragPreviewOptions]
  
  type ConnectDragSource = DragElementWrapper[DragSourceOptions]
  
  type ConnectDropTarget = DragElementWrapper[js.Any]
  
  type ConnectableElement = ReactRef[js.Any] | ReactElement | Element | Null
  
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    ReactElement | Null
  ]
}
