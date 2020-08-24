package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/updateArgument", JSImport.Namespace)
@js.native
object updateArgumentMod extends js.Object {
  def updateArgument(
    argName: String,
    argType: GraphQLInputType,
    argumentNodes: Record[String, ArgumentNode],
    variableDefinitionsMap: Record[String, VariableDefinitionNode],
    variableValues: Record[String, _],
    newArg: js.Any
  ): Unit = js.native
}

