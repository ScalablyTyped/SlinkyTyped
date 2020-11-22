package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.EventEmitterIEventEmitter
import typingsSlinky.playable.getTooltipPositionByReferenceElementMod.ITooltipCenterXfn
import typingsSlinky.playable.tooltipTooltipMod.default
import typingsSlinky.playable.tooltipTypesMod.ITooltipPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/tooltip", JSImport.Namespace)
@js.native
object tooltipMod extends js.Object {
  
  def getTooltipPositionByReferenceElement(tooltipReferenceElement: HTMLElement, tooltipContainerElement: HTMLElement): ITooltipPosition = js.native
  def getTooltipPositionByReferenceElement(
    tooltipReferenceElement: HTMLElement,
    tooltipContainerElement: HTMLElement,
    tooltipCenterXfn: ITooltipCenterXfn
  ): ITooltipPosition = js.native
  
  @js.native
  class Tooltip () extends default
  
  @js.native
  class TooltipService protected ()
    extends typingsSlinky.playable.tooltipServiceMod.default {
    def this(hasEventEmitter: EventEmitterIEventEmitter) = this()
  }
  /* static members */
  @js.native
  object TooltipService extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
