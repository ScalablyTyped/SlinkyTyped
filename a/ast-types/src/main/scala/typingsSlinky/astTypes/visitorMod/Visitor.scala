package typingsSlinky.astTypes.visitorMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Block
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Comment
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Declaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Expression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.File
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Flow
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowPredicate
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Function
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Import
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ModuleSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Node
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Pattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Position
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Printable
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Program
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Property
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SourceLocation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Specifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Statement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.astTypes.pathVisitorMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor[M] extends js.Object {
  var visitAnyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]
  ] = js.native
  var visitArrayExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]
  ] = js.native
  var visitArrayPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]
  ] = js.native
  var visitArrayTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]
  ] = js.native
  var visitArrowFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
  ] = js.native
  var visitAssignmentExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
  ] = js.native
  var visitAssignmentPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]
  ] = js.native
  var visitAwaitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]
  ] = js.native
  var visitBigIntLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]
  ] = js.native
  var visitBinaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]
  ] = js.native
  var visitBindExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]
  ] = js.native
  var visitBlock: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]] = js.native
  var visitBlockStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]
  ] = js.native
  var visitBooleanLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]
  ] = js.native
  var visitBooleanLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
  ] = js.native
  var visitBooleanTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
  ] = js.native
  var visitBreakStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]
  ] = js.native
  var visitCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]
  ] = js.native
  var visitCatchClause: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]
  ] = js.native
  var visitClassBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]
  ] = js.native
  var visitClassDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]
  ] = js.native
  var visitClassExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]
  ] = js.native
  var visitClassImplements: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]
  ] = js.native
  var visitClassMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]
  ] = js.native
  var visitClassPrivateMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]
  ] = js.native
  var visitClassPrivateProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
  ] = js.native
  var visitClassProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]
  ] = js.native
  var visitClassPropertyDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
  ] = js.native
  var visitComment: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]] = js.native
  var visitCommentBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]
  ] = js.native
  var visitCommentLine: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]
  ] = js.native
  var visitComprehensionBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]
  ] = js.native
  var visitComprehensionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
  ] = js.native
  var visitConditionalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
  ] = js.native
  var visitContinueStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]
  ] = js.native
  var visitDebuggerStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]
  ] = js.native
  var visitDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]
  ] = js.native
  var visitDeclareClass: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]
  ] = js.native
  var visitDeclareExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
  ] = js.native
  var visitDeclareExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
  ] = js.native
  var visitDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]
  ] = js.native
  var visitDeclareInterface: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]
  ] = js.native
  var visitDeclareModule: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]
  ] = js.native
  var visitDeclareModuleExports: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
  ] = js.native
  var visitDeclareOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]
  ] = js.native
  var visitDeclareTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]
  ] = js.native
  var visitDeclareVariable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]
  ] = js.native
  var visitDeclaredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]
  ] = js.native
  var visitDecorator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]
  ] = js.native
  var visitDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]
  ] = js.native
  var visitDirectiveLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]
  ] = js.native
  var visitDoExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]
  ] = js.native
  var visitDoWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]
  ] = js.native
  var visitEmptyStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]
  ] = js.native
  var visitEmptyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]
  ] = js.native
  var visitExistentialTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
  ] = js.native
  var visitExistsTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
  ] = js.native
  var visitExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
  ] = js.native
  var visitExportBatchSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
  ] = js.native
  var visitExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]
  ] = js.native
  var visitExportDefaultDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
  ] = js.native
  var visitExportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
  ] = js.native
  var visitExportNamedDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
  ] = js.native
  var visitExportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
  ] = js.native
  var visitExportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]
  ] = js.native
  var visitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]
  ] = js.native
  var visitExpressionStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]
  ] = js.native
  var visitFile: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]] = js.native
  var visitFlow: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]] = js.native
  var visitFlowPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]
  ] = js.native
  var visitFlowType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]] = js.native
  var visitForAwaitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]
  ] = js.native
  var visitForInStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]
  ] = js.native
  var visitForOfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]
  ] = js.native
  var visitForStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]
  ] = js.native
  var visitFunction: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]] = js.native
  var visitFunctionDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]
  ] = js.native
  var visitFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]
  ] = js.native
  var visitFunctionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
  ] = js.native
  var visitFunctionTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]
  ] = js.native
  var visitGeneratorExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]
  ] = js.native
  var visitGenericTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
  ] = js.native
  var visitIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]
  ] = js.native
  var visitIfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]
  ] = js.native
  var visitImport: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]] = js.native
  var visitImportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]
  ] = js.native
  var visitImportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
  ] = js.native
  var visitImportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
  ] = js.native
  var visitImportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]
  ] = js.native
  var visitInferredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]
  ] = js.native
  var visitInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
  ] = js.native
  var visitInterfaceExtends: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]
  ] = js.native
  var visitInterfaceTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
  ] = js.native
  var visitInterpreterDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
  ] = js.native
  var visitIntersectionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
  ] = js.native
  var visitJSXAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]
  ] = js.native
  var visitJSXClosingElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]
  ] = js.native
  var visitJSXClosingFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]
  ] = js.native
  var visitJSXElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]
  ] = js.native
  var visitJSXEmptyExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]
  ] = js.native
  var visitJSXExpressionContainer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
  ] = js.native
  var visitJSXFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]
  ] = js.native
  var visitJSXIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]
  ] = js.native
  var visitJSXMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]
  ] = js.native
  var visitJSXNamespacedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]
  ] = js.native
  var visitJSXOpeningElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]
  ] = js.native
  var visitJSXOpeningFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]
  ] = js.native
  var visitJSXSpreadAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]
  ] = js.native
  var visitJSXSpreadChild: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]
  ] = js.native
  var visitJSXText: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]] = js.native
  var visitLabeledStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]
  ] = js.native
  var visitLine: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]] = js.native
  var visitLiteral: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]] = js.native
  var visitLogicalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]
  ] = js.native
  var visitMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]
  ] = js.native
  var visitMemberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
  ] = js.native
  var visitMetaProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]
  ] = js.native
  var visitMethodDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]
  ] = js.native
  var visitMixedTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]
  ] = js.native
  var visitModuleSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]
  ] = js.native
  var visitNewExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]
  ] = js.native
  var visitNode: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]] = js.native
  var visitNoop: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]] = js.native
  var visitNullLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]
  ] = js.native
  var visitNullLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
  ] = js.native
  var visitNullTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]
  ] = js.native
  var visitNullableTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
  ] = js.native
  var visitNumberLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
  ] = js.native
  var visitNumberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
  ] = js.native
  var visitNumericLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]
  ] = js.native
  var visitNumericLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
  ] = js.native
  var visitObjectExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]
  ] = js.native
  var visitObjectMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]
  ] = js.native
  var visitObjectPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]
  ] = js.native
  var visitObjectProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]
  ] = js.native
  var visitObjectTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
  ] = js.native
  var visitObjectTypeCallProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
  ] = js.native
  var visitObjectTypeIndexer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]
  ] = js.native
  var visitObjectTypeInternalSlot: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
  ] = js.native
  var visitObjectTypeProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]
  ] = js.native
  var visitObjectTypeSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
  ] = js.native
  var visitOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]
  ] = js.native
  var visitOptionalCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
  ] = js.native
  var visitOptionalMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
  ] = js.native
  var visitParenthesizedExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
  ] = js.native
  var visitPattern: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]] = js.native
  var visitPosition: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]] = js.native
  var visitPrintable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]
  ] = js.native
  var visitPrivateName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]
  ] = js.native
  var visitProgram: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]] = js.native
  var visitProperty: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]] = js.native
  var visitPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]
  ] = js.native
  var visitQualifiedTypeIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
  ] = js.native
  var visitRegExpLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]
  ] = js.native
  var visitRestElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]
  ] = js.native
  var visitRestProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]
  ] = js.native
  var visitReturnStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]
  ] = js.native
  var visitSequenceExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]
  ] = js.native
  var visitSourceLocation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]
  ] = js.native
  var visitSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]
  ] = js.native
  var visitSpreadElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]
  ] = js.native
  var visitSpreadElementPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
  ] = js.native
  var visitSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]
  ] = js.native
  var visitSpreadPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
  ] = js.native
  var visitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]
  ] = js.native
  var visitStringLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]
  ] = js.native
  var visitStringLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
  ] = js.native
  var visitStringTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
  ] = js.native
  var visitSuper: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]] = js.native
  var visitSwitchCase: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]
  ] = js.native
  var visitSwitchStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]
  ] = js.native
  var visitTSAnyKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]
  ] = js.native
  var visitTSArrayType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]
  ] = js.native
  var visitTSAsExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]
  ] = js.native
  var visitTSBigIntKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]
  ] = js.native
  var visitTSBooleanKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]
  ] = js.native
  var visitTSCallSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
  ] = js.native
  var visitTSConditionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]
  ] = js.native
  var visitTSConstructSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSConstructSignatureDeclaration, _], 
      _
    ]
  ] = js.native
  var visitTSConstructorType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]
  ] = js.native
  var visitTSDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]
  ] = js.native
  var visitTSDeclareMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]
  ] = js.native
  var visitTSEnumDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]
  ] = js.native
  var visitTSEnumMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]
  ] = js.native
  var visitTSExportAssignment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]
  ] = js.native
  var visitTSExpressionWithTypeArguments: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
  ] = js.native
  var visitTSExternalModuleReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
  ] = js.native
  var visitTSFunctionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]
  ] = js.native
  var visitTSHasOptionalTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
  ] = js.native
  var visitTSHasOptionalTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
      _
    ]
  ] = js.native
  var visitTSHasOptionalTypeParameters: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
  ] = js.native
  var visitTSImportEqualsDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
  ] = js.native
  var visitTSImportType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]
  ] = js.native
  var visitTSIndexSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]
  ] = js.native
  var visitTSIndexedAccessType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]
  ] = js.native
  var visitTSInferType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]
  ] = js.native
  var visitTSInterfaceBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]
  ] = js.native
  var visitTSInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
  ] = js.native
  var visitTSIntersectionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]
  ] = js.native
  var visitTSLiteralType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]
  ] = js.native
  var visitTSMappedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]
  ] = js.native
  var visitTSMethodSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]
  ] = js.native
  var visitTSModuleBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]
  ] = js.native
  var visitTSModuleDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]
  ] = js.native
  var visitTSNamespaceExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
  ] = js.native
  var visitTSNeverKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]
  ] = js.native
  var visitTSNonNullExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]
  ] = js.native
  var visitTSNullKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]
  ] = js.native
  var visitTSNumberKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]
  ] = js.native
  var visitTSObjectKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]
  ] = js.native
  var visitTSOptionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]
  ] = js.native
  var visitTSParameterProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]
  ] = js.native
  var visitTSParenthesizedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]
  ] = js.native
  var visitTSPropertySignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]
  ] = js.native
  var visitTSQualifiedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]
  ] = js.native
  var visitTSRestType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]
  ] = js.native
  var visitTSStringKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]
  ] = js.native
  var visitTSSymbolKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]
  ] = js.native
  var visitTSThisType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]
  ] = js.native
  var visitTSTupleType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]
  ] = js.native
  var visitTSType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]] = js.native
  var visitTSTypeAliasDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
  ] = js.native
  var visitTSTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]
  ] = js.native
  var visitTSTypeAssertion: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]
  ] = js.native
  var visitTSTypeLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]
  ] = js.native
  var visitTSTypeOperator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]
  ] = js.native
  var visitTSTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]
  ] = js.native
  var visitTSTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
  ] = js.native
  var visitTSTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
  ] = js.native
  var visitTSTypePredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]
  ] = js.native
  var visitTSTypeQuery: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]
  ] = js.native
  var visitTSTypeReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]
  ] = js.native
  var visitTSUndefinedKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]
  ] = js.native
  var visitTSUnionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]
  ] = js.native
  var visitTSUnknownKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]
  ] = js.native
  var visitTSVoidKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]
  ] = js.native
  var visitTaggedTemplateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
  ] = js.native
  var visitTemplateElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]
  ] = js.native
  var visitTemplateLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]
  ] = js.native
  var visitThisExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]
  ] = js.native
  var visitThisTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]
  ] = js.native
  var visitThrowStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]
  ] = js.native
  var visitTryStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]
  ] = js.native
  var visitTupleTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]
  ] = js.native
  var visitTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]
  ] = js.native
  var visitTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]
  ] = js.native
  var visitTypeCastExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]
  ] = js.native
  var visitTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]
  ] = js.native
  var visitTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
  ] = js.native
  var visitTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
  ] = js.native
  var visitTypeofTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
  ] = js.native
  var visitUnaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]
  ] = js.native
  var visitUnionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]
  ] = js.native
  var visitUpdateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]
  ] = js.native
  var visitVariableDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclaration, _], _]
  ] = js.native
  var visitVariableDeclarator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclarator, _], _]
  ] = js.native
  var visitVariance: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Variance, _], _]] = js.native
  var visitVoidTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VoidTypeAnnotation, _], _]
  ] = js.native
  var visitWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WhileStatement, _], _]
  ] = js.native
  var visitWithStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WithStatement, _], _]
  ] = js.native
  var visitYieldExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[YieldExpression, _], _]
  ] = js.native
}

