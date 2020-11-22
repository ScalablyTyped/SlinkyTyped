package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartArcOptions extends js.Object {
  
  var angle: js.UndefOr[Double] = js.native
  
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  
  var borderAlign: js.UndefOr[BorderAlignment] = js.native
  
  var borderColor: js.UndefOr[ChartColor] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
}
object ChartArcOptions {
  
  @scala.inline
  def apply(): ChartArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartArcOptions]
  }
  
  @scala.inline
  implicit class ChartArcOptionsOps[Self <: ChartArcOptions] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = this.set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundColorCanvasPattern(value: CanvasPattern): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorCanvasGradient(value: CanvasGradient): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderAlign(value: BorderAlignment): Self = this.set("borderAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderAlign: Self = this.set("borderAlign", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = this.set("borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderColorCanvasPattern(value: CanvasPattern): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorCanvasGradient(value: CanvasGradient): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: ChartColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
  }
}
