package typingsSlinky.reactDnd

import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactDnd.hooksApiMod.DragObjectWithType
import typingsSlinky.reactDnd.hooksApiMod.DropTargetHookSpec
import typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor
import typingsSlinky.reactDnd.targetConnectorMod.TargetConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drop", JSImport.Namespace)
@js.native
object dropMod extends js.Object {
  def useDropHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DropTargetHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DropTargetMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDropTargetMonitor(): js.Tuple2[DropTargetMonitor, TargetConnector] = js.native
}

