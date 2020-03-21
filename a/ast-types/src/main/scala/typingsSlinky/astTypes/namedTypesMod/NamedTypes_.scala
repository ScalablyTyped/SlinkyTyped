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

trait NamedTypes_ extends js.Object {
  var AnyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  var ArrayExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  var ArrayPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  var ArrayTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  var ArrowFunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  var AssignmentExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  var AssignmentPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  var AwaitExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  var BigIntLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  var BinaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  var BindExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression]
  var Block: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Block]
  var BlockStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement]
  var BooleanLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  var BooleanLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  var BooleanTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  var BreakStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement]
  var CallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression]
  var CatchClause: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause]
  var ClassBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody]
  var ClassDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration]
  var ClassExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression]
  var ClassImplements: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements]
  var ClassMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod]
  var ClassPrivateMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  var ClassPrivateProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  var ClassProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty]
  var ClassPropertyDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition]
  var Comment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Comment]
  var CommentBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock]
  var CommentLine: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine]
  var ComprehensionBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock]
  var ComprehensionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  var ConditionalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  var ContinueStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement]
  var DebuggerStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement]
  var Declaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Declaration]
  var DeclareClass: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass]
  var DeclareExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration]
  var DeclareExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration]
  var DeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction]
  var DeclareInterface: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  var DeclareModule: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule]
  var DeclareModuleExports: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports]
  var DeclareOpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  var DeclareTypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias]
  var DeclareVariable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable]
  var DeclaredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  var Decorator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator]
  var Directive: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive]
  var DirectiveLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  var DoExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression]
  var DoWhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement]
  var EmptyStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement]
  var EmptyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  var ExistentialTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  var ExistsTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  var ExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration]
  var ExportBatchSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier]
  var ExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration]
  var ExportDefaultDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration]
  var ExportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier]
  var ExportNamedDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration]
  var ExportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier]
  var ExportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  var Expression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Expression]
  var ExpressionStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement]
  var File: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.File]
  var Flow: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Flow]
  var FlowPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowPredicate]
  var FlowType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowType]
  var ForAwaitStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement]
  var ForInStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement]
  var ForOfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement]
  var ForStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement]
  var Function: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Function]
  var FunctionDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  var FunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  var FunctionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  var FunctionTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam]
  var GeneratorExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  var GenericTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  var Identifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier]
  var IfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement]
  var Import: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Import]
  var ImportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration]
  var ImportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  var ImportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  var ImportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  var InferredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  var InterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  var InterfaceExtends: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends]
  var InterfaceTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  var InterpreterDirective: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective]
  var IntersectionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  var JSXAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute]
  var JSXClosingElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement]
  var JSXClosingFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment]
  var JSXElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement]
  var JSXEmptyExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression]
  var JSXExpressionContainer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  var JSXFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment]
  var JSXIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  var JSXMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  var JSXNamespacedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName]
  var JSXOpeningElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement]
  var JSXOpeningFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment]
  var JSXSpreadAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute]
  var JSXSpreadChild: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild]
  var JSXText: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText]
  var LabeledStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement]
  var Line: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Line]
  var Literal: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal]
  var LogicalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  var MemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression]
  var MemberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  var MetaProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty]
  var MethodDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition]
  var MixedTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  var ModuleSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ModuleSpecifier]
  var NewExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression]
  var Node: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Node]
  var Noop: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop]
  var NullLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral]
  var NullLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  var NullTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  var NullableTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  var NumberLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  var NumberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  var NumericLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  var NumericLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  var ObjectExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  var ObjectMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod]
  var ObjectPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern]
  var ObjectProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty]
  var ObjectTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  var ObjectTypeCallProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty]
  var ObjectTypeIndexer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer]
  var ObjectTypeInternalSlot: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot]
  var ObjectTypeProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty]
  var ObjectTypeSpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty]
  var OpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType]
  var OptionalCallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  var OptionalMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  var ParenthesizedExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  var Pattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Pattern]
  var Position: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Position]
  var Printable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Printable]
  var PrivateName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName]
  var Program: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Program]
  var Property: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Property]
  var PropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern]
  var QualifiedTypeIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier]
  var RegExpLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  var RestElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement]
  var RestProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty]
  var ReturnStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement]
  var SequenceExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  var SourceLocation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SourceLocation]
  var Specifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Specifier]
  var SpreadElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement]
  var SpreadElementPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern]
  var SpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty]
  var SpreadPropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern]
  var Statement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Statement]
  var StringLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral]
  var StringLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  var StringTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  var Super: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Super]
  var SwitchCase: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase]
  var SwitchStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement]
  var TSAnyKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword]
  var TSArrayType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType]
  var TSAsExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  var TSBigIntKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword]
  var TSBooleanKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword]
  var TSCallSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  var TSConditionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType]
  var TSConstructSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration]
  var TSConstructorType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  var TSDeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction]
  var TSDeclareMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod]
  var TSEnumDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration]
  var TSEnumMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember]
  var TSExportAssignment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment]
  var TSExpressionWithTypeArguments: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
  var TSExternalModuleReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference]
  var TSFunctionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  var TSHasOptionalTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation]
  var TSHasOptionalTypeParameterInstantiation: Type[
    typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
  ]
  var TSHasOptionalTypeParameters: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters]
  var TSImportEqualsDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration]
  var TSImportType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType]
  var TSIndexSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature]
  var TSIndexedAccessType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType]
  var TSInferType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType]
  var TSInterfaceBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody]
  var TSInterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration]
  var TSIntersectionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType]
  var TSLiteralType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType]
  var TSMappedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType]
  var TSMethodSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  var TSModuleBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock]
  var TSModuleDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration]
  var TSNamespaceExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration]
  var TSNeverKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword]
  var TSNonNullExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  var TSNullKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword]
  var TSNumberKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword]
  var TSObjectKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword]
  var TSOptionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType]
  var TSParameterProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty]
  var TSParenthesizedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType]
  var TSPropertySignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature]
  var TSQualifiedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName]
  var TSRestType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType]
  var TSStringKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword]
  var TSSymbolKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword]
  var TSThisType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType]
  var TSTupleType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType]
  var TSType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSType]
  var TSTypeAliasDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  var TSTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation]
  var TSTypeAssertion: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  var TSTypeLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral]
  var TSTypeOperator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator]
  var TSTypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  var TSTypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration]
  var TSTypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation]
  var TSTypePredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  var TSTypeQuery: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery]
  var TSTypeReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  var TSUndefinedKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword]
  var TSUnionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType]
  var TSUnknownKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword]
  var TSVoidKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword]
  var TaggedTemplateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  var TemplateElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement]
  var TemplateLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  var ThisExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression]
  var ThisTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  var ThrowStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement]
  var TryStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement]
  var TupleTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  var TypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias]
  var TypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation]
  var TypeCastExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  var TypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter]
  var TypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration]
  var TypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation]
  var TypeofTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  var UnaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  var UnionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  var UpdateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  var VariableDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration]
  var VariableDeclarator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator]
  var Variance: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance]
  var VoidTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  var WhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement]
  var WithStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement]
  var YieldExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression]
}

