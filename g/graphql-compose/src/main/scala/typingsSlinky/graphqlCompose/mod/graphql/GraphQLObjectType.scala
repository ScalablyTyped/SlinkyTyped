package typingsSlinky.graphqlCompose.mod.graphql

import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends typingsSlinky.graphqlCompose.graphqlMod.GraphQLObjectType[TSource, TContext] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
}

