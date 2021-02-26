package typingsSlinky.jquery.anon

import typingsSlinky.jquery.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindType
  extends _SpecialEventHook[js.Any, js.Any] {
  
  /**
    * When defined, these string properties specify that a special event should be handled like another event type until the event is delivered. The `bindType` is used if the event is attached directly, and the `delegateType` is used for delegated events. These types are generally DOM event types, and _should not_ be a special event themselves.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#bindtype-string-delegatetype-string }\`
    */
  var bindType: String = js.native
}
object BindType {
  
  @scala.inline
  def apply(bindType: String): BindType = {
    val __obj = js.Dynamic.literal(bindType = bindType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindType]
  }
  
  @scala.inline
  implicit class BindTypeMutableBuilder[Self <: BindType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindType(value: String): Self = StObject.set(x, "bindType", value.asInstanceOf[js.Any])
  }
}
