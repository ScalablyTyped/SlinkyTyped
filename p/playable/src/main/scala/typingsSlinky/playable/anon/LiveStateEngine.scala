package typingsSlinky.playable.anon

import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.playbackEngineTypesMod.IPlaybackEngine
import typingsSlinky.playable.previewFullSizeTypesMod.IPreviewFullSize
import typingsSlinky.playable.previewThumbnailTypesMod.IPreviewThumbnail
import typingsSlinky.playable.textMapTypesMod.ITextMap
import typingsSlinky.playable.themeTypesMod.IThemeService
import typingsSlinky.playable.tooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStateEngine extends StObject {
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var liveStateEngine: js.Any = js.native
  
  var previewFullSize: IPreviewFullSize = js.native
  
  var previewThumbnail: IPreviewThumbnail = js.native
  
  var textMap: ITextMap = js.native
  
  var theme: IThemeService = js.native
  
  var tooltipService: ITooltipService = js.native
}
object LiveStateEngine {
  
  @scala.inline
  def apply(
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    liveStateEngine: js.Any,
    previewFullSize: IPreviewFullSize,
    previewThumbnail: IPreviewThumbnail,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): LiveStateEngine = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], liveStateEngine = liveStateEngine.asInstanceOf[js.Any], previewFullSize = previewFullSize.asInstanceOf[js.Any], previewThumbnail = previewThumbnail.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStateEngine]
  }
  
  @scala.inline
  implicit class LiveStateEngineMutableBuilder[Self <: LiveStateEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveStateEngine(value: js.Any): Self = StObject.set(x, "liveStateEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewFullSize(value: IPreviewFullSize): Self = StObject.set(x, "previewFullSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewThumbnail(value: IPreviewThumbnail): Self = StObject.set(x, "previewThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
