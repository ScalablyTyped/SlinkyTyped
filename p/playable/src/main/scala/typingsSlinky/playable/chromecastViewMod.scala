package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.controlsChromecastTypesMod.IChromecastStyles
import typingsSlinky.playable.controlsChromecastTypesMod.IChromecastViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast.view", JSImport.Default)
  @js.native
  class default protected () extends ChromecastView {
    def this(config: IChromecastViewConfig) = this()
  }
  
  @js.native
  trait ChromecastView
    extends typingsSlinky.playable.viewMod.default[IChromecastStyles] {
    
    @JSName("_$downloadButton")
    var _$downloadButton: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _getLabelText: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCastingState(isCasting: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
