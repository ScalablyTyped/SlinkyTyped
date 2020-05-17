package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotConfigurator extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_PivotConfigurator: PivotConfiguratorOptions = js.native
  var wrapper: JQuery = js.native
  def refresh(): Unit = js.native
  def setDataSource(dataSource: PivotDataSource): Unit = js.native
}

