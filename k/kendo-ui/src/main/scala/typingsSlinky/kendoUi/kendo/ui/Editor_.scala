package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Range
import org.scalajs.dom.raw.Selection
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.ui.editor.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor_ extends Widget {
  
  var body: Element = js.native
  
  def createRange(): Range = js.native
  def createRange(document: Document): Range = js.native
  
  def encodedValue(): String = js.native
  
  def exec(name: String, params: js.Any): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getRange(): Range = js.native
  
  def getSelection(): Selection = js.native
  
  @JSName("options")
  var options_Editor_ : EditorOptions = js.native
  
  def paste(html: String, options: js.Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[_] = js.native
  
  def selectRange(range: Range): Unit = js.native
  
  def selectedHtml(): String = js.native
  
  def state(toolName: String): Boolean = js.native
  
  var toolbar: Toolbar = js.native
  
  def update(): Unit = js.native
  
  def value(): String = js.native
  def value(value: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
