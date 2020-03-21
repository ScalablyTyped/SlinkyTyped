package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.ASTKindToNode
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.BooleanValueNode
import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.astMod.DirectiveNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.EnumTypeDefinitionNode
import typingsSlinky.graphql.astMod.EnumTypeExtensionNode
import typingsSlinky.graphql.astMod.EnumValueDefinitionNode
import typingsSlinky.graphql.astMod.EnumValueNode
import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.FloatValueNode
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.FragmentSpreadNode
import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphql.astMod.IntValueNode
import typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
import typingsSlinky.graphql.astMod.ListTypeNode
import typingsSlinky.graphql.astMod.ListValueNode
import typingsSlinky.graphql.astMod.NameNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.NonNullTypeNode
import typingsSlinky.graphql.astMod.NullValueNode
import typingsSlinky.graphql.astMod.ObjectFieldNode
import typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.astMod.ObjectValueNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.astMod.OperationTypeDefinitionNode
import typingsSlinky.graphql.astMod.ScalarTypeDefinitionNode
import typingsSlinky.graphql.astMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.astMod.SchemaDefinitionNode
import typingsSlinky.graphql.astMod.SchemaExtensionNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.astMod.StringValueNode
import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.astMod.VariableNode
import typingsSlinky.graphql.directiveLocationMod._DirectiveLocation
import typingsSlinky.graphql.kindsMod._Kind
import typingsSlinky.graphql.lexerMod.Lexer
import typingsSlinky.graphql.locationMod.SourceLocation
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.sourceMod.Location
import typingsSlinky.graphql.tokenKindMod._TokenKind
import typingsSlinky.graphql.typeInfoMod.TypeInfo
import typingsSlinky.graphql.visitorMod.VisitFn
import typingsSlinky.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  @js.native
  class Source protected ()
    extends typingsSlinky.graphql.sourceMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  val BREAK: js.Any = js.native
  val DirectiveLocation: _DirectiveLocation = js.native
  val Kind: _Kind = js.native
  val TokenKind: _TokenKind = js.native
  def createLexer[TOptions](source: typingsSlinky.graphql.sourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def getLocation(source: typingsSlinky.graphql.sourceMod.Source, position: Double): SourceLocation = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
  def isDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ Boolean = js.native
  def isExecutableDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ Boolean = js.native
  def isSelectionNode(node: ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ Boolean = js.native
  def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
  def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  def isTypeNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeNode */ Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typingsSlinky.graphql.sourceMod.Source): DocumentNode = js.native
  def parse(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.sourceMod.Source): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.sourceMod.Source): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printLocation(location: typingsSlinky.graphql.astMod.Location): String = js.native
  def printSourceLocation(source: typingsSlinky.graphql.sourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMapASTKindToNod
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
}

