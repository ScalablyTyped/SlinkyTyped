package typingsSlinky.graphqlReact

import slinky.core.facade.ReactElement
import typingsSlinky.graphqlReact.anon.Cache
import typingsSlinky.graphqlReact.anon.LoadOnMount
import typingsSlinky.graphqlReact.mod.GraphQLOperationStatus
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object universalMod {
  
  @JSImport("graphql-react/universal", "GraphQL")
  @js.native
  class GraphQL ()
    extends typingsSlinky.graphqlReact.mod.GraphQL {
    def this(options: Cache) = this()
  }
  
  @JSImport("graphql-react/universal", "GraphQLContext")
  @js.native
  val GraphQLContext: Context[typingsSlinky.graphqlReact.mod.GraphQL] = js.native
  
  @JSImport("graphql-react/universal", "reportCacheErrors")
  @js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  
  @JSImport("graphql-react/universal", "ssr")
  @js.native
  def ssr(grapphql: typingsSlinky.graphqlReact.mod.GraphQL, node: ReactElement): Unit = js.native
  @JSImport("graphql-react/universal", "ssr")
  @js.native
  def ssr(
    grapphql: typingsSlinky.graphqlReact.mod.GraphQL,
    node: ReactElement,
    render: js.Function1[/* element */ ReactElement, String]
  ): Unit = js.native
  
  @JSImport("graphql-react/universal", "useGraphQL")
  @js.native
  def useGraphQL[T, V](options: LoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}
