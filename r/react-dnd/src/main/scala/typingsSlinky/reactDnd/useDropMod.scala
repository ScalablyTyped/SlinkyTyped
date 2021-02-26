package typingsSlinky.reactDnd

import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.hooksApiMod.DragObjectWithType
import typingsSlinky.reactDnd.hooksApiMod.DropTargetHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDropMod {
  
  @JSImport("react-dnd/lib/hooks/useDrop", "useDrop")
  @js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}
