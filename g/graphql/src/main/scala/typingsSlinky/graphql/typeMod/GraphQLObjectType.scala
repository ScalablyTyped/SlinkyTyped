package typingsSlinky.graphql.typeMod

import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends typingsSlinky.graphql.definitionMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

