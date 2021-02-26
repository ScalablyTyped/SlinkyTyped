package typingsSlinky.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/slider.html#javascript-reference
@js.native
trait Slider extends StObject {
  
  def destroy(): Unit = js.native
}
object Slider {
  
  @scala.inline
  def apply(destroy: () => Unit): Slider = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Slider]
  }
  
  @scala.inline
  implicit class SliderMutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
