package typingsSlinky.graphqlCompose.inputTypeComposerMod

import typingsSlinky.graphql.anon.GraphQLInputObjectTypeCon
import typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldMap
import typingsSlinky.graphql.definitionMod.GraphQLInputObjectTypeConfig
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLInputObjectType & {  _gqcFields ? :graphql-compose.graphql-compose/lib/InputTypeComposer.ComposeInputFieldConfigMap,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
@js.native
trait GraphQLInputObjectTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcFields: js.UndefOr[ComposeInputFieldConfigMap] = js.native
  var astNode: Maybe[InputObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  def getFields(): GraphQLInputFieldMap = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInputObjectTypeCon = js.native
  def toJSON(): String = js.native
}

object GraphQLInputObjectTypeExtended {
  @scala.inline
  def apply(
    getFields: () => GraphQLInputFieldMap,
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLInputObjectTypeCon,
    toJSON: () => String
  ): GraphQLInputObjectTypeExtended = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLInputObjectTypeExtended]
  }
  @scala.inline
  implicit class GraphQLInputObjectTypeExtendedOps[Self <: GraphQLInputObjectTypeExtended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFields(value: () => GraphQLInputFieldMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
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
    def withToConfig(value: () => GraphQLInputObjectTypeCon): Self = {
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
    def with_gqcFields(value: ComposeInputFieldConfigMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcFields")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[InputObjectTypeDefinitionNode]): Self = {
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
    def withExtensionASTNodes(value: Maybe[js.Array[InputObjectTypeExtensionNode]]): Self = {
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

