package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "updateArgument")
@js.native
object updateArgument extends js.Object {
  
  def apply(
    argName: String,
    argType: GraphQLInputType,
    argumentNodes: Record[String, ArgumentNode],
    variableDefinitionsMap: Record[String, VariableDefinitionNode],
    variableValues: Record[String, _],
    newArg: js.Any
  ): Unit = js.native
}
