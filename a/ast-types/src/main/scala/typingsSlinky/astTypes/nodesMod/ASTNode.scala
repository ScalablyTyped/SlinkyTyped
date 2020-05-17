package typingsSlinky.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.nodesMod.File
  - typingsSlinky.astTypes.nodesMod.Program
  - typingsSlinky.astTypes.nodesMod.Identifier
  - typingsSlinky.astTypes.nodesMod.BlockStatement
  - typingsSlinky.astTypes.nodesMod.EmptyStatement
  - typingsSlinky.astTypes.nodesMod.ExpressionStatement
  - typingsSlinky.astTypes.nodesMod.IfStatement
  - typingsSlinky.astTypes.nodesMod.LabeledStatement
  - typingsSlinky.astTypes.nodesMod.BreakStatement
  - typingsSlinky.astTypes.nodesMod.ContinueStatement
  - typingsSlinky.astTypes.nodesMod.WithStatement
  - typingsSlinky.astTypes.nodesMod.SwitchStatement
  - typingsSlinky.astTypes.nodesMod.SwitchCase
  - typingsSlinky.astTypes.nodesMod.ReturnStatement
  - typingsSlinky.astTypes.nodesMod.ThrowStatement
  - typingsSlinky.astTypes.nodesMod.TryStatement
  - typingsSlinky.astTypes.nodesMod.CatchClause
  - typingsSlinky.astTypes.nodesMod.WhileStatement
  - typingsSlinky.astTypes.nodesMod.DoWhileStatement
  - typingsSlinky.astTypes.nodesMod.ForStatement
  - typingsSlinky.astTypes.nodesMod.VariableDeclaration
  - typingsSlinky.astTypes.nodesMod.ForInStatement
  - typingsSlinky.astTypes.nodesMod.DebuggerStatement
  - typingsSlinky.astTypes.nodesMod.FunctionDeclaration
  - typingsSlinky.astTypes.nodesMod.FunctionExpression
  - typingsSlinky.astTypes.nodesMod.VariableDeclarator
  - typingsSlinky.astTypes.nodesMod.ThisExpression
  - typingsSlinky.astTypes.nodesMod.ArrayExpression
  - typingsSlinky.astTypes.nodesMod.ObjectExpression
  - typingsSlinky.astTypes.nodesMod.Property
  - typingsSlinky.astTypes.nodesMod.Literal
  - typingsSlinky.astTypes.nodesMod.SequenceExpression
  - typingsSlinky.astTypes.nodesMod.UnaryExpression
  - typingsSlinky.astTypes.nodesMod.BinaryExpression
  - typingsSlinky.astTypes.nodesMod.AssignmentExpression
  - typingsSlinky.astTypes.nodesMod.MemberExpression
  - typingsSlinky.astTypes.nodesMod.UpdateExpression
  - typingsSlinky.astTypes.nodesMod.LogicalExpression
  - typingsSlinky.astTypes.nodesMod.ConditionalExpression
  - typingsSlinky.astTypes.nodesMod.NewExpression
  - typingsSlinky.astTypes.nodesMod.CallExpression
  - typingsSlinky.astTypes.nodesMod.RestElement
  - typingsSlinky.astTypes.nodesMod.TypeAnnotation
  - typingsSlinky.astTypes.nodesMod.TSTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.SpreadElementPattern
  - typingsSlinky.astTypes.nodesMod.ArrowFunctionExpression
  - typingsSlinky.astTypes.nodesMod.ForOfStatement
  - typingsSlinky.astTypes.nodesMod.YieldExpression
  - typingsSlinky.astTypes.nodesMod.GeneratorExpression
  - typingsSlinky.astTypes.nodesMod.ComprehensionBlock
  - typingsSlinky.astTypes.nodesMod.ComprehensionExpression
  - typingsSlinky.astTypes.nodesMod.ObjectProperty
  - typingsSlinky.astTypes.nodesMod.PropertyPattern
  - typingsSlinky.astTypes.nodesMod.ObjectPattern
  - typingsSlinky.astTypes.nodesMod.ArrayPattern
  - typingsSlinky.astTypes.nodesMod.MethodDefinition
  - typingsSlinky.astTypes.nodesMod.SpreadElement
  - typingsSlinky.astTypes.nodesMod.AssignmentPattern
  - typingsSlinky.astTypes.nodesMod.ClassPropertyDefinition
  - typingsSlinky.astTypes.nodesMod.ClassProperty
  - typingsSlinky.astTypes.nodesMod.ClassBody
  - typingsSlinky.astTypes.nodesMod.ClassDeclaration
  - typingsSlinky.astTypes.nodesMod.ClassExpression
  - typingsSlinky.astTypes.nodesMod.ImportSpecifier
  - typingsSlinky.astTypes.nodesMod.ImportNamespaceSpecifier
  - typingsSlinky.astTypes.nodesMod.ImportDefaultSpecifier
  - typingsSlinky.astTypes.nodesMod.ImportDeclaration
  - typingsSlinky.astTypes.nodesMod.TaggedTemplateExpression
  - typingsSlinky.astTypes.nodesMod.TemplateLiteral
  - typingsSlinky.astTypes.nodesMod.TemplateElement
  - typingsSlinky.astTypes.nodesMod.SpreadProperty
  - typingsSlinky.astTypes.nodesMod.SpreadPropertyPattern
  - typingsSlinky.astTypes.nodesMod.AwaitExpression
  - typingsSlinky.astTypes.nodesMod.JSXAttribute
  - typingsSlinky.astTypes.nodesMod.JSXIdentifier
  - typingsSlinky.astTypes.nodesMod.JSXNamespacedName
  - typingsSlinky.astTypes.nodesMod.JSXExpressionContainer
  - typingsSlinky.astTypes.nodesMod.JSXMemberExpression
  - typingsSlinky.astTypes.nodesMod.JSXSpreadAttribute
  - typingsSlinky.astTypes.nodesMod.JSXElement
  - typingsSlinky.astTypes.nodesMod.JSXOpeningElement
  - typingsSlinky.astTypes.nodesMod.JSXClosingElement
  - typingsSlinky.astTypes.nodesMod.JSXFragment
  - typingsSlinky.astTypes.nodesMod.JSXText
  - typingsSlinky.astTypes.nodesMod.JSXOpeningFragment
  - typingsSlinky.astTypes.nodesMod.JSXClosingFragment
  - typingsSlinky.astTypes.nodesMod.JSXEmptyExpression
  - typingsSlinky.astTypes.nodesMod.JSXSpreadChild
  - typingsSlinky.astTypes.nodesMod.TypeParameterDeclaration
  - typingsSlinky.astTypes.nodesMod.TSTypeParameterDeclaration
  - typingsSlinky.astTypes.nodesMod.TypeParameterInstantiation
  - typingsSlinky.astTypes.nodesMod.TSTypeParameterInstantiation
  - typingsSlinky.astTypes.nodesMod.ClassImplements
  - typingsSlinky.astTypes.nodesMod.TSExpressionWithTypeArguments
  - typingsSlinky.astTypes.nodesMod.AnyTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.EmptyTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.MixedTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.VoidTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NumberTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NumberLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NumericLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.StringTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.StringLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.BooleanTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.BooleanLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NullableTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NullLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NullTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ThisTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ExistsTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ExistentialTypeParam
  - typingsSlinky.astTypes.nodesMod.FunctionTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.FunctionTypeParam
  - typingsSlinky.astTypes.nodesMod.ArrayTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ObjectTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ObjectTypeProperty
  - typingsSlinky.astTypes.nodesMod.ObjectTypeSpreadProperty
  - typingsSlinky.astTypes.nodesMod.ObjectTypeIndexer
  - typingsSlinky.astTypes.nodesMod.ObjectTypeCallProperty
  - typingsSlinky.astTypes.nodesMod.ObjectTypeInternalSlot
  - typingsSlinky.astTypes.nodesMod.Variance
  - typingsSlinky.astTypes.nodesMod.QualifiedTypeIdentifier
  - typingsSlinky.astTypes.nodesMod.GenericTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.MemberTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.UnionTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.IntersectionTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.TypeofTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.TypeParameter
  - typingsSlinky.astTypes.nodesMod.InterfaceTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.InterfaceExtends
  - typingsSlinky.astTypes.nodesMod.InterfaceDeclaration
  - typingsSlinky.astTypes.nodesMod.DeclareInterface
  - typingsSlinky.astTypes.nodesMod.TypeAlias
  - typingsSlinky.astTypes.nodesMod.OpaqueType
  - typingsSlinky.astTypes.nodesMod.DeclareTypeAlias
  - typingsSlinky.astTypes.nodesMod.DeclareOpaqueType
  - typingsSlinky.astTypes.nodesMod.TypeCastExpression
  - typingsSlinky.astTypes.nodesMod.TupleTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.DeclareVariable
  - typingsSlinky.astTypes.nodesMod.DeclareFunction
  - typingsSlinky.astTypes.nodesMod.DeclareClass
  - typingsSlinky.astTypes.nodesMod.DeclareModule
  - typingsSlinky.astTypes.nodesMod.DeclareModuleExports
  - typingsSlinky.astTypes.nodesMod.DeclareExportDeclaration
  - typingsSlinky.astTypes.nodesMod.ExportSpecifier
  - typingsSlinky.astTypes.nodesMod.ExportBatchSpecifier
  - typingsSlinky.astTypes.nodesMod.DeclareExportAllDeclaration
  - typingsSlinky.astTypes.nodesMod.InferredPredicate
  - typingsSlinky.astTypes.nodesMod.DeclaredPredicate
  - typingsSlinky.astTypes.nodesMod.ExportDeclaration
  - typingsSlinky.astTypes.nodesMod.Block
  - typingsSlinky.astTypes.nodesMod.Line
  - typingsSlinky.astTypes.nodesMod.Noop
  - typingsSlinky.astTypes.nodesMod.DoExpression
  - typingsSlinky.astTypes.nodesMod.Super
  - typingsSlinky.astTypes.nodesMod.BindExpression
  - typingsSlinky.astTypes.nodesMod.Decorator
  - typingsSlinky.astTypes.nodesMod.MetaProperty
  - typingsSlinky.astTypes.nodesMod.ParenthesizedExpression
  - typingsSlinky.astTypes.nodesMod.ExportDefaultDeclaration
  - typingsSlinky.astTypes.nodesMod.ExportNamedDeclaration
  - typingsSlinky.astTypes.nodesMod.ExportNamespaceSpecifier
  - typingsSlinky.astTypes.nodesMod.ExportDefaultSpecifier
  - typingsSlinky.astTypes.nodesMod.ExportAllDeclaration
  - typingsSlinky.astTypes.nodesMod.CommentBlock
  - typingsSlinky.astTypes.nodesMod.CommentLine
  - typingsSlinky.astTypes.nodesMod.Directive
  - typingsSlinky.astTypes.nodesMod.DirectiveLiteral
  - typingsSlinky.astTypes.nodesMod.InterpreterDirective
  - typingsSlinky.astTypes.nodesMod.StringLiteral
  - typingsSlinky.astTypes.nodesMod.NumericLiteral
  - typingsSlinky.astTypes.nodesMod.BigIntLiteral
  - typingsSlinky.astTypes.nodesMod.NullLiteral
  - typingsSlinky.astTypes.nodesMod.BooleanLiteral
  - typingsSlinky.astTypes.nodesMod.RegExpLiteral
  - typingsSlinky.astTypes.nodesMod.ObjectMethod
  - typingsSlinky.astTypes.nodesMod.ClassPrivateProperty
  - typingsSlinky.astTypes.nodesMod.ClassMethod
  - typingsSlinky.astTypes.nodesMod.ClassPrivateMethod
  - typingsSlinky.astTypes.nodesMod.PrivateName
  - typingsSlinky.astTypes.nodesMod.RestProperty
  - typingsSlinky.astTypes.nodesMod.ForAwaitStatement
  - typingsSlinky.astTypes.nodesMod.Import
  - typingsSlinky.astTypes.nodesMod.TSQualifiedName
  - typingsSlinky.astTypes.nodesMod.TSTypeReference
  - typingsSlinky.astTypes.nodesMod.TSAsExpression
  - typingsSlinky.astTypes.nodesMod.TSNonNullExpression
  - typingsSlinky.astTypes.nodesMod.TSAnyKeyword
  - typingsSlinky.astTypes.nodesMod.TSBigIntKeyword
  - typingsSlinky.astTypes.nodesMod.TSBooleanKeyword
  - typingsSlinky.astTypes.nodesMod.TSNeverKeyword
  - typingsSlinky.astTypes.nodesMod.TSNullKeyword
  - typingsSlinky.astTypes.nodesMod.TSNumberKeyword
  - typingsSlinky.astTypes.nodesMod.TSObjectKeyword
  - typingsSlinky.astTypes.nodesMod.TSStringKeyword
  - typingsSlinky.astTypes.nodesMod.TSSymbolKeyword
  - typingsSlinky.astTypes.nodesMod.TSUndefinedKeyword
  - typingsSlinky.astTypes.nodesMod.TSUnknownKeyword
  - typingsSlinky.astTypes.nodesMod.TSVoidKeyword
  - typingsSlinky.astTypes.nodesMod.TSThisType
  - typingsSlinky.astTypes.nodesMod.TSArrayType
  - typingsSlinky.astTypes.nodesMod.TSLiteralType
  - typingsSlinky.astTypes.nodesMod.TSUnionType
  - typingsSlinky.astTypes.nodesMod.TSIntersectionType
  - typingsSlinky.astTypes.nodesMod.TSConditionalType
  - typingsSlinky.astTypes.nodesMod.TSInferType
  - typingsSlinky.astTypes.nodesMod.TSTypeParameter
  - typingsSlinky.astTypes.nodesMod.TSParenthesizedType
  - typingsSlinky.astTypes.nodesMod.TSFunctionType
  - typingsSlinky.astTypes.nodesMod.TSConstructorType
  - typingsSlinky.astTypes.nodesMod.TSDeclareFunction
  - typingsSlinky.astTypes.nodesMod.TSDeclareMethod
  - typingsSlinky.astTypes.nodesMod.TSMappedType
  - typingsSlinky.astTypes.nodesMod.TSTupleType
  - typingsSlinky.astTypes.nodesMod.TSRestType
  - typingsSlinky.astTypes.nodesMod.TSOptionalType
  - typingsSlinky.astTypes.nodesMod.TSIndexedAccessType
  - typingsSlinky.astTypes.nodesMod.TSTypeOperator
  - typingsSlinky.astTypes.nodesMod.TSIndexSignature
  - typingsSlinky.astTypes.nodesMod.TSPropertySignature
  - typingsSlinky.astTypes.nodesMod.TSMethodSignature
  - typingsSlinky.astTypes.nodesMod.TSTypePredicate
  - typingsSlinky.astTypes.nodesMod.TSCallSignatureDeclaration
  - typingsSlinky.astTypes.nodesMod.TSConstructSignatureDeclaration
  - typingsSlinky.astTypes.nodesMod.TSEnumMember
  - typingsSlinky.astTypes.nodesMod.TSTypeQuery
  - typingsSlinky.astTypes.nodesMod.TSImportType
  - typingsSlinky.astTypes.nodesMod.TSTypeLiteral
  - typingsSlinky.astTypes.nodesMod.TSTypeAssertion
  - typingsSlinky.astTypes.nodesMod.TSEnumDeclaration
  - typingsSlinky.astTypes.nodesMod.TSTypeAliasDeclaration
  - typingsSlinky.astTypes.nodesMod.TSModuleBlock
  - typingsSlinky.astTypes.nodesMod.TSModuleDeclaration
  - typingsSlinky.astTypes.nodesMod.TSImportEqualsDeclaration
  - typingsSlinky.astTypes.nodesMod.TSExternalModuleReference
  - typingsSlinky.astTypes.nodesMod.TSExportAssignment
  - typingsSlinky.astTypes.nodesMod.TSNamespaceExportDeclaration
  - typingsSlinky.astTypes.nodesMod.TSInterfaceBody
  - typingsSlinky.astTypes.nodesMod.TSInterfaceDeclaration
  - typingsSlinky.astTypes.nodesMod.TSParameterProperty
  - typingsSlinky.astTypes.nodesMod.OptionalMemberExpression
  - typingsSlinky.astTypes.nodesMod.OptionalCallExpression
