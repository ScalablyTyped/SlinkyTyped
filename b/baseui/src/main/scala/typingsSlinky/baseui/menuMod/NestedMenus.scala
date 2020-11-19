package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/menu", "NestedMenus")
@js.native
class NestedMenus ()
  extends Component[NestedMenuProps, NestedMenuState, js.Any] {
  
  def addMenuToNesting(ref: Ref[HTMLElement]): Unit = js.native
  
  def findMenuIndexByRef(ref: Ref[HTMLElement]): Double = js.native
  
  def getChildMenu(ref: Ref[HTMLElement]): Ref[HTMLElement] = js.native
  
  def getParentMenu(ref: Ref[HTMLElement]): Ref[HTMLElement] = js.native
  
  def removeMenuFromNesting(ref: Ref[HTMLElement]): Unit = js.native
}
