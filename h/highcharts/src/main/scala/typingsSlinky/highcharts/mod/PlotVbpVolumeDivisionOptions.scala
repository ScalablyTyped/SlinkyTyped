package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVbpVolumeDivisionOptions extends js.Object {
  
  /**
    * (Highstock) Option to control if volume is divided.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var styles: js.UndefOr[PlotVbpVolumeDivisionStylesOptions] = js.native
}
object PlotVbpVolumeDivisionOptions {
  
  @scala.inline
  def apply(): PlotVbpVolumeDivisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpVolumeDivisionOptions]
  }
  
  @scala.inline
  implicit class PlotVbpVolumeDivisionOptionsOps[Self <: PlotVbpVolumeDivisionOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setStyles(value: PlotVbpVolumeDivisionStylesOptions): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
