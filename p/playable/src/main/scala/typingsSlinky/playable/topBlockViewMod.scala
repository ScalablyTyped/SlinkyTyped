package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.topBlockTypesMod.ITopBlockViewConfig
import typingsSlinky.playable.topBlockTypesMod.ITopBlockViewStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/top-block/top-block.view", JSImport.Namespace)
@js.native
object topBlockViewMod extends js.Object {
  
  @js.native
  trait TopBlockView
    extends typingsSlinky.playable.stylableMod.default[ITopBlockViewStyles] {
    
    @JSName("_$liveIndicatorContainer")
    var _$liveIndicatorContainer: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$titleContainer")
    var _$titleContainer: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _preventClickPropagation: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def hideLiveIndicator(): Unit = js.native
    
    def hideTitle(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def showLiveIndicator(): Unit = js.native
    
    def showTitle(): Unit = js.native
  }
  
  @js.native
  class default protected () extends TopBlockView {
    def this(config: ITopBlockViewConfig) = this()
  }
}
