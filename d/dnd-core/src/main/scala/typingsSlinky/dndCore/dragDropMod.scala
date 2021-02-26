package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.DragDropActions
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragDropMod {
  
  @JSImport("dnd-core/lib/actions/dragDrop", "BEGIN_DRAG")
  @js.native
  val BEGIN_DRAG: /* "dnd-core/BEGIN_DRAG" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/dragDrop", "DROP")
  @js.native
  val DROP: /* "dnd-core/DROP" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/dragDrop", "END_DRAG")
  @js.native
  val END_DRAG: /* "dnd-core/END_DRAG" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/dragDrop", "HOVER")
  @js.native
  val HOVER: /* "dnd-core/HOVER" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/dragDrop", "INIT_COORDS")
  @js.native
  val INIT_COORDS: /* "dnd-core/INIT_COORDS" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/dragDrop", "PUBLISH_DRAG_SOURCE")
  @js.native
  val PUBLISH_DRAG_SOURCE: /* "dnd-core/PUBLISH_DRAG_SOURCE" */ String = js.native
  
  @JSImport("dnd-core/lib/actions/dragDrop", "createDragDropActions")
  @js.native
  def createDragDropActions(manager: DragDropManager): DragDropActions = js.native
}
