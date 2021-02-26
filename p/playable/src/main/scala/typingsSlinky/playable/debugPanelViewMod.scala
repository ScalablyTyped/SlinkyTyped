package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.debugPanelTypesMod.IDebugPanelViewConfig
import typingsSlinky.playable.debugPanelTypesMod.IDebugPanelViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugPanelViewMod {
  
  @JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel.view", JSImport.Default)
  @js.native
  class default protected () extends DebugPanelView {
    def this(config: IDebugPanelViewConfig) = this()
  }
  
  @js.native
  trait DebugPanelView
    extends typingsSlinky.playable.viewMod.default[IDebugPanelViewStyles] {
    
    @JSName("_$closeButton")
    var _$closeButton: js.Any = js.native
    
    @JSName("_$infoContainer")
    var _$infoContainer: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setInfo(info: js.Any): Unit = js.native
    
    def show(): Unit = js.native
  }
}
