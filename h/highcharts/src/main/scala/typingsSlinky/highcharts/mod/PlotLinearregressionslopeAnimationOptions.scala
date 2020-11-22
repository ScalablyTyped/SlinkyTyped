package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotLinearregressionslopeAnimationOptions extends js.Object {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotLinearregressionslopeAnimationOptions {
  
  @scala.inline
  def apply(): PlotLinearregressionslopeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLinearregressionslopeAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotLinearregressionslopeAnimationOptionsOps[Self <: PlotLinearregressionslopeAnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setDefer(value: Double): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
  }
}
