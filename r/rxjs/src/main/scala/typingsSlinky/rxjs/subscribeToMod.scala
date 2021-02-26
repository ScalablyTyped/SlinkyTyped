package typingsSlinky.rxjs

import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.subscriptionMod.Subscription
import typingsSlinky.rxjs.typesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeToMod {
  
  @JSImport("rxjs/internal/util/subscribeTo", "subscribeTo")
  @js.native
  def subscribeTo[T](result: ObservableInput[T]): js.Function1[/* subscriber */ Subscriber[T], Unit | Subscription] = js.native
}
