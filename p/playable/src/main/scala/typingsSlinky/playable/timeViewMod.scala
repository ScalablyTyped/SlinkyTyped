package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.timeTypesMod.ITimeViewConfig
import typingsSlinky.playable.timeTypesMod.ITimeViewStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/time/time.view", JSImport.Namespace)
@js.native
object timeViewMod extends js.Object {
  
  @js.native
  trait TimeView
    extends typingsSlinky.playable.stylableMod.default[ITimeViewStyles] {
    
    @JSName("_$currentTime")
    var _$currentTime: js.Any = js.native
    
    @JSName("_$durationTime")
    var _$durationTime: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _current: js.Any = js.native
    
    var _duration: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isBackward: js.Any = js.native
    
    var _updateCurrentTime: js.Any = js.native
    
    var _updateDurationTime: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideDuration(): Unit = js.native
    
    def setCurrentTime(current: Double): Unit = js.native
    
    def setCurrentTimeBackward(_isBackward: Boolean): Unit = js.native
    
    def setDurationTime(duration: Double): Unit = js.native
    
    def show(): Unit = js.native
    
    def showDuration(): Unit = js.native
  }
  
  @js.native
  class default protected () extends TimeView {
    def this(config: ITimeViewConfig) = this()
  }
}
