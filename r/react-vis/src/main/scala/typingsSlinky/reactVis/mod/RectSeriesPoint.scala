package typingsSlinky.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectSeriesPoint extends AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.native
  
  var fill: js.UndefOr[String | Double] = js.native
  
  var opacity: js.UndefOr[String | Double] = js.native
  
  var stroke: js.UndefOr[String | Double] = js.native
  
  var x: String | Double | js.Date = js.native
  
  var x0: String | Double | js.Date = js.native
  
  var y: String | Double | js.Date = js.native
  
  var y0: String | Double | js.Date = js.native
}
object RectSeriesPoint {
  
  @scala.inline
  def apply(
    x: String | Double | js.Date,
    x0: String | Double | js.Date,
    y: String | Double | js.Date,
    y0: String | Double | js.Date
  ): RectSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectSeriesPoint]
  }
  
  @scala.inline
  implicit class RectSeriesPointOps[Self <: RectSeriesPoint] (val x: Self) extends AnyVal {
    
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
    def setXDate(value: js.Date): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String | Double | js.Date): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Date(value: js.Date): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(value: String | Double | js.Date): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDate(value: js.Date): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | Double | js.Date): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Date(value: js.Date): Self = this.set("y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: String | Double | js.Date): Self = this.set("y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFill(value: String | Double): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
