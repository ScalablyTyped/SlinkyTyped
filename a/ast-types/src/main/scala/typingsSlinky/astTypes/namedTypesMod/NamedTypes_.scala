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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberMember
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
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
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedTypes_ extends StObject {
  
  var AnyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation] = js.native
  
  var ArrayExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression] = js.native
  
  var ArrayPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern] = js.native
  
  var ArrayTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation] = js.native
  
  var ArrowFunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression] = js.native
  
  var AssignmentExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression] = js.native
  
  var AssignmentPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern] = js.native
  
  var AwaitExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression] = js.native
  
  var BigIntLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral] = js.native
  
  var BigIntLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation] = js.native
  
  var BigIntTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation] = js.native
  
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
  
  var ChainElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainElement] = js.native
  
  var ChainExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression] = js.native
  
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
  
  var EnumBooleanBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanBody] = js.native
  
  var EnumBooleanMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember] = js.native
  
  var EnumDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration] = js.native
  
  var EnumDefaultedMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember] = js.native
  
  var EnumNumberBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody] = js.native
  
  var EnumNumberMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberMember] = js.native
  
  var EnumStringBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody] = js.native
  
  var EnumStringMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember] = js.native
  
  var EnumSymbolBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody] = js.native
  
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
  
  var ImportExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression] = js.native
  
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
  
  var SymbolTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation] = js.native
  
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
  
  var TSNamedTupleMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember] = js.native
  
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
  implicit class NamedTypes_MutableBuilder[Self <: NamedTypes_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyTypeAnnotation(value: Type[AnyTypeAnnotation]): Self = StObject.set(x, "AnyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayExpression(value: Type[ArrayExpression]): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayPattern(value: Type[ArrayPattern]): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayTypeAnnotation(value: Type[ArrayTypeAnnotation]): Self = StObject.set(x, "ArrayTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowFunctionExpression(value: Type[ArrowFunctionExpression]): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentExpression(value: Type[AssignmentExpression]): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentPattern(value: Type[AssignmentPattern]): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitExpression(value: Type[AwaitExpression]): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntLiteral(value: Type[BigIntLiteral]): Self = StObject.set(x, "BigIntLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntLiteralTypeAnnotation(value: Type[BigIntLiteralTypeAnnotation]): Self = StObject.set(x, "BigIntLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntTypeAnnotation(value: Type[BigIntTypeAnnotation]): Self = StObject.set(x, "BigIntTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryExpression(value: Type[BinaryExpression]): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindExpression(value: Type[BindExpression]): Self = StObject.set(x, "BindExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: Type[Block]): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockStatement(value: Type[BlockStatement]): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanLiteral(value: Type[BooleanLiteral]): Self = StObject.set(x, "BooleanLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanLiteralTypeAnnotation(value: Type[BooleanLiteralTypeAnnotation]): Self = StObject.set(x, "BooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanTypeAnnotation(value: Type[BooleanTypeAnnotation]): Self = StObject.set(x, "BooleanTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakStatement(value: Type[BreakStatement]): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallExpression(value: Type[CallExpression]): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatchClause(value: Type[CatchClause]): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainElement(value: Type[ChainElement]): Self = StObject.set(x, "ChainElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainExpression(value: Type[ChainExpression]): Self = StObject.set(x, "ChainExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBody(value: Type[ClassBody]): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassDeclaration(value: Type[ClassDeclaration]): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpression(value: Type[ClassExpression]): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassImplements(value: Type[ClassImplements]): Self = StObject.set(x, "ClassImplements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassMethod(value: Type[ClassMethod]): Self = StObject.set(x, "ClassMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPrivateMethod(value: Type[ClassPrivateMethod]): Self = StObject.set(x, "ClassPrivateMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPrivateProperty(value: Type[ClassPrivateProperty]): Self = StObject.set(x, "ClassPrivateProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassProperty(value: Type[ClassProperty]): Self = StObject.set(x, "ClassProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPropertyDefinition(value: Type[ClassPropertyDefinition]): Self = StObject.set(x, "ClassPropertyDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Type[Comment]): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentBlock(value: Type[CommentBlock]): Self = StObject.set(x, "CommentBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentLine(value: Type[CommentLine]): Self = StObject.set(x, "CommentLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehensionBlock(value: Type[ComprehensionBlock]): Self = StObject.set(x, "ComprehensionBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehensionExpression(value: Type[ComprehensionExpression]): Self = StObject.set(x, "ComprehensionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalExpression(value: Type[ConditionalExpression]): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueStatement(value: Type[ContinueStatement]): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerStatement(value: Type[DebuggerStatement]): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaration(value: Type[Declaration]): Self = StObject.set(x, "Declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareClass(value: Type[DeclareClass]): Self = StObject.set(x, "DeclareClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareExportAllDeclaration(value: Type[DeclareExportAllDeclaration]): Self = StObject.set(x, "DeclareExportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareExportDeclaration(value: Type[DeclareExportDeclaration]): Self = StObject.set(x, "DeclareExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareFunction(value: Type[DeclareFunction]): Self = StObject.set(x, "DeclareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareInterface(value: Type[DeclareInterface]): Self = StObject.set(x, "DeclareInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareModule(value: Type[DeclareModule]): Self = StObject.set(x, "DeclareModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareModuleExports(value: Type[DeclareModuleExports]): Self = StObject.set(x, "DeclareModuleExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareOpaqueType(value: Type[DeclareOpaqueType]): Self = StObject.set(x, "DeclareOpaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareTypeAlias(value: Type[DeclareTypeAlias]): Self = StObject.set(x, "DeclareTypeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareVariable(value: Type[DeclareVariable]): Self = StObject.set(x, "DeclareVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredPredicate(value: Type[DeclaredPredicate]): Self = StObject.set(x, "DeclaredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorator(value: Type[Decorator]): Self = StObject.set(x, "Decorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirective(value: Type[Directive]): Self = StObject.set(x, "Directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveLiteral(value: Type[DirectiveLiteral]): Self = StObject.set(x, "DirectiveLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoExpression(value: Type[DoExpression]): Self = StObject.set(x, "DoExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoWhileStatement(value: Type[DoWhileStatement]): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyStatement(value: Type[EmptyStatement]): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTypeAnnotation(value: Type[EmptyTypeAnnotation]): Self = StObject.set(x, "EmptyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumBooleanBody(value: Type[EnumBooleanBody]): Self = StObject.set(x, "EnumBooleanBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumBooleanMember(value: Type[EnumBooleanMember]): Self = StObject.set(x, "EnumBooleanMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumDeclaration(value: Type[EnumDeclaration]): Self = StObject.set(x, "EnumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumDefaultedMember(value: Type[EnumDefaultedMember]): Self = StObject.set(x, "EnumDefaultedMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNumberBody(value: Type[EnumNumberBody]): Self = StObject.set(x, "EnumNumberBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNumberMember(value: Type[EnumNumberMember]): Self = StObject.set(x, "EnumNumberMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumStringBody(value: Type[EnumStringBody]): Self = StObject.set(x, "EnumStringBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumStringMember(value: Type[EnumStringMember]): Self = StObject.set(x, "EnumStringMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumSymbolBody(value: Type[EnumSymbolBody]): Self = StObject.set(x, "EnumSymbolBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistentialTypeParam(value: Type[ExistentialTypeParam]): Self = StObject.set(x, "ExistentialTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistsTypeAnnotation(value: Type[ExistsTypeAnnotation]): Self = StObject.set(x, "ExistsTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAllDeclaration(value: Type[ExportAllDeclaration]): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportBatchSpecifier(value: Type[ExportBatchSpecifier]): Self = StObject.set(x, "ExportBatchSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDeclaration(value: Type[ExportDeclaration]): Self = StObject.set(x, "ExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDefaultDeclaration(value: Type[ExportDefaultDeclaration]): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDefaultSpecifier(value: Type[ExportDefaultSpecifier]): Self = StObject.set(x, "ExportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportNamedDeclaration(value: Type[ExportNamedDeclaration]): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportNamespaceSpecifier(value: Type[ExportNamespaceSpecifier]): Self = StObject.set(x, "ExportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportSpecifier(value: Type[ExportSpecifier]): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Type[Expression]): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionStatement(value: Type[ExpressionStatement]): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: Type[File]): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: Type[Flow]): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowPredicate(value: Type[FlowPredicate]): Self = StObject.set(x, "FlowPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowType(value: Type[FlowType]): Self = StObject.set(x, "FlowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForAwaitStatement(value: Type[ForAwaitStatement]): Self = StObject.set(x, "ForAwaitStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForInStatement(value: Type[ForInStatement]): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForOfStatement(value: Type[ForOfStatement]): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForStatement(value: Type[ForStatement]): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: Type[Function]): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionDeclaration(value: Type[FunctionDeclaration]): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionExpression(value: Type[FunctionExpression]): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionTypeAnnotation(value: Type[FunctionTypeAnnotation]): Self = StObject.set(x, "FunctionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionTypeParam(value: Type[FunctionTypeParam]): Self = StObject.set(x, "FunctionTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorExpression(value: Type[GeneratorExpression]): Self = StObject.set(x, "GeneratorExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericTypeAnnotation(value: Type[GenericTypeAnnotation]): Self = StObject.set(x, "GenericTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Type[Identifier]): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfStatement(value: Type[IfStatement]): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: Type[Import]): Self = StObject.set(x, "Import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDeclaration(value: Type[ImportDeclaration]): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDefaultSpecifier(value: Type[ImportDefaultSpecifier]): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportExpression(value: Type[ImportExpression]): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportNamespaceSpecifier(value: Type[ImportNamespaceSpecifier]): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportSpecifier(value: Type[ImportSpecifier]): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferredPredicate(value: Type[InferredPredicate]): Self = StObject.set(x, "InferredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceDeclaration(value: Type[InterfaceDeclaration]): Self = StObject.set(x, "InterfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceExtends(value: Type[InterfaceExtends]): Self = StObject.set(x, "InterfaceExtends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceTypeAnnotation(value: Type[InterfaceTypeAnnotation]): Self = StObject.set(x, "InterfaceTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpreterDirective(value: Type[InterpreterDirective]): Self = StObject.set(x, "InterpreterDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionTypeAnnotation(value: Type[IntersectionTypeAnnotation]): Self = StObject.set(x, "IntersectionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXAttribute(value: Type[JSXAttribute]): Self = StObject.set(x, "JSXAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXClosingElement(value: Type[JSXClosingElement]): Self = StObject.set(x, "JSXClosingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXClosingFragment(value: Type[JSXClosingFragment]): Self = StObject.set(x, "JSXClosingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXElement(value: Type[JSXElement]): Self = StObject.set(x, "JSXElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXEmptyExpression(value: Type[JSXEmptyExpression]): Self = StObject.set(x, "JSXEmptyExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXExpressionContainer(value: Type[JSXExpressionContainer]): Self = StObject.set(x, "JSXExpressionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXFragment(value: Type[JSXFragment]): Self = StObject.set(x, "JSXFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXIdentifier(value: Type[JSXIdentifier]): Self = StObject.set(x, "JSXIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXMemberExpression(value: Type[JSXMemberExpression]): Self = StObject.set(x, "JSXMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXNamespacedName(value: Type[JSXNamespacedName]): Self = StObject.set(x, "JSXNamespacedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXOpeningElement(value: Type[JSXOpeningElement]): Self = StObject.set(x, "JSXOpeningElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXOpeningFragment(value: Type[JSXOpeningFragment]): Self = StObject.set(x, "JSXOpeningFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXSpreadAttribute(value: Type[JSXSpreadAttribute]): Self = StObject.set(x, "JSXSpreadAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXSpreadChild(value: Type[JSXSpreadChild]): Self = StObject.set(x, "JSXSpreadChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXText(value: Type[JSXText]): Self = StObject.set(x, "JSXText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabeledStatement(value: Type[LabeledStatement]): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Type[Line]): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteral(value: Type[Literal]): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalExpression(value: Type[LogicalExpression]): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberExpression(value: Type[MemberExpression]): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTypeAnnotation(value: Type[MemberTypeAnnotation]): Self = StObject.set(x, "MemberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaProperty(value: Type[MetaProperty]): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodDefinition(value: Type[MethodDefinition]): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedTypeAnnotation(value: Type[MixedTypeAnnotation]): Self = StObject.set(x, "MixedTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSpecifier(value: Type[ModuleSpecifier]): Self = StObject.set(x, "ModuleSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewExpression(value: Type[NewExpression]): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Type[Node]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoop(value: Type[Noop]): Self = StObject.set(x, "Noop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullLiteral(value: Type[NullLiteral]): Self = StObject.set(x, "NullLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullLiteralTypeAnnotation(value: Type[NullLiteralTypeAnnotation]): Self = StObject.set(x, "NullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullTypeAnnotation(value: Type[NullTypeAnnotation]): Self = StObject.set(x, "NullTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableTypeAnnotation(value: Type[NullableTypeAnnotation]): Self = StObject.set(x, "NullableTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberLiteralTypeAnnotation(value: Type[NumberLiteralTypeAnnotation]): Self = StObject.set(x, "NumberLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTypeAnnotation(value: Type[NumberTypeAnnotation]): Self = StObject.set(x, "NumberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericLiteral(value: Type[NumericLiteral]): Self = StObject.set(x, "NumericLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericLiteralTypeAnnotation(value: Type[NumericLiteralTypeAnnotation]): Self = StObject.set(x, "NumericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectExpression(value: Type[ObjectExpression]): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMethod(value: Type[ObjectMethod]): Self = StObject.set(x, "ObjectMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPattern(value: Type[ObjectPattern]): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectProperty(value: Type[ObjectProperty]): Self = StObject.set(x, "ObjectProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeAnnotation(value: Type[ObjectTypeAnnotation]): Self = StObject.set(x, "ObjectTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeCallProperty(value: Type[ObjectTypeCallProperty]): Self = StObject.set(x, "ObjectTypeCallProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeIndexer(value: Type[ObjectTypeIndexer]): Self = StObject.set(x, "ObjectTypeIndexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeInternalSlot(value: Type[ObjectTypeInternalSlot]): Self = StObject.set(x, "ObjectTypeInternalSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeProperty(value: Type[ObjectTypeProperty]): Self = StObject.set(x, "ObjectTypeProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeSpreadProperty(value: Type[ObjectTypeSpreadProperty]): Self = StObject.set(x, "ObjectTypeSpreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaqueType(value: Type[OpaqueType]): Self = StObject.set(x, "OpaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalCallExpression(value: Type[OptionalCallExpression]): Self = StObject.set(x, "OptionalCallExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalMemberExpression(value: Type[OptionalMemberExpression]): Self = StObject.set(x, "OptionalMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParenthesizedExpression(value: Type[ParenthesizedExpression]): Self = StObject.set(x, "ParenthesizedExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: Type[Pattern]): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Type[Position]): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: Type[Printable]): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateName(value: Type[PrivateName]): Self = StObject.set(x, "PrivateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: Type[Program]): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Type[Property]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyPattern(value: Type[PropertyPattern]): Self = StObject.set(x, "PropertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifiedTypeIdentifier(value: Type[QualifiedTypeIdentifier]): Self = StObject.set(x, "QualifiedTypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpLiteral(value: Type[RegExpLiteral]): Self = StObject.set(x, "RegExpLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestElement(value: Type[RestElement]): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestProperty(value: Type[RestProperty]): Self = StObject.set(x, "RestProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatement(value: Type[ReturnStatement]): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceExpression(value: Type[SequenceExpression]): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: Type[SourceLocation]): Self = StObject.set(x, "SourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifier(value: Type[Specifier]): Self = StObject.set(x, "Specifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadElement(value: Type[SpreadElement]): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadElementPattern(value: Type[SpreadElementPattern]): Self = StObject.set(x, "SpreadElementPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadProperty(value: Type[SpreadProperty]): Self = StObject.set(x, "SpreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadPropertyPattern(value: Type[SpreadPropertyPattern]): Self = StObject.set(x, "SpreadPropertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: Type[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteral(value: Type[StringLiteral]): Self = StObject.set(x, "StringLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteralTypeAnnotation(value: Type[StringLiteralTypeAnnotation]): Self = StObject.set(x, "StringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringTypeAnnotation(value: Type[StringTypeAnnotation]): Self = StObject.set(x, "StringTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuper(value: Type[Super]): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchCase(value: Type[SwitchCase]): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchStatement(value: Type[SwitchStatement]): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeAnnotation(value: Type[SymbolTypeAnnotation]): Self = StObject.set(x, "SymbolTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSAnyKeyword(value: Type[TSAnyKeyword]): Self = StObject.set(x, "TSAnyKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSArrayType(value: Type[TSArrayType]): Self = StObject.set(x, "TSArrayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSAsExpression(value: Type[TSAsExpression]): Self = StObject.set(x, "TSAsExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSBigIntKeyword(value: Type[TSBigIntKeyword]): Self = StObject.set(x, "TSBigIntKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSBooleanKeyword(value: Type[TSBooleanKeyword]): Self = StObject.set(x, "TSBooleanKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSCallSignatureDeclaration(value: Type[TSCallSignatureDeclaration]): Self = StObject.set(x, "TSCallSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSConditionalType(value: Type[TSConditionalType]): Self = StObject.set(x, "TSConditionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSConstructSignatureDeclaration(value: Type[TSConstructSignatureDeclaration]): Self = StObject.set(x, "TSConstructSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSConstructorType(value: Type[TSConstructorType]): Self = StObject.set(x, "TSConstructorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSDeclareFunction(value: Type[TSDeclareFunction]): Self = StObject.set(x, "TSDeclareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSDeclareMethod(value: Type[TSDeclareMethod]): Self = StObject.set(x, "TSDeclareMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSEnumDeclaration(value: Type[TSEnumDeclaration]): Self = StObject.set(x, "TSEnumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSEnumMember(value: Type[TSEnumMember]): Self = StObject.set(x, "TSEnumMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSExportAssignment(value: Type[TSExportAssignment]): Self = StObject.set(x, "TSExportAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSExpressionWithTypeArguments(value: Type[TSExpressionWithTypeArguments]): Self = StObject.set(x, "TSExpressionWithTypeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSExternalModuleReference(value: Type[TSExternalModuleReference]): Self = StObject.set(x, "TSExternalModuleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSFunctionType(value: Type[TSFunctionType]): Self = StObject.set(x, "TSFunctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSHasOptionalTypeAnnotation(value: Type[TSHasOptionalTypeAnnotation]): Self = StObject.set(x, "TSHasOptionalTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSHasOptionalTypeParameterInstantiation(value: Type[TSHasOptionalTypeParameterInstantiation]): Self = StObject.set(x, "TSHasOptionalTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSHasOptionalTypeParameters(value: Type[TSHasOptionalTypeParameters]): Self = StObject.set(x, "TSHasOptionalTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSImportEqualsDeclaration(value: Type[TSImportEqualsDeclaration]): Self = StObject.set(x, "TSImportEqualsDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSImportType(value: Type[TSImportType]): Self = StObject.set(x, "TSImportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSIndexSignature(value: Type[TSIndexSignature]): Self = StObject.set(x, "TSIndexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSIndexedAccessType(value: Type[TSIndexedAccessType]): Self = StObject.set(x, "TSIndexedAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSInferType(value: Type[TSInferType]): Self = StObject.set(x, "TSInferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSInterfaceBody(value: Type[TSInterfaceBody]): Self = StObject.set(x, "TSInterfaceBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSInterfaceDeclaration(value: Type[TSInterfaceDeclaration]): Self = StObject.set(x, "TSInterfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSIntersectionType(value: Type[TSIntersectionType]): Self = StObject.set(x, "TSIntersectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSLiteralType(value: Type[TSLiteralType]): Self = StObject.set(x, "TSLiteralType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSMappedType(value: Type[TSMappedType]): Self = StObject.set(x, "TSMappedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSMethodSignature(value: Type[TSMethodSignature]): Self = StObject.set(x, "TSMethodSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSModuleBlock(value: Type[TSModuleBlock]): Self = StObject.set(x, "TSModuleBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSModuleDeclaration(value: Type[TSModuleDeclaration]): Self = StObject.set(x, "TSModuleDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNamedTupleMember(value: Type[TSNamedTupleMember]): Self = StObject.set(x, "TSNamedTupleMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNamespaceExportDeclaration(value: Type[TSNamespaceExportDeclaration]): Self = StObject.set(x, "TSNamespaceExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNeverKeyword(value: Type[TSNeverKeyword]): Self = StObject.set(x, "TSNeverKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNonNullExpression(value: Type[TSNonNullExpression]): Self = StObject.set(x, "TSNonNullExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNullKeyword(value: Type[TSNullKeyword]): Self = StObject.set(x, "TSNullKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNumberKeyword(value: Type[TSNumberKeyword]): Self = StObject.set(x, "TSNumberKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSObjectKeyword(value: Type[TSObjectKeyword]): Self = StObject.set(x, "TSObjectKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSOptionalType(value: Type[TSOptionalType]): Self = StObject.set(x, "TSOptionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSParameterProperty(value: Type[TSParameterProperty]): Self = StObject.set(x, "TSParameterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSParenthesizedType(value: Type[TSParenthesizedType]): Self = StObject.set(x, "TSParenthesizedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSPropertySignature(value: Type[TSPropertySignature]): Self = StObject.set(x, "TSPropertySignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSQualifiedName(value: Type[TSQualifiedName]): Self = StObject.set(x, "TSQualifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSRestType(value: Type[TSRestType]): Self = StObject.set(x, "TSRestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSStringKeyword(value: Type[TSStringKeyword]): Self = StObject.set(x, "TSStringKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSSymbolKeyword(value: Type[TSSymbolKeyword]): Self = StObject.set(x, "TSSymbolKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSThisType(value: Type[TSThisType]): Self = StObject.set(x, "TSThisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTupleType(value: Type[TSTupleType]): Self = StObject.set(x, "TSTupleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSType(value: Type[TSType]): Self = StObject.set(x, "TSType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeAliasDeclaration(value: Type[TSTypeAliasDeclaration]): Self = StObject.set(x, "TSTypeAliasDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeAnnotation(value: Type[TSTypeAnnotation]): Self = StObject.set(x, "TSTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeAssertion(value: Type[TSTypeAssertion]): Self = StObject.set(x, "TSTypeAssertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeLiteral(value: Type[TSTypeLiteral]): Self = StObject.set(x, "TSTypeLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeOperator(value: Type[TSTypeOperator]): Self = StObject.set(x, "TSTypeOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeParameter(value: Type[TSTypeParameter]): Self = StObject.set(x, "TSTypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeParameterDeclaration(value: Type[TSTypeParameterDeclaration]): Self = StObject.set(x, "TSTypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeParameterInstantiation(value: Type[TSTypeParameterInstantiation]): Self = StObject.set(x, "TSTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypePredicate(value: Type[TSTypePredicate]): Self = StObject.set(x, "TSTypePredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeQuery(value: Type[TSTypeQuery]): Self = StObject.set(x, "TSTypeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeReference(value: Type[TSTypeReference]): Self = StObject.set(x, "TSTypeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSUndefinedKeyword(value: Type[TSUndefinedKeyword]): Self = StObject.set(x, "TSUndefinedKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSUnionType(value: Type[TSUnionType]): Self = StObject.set(x, "TSUnionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSUnknownKeyword(value: Type[TSUnknownKeyword]): Self = StObject.set(x, "TSUnknownKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSVoidKeyword(value: Type[TSVoidKeyword]): Self = StObject.set(x, "TSVoidKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggedTemplateExpression(value: Type[TaggedTemplateExpression]): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateElement(value: Type[TemplateElement]): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLiteral(value: Type[TemplateLiteral]): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisExpression(value: Type[ThisExpression]): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisTypeAnnotation(value: Type[ThisTypeAnnotation]): Self = StObject.set(x, "ThisTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowStatement(value: Type[ThrowStatement]): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryStatement(value: Type[TryStatement]): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleTypeAnnotation(value: Type[TupleTypeAnnotation]): Self = StObject.set(x, "TupleTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAlias(value: Type[TypeAlias]): Self = StObject.set(x, "TypeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: Type[TypeAnnotation]): Self = StObject.set(x, "TypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCastExpression(value: Type[TypeCastExpression]): Self = StObject.set(x, "TypeCastExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameter(value: Type[TypeParameter]): Self = StObject.set(x, "TypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterDeclaration(value: Type[TypeParameterDeclaration]): Self = StObject.set(x, "TypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterInstantiation(value: Type[TypeParameterInstantiation]): Self = StObject.set(x, "TypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofTypeAnnotation(value: Type[TypeofTypeAnnotation]): Self = StObject.set(x, "TypeofTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnaryExpression(value: Type[UnaryExpression]): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionTypeAnnotation(value: Type[UnionTypeAnnotation]): Self = StObject.set(x, "UnionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateExpression(value: Type[UpdateExpression]): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDeclaration(value: Type[VariableDeclaration]): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDeclarator(value: Type[VariableDeclarator]): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Type[Variance]): Self = StObject.set(x, "Variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidTypeAnnotation(value: Type[VoidTypeAnnotation]): Self = StObject.set(x, "VoidTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhileStatement(value: Type[WhileStatement]): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithStatement(value: Type[WithStatement]): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYieldExpression(value: Type[YieldExpression]): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
  }
}
