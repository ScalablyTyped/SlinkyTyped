package typingsSlinky.reactDnd

import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactDnd.hooksApiMod.DragObjectWithType
import typingsSlinky.reactDnd.hooksApiMod.DragSourceHookSpec
import typingsSlinky.reactDnd.monitorsMod.DragSourceMonitor
import typingsSlinky.reactDnd.sourceConnectorMod.SourceConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drag", JSImport.Namespace)
@js.native
object dragMod extends js.Object {
  def useDragHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DragSourceHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DragSourceMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDragSourceMonitor(): js.Tuple2[DragSourceMonitor, SourceConnector] = js.native
}

