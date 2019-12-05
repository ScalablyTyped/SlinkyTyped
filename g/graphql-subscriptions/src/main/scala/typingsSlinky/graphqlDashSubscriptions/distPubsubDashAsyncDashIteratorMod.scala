package typingsSlinky.graphqlDashSubscriptions

import typingsSlinky.graphqlDashSubscriptions.distPubsubDashEngineMod.PubSubEngine
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions/dist/pubsub-async-iterator", JSImport.Namespace)
@js.native
object distPubsubDashAsyncDashIteratorMod extends js.Object {
  @js.native
  class PubSubAsyncIterator[T] protected ()
    extends AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]] {
    def this(pubsub: PubSubEngine, eventNames: String) = this()
    def this(pubsub: PubSubEngine, eventNames: js.Array[String]) = this()
    var allSubscribed: js.Any = js.native
    var emptyQueue: js.Any = js.native
    var eventsArray: js.Any = js.native
    var pubsub: js.Any = js.native
    var pullQueue: js.Any = js.native
    var pullValue: js.Any = js.native
    var pushQueue: js.Any = js.native
    var pushValue: js.Any = js.native
    var running: js.Any = js.native
    var subscribeAll: js.Any = js.native
    var unsubscribeAll: js.Any = js.native
    def next(): js.Promise[IteratorResult[T, _]] = js.native
    @JSName("return")
    def return_MPubSubAsyncIterator(): js.Promise[IteratorResult[T, _]] = js.native
    @JSName("throw")
    def throw_MPubSubAsyncIterator(error: js.Any): js.Promise[scala.Nothing] = js.native
  }
  
}

