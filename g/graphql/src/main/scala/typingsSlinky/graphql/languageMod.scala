package typingsSlinky.graphql

import typingsSlinky.graphql.languageAstMod.ASTKindToNode
import typingsSlinky.graphql.languageAstMod.ASTNode
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
import typingsSlinky.graphql.languageAstMod.TypeNode
import typingsSlinky.graphql.languageAstMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.UnionTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.languageAstMod.VariableDefinitionNode
import typingsSlinky.graphql.languageAstMod.VariableNode
import typingsSlinky.graphql.languageDirectiveLocationMod._DirectiveLocation
import typingsSlinky.graphql.languageKindsMod._Kind
import typingsSlinky.graphql.languageLexerMod.Lexer
import typingsSlinky.graphql.languageLocationMod.SourceLocation
import typingsSlinky.graphql.languageParserMod.ParseOptions
import typingsSlinky.graphql.languageSourceMod.Location
import typingsSlinky.graphql.languageTokenKindMod._TokenKind
import typingsSlinky.graphql.languageVisitorMod.VisitFn
import typingsSlinky.graphql.languageVisitorMod.Visitor
import typingsSlinky.graphql.languageVisitorMod.VisitorKeyMap
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  @js.native
  class Source protected ()
    extends typingsSlinky.graphql.languageSourceMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  val BREAK: js.Any = js.native
  val DirectiveLocation: _DirectiveLocation = js.native
  val Kind: _Kind = js.native
  val TokenKind: _TokenKind = js.native
  def createLexer[TOptions](source: typingsSlinky.graphql.languageSourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def getLocation(source: typingsSlinky.graphql.languageSourceMod.Source, position: Double): SourceLocation = js.native
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
  def parse(source: typingsSlinky.graphql.languageSourceMod.Source): DocumentNode = js.native
  def parse(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.languageSourceMod.Source): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.languageSourceMod.Source): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printLocation(location: typingsSlinky.graphql.languageAstMod.Location): String = js.native
  def printSourceLocation(source: typingsSlinky.graphql.languageSourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMap[ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
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
  def visitWithTypeInfo(
    typeInfo: TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
    ]
  ): Visitor[
    ASTKindToNode, 
    NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
  ] = js.native
}

