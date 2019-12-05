package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.languageAstMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarLiteralParser
import typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarSerializer
import typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarValueParser
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExtensionASTNodes extends js.Object {
  var extensionASTNodes: js.Array[ScalarTypeExtensionNode] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: GraphQLScalarValueParser[_] = js.native
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[_] = js.native
}

