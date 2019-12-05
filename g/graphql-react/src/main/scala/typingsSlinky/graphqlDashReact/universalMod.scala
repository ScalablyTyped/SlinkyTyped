package typingsSlinky.graphqlDashReact

import slinky.core.TagMod
import typingsSlinky.graphqlDashReact.graphqlDashReactMod.GraphQLOperationStatus
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/universal", JSImport.Namespace)
@js.native
object universalMod extends js.Object {
  @js.native
  class GraphQL ()
    extends typingsSlinky.graphqlDashReact.graphqlDashReactMod.GraphQL {
    def this(options: Anon_Cache) = this()
  }
  
  val GraphQLContext: Context[typingsSlinky.graphqlDashReact.graphqlDashReactMod.GraphQL] = js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  def ssr(grapphql: typingsSlinky.graphqlDashReact.graphqlDashReactMod.GraphQL, node: TagMod[Any]): Unit = js.native
  def ssr(
    grapphql: typingsSlinky.graphqlDashReact.graphqlDashReactMod.GraphQL,
    node: TagMod[Any],
    render: js.Function1[/* element */ TagMod[Any], String]
  ): Unit = js.native
  def useGraphQL[T, V](options: Anon_FetchOptionsOverrideLoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}

