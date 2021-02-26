package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.EventEmitterIEventEmitter
import typingsSlinky.playable.tooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipServiceMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", JSImport.Default)
  @js.native
  class default protected () extends TooltipService {
    def this(hasEventEmitter: EventEmitterIEventEmitter) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
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
}
