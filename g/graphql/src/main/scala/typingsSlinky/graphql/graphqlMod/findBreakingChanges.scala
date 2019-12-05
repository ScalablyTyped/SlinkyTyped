package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.utilitiesFindBreakingChangesMod.BreakingChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findBreakingChanges")
@js.native
object findBreakingChanges extends js.Object {
  def apply(
    oldSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
}

