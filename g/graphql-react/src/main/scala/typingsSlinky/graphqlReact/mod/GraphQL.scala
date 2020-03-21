package typingsSlinky.graphqlReact.mod

import typingsSlinky.graphqlReact.AnonCache
import typingsSlinky.graphqlReact.AnonCacheKey
import typingsSlinky.graphqlReact.AnonCacheValuePromise
import typingsSlinky.graphqlReact.AnonExceptCacheKey
import typingsSlinky.graphqlReact.AnonFetchOptionsOverride
import typingsSlinky.graphqlReact.graphqlReactStrings.cache
import typingsSlinky.graphqlReact.graphqlReactStrings.fetch
import typingsSlinky.graphqlReact.graphqlReactStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react", "GraphQL")
@js.native
class GraphQL () extends js.Object {
  def this(options: AnonCache) = this()
  var cache: GraphQLCache = js.native
  @JSName("off")
  def off_cache(`type`: cache, handler: js.Function1[/* event */ AnonCacheKey, Unit]): Unit = js.native
  @JSName("off")
  def off_fetch(`type`: fetch, handler: js.Function1[/* event */ AnonCacheValuePromise, Unit]): Unit = js.native
  @JSName("off")
  def off_reset(`type`: reset, handler: js.Function1[/* event */ AnonExceptCacheKey, Unit]): Unit = js.native
  @JSName("on")
  def on_cache(`type`: cache, handler: js.Function1[/* event */ AnonCacheKey, Unit]): Unit = js.native
  @JSName("on")
  def on_fetch(`type`: fetch, handler: js.Function1[/* event */ AnonCacheValuePromise, Unit]): Unit = js.native
  @JSName("on")
  def on_reset(`type`: reset, handler: js.Function1[/* event */ AnonExceptCacheKey, Unit]): Unit = js.native
  def operate[T, V](options: AnonFetchOptionsOverride[V]): GraphQLOperationLoading[T] = js.native
  def reset(): Unit = js.native
  def reset(exceptCacheKey: String): Unit = js.native
}

