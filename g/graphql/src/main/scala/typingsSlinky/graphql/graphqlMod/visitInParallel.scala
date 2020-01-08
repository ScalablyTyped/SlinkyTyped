package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.ASTKindToNode
import typingsSlinky.graphql.languageAstMod.ArgumentNode
import typingsSlinky.graphql.languageAstMod.BooleanValueNode
import typingsSlinky.graphql.languageAstMod.DirectiveDefinitionNode
import typingsSlinky.graphql.languageAstMod.DirectiveNode
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.languageAstMod.EnumTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.EnumTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.EnumValueDefinitionNode
import typingsSlinky.graphql.languageAstMod.EnumValueNode
import typingsSlinky.graphql.languageAstMod.FieldDefinitionNode
import typingsSlinky.graphql.languageAstMod.FieldNode
import typingsSlinky.graphql.languageAstMod.FloatValueNode
import typingsSlinky.graphql.languageAstMod.FragmentDefinitionNode
import typingsSlinky.graphql.languageAstMod.FragmentSpreadNode
import typingsSlinky.graphql.languageAstMod.InlineFragmentNode
import typingsSlinky.graphql.languageAstMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.InputValueDefinitionNode
import typingsSlinky.graphql.languageAstMod.IntValueNode
import typingsSlinky.graphql.languageAstMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.InterfaceTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ListTypeNode
import typingsSlinky.graphql.languageAstMod.ListValueNode
import typingsSlinky.graphql.languageAstMod.NameNode
import typingsSlinky.graphql.languageAstMod.NamedTypeNode
import typingsSlinky.graphql.languageAstMod.NonNullTypeNode
import typingsSlinky.graphql.languageAstMod.NullValueNode
import typingsSlinky.graphql.languageAstMod.ObjectFieldNode
import typingsSlinky.graphql.languageAstMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ObjectValueNode
import typingsSlinky.graphql.languageAstMod.OperationDefinitionNode
import typingsSlinky.graphql.languageAstMod.OperationTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.ScalarTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.SchemaDefinitionNode
import typingsSlinky.graphql.languageAstMod.SchemaExtensionNode
import typingsSlinky.graphql.languageAstMod.SelectionSetNode
import typingsSlinky.graphql.languageAstMod.StringValueNode
import typingsSlinky.graphql.languageAstMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.UnionTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.VariableDefinitionNode
import typingsSlinky.graphql.languageAstMod.VariableNode
import typingsSlinky.graphql.languageVisitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "visitInParallel")
@js.native
object visitInParallel extends js.Object {
  def apply(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
  ] = js.native
}

