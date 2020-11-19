package typingsSlinky.rxjs.internalCompatibilityMod

import typingsSlinky.rxjs.ajaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "AjaxSubscriber")
@js.native
class AjaxSubscriber[T] protected ()
  extends typingsSlinky.rxjs.ajaxObservableMod.AjaxSubscriber[T] {
  def this(destination: typingsSlinky.rxjs.subscriberMod.Subscriber[T], request: AjaxRequest) = this()
}
