package typingsSlinky.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateTimings extends StObject {
  
  /**
    * The delay in applying an animation step. A number and optional time unit.
    * The default unit is milliseconds.
    */
  var delay: Double = js.native
  
  /**
    * The full duration of an animation step. A number and optional time unit,
    * such as "1s" or "10ms" for one second and 10 milliseconds, respectively.
    * The default unit is milliseconds.
    */
  var duration: Double = js.native
  
  /**
    * An easing style that controls how an animations step accelerates
    * and decelerates during its run time. An easing function such as `cubic-bezier()`,
    * or one of the following constants:
    * - `ease-in`
    * - `ease-out`
    * - `ease-in-and-out`
    */
  var easing: String | Null = js.native
}
object AnimateTimings {
  
  @scala.inline
  def apply(delay: Double, duration: Double): AnimateTimings = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateTimings]
  }
  
  @scala.inline
  implicit class AnimateTimingsMutableBuilder[Self <: AnimateTimings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingNull: Self = StObject.set(x, "easing", null)
  }
}
