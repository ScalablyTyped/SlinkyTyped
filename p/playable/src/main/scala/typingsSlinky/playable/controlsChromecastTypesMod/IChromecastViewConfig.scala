package typingsSlinky.playable.controlsChromecastTypesMod

import typingsSlinky.playable.textMapTypesMod.ITextMap
import typingsSlinky.playable.themeTypesMod.IThemeService
import typingsSlinky.playable.tooltipTypesMod.ITooltipService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChromecastViewConfig extends js.Object {
  
  var callbacks: IChromecastViewCallbacks = js.native
  
  var textMap: ITextMap = js.native
  
  var theme: IThemeService = js.native
  
  var tooltipService: ITooltipService = js.native
}
object IChromecastViewConfig {
  
  @scala.inline
  def apply(
    callbacks: IChromecastViewCallbacks,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): IChromecastViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChromecastViewConfig]
  }
  
  @scala.inline
  implicit class IChromecastViewConfigOps[Self <: IChromecastViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: IChromecastViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = this.set("textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = this.set("tooltipService", value.asInstanceOf[js.Any])
  }
}
