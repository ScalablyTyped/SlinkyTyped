package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.data.ObservableArray
import typingsSlinky.kendoUi.kendo.data.ObservableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBox extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ListBox: ListBoxOptions = js.native
  var wrapper: JQuery = js.native
  def clearSelection(): Unit = js.native
  def dataItem(element: String): ObservableObject = js.native
  def dataItem(element: JQuery): ObservableObject = js.native
  def dataItem(element: Element): ObservableObject = js.native
  def dataItems(): ObservableArray = js.native
  def enable(element: String): Unit = js.native
  def enable(element: String, enable: Boolean): Unit = js.native
  def enable(element: JQuery): Unit = js.native
  def enable(element: JQuery, enable: Boolean): Unit = js.native
  def enable(element: Element): Unit = js.native
  def enable(element: Element, enable: Boolean): Unit = js.native
  def items(): js.Any = js.native
  def refresh(): Unit = js.native
  def remove(element: String): Unit = js.native
  def remove(element: js.Any): Unit = js.native
  def remove(element: JQuery): Unit = js.native
  def remove(element: Element): Unit = js.native
  def reorder(element: String, index: Double): Unit = js.native
  def reorder(element: JQuery, index: Double): Unit = js.native
  def reorder(element: Element, index: Double): Unit = js.native
  def select(): JQuery = js.native
  def select(items: js.Any): Unit = js.native
  def select(items: JQuery): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

