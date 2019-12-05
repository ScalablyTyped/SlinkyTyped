package typingsSlinky.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/Observable", JSImport.Namespace)
@js.native
object utilObservableMod extends js.Object {
  @js.native
  class Observable[T] ()
    extends typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable[T]
  
  type Observer[T] = typingsSlinky.zenDashObservable.zenDashObservableMod._Global_.ZenObservable.Observer[T]
  type Subscription = typingsSlinky.zenDashObservable.zenDashObservableMod._Global_.ZenObservable.Subscription
}

