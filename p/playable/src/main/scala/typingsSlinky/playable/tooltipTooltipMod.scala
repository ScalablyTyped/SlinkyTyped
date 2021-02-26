package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.tooltipTypesMod.ITooltip
import typingsSlinky.playable.tooltipTypesMod.ITooltipStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip", JSImport.Default)
  @js.native
  class default () extends Tooltip
  
  @js.native
  trait Tooltip
    extends typingsSlinky.playable.stylableMod.default[ITooltipStyles]
       with ITooltip {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$tooltipInner")
    var _$tooltipInner: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isHidden: js.Any = js.native
    
    var _showAsElement: js.Any = js.native
    
    var _showAsText: js.Any = js.native
    
    def clearElement(): Unit = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltip: Boolean = js.native
    
    def setElement(element: HTMLElement): Unit = js.native
    
    def setStyle(style: js.Any): Unit = js.native
  }
}
