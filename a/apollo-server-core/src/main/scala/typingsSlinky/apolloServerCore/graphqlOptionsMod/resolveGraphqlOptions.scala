package typingsSlinky.apolloServerCore.graphqlOptionsMod

import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-core/dist/graphqlOptions", "resolveGraphqlOptions")
@js.native
object resolveGraphqlOptions extends js.Object {
  
  def apply(
    options: js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def apply(options: GraphQLServerOptions[Record[String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
}
