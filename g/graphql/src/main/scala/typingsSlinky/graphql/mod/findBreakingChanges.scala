package typingsSlinky.graphql.mod

import typingsSlinky.graphql.findBreakingChangesMod.BreakingChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "findBreakingChanges")
@js.native
object findBreakingChanges extends js.Object {
  
  def apply(
    oldSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
}
