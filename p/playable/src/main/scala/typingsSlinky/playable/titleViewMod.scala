package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.titleTypesMod.ITitleViewConfig
import typingsSlinky.playable.titleTypesMod.ITitleViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleViewMod {
  
  @JSImport("playable/dist/src/modules/ui/title/title.view", JSImport.Default)
  @js.native
  class default protected () extends TitleView {
    def this(config: ITitleViewConfig) = this()
  }
  
  @js.native
  trait TitleView
    extends typingsSlinky.playable.viewMod.default[ITitleViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setDisplayAsLink(flag: Boolean): Unit = js.native
    
    def setTitle(): Unit = js.native
    def setTitle(title: String): Unit = js.native
    
    def show(): Unit = js.native
  }
}
