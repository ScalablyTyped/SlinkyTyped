package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/get-user-types-from-schema", JSImport.Namespace)
@js.native
object getUserTypesFromSchemaMod extends js.Object {
  def getUserTypesFromSchema(schema: GraphQLSchema): js.Array[GraphQLObjectType[_, _]] = js.native
}

