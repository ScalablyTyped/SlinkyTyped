package typingsSlinky.graphqlDashSubscriptions

import typingsSlinky.graphqlDashSubscriptions.distPubsubMod.PubSubOptions
import typingsSlinky.graphqlDashSubscriptions.distWithDashFilterMod.FilterFn
import typingsSlinky.graphqlDashSubscriptions.distWithDashFilterMod.ResolverFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions", JSImport.Namespace)
@js.native
object graphqlDashSubscriptionsMod extends js.Object {
  @js.native
  class PubSub ()
    extends typingsSlinky.graphqlDashSubscriptions.distPubsubMod.PubSub {
    def this(options: PubSubOptions) = this()
  }
  
  @js.native
  abstract class PubSubEngine ()
    extends typingsSlinky.graphqlDashSubscriptions.distPubsubDashEngineMod.PubSubEngine
  
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
}

