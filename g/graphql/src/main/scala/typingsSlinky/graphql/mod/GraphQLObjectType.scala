package typingsSlinky.graphql.mod

import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends typingsSlinky.graphql.typeMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

