package typingsSlinky.iitc.hooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMapDataEntityInject extends StObject {
  
  def callback(ents: js.Any): Unit = js.native
}
object EventMapDataEntityInject {
  
  @scala.inline
  def apply(callback: js.Any => Unit): EventMapDataEntityInject = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
    __obj.asInstanceOf[EventMapDataEntityInject]
  }
  
  @scala.inline
  implicit class EventMapDataEntityInjectMutableBuilder[Self <: EventMapDataEntityInject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
  }
}
