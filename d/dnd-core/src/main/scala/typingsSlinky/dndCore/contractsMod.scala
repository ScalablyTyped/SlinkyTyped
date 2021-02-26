package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.DragSource
import typingsSlinky.dndCore.interfacesMod.DropTarget
import typingsSlinky.dndCore.interfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contractsMod {
  
  @JSImport("dnd-core/lib/contracts", "validateSourceContract")
  @js.native
  def validateSourceContract(source: DragSource): Unit = js.native
  
  @JSImport("dnd-core/lib/contracts", "validateTargetContract")
  @js.native
  def validateTargetContract(target: DropTarget): Unit = js.native
  
  @JSImport("dnd-core/lib/contracts", "validateType")
  @js.native
  def validateType(`type`: js.Array[Identifier]): Unit = js.native
  @JSImport("dnd-core/lib/contracts", "validateType")
  @js.native
  def validateType(`type`: js.Array[Identifier], allowArray: Boolean): Unit = js.native
  @JSImport("dnd-core/lib/contracts", "validateType")
  @js.native
  def validateType(`type`: Identifier): Unit = js.native
  @JSImport("dnd-core/lib/contracts", "validateType")
  @js.native
  def validateType(`type`: Identifier, allowArray: Boolean): Unit = js.native
}
