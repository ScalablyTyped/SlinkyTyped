package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesDefaultsLabels extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[ChartSeriesDefaultsLabelsBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[ChartSeriesDefaultsLabelsFrom] = js.native
  
  var margin: js.UndefOr[Double | ChartSeriesDefaultsLabelsMargin] = js.native
  
  var padding: js.UndefOr[Double | ChartSeriesDefaultsLabelsPadding] = js.native
  
  var rotation: js.UndefOr[String | Double] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var to: js.UndefOr[ChartSeriesDefaultsLabelsTo] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartSeriesDefaultsLabels {
  
  @scala.inline
  def apply(): ChartSeriesDefaultsLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsLabels]
  }
  
  @scala.inline
  implicit class ChartSeriesDefaultsLabelsOps[Self <: ChartSeriesDefaultsLabels] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartSeriesDefaultsLabelsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFrom(value: ChartSeriesDefaultsLabelsFrom): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartSeriesDefaultsLabelsMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | ChartSeriesDefaultsLabelsPadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRotation(value: String | Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTo(value: ChartSeriesDefaultsLabelsTo): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
}
