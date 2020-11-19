package typingsSlinky.graphqlSubscriptions

import typingsSlinky.graphqlSubscriptions.pubsubMod.PubSubOptions
import typingsSlinky.graphqlSubscriptions.withFilterMod.FilterFn
import typingsSlinky.graphqlSubscriptions.withFilterMod.ResolverFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-subscriptions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
  
  @js.native
  class PubSub ()
    extends typingsSlinky.graphqlSubscriptions.pubsubMod.PubSub {
    def this(options: PubSubOptions) = this()
  }
  
  @js.native
  abstract class PubSubEngine ()
    extends typingsSlinky.graphqlSubscriptions.pubsubEngineMod.PubSubEngine
}