object Visitor {
  @scala.inline
  def apply[M](): Visitor[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visitor[M]]
  }
  @scala.inline
  implicit class VisitorOps[Self[m] <: Visitor[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def withVisitAnyTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAnyTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitAnyTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAnyTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitArrayExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrayExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitArrayExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrayExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitArrayPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrayPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitArrayPattern: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrayPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitArrayTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrayTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitArrayTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrayTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitArrowFunctionExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrowFunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitArrowFunctionExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArrowFunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitAssignmentExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAssignmentExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitAssignmentExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAssignmentExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitAssignmentPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAssignmentPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitAssignmentPattern: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAssignmentPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitAwaitExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAwaitExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitAwaitExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAwaitExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBigIntLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBigIntLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBigIntLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBigIntLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBinaryExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBinaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBinaryExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBinaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBindExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBindExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBindExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBindExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBlock: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBlockStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBlockStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBlockStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBlockStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBooleanLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBooleanLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBooleanLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBooleanLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBooleanLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBooleanLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBooleanLiteralTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBooleanLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBooleanTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBooleanTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBooleanTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBooleanTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitBreakStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBreakStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitBreakStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBreakStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitCallExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCallExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitCallExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCallExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitCatchClause(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCatchClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitCatchClause: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCatchClause")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassBody: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassBody")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassImplements(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassImplements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassImplements: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassImplements")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassMethod: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassPrivateMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassPrivateMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassPrivateMethod: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassPrivateMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassPrivateProperty(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassPrivateProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassPrivateProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassPrivateProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitClassPropertyDefinition(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassPropertyDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitClassPropertyDefinition: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitClassPropertyDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitComment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitComment: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitComment")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitCommentBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCommentBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitCommentBlock: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCommentBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitCommentLine(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCommentLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitCommentLine: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCommentLine")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitComprehensionBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitComprehensionBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitComprehensionBlock: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitComprehensionBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitComprehensionExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitComprehensionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitComprehensionExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitComprehensionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitConditionalExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitConditionalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitConditionalExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitConditionalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitContinueStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitContinueStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitContinueStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitContinueStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDebuggerStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDebuggerStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDebuggerStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDebuggerStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareClass(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareClass: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareExportAllDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareExportAllDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareExportAllDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareExportAllDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareExportDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareExportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareExportDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareExportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareFunction: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareInterface(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareInterface: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareModule(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareModule: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareModule")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareModuleExports(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareModuleExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareModuleExports: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareModuleExports")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareOpaqueType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareOpaqueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareOpaqueType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareOpaqueType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareTypeAlias(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareTypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareTypeAlias: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareTypeAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclareVariable(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclareVariable: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclareVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDeclaredPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclaredPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDeclaredPredicate: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclaredPredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDecorator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDecorator: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDecorator")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDirective(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDirective: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDirective")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDirectiveLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDirectiveLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDirectiveLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDirectiveLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDoExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDoExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDoExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDoExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitDoWhileStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDoWhileStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitDoWhileStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDoWhileStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitEmptyStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitEmptyStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitEmptyStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitEmptyStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitEmptyTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitEmptyTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitEmptyTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitEmptyTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExistentialTypeParam(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExistentialTypeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExistentialTypeParam: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExistentialTypeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExistsTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExistsTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExistsTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExistsTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportAllDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportAllDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportAllDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportAllDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportBatchSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportBatchSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportBatchSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportBatchSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportDefaultDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportDefaultDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportDefaultDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportDefaultDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportDefaultSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportDefaultSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportDefaultSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportNamedDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportNamedDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportNamedDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportNamedDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportNamespaceSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportNamespaceSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportNamespaceSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExportSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExportSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitExpressionStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExpressionStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitExpressionStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExpressionStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFile(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFile: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFile")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFlow(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFlow: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFlowPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFlowPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFlowPredicate: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFlowPredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFlowType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFlowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFlowType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFlowType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitForAwaitStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForAwaitStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitForAwaitStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForAwaitStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitForInStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForInStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitForInStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForInStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitForOfStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForOfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitForOfStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForOfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitForStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitForStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitForStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFunction: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFunctionDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFunctionDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFunctionExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFunctionExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFunctionTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFunctionTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitFunctionTypeParam(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionTypeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitFunctionTypeParam: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionTypeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitGeneratorExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitGeneratorExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitGeneratorExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitGeneratorExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitGenericTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitGenericTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitGenericTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitGenericTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitIdentifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitIdentifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitIfStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitIfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitIfStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitIfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitImport(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitImport: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImport")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitImportDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitImportDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitImportDefaultSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitImportDefaultSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportDefaultSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitImportNamespaceSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitImportNamespaceSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportNamespaceSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitImportSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitImportSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitInferredPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInferredPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitInferredPredicate: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInferredPredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitInterfaceDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterfaceDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitInterfaceDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterfaceDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitInterfaceExtends(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterfaceExtends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitInterfaceExtends: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterfaceExtends")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitInterfaceTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterfaceTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitInterfaceTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterfaceTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitInterpreterDirective(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterpreterDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitInterpreterDirective: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterpreterDirective")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitIntersectionTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitIntersectionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitIntersectionTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitIntersectionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXAttribute(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXAttribute: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXClosingElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXClosingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXClosingElement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXClosingElement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXClosingFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXClosingFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXClosingFragment: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXClosingFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXElement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXElement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXEmptyExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXEmptyExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXEmptyExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXEmptyExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXExpressionContainer(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXExpressionContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXExpressionContainer: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXExpressionContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXFragment: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXIdentifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXIdentifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXMemberExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXMemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXMemberExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXMemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXNamespacedName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXNamespacedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXNamespacedName: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXNamespacedName")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXOpeningElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXOpeningElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXOpeningElement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXOpeningElement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXOpeningFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXOpeningFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXOpeningFragment: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXOpeningFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXSpreadAttribute(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXSpreadAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXSpreadAttribute: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXSpreadAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXSpreadChild(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXSpreadChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXSpreadChild: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXSpreadChild")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitJSXText(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitJSXText: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitJSXText")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitLabeledStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLabeledStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitLabeledStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLabeledStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitLine(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitLine: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLine")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitLogicalExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLogicalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitLogicalExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLogicalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitMemberExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitMemberExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitMemberTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMemberTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitMemberTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMemberTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitMetaProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMetaProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitMetaProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMetaProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitMethodDefinition(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMethodDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitMethodDefinition: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMethodDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitMixedTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMixedTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitMixedTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMixedTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitModuleSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitModuleSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitModuleSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitModuleSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNewExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNewExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNewExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNewExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNode(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNode: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNode")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNoop(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNoop: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNoop")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNullLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNullLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNullLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNullLiteralTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNullTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNullTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNullableTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullableTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNullableTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNullableTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNumberLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumberLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNumberLiteralTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumberLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNumberTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumberTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNumberTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumberTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNumericLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumericLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNumericLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumericLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNumericLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumericLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNumericLiteralTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumericLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectMethod: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectPattern: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectTypeCallProperty(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeCallProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectTypeCallProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeCallProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectTypeIndexer(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeIndexer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectTypeIndexer: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeIndexer")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectTypeInternalSlot(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeInternalSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectTypeInternalSlot: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeInternalSlot")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectTypeProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectTypeProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitObjectTypeSpreadProperty(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeSpreadProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitObjectTypeSpreadProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitObjectTypeSpreadProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitOpaqueType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOpaqueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitOpaqueType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOpaqueType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitOptionalCallExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOptionalCallExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitOptionalCallExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOptionalCallExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitOptionalMemberExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOptionalMemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitOptionalMemberExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOptionalMemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitParenthesizedExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitParenthesizedExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitParenthesizedExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitParenthesizedExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitPattern: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitPosition(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitPosition: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitPrintable(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPrintable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitPrintable: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPrintable")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitPrivateName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPrivateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitPrivateName: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPrivateName")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitProgram(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitProgram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitProgram: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitProgram")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitPropertyPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPropertyPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitPropertyPattern: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPropertyPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitQualifiedTypeIdentifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitQualifiedTypeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitQualifiedTypeIdentifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitQualifiedTypeIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitRegExpLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitRegExpLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitRegExpLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitRegExpLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitRestElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitRestElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitRestElement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitRestElement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitRestProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitRestProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitRestProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitRestProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitReturnStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitReturnStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitReturnStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitReturnStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSequenceExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSequenceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSequenceExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSequenceExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSourceLocation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSourceLocation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSourceLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSpecifier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSpreadElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSpreadElement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadElement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSpreadElementPattern(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadElementPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSpreadElementPattern: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadElementPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSpreadProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSpreadProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSpreadPropertyPattern(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadPropertyPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSpreadPropertyPattern: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSpreadPropertyPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitStringLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStringLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitStringLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStringLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitStringLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStringLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitStringLiteralTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStringLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitStringTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStringTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitStringTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStringTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSuper(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSuper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSuper: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSuper")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSwitchCase(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSwitchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSwitchCase: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSwitchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitSwitchStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSwitchStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitSwitchStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSwitchStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSAnyKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSAnyKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSAnyKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSAnyKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSArrayType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSArrayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSArrayType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSArrayType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSAsExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSAsExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSAsExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSAsExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSBigIntKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSBigIntKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSBigIntKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSBigIntKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSBooleanKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSBooleanKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSBooleanKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSBooleanKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSCallSignatureDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSCallSignatureDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSCallSignatureDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSCallSignatureDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSConditionalType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSConditionalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSConditionalType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSConditionalType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSConstructSignatureDeclaration(
      value: js.ThisFunction1[
          /* this */ Context with M, 
          /* path */ NodePath[TSConstructSignatureDeclaration, _], 
          _
        ]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSConstructSignatureDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSConstructSignatureDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSConstructSignatureDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSConstructorType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSConstructorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSConstructorType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSConstructorType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSDeclareFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSDeclareFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSDeclareFunction: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSDeclareFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSDeclareMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSDeclareMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSDeclareMethod: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSDeclareMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSEnumDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSEnumDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSEnumDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSEnumDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSEnumMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSEnumMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSEnumMember: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSEnumMember")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSExportAssignment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSExportAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSExportAssignment: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSExportAssignment")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSExpressionWithTypeArguments(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSExpressionWithTypeArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSExpressionWithTypeArguments: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSExpressionWithTypeArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSExternalModuleReference(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSExternalModuleReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSExternalModuleReference: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSExternalModuleReference")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSFunctionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSFunctionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSFunctionType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSFunctionType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSHasOptionalTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSHasOptionalTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSHasOptionalTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSHasOptionalTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSHasOptionalTypeParameterInstantiation(
      value: js.ThisFunction1[
          /* this */ Context with M, 
          /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
          _
        ]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSHasOptionalTypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSHasOptionalTypeParameterInstantiation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSHasOptionalTypeParameterInstantiation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSHasOptionalTypeParameters(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSHasOptionalTypeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSHasOptionalTypeParameters: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSHasOptionalTypeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSImportEqualsDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSImportEqualsDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSImportEqualsDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSImportEqualsDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSImportType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSImportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSImportType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSImportType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSIndexSignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSIndexSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSIndexSignature: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSIndexSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSIndexedAccessType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSIndexedAccessType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSIndexedAccessType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSIndexedAccessType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSInferType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSInferType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSInferType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSInferType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSInterfaceBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSInterfaceBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSInterfaceBody: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSInterfaceBody")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSInterfaceDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSInterfaceDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSInterfaceDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSInterfaceDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSIntersectionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSIntersectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSIntersectionType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSIntersectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSLiteralType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSLiteralType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSLiteralType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSLiteralType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSMappedType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSMappedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSMappedType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSMappedType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSMethodSignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSMethodSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSMethodSignature: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSMethodSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSModuleBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSModuleBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSModuleBlock: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSModuleBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSModuleDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSModuleDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSModuleDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSModuleDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSNamespaceExportDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNamespaceExportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSNamespaceExportDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNamespaceExportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSNeverKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNeverKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSNeverKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNeverKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSNonNullExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNonNullExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSNonNullExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNonNullExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSNullKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNullKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSNullKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNullKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSNumberKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNumberKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSNumberKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSNumberKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSObjectKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSObjectKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSObjectKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSObjectKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSOptionalType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSOptionalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSOptionalType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSOptionalType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSParameterProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSParameterProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSParameterProperty: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSParameterProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSParenthesizedType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSParenthesizedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSParenthesizedType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSParenthesizedType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSPropertySignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSPropertySignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSPropertySignature: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSPropertySignature")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSQualifiedName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSQualifiedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSQualifiedName: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSQualifiedName")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSRestType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSRestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSRestType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSRestType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSStringKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSStringKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSStringKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSStringKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSSymbolKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSSymbolKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSSymbolKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSSymbolKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSThisType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSThisType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSThisType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSThisType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTupleType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTupleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTupleType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTupleType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeAliasDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeAliasDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeAliasDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeAliasDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeAssertion(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeAssertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeAssertion: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeAssertion")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeOperator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeOperator: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeParameter(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeParameter: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeParameterDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeParameterDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeParameterDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeParameterDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeParameterInstantiation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeParameterInstantiation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeParameterInstantiation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypePredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypePredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypePredicate: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypePredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeQuery(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeQuery: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSTypeReference(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSTypeReference: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSTypeReference")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSUndefinedKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSUndefinedKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSUndefinedKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSUndefinedKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSUnionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSUnionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSUnionType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSUnionType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSUnknownKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSUnknownKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSUnknownKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSUnknownKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTSVoidKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSVoidKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTSVoidKeyword: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTSVoidKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTaggedTemplateExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTaggedTemplateExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTaggedTemplateExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTaggedTemplateExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTemplateElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTemplateElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTemplateElement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTemplateElement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTemplateLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTemplateLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTemplateLiteral: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTemplateLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitThisExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitThisExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitThisExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitThisExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitThisTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitThisTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitThisTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitThisTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitThrowStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitThrowStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitThrowStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitThrowStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTryStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTryStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTryStatement: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTryStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTupleTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTupleTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTupleTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTupleTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTypeAlias(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTypeAlias: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTypeCastExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeCastExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTypeCastExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeCastExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTypeParameter(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTypeParameter: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTypeParameterDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeParameterDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTypeParameterDeclaration: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeParameterDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTypeParameterInstantiation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTypeParameterInstantiation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeParameterInstantiation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTypeofTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
    ): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeofTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTypeofTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeofTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitUnaryExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitUnaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitUnaryExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitUnaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitUnionTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitUnionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitUnionTypeAnnotation: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitUnionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitUpdateExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitUpdateExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitUpdateExpression: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitUpdateExpression")(js.undefined)
        ret
    }
  }
  
}

