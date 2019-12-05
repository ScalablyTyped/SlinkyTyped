package typingsSlinky.astDashTypes.genVisitorMod

import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.AnyTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ArrayExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ArrayPattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ArrayTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ArrowFunctionExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.AssignmentExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.AssignmentPattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.AwaitExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BigIntLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BindExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Block
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BlockStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BooleanTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BreakStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CallExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CatchClause
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassImplements
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Comment
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CommentBlock
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CommentLine
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionBlock
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ConditionalExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ContinueStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DebuggerStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Declaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareClass
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportAllDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareFunction
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareModule
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareModuleExports
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareOpaqueType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclareVariable
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DeclaredPredicate
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Decorator
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Directive
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DirectiveLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DoExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DoWhileStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.EmptyStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.EmptyTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExistentialTypeParam
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExistsTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportAllDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportBatchSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportNamedDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportNamespaceSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExportSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Expression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExpressionStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.File
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Flow
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FlowPredicate
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FlowType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForAwaitStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForInStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForOfStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Function
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeParam
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.GeneratorExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Identifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.IfStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Import
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportDefaultSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportNamespaceSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InferredPredicate
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InterfaceExtends
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InterpreterDirective
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.IntersectionTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXAttribute
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingElement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingFragment
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXElement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXEmptyExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXExpressionContainer
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXFragment
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXIdentifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXMemberExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXNamespacedName
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningElement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningFragment
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadAttribute
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadChild
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXText
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.LabeledStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Line
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Literal
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MemberExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MetaProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MixedTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ModuleSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NewExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Node
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Noop
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NullLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NullLiteralTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NullTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NullableTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NumberLiteralTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NumberTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteralTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectMethod
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectPattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeCallProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeIndexer
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeInternalSlot
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeSpreadProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.OpaqueType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.OptionalCallExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.OptionalMemberExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ParenthesizedExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Pattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Position
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Printable
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.PrivateName
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Program
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Property
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.PropertyPattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.QualifiedTypeIdentifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.RegExpLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.RestElement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.RestProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ReturnStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SequenceExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SourceLocation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Specifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadElement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadElementPattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadPropertyPattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Statement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.StringLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.StringLiteralTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.StringTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Super
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SwitchCase
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SwitchStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSAnyKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSArrayType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSAsExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSBigIntKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSBooleanKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSConditionalType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSConstructorType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareFunction
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSEnumDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSEnumMember
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSExportAssignment
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSExpressionWithTypeArguments
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSExternalModuleReference
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSFunctionType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSHasOptionalTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSHasOptionalTypeParameters
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSImportEqualsDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSImportType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSIndexedAccessType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSInferType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceBody
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSIntersectionType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSLiteralType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSMappedType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSModuleBlock
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSNamespaceExportDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSNeverKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSNonNullExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSNullKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSNumberKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSObjectKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSOptionalType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSParameterProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSParenthesizedType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSPropertySignature
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSQualifiedName
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSRestType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSStringKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSSymbolKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSThisType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTupleType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAssertion
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeOperator
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterInstantiation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypePredicate
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeQuery
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeReference
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSUndefinedKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSUnionType
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSUnknownKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSVoidKeyword
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TaggedTemplateExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TemplateElement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TemplateLiteral
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ThisExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ThisTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ThrowStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TryStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TupleTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TypeAlias
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TypeCastExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TypeParameter
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterInstantiation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TypeofTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.UnaryExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.UnionTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.UpdateExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclarator
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Variance
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.VoidTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.WhileStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.WithStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.YieldExpression
import typingsSlinky.astDashTypes.libNodeDashPathMod.NodePath
import typingsSlinky.astDashTypes.libPathDashVisitorMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[M] extends js.Object {
  var visitAnyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]
  ] = js.undefined
  var visitArrayExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]
  ] = js.undefined
  var visitArrayPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]
  ] = js.undefined
  var visitArrayTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]
  ] = js.undefined
  var visitArrowFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
  ] = js.undefined
  var visitAssignmentExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
  ] = js.undefined
  var visitAssignmentPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]
  ] = js.undefined
  var visitAwaitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]
  ] = js.undefined
  var visitBigIntLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]
  ] = js.undefined
  var visitBinaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]
  ] = js.undefined
  var visitBindExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]
  ] = js.undefined
  var visitBlock: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]] = js.undefined
  var visitBlockStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]
  ] = js.undefined
  var visitBooleanLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]
  ] = js.undefined
  var visitBooleanLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitBooleanTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
  ] = js.undefined
  var visitBreakStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]
  ] = js.undefined
  var visitCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]
  ] = js.undefined
  var visitCatchClause: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]
  ] = js.undefined
  var visitClassBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]
  ] = js.undefined
  var visitClassDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]
  ] = js.undefined
  var visitClassExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]
  ] = js.undefined
  var visitClassImplements: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]
  ] = js.undefined
  var visitClassMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]
  ] = js.undefined
  var visitClassPrivateMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]
  ] = js.undefined
  var visitClassPrivateProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
  ] = js.undefined
  var visitClassProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]
  ] = js.undefined
  var visitClassPropertyDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
  ] = js.undefined
  var visitComment: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]] = js.undefined
  var visitCommentBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]
  ] = js.undefined
  var visitCommentLine: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]
  ] = js.undefined
  var visitComprehensionBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]
  ] = js.undefined
  var visitComprehensionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
  ] = js.undefined
  var visitConditionalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
  ] = js.undefined
  var visitContinueStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]
  ] = js.undefined
  var visitDebuggerStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]
  ] = js.undefined
  var visitDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]
  ] = js.undefined
  var visitDeclareClass: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]
  ] = js.undefined
  var visitDeclareExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
  ] = js.undefined
  var visitDeclareExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
  ] = js.undefined
  var visitDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]
  ] = js.undefined
  var visitDeclareInterface: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]
  ] = js.undefined
  var visitDeclareModule: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]
  ] = js.undefined
  var visitDeclareModuleExports: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
  ] = js.undefined
  var visitDeclareOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]
  ] = js.undefined
  var visitDeclareTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]
  ] = js.undefined
  var visitDeclareVariable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]
  ] = js.undefined
  var visitDeclaredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]
  ] = js.undefined
  var visitDecorator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]
  ] = js.undefined
  var visitDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]
  ] = js.undefined
  var visitDirectiveLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]
  ] = js.undefined
  var visitDoExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]
  ] = js.undefined
  var visitDoWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]
  ] = js.undefined
  var visitEmptyStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]
  ] = js.undefined
  var visitEmptyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]
  ] = js.undefined
  var visitExistentialTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
  ] = js.undefined
  var visitExistsTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
  ] = js.undefined
  var visitExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
  ] = js.undefined
  var visitExportBatchSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
  ] = js.undefined
  var visitExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]
  ] = js.undefined
  var visitExportDefaultDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
  ] = js.undefined
  var visitExportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
  ] = js.undefined
  var visitExportNamedDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
  ] = js.undefined
  var visitExportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
  ] = js.undefined
  var visitExportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]
  ] = js.undefined
  var visitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]
  ] = js.undefined
  var visitExpressionStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]
  ] = js.undefined
  var visitFile: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]] = js.undefined
  var visitFlow: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]] = js.undefined
  var visitFlowPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]
  ] = js.undefined
  var visitFlowType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]] = js.undefined
  var visitForAwaitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]
  ] = js.undefined
  var visitForInStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]
  ] = js.undefined
  var visitForOfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]
  ] = js.undefined
  var visitForStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]
  ] = js.undefined
  var visitFunction: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]] = js.undefined
  var visitFunctionDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]
  ] = js.undefined
  var visitFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]
  ] = js.undefined
  var visitFunctionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
  ] = js.undefined
  var visitFunctionTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]
  ] = js.undefined
  var visitGeneratorExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]
  ] = js.undefined
  var visitGenericTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
  ] = js.undefined
  var visitIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]
  ] = js.undefined
  var visitIfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]
  ] = js.undefined
  var visitImport: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]] = js.undefined
  var visitImportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]
  ] = js.undefined
  var visitImportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
  ] = js.undefined
  var visitImportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
  ] = js.undefined
  var visitImportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]
  ] = js.undefined
  var visitInferredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]
  ] = js.undefined
  var visitInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
  ] = js.undefined
  var visitInterfaceExtends: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]
  ] = js.undefined
  var visitInterfaceTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
  ] = js.undefined
  var visitInterpreterDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
  ] = js.undefined
  var visitIntersectionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
  ] = js.undefined
  var visitJSXAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]
  ] = js.undefined
  var visitJSXClosingElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]
  ] = js.undefined
  var visitJSXClosingFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]
  ] = js.undefined
  var visitJSXElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]
  ] = js.undefined
  var visitJSXEmptyExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]
  ] = js.undefined
  var visitJSXExpressionContainer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
  ] = js.undefined
  var visitJSXFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]
  ] = js.undefined
  var visitJSXIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]
  ] = js.undefined
  var visitJSXMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]
  ] = js.undefined
  var visitJSXNamespacedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]
  ] = js.undefined
  var visitJSXOpeningElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]
  ] = js.undefined
  var visitJSXOpeningFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]
  ] = js.undefined
  var visitJSXSpreadAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]
  ] = js.undefined
  var visitJSXSpreadChild: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]
  ] = js.undefined
  var visitJSXText: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]] = js.undefined
  var visitLabeledStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]
  ] = js.undefined
  var visitLine: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]] = js.undefined
  var visitLiteral: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]] = js.undefined
  var visitLogicalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]
  ] = js.undefined
  var visitMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]
  ] = js.undefined
  var visitMemberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
  ] = js.undefined
  var visitMetaProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]
  ] = js.undefined
  var visitMethodDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]
  ] = js.undefined
  var visitMixedTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]
  ] = js.undefined
  var visitModuleSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]
  ] = js.undefined
  var visitNewExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]
  ] = js.undefined
  var visitNode: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]] = js.undefined
  var visitNoop: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]] = js.undefined
  var visitNullLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]
  ] = js.undefined
  var visitNullLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitNullTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]
  ] = js.undefined
  var visitNullableTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumberLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumericLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]
  ] = js.undefined
  var visitNumericLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitObjectExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]
  ] = js.undefined
  var visitObjectMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]
  ] = js.undefined
  var visitObjectPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]
  ] = js.undefined
  var visitObjectProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]
  ] = js.undefined
  var visitObjectTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
  ] = js.undefined
  var visitObjectTypeCallProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
  ] = js.undefined
  var visitObjectTypeIndexer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]
  ] = js.undefined
  var visitObjectTypeInternalSlot: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
  ] = js.undefined
  var visitObjectTypeProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]
  ] = js.undefined
  var visitObjectTypeSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
  ] = js.undefined
  var visitOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]
  ] = js.undefined
  var visitOptionalCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
  ] = js.undefined
  var visitOptionalMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
  ] = js.undefined
  var visitParenthesizedExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
  ] = js.undefined
  var visitPattern: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]] = js.undefined
  var visitPosition: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]] = js.undefined
  var visitPrintable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]
  ] = js.undefined
  var visitPrivateName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]
  ] = js.undefined
  var visitProgram: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]] = js.undefined
  var visitProperty: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]] = js.undefined
  var visitPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]
  ] = js.undefined
  var visitQualifiedTypeIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
  ] = js.undefined
  var visitRegExpLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]
  ] = js.undefined
  var visitRestElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]
  ] = js.undefined
  var visitRestProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]
  ] = js.undefined
  var visitReturnStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]
  ] = js.undefined
  var visitSequenceExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]
  ] = js.undefined
  var visitSourceLocation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]
  ] = js.undefined
  var visitSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]
  ] = js.undefined
  var visitSpreadElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]
  ] = js.undefined
  var visitSpreadElementPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
  ] = js.undefined
  var visitSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]
  ] = js.undefined
  var visitSpreadPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
  ] = js.undefined
  var visitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]
  ] = js.undefined
  var visitStringLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]
  ] = js.undefined
  var visitStringLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitStringTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
  ] = js.undefined
  var visitSuper: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]] = js.undefined
  var visitSwitchCase: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]
  ] = js.undefined
  var visitSwitchStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]
  ] = js.undefined
  var visitTSAnyKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]
  ] = js.undefined
  var visitTSArrayType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]
  ] = js.undefined
  var visitTSAsExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]
  ] = js.undefined
  var visitTSBigIntKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]
  ] = js.undefined
  var visitTSBooleanKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]
  ] = js.undefined
  var visitTSCallSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
  ] = js.undefined
  var visitTSConditionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]
  ] = js.undefined
  var visitTSConstructSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSConstructSignatureDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSConstructorType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]
  ] = js.undefined
  var visitTSDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]
  ] = js.undefined
  var visitTSDeclareMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]
  ] = js.undefined
  var visitTSEnumDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]
  ] = js.undefined
  var visitTSEnumMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]
  ] = js.undefined
  var visitTSExportAssignment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]
  ] = js.undefined
  var visitTSExpressionWithTypeArguments: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
  ] = js.undefined
  var visitTSExternalModuleReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
  ] = js.undefined
  var visitTSFunctionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]
  ] = js.undefined
  var visitTSHasOptionalTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
  ] = js.undefined
  var visitTSHasOptionalTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
      _
    ]
  ] = js.undefined
  var visitTSHasOptionalTypeParameters: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
  ] = js.undefined
  var visitTSImportEqualsDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
  ] = js.undefined
  var visitTSImportType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]
  ] = js.undefined
  var visitTSIndexSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]
  ] = js.undefined
  var visitTSIndexedAccessType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]
  ] = js.undefined
  var visitTSInferType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]
  ] = js.undefined
  var visitTSInterfaceBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]
  ] = js.undefined
  var visitTSInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
  ] = js.undefined
  var visitTSIntersectionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]
  ] = js.undefined
  var visitTSLiteralType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]
  ] = js.undefined
  var visitTSMappedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]
  ] = js.undefined
  var visitTSMethodSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]
  ] = js.undefined
  var visitTSModuleBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]
  ] = js.undefined
  var visitTSModuleDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]
  ] = js.undefined
  var visitTSNamespaceExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
  ] = js.undefined
  var visitTSNeverKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]
  ] = js.undefined
  var visitTSNonNullExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]
  ] = js.undefined
  var visitTSNullKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]
  ] = js.undefined
  var visitTSNumberKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]
  ] = js.undefined
  var visitTSObjectKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]
  ] = js.undefined
  var visitTSOptionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]
  ] = js.undefined
  var visitTSParameterProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]
  ] = js.undefined
  var visitTSParenthesizedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]
  ] = js.undefined
  var visitTSPropertySignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]
  ] = js.undefined
  var visitTSQualifiedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]
  ] = js.undefined
  var visitTSRestType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]
  ] = js.undefined
  var visitTSStringKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]
  ] = js.undefined
  var visitTSSymbolKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]
  ] = js.undefined
  var visitTSThisType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]
  ] = js.undefined
  var visitTSTupleType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]
  ] = js.undefined
  var visitTSType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]] = js.undefined
  var visitTSTypeAliasDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
  ] = js.undefined
  var visitTSTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]
  ] = js.undefined
  var visitTSTypeAssertion: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]
  ] = js.undefined
  var visitTSTypeLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]
  ] = js.undefined
  var visitTSTypeOperator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]
  ] = js.undefined
  var visitTSTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]
  ] = js.undefined
  var visitTSTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
  ] = js.undefined
  var visitTSTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
  ] = js.undefined
  var visitTSTypePredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]
  ] = js.undefined
  var visitTSTypeQuery: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]
  ] = js.undefined
  var visitTSTypeReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]
  ] = js.undefined
  var visitTSUndefinedKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]
  ] = js.undefined
  var visitTSUnionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]
  ] = js.undefined
  var visitTSUnknownKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]
  ] = js.undefined
  var visitTSVoidKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]
  ] = js.undefined
  var visitTaggedTemplateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
  ] = js.undefined
  var visitTemplateElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]
  ] = js.undefined
  var visitTemplateLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]
  ] = js.undefined
  var visitThisExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]
  ] = js.undefined
  var visitThisTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]
  ] = js.undefined
  var visitThrowStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]
  ] = js.undefined
  var visitTryStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]
  ] = js.undefined
  var visitTupleTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]
  ] = js.undefined
  var visitTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]
  ] = js.undefined
  var visitTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]
  ] = js.undefined
  var visitTypeCastExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]
  ] = js.undefined
  var visitTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]
  ] = js.undefined
  var visitTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
  ] = js.undefined
  var visitTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
  ] = js.undefined
  var visitTypeofTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
  ] = js.undefined
  var visitUnaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]
  ] = js.undefined
  var visitUnionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]
  ] = js.undefined
  var visitUpdateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]
  ] = js.undefined
  var visitVariableDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclaration, _], _]
  ] = js.undefined
  var visitVariableDeclarator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclarator, _], _]
  ] = js.undefined
  var visitVariance: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Variance, _], _]] = js.undefined
  var visitVoidTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VoidTypeAnnotation, _], _]
  ] = js.undefined
  var visitWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WhileStatement, _], _]
  ] = js.undefined
  var visitWithStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WithStatement, _], _]
  ] = js.undefined
  var visitYieldExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[YieldExpression, _], _]
  ] = js.undefined
}

