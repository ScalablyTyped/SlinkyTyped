package typingsSlinky.rcMenu

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcMenu.anon.Find
import typingsSlinky.rcMenu.rcMenuStrings.hack
import typingsSlinky.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-menu/es/util", "getKeyFromChildrenIndex")
  @js.native
  def getKeyFromChildrenIndex(child: ReactElement, menuEventKey: Key, index: Double): Key = js.native
  
  @JSImport("rc-menu/es/util", "getMenuIdFromSubMenuEventKey")
  @js.native
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = js.native
  
  @JSImport("rc-menu/es/util", "getWidth")
  @js.native
  def getWidth(elem: HTMLElement): Double = js.native
  @JSImport("rc-menu/es/util", "getWidth")
  @js.native
  def getWidth(elem: HTMLElement, includeMargin: Boolean): Double = js.native
  
  @JSImport("rc-menu/es/util", "isMobileDevice")
  @js.native
  def isMobileDevice(): Boolean = js.native
  
  @JSImport("rc-menu/es/util", "loopMenuItem")
  @js.native
  def loopMenuItem(children: ReactElement, cb: js.Function2[/* node */ ReactElement, /* index */ Double, Unit]): Unit = js.native
  
  @JSImport("rc-menu/es/util", "loopMenuItemRecursively")
  @js.native
  def loopMenuItemRecursively(children: ReactElement, keys: js.Array[String], ret: Find): Unit = js.native
  
  @JSImport("rc-menu/es/util", "menuAllProps")
  @js.native
  val menuAllProps: js.Array[String] = js.native
  
  @JSImport("rc-menu/es/util", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("rc-menu/es/util", "setStyle")
  @js.native
  def setStyle_hack(elem: HTMLElement, styleProperty: hack, value: String): Unit = js.native
  @JSImport("rc-menu/es/util", "setStyle")
  @js.native
  def setStyle_hack(elem: HTMLElement, styleProperty: hack, value: Double): Unit = js.native
}
