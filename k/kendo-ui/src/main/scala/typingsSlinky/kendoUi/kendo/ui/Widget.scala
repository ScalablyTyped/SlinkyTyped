package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Widget extends Observable {
  
  def destroy(): Unit = js.native
  
  var element: JQuery = js.native
  
  var events: js.Array[String] = js.native
  
  def init(element: JQuery): Unit = js.native
  def init(element: JQuery, options: js.Object): Unit = js.native
  def init(element: Element): Unit = js.native
  def init(element: Element, options: js.Object): Unit = js.native
  def init(selector: String): Unit = js.native
  def init(selector: String, options: js.Object): Unit = js.native
  
  var options: js.Any = js.native
  
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  
  def setOptions(options: js.Object): Unit = js.native
}
