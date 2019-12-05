package typingsSlinky.graphql.typeMod

import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "validateSchema")
@js.native
object validateSchema extends js.Object {
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): js.Array[GraphQLError] = js.native
}

