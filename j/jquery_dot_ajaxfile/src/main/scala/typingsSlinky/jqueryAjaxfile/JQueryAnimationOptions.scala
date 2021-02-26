package typingsSlinky.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryAnimationOptions extends StObject {
  
  /**
    * A function to be called when the animation completes or stops without completing (its Promise object is either resolved or rejected). (version added: 1.8)
    */
  var always: js.UndefOr[js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean, _]] = js.native
  
  /**
    * A function to call once the animation is complete.
    */
  var complete: js.UndefOr[js.Function] = js.native
  
  /**
    * A function to be called when the animation completes (its Promise object is resolved). (version added: 1.8)
    */
  var done: js.UndefOr[js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean, _]] = js.native
  
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[js.Any] = js.native
  
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * A function to be called when the animation fails to complete (its Promise object is rejected). (version added: 1.8)
    */
  var fail: js.UndefOr[js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean, _]] = js.native
  
  /**
    * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties. (version added: 1.8)
    */
  var progress: js.UndefOr[
    js.Function3[/* animation */ JQueryPromise[_], /* progress */ Double, /* remainingMs */ Double, _]
  ] = js.native
  
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
    */
  var queue: js.UndefOr[js.Any] = js.native
  
  /**
    * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions. (version added: 1.4)
    */
  var specialEasing: js.UndefOr[Object] = js.native
  
  /**
    * A function to call when the animation begins. (version added: 1.8)
    */
  var start: js.UndefOr[js.Function1[/* animation */ JQueryPromise[_], _]] = js.native
  
  /**
    * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
    */
  var step: js.UndefOr[js.Function2[/* now */ Double, /* tween */ js.Any, _]] = js.native
}
object JQueryAnimationOptions {
  
  @scala.inline
  def apply(): JQueryAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryAnimationOptions]
  }
  
  @scala.inline
  implicit class JQueryAnimationOptionsMutableBuilder[Self <: JQueryAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlways(value: (/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean) => _): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    @scala.inline
    def setComplete(value: js.Function): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDone(value: (/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean) => _): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setFail(value: (/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean) => _): Self = StObject.set(x, "fail", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setProgress(value: (/* animation */ JQueryPromise[_], /* progress */ Double, /* remainingMs */ Double) => _): Self = StObject.set(x, "progress", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setQueue(value: js.Any): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setSpecialEasing(value: Object): Self = StObject.set(x, "specialEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialEasingUndefined: Self = StObject.set(x, "specialEasing", js.undefined)
    
    @scala.inline
    def setStart(value: /* animation */ JQueryPromise[_] => _): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStep(value: (/* now */ Double, /* tween */ js.Any) => _): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
