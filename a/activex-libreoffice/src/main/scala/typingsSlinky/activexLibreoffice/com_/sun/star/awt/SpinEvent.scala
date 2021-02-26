package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a spin button event. */
@js.native
trait SpinEvent extends EventObject {
  
  /** This is a dummy field only. Please ignore. */
  var dummy1: Double = js.native
}
object SpinEvent {
  
  @scala.inline
  def apply(Source: XInterface, dummy1: Double): SpinEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], dummy1 = dummy1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinEvent]
  }
  
  @scala.inline
  implicit class SpinEventMutableBuilder[Self <: SpinEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDummy1(value: Double): Self = StObject.set(x, "dummy1", value.asInstanceOf[js.Any])
  }
}
