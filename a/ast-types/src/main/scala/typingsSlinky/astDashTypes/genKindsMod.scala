package typingsSlinky.astDashTypes

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
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CatchClause
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassImplements
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CommentBlock
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CommentLine
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionBlock
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ConditionalExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ContinueStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.DebuggerStatement
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
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExpressionStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.File
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForAwaitStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForInStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForOfStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ForStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeParam
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.GeneratorExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.IfStatement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Import
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportDeclaration
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportDefaultSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportNamespaceSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.InferredPredicate
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
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MetaProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.MixedTypeAnnotation
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.NewExpression
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
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Position
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
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadElement
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadElementPattern
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadProperty
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.SpreadPropertyPattern
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
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ast-types/gen/kinds", JSImport.Namespace)
@js.native
object genKindsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CallExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalCallExpression
  */
  trait CallExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
  */
  trait ClassPropertyKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Block
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Line
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CommentBlock
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CommentLine
  */
  trait CommentKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareOpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareClass
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamedDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSPropertySignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExternalModuleReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait DeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Identifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThisExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Literal
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SequenceExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UnaryExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UpdateExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ConditionalExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NewExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CallExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.YieldExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.GeneratorExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TaggedTemplateExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AwaitExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXIdentifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXExpressionContainer
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXMemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXFragment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXText
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXEmptyExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadChild
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeCastExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DoExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Super
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BindExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MetaProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ParenthesizedExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DirectiveLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BigIntLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RegExpLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.PrivateName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Import
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSAsExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNonNullExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAssertion
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalCallExpression
  */
  trait ExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TupleTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InferredPredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InferredPredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowPredicateKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TupleTypeAnnotation
  */
  trait FlowTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
  */
  trait FunctionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Identifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXIdentifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
  */
  trait IdentifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareClass
  */
  trait InterfaceDeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Literal
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXText
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BigIntLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RegExpLiteral
  */
  trait LiteralKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXMemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalMemberExpression
  */
  trait MemberExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportSpecifier
  */
  trait ModuleSpecifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.File
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Program
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Identifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BlockStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExpressionStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.IfStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.LabeledStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BreakStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ContinueStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.WithStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SwitchStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SwitchCase
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ReturnStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThrowStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TryStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CatchClause
    - typings.astDashTypes.genNamedTypesMod.namedTypes.WhileStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DoWhileStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForInStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DebuggerStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclarator
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThisExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Property
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Literal
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SequenceExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UnaryExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UpdateExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ConditionalExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NewExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CallExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RestElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadElementPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForOfStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.YieldExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.GeneratorExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionBlock
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.PropertyPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TaggedTemplateExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadPropertyPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AwaitExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXAttribute
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXIdentifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXNamespacedName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXExpressionContainer
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXMemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadAttribute
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXFragment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXText
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningFragment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingFragment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXEmptyExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadChild
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterInstantiation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterInstantiation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassImplements
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeParam
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeSpreadProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeIndexer
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeCallProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeInternalSlot
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Variance
    - typings.astDashTypes.genNamedTypesMod.namedTypes.QualifiedTypeIdentifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceExtends
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareOpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeCastExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TupleTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareVariable
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareClass
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModule
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModuleExports
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportBatchSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InferredPredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclaredPredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Noop
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DoExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Super
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BindExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Decorator
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MetaProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ParenthesizedExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamedDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Directive
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DirectiveLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterpreterDirective
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BigIntLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RegExpLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.PrivateName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RestProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForAwaitStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Import
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSQualifiedName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSAsExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNonNullExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSAnyKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSBigIntKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSBooleanKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNeverKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNullKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNumberKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSObjectKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSStringKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSSymbolKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUndefinedKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnknownKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSVoidKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSThisType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSArrayType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSLiteralType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIntersectionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConditionalType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInferType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSParenthesizedType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSFunctionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructorType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMappedType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTupleType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSRestType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSOptionalType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexedAccessType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeOperator
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSPropertySignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypePredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumMember
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeQuery
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAssertion
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleBlock
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExternalModuleReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExportAssignment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceBody
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSParameterProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalCallExpression
  */
  trait NodeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Identifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RestElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadElementPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.PropertyPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadPropertyPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXIdentifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.PrivateName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSAsExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNonNullExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAssertion
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSParameterProperty
  */
  trait PatternKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.File
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Program
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Identifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BlockStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExpressionStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.IfStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.LabeledStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BreakStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ContinueStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.WithStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SwitchStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SwitchCase
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ReturnStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThrowStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TryStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CatchClause
    - typings.astDashTypes.genNamedTypesMod.namedTypes.WhileStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DoWhileStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForInStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DebuggerStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclarator
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThisExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Property
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Literal
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SequenceExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UnaryExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UpdateExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ConditionalExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NewExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CallExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RestElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadElementPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForOfStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.YieldExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.GeneratorExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionBlock
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.PropertyPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TaggedTemplateExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadPropertyPattern
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AwaitExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXAttribute
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXIdentifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXNamespacedName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXExpressionContainer
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXMemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadAttribute
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingElement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXFragment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXText
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningFragment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingFragment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXEmptyExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadChild
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterInstantiation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterInstantiation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassImplements
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typings.astDashTypes.genNamedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeParam
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeSpreadProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeIndexer
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeCallProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeInternalSlot
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Variance
    - typings.astDashTypes.genNamedTypesMod.namedTypes.QualifiedTypeIdentifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceExtends
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareOpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeCastExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TupleTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareVariable
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareClass
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModule
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModuleExports
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportBatchSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InferredPredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclaredPredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Block
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Line
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Noop
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DoExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Super
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BindExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Decorator
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MetaProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ParenthesizedExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamedDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CommentBlock
    - typings.astDashTypes.genNamedTypesMod.namedTypes.CommentLine
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Directive
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DirectiveLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterpreterDirective
    - typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BigIntLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RegExpLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.PrivateName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.RestProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForAwaitStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Import
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSQualifiedName
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSAsExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNonNullExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSAnyKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSBigIntKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSBooleanKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNeverKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNullKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNumberKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSObjectKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSStringKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSSymbolKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUndefinedKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnknownKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSVoidKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSThisType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSArrayType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSLiteralType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIntersectionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConditionalType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInferType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSParenthesizedType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSFunctionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructorType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMappedType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTupleType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSRestType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSOptionalType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexedAccessType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeOperator
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSPropertySignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypePredicate
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumMember
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeQuery
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeLiteral
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAssertion
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleBlock
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExternalModuleReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExportAssignment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceBody
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSParameterProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalCallExpression
  */
  trait PrintableKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportBatchSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultSpecifier
  */
  trait SpecifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BlockStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExpressionStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.IfStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.LabeledStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.BreakStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ContinueStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.WithStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.SwitchStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ReturnStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ThrowStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TryStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.WhileStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DoWhileStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForInStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DebuggerStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForOfStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.OpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareOpaqueType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareVariable
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareClass
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModule
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModuleExports
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.Noop
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamedDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ExportAllDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.ForAwaitStatement
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSPropertySignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExternalModuleReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExportAssignment
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait StatementKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSFunctionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructorType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSPropertySignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
  */
  trait TSHasOptionalTypeAnnotationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportType
  */
  trait TSHasOptionalTypeParameterInstantiationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSFunctionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructorType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareFunction
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait TSHasOptionalTypeParametersKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAnnotation
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypePredicate
  */
  trait TSTypeAnnotationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeReference
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSAnyKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSBigIntKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSBooleanKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNeverKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNullKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSNumberKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSObjectKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSStringKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSSymbolKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUndefinedKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnknownKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSVoidKeyword
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSThisType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSArrayType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSLiteralType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIntersectionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConditionalType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSInferType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSParenthesizedType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSFunctionType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructorType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSMappedType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTupleType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSRestType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSOptionalType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexedAccessType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeOperator
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeQuery
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportType
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeLiteral
  */
  trait TSTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
    - typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareOpaqueType
  */
  trait TypeAliasKind extends js.Object
  
  type AnyTypeAnnotationKind = AnyTypeAnnotation
  type ArrayExpressionKind = ArrayExpression
  type ArrayPatternKind = ArrayPattern
  type ArrayTypeAnnotationKind = ArrayTypeAnnotation
  type ArrowFunctionExpressionKind = ArrowFunctionExpression
  type AssignmentExpressionKind = AssignmentExpression
  type AssignmentPatternKind = AssignmentPattern
  type AwaitExpressionKind = AwaitExpression
  type BigIntLiteralKind = BigIntLiteral
  type BinaryExpressionKind = BinaryExpression
  type BindExpressionKind = BindExpression
  type BlockKind = Block
  type BlockStatementKind = BlockStatement
  type BooleanLiteralKind = BooleanLiteral
  type BooleanLiteralTypeAnnotationKind = BooleanLiteralTypeAnnotation
  type BooleanTypeAnnotationKind = BooleanTypeAnnotation
  type BreakStatementKind = BreakStatement
  type CatchClauseKind = CatchClause
  type ClassBodyKind = ClassBody
  type ClassDeclarationKind = ClassDeclaration
  type ClassExpressionKind = ClassExpression
  type ClassImplementsKind = ClassImplements
  type ClassMethodKind = ClassMethod
  type ClassPrivateMethodKind = ClassPrivateMethod
  type ClassPrivatePropertyKind = ClassPrivateProperty
  type ClassPropertyDefinitionKind = ClassPropertyDefinition
  type CommentBlockKind = CommentBlock
  type CommentLineKind = CommentLine
  type ComprehensionBlockKind = ComprehensionBlock
  type ComprehensionExpressionKind = ComprehensionExpression
  type ConditionalExpressionKind = ConditionalExpression
  type ContinueStatementKind = ContinueStatement
  type DebuggerStatementKind = DebuggerStatement
  type DeclareClassKind = DeclareClass
  type DeclareExportAllDeclarationKind = DeclareExportAllDeclaration
  type DeclareExportDeclarationKind = DeclareExportDeclaration
  type DeclareFunctionKind = DeclareFunction
  type DeclareInterfaceKind = DeclareInterface
  type DeclareModuleExportsKind = DeclareModuleExports
  type DeclareModuleKind = DeclareModule
  type DeclareOpaqueTypeKind = DeclareOpaqueType
  type DeclareTypeAliasKind = DeclareTypeAlias
  type DeclareVariableKind = DeclareVariable
  type DeclaredPredicateKind = DeclaredPredicate
  type DecoratorKind = Decorator
  type DirectiveKind = Directive
  type DirectiveLiteralKind = DirectiveLiteral
  type DoExpressionKind = DoExpression
  type DoWhileStatementKind = DoWhileStatement
  type EmptyStatementKind = EmptyStatement
  type EmptyTypeAnnotationKind = EmptyTypeAnnotation
  type ExistentialTypeParamKind = ExistentialTypeParam
  type ExistsTypeAnnotationKind = ExistsTypeAnnotation
  type ExportAllDeclarationKind = ExportAllDeclaration
  type ExportBatchSpecifierKind = ExportBatchSpecifier
  type ExportDeclarationKind = ExportDeclaration
  type ExportDefaultDeclarationKind = ExportDefaultDeclaration
  type ExportDefaultSpecifierKind = ExportDefaultSpecifier
  type ExportNamedDeclarationKind = ExportNamedDeclaration
  type ExportNamespaceSpecifierKind = ExportNamespaceSpecifier
  type ExportSpecifierKind = ExportSpecifier
  type ExpressionStatementKind = ExpressionStatement
  type FileKind = File
  type ForAwaitStatementKind = ForAwaitStatement
  type ForInStatementKind = ForInStatement
  type ForOfStatementKind = ForOfStatement
  type ForStatementKind = ForStatement
  type FunctionDeclarationKind = FunctionDeclaration
  type FunctionExpressionKind = FunctionExpression
  type FunctionTypeAnnotationKind = FunctionTypeAnnotation
  type FunctionTypeParamKind = FunctionTypeParam
  type GeneratorExpressionKind = GeneratorExpression
  type GenericTypeAnnotationKind = GenericTypeAnnotation
  type IfStatementKind = IfStatement
  type ImportDeclarationKind = ImportDeclaration
  type ImportDefaultSpecifierKind = ImportDefaultSpecifier
  type ImportKind = Import
  type ImportNamespaceSpecifierKind = ImportNamespaceSpecifier
  type ImportSpecifierKind = ImportSpecifier
  type InferredPredicateKind = InferredPredicate
  type InterfaceExtendsKind = InterfaceExtends
  type InterfaceTypeAnnotationKind = InterfaceTypeAnnotation
  type InterpreterDirectiveKind = InterpreterDirective
  type IntersectionTypeAnnotationKind = IntersectionTypeAnnotation
  type JSXAttributeKind = JSXAttribute
  type JSXClosingElementKind = JSXClosingElement
  type JSXClosingFragmentKind = JSXClosingFragment
  type JSXElementKind = JSXElement
  type JSXEmptyExpressionKind = JSXEmptyExpression
  type JSXExpressionContainerKind = JSXExpressionContainer
  type JSXFragmentKind = JSXFragment
  type JSXIdentifierKind = JSXIdentifier
  type JSXMemberExpressionKind = JSXMemberExpression
  type JSXNamespacedNameKind = JSXNamespacedName
  type JSXOpeningElementKind = JSXOpeningElement
  type JSXOpeningFragmentKind = JSXOpeningFragment
  type JSXSpreadAttributeKind = JSXSpreadAttribute
  type JSXSpreadChildKind = JSXSpreadChild
  type JSXTextKind = JSXText
  type LabeledStatementKind = LabeledStatement
  type LineKind = Line
  type LogicalExpressionKind = LogicalExpression
  type MemberTypeAnnotationKind = MemberTypeAnnotation
  type MetaPropertyKind = MetaProperty
  type MethodDefinitionKind = MethodDefinition
  type MixedTypeAnnotationKind = MixedTypeAnnotation
  type NewExpressionKind = NewExpression
  type NoopKind = Noop
  type NullLiteralKind = NullLiteral
  type NullLiteralTypeAnnotationKind = NullLiteralTypeAnnotation
  type NullTypeAnnotationKind = NullTypeAnnotation
  type NullableTypeAnnotationKind = NullableTypeAnnotation
  type NumberLiteralTypeAnnotationKind = NumberLiteralTypeAnnotation
  type NumberTypeAnnotationKind = NumberTypeAnnotation
  type NumericLiteralKind = NumericLiteral
  type NumericLiteralTypeAnnotationKind = NumericLiteralTypeAnnotation
  type ObjectExpressionKind = ObjectExpression
  type ObjectMethodKind = ObjectMethod
  type ObjectPatternKind = ObjectPattern
  type ObjectPropertyKind = ObjectProperty
  type ObjectTypeAnnotationKind = ObjectTypeAnnotation
  type ObjectTypeCallPropertyKind = ObjectTypeCallProperty
  type ObjectTypeIndexerKind = ObjectTypeIndexer
  type ObjectTypeInternalSlotKind = ObjectTypeInternalSlot
  type ObjectTypePropertyKind = ObjectTypeProperty
  type ObjectTypeSpreadPropertyKind = ObjectTypeSpreadProperty
  type OpaqueTypeKind = OpaqueType
  type OptionalCallExpressionKind = OptionalCallExpression
  type OptionalMemberExpressionKind = OptionalMemberExpression
  type ParenthesizedExpressionKind = ParenthesizedExpression
  type PositionKind = Position
  type PrivateNameKind = PrivateName
  type ProgramKind = Program
  type PropertyKind = Property
  type PropertyPatternKind = PropertyPattern
  type QualifiedTypeIdentifierKind = QualifiedTypeIdentifier
  type RegExpLiteralKind = RegExpLiteral
  type RestElementKind = RestElement
  type RestPropertyKind = RestProperty
  type ReturnStatementKind = ReturnStatement
  type SequenceExpressionKind = SequenceExpression
  type SourceLocationKind = SourceLocation
  type SpreadElementKind = SpreadElement
  type SpreadElementPatternKind = SpreadElementPattern
  type SpreadPropertyKind = SpreadProperty
  type SpreadPropertyPatternKind = SpreadPropertyPattern
  type StringLiteralKind = StringLiteral
  type StringLiteralTypeAnnotationKind = StringLiteralTypeAnnotation
  type StringTypeAnnotationKind = StringTypeAnnotation
  type SuperKind = Super
  type SwitchCaseKind = SwitchCase
  type SwitchStatementKind = SwitchStatement
  type TSAnyKeywordKind = TSAnyKeyword
  type TSArrayTypeKind = TSArrayType
  type TSAsExpressionKind = TSAsExpression
  type TSBigIntKeywordKind = TSBigIntKeyword
  type TSBooleanKeywordKind = TSBooleanKeyword
  type TSCallSignatureDeclarationKind = TSCallSignatureDeclaration
  type TSConditionalTypeKind = TSConditionalType
  type TSConstructSignatureDeclarationKind = TSConstructSignatureDeclaration
  type TSConstructorTypeKind = TSConstructorType
  type TSDeclareFunctionKind = TSDeclareFunction
  type TSDeclareMethodKind = TSDeclareMethod
  type TSEnumDeclarationKind = TSEnumDeclaration
  type TSEnumMemberKind = TSEnumMember
  type TSExportAssignmentKind = TSExportAssignment
  type TSExpressionWithTypeArgumentsKind = TSExpressionWithTypeArguments
  type TSExternalModuleReferenceKind = TSExternalModuleReference
  type TSFunctionTypeKind = TSFunctionType
  type TSImportEqualsDeclarationKind = TSImportEqualsDeclaration
  type TSImportTypeKind = TSImportType
  type TSIndexSignatureKind = TSIndexSignature
  type TSIndexedAccessTypeKind = TSIndexedAccessType
  type TSInferTypeKind = TSInferType
  type TSInterfaceBodyKind = TSInterfaceBody
  type TSInterfaceDeclarationKind = TSInterfaceDeclaration
  type TSIntersectionTypeKind = TSIntersectionType
  type TSLiteralTypeKind = TSLiteralType
  type TSMappedTypeKind = TSMappedType
  type TSMethodSignatureKind = TSMethodSignature
  type TSModuleBlockKind = TSModuleBlock
  type TSModuleDeclarationKind = TSModuleDeclaration
  type TSNamespaceExportDeclarationKind = TSNamespaceExportDeclaration
  type TSNeverKeywordKind = TSNeverKeyword
  type TSNonNullExpressionKind = TSNonNullExpression
  type TSNullKeywordKind = TSNullKeyword
  type TSNumberKeywordKind = TSNumberKeyword
  type TSObjectKeywordKind = TSObjectKeyword
  type TSOptionalTypeKind = TSOptionalType
  type TSParameterPropertyKind = TSParameterProperty
  type TSParenthesizedTypeKind = TSParenthesizedType
  type TSPropertySignatureKind = TSPropertySignature
  type TSQualifiedNameKind = TSQualifiedName
  type TSRestTypeKind = TSRestType
  type TSStringKeywordKind = TSStringKeyword
  type TSSymbolKeywordKind = TSSymbolKeyword
  type TSThisTypeKind = TSThisType
  type TSTupleTypeKind = TSTupleType
  type TSTypeAliasDeclarationKind = TSTypeAliasDeclaration
  type TSTypeAssertionKind = TSTypeAssertion
  type TSTypeLiteralKind = TSTypeLiteral
  type TSTypeOperatorKind = TSTypeOperator
  type TSTypeParameterDeclarationKind = TSTypeParameterDeclaration
  type TSTypeParameterInstantiationKind = TSTypeParameterInstantiation
  type TSTypeParameterKind = TSTypeParameter
  type TSTypePredicateKind = TSTypePredicate
  type TSTypeQueryKind = TSTypeQuery
  type TSTypeReferenceKind = TSTypeReference
  type TSUndefinedKeywordKind = TSUndefinedKeyword
  type TSUnionTypeKind = TSUnionType
  type TSUnknownKeywordKind = TSUnknownKeyword
  type TSVoidKeywordKind = TSVoidKeyword
  type TaggedTemplateExpressionKind = TaggedTemplateExpression
  type TemplateElementKind = TemplateElement
  type TemplateLiteralKind = TemplateLiteral
  type ThisExpressionKind = ThisExpression
  type ThisTypeAnnotationKind = ThisTypeAnnotation
  type ThrowStatementKind = ThrowStatement
  type TryStatementKind = TryStatement
  type TupleTypeAnnotationKind = TupleTypeAnnotation
  type TypeAnnotationKind = TypeAnnotation
  type TypeCastExpressionKind = TypeCastExpression
  type TypeParameterDeclarationKind = TypeParameterDeclaration
  type TypeParameterInstantiationKind = TypeParameterInstantiation
  type TypeParameterKind = TypeParameter
  type TypeofTypeAnnotationKind = TypeofTypeAnnotation
  type UnaryExpressionKind = UnaryExpression
  type UnionTypeAnnotationKind = UnionTypeAnnotation
  type UpdateExpressionKind = UpdateExpression
  type VariableDeclarationKind = VariableDeclaration
  type VariableDeclaratorKind = VariableDeclarator
  type VarianceKind = Variance
  type VoidTypeAnnotationKind = VoidTypeAnnotation
  type WhileStatementKind = WhileStatement
  type WithStatementKind = WithStatement
  type YieldExpressionKind = YieldExpression
}

