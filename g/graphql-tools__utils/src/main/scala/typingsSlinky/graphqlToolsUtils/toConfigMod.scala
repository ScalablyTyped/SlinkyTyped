package typingsSlinky.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/toConfig", JSImport.Namespace)
@js.native
object toConfigMod extends js.Object {
  def argsToFieldConfigArgumentMap(args: js.Array[GraphQLArgument]): GraphQLFieldConfigArgumentMap = js.native
  def argumentToArgumentConfig(arg: GraphQLArgument): GraphQLArgumentConfig = js.native
  def fieldToFieldConfig(field: GraphQLField[_, _, StringDictionary[_]]): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def inputFieldToFieldConfig(field: GraphQLInputField): GraphQLInputFieldConfig = js.native
}

