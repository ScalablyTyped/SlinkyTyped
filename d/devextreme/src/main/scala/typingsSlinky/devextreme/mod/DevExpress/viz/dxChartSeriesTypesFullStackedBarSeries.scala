package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @name dxChartSeriesTypes.FullStackedBarSeries */
@js.native
trait dxChartSeriesTypesFullStackedBarSeries extends dxChartSeriesTypesCommonSeries {
  
  /** @name dxChartSeriesTypes.FullStackedBarSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[dxChartSeriesTypesFullStackedBarSeriesAggregation] = js.native
  
  /** @name dxChartSeriesTypes.FullStackedBarSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  
  /** @name dxChartSeriesTypes.FullStackedBarSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[dxChartSeriesTypesFullStackedBarSeriesLabel] = js.native
  
  /** @name dxChartSeriesTypes.FullStackedBarSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
}
object dxChartSeriesTypesFullStackedBarSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesFullStackedBarSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedBarSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesFullStackedBarSeriesOps[Self <: dxChartSeriesTypesFullStackedBarSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesFullStackedBarSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesFullStackedBarSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
