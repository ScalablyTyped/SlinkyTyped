package typingsSlinky.reveal

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#slide-changed-event
@js.native
trait SlideEvent extends StObject {
  
  var currentSlide: Element = js.native
  
  var indexh: Double = js.native
  
  var indexv: js.UndefOr[Double] = js.native
  
  var previousSlide: js.UndefOr[Element] = js.native
}
object SlideEvent {
  
  @scala.inline
  def apply(currentSlide: Element, indexh: Double): SlideEvent = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], indexh = indexh.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEvent]
  }
  
  @scala.inline
  implicit class SlideEventMutableBuilder[Self <: SlideEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSlide(value: Element): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexh(value: Double): Self = StObject.set(x, "indexh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexv(value: Double): Self = StObject.set(x, "indexv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexvUndefined: Self = StObject.set(x, "indexv", js.undefined)
    
    @scala.inline
    def setPreviousSlide(value: Element): Self = StObject.set(x, "previousSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSlideUndefined: Self = StObject.set(x, "previousSlide", js.undefined)
  }
}
