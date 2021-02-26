package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenu extends Widget {
  
  def append(item: js.Any): ContextMenu = js.native
  def append(item: js.Any, referenceItem: String): ContextMenu = js.native
  def append(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  
  def close(element: Element): ContextMenu = js.native
  def close(element: JQuery): ContextMenu = js.native
  
  var dataSource: DataSource = js.native
  
  def enable(element: String, enable: Boolean): ContextMenu = js.native
  def enable(element: Element, enable: Boolean): ContextMenu = js.native
  def enable(element: JQuery, enable: Boolean): ContextMenu = js.native
  
  def findByUid(uid: String): JQuery = js.native
  
  def insertAfter(item: js.Any, referenceItem: String): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: Element): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  
  def insertBefore(item: js.Any, referenceItem: String): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: Element): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  
  def open(x: Element): ContextMenu = js.native
  def open(x: Element, y: Double): ContextMenu = js.native
  def open(x: Double): ContextMenu = js.native
  def open(x: Double, y: Double): ContextMenu = js.native
  def open(x: JQuery): ContextMenu = js.native
  def open(x: JQuery, y: Double): ContextMenu = js.native
  
  @JSName("options")
  var options_ContextMenu: ContextMenuOptions = js.native
  
  def remove(element: String): ContextMenu = js.native
  def remove(element: Element): ContextMenu = js.native
  def remove(element: JQuery): ContextMenu = js.native
  
  var wrapper: JQuery = js.native
}
