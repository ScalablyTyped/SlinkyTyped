package typingsSlinky.graphqlReact

import slinky.core.TagMod
import typingsSlinky.graphqlReact.anon.Cache
import typingsSlinky.graphqlReact.anon.LoadOnMount
import typingsSlinky.graphqlReact.mod.GraphQLOperationStatus
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/universal", JSImport.Namespace)
@js.native
object universalMod extends js.Object {
  @js.native
  class GraphQL ()
    extends typingsSlinky.graphqlReact.mod.GraphQL {
    def this(options: Cache) = this()
  }
  
  val GraphQLContext: Context[typingsSlinky.graphqlReact.mod.GraphQL] = js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  def ssr(grapphql: typingsSlinky.graphqlReact.mod.GraphQL, node: TagMod[Any]): Unit = js.native
  def ssr(
    grapphql: typingsSlinky.graphqlReact.mod.GraphQL,
    node: TagMod[Any],
    render: js.Function1[/* element */ TagMod[Any], String]
  ): Unit = js.native
  def useGraphQL[T, V](options: LoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}

