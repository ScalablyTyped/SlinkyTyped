package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.findBreakingChangesMod.DangerousChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "findDangerousChanges")
@js.native
object findDangerousChanges extends js.Object {
  
  def apply(
    oldSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
}
