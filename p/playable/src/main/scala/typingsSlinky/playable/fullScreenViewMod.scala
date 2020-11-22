package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.fullScreenTypesMod.IFullScreenViewConfig
import typingsSlinky.playable.fullScreenTypesMod.IFullScreenViewStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen.view", JSImport.Namespace)
@js.native
object fullScreenViewMod extends js.Object {
  
  @js.native
  trait FullScreenView
    extends typingsSlinky.playable.stylableMod.default[IFullScreenViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$toggleFullScreenControl")
    var _$toggleFullScreenControl: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setFullScreenState(isInFullScreen: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  class default protected () extends FullScreenView {
    def this(config: IFullScreenViewConfig) = this()
  }
}
