package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPackedbubbleAnimationOptions extends js.Object {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotPackedbubbleAnimationOptions {
  
  @scala.inline
  def apply(): PlotPackedbubbleAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotPackedbubbleAnimationOptionsOps[Self <: PlotPackedbubbleAnimationOptions] (val x: Self) extends AnyVal {
    
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
