package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.mainUiBlockTypesMod.IMainUIBlockViewConfig
import typingsSlinky.playable.mainUiBlockTypesMod.IMainUIBlockViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainUiBlockViewMod {
  
  @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block.view", JSImport.Default)
  @js.native
  class default protected () extends MainUIBlockView {
    def this(config: IMainUIBlockViewConfig) = this()
  }
  
  @js.native
  trait MainUIBlockView
    extends typingsSlinky.playable.viewMod.default[IMainUIBlockViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
  }
}
