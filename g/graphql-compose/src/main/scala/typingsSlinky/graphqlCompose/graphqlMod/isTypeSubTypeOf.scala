package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.definitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "isTypeSubTypeOf")
@js.native
object isTypeSubTypeOf extends js.Object {
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
}

