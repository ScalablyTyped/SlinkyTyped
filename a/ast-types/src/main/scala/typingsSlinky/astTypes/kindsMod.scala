package typingsSlinky.astTypes

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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.File
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Import
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Position
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ast-types/gen/kinds", JSImport.Namespace)
@js.native
object kindsMod extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  */
  trait CallExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  */
  trait ChainElementKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
  */
  trait ClassPropertyKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Block
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine
  */
  trait CommentKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait DeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Import
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
  */
  trait ExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowPredicateKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
  */
  trait FlowTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
  */
  trait FunctionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  */
  trait IdentifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
  */
  trait InterfaceDeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
  */
  trait LiteralKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  */
  trait MemberExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
  */
  trait ModuleSpecifierKind extends js.Object
  
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
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
  */
  trait NodeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
  */
  trait OpaqueTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty
  */
  trait PatternKind extends js.Object
  
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Block
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
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
  */
  trait PrintableKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
  */
  trait SpecifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait StatementKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  */
  trait TSHasOptionalTypeAnnotationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
  */
  trait TSHasOptionalTypeParameterInstantiationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait TSHasOptionalTypeParametersKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
  */
  trait TSTypeAnnotationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
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
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
  */
  trait TSTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
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
  
  type BigIntLiteralTypeAnnotationKind = BigIntLiteralTypeAnnotation
  
  type BigIntTypeAnnotationKind = BigIntTypeAnnotation
  
  type BinaryExpressionKind = BinaryExpression
  
  type BindExpressionKind = BindExpression
  
  type BlockKind = Block
  
  type BlockStatementKind = BlockStatement
  
  type BooleanLiteralKind = BooleanLiteral
  
  type BooleanLiteralTypeAnnotationKind = BooleanLiteralTypeAnnotation
  
  type BooleanTypeAnnotationKind = BooleanTypeAnnotation
  
  type BreakStatementKind = BreakStatement
  
  type CatchClauseKind = CatchClause
  
  type ChainExpressionKind = ChainExpression
  
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
  
  type EnumBooleanBodyKind = EnumBooleanBody
  
  type EnumBooleanMemberKind = EnumBooleanMember
  
  type EnumDeclarationKind = EnumDeclaration
  
  type EnumDefaultedMemberKind = EnumDefaultedMember
  
  type EnumNumberBodyKind = EnumNumberBody
  
  type EnumNumberMemberKind = EnumNumberMember
  
  type EnumStringBodyKind = EnumStringBody
  
  type EnumStringMemberKind = EnumStringMember
  
  type EnumSymbolBodyKind = EnumSymbolBody
  
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
  
  type ImportExpressionKind = ImportExpression
  
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
  
  type SymbolTypeAnnotationKind = SymbolTypeAnnotation
  
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
  
  type TSNamedTupleMemberKind = TSNamedTupleMember
  
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
