package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object visitorMod {
  type ASTVisitor = typingsSlinky.graphql.visitorMod.Visitor[
    typingsSlinky.graphql.astMod.ASTKindToNode, 
    typingsSlinky.graphql.astMod.EnumValueDefinitionNode | typingsSlinky.graphql.astMod.ObjectValueNode | typingsSlinky.graphql.astMod.FieldDefinitionNode | typingsSlinky.graphql.astMod.SchemaDefinitionNode | typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode | typingsSlinky.graphql.astMod.DocumentNode | typingsSlinky.graphql.astMod.DirectiveDefinitionNode | typingsSlinky.graphql.astMod.InputValueDefinitionNode | typingsSlinky.graphql.astMod.ListValueNode | typingsSlinky.graphql.astMod.ScalarTypeDefinitionNode | typingsSlinky.graphql.astMod.IntValueNode | typingsSlinky.graphql.astMod.OperationDefinitionNode | typingsSlinky.graphql.astMod.ArgumentNode | typingsSlinky.graphql.astMod.FragmentDefinitionNode | typingsSlinky.graphql.astMod.OperationTypeDefinitionNode | typingsSlinky.graphql.astMod.FieldNode | typingsSlinky.graphql.astMod.StringValueNode | typingsSlinky.graphql.astMod.NameNode | typingsSlinky.graphql.astMod.ObjectFieldNode | typingsSlinky.graphql.astMod.EnumValueNode | typingsSlinky.graphql.astMod.SchemaExtensionNode | typingsSlinky.graphql.astMod.UnionTypeExtensionNode | typingsSlinky.graphql.astMod.VariableDefinitionNode | typingsSlinky.graphql.astMod.VariableNode | typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode | typingsSlinky.graphql.astMod.EnumTypeExtensionNode | typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode | typingsSlinky.graphql.astMod.FloatValueNode | typingsSlinky.graphql.astMod.NonNullTypeNode | typingsSlinky.graphql.astMod.DirectiveNode | typingsSlinky.graphql.astMod.SelectionSetNode | typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode | typingsSlinky.graphql.astMod.ScalarTypeExtensionNode | typingsSlinky.graphql.astMod.UnionTypeDefinitionNode | typingsSlinky.graphql.astMod.NullValueNode | typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode | typingsSlinky.graphql.astMod.InlineFragmentNode | typingsSlinky.graphql.astMod.EnumTypeDefinitionNode | typingsSlinky.graphql.astMod.NamedTypeNode | typingsSlinky.graphql.astMod.BooleanValueNode | typingsSlinky.graphql.astMod.ListTypeNode | typingsSlinky.graphql.astMod.ObjectTypeExtensionNode | typingsSlinky.graphql.astMod.FragmentSpreadNode
  ]
  // TODO: Should be `[]`, but that requires TypeScript@3
  type EmptyTuple = js.Array[scala.Nothing]
  type EnterLeaveVisitor[KindToNode, Nodes] = typingsSlinky.graphql.visitorMod.EnterLeave[
    (typingsSlinky.graphql.visitorMod.VisitFn[Nodes, Nodes]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>}
    */ typingsSlinky.graphql.graphqlStrings.EnterLeaveVisitor with org.scalablytyped.runtime.TopLevel[KindToNode])
  ]
  type ShapeMapVisitor[KindToNode, Nodes] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]> | graphql.graphql/language/visitor.EnterLeave<graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>>}
    */ typingsSlinky.graphql.graphqlStrings.ShapeMapVisitor with org.scalablytyped.runtime.TopLevel[js.Any]
  type VisitFn[TAnyNode, TVisitedNode] = js.Function5[
    /* node */ TVisitedNode, 
    /* key */ js.UndefOr[java.lang.String | scala.Double], 
    /* parent */ js.UndefOr[TAnyNode | js.Array[TAnyNode]], 
    /* path */ js.Array[java.lang.String | scala.Double], 
    /* ancestors */ js.Array[TAnyNode | js.Array[TAnyNode]], 
    js.Any
  ]
  type VisitorKeyMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.ReadonlyArray<keyof T[P]>}
    */ typingsSlinky.graphql.graphqlStrings.VisitorKeyMap with org.scalablytyped.runtime.TopLevel[js.Any]
}
