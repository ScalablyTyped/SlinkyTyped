package typingsSlinky.graphqlCompose.scalarTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.GraphQLScalarTypeConfigan
import typingsSlinky.graphql.anon.ReadonlyGraphQLScalarType
import typingsSlinky.graphql.astMod.ScalarTypeDefinitionNode
import typingsSlinky.graphql.astMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.definitionMod.GraphQLScalarLiteralParser
import typingsSlinky.graphql.definitionMod.GraphQLScalarSerializer
import typingsSlinky.graphql.definitionMod.GraphQLScalarValueParser
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLScalarType & {  _gqcExtensions :graphql-compose.graphql-compose/lib/utils/definitions.Extensions | undefined} */
@js.native
trait GraphQLScalarTypeExtended extends js.Object {
  
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  
  var astNode: Maybe[ScalarTypeDefinitionNode] = js.native
  
  var description: Maybe[String] = js.native
  
  var extensionASTNodes: Maybe[js.Array[ScalarTypeExtensionNode]] = js.native
  
  var extensions: Maybe[js.Object] = js.native
  
  def inspect(): String = js.native
  
  var name: String = js.native
  
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
  
  def parseValue(value: js.Any): Maybe[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: GraphQLScalarValueParser[_] = js.native
  
  def serialize(value: js.Any): Maybe[_] = js.native
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  
  var specifiedByUrl: Maybe[String] = js.native
  
  def toConfig(): GraphQLScalarTypeConfigan = js.native
  
  def toJSON(): String = js.native
}
