package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeEventSubscription extends StObject {
  
  /**
    * Call this method to un-subscribe from a native-event
    */
  def remove(): Unit = js.native
}
object NativeEventSubscription {
  
  @scala.inline
  def apply(remove: () => Unit): NativeEventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NativeEventSubscription]
  }
  
  @scala.inline
  implicit class NativeEventSubscriptionMutableBuilder[Self <: NativeEventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
