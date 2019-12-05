package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.typeDefinitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "isTypeSubTypeOf")
@js.native
object isTypeSubTypeOf extends js.Object {
  def apply(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
}

