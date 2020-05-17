package typingsSlinky.graphqlCompose.enumTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.GraphQLEnumTypeConfigexte
import typingsSlinky.graphql.astMod.EnumTypeDefinitionNode
import typingsSlinky.graphql.astMod.EnumTypeExtensionNode
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.definitionMod.GraphQLEnumTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLEnumValue
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLEnumType & {  _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
@js.native
trait GraphQLEnumTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var astNode: Maybe[EnumTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  def getValue(name: String): Maybe[GraphQLEnumValue] = js.native
  def getValues(): js.Array[GraphQLEnumValue] = js.native
  def inspect(): String = js.native
  def parseLiteral(valueNode: ValueNode, _variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[String] = js.native
  def toConfig(): GraphQLEnumTypeConfigexte = js.native
  def toJSON(): String = js.native
}

object GraphQLEnumTypeExtended {
  @scala.inline
  def apply(
    getValue: String => Maybe[GraphQLEnumValue],
    getValues: () => js.Array[GraphQLEnumValue],
    inspect: () => String,
    name: String,
    parseLiteral: (ValueNode, Maybe[StringDictionary[_]]) => Maybe[_],
    parseValue: js.Any => Maybe[_],
    serialize: js.Any => Maybe[String],
    toConfig: () => GraphQLEnumTypeConfigexte,
    toJSON: () => String
  ): GraphQLEnumTypeExtended = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), getValues = js.Any.fromFunction0(getValues), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], parseLiteral = js.Any.fromFunction2(parseLiteral), parseValue = js.Any.fromFunction1(parseValue), serialize = js.Any.fromFunction1(serialize), toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLEnumTypeExtended]
  }
  @scala.inline
  implicit class GraphQLEnumTypeExtendedOps[Self <: GraphQLEnumTypeExtended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetValue(value: String => Maybe[GraphQLEnumValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValues(value: () => js.Array[GraphQLEnumValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInspect(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseLiteral(value: (ValueNode, Maybe[StringDictionary[_]]) => Maybe[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLiteral")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParseValue(value: js.Any => Maybe[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSerialize(value: js.Any => Maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToConfig(value: () => GraphQLEnumTypeConfigexte): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_gqcExtensions(value: Extensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[EnumTypeDefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(null)
        ret
    }
    @scala.inline
    def withDescription(value: Maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withExtensionASTNodes(value: Maybe[js.Array[EnumTypeExtensionNode]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionASTNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionASTNodesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(null)
        ret
    }
    @scala.inline
    def withExtensions(value: Maybe[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(null)
        ret
    }
  }
  
}

