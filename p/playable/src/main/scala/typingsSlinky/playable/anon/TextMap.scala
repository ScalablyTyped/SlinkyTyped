package typingsSlinky.playable.anon

import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.textMapTypesMod.ITextMap
import typingsSlinky.playable.themeTypesMod.IThemeService
import typingsSlinky.playable.tooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMap extends StObject {
  
  var eventEmitter: IEventEmitter = js.native
  
  var textMap: ITextMap = js.native
  
  var theme: IThemeService = js.native
  
  var tooltipService: ITooltipService = js.native
}
object TextMap {
  
  @scala.inline
  def apply(
    eventEmitter: IEventEmitter,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): TextMap = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMap]
  }
  
  @scala.inline
  implicit class TextMapMutableBuilder[Self <: TextMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
