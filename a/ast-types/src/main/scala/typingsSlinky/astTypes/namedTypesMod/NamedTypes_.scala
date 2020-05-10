package typingsSlinky.astTypes.namedTypesMod

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
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedTypes_ extends js.Object {
  var AnyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation] = js.native
  var ArrayExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression] = js.native
  var ArrayPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern] = js.native
  var ArrayTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation] = js.native
  var ArrowFunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression] = js.native
  var AssignmentExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression] = js.native
  var AssignmentPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern] = js.native
  var AwaitExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression] = js.native
  var BigIntLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral] = js.native
  var BinaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression] = js.native
  var BindExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression] = js.native
  var Block: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Block] = js.native
  var BlockStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement] = js.native
  var BooleanLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral] = js.native
  var BooleanLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation] = js.native
  var BooleanTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation] = js.native
  var BreakStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement] = js.native
  var CallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression] = js.native
  var CatchClause: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause] = js.native
  var ClassBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody] = js.native
  var ClassDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration] = js.native
  var ClassExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression] = js.native
  var ClassImplements: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements] = js.native
  var ClassMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod] = js.native
  var ClassPrivateMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod] = js.native
  var ClassPrivateProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty] = js.native
  var ClassProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty] = js.native
  var ClassPropertyDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition] = js.native
  var Comment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Comment] = js.native
  var CommentBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock] = js.native
  var CommentLine: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine] = js.native
  var ComprehensionBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock] = js.native
  var ComprehensionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression] = js.native
  var ConditionalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression] = js.native
  var ContinueStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement] = js.native
  var DebuggerStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement] = js.native
  var Declaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Declaration] = js.native
  var DeclareClass: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass] = js.native
  var DeclareExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration] = js.native
  var DeclareExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration] = js.native
  var DeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction] = js.native
  var DeclareInterface: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface] = js.native
  var DeclareModule: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule] = js.native
  var DeclareModuleExports: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports] = js.native
  var DeclareOpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType] = js.native
  var DeclareTypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias] = js.native
  var DeclareVariable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable] = js.native
  var DeclaredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate] = js.native
  var Decorator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator] = js.native
  var Directive: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive] = js.native
  var DirectiveLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral] = js.native
  var DoExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression] = js.native
  var DoWhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement] = js.native
  var EmptyStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement] = js.native
  var EmptyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation] = js.native
  var ExistentialTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam] = js.native
  var ExistsTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation] = js.native
  var ExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration] = js.native
  var ExportBatchSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier] = js.native
  var ExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration] = js.native
  var ExportDefaultDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration] = js.native
  var ExportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier] = js.native
  var ExportNamedDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration] = js.native
  var ExportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier] = js.native
  var ExportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier] = js.native
  var Expression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Expression] = js.native
  var ExpressionStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement] = js.native
  var File: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.File] = js.native
  var Flow: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Flow] = js.native
  var FlowPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowPredicate] = js.native
  var FlowType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowType] = js.native
  var ForAwaitStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement] = js.native
  var ForInStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement] = js.native
  var ForOfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement] = js.native
  var ForStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement] = js.native
  var Function: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Function] = js.native
  var FunctionDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration] = js.native
  var FunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression] = js.native
  var FunctionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation] = js.native
  var FunctionTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam] = js.native
  var GeneratorExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression] = js.native
  var GenericTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation] = js.native
  var Identifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier] = js.native
  var IfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement] = js.native
  var Import: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Import] = js.native
  var ImportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration] = js.native
  var ImportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier] = js.native
  var ImportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier] = js.native
  var ImportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier] = js.native
  var InferredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate] = js.native
  var InterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration] = js.native
  var InterfaceExtends: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends] = js.native
  var InterfaceTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation] = js.native
  var InterpreterDirective: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective] = js.native
  var IntersectionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation] = js.native
  var JSXAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute] = js.native
  var JSXClosingElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement] = js.native
  var JSXClosingFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment] = js.native
  var JSXElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement] = js.native
  var JSXEmptyExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression] = js.native
  var JSXExpressionContainer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer] = js.native
  var JSXFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment] = js.native
  var JSXIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier] = js.native
  var JSXMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression] = js.native
  var JSXNamespacedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName] = js.native
  var JSXOpeningElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement] = js.native
  var JSXOpeningFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment] = js.native
  var JSXSpreadAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute] = js.native
  var JSXSpreadChild: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild] = js.native
  var JSXText: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText] = js.native
  var LabeledStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement] = js.native
  var Line: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Line] = js.native
  var Literal: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal] = js.native
  var LogicalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression] = js.native
  var MemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression] = js.native
  var MemberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation] = js.native
  var MetaProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty] = js.native
  var MethodDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition] = js.native
  var MixedTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation] = js.native
  var ModuleSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ModuleSpecifier] = js.native
  var NewExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression] = js.native
  var Node: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Node] = js.native
  var Noop: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop] = js.native
  var NullLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral] = js.native
  var NullLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation] = js.native
  var NullTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation] = js.native
  var NullableTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation] = js.native
  var NumberLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation] = js.native
  var NumberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation] = js.native
  var NumericLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral] = js.native
  var NumericLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation] = js.native
  var ObjectExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression] = js.native
  var ObjectMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod] = js.native
  var ObjectPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern] = js.native
  var ObjectProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty] = js.native
  var ObjectTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation] = js.native
  var ObjectTypeCallProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty] = js.native
  var ObjectTypeIndexer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer] = js.native
  var ObjectTypeInternalSlot: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot] = js.native
  var ObjectTypeProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty] = js.native
  var ObjectTypeSpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty] = js.native
  var OpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType] = js.native
  var OptionalCallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression] = js.native
  var OptionalMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression] = js.native
  var ParenthesizedExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression] = js.native
  var Pattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Pattern] = js.native
  var Position: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Position] = js.native
  var Printable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Printable] = js.native
  var PrivateName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName] = js.native
  var Program: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Program] = js.native
  var Property: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Property] = js.native
  var PropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern] = js.native
  var QualifiedTypeIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier] = js.native
  var RegExpLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral] = js.native
  var RestElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement] = js.native
  var RestProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty] = js.native
  var ReturnStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement] = js.native
  var SequenceExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression] = js.native
  var SourceLocation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SourceLocation] = js.native
  var Specifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Specifier] = js.native
  var SpreadElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement] = js.native
  var SpreadElementPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern] = js.native
  var SpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty] = js.native
  var SpreadPropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern] = js.native
  var Statement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Statement] = js.native
  var StringLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral] = js.native
  var StringLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation] = js.native
  var StringTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation] = js.native
  var Super: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Super] = js.native
  var SwitchCase: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase] = js.native
  var SwitchStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement] = js.native
  var TSAnyKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword] = js.native
  var TSArrayType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType] = js.native
  var TSAsExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression] = js.native
  var TSBigIntKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword] = js.native
  var TSBooleanKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword] = js.native
  var TSCallSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration] = js.native
  var TSConditionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType] = js.native
  var TSConstructSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration] = js.native
  var TSConstructorType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType] = js.native
  var TSDeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction] = js.native
  var TSDeclareMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod] = js.native
  var TSEnumDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration] = js.native
  var TSEnumMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember] = js.native
  var TSExportAssignment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment] = js.native
  var TSExpressionWithTypeArguments: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments] = js.native
  var TSExternalModuleReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference] = js.native
  var TSFunctionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType] = js.native
  var TSHasOptionalTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation] = js.native
  var TSHasOptionalTypeParameterInstantiation: Type[
    typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
  ] = js.native
  var TSHasOptionalTypeParameters: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters] = js.native
  var TSImportEqualsDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration] = js.native
  var TSImportType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType] = js.native
  var TSIndexSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature] = js.native
  var TSIndexedAccessType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType] = js.native
  var TSInferType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType] = js.native
  var TSInterfaceBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody] = js.native
  var TSInterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration] = js.native
  var TSIntersectionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType] = js.native
  var TSLiteralType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType] = js.native
  var TSMappedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType] = js.native
  var TSMethodSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature] = js.native
  var TSModuleBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock] = js.native
  var TSModuleDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration] = js.native
  var TSNamespaceExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration] = js.native
  var TSNeverKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword] = js.native
  var TSNonNullExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression] = js.native
  var TSNullKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword] = js.native
  var TSNumberKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword] = js.native
  var TSObjectKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword] = js.native
  var TSOptionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType] = js.native
  var TSParameterProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty] = js.native
  var TSParenthesizedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType] = js.native
  var TSPropertySignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature] = js.native
  var TSQualifiedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName] = js.native
  var TSRestType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType] = js.native
  var TSStringKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword] = js.native
  var TSSymbolKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword] = js.native
  var TSThisType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType] = js.native
  var TSTupleType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType] = js.native
  var TSType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSType] = js.native
  var TSTypeAliasDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration] = js.native
  var TSTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation] = js.native
  var TSTypeAssertion: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion] = js.native
  var TSTypeLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral] = js.native
  var TSTypeOperator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator] = js.native
  var TSTypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter] = js.native
  var TSTypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration] = js.native
  var TSTypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation] = js.native
  var TSTypePredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate] = js.native
  var TSTypeQuery: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery] = js.native
  var TSTypeReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference] = js.native
  var TSUndefinedKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword] = js.native
  var TSUnionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType] = js.native
  var TSUnknownKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword] = js.native
  var TSVoidKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword] = js.native
  var TaggedTemplateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression] = js.native
  var TemplateElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement] = js.native
  var TemplateLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral] = js.native
  var ThisExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression] = js.native
  var ThisTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation] = js.native
  var ThrowStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement] = js.native
  var TryStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement] = js.native
  var TupleTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation] = js.native
  var TypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias] = js.native
  var TypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation] = js.native
  var TypeCastExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression] = js.native
  var TypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter] = js.native
  var TypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration] = js.native
  var TypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation] = js.native
  var TypeofTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation] = js.native
  var UnaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression] = js.native
  var UnionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation] = js.native
  var UpdateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression] = js.native
  var VariableDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration] = js.native
  var VariableDeclarator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator] = js.native
  var Variance: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance] = js.native
  var VoidTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation] = js.native
  var WhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement] = js.native
  var WithStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement] = js.native
  var YieldExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression] = js.native
}

