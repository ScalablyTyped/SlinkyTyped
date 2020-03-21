package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonAlternateDataFields
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSource
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGrid extends Widget {
  /** Binds a Chart to the PivotGrid. */
  def bindChart(chart: String, integrationOptions: AnonAlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: js.Any, integrationOptions: AnonAlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: JQuery, integrationOptions: AnonAlternateDataFields): js.Function with Null = js.native
  /** Exports pivot grid data to the Excel file. */
  def exportToExcel(): Unit = js.native
  /** Gets the PivotGridDataSource instance. */
  def getDataSource(): PivotGridDataSource = js.native
  /** Gets the Popup instance of the field chooser window. */
  def getFieldChooserPopup(): dxPopup = js.native
  /** Updates the widget to the size of its content. */
  def updateDimensions(): Unit = js.native
}

