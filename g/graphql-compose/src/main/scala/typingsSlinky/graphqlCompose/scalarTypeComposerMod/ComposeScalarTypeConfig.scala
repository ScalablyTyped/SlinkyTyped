package typingsSlinky.graphqlCompose.scalarTypeComposerMod

import typingsSlinky.graphql.astMod.ScalarTypeDefinitionNode
import typingsSlinky.graphql.astMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLScalarLiteralParser
import typingsSlinky.graphql.definitionMod.GraphQLScalarSerializer
import typingsSlinky.graphql.definitionMod.GraphQLScalarValueParser
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLScalarTypeConfig<any, any> & {  extensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
@js.native
trait ComposeScalarTypeConfig extends ScalarTypeComposeDefinition {
  var astNode: js.UndefOr[Maybe[ScalarTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ScalarTypeExtensionNode]]] = js.native
  var extensions: js.UndefOr[(Maybe[Record[String, _]]) with Extensions] = js.native
  var name: String = js.native
  // Parses an externally provided literal value to use as an input.
  var parseLiteral: js.UndefOr[GraphQLScalarLiteralParser[_]] = js.native
  // Parses an externally provided value to use as an input.
  var parseValue: js.UndefOr[GraphQLScalarValueParser[_]] = js.native
  // Serializes an internal value to include in a response.
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  // Serializes an internal value to include in a response.
  def serialize(value: js.Any): Maybe[_] = js.native
}

