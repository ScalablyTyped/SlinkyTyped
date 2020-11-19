package typingsSlinky.graphqlReact.mod

import typingsSlinky.graphqlReact.anon.Cache
import typingsSlinky.graphqlReact.anon.CacheKey
import typingsSlinky.graphqlReact.anon.CacheValuePromise
import typingsSlinky.graphqlReact.anon.ExceptCacheKey
import typingsSlinky.graphqlReact.anon.FetchOptionsOverride
import typingsSlinky.graphqlReact.graphqlReactStrings.cache
import typingsSlinky.graphqlReact.graphqlReactStrings.fetch
import typingsSlinky.graphqlReact.graphqlReactStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-react", "GraphQL")
@js.native
class GraphQL () extends js.Object {
  def this(options: Cache) = this()
  
  var cache: GraphQLCache = js.native
  
  @JSName("off")
  def off_cache(`type`: cache, handler: js.Function1[/* event */ CacheKey, Unit]): Unit = js.native
  @JSName("off")
  def off_fetch(`type`: fetch, handler: js.Function1[/* event */ CacheValuePromise, Unit]): Unit = js.native
  @JSName("off")
  def off_reset(`type`: reset, handler: js.Function1[/* event */ ExceptCacheKey, Unit]): Unit = js.native
  
  @JSName("on")
  def on_cache(`type`: cache, handler: js.Function1[/* event */ CacheKey, Unit]): Unit = js.native
  @JSName("on")
  def on_fetch(`type`: fetch, handler: js.Function1[/* event */ CacheValuePromise, Unit]): Unit = js.native
  @JSName("on")
  def on_reset(`type`: reset, handler: js.Function1[/* event */ ExceptCacheKey, Unit]): Unit = js.native
  
  def operate[T, V](options: FetchOptionsOverride[V]): GraphQLOperationLoading[T] = js.native
  
  def reset(): Unit = js.native
  def reset(exceptCacheKey: String): Unit = js.native
}
