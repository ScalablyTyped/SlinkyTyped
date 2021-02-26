package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.Action
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.HoverOptions
import typingsSlinky.dndCore.interfacesMod.HoverPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverMod {
  
  @JSImport("dnd-core/lib/actions/dragDrop/hover", "createHover")
  @js.native
  def createHover(manager: DragDropManager): js.Function2[
    /* targetIdsArg */ js.Array[String], 
    /* hasClientOffset */ js.UndefOr[HoverOptions], 
    Action[HoverPayload]
  ] = js.native
}
