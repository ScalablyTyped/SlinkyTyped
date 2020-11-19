package typingsSlinky.rcMenu

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcMenu.anon.Find
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu/es/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def getKeyFromChildrenIndex(child: ReactElement, menuEventKey: Key, index: Double): Key = js.native
  
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = js.native
  
  def getWidth(elem: HTMLElement): Double = js.native
  
  def isMobileDevice(): Boolean = js.native
  
  def loopMenuItem(children: ReactElement, cb: js.Function2[/* node */ ReactElement, /* index */ Double, Unit]): Unit = js.native
  
  def loopMenuItemRecursively(children: ReactElement, keys: js.Array[String], ret: Find): Unit = js.native
  
  val menuAllProps: js.Array[String] = js.native
  
  def noop(): Unit = js.native
  
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 765 */ js.Any,
    value: String
  ): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* keyof react.react.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 765 */ js.Any,
    value: Double
  ): Unit = js.native
}
