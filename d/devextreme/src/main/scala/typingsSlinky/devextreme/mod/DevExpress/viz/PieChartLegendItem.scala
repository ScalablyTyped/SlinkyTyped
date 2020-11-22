package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartLegendItem extends BaseLegendItem {
  
  /**
    * [descr:PieChartLegendItem.argument]
    */
  var argument: js.UndefOr[String | js.Date | Double] = js.native
  
  /**
    * [descr:PieChartLegendItem.argumentIndex]
    */
  var argumentIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:PieChartLegendItem.points]
    */
  var points: js.UndefOr[js.Array[piePointObject]] = js.native
  
  /**
    * [descr:PieChartLegendItem.text]
    */
  @JSName("text")
  var text_PieChartLegendItem: js.UndefOr[js.Any] = js.native
}
object PieChartLegendItem {
  
  @scala.inline
  def apply(): PieChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartLegendItem]
  }
  
  @scala.inline
  implicit class PieChartLegendItemOps[Self <: PieChartLegendItem] (val x: Self) extends AnyVal {
    
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
    def setArgumentDate(value: js.Date): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgument(value: String | js.Date | Double): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    
    @scala.inline
    def setArgumentIndex(value: Double): Self = this.set("argumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentIndex: Self = this.set("argumentIndex", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: piePointObject*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[piePointObject]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
