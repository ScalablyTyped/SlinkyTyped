package typingsSlinky.ava.mod

import typingsSlinky.ava.anon.Complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribable extends StObject {
  
  def subscribe(observer: Complete): Unit = js.native
}
object Subscribable {
  
  @scala.inline
  def apply(subscribe: Complete => Unit): Subscribable = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscribable]
  }
  
  @scala.inline
  implicit class SubscribableMutableBuilder[Self <: Subscribable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscribe(value: Complete => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
