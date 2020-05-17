package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Filter: FilterOptions = js.native
  var wrapper: JQuery = js.native
  def applyFilter(): Unit = js.native
}

