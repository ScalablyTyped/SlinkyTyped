package typingsSlinky.dndCore

import typingsSlinky.dndCore.dragOffsetMod.State
import typingsSlinky.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/utils/coords", JSImport.Namespace)
@js.native
object coordsMod extends js.Object {
  
  def add(a: XYCoord, b: XYCoord): XYCoord = js.native
  
  def getDifferenceFromInitialOffset(state: State): XYCoord | Null = js.native
  
  def getSourceClientOffset(state: State): XYCoord | Null = js.native
  
  def subtract(a: XYCoord, b: XYCoord): XYCoord = js.native
}
