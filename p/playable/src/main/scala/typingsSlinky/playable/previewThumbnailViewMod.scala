package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.previewServiceTypesMod.INormalizedFramesQuality
import typingsSlinky.playable.previewThumbnailTypesMod.IPreviewThumbnailViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewThumbnailViewMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail.view", JSImport.Default)
  @js.native
  class default () extends PreviewThumbnailView
  
  @js.native
  trait PreviewThumbnailView
    extends typingsSlinky.playable.viewMod.default[IPreviewThumbnailViewStyles] {
    
    @JSName("_$highQualityThumb")
    var _$highQualityThumb: js.Any = js.native
    
    @JSName("_$lowQualityThumb")
    var _$lowQualityThumb: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$timeText")
    var _$timeText: js.Any = js.native
    
    var _applyQualityToThumbElement: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def clearHighQualityPreview(): Unit = js.native
    
    def clearLowQualityPreview(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def setHighQualityPreview(qualityData: INormalizedFramesQuality): Unit = js.native
    
    def setLowQualityPreview(qualityData: INormalizedFramesQuality): Unit = js.native
    
    def setTime(time: String): Unit = js.native
    
    def showAsEmpty(): Unit = js.native
    
    def showWithPreview(): Unit = js.native
  }
}
