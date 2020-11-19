package typingsSlinky.graphql.findBreakingChangesMod

import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/utilities/findBreakingChanges", "findBreakingChanges")
@js.native
object findBreakingChanges extends js.Object {
  
  def apply(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
}
