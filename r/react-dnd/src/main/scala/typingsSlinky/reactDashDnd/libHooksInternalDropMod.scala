package typingsSlinky.reactDashDnd

import typingsSlinky.react.reactMod.MutableRefObject
import typingsSlinky.reactDashDnd.libCommonTargetConnectorMod.TargetConnector
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DropTargetHookSpec
import typingsSlinky.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drop", JSImport.Namespace)
@js.native
object libHooksInternalDropMod extends js.Object {
  def useDropHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DropTargetHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DropTargetMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDropTargetMonitor(): js.Tuple2[DropTargetMonitor, TargetConnector] = js.native
}

