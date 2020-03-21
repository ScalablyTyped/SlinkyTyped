package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/findDeprecatedUsages", JSImport.Namespace)
@js.native
object findDeprecatedUsagesMod extends js.Object {
  def findDeprecatedUsages(schema: GraphQLSchema, ast: DocumentNode): js.Array[GraphQLError] = js.native
}

