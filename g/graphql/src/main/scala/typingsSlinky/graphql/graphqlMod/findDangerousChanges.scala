package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.utilitiesFindBreakingChangesMod.DangerousChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findDangerousChanges")
@js.native
object findDangerousChanges extends js.Object {
  def apply(
    oldSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
}

