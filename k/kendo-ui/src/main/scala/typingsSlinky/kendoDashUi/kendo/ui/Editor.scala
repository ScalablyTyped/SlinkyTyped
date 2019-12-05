package typingsSlinky.kendoDashUi.kendo.ui

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Range
import org.scalajs.dom.raw.Selection
import typingsSlinky.kendoDashUi.JQuery
import typingsSlinky.kendoDashUi.JQueryPromise
import typingsSlinky.kendoDashUi.kendo.ui.editor.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Editor")
@js.native
class Editor protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: EditorOptions) = this()
  var body: Element = js.native
  @JSName("options")
  var options_Editor: EditorOptions = js.native
  var toolbar: Toolbar = js.native
  var wrapper: JQuery = js.native
  def createRange(): Range = js.native
  def createRange(document: Document): Range = js.native
  def encodedValue(): String = js.native
  def exec(name: String, params: js.Any): Unit = js.native
  def focus(): Unit = js.native
  def getRange(): Range = js.native
  def getSelection(): Selection = js.native
  def paste(html: String, options: js.Any): Unit = js.native
  def refresh(): Unit = js.native
  def saveAsPDF(): JQueryPromise[_] = js.native
  def selectRange(range: Range): Unit = js.native
  def selectedHtml(): String = js.native
  def state(toolName: String): Boolean = js.native
  def update(): Unit = js.native
  def value(): String = js.native
  def value(value: String): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Editor")
@js.native
object Editor extends js.Object {
  var fn: Editor = js.native
  def extend(proto: js.Object): Editor = js.native
}

@JSGlobal("kendo.ui.editor")
@js.native
object editor extends js.Object {
  @js.native
  class Toolbar () extends Widget {
    var window: Window = js.native
  }
  
}

