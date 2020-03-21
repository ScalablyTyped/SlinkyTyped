package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.EnumTypeExtension
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeExtension
import typingsSlinky.graphql.graphqlStrings.ObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.ScalarTypeExtension
import typingsSlinky.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.ScalarTypeExtensionNode
  - typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
  - typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
  - typingsSlinky.graphql.astMod.UnionTypeExtensionNode
  - typingsSlinky.graphql.astMod.EnumTypeExtensionNode
  - typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
*/
trait TypeExtensionNode extends TypeSystemExtensionNode

object TypeExtensionNode {
  @scala.inline
  def EnumTypeExtensionNode(
    kind: EnumTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    values: js.Array[EnumValueDefinitionNode] = null
  ): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def UnionTypeExtensionNode(
    kind: UnionTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    types: js.Array[NamedTypeNode] = null
  ): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def ObjectTypeExtensionNode(
    kind: ObjectTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    interfaces: js.Array[NamedTypeNode] = null,
    loc: Location = null
  ): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def ScalarTypeExtensionNode(
    kind: ScalarTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null
  ): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def InputObjectTypeExtensionNode(
    kind: InputObjectTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[InputValueDefinitionNode] = null,
    loc: Location = null
  ): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  @scala.inline
  def InterfaceTypeExtensionNode(
    kind: InterfaceTypeExtension,
    name: NameNode,
    directives: js.Array[DirectiveNode] = null,
    fields: js.Array[FieldDefinitionNode] = null,
    loc: Location = null
  ): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
}

