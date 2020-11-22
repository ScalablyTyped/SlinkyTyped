package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.EventEmitterIEventEmitter
import typingsSlinky.playable.tooltipTypesMod.ITooltipService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", JSImport.Namespace)
@js.native
object tooltipServiceMod extends js.Object {
  
  @js.native
  trait TooltipService extends ITooltipService {
    
    var _bindEvents: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _tooltip: js.Any = js.native
    
    var _tooltipContainer: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def clearElement(): Unit = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltipService: Boolean = js.native
    
    @JSName("tooltipContainerElement")
    def tooltipContainerElement_MTooltipService: HTMLElement = js.native
  }
  
  @js.native
  class default protected () extends TooltipService {
    def this(hasEventEmitter: EventEmitterIEventEmitter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
