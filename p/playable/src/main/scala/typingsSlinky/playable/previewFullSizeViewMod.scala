package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.previewFullSizeTypesMod.IPreviewFullSizeViewStyles
import typingsSlinky.playable.previewServiceTypesMod.INormalizedFramesQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewFullSizeViewMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size.view", JSImport.Default)
  @js.native
  class default () extends PreviewFullSizeView
  
  @js.native
  trait PreviewFullSizeView
    extends typingsSlinky.playable.viewMod.default[IPreviewFullSizeViewStyles] {
    
    @JSName("_$frame")
    var _$frame: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _applyFrame: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPreview(data: INormalizedFramesQuality): Unit = js.native
    
    def show(): Unit = js.native
  }
}
