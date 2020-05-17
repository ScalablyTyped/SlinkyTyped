package typingsSlinky.kendoUi.kendo

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends Observable {
  var content: js.Any = js.native
  var element: JQuery = js.native
  var model: js.Object = js.native
  var tagName: String = js.native
  def destroy(): Unit = js.native
  def init(element: String): Unit = js.native
  def init(element: String, options: ViewOptions): Unit = js.native
  def init(element: Element): Unit = js.native
  def init(element: Element, options: ViewOptions): Unit = js.native
  def render(): JQuery = js.native
  def render(container: js.Any): JQuery = js.native
}

