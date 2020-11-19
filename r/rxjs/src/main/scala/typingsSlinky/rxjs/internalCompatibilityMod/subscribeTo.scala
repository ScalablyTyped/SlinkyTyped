package typingsSlinky.rxjs.internalCompatibilityMod

import typingsSlinky.rxjs.subscriptionMod.Subscription
import typingsSlinky.rxjs.typesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "subscribeTo")
@js.native
object subscribeTo extends js.Object {
  
  def apply[T](result: ObservableInput[T]): js.Function1[
    /* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], 
    Unit | Subscription
  ] = js.native
}
