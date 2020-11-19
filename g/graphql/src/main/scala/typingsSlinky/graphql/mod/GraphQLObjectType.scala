package typingsSlinky.graphql.mod

import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends typingsSlinky.graphql.typeMod.GraphQLObjectType[TSource, TContext] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
}
