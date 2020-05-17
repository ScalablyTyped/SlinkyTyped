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
trait ListView extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  var wrapper: JQuery = js.native
  def add(): Unit = js.native
  def cancel(): Unit = js.native
  def clearSelection(): Unit = js.native
  def dataItem(row: String): ObservableObject = js.native
  def dataItem(row: JQuery): ObservableObject = js.native
  def dataItem(row: Element): ObservableObject = js.native
  def dataItems(): ObservableArray = js.native
  def edit(item: JQuery): Unit = js.native
  def items(): js.Any = js.native
  def refresh(): Unit = js.native
  def remove(item: js.Any): Unit = js.native
  def save(): Unit = js.native
  def select(): JQuery = js.native
  def select(items: js.Any): Unit = js.native
  def select(items: JQuery): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