object NamedTypes_ {
  @scala.inline
  def apply(
    AnyTypeAnnotation: Type[AnyTypeAnnotation],
    ArrayExpression: Type[ArrayExpression],
    ArrayPattern: Type[ArrayPattern],
    ArrayTypeAnnotation: Type[ArrayTypeAnnotation],
    ArrowFunctionExpression: Type[ArrowFunctionExpression],
    AssignmentExpression: Type[AssignmentExpression],
    AssignmentPattern: Type[AssignmentPattern],
    AwaitExpression: Type[AwaitExpression],
    BigIntLiteral: Type[BigIntLiteral],
    BinaryExpression: Type[BinaryExpression],
    BindExpression: Type[BindExpression],
    Block: Type[Block],
    BlockStatement: Type[BlockStatement],
    BooleanLiteral: Type[BooleanLiteral],
    BooleanLiteralTypeAnnotation: Type[BooleanLiteralTypeAnnotation],
    BooleanTypeAnnotation: Type[BooleanTypeAnnotation],
    BreakStatement: Type[BreakStatement],
    CallExpression: Type[CallExpression],
    CatchClause: Type[CatchClause],
    ClassBody: Type[ClassBody],
    ClassDeclaration: Type[ClassDeclaration],
    ClassExpression: Type[ClassExpression],
    ClassImplements: Type[ClassImplements],
    ClassMethod: Type[ClassMethod],
    ClassPrivateMethod: Type[ClassPrivateMethod],
    ClassPrivateProperty: Type[ClassPrivateProperty],
    ClassProperty: Type[ClassProperty],
    ClassPropertyDefinition: Type[ClassPropertyDefinition],
    Comment: Type[Comment],
    CommentBlock: Type[CommentBlock],
    CommentLine: Type[CommentLine],
    ComprehensionBlock: Type[ComprehensionBlock],
    ComprehensionExpression: Type[ComprehensionExpression],
    ConditionalExpression: Type[ConditionalExpression],
    ContinueStatement: Type[ContinueStatement],
    DebuggerStatement: Type[DebuggerStatement],
    Declaration: Type[Declaration],
    DeclareClass: Type[DeclareClass],
    DeclareExportAllDeclaration: Type[DeclareExportAllDeclaration],
    DeclareExportDeclaration: Type[DeclareExportDeclaration],
    DeclareFunction: Type[DeclareFunction],
    DeclareInterface: Type[DeclareInterface],
    DeclareModule: Type[DeclareModule],
    DeclareModuleExports: Type[DeclareModuleExports],
    DeclareOpaqueType: Type[DeclareOpaqueType],
    DeclareTypeAlias: Type[DeclareTypeAlias],
    DeclareVariable: Type[DeclareVariable],
    DeclaredPredicate: Type[DeclaredPredicate],
    Decorator: Type[Decorator],
    Directive: Type[Directive],
    DirectiveLiteral: Type[DirectiveLiteral],
    DoExpression: Type[DoExpression],
    DoWhileStatement: Type[DoWhileStatement],
    EmptyStatement: Type[EmptyStatement],
    EmptyTypeAnnotation: Type[EmptyTypeAnnotation],
    ExistentialTypeParam: Type[ExistentialTypeParam],
    ExistsTypeAnnotation: Type[ExistsTypeAnnotation],
    ExportAllDeclaration: Type[ExportAllDeclaration],
    ExportBatchSpecifier: Type[ExportBatchSpecifier],
    ExportDeclaration: Type[ExportDeclaration],
    ExportDefaultDeclaration: Type[ExportDefaultDeclaration],
    ExportDefaultSpecifier: Type[ExportDefaultSpecifier],
    ExportNamedDeclaration: Type[ExportNamedDeclaration],
    ExportNamespaceSpecifier: Type[ExportNamespaceSpecifier],
    ExportSpecifier: Type[ExportSpecifier],
    Expression: Type[Expression],
    ExpressionStatement: Type[ExpressionStatement],
    File: Type[File],
    Flow: Type[Flow],
    FlowPredicate: Type[FlowPredicate],
    FlowType: Type[FlowType],
    ForAwaitStatement: Type[ForAwaitStatement],
    ForInStatement: Type[ForInStatement],
    ForOfStatement: Type[ForOfStatement],
    ForStatement: Type[ForStatement],
    Function: Type[Function],
    FunctionDeclaration: Type[FunctionDeclaration],
    FunctionExpression: Type[FunctionExpression],
    FunctionTypeAnnotation: Type[FunctionTypeAnnotation],
    FunctionTypeParam: Type[FunctionTypeParam],
    GeneratorExpression: Type[GeneratorExpression],
    GenericTypeAnnotation: Type[GenericTypeAnnotation],
    Identifier: Type[Identifier],
    IfStatement: Type[IfStatement],
    Import: Type[Import],
    ImportDeclaration: Type[ImportDeclaration],
    ImportDefaultSpecifier: Type[ImportDefaultSpecifier],
    ImportNamespaceSpecifier: Type[ImportNamespaceSpecifier],
    ImportSpecifier: Type[ImportSpecifier],
    InferredPredicate: Type[InferredPredicate],
    InterfaceDeclaration: Type[InterfaceDeclaration],
    InterfaceExtends: Type[InterfaceExtends],
    InterfaceTypeAnnotation: Type[InterfaceTypeAnnotation],
    InterpreterDirective: Type[InterpreterDirective],
    IntersectionTypeAnnotation: Type[IntersectionTypeAnnotation],
    JSXAttribute: Type[JSXAttribute],
    JSXClosingElement: Type[JSXClosingElement],
    JSXClosingFragment: Type[JSXClosingFragment],
    JSXElement: Type[JSXElement],
    JSXEmptyExpression: Type[JSXEmptyExpression],
    JSXExpressionContainer: Type[JSXExpressionContainer],
    JSXFragment: Type[JSXFragment],
    JSXIdentifier: Type[JSXIdentifier],
    JSXMemberExpression: Type[JSXMemberExpression],
    JSXNamespacedName: Type[JSXNamespacedName],
    JSXOpeningElement: Type[JSXOpeningElement],
    JSXOpeningFragment: Type[JSXOpeningFragment],
    JSXSpreadAttribute: Type[JSXSpreadAttribute],
    JSXSpreadChild: Type[JSXSpreadChild],
    JSXText: Type[JSXText],
    LabeledStatement: Type[LabeledStatement],
    Line: Type[Line],
    Literal: Type[Literal],
    LogicalExpression: Type[LogicalExpression],
    MemberExpression: Type[MemberExpression],
    MemberTypeAnnotation: Type[MemberTypeAnnotation],
    MetaProperty: Type[MetaProperty],
    MethodDefinition: Type[MethodDefinition],
    MixedTypeAnnotation: Type[MixedTypeAnnotation],
    ModuleSpecifier: Type[ModuleSpecifier],
    NewExpression: Type[NewExpression],
    Node: Type[Node],
    Noop: Type[Noop],
    NullLiteral: Type[NullLiteral],
    NullLiteralTypeAnnotation: Type[NullLiteralTypeAnnotation],
    NullTypeAnnotation: Type[NullTypeAnnotation],
    NullableTypeAnnotation: Type[NullableTypeAnnotation],
    NumberLiteralTypeAnnotation: Type[NumberLiteralTypeAnnotation],
    NumberTypeAnnotation: Type[NumberTypeAnnotation],
    NumericLiteral: Type[NumericLiteral],
    NumericLiteralTypeAnnotation: Type[NumericLiteralTypeAnnotation],
    ObjectExpression: Type[ObjectExpression],
    ObjectMethod: Type[ObjectMethod],
    ObjectPattern: Type[ObjectPattern],
    ObjectProperty: Type[ObjectProperty],
    ObjectTypeAnnotation: Type[ObjectTypeAnnotation],
    ObjectTypeCallProperty: Type[ObjectTypeCallProperty],
    ObjectTypeIndexer: Type[ObjectTypeIndexer],
    ObjectTypeInternalSlot: Type[ObjectTypeInternalSlot],
    ObjectTypeProperty: Type[ObjectTypeProperty],
    ObjectTypeSpreadProperty: Type[ObjectTypeSpreadProperty],
    OpaqueType: Type[OpaqueType],
    OptionalCallExpression: Type[OptionalCallExpression],
    OptionalMemberExpression: Type[OptionalMemberExpression],
    ParenthesizedExpression: Type[ParenthesizedExpression],
    Pattern: Type[Pattern],
    Position: Type[Position],
    Printable: Type[Printable],
    PrivateName: Type[PrivateName],
    Program: Type[Program],
    Property: Type[Property],
    PropertyPattern: Type[PropertyPattern],
    QualifiedTypeIdentifier: Type[QualifiedTypeIdentifier],
    RegExpLiteral: Type[RegExpLiteral],
    RestElement: Type[RestElement],
    RestProperty: Type[RestProperty],
    ReturnStatement: Type[ReturnStatement],
    SequenceExpression: Type[SequenceExpression],
    SourceLocation: Type[SourceLocation],
    Specifier: Type[Specifier],
    SpreadElement: Type[SpreadElement],
    SpreadElementPattern: Type[SpreadElementPattern],
    SpreadProperty: Type[SpreadProperty],
    SpreadPropertyPattern: Type[SpreadPropertyPattern],
    Statement: Type[Statement],
    StringLiteral: Type[StringLiteral],
    StringLiteralTypeAnnotation: Type[StringLiteralTypeAnnotation],
    StringTypeAnnotation: Type[StringTypeAnnotation],
    Super: Type[Super],
    SwitchCase: Type[SwitchCase],
    SwitchStatement: Type[SwitchStatement],
    TSAnyKeyword: Type[TSAnyKeyword],
    TSArrayType: Type[TSArrayType],
    TSAsExpression: Type[TSAsExpression],
    TSBigIntKeyword: Type[TSBigIntKeyword],
    TSBooleanKeyword: Type[TSBooleanKeyword],
    TSCallSignatureDeclaration: Type[TSCallSignatureDeclaration],
    TSConditionalType: Type[TSConditionalType],
    TSConstructSignatureDeclaration: Type[TSConstructSignatureDeclaration],
    TSConstructorType: Type[TSConstructorType],
    TSDeclareFunction: Type[TSDeclareFunction],
    TSDeclareMethod: Type[TSDeclareMethod],
    TSEnumDeclaration: Type[TSEnumDeclaration],
    TSEnumMember: Type[TSEnumMember],
    TSExportAssignment: Type[TSExportAssignment],
    TSExpressionWithTypeArguments: Type[TSExpressionWithTypeArguments],
    TSExternalModuleReference: Type[TSExternalModuleReference],
    TSFunctionType: Type[TSFunctionType],
    TSHasOptionalTypeAnnotation: Type[TSHasOptionalTypeAnnotation],
    TSHasOptionalTypeParameterInstantiation: Type[TSHasOptionalTypeParameterInstantiation],
    TSHasOptionalTypeParameters: Type[TSHasOptionalTypeParameters],
    TSImportEqualsDeclaration: Type[TSImportEqualsDeclaration],
    TSImportType: Type[TSImportType],
    TSIndexSignature: Type[TSIndexSignature],
    TSIndexedAccessType: Type[TSIndexedAccessType],
    TSInferType: Type[TSInferType],
    TSInterfaceBody: Type[TSInterfaceBody],
    TSInterfaceDeclaration: Type[TSInterfaceDeclaration],
    TSIntersectionType: Type[TSIntersectionType],
    TSLiteralType: Type[TSLiteralType],
    TSMappedType: Type[TSMappedType],
    TSMethodSignature: Type[TSMethodSignature],
    TSModuleBlock: Type[TSModuleBlock],
    TSModuleDeclaration: Type[TSModuleDeclaration],
    TSNamespaceExportDeclaration: Type[TSNamespaceExportDeclaration],
    TSNeverKeyword: Type[TSNeverKeyword],
    TSNonNullExpression: Type[TSNonNullExpression],
    TSNullKeyword: Type[TSNullKeyword],
    TSNumberKeyword: Type[TSNumberKeyword],
    TSObjectKeyword: Type[TSObjectKeyword],
    TSOptionalType: Type[TSOptionalType],
    TSParameterProperty: Type[TSParameterProperty],
    TSParenthesizedType: Type[TSParenthesizedType],
    TSPropertySignature: Type[TSPropertySignature],
    TSQualifiedName: Type[TSQualifiedName],
    TSRestType: Type[TSRestType],
    TSStringKeyword: Type[TSStringKeyword],
    TSSymbolKeyword: Type[TSSymbolKeyword],
    TSThisType: Type[TSThisType],
    TSTupleType: Type[TSTupleType],
    TSType: Type[TSType],
    TSTypeAliasDeclaration: Type[TSTypeAliasDeclaration],
    TSTypeAnnotation: Type[TSTypeAnnotation],
    TSTypeAssertion: Type[TSTypeAssertion],
    TSTypeLiteral: Type[TSTypeLiteral],
    TSTypeOperator: Type[TSTypeOperator],
    TSTypeParameter: Type[TSTypeParameter],
    TSTypeParameterDeclaration: Type[TSTypeParameterDeclaration],
    TSTypeParameterInstantiation: Type[TSTypeParameterInstantiation],
    TSTypePredicate: Type[TSTypePredicate],
    TSTypeQuery: Type[TSTypeQuery],
    TSTypeReference: Type[TSTypeReference],
    TSUndefinedKeyword: Type[TSUndefinedKeyword],
    TSUnionType: Type[TSUnionType],
    TSUnknownKeyword: Type[TSUnknownKeyword],
    TSVoidKeyword: Type[TSVoidKeyword],
    TaggedTemplateExpression: Type[TaggedTemplateExpression],
    TemplateElement: Type[TemplateElement],
    TemplateLiteral: Type[TemplateLiteral],
    ThisExpression: Type[ThisExpression],
    ThisTypeAnnotation: Type[ThisTypeAnnotation],
    ThrowStatement: Type[ThrowStatement],
    TryStatement: Type[TryStatement],
    TupleTypeAnnotation: Type[TupleTypeAnnotation],
    TypeAlias: Type[TypeAlias],
    TypeAnnotation: Type[TypeAnnotation],
    TypeCastExpression: Type[TypeCastExpression],
    TypeParameter: Type[TypeParameter],
    TypeParameterDeclaration: Type[TypeParameterDeclaration],
    TypeParameterInstantiation: Type[TypeParameterInstantiation],
    TypeofTypeAnnotation: Type[TypeofTypeAnnotation],
    UnaryExpression: Type[UnaryExpression],
    UnionTypeAnnotation: Type[UnionTypeAnnotation],
    UpdateExpression: Type[UpdateExpression]
  ): NamedTypes_ = {
    val __obj = js.Dynamic.literal(AnyTypeAnnotation = AnyTypeAnnotation.asInstanceOf[js.Any], ArrayExpression = ArrayExpression.asInstanceOf[js.Any], ArrayPattern = ArrayPattern.asInstanceOf[js.Any], ArrayTypeAnnotation = ArrayTypeAnnotation.asInstanceOf[js.Any], ArrowFunctionExpression = ArrowFunctionExpression.asInstanceOf[js.Any], AssignmentExpression = AssignmentExpression.asInstanceOf[js.Any], AssignmentPattern = AssignmentPattern.asInstanceOf[js.Any], AwaitExpression = AwaitExpression.asInstanceOf[js.Any], BigIntLiteral = BigIntLiteral.asInstanceOf[js.Any], BinaryExpression = BinaryExpression.asInstanceOf[js.Any], BindExpression = BindExpression.asInstanceOf[js.Any], Block = Block.asInstanceOf[js.Any], BlockStatement = BlockStatement.asInstanceOf[js.Any], BooleanLiteral = BooleanLiteral.asInstanceOf[js.Any], BooleanLiteralTypeAnnotation = BooleanLiteralTypeAnnotation.asInstanceOf[js.Any], BooleanTypeAnnotation = BooleanTypeAnnotation.asInstanceOf[js.Any], BreakStatement = BreakStatement.asInstanceOf[js.Any], CallExpression = CallExpression.asInstanceOf[js.Any], CatchClause = CatchClause.asInstanceOf[js.Any], ClassBody = ClassBody.asInstanceOf[js.Any], ClassDeclaration = ClassDeclaration.asInstanceOf[js.Any], ClassExpression = ClassExpression.asInstanceOf[js.Any], ClassImplements = ClassImplements.asInstanceOf[js.Any], ClassMethod = ClassMethod.asInstanceOf[js.Any], ClassPrivateMethod = ClassPrivateMethod.asInstanceOf[js.Any], ClassPrivateProperty = ClassPrivateProperty.asInstanceOf[js.Any], ClassProperty = ClassProperty.asInstanceOf[js.Any], ClassPropertyDefinition = ClassPropertyDefinition.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], CommentBlock = CommentBlock.asInstanceOf[js.Any], CommentLine = CommentLine.asInstanceOf[js.Any], ComprehensionBlock = ComprehensionBlock.asInstanceOf[js.Any], ComprehensionExpression = ComprehensionExpression.asInstanceOf[js.Any], ConditionalExpression = ConditionalExpression.asInstanceOf[js.Any], ContinueStatement = ContinueStatement.asInstanceOf[js.Any], DebuggerStatement = DebuggerStatement.asInstanceOf[js.Any], Declaration = Declaration.asInstanceOf[js.Any], DeclareClass = DeclareClass.asInstanceOf[js.Any], DeclareExportAllDeclaration = DeclareExportAllDeclaration.asInstanceOf[js.Any], DeclareExportDeclaration = DeclareExportDeclaration.asInstanceOf[js.Any], DeclareFunction = DeclareFunction.asInstanceOf[js.Any], DeclareInterface = DeclareInterface.asInstanceOf[js.Any], DeclareModule = DeclareModule.asInstanceOf[js.Any], DeclareModuleExports = DeclareModuleExports.asInstanceOf[js.Any], DeclareOpaqueType = DeclareOpaqueType.asInstanceOf[js.Any], DeclareTypeAlias = DeclareTypeAlias.asInstanceOf[js.Any], DeclareVariable = DeclareVariable.asInstanceOf[js.Any], DeclaredPredicate = DeclaredPredicate.asInstanceOf[js.Any], Decorator = Decorator.asInstanceOf[js.Any], Directive = Directive.asInstanceOf[js.Any], DirectiveLiteral = DirectiveLiteral.asInstanceOf[js.Any], DoExpression = DoExpression.asInstanceOf[js.Any], DoWhileStatement = DoWhileStatement.asInstanceOf[js.Any], EmptyStatement = EmptyStatement.asInstanceOf[js.Any], EmptyTypeAnnotation = EmptyTypeAnnotation.asInstanceOf[js.Any], ExistentialTypeParam = ExistentialTypeParam.asInstanceOf[js.Any], ExistsTypeAnnotation = ExistsTypeAnnotation.asInstanceOf[js.Any], ExportAllDeclaration = ExportAllDeclaration.asInstanceOf[js.Any], ExportBatchSpecifier = ExportBatchSpecifier.asInstanceOf[js.Any], ExportDeclaration = ExportDeclaration.asInstanceOf[js.Any], ExportDefaultDeclaration = ExportDefaultDeclaration.asInstanceOf[js.Any], ExportDefaultSpecifier = ExportDefaultSpecifier.asInstanceOf[js.Any], ExportNamedDeclaration = ExportNamedDeclaration.asInstanceOf[js.Any], ExportNamespaceSpecifier = ExportNamespaceSpecifier.asInstanceOf[js.Any], ExportSpecifier = ExportSpecifier.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionStatement = ExpressionStatement.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], Flow = Flow.asInstanceOf[js.Any], FlowPredicate = FlowPredicate.asInstanceOf[js.Any], FlowType = FlowType.asInstanceOf[js.Any], ForAwaitStatement = ForAwaitStatement.asInstanceOf[js.Any], ForInStatement = ForInStatement.asInstanceOf[js.Any], ForOfStatement = ForOfStatement.asInstanceOf[js.Any], ForStatement = ForStatement.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], FunctionDeclaration = FunctionDeclaration.asInstanceOf[js.Any], FunctionExpression = FunctionExpression.asInstanceOf[js.Any], FunctionTypeAnnotation = FunctionTypeAnnotation.asInstanceOf[js.Any], FunctionTypeParam = FunctionTypeParam.asInstanceOf[js.Any], GeneratorExpression = GeneratorExpression.asInstanceOf[js.Any], GenericTypeAnnotation = GenericTypeAnnotation.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], IfStatement = IfStatement.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], ImportDeclaration = ImportDeclaration.asInstanceOf[js.Any], ImportDefaultSpecifier = ImportDefaultSpecifier.asInstanceOf[js.Any], ImportNamespaceSpecifier = ImportNamespaceSpecifier.asInstanceOf[js.Any], ImportSpecifier = ImportSpecifier.asInstanceOf[js.Any], InferredPredicate = InferredPredicate.asInstanceOf[js.Any], InterfaceDeclaration = InterfaceDeclaration.asInstanceOf[js.Any], InterfaceExtends = InterfaceExtends.asInstanceOf[js.Any], InterfaceTypeAnnotation = InterfaceTypeAnnotation.asInstanceOf[js.Any], InterpreterDirective = InterpreterDirective.asInstanceOf[js.Any], IntersectionTypeAnnotation = IntersectionTypeAnnotation.asInstanceOf[js.Any], JSXAttribute = JSXAttribute.asInstanceOf[js.Any], JSXClosingElement = JSXClosingElement.asInstanceOf[js.Any], JSXClosingFragment = JSXClosingFragment.asInstanceOf[js.Any], JSXElement = JSXElement.asInstanceOf[js.Any], JSXEmptyExpression = JSXEmptyExpression.asInstanceOf[js.Any], JSXExpressionContainer = JSXExpressionContainer.asInstanceOf[js.Any], JSXFragment = JSXFragment.asInstanceOf[js.Any], JSXIdentifier = JSXIdentifier.asInstanceOf[js.Any], JSXMemberExpression = JSXMemberExpression.asInstanceOf[js.Any], JSXNamespacedName = JSXNamespacedName.asInstanceOf[js.Any], JSXOpeningElement = JSXOpeningElement.asInstanceOf[js.Any], JSXOpeningFragment = JSXOpeningFragment.asInstanceOf[js.Any], JSXSpreadAttribute = JSXSpreadAttribute.asInstanceOf[js.Any], JSXSpreadChild = JSXSpreadChild.asInstanceOf[js.Any], JSXText = JSXText.asInstanceOf[js.Any], LabeledStatement = LabeledStatement.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], LogicalExpression = LogicalExpression.asInstanceOf[js.Any], MemberExpression = MemberExpression.asInstanceOf[js.Any], MemberTypeAnnotation = MemberTypeAnnotation.asInstanceOf[js.Any], MetaProperty = MetaProperty.asInstanceOf[js.Any], MethodDefinition = MethodDefinition.asInstanceOf[js.Any], MixedTypeAnnotation = MixedTypeAnnotation.asInstanceOf[js.Any], ModuleSpecifier = ModuleSpecifier.asInstanceOf[js.Any], NewExpression = NewExpression.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Noop = Noop.asInstanceOf[js.Any], NullLiteral = NullLiteral.asInstanceOf[js.Any], NullLiteralTypeAnnotation = NullLiteralTypeAnnotation.asInstanceOf[js.Any], NullTypeAnnotation = NullTypeAnnotation.asInstanceOf[js.Any], NullableTypeAnnotation = NullableTypeAnnotation.asInstanceOf[js.Any], NumberLiteralTypeAnnotation = NumberLiteralTypeAnnotation.asInstanceOf[js.Any], NumberTypeAnnotation = NumberTypeAnnotation.asInstanceOf[js.Any], NumericLiteral = NumericLiteral.asInstanceOf[js.Any], NumericLiteralTypeAnnotation = NumericLiteralTypeAnnotation.asInstanceOf[js.Any], ObjectExpression = ObjectExpression.asInstanceOf[js.Any], ObjectMethod = ObjectMethod.asInstanceOf[js.Any], ObjectPattern = ObjectPattern.asInstanceOf[js.Any], ObjectProperty = ObjectProperty.asInstanceOf[js.Any], ObjectTypeAnnotation = ObjectTypeAnnotation.asInstanceOf[js.Any], ObjectTypeCallProperty = ObjectTypeCallProperty.asInstanceOf[js.Any], ObjectTypeIndexer = ObjectTypeIndexer.asInstanceOf[js.Any], ObjectTypeInternalSlot = ObjectTypeInternalSlot.asInstanceOf[js.Any], ObjectTypeProperty = ObjectTypeProperty.asInstanceOf[js.Any], ObjectTypeSpreadProperty = ObjectTypeSpreadProperty.asInstanceOf[js.Any], OpaqueType = OpaqueType.asInstanceOf[js.Any], OptionalCallExpression = OptionalCallExpression.asInstanceOf[js.Any], OptionalMemberExpression = OptionalMemberExpression.asInstanceOf[js.Any], ParenthesizedExpression = ParenthesizedExpression.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PrivateName = PrivateName.asInstanceOf[js.Any], Program = Program.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], PropertyPattern = PropertyPattern.asInstanceOf[js.Any], QualifiedTypeIdentifier = QualifiedTypeIdentifier.asInstanceOf[js.Any], RegExpLiteral = RegExpLiteral.asInstanceOf[js.Any], RestElement = RestElement.asInstanceOf[js.Any], RestProperty = RestProperty.asInstanceOf[js.Any], ReturnStatement = ReturnStatement.asInstanceOf[js.Any], SequenceExpression = SequenceExpression.asInstanceOf[js.Any], SourceLocation = SourceLocation.asInstanceOf[js.Any], Specifier = Specifier.asInstanceOf[js.Any], SpreadElement = SpreadElement.asInstanceOf[js.Any], SpreadElementPattern = SpreadElementPattern.asInstanceOf[js.Any], SpreadProperty = SpreadProperty.asInstanceOf[js.Any], SpreadPropertyPattern = SpreadPropertyPattern.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], StringLiteral = StringLiteral.asInstanceOf[js.Any], StringLiteralTypeAnnotation = StringLiteralTypeAnnotation.asInstanceOf[js.Any], StringTypeAnnotation = StringTypeAnnotation.asInstanceOf[js.Any], Super = Super.asInstanceOf[js.Any], SwitchCase = SwitchCase.asInstanceOf[js.Any], SwitchStatement = SwitchStatement.asInstanceOf[js.Any], TSAnyKeyword = TSAnyKeyword.asInstanceOf[js.Any], TSArrayType = TSArrayType.asInstanceOf[js.Any], TSAsExpression = TSAsExpression.asInstanceOf[js.Any], TSBigIntKeyword = TSBigIntKeyword.asInstanceOf[js.Any], TSBooleanKeyword = TSBooleanKeyword.asInstanceOf[js.Any], TSCallSignatureDeclaration = TSCallSignatureDeclaration.asInstanceOf[js.Any], TSConditionalType = TSConditionalType.asInstanceOf[js.Any], TSConstructSignatureDeclaration = TSConstructSignatureDeclaration.asInstanceOf[js.Any], TSConstructorType = TSConstructorType.asInstanceOf[js.Any], TSDeclareFunction = TSDeclareFunction.asInstanceOf[js.Any], TSDeclareMethod = TSDeclareMethod.asInstanceOf[js.Any], TSEnumDeclaration = TSEnumDeclaration.asInstanceOf[js.Any], TSEnumMember = TSEnumMember.asInstanceOf[js.Any], TSExportAssignment = TSExportAssignment.asInstanceOf[js.Any], TSExpressionWithTypeArguments = TSExpressionWithTypeArguments.asInstanceOf[js.Any], TSExternalModuleReference = TSExternalModuleReference.asInstanceOf[js.Any], TSFunctionType = TSFunctionType.asInstanceOf[js.Any], TSHasOptionalTypeAnnotation = TSHasOptionalTypeAnnotation.asInstanceOf[js.Any], TSHasOptionalTypeParameterInstantiation = TSHasOptionalTypeParameterInstantiation.asInstanceOf[js.Any], TSHasOptionalTypeParameters = TSHasOptionalTypeParameters.asInstanceOf[js.Any], TSImportEqualsDeclaration = TSImportEqualsDeclaration.asInstanceOf[js.Any], TSImportType = TSImportType.asInstanceOf[js.Any], TSIndexSignature = TSIndexSignature.asInstanceOf[js.Any], TSIndexedAccessType = TSIndexedAccessType.asInstanceOf[js.Any], TSInferType = TSInferType.asInstanceOf[js.Any], TSInterfaceBody = TSInterfaceBody.asInstanceOf[js.Any], TSInterfaceDeclaration = TSInterfaceDeclaration.asInstanceOf[js.Any], TSIntersectionType = TSIntersectionType.asInstanceOf[js.Any], TSLiteralType = TSLiteralType.asInstanceOf[js.Any], TSMappedType = TSMappedType.asInstanceOf[js.Any], TSMethodSignature = TSMethodSignature.asInstanceOf[js.Any], TSModuleBlock = TSModuleBlock.asInstanceOf[js.Any], TSModuleDeclaration = TSModuleDeclaration.asInstanceOf[js.Any], TSNamespaceExportDeclaration = TSNamespaceExportDeclaration.asInstanceOf[js.Any], TSNeverKeyword = TSNeverKeyword.asInstanceOf[js.Any], TSNonNullExpression = TSNonNullExpression.asInstanceOf[js.Any], TSNullKeyword = TSNullKeyword.asInstanceOf[js.Any], TSNumberKeyword = TSNumberKeyword.asInstanceOf[js.Any], TSObjectKeyword = TSObjectKeyword.asInstanceOf[js.Any], TSOptionalType = TSOptionalType.asInstanceOf[js.Any], TSParameterProperty = TSParameterProperty.asInstanceOf[js.Any], TSParenthesizedType = TSParenthesizedType.asInstanceOf[js.Any], TSPropertySignature = TSPropertySignature.asInstanceOf[js.Any], TSQualifiedName = TSQualifiedName.asInstanceOf[js.Any], TSRestType = TSRestType.asInstanceOf[js.Any], TSStringKeyword = TSStringKeyword.asInstanceOf[js.Any], TSSymbolKeyword = TSSymbolKeyword.asInstanceOf[js.Any], TSThisType = TSThisType.asInstanceOf[js.Any], TSTupleType = TSTupleType.asInstanceOf[js.Any], TSType = TSType.asInstanceOf[js.Any], TSTypeAliasDeclaration = TSTypeAliasDeclaration.asInstanceOf[js.Any], TSTypeAnnotation = TSTypeAnnotation.asInstanceOf[js.Any], TSTypeAssertion = TSTypeAssertion.asInstanceOf[js.Any], TSTypeLiteral = TSTypeLiteral.asInstanceOf[js.Any], TSTypeOperator = TSTypeOperator.asInstanceOf[js.Any], TSTypeParameter = TSTypeParameter.asInstanceOf[js.Any], TSTypeParameterDeclaration = TSTypeParameterDeclaration.asInstanceOf[js.Any], TSTypeParameterInstantiation = TSTypeParameterInstantiation.asInstanceOf[js.Any], TSTypePredicate = TSTypePredicate.asInstanceOf[js.Any], TSTypeQuery = TSTypeQuery.asInstanceOf[js.Any], TSTypeReference = TSTypeReference.asInstanceOf[js.Any], TSUndefinedKeyword = TSUndefinedKeyword.asInstanceOf[js.Any], TSUnionType = TSUnionType.asInstanceOf[js.Any], TSUnknownKeyword = TSUnknownKeyword.asInstanceOf[js.Any], TSVoidKeyword = TSVoidKeyword.asInstanceOf[js.Any], TaggedTemplateExpression = TaggedTemplateExpression.asInstanceOf[js.Any], TemplateElement = TemplateElement.asInstanceOf[js.Any], TemplateLiteral = TemplateLiteral.asInstanceOf[js.Any], ThisExpression = ThisExpression.asInstanceOf[js.Any], ThisTypeAnnotation = ThisTypeAnnotation.asInstanceOf[js.Any], ThrowStatement = ThrowStatement.asInstanceOf[js.Any], TryStatement = TryStatement.asInstanceOf[js.Any], TupleTypeAnnotation = TupleTypeAnnotation.asInstanceOf[js.Any], TypeAlias = TypeAlias.asInstanceOf[js.Any], TypeAnnotation = TypeAnnotation.asInstanceOf[js.Any], TypeCastExpression = TypeCastExpression.asInstanceOf[js.Any], TypeParameter = TypeParameter.asInstanceOf[js.Any], TypeParameterDeclaration = TypeParameterDeclaration.asInstanceOf[js.Any], TypeParameterInstantiation = TypeParameterInstantiation.asInstanceOf[js.Any], TypeofTypeAnnotation = TypeofTypeAnnotation.asInstanceOf[js.Any], UnaryExpression = UnaryExpression.asInstanceOf[js.Any], UnionTypeAnnotation = UnionTypeAnnotation.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedTypes_]
  }
}

