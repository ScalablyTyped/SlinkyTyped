package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.DragSource
import typingsSlinky.dndCore.interfacesMod.DropTarget
import typingsSlinky.dndCore.interfacesMod.Identifier
import typingsSlinky.dndCore.interfacesMod.SourceType
import typingsSlinky.dndCore.interfacesMod.TargetType
import typingsSlinky.dndCore.interfacesMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrationMod {
  
  @JSImport("react-dnd/lib/common/registration", "registerSource")
  @js.native
  def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
  
  @JSImport("react-dnd/lib/common/registration", "registerTarget")
  @js.native
  def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
}
