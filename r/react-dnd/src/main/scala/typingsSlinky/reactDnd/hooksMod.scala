package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.reactDnd.connectorsMod.ConnectDragPreview
import typingsSlinky.reactDnd.connectorsMod.ConnectDragSource
import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.hooksApiMod.DragObjectWithType
import typingsSlinky.reactDnd.hooksApiMod.DragSourceHookSpec
import typingsSlinky.reactDnd.hooksApiMod.DropTargetHookSpec
import typingsSlinky.reactDnd.monitorsMod.DragLayerMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-dnd/lib/hooks", "useDrag")
  @js.native
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
  
  @JSImport("react-dnd/lib/hooks", "useDragDropManager")
  @js.native
  def useDragDropManager(): DragDropManager = js.native
  
  @JSImport("react-dnd/lib/hooks", "useDragLayer")
  @js.native
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
  
  @JSImport("react-dnd/lib/hooks", "useDrop")
  @js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}
