package typingsSlinky.graphql.findBreakingChangesMod

import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/utilities/findBreakingChanges", "findDangerousChanges")
@js.native
object findDangerousChanges extends js.Object {
  
  def apply(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
}
