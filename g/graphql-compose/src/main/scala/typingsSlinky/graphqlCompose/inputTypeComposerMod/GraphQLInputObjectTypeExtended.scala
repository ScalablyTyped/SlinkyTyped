package typingsSlinky.graphqlCompose.inputTypeComposerMod

import typingsSlinky.graphql.GraphQLInputObjectTypeCon
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
trait GraphQLInputObjectTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeInputFieldConfigMap] = js.undefined
  var astNode: Maybe[InputObjectTypeDefinitionNode]
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  def getFields(): GraphQLInputFieldMap
  def inspect(): String
  def toConfig(): GraphQLInputObjectTypeCon
  def toJSON(): String
}

object GraphQLInputObjectTypeExtended {
  @scala.inline
  def apply(
    getFields: () => GraphQLInputFieldMap,
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLInputObjectTypeCon,
    toJSON: () => String,
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeInputFieldConfigMap = null,
    astNode: Maybe[InputObjectTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLInputObjectTypeExtended = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputObjectTypeExtended]
  }
}

