package typingsSlinky.popperjsCore.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.enumsMod.BasePlacement
import typingsSlinky.popperjsCore.typesMod.PositioningStrategy
import typingsSlinky.popperjsCore.typesMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adaptive extends js.Object {
  
  var adaptive: Boolean = js.native
  
  var gpuAcceleration: Boolean = js.native
  
  var offsets: Partialxnumberynumbercent = js.native
  
  var placement: BasePlacement = js.native
  
  var popper: HTMLElement = js.native
  
  var popperRect: Rect = js.native
  
  var position: PositioningStrategy = js.native
}
object Adaptive {
  
  @scala.inline
  def apply(
    adaptive: Boolean,
    gpuAcceleration: Boolean,
    offsets: Partialxnumberynumbercent,
    placement: BasePlacement,
    popper: HTMLElement,
    popperRect: Rect,
    position: PositioningStrategy
  ): Adaptive = {
    val __obj = js.Dynamic.literal(adaptive = adaptive.asInstanceOf[js.Any], gpuAcceleration = gpuAcceleration.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], popperRect = popperRect.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adaptive]
  }
  
  @scala.inline
  implicit class AdaptiveOps[Self <: Adaptive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdaptive(value: Boolean): Self = this.set("adaptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpuAcceleration(value: Boolean): Self = this.set("gpuAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsets(value: Partialxnumberynumbercent): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: BasePlacement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(value: HTMLElement): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperRect(value: Rect): Self = this.set("popperRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: PositioningStrategy): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
