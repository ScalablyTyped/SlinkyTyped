package typingsSlinky.graphqlToolsUtils.interfacesMod

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
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined graphql.graphql.GraphQLScalarType & {  __name :string | undefined,   __description :string | undefined,   __serialize :graphql.graphql.GraphQLScalarSerializer<any> | undefined,   __parseValue :graphql.graphql.GraphQLScalarValueParser<any> | undefined,   __parseLiteral :graphql.graphql.GraphQLScalarLiteralParser<any> | undefined,   __extensions :std.Record<string, any> | undefined,   __astNode :graphql.graphql.ScalarTypeDefinitionNode | undefined,   __extensionASTNodes :std.Array<graphql.graphql.ScalarTypeExtensionNode> | undefined} */
@js.native
trait IScalarTypeResolver extends js.Object {
  
  var __astNode: js.UndefOr[ScalarTypeDefinitionNode] = js.native
  
  var __description: js.UndefOr[String] = js.native
  
  var __extensionASTNodes: js.UndefOr[js.Array[ScalarTypeExtensionNode]] = js.native
  
  var __extensions: js.UndefOr[Record[String, _]] = js.native
  
  var __name: js.UndefOr[String] = js.native
  
  var __parseLiteral: js.UndefOr[GraphQLScalarLiteralParser[_]] = js.native
  
  var __parseValue: js.UndefOr[GraphQLScalarValueParser[_]] = js.native
  
  var __serialize: js.UndefOr[GraphQLScalarSerializer[_]] = js.native
  
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
