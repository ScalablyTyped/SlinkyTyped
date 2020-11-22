package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.screenTypesMod.IScreenViewConfig
import typingsSlinky.playable.screenTypesMod.IScreenViewStyles
import typingsSlinky.playable.screenTypesMod.VideoViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/screen/screen.view", JSImport.Namespace)
@js.native
object screenViewMod extends js.Object {
  
  @js.native
  trait ScreenView
    extends typingsSlinky.playable.stylableMod.default[IScreenViewStyles] {
    
    @JSName("_$canvas")
    var _$canvas: js.Any = js.native
    
    @JSName("_$playbackElement")
    var _$playbackElement: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _clearBackground: js.Any = js.native
    
    var _currentMode: js.Any = js.native
    
    var _drawAreaFromSource: js.Any = js.native
    
    var _drawBackground: js.Any = js.native
    
    var _getCanvasAreas: js.Any = js.native
    
    var _getSourceAreas: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isHorizontalStripes: js.Any = js.native
    
    var _requestAnimationFrameID: js.Any = js.native
    
    var _startUpdatingBackground: js.Any = js.native
    
    var _stopUpdatingBackground: js.Any = js.native
    
    var _styleNamesByViewMode: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _updateBackground: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def focusOnNode(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideCursor(): Unit = js.native
    
    def resetAspectRatio(): Unit = js.native
    
    def resetBackground(): Unit = js.native
    
    def setBackgroundHeight(height: Double): Unit = js.native
    
    def setBackgroundSize(width: Double, height: Double): Unit = js.native
    
    def setBackgroundWidth(width: Double): Unit = js.native
    
    def setViewMode(viewMode: VideoViewMode): Unit = js.native
    
    def show(): Unit = js.native
    
    def showCursor(): Unit = js.native
  }
  
  @js.native
  class default protected () extends ScreenView {
    def this(config: IScreenViewConfig) = this()
  }
}
