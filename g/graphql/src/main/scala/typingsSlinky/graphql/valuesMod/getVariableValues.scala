package typingsSlinky.graphql.valuesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.MaxErrors
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", "getVariableValues")
@js.native
object getVariableValues extends js.Object {
  def apply(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any]
  ): CoercedVariableValues = js.native
  def apply(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any],
    options: MaxErrors
  ): CoercedVariableValues = js.native
}

