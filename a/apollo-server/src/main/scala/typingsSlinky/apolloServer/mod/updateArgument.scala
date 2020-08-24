package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "updateArgument")
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

