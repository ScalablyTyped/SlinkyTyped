package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.playTypesMod.IPlayViewConfig
import typingsSlinky.playable.playTypesMod.IPlayViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/play/play.view", JSImport.Default)
  @js.native
  class default protected () extends PlayView {
    def this(config: IPlayViewConfig) = this()
  }
  
  @js.native
  trait PlayView
    extends typingsSlinky.playable.viewMod.default[IPlayViewStyles] {
    
    @JSName("_$playbackControl")
    var _$playbackControl: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPlayingState(isPlaying: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
