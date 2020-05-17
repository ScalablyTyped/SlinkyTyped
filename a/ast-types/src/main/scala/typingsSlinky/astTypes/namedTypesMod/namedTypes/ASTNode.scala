package typingsSlinky.astTypes.namedTypesMod.namedTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.File
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Program
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Property
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Block
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Import
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
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

