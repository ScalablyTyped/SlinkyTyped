package typingsSlinky.rxjs.internalCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "subscribeToPromise")
@js.native
object subscribeToPromise extends js.Object {
  
  def apply[T](promise: js.Thenable[T]): js.Function1[
    /* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], 
    typingsSlinky.rxjs.subscriberMod.Subscriber[T]
  ] = js.native
}
