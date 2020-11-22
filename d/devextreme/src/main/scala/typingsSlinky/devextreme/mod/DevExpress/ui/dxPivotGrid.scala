package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.AlternateDataFields
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSource
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPivotGrid extends Widget {
  
  /**
    * [descr:dxPivotGrid.bindChart(chart, integrationOptions)]
    */
  def bindChart(chart: String, integrationOptions: AlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: js.Any, integrationOptions: AlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: JQuery, integrationOptions: AlternateDataFields): js.Function with Null = js.native
  
  /**
    * [descr:dxPivotGrid.exportToExcel()]
    * @deprecated [depNote:dxPivotGrid.exportToExcel()]
    */
  def exportToExcel(): Unit = js.native
  
  /**
    * [descr:dxPivotGrid.getDataSource()]
    */
  def getDataSource(): PivotGridDataSource = js.native
  
  /**
    * [descr:dxPivotGrid.getFieldChooserPopup()]
    */
  def getFieldChooserPopup(): dxPopup = js.native
  
  /**
    * [descr:dxPivotGrid.updateDimensions()]
    */
  def updateDimensions(): Unit = js.native
}
