package typingsSlinky.reactDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectorsMod {
  type ConnectDragPreview = typingsSlinky.reactDnd.connectorsMod.DragElementWrapper[typingsSlinky.reactDnd.optionsMod.DragPreviewOptions]
  type ConnectDragSource = typingsSlinky.reactDnd.connectorsMod.DragElementWrapper[typingsSlinky.reactDnd.optionsMod.DragSourceOptions]
  type ConnectDropTarget = typingsSlinky.reactDnd.connectorsMod.DragElementWrapper[js.Any]
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ typingsSlinky.reactDnd.connectorsMod.ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    slinky.core.facade.ReactElement | scala.Null
  ]
}
