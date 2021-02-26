package typingsSlinky.nodeRedEditorClient.mod

import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.nodeRedEditorClient.anon.Options
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends StObject {
  
  def addItem(id: String): Unit = js.native
  def addItem(id: String, opt: MenuItemOption): Unit = js.native
  
  def init(options: Options): JQuery[HTMLUListElement] = js.native
  
  def isSelected(id: String): Boolean = js.native
  
  def removeItem(id: String): Unit = js.native
  
  def setAction(id: String, action: String): Unit = js.native
  def setAction(id: String, action: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  def setDisabled(id: String, state: Boolean): Unit = js.native
  
  def setSelected(id: String, state: Boolean): Unit = js.native
  
  def toggleSelected(id: String): Unit = js.native
}
