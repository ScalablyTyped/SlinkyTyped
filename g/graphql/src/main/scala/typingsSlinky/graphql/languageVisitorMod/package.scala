package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languageVisitorMod {
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

  type ASTVisitor = Visitor[
    ASTKindToNode, 
    UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
  ]
  // TODO: Should be `[]`, but that requires TypeScript@3
  type EmptyTuple = js.Array[scala.Nothing]
  type EnterLeaveVisitor[KindToNode, Nodes] = EnterLeave[
    (VisitFn[Nodes, Nodes]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>}
    */ typingsSlinky.graphql.graphqlStrings.EnterLeaveVisitor with KindToNode)
  ]
  type ShapeMapVisitor[KindToNode, Nodes] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]> | graphql.graphql/language/visitor.EnterLeave<graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>>}
    */ typingsSlinky.graphql.graphqlStrings.ShapeMapVisitor with js.Any
  type VisitFn[TAnyNode, TVisitedNode] = js.Function5[
    /* node */ TVisitedNode, 
    /* key */ js.UndefOr[String | Double], 
    /* parent */ js.UndefOr[TAnyNode | js.Array[TAnyNode]], 
    /* path */ js.Array[String | Double], 
    /* ancestors */ js.Array[TAnyNode | js.Array[TAnyNode]], 
    js.Any
  ]
  type Visitor[KindToNode, Nodes] = (EnterLeaveVisitor[KindToNode, Nodes]) | (ShapeMapVisitor[KindToNode, Nodes])
  type VisitorKeyMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.ReadonlyArray<keyof T[P]>}
    */ typingsSlinky.graphql.graphqlStrings.VisitorKeyMap with js.Any
}
