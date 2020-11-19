package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends typingsSlinky.graphql.mod.GraphQLObjectType[TSource, TContext] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
}
