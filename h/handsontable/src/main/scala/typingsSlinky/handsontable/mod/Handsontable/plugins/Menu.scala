package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends StObject {
  
  def close(): Unit = js.native
  def close(closeParent: Boolean): Unit = js.native
  
  def closeAllSubMenus(): Unit = js.native
  
  def closeSubMenu(row: Double): Unit = js.native
  
  var container: HTMLElement = js.native
  
  def destroy(): Unit = js.native
  
  var eventManager: EventManager = js.native
  
  def executeCommand(event: Event): Unit = js.native
  
  var hot: Core = js.native
  
  var hotMenu: Core = js.native
  
  var hotSubMenus: js.Object = js.native
  
  def isOpened(): Boolean = js.native
  
  def isSubMenu(): Boolean = js.native
  
  var keyEvent: Boolean = js.native
  
  var menuItems: js.Array[_] | Null = js.native
  
  var offset: js.Object = js.native
  
  def open(): Unit = js.native
  
  def openSubMenu(row: Double): Menu | Boolean = js.native
  
  var options: js.Object = js.native
  
  var origOutsideClickDeselects: Boolean | js.Function0[Unit] = js.native
  
  var parentMenu: Menu | Null = js.native
  
  def selectFirstCell(): Unit = js.native
  
  def selectLastCell(): Unit = js.native
  
  def selectNextCell(row: Double, col: Double): Unit = js.native
  
  def selectPrevCell(row: Double, col: Double): Unit = js.native
  
  def setMenuItems(menuItems: js.Array[_]): Unit = js.native
  
  def setOffset(area: String): Unit = js.native
  def setOffset(area: String, offset: Double): Unit = js.native
  
  def setPosition(coords: js.Object): Unit = js.native
  def setPosition(coords: Event): Unit = js.native
  
  def setPositionAboveCursor(cursor: Cursor): Unit = js.native
  
  def setPositionBelowCursor(cursor: Cursor): Unit = js.native
  
  def setPositionOnLeftOfCursor(cursor: Cursor): Unit = js.native
  
  def setPositionOnRightOfCursor(cursor: Cursor): Unit = js.native
}
