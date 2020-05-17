package typingsSlinky.astTypes.kindsMod

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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
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
trait PrintableKind extends js.Object

object PrintableKind {
  @scala.inline
  implicit def apply(value: AnyTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ArrayExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ArrayPattern): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ArrayTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: AssignmentExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: AssignmentPattern): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: AwaitExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BigIntLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BinaryExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BindExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Block): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BlockStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BooleanLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BooleanLiteralTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BooleanTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: BreakStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: CallExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: CatchClause): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassBody): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassImplements): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassMethod): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassPrivateProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ClassPropertyDefinition): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: CommentBlock): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: CommentLine): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ComprehensionBlock): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ComprehensionExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ConditionalExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ContinueStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DebuggerStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareClass): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareExportAllDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareExportDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareFunction): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareInterface): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareModule): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareModuleExports): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareOpaqueType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareTypeAlias): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclareVariable): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DeclaredPredicate): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Decorator): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Directive): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DirectiveLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DoExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: DoWhileStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: EmptyStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: EmptyTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExistentialTypeParam): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExistsTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportAllDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportBatchSpecifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportDefaultDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportDefaultSpecifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportNamedDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportNamespaceSpecifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExportSpecifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ExpressionStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: File): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ForAwaitStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ForInStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ForOfStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ForStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: FunctionExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: FunctionTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: FunctionTypeParam): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: GeneratorExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: GenericTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Identifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: IfStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Import): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ImportDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ImportDefaultSpecifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ImportNamespaceSpecifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ImportSpecifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: InferredPredicate): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: InterfaceDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: InterfaceExtends): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: InterfaceTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: InterpreterDirective): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: IntersectionTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXAttribute): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXClosingElement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXClosingFragment): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXElement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXEmptyExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXExpressionContainer): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXFragment): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXIdentifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXMemberExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXNamespacedName): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXOpeningElement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXOpeningFragment): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXSpreadAttribute): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXSpreadChild): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: JSXText): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: LabeledStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Line): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Literal): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: LogicalExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: MemberExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: MemberTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: MetaProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: MethodDefinition): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: MixedTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NewExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Noop): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NullLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NullLiteralTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NullTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NullableTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NumberLiteralTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NumberTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NumericLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: NumericLiteralTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectMethod): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectPattern): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectTypeCallProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectTypeIndexer): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectTypeInternalSlot): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectTypeProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ObjectTypeSpreadProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: OpaqueType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: OptionalCallExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: OptionalMemberExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ParenthesizedExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: PrivateName): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Program): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Property): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: PropertyPattern): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: QualifiedTypeIdentifier): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: RegExpLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: RestElement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: RestProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ReturnStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: SequenceExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: SpreadElement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: SpreadElementPattern): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: SpreadProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: SpreadPropertyPattern): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: StringLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: StringLiteralTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: StringTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Super): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: SwitchCase): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: SwitchStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSAnyKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSArrayType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSAsExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSBigIntKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSBooleanKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSCallSignatureDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSConditionalType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSConstructSignatureDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSConstructorType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSDeclareFunction): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSDeclareMethod): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSEnumDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSEnumMember): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSExportAssignment): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSExpressionWithTypeArguments): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSExternalModuleReference): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSFunctionType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSImportEqualsDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSImportType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSIndexSignature): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSIndexedAccessType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSInferType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSInterfaceBody): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSInterfaceDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSIntersectionType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSLiteralType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSMappedType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSMethodSignature): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSModuleBlock): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSModuleDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSNamespaceExportDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSNeverKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSNonNullExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSNullKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSNumberKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSObjectKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSOptionalType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSParameterProperty): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSParenthesizedType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSPropertySignature): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSQualifiedName): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSRestType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSStringKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSSymbolKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSThisType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTupleType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeAliasDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeAssertion): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeOperator): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeParameter): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeParameterDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeParameterInstantiation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypePredicate): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeQuery): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSTypeReference): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSUndefinedKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSUnionType): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSUnknownKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TSVoidKeyword): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TaggedTemplateExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TemplateElement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TemplateLiteral): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ThisExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ThisTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: ThrowStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TryStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TupleTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TypeAlias): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TypeCastExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TypeParameter): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TypeParameterDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TypeParameterInstantiation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: TypeofTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: UnaryExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: UnionTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: UpdateExpression): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: VariableDeclaration): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: VariableDeclarator): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: Variance): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: VoidTypeAnnotation): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: WhileStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: WithStatement): PrintableKind = value.asInstanceOf[PrintableKind]
  @scala.inline
  implicit def apply(value: YieldExpression): PrintableKind = value.asInstanceOf[PrintableKind]
}

