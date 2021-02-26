package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.fadeIn
import typingsSlinky.grommet.grommetStrings.fadeOut
import typingsSlinky.grommet.grommetStrings.jiggle
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.pulse
import typingsSlinky.grommet.grommetStrings.slideDown
import typingsSlinky.grommet.grommetStrings.slideLeft
import typingsSlinky.grommet.grommetStrings.slideRight
import typingsSlinky.grommet.grommetStrings.slideUp
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.zoomIn
import typingsSlinky.grommet.grommetStrings.zoomOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
  
  var `type`: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut
  ] = js.native
}
object Delay {
  
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(
      value: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
