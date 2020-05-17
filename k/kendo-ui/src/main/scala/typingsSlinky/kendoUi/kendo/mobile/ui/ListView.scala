package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListView
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  var wrapper: JQuery = js.native
  def append(dataItems: js.Any): Unit = js.native
  def items(): JQuery = js.native
  def prepend(dataItems: js.Any): Unit = js.native
  def refresh(): Unit = js.native
  def remove(dataItems: js.Any): Unit = js.native
  def replace(dataItems: js.Any): Unit = js.native
  def setDataItem(item: JQuery, dataItem: Model): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

