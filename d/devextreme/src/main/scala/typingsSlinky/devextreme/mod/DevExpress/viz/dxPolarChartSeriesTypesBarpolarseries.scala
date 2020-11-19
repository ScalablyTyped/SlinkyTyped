package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartSeriesTypesBarpolarseries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  
  /** @name dxPolarChartSeriesTypes.barpolarseries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesBarpolarseries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  
  /** @name dxPolarChartSeriesTypes.barpolarseries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesBarpolarseries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
}
object dxPolarChartSeriesTypesBarpolarseries {
  
  @scala.inline
  def apply(): dxPolarChartSeriesTypesBarpolarseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesBarpolarseries]
  }
  
  @scala.inline
  implicit class dxPolarChartSeriesTypesBarpolarseriesOps[Self <: dxPolarChartSeriesTypesBarpolarseries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
