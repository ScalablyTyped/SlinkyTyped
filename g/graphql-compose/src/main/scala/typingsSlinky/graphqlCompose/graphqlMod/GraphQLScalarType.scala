package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.anon.ReadonlyGraphQLScalarType
import typingsSlinky.graphqlCompose.scalarTypeComposerMod._ScalarTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "GraphQLScalarType")
@js.native
class GraphQLScalarType protected ()
  extends typingsSlinky.graphql.mod.GraphQLScalarType
     with _ScalarTypeComposeDefinition {
  def this(config: ReadonlyGraphQLScalarType) = this()
}