object NamedTypes_ {
  @scala.inline
  implicit class NamedTypes_Ops[Self <: NamedTypes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyTypeAnnotation(value: Type[AnyTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayExpression(value: Type[ArrayExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayPattern(value: Type[ArrayPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayTypeAnnotation(value: Type[ArrayTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowFunctionExpression(value: Type[ArrowFunctionExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignmentExpression(value: Type[AssignmentExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignmentPattern(value: Type[AssignmentPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwaitExpression(value: Type[AwaitExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBigIntLiteral(value: Type[BigIntLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BigIntLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryExpression(value: Type[BinaryExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindExpression(value: Type[BindExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlock(value: Type[Block]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockStatement(value: Type[BlockStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBooleanLiteral(value: Type[BooleanLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBooleanLiteralTypeAnnotation(value: Type[BooleanLiteralTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBooleanTypeAnnotation(value: Type[BooleanTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakStatement(value: Type[BreakStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallExpression(value: Type[CallExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatchClause(value: Type[CatchClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassBody(value: Type[ClassBody]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassDeclaration(value: Type[ClassDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassExpression(value: Type[ClassExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassImplements(value: Type[ClassImplements]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassImplements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassMethod(value: Type[ClassMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassPrivateMethod(value: Type[ClassPrivateMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassPrivateMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassPrivateProperty(value: Type[ClassPrivateProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassPrivateProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassProperty(value: Type[ClassProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassPropertyDefinition(value: Type[ClassPropertyDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassPropertyDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: Type[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentBlock(value: Type[CommentBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentLine(value: Type[CommentLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComprehensionBlock(value: Type[ComprehensionBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComprehensionBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComprehensionExpression(value: Type[ComprehensionExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComprehensionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionalExpression(value: Type[ConditionalExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueStatement(value: Type[ContinueStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebuggerStatement(value: Type[DebuggerStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaration(value: Type[Declaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareClass(value: Type[DeclareClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareExportAllDeclaration(value: Type[DeclareExportAllDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareExportAllDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareExportDeclaration(value: Type[DeclareExportDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareExportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareFunction(value: Type[DeclareFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareInterface(value: Type[DeclareInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareModule(value: Type[DeclareModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareModuleExports(value: Type[DeclareModuleExports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareModuleExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareOpaqueType(value: Type[DeclareOpaqueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareOpaqueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareTypeAlias(value: Type[DeclareTypeAlias]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareVariable(value: Type[DeclareVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaredPredicate(value: Type[DeclaredPredicate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaredPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorator(value: Type[Decorator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirective(value: Type[Directive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectiveLiteral(value: Type[DirectiveLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectiveLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoExpression(value: Type[DoExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoWhileStatement(value: Type[DoWhileStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyStatement(value: Type[EmptyStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyTypeAnnotation(value: Type[EmptyTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistentialTypeParam(value: Type[ExistentialTypeParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistentialTypeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistsTypeAnnotation(value: Type[ExistsTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistsTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportAllDeclaration(value: Type[ExportAllDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportBatchSpecifier(value: Type[ExportBatchSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportBatchSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportDeclaration(value: Type[ExportDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportDefaultDeclaration(value: Type[ExportDefaultDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportDefaultSpecifier(value: Type[ExportDefaultSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportNamedDeclaration(value: Type[ExportNamedDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportNamespaceSpecifier(value: Type[ExportNamespaceSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportSpecifier(value: Type[ExportSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: Type[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionStatement(value: Type[ExpressionStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: Type[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlow(value: Type[Flow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowPredicate(value: Type[FlowPredicate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowType(value: Type[FlowType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForAwaitStatement(value: Type[ForAwaitStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForAwaitStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForInStatement(value: Type[ForInStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForOfStatement(value: Type[ForOfStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForStatement(value: Type[ForStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(value: Type[Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionDeclaration(value: Type[FunctionDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionExpression(value: Type[FunctionExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionTypeAnnotation(value: Type[FunctionTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionTypeParam(value: Type[FunctionTypeParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneratorExpression(value: Type[GeneratorExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneratorExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenericTypeAnnotation(value: Type[GenericTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Type[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfStatement(value: Type[IfStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImport(value: Type[Import]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Import")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportDeclaration(value: Type[ImportDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportDefaultSpecifier(value: Type[ImportDefaultSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportNamespaceSpecifier(value: Type[ImportNamespaceSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportSpecifier(value: Type[ImportSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInferredPredicate(value: Type[InferredPredicate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InferredPredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceDeclaration(value: Type[InterfaceDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceExtends(value: Type[InterfaceExtends]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceExtends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceTypeAnnotation(value: Type[InterfaceTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpreterDirective(value: Type[InterpreterDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterpreterDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionTypeAnnotation(value: Type[IntersectionTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntersectionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXAttribute(value: Type[JSXAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXClosingElement(value: Type[JSXClosingElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXClosingFragment(value: Type[JSXClosingFragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXElement(value: Type[JSXElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXEmptyExpression(value: Type[JSXEmptyExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXEmptyExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXExpressionContainer(value: Type[JSXExpressionContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXExpressionContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXFragment(value: Type[JSXFragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXIdentifier(value: Type[JSXIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXMemberExpression(value: Type[JSXMemberExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXMemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXNamespacedName(value: Type[JSXNamespacedName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXNamespacedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXOpeningElement(value: Type[JSXOpeningElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXOpeningFragment(value: Type[JSXOpeningFragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXSpreadAttribute(value: Type[JSXSpreadAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXSpreadChild(value: Type[JSXSpreadChild]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSXText(value: Type[JSXText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabeledStatement(value: Type[LabeledStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Type[Line]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiteral(value: Type[Literal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalExpression(value: Type[LogicalExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberExpression(value: Type[MemberExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberTypeAnnotation(value: Type[MemberTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaProperty(value: Type[MetaProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodDefinition(value: Type[MethodDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixedTypeAnnotation(value: Type[MixedTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MixedTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleSpecifier(value: Type[ModuleSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewExpression(value: Type[NewExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Type[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoop(value: Type[Noop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Noop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullLiteral(value: Type[NullLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullLiteralTypeAnnotation(value: Type[NullLiteralTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullTypeAnnotation(value: Type[NullTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullableTypeAnnotation(value: Type[NullableTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullableTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberLiteralTypeAnnotation(value: Type[NumberLiteralTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberTypeAnnotation(value: Type[NumberTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumericLiteral(value: Type[NumericLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumericLiteralTypeAnnotation(value: Type[NumericLiteralTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectExpression(value: Type[ObjectExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectMethod(value: Type[ObjectMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectPattern(value: Type[ObjectPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectProperty(value: Type[ObjectProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeAnnotation(value: Type[ObjectTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeCallProperty(value: Type[ObjectTypeCallProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCallProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeIndexer(value: Type[ObjectTypeIndexer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeIndexer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeInternalSlot(value: Type[ObjectTypeInternalSlot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeInternalSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeProperty(value: Type[ObjectTypeProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeSpreadProperty(value: Type[ObjectTypeSpreadProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeSpreadProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpaqueType(value: Type[OpaqueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpaqueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalCallExpression(value: Type[OptionalCallExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionalCallExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalMemberExpression(value: Type[OptionalMemberExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionalMemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParenthesizedExpression(value: Type[ParenthesizedExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParenthesizedExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: Type[Pattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Type[Position]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintable(value: Type[Printable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Printable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateName(value: Type[PrivateName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: Type[Program]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: Type[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyPattern(value: Type[PropertyPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifiedTypeIdentifier(value: Type[QualifiedTypeIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualifiedTypeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExpLiteral(value: Type[RegExpLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExpLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestElement(value: Type[RestElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestProperty(value: Type[RestProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnStatement(value: Type[ReturnStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceExpression(value: Type[SequenceExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLocation(value: Type[SourceLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecifier(value: Type[Specifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Specifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpreadElement(value: Type[SpreadElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpreadElementPattern(value: Type[SpreadElementPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElementPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpreadProperty(value: Type[SpreadProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpreadPropertyPattern(value: Type[SpreadPropertyPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadPropertyPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement(value: Type[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringLiteral(value: Type[StringLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringLiteralTypeAnnotation(value: Type[StringLiteralTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringTypeAnnotation(value: Type[StringTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuper(value: Type[Super]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Super")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchCase(value: Type[SwitchCase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchStatement(value: Type[SwitchStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSAnyKeyword(value: Type[TSAnyKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSAnyKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSArrayType(value: Type[TSArrayType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSArrayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSAsExpression(value: Type[TSAsExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSAsExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSBigIntKeyword(value: Type[TSBigIntKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSBigIntKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSBooleanKeyword(value: Type[TSBooleanKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSBooleanKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSCallSignatureDeclaration(value: Type[TSCallSignatureDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSCallSignatureDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSConditionalType(value: Type[TSConditionalType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSConditionalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSConstructSignatureDeclaration(value: Type[TSConstructSignatureDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSConstructSignatureDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSConstructorType(value: Type[TSConstructorType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSConstructorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSDeclareFunction(value: Type[TSDeclareFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSDeclareFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSDeclareMethod(value: Type[TSDeclareMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSDeclareMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSEnumDeclaration(value: Type[TSEnumDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSEnumDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSEnumMember(value: Type[TSEnumMember]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSEnumMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSExportAssignment(value: Type[TSExportAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSExportAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSExpressionWithTypeArguments(value: Type[TSExpressionWithTypeArguments]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSExpressionWithTypeArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSExternalModuleReference(value: Type[TSExternalModuleReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSExternalModuleReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSFunctionType(value: Type[TSFunctionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSFunctionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSHasOptionalTypeAnnotation(value: Type[TSHasOptionalTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSHasOptionalTypeParameterInstantiation(value: Type[TSHasOptionalTypeParameterInstantiation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSHasOptionalTypeParameters(value: Type[TSHasOptionalTypeParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSImportEqualsDeclaration(value: Type[TSImportEqualsDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSImportEqualsDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSImportType(value: Type[TSImportType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSImportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSIndexSignature(value: Type[TSIndexSignature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSIndexSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSIndexedAccessType(value: Type[TSIndexedAccessType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSIndexedAccessType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSInferType(value: Type[TSInferType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSInferType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSInterfaceBody(value: Type[TSInterfaceBody]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSInterfaceBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSInterfaceDeclaration(value: Type[TSInterfaceDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSInterfaceDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSIntersectionType(value: Type[TSIntersectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSIntersectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSLiteralType(value: Type[TSLiteralType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSLiteralType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSMappedType(value: Type[TSMappedType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSMappedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSMethodSignature(value: Type[TSMethodSignature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSMethodSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSModuleBlock(value: Type[TSModuleBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSModuleBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSModuleDeclaration(value: Type[TSModuleDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSModuleDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSNamespaceExportDeclaration(value: Type[TSNamespaceExportDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSNamespaceExportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSNeverKeyword(value: Type[TSNeverKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSNeverKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSNonNullExpression(value: Type[TSNonNullExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSNonNullExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSNullKeyword(value: Type[TSNullKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSNullKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSNumberKeyword(value: Type[TSNumberKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSNumberKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSObjectKeyword(value: Type[TSObjectKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSObjectKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSOptionalType(value: Type[TSOptionalType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSOptionalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSParameterProperty(value: Type[TSParameterProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSParameterProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSParenthesizedType(value: Type[TSParenthesizedType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSParenthesizedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSPropertySignature(value: Type[TSPropertySignature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSPropertySignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSQualifiedName(value: Type[TSQualifiedName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSQualifiedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSRestType(value: Type[TSRestType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSRestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSStringKeyword(value: Type[TSStringKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSStringKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSSymbolKeyword(value: Type[TSSymbolKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSSymbolKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSThisType(value: Type[TSThisType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSThisType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTupleType(value: Type[TSTupleType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTupleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSType(value: Type[TSType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeAliasDeclaration(value: Type[TSTypeAliasDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAliasDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeAnnotation(value: Type[TSTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeAssertion(value: Type[TSTypeAssertion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAssertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeLiteral(value: Type[TSTypeLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeOperator(value: Type[TSTypeOperator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeParameter(value: Type[TSTypeParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeParameterDeclaration(value: Type[TSTypeParameterDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameterDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeParameterInstantiation(value: Type[TSTypeParameterInstantiation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypePredicate(value: Type[TSTypePredicate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypePredicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeQuery(value: Type[TSTypeQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSTypeReference(value: Type[TSTypeReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSTypeReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSUndefinedKeyword(value: Type[TSUndefinedKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSUndefinedKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSUnionType(value: Type[TSUnionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSUnionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSUnknownKeyword(value: Type[TSUnknownKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSUnknownKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSVoidKeyword(value: Type[TSVoidKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSVoidKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaggedTemplateExpression(value: Type[TaggedTemplateExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateElement(value: Type[TemplateElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateLiteral(value: Type[TemplateLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisExpression(value: Type[ThisExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisTypeAnnotation(value: Type[ThisTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowStatement(value: Type[ThrowStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryStatement(value: Type[TryStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTupleTypeAnnotation(value: Type[TupleTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TupleTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAlias(value: Type[TypeAlias]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: Type[TypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeCastExpression(value: Type[TypeCastExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeCastExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameter(value: Type[TypeParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameterDeclaration(value: Type[TypeParameterDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameterInstantiation(value: Type[TypeParameterInstantiation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeofTypeAnnotation(value: Type[TypeofTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeofTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnaryExpression(value: Type[UnaryExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnionTypeAnnotation(value: Type[UnionTypeAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateExpression(value: Type[UpdateExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

