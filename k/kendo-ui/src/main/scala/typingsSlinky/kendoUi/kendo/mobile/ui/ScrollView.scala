package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollView
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ScrollView: ScrollViewOptions = js.native
  var wrapper: JQuery = js.native
  def content(content: String): Unit = js.native
  def content(content: JQuery): Unit = js.native
  def next(): Unit = js.native
  def prev(): Unit = js.native
  def refresh(): Unit = js.native
  def scrollTo(page: Double, instant: Boolean): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def value(dataItem: js.Any): js.Any = js.native
}

