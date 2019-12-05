package typingsSlinky.kendoDashUi.kendo.dataviz.drawing

import typingsSlinky.kendoDashUi.JQuery
import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
class Surface () extends Observable {
  def this(options: SurfaceOptions) = this()
  var element: JQuery = js.native
  var options: SurfaceOptions = js.native
  def clear(): Unit = js.native
  def draw(element: typingsSlinky.kendoDashUi.kendo.drawing.Element): Unit = js.native
  def eventTarget(e: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Element = js.native
  def hideTooltip(): Unit = js.native
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  def showTooltip(element: typingsSlinky.kendoDashUi.kendo.drawing.Element): Unit = js.native
  def showTooltip(element: typingsSlinky.kendoDashUi.kendo.drawing.Element, options: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
object Surface extends js.Object {
  def create(element: JQuery): typingsSlinky.kendoDashUi.kendo.drawing.Surface = js.native
  def create(element: JQuery, options: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Surface = js.native
  def create(element: Element): typingsSlinky.kendoDashUi.kendo.drawing.Surface = js.native
  def create(element: Element, options: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Surface = js.native
}

