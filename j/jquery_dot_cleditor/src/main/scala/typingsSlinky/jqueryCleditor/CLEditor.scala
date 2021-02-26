package typingsSlinky.jqueryCleditor

import org.scalajs.dom.raw.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An editor is composed of a main div element used to hold a toolbar,
  * a text area and an iframe. The toolbar can hold multiple groups
  * which in turn hold multiple buttons.
  */
@js.native
trait CLEditor extends StObject {
  
  @JSName("$area")
  var $area: JQuery = js.native
  
  @JSName("$frame")
  var $frame: JQuery = js.native
  
  @JSName("$main")
  var $main: JQuery = js.native
  
  @JSName("$toolbar")
  var $toolbar: JQuery = js.native
  
  def change(handler: js.Function): CLEditor = js.native
  
  def clear(): CLEditor = js.native
  
  def disable(disabled: Boolean): CLEditor = js.native
  
  var disabled: Boolean = js.native
  
  var doc: Document = js.native
  
  def execCommand(commands: String, value: js.Any): CLEditor = js.native
  def execCommand(commands: String, value: js.Any, useCSS: js.UndefOr[scala.Nothing], button: js.Any): CLEditor = js.native
  def execCommand(commands: String, value: js.Any, useCSS: Boolean): CLEditor = js.native
  def execCommand(commands: String, value: js.Any, useCSS: Boolean, button: js.Any): CLEditor = js.native
  
  def focus(): CLEditor = js.native
  
  def hidePopups(): CLEditor = js.native
  
  var options: JQueryCLEditorOptions = js.native
  
  def refresh(): CLEditor = js.native
  
  def select(): CLEditor = js.native
  
  def selectedHTML(): String = js.native
  
  def selectedText(): String = js.native
  
  def showMessage(message: String): CLEditor = js.native
  def showMessage(message: String, button: js.Any): CLEditor = js.native
  
  def sourceMode(): Boolean = js.native
  
  def updateFrame(): CLEditor = js.native
  
  def updateTextArea(): CLEditor = js.native
}
