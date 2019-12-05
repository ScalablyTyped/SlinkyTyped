package typingsSlinky.reactDashDnd

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectableElement
import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.DragElementWrapper
import typingsSlinky.reactDashDnd.libInterfacesOptionsMod.DragPreviewOptions
import typingsSlinky.reactDashDnd.libInterfacesOptionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/interfaces/connectors", JSImport.Namespace)
@js.native
object libInterfacesConnectorsMod extends js.Object {
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

