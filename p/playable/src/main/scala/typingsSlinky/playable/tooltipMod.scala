package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.EventEmitterIEventEmitter
import typingsSlinky.playable.getTooltipPositionByReferenceElementMod.ITooltipCenterXfn
import typingsSlinky.playable.tooltipTooltipMod.default
import typingsSlinky.playable.tooltipTypesMod.ITooltipPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip", "Tooltip")
  @js.native
  class Tooltip () extends default
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService")
  @js.native
  class TooltipService protected ()
    extends typingsSlinky.playable.tooltipServiceMod.default {
    def this(hasEventEmitter: EventEmitterIEventEmitter) = this()
  }
  object TooltipService {
    
    @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip", "getTooltipPositionByReferenceElement")
  @js.native
  def getTooltipPositionByReferenceElement(tooltipReferenceElement: HTMLElement, tooltipContainerElement: HTMLElement): ITooltipPosition = js.native
  @JSImport("playable/dist/src/modules/ui/core/tooltip", "getTooltipPositionByReferenceElement")
  @js.native
  def getTooltipPositionByReferenceElement(
    tooltipReferenceElement: HTMLElement,
    tooltipContainerElement: HTMLElement,
    tooltipCenterXfn: ITooltipCenterXfn
  ): ITooltipPosition = js.native
}
