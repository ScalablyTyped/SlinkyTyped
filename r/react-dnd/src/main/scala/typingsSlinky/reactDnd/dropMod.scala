package typingsSlinky.reactDnd

import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactDnd.hooksApiMod.DragObjectWithType
import typingsSlinky.reactDnd.hooksApiMod.DropTargetHookSpec
import typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor
import typingsSlinky.reactDnd.targetConnectorMod.TargetConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropMod {
  
  @JSImport("react-dnd/lib/hooks/internal/drop", "useDropHandler")
  @js.native
  def useDropHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DropTargetHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DropTargetMonitor,
    connector: js.Any
  ): Unit = js.native
  
  @JSImport("react-dnd/lib/hooks/internal/drop", "useDropTargetMonitor")
  @js.native
  def useDropTargetMonitor(): js.Tuple2[DropTargetMonitor, TargetConnector] = js.native
}
