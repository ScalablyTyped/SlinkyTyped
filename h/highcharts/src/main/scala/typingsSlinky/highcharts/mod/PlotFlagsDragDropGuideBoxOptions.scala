package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotFlagsDragDropGuideBoxOptions extends js.Object {
  
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.native
}
object PlotFlagsDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): PlotFlagsDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotFlagsDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class PlotFlagsDragDropGuideBoxOptionsOps[Self <: PlotFlagsDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
