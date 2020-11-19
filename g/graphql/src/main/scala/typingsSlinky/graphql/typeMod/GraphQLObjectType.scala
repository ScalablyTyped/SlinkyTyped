package typingsSlinky.graphql.typeMod

import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/type", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends typingsSlinky.graphql.definitionMod.GraphQLObjectType[TSource, TContext] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
}
