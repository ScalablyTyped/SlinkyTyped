package typingsSlinky.graphql.typeDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.Anon_ExtensionASTNodes
import typingsSlinky.graphql.languageAstMod.ScalarTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLScalarType")
@js.native
class GraphQLScalarType protected ()
  extends GraphQLLeafType
     with _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: GraphQLScalarTypeConfig[_, _]) = this()
  var astNode: Maybe[ScalarTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[ScalarTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: GraphQLScalarValueParser[_] = js.native
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  def inspect(): String = js.native
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[_] = js.native
  def toConfig(): (GraphQLScalarTypeConfig[_, _]) with Anon_ExtensionASTNodes = js.native
  def toJSON(): String = js.native
}

