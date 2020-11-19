package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDefinition extends js.Object {
  
  /** Color of the line that indicates the starting point of the row in plotting area.
    * @Default {transparent}
    */
  var lineColor: js.UndefOr[String] = js.native
  
  /** Width of the line that indicates the starting point of the row in plot area.
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /** Height of the row in plotting area. Height is measured in either pixel or percentage based on the value of unit property.
    * @Default {50}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /** Specifies the unit to measure the height of the row in plotting area.
    * @Default {'pixel'. See Unit}
    */
  var unit: js.UndefOr[Unit | String] = js.native
}
object RowDefinition {
  
  @scala.inline
  def apply(): RowDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDefinition]
  }
  
  @scala.inline
  implicit class RowDefinitionOps[Self <: RowDefinition] (val x: Self) extends AnyVal {
    
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
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit | String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
