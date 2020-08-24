package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "getUserTypesFromSchema")
@js.native
object getUserTypesFromSchema extends js.Object {
  def apply(schema: GraphQLSchema): js.Array[GraphQLObjectType[_, _]] = js.native
}

