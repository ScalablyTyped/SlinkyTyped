package typingsSlinky.chartjsPluginCrosshair.mod.chartJsAugmentingMod

import typingsSlinky.chartjsPluginCrosshair.mod.CrosshairOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPluginsOptions extends js.Object {
  
  var crosshair: js.UndefOr[CrosshairOptions] = js.native
}
object ChartPluginsOptions {
  
  @scala.inline
  def apply(): ChartPluginsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPluginsOptions]
  }
  
  @scala.inline
  implicit class ChartPluginsOptionsOps[Self <: ChartPluginsOptions] (val x: Self) extends AnyVal {
    
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
    def setCrosshair(value: CrosshairOptions): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
  }
}
