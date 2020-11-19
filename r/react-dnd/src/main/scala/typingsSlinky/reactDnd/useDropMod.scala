package typingsSlinky.reactDnd

import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.hooksApiMod.DragObjectWithType
import typingsSlinky.reactDnd.hooksApiMod.DropTargetHookSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd/lib/hooks/useDrop", JSImport.Namespace)
@js.native
object useDropMod extends js.Object {
  
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}
