package typingsSlinky.rxjs.ajaxObservableMod

import org.scalajs.dom.raw.Event
import typingsSlinky.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxSubscriber")
@js.native
class AjaxSubscriber[T] protected () extends Subscriber[Event] {
  def this(destination: Subscriber[T], request: AjaxRequest) = this()
  
  var done: js.Any = js.native
  
  var getHeader: js.Any = js.native
  
  var request: AjaxRequest = js.native
  
  var send: js.Any = js.native
  
  var serializeBody: js.Any = js.native
  
  var setHeaders: js.Any = js.native
  
  var setupEvents: js.Any = js.native
  
  var xhr: js.Any = js.native
}
