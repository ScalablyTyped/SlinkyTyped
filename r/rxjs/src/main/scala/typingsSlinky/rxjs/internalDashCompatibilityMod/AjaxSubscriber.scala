package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalObservableDomAjaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxSubscriber")
@js.native
class AjaxSubscriber[T] protected ()
  extends typingsSlinky.rxjs.internalObservableDomAjaxObservableMod.AjaxSubscriber[T] {
  def this(destination: typingsSlinky.rxjs.internalSubscriberMod.Subscriber[T], request: AjaxRequest) = this()
}

