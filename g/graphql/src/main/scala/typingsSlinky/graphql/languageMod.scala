package typingsSlinky.graphql

import typingsSlinky.graphql.anon.VisitorKeyMapASTKindToNod
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
import typingsSlinky.graphql.graphqlStrings.$
import typingsSlinky.graphql.graphqlStrings.Ampersand
import typingsSlinky.graphql.graphqlStrings.Argument
import typingsSlinky.graphql.graphqlStrings.BlockString
import typingsSlinky.graphql.graphqlStrings.BooleanValue
import typingsSlinky.graphql.graphqlStrings.Colon
import typingsSlinky.graphql.graphqlStrings.Comment
import typingsSlinky.graphql.graphqlStrings.Directive
import typingsSlinky.graphql.graphqlStrings.DirectiveDefinition
import typingsSlinky.graphql.graphqlStrings.Document
import typingsSlinky.graphql.graphqlStrings.DotDotDot
import typingsSlinky.graphql.graphqlStrings.EnumTypeDefinition
import typingsSlinky.graphql.graphqlStrings.EnumTypeExtension
import typingsSlinky.graphql.graphqlStrings.EnumValue
import typingsSlinky.graphql.graphqlStrings.EnumValueDefinition
import typingsSlinky.graphql.graphqlStrings.Equalssign
import typingsSlinky.graphql.graphqlStrings.Exclamationmark
import typingsSlinky.graphql.graphqlStrings.FieldDefinition
import typingsSlinky.graphql.graphqlStrings.Field_
import typingsSlinky.graphql.graphqlStrings.Float
import typingsSlinky.graphql.graphqlStrings.FloatValue
import typingsSlinky.graphql.graphqlStrings.FragmentDefinition
import typingsSlinky.graphql.graphqlStrings.FragmentSpread
import typingsSlinky.graphql.graphqlStrings.InlineFragment
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.InputValueDefinition
import typingsSlinky.graphql.graphqlStrings.Int
import typingsSlinky.graphql.graphqlStrings.IntValue
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeExtension
import typingsSlinky.graphql.graphqlStrings.Leftcurlybracket
import typingsSlinky.graphql.graphqlStrings.Leftparenthesis
import typingsSlinky.graphql.graphqlStrings.LessthansignEOFGreaterthansign
import typingsSlinky.graphql.graphqlStrings.LessthansignSOFGreaterthansign
import typingsSlinky.graphql.graphqlStrings.ListType
import typingsSlinky.graphql.graphqlStrings.ListValue
import typingsSlinky.graphql.graphqlStrings.Name
import typingsSlinky.graphql.graphqlStrings.NamedType
import typingsSlinky.graphql.graphqlStrings.NonNullType
import typingsSlinky.graphql.graphqlStrings.NullValue
import typingsSlinky.graphql.graphqlStrings.ObjectField
import typingsSlinky.graphql.graphqlStrings.ObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.ObjectValue
import typingsSlinky.graphql.graphqlStrings.OperationDefinition
import typingsSlinky.graphql.graphqlStrings.OperationTypeDefinition
import typingsSlinky.graphql.graphqlStrings.Rightcurlybracket
import typingsSlinky.graphql.graphqlStrings.Rightparenthesis
import typingsSlinky.graphql.graphqlStrings.ScalarTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ScalarTypeExtension
import typingsSlinky.graphql.graphqlStrings.SchemaDefinition
import typingsSlinky.graphql.graphqlStrings.SchemaExtension
import typingsSlinky.graphql.graphqlStrings.SelectionSet
import typingsSlinky.graphql.graphqlStrings.StringValue
import typingsSlinky.graphql.graphqlStrings.UnionTypeDefinition
import typingsSlinky.graphql.graphqlStrings.UnionTypeExtension
import typingsSlinky.graphql.graphqlStrings.Variable
import typingsSlinky.graphql.graphqlStrings.VariableDefinition
import typingsSlinky.graphql.graphqlStrings.Verticalline
import typingsSlinky.graphql.graphqlStrings.`@`
import typingsSlinky.graphql.graphqlStrings.`[`
import typingsSlinky.graphql.graphqlStrings.`]`
import typingsSlinky.graphql.locationMod.SourceLocation
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.tokenKindMod.TokenKindEnum
import typingsSlinky.graphql.visitorMod.VisitFn
import typingsSlinky.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  @js.native
  class Lexer protected ()
    extends typingsSlinky.graphql.lexerMod.Lexer {
    def this(source: typingsSlinky.graphql.sourceMod.Source) = this()
  }
  
  @js.native
  class Location protected ()
    extends typingsSlinky.graphql.astMod.Location {
    def this(
      startToken: typingsSlinky.graphql.astMod.Token,
      endToken: typingsSlinky.graphql.astMod.Token,
      source: typingsSlinky.graphql.sourceMod.Source
    ) = this()
  }
  
  @js.native
  class Source protected ()
    extends typingsSlinky.graphql.sourceMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(
      body: String,
      name: js.UndefOr[scala.Nothing],
      locationOffset: typingsSlinky.graphql.sourceMod.Location
    ) = this()
    def this(body: String, name: String, locationOffset: typingsSlinky.graphql.sourceMod.Location) = this()
  }
  
  @js.native
  class Token protected ()
    extends typingsSlinky.graphql.astMod.Token {
    def this(kind: TokenKindEnum, start: Double, end: Double, line: Double, column: Double) = this()
    def this(
      kind: TokenKindEnum,
      start: Double,
      end: Double,
      line: Double,
      column: Double,
      prev: typingsSlinky.graphql.astMod.Token
    ) = this()
    def this(
      kind: TokenKindEnum,
      start: Double,
      end: Double,
      line: Double,
      column: Double,
      prev: Null,
      value: String
    ) = this()
    def this(
      kind: TokenKindEnum,
      start: Double,
      end: Double,
      line: Double,
      column: Double,
      prev: typingsSlinky.graphql.astMod.Token,
      value: String
    ) = this()
  }
  
  val BREAK: js.Any = js.native
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
  @js.native
  object DirectiveLocation extends js.Object {
    var ARGUMENT_DEFINITION: typingsSlinky.graphql.graphqlStrings.ARGUMENT_DEFINITION = js.native
    var ENUM: typingsSlinky.graphql.graphqlStrings.ENUM = js.native
    var ENUM_VALUE: typingsSlinky.graphql.graphqlStrings.ENUM_VALUE = js.native
    var FIELD: typingsSlinky.graphql.graphqlStrings.FIELD = js.native
    var FIELD_DEFINITION: typingsSlinky.graphql.graphqlStrings.FIELD_DEFINITION = js.native
    var FRAGMENT_DEFINITION: typingsSlinky.graphql.graphqlStrings.FRAGMENT_DEFINITION = js.native
    var FRAGMENT_SPREAD: typingsSlinky.graphql.graphqlStrings.FRAGMENT_SPREAD = js.native
    var INLINE_FRAGMENT: typingsSlinky.graphql.graphqlStrings.INLINE_FRAGMENT = js.native
    var INPUT_FIELD_DEFINITION: typingsSlinky.graphql.graphqlStrings.INPUT_FIELD_DEFINITION = js.native
    var INPUT_OBJECT: typingsSlinky.graphql.graphqlStrings.INPUT_OBJECT = js.native
    var INTERFACE: typingsSlinky.graphql.graphqlStrings.INTERFACE = js.native
    var MUTATION: typingsSlinky.graphql.graphqlStrings.MUTATION = js.native
    var OBJECT: typingsSlinky.graphql.graphqlStrings.OBJECT = js.native
    // Request Definitions
    var QUERY: typingsSlinky.graphql.graphqlStrings.QUERY = js.native
    var SCALAR: typingsSlinky.graphql.graphqlStrings.SCALAR = js.native
    // Type System Definitions
    var SCHEMA: typingsSlinky.graphql.graphqlStrings.SCHEMA = js.native
    var SUBSCRIPTION: typingsSlinky.graphql.graphqlStrings.SUBSCRIPTION = js.native
    var UNION: typingsSlinky.graphql.graphqlStrings.UNION = js.native
    var VARIABLE_DEFINITION: typingsSlinky.graphql.graphqlStrings.VARIABLE_DEFINITION = js.native
  }
  
  @js.native
  object Kind extends js.Object {
    var ARGUMENT: Argument = js.native
    var BOOLEAN: BooleanValue = js.native
    // Directives
    var DIRECTIVE: Directive = js.native
    // Directive Definitions
    var DIRECTIVE_DEFINITION: DirectiveDefinition = js.native
    // Document
    var DOCUMENT: Document = js.native
    var ENUM: EnumValue = js.native
    var ENUM_TYPE_DEFINITION: EnumTypeDefinition = js.native
    var ENUM_TYPE_EXTENSION: EnumTypeExtension = js.native
    var ENUM_VALUE_DEFINITION: EnumValueDefinition = js.native
    var FIELD: Field_ = js.native
    var FIELD_DEFINITION: FieldDefinition = js.native
    var FLOAT: FloatValue = js.native
    var FRAGMENT_DEFINITION: FragmentDefinition = js.native
    // Fragments
    var FRAGMENT_SPREAD: FragmentSpread = js.native
    var INLINE_FRAGMENT: InlineFragment = js.native
    var INPUT_OBJECT_TYPE_DEFINITION: InputObjectTypeDefinition = js.native
    var INPUT_OBJECT_TYPE_EXTENSION: InputObjectTypeExtension = js.native
    var INPUT_VALUE_DEFINITION: InputValueDefinition = js.native
    var INT: IntValue = js.native
    var INTERFACE_TYPE_DEFINITION: InterfaceTypeDefinition = js.native
    var INTERFACE_TYPE_EXTENSION: InterfaceTypeExtension = js.native
    var LIST: ListValue = js.native
    var LIST_TYPE: ListType = js.native
    // Name
    var NAME: Name = js.native
    // Types
    var NAMED_TYPE: NamedType = js.native
    var NON_NULL_TYPE: NonNullType = js.native
    var NULL: NullValue = js.native
    var OBJECT: ObjectValue = js.native
    var OBJECT_FIELD: ObjectField = js.native
    var OBJECT_TYPE_DEFINITION: ObjectTypeDefinition = js.native
    var OBJECT_TYPE_EXTENSION: ObjectTypeExtension = js.native
    var OPERATION_DEFINITION: OperationDefinition = js.native
    var OPERATION_TYPE_DEFINITION: OperationTypeDefinition = js.native
    // Type Definitions
    var SCALAR_TYPE_DEFINITION: ScalarTypeDefinition = js.native
    // Type Extensions
    var SCALAR_TYPE_EXTENSION: ScalarTypeExtension = js.native
    // Type System Definitions
    var SCHEMA_DEFINITION: SchemaDefinition = js.native
    // Type System Extensions
    var SCHEMA_EXTENSION: SchemaExtension = js.native
    var SELECTION_SET: SelectionSet = js.native
    var STRING: StringValue = js.native
    var UNION_TYPE_DEFINITION: UnionTypeDefinition = js.native
    var UNION_TYPE_EXTENSION: UnionTypeExtension = js.native
    // Values
    var VARIABLE: Variable = js.native
    var VARIABLE_DEFINITION: VariableDefinition = js.native
  }
  
  @js.native
  object TokenKind extends js.Object {
    var AMP: Ampersand = js.native
    var AT: `@` = js.native
    var BANG: Exclamationmark = js.native
    var BLOCK_STRING: BlockString = js.native
    var BRACE_L: Leftcurlybracket = js.native
    var BRACE_R: Rightcurlybracket = js.native
    var BRACKET_L: `[` = js.native
    var BRACKET_R: `]` = js.native
    var COLON: Colon = js.native
    var COMMENT: Comment = js.native
    var DOLLAR: $ = js.native
    var EOF: LessthansignEOFGreaterthansign = js.native
    var EQUALS: Equalssign = js.native
    var FLOAT: Float = js.native
    var INT: Int = js.native
    var NAME: Name = js.native
    var PAREN_L: Leftparenthesis = js.native
    var PAREN_R: Rightparenthesis = js.native
    var PIPE: Verticalline = js.native
    var SOF: LessthansignSOFGreaterthansign = js.native
    var SPREAD: DotDotDot = js.native
    var STRING: typingsSlinky.graphql.graphqlStrings.String = js.native
  }
  
}