*/
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  implicit def apply(value: AnyTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ArrayExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ArrayPattern): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ArrayTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssignmentExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AssignmentPattern): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: AwaitExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BigIntLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BinaryExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BindExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Block): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BlockStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BooleanLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BooleanLiteralTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BooleanTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: BreakStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: CallExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: CatchClause): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassBody): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassImplements): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassMethod): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassPrivateProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ClassPropertyDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: CommentBlock): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: CommentLine): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ComprehensionBlock): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ComprehensionExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ConditionalExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ContinueStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DebuggerStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareClass): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareExportAllDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareExportDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareFunction): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareInterface): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareModule): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareModuleExports): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareOpaqueType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareTypeAlias): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclareVariable): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DeclaredPredicate): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Decorator): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Directive): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DirectiveLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DoExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: DoWhileStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: EmptyStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: EmptyTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExistentialTypeParam): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExistsTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportAllDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportBatchSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportDefaultDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportDefaultSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportNamedDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportNamespaceSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExportSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ExpressionStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: File): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ForAwaitStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ForInStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ForOfStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ForStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: FunctionExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: FunctionTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: FunctionTypeParam): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: GeneratorExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: GenericTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Identifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: IfStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Import): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ImportDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ImportDefaultSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ImportNamespaceSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ImportSpecifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: InferredPredicate): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: InterfaceDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: InterfaceExtends): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: InterfaceTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: InterpreterDirective): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: IntersectionTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXAttribute): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXClosingElement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXClosingFragment): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXElement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXEmptyExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXExpressionContainer): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXFragment): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXIdentifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXMemberExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXNamespacedName): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXOpeningElement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXOpeningFragment): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXSpreadAttribute): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXSpreadChild): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: JSXText): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: LabeledStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Line): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Literal): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: LogicalExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: MemberExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: MemberTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: MetaProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: MethodDefinition): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: MixedTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NewExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Noop): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NullLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NullLiteralTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NullTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NullableTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NumberLiteralTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NumberTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NumericLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: NumericLiteralTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectMethod): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectPattern): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectTypeCallProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectTypeIndexer): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectTypeInternalSlot): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectTypeProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ObjectTypeSpreadProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: OpaqueType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: OptionalCallExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: OptionalMemberExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ParenthesizedExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: PrivateName): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Program): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Property): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: PropertyPattern): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: QualifiedTypeIdentifier): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: RegExpLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: RestElement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: RestProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ReturnStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SequenceExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SpreadElement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SpreadElementPattern): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SpreadProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SpreadPropertyPattern): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: StringLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: StringLiteralTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: StringTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Super): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SwitchCase): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: SwitchStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSAnyKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSArrayType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSAsExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSBigIntKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSBooleanKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSCallSignatureDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSConditionalType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSConstructSignatureDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSConstructorType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSDeclareFunction): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSDeclareMethod): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSEnumDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSEnumMember): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSExportAssignment): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSExpressionWithTypeArguments): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSExternalModuleReference): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSFunctionType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSImportEqualsDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSImportType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSIndexSignature): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSIndexedAccessType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSInferType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSInterfaceBody): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSInterfaceDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSIntersectionType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSLiteralType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSMappedType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSMethodSignature): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSModuleBlock): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSModuleDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSNamespaceExportDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSNeverKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSNonNullExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSNullKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSNumberKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSObjectKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSOptionalType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSParameterProperty): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSParenthesizedType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSPropertySignature): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSQualifiedName): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSRestType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSStringKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSSymbolKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSThisType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTupleType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeAliasDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeAssertion): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeOperator): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeParameter): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeParameterDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeParameterInstantiation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypePredicate): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeQuery): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSTypeReference): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSUndefinedKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSUnionType): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSUnknownKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TSVoidKeyword): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TaggedTemplateExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TemplateElement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TemplateLiteral): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ThisExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ThisTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ThrowStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TryStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TupleTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeAlias): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeCastExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeParameter): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeParameterDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeParameterInstantiation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: TypeofTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: UnaryExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: UnionTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: UpdateExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: VariableDeclaration): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: VariableDeclarator): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: Variance): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: VoidTypeAnnotation): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: WhileStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: WithStatement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: YieldExpression): ASTNode = value.asInstanceOf[ASTNode]
}

