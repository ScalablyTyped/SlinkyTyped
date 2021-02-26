package typingsSlinky.playable.anon

import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.pictureInPictureTypesMod.IPictureInPicture
import typingsSlinky.playable.textMapTypesMod.ITextMap
import typingsSlinky.playable.themeTypesMod.IThemeService
import typingsSlinky.playable.tooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureInPicture extends StObject {
  
  var eventEmitter: IEventEmitter = js.native
  
  var pictureInPicture: IPictureInPicture = js.native
  
  var textMap: ITextMap = js.native
  
  var theme: IThemeService = js.native
  
  var tooltipService: ITooltipService = js.native
}
object PictureInPicture {
  
  @scala.inline
  def apply(
    eventEmitter: IEventEmitter,
    pictureInPicture: IPictureInPicture,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): PictureInPicture = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any], pictureInPicture = pictureInPicture.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPicture]
  }
  
  @scala.inline
  implicit class PictureInPictureMutableBuilder[Self <: PictureInPicture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPicture(value: IPictureInPicture): Self = StObject.set(x, "pictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
