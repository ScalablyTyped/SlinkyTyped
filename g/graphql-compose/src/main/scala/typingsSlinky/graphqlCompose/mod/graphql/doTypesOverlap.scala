package typingsSlinky.graphqlCompose.mod.graphql

import typingsSlinky.graphql.definitionMod.GraphQLCompositeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.doTypesOverlap")
@js.native
object doTypesOverlap extends js.Object {
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
}

