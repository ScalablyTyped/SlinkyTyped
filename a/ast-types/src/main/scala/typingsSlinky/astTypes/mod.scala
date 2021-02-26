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

object mod {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(builders, builtInTypes, defineMethod, eachField, finalize, getBuilderName, getFieldNames, getFieldValue, getSupertypeNames, NodePath, Path, PathVisitor, someField, Type, use, visit) */ object astNodesAreEquivalent {
    
    @JSImport("ast-types", "astNodesAreEquivalent")
    @js.native
    def apply(a: js.Any, b: js.Any): Boolean = js.native
    @JSImport("ast-types", "astNodesAreEquivalent")
    @js.native
    def apply(a: js.Any, b: js.Any, problemPath: js.Any): Boolean = js.native
    
    @JSImport("ast-types", "astNodesAreEquivalent.assert")
    @js.native
    def assert(a: js.Any, b: js.Any): Unit = js.native
  }
  
  object namedTypes {
    
    @JSImport("ast-types", "namedTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ast-types", "namedTypes.AnyTypeAnnotation")
    @js.native
    def AnyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation] = js.native
    @scala.inline
    def AnyTypeAnnotation_=(x: Type[AnyTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrayExpression")
    @js.native
    def ArrayExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression] = js.native
    @scala.inline
    def ArrayExpression_=(x: Type[ArrayExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrayPattern")
    @js.native
    def ArrayPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern] = js.native
    @scala.inline
    def ArrayPattern_=(x: Type[ArrayPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrayTypeAnnotation")
    @js.native
    def ArrayTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation] = js.native
    @scala.inline
    def ArrayTypeAnnotation_=(x: Type[ArrayTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrowFunctionExpression")
    @js.native
    def ArrowFunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression] = js.native
    @scala.inline
    def ArrowFunctionExpression_=(x: Type[ArrowFunctionExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.AssignmentExpression")
    @js.native
    def AssignmentExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression] = js.native
    @scala.inline
    def AssignmentExpression_=(x: Type[AssignmentExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.AssignmentPattern")
    @js.native
    def AssignmentPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern] = js.native
    @scala.inline
    def AssignmentPattern_=(x: Type[AssignmentPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.AwaitExpression")
    @js.native
    def AwaitExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression] = js.native
    @scala.inline
    def AwaitExpression_=(x: Type[AwaitExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BigIntLiteral")
    @js.native
    def BigIntLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.BigIntLiteralTypeAnnotation")
    @js.native
    def BigIntLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation] = js.native
    @scala.inline
    def BigIntLiteralTypeAnnotation_=(x: Type[BigIntLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigIntLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BigIntLiteral_=(x: Type[BigIntLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigIntLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BigIntTypeAnnotation")
    @js.native
    def BigIntTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation] = js.native
    @scala.inline
    def BigIntTypeAnnotation_=(x: Type[BigIntTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigIntTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BinaryExpression")
    @js.native
    def BinaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression] = js.native
    @scala.inline
    def BinaryExpression_=(x: Type[BinaryExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BindExpression")
    @js.native
    def BindExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression] = js.native
    @scala.inline
    def BindExpression_=(x: Type[BindExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BindExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Block")
    @js.native
    def Block: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Block] = js.native
    
    @JSImport("ast-types", "namedTypes.BlockStatement")
    @js.native
    def BlockStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement] = js.native
    @scala.inline
    def BlockStatement_=(x: Type[BlockStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Block_=(x: Type[Block]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Block")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BooleanLiteral")
    @js.native
    def BooleanLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.BooleanLiteralTypeAnnotation")
    @js.native
    def BooleanLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation] = js.native
    @scala.inline
    def BooleanLiteralTypeAnnotation_=(x: Type[BooleanLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BooleanLiteral_=(x: Type[BooleanLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BooleanTypeAnnotation")
    @js.native
    def BooleanTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation] = js.native
    @scala.inline
    def BooleanTypeAnnotation_=(x: Type[BooleanTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BreakStatement")
    @js.native
    def BreakStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement] = js.native
    @scala.inline
    def BreakStatement_=(x: Type[BreakStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.CallExpression")
    @js.native
    def CallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression] = js.native
    @scala.inline
    def CallExpression_=(x: Type[CallExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.CatchClause")
    @js.native
    def CatchClause: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause] = js.native
    @scala.inline
    def CatchClause_=(x: Type[CatchClause]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ChainElement")
    @js.native
    def ChainElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainElement] = js.native
    @scala.inline
    def ChainElement_=(x: Type[ChainElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChainElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ChainExpression")
    @js.native
    def ChainExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression] = js.native
    @scala.inline
    def ChainExpression_=(x: Type[ChainExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChainExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassBody")
    @js.native
    def ClassBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody] = js.native
    @scala.inline
    def ClassBody_=(x: Type[ClassBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassDeclaration")
    @js.native
    def ClassDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration] = js.native
    @scala.inline
    def ClassDeclaration_=(x: Type[ClassDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassExpression")
    @js.native
    def ClassExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression] = js.native
    @scala.inline
    def ClassExpression_=(x: Type[ClassExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassImplements")
    @js.native
    def ClassImplements: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements] = js.native
    @scala.inline
    def ClassImplements_=(x: Type[ClassImplements]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassImplements")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassMethod")
    @js.native
    def ClassMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod] = js.native
    @scala.inline
    def ClassMethod_=(x: Type[ClassMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassPrivateMethod")
    @js.native
    def ClassPrivateMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod] = js.native
    @scala.inline
    def ClassPrivateMethod_=(x: Type[ClassPrivateMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassPrivateMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassPrivateProperty")
    @js.native
    def ClassPrivateProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty] = js.native
    @scala.inline
    def ClassPrivateProperty_=(x: Type[ClassPrivateProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassPrivateProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassProperty")
    @js.native
    def ClassProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty] = js.native
    
    @JSImport("ast-types", "namedTypes.ClassPropertyDefinition")
    @js.native
    def ClassPropertyDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition] = js.native
    @scala.inline
    def ClassPropertyDefinition_=(x: Type[ClassPropertyDefinition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassPropertyDefinition")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ClassProperty_=(x: Type[ClassProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Comment")
    @js.native
    def Comment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Comment] = js.native
    
    @JSImport("ast-types", "namedTypes.CommentBlock")
    @js.native
    def CommentBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock] = js.native
    @scala.inline
    def CommentBlock_=(x: Type[CommentBlock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CommentBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.CommentLine")
    @js.native
    def CommentLine: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine] = js.native
    @scala.inline
    def CommentLine_=(x: Type[CommentLine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CommentLine")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Comment_=(x: Type[Comment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Comment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ComprehensionBlock")
    @js.native
    def ComprehensionBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock] = js.native
    @scala.inline
    def ComprehensionBlock_=(x: Type[ComprehensionBlock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ComprehensionBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ComprehensionExpression")
    @js.native
    def ComprehensionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression] = js.native
    @scala.inline
    def ComprehensionExpression_=(x: Type[ComprehensionExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ComprehensionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ConditionalExpression")
    @js.native
    def ConditionalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression] = js.native
    @scala.inline
    def ConditionalExpression_=(x: Type[ConditionalExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ContinueStatement")
    @js.native
    def ContinueStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement] = js.native
    @scala.inline
    def ContinueStatement_=(x: Type[ContinueStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DebuggerStatement")
    @js.native
    def DebuggerStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement] = js.native
    @scala.inline
    def DebuggerStatement_=(x: Type[DebuggerStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Declaration")
    @js.native
    def Declaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Declaration] = js.native
    @scala.inline
    def Declaration_=(x: Type[Declaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Declaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareClass")
    @js.native
    def DeclareClass: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass] = js.native
    @scala.inline
    def DeclareClass_=(x: Type[DeclareClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareExportAllDeclaration")
    @js.native
    def DeclareExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration] = js.native
    @scala.inline
    def DeclareExportAllDeclaration_=(x: Type[DeclareExportAllDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareExportAllDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareExportDeclaration")
    @js.native
    def DeclareExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration] = js.native
    @scala.inline
    def DeclareExportDeclaration_=(x: Type[DeclareExportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareExportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareFunction")
    @js.native
    def DeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction] = js.native
    @scala.inline
    def DeclareFunction_=(x: Type[DeclareFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareInterface")
    @js.native
    def DeclareInterface: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface] = js.native
    @scala.inline
    def DeclareInterface_=(x: Type[DeclareInterface]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareModule")
    @js.native
    def DeclareModule: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule] = js.native
    
    @JSImport("ast-types", "namedTypes.DeclareModuleExports")
    @js.native
    def DeclareModuleExports: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports] = js.native
    @scala.inline
    def DeclareModuleExports_=(x: Type[DeclareModuleExports]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareModuleExports")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DeclareModule_=(x: Type[DeclareModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareOpaqueType")
    @js.native
    def DeclareOpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType] = js.native
    @scala.inline
    def DeclareOpaqueType_=(x: Type[DeclareOpaqueType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareOpaqueType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareTypeAlias")
    @js.native
    def DeclareTypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias] = js.native
    @scala.inline
    def DeclareTypeAlias_=(x: Type[DeclareTypeAlias]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareVariable")
    @js.native
    def DeclareVariable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable] = js.native
    @scala.inline
    def DeclareVariable_=(x: Type[DeclareVariable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclaredPredicate")
    @js.native
    def DeclaredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate] = js.native
    @scala.inline
    def DeclaredPredicate_=(x: Type[DeclaredPredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclaredPredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Decorator")
    @js.native
    def Decorator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator] = js.native
    @scala.inline
    def Decorator_=(x: Type[Decorator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decorator")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Directive")
    @js.native
    def Directive: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive] = js.native
    
    @JSImport("ast-types", "namedTypes.DirectiveLiteral")
    @js.native
    def DirectiveLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral] = js.native
    @scala.inline
    def DirectiveLiteral_=(x: Type[DirectiveLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DirectiveLiteral")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Directive_=(x: Type[Directive]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Directive")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DoExpression")
    @js.native
    def DoExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression] = js.native
    @scala.inline
    def DoExpression_=(x: Type[DoExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DoWhileStatement")
    @js.native
    def DoWhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement] = js.native
    @scala.inline
    def DoWhileStatement_=(x: Type[DoWhileStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EmptyStatement")
    @js.native
    def EmptyStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement] = js.native
    @scala.inline
    def EmptyStatement_=(x: Type[EmptyStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EmptyTypeAnnotation")
    @js.native
    def EmptyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation] = js.native
    @scala.inline
    def EmptyTypeAnnotation_=(x: Type[EmptyTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumBooleanBody")
    @js.native
    def EnumBooleanBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanBody] = js.native
    @scala.inline
    def EnumBooleanBody_=(x: Type[EnumBooleanBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumBooleanBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumBooleanMember")
    @js.native
    def EnumBooleanMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember] = js.native
    @scala.inline
    def EnumBooleanMember_=(x: Type[EnumBooleanMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumBooleanMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumDeclaration")
    @js.native
    def EnumDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration] = js.native
    @scala.inline
    def EnumDeclaration_=(x: Type[EnumDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumDefaultedMember")
    @js.native
    def EnumDefaultedMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember] = js.native
    @scala.inline
    def EnumDefaultedMember_=(x: Type[EnumDefaultedMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumDefaultedMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumNumberBody")
    @js.native
    def EnumNumberBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody] = js.native
    @scala.inline
    def EnumNumberBody_=(x: Type[EnumNumberBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumNumberBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumNumberMember")
    @js.native
    def EnumNumberMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberMember] = js.native
    @scala.inline
    def EnumNumberMember_=(x: Type[EnumNumberMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumNumberMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumStringBody")
    @js.native
    def EnumStringBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody] = js.native
    @scala.inline
    def EnumStringBody_=(x: Type[EnumStringBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumStringBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumStringMember")
    @js.native
    def EnumStringMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember] = js.native
    @scala.inline
    def EnumStringMember_=(x: Type[EnumStringMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumStringMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumSymbolBody")
    @js.native
    def EnumSymbolBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody] = js.native
    @scala.inline
    def EnumSymbolBody_=(x: Type[EnumSymbolBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumSymbolBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExistentialTypeParam")
    @js.native
    def ExistentialTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam] = js.native
    @scala.inline
    def ExistentialTypeParam_=(x: Type[ExistentialTypeParam]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExistentialTypeParam")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExistsTypeAnnotation")
    @js.native
    def ExistsTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation] = js.native
    @scala.inline
    def ExistsTypeAnnotation_=(x: Type[ExistsTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExistsTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportAllDeclaration")
    @js.native
    def ExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration] = js.native
    @scala.inline
    def ExportAllDeclaration_=(x: Type[ExportAllDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportBatchSpecifier")
    @js.native
    def ExportBatchSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier] = js.native
    @scala.inline
    def ExportBatchSpecifier_=(x: Type[ExportBatchSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportBatchSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportDeclaration")
    @js.native
    def ExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration] = js.native
    @scala.inline
    def ExportDeclaration_=(x: Type[ExportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportDefaultDeclaration")
    @js.native
    def ExportDefaultDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration] = js.native
    @scala.inline
    def ExportDefaultDeclaration_=(x: Type[ExportDefaultDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportDefaultSpecifier")
    @js.native
    def ExportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier] = js.native
    @scala.inline
    def ExportDefaultSpecifier_=(x: Type[ExportDefaultSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportNamedDeclaration")
    @js.native
    def ExportNamedDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration] = js.native
    @scala.inline
    def ExportNamedDeclaration_=(x: Type[ExportNamedDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportNamespaceSpecifier")
    @js.native
    def ExportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier] = js.native
    @scala.inline
    def ExportNamespaceSpecifier_=(x: Type[ExportNamespaceSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportSpecifier")
    @js.native
    def ExportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier] = js.native
    @scala.inline
    def ExportSpecifier_=(x: Type[ExportSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Expression")
    @js.native
    def Expression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Expression] = js.native
    
    @JSImport("ast-types", "namedTypes.ExpressionStatement")
    @js.native
    def ExpressionStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement] = js.native
    @scala.inline
    def ExpressionStatement_=(x: Type[ExpressionStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Expression_=(x: Type[Expression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.File")
    @js.native
    def File: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.File] = js.native
    @scala.inline
    def File_=(x: Type[File]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Flow")
    @js.native
    def Flow: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Flow] = js.native
    
    @JSImport("ast-types", "namedTypes.FlowPredicate")
    @js.native
    def FlowPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowPredicate] = js.native
    @scala.inline
    def FlowPredicate_=(x: Type[FlowPredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlowPredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FlowType")
    @js.native
    def FlowType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowType] = js.native
    @scala.inline
    def FlowType_=(x: Type[FlowType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlowType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Flow_=(x: Type[Flow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Flow")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForAwaitStatement")
    @js.native
    def ForAwaitStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement] = js.native
    @scala.inline
    def ForAwaitStatement_=(x: Type[ForAwaitStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForAwaitStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForInStatement")
    @js.native
    def ForInStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement] = js.native
    @scala.inline
    def ForInStatement_=(x: Type[ForInStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForOfStatement")
    @js.native
    def ForOfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement] = js.native
    @scala.inline
    def ForOfStatement_=(x: Type[ForOfStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForStatement")
    @js.native
    def ForStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement] = js.native
    @scala.inline
    def ForStatement_=(x: Type[ForStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Function")
    @js.native
    def Function: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Function] = js.native
    
    @JSImport("ast-types", "namedTypes.FunctionDeclaration")
    @js.native
    def FunctionDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration] = js.native
    @scala.inline
    def FunctionDeclaration_=(x: Type[FunctionDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FunctionExpression")
    @js.native
    def FunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression] = js.native
    @scala.inline
    def FunctionExpression_=(x: Type[FunctionExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FunctionTypeAnnotation")
    @js.native
    def FunctionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation] = js.native
    @scala.inline
    def FunctionTypeAnnotation_=(x: Type[FunctionTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FunctionTypeParam")
    @js.native
    def FunctionTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam] = js.native
    @scala.inline
    def FunctionTypeParam_=(x: Type[FunctionTypeParam]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeParam")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Function_=(x: Type[Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Function")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.GeneratorExpression")
    @js.native
    def GeneratorExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression] = js.native
    @scala.inline
    def GeneratorExpression_=(x: Type[GeneratorExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeneratorExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.GenericTypeAnnotation")
    @js.native
    def GenericTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation] = js.native
    @scala.inline
    def GenericTypeAnnotation_=(x: Type[GenericTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GenericTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Identifier")
    @js.native
    def Identifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier] = js.native
    @scala.inline
    def Identifier_=(x: Type[Identifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.IfStatement")
    @js.native
    def IfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement] = js.native
    @scala.inline
    def IfStatement_=(x: Type[IfStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Import")
    @js.native
    def Import: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Import] = js.native
    
    @JSImport("ast-types", "namedTypes.ImportDeclaration")
    @js.native
    def ImportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration] = js.native
    @scala.inline
    def ImportDeclaration_=(x: Type[ImportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportDefaultSpecifier")
    @js.native
    def ImportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier] = js.native
    @scala.inline
    def ImportDefaultSpecifier_=(x: Type[ImportDefaultSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportExpression")
    @js.native
    def ImportExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression] = js.native
    @scala.inline
    def ImportExpression_=(x: Type[ImportExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportNamespaceSpecifier")
    @js.native
    def ImportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier] = js.native
    @scala.inline
    def ImportNamespaceSpecifier_=(x: Type[ImportNamespaceSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportSpecifier")
    @js.native
    def ImportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier] = js.native
    @scala.inline
    def ImportSpecifier_=(x: Type[ImportSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Import_=(x: Type[Import]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Import")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InferredPredicate")
    @js.native
    def InferredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate] = js.native
    @scala.inline
    def InferredPredicate_=(x: Type[InferredPredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InferredPredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterfaceDeclaration")
    @js.native
    def InterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration] = js.native
    @scala.inline
    def InterfaceDeclaration_=(x: Type[InterfaceDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterfaceExtends")
    @js.native
    def InterfaceExtends: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends] = js.native
    @scala.inline
    def InterfaceExtends_=(x: Type[InterfaceExtends]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterfaceExtends")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterfaceTypeAnnotation")
    @js.native
    def InterfaceTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation] = js.native
    @scala.inline
    def InterfaceTypeAnnotation_=(x: Type[InterfaceTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterfaceTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterpreterDirective")
    @js.native
    def InterpreterDirective: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective] = js.native
    @scala.inline
    def InterpreterDirective_=(x: Type[InterpreterDirective]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterpreterDirective")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.IntersectionTypeAnnotation")
    @js.native
    def IntersectionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation] = js.native
    @scala.inline
    def IntersectionTypeAnnotation_=(x: Type[IntersectionTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IntersectionTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXAttribute")
    @js.native
    def JSXAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute] = js.native
    @scala.inline
    def JSXAttribute_=(x: Type[JSXAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXClosingElement")
    @js.native
    def JSXClosingElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement] = js.native
    @scala.inline
    def JSXClosingElement_=(x: Type[JSXClosingElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXClosingFragment")
    @js.native
    def JSXClosingFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment] = js.native
    @scala.inline
    def JSXClosingFragment_=(x: Type[JSXClosingFragment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXElement")
    @js.native
    def JSXElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement] = js.native
    @scala.inline
    def JSXElement_=(x: Type[JSXElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXEmptyExpression")
    @js.native
    def JSXEmptyExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression] = js.native
    @scala.inline
    def JSXEmptyExpression_=(x: Type[JSXEmptyExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXEmptyExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXExpressionContainer")
    @js.native
    def JSXExpressionContainer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer] = js.native
    @scala.inline
    def JSXExpressionContainer_=(x: Type[JSXExpressionContainer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXExpressionContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXFragment")
    @js.native
    def JSXFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment] = js.native
    @scala.inline
    def JSXFragment_=(x: Type[JSXFragment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXIdentifier")
    @js.native
    def JSXIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier] = js.native
    @scala.inline
    def JSXIdentifier_=(x: Type[JSXIdentifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXMemberExpression")
    @js.native
    def JSXMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression] = js.native
    @scala.inline
    def JSXMemberExpression_=(x: Type[JSXMemberExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXMemberExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXNamespacedName")
    @js.native
    def JSXNamespacedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName] = js.native
    @scala.inline
    def JSXNamespacedName_=(x: Type[JSXNamespacedName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXNamespacedName")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXOpeningElement")
    @js.native
    def JSXOpeningElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement] = js.native
    @scala.inline
    def JSXOpeningElement_=(x: Type[JSXOpeningElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXOpeningFragment")
    @js.native
    def JSXOpeningFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment] = js.native
    @scala.inline
    def JSXOpeningFragment_=(x: Type[JSXOpeningFragment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXSpreadAttribute")
    @js.native
    def JSXSpreadAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute] = js.native
    @scala.inline
    def JSXSpreadAttribute_=(x: Type[JSXSpreadAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXSpreadChild")
    @js.native
    def JSXSpreadChild: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild] = js.native
    @scala.inline
    def JSXSpreadChild_=(x: Type[JSXSpreadChild]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadChild")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXText")
    @js.native
    def JSXText: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText] = js.native
    @scala.inline
    def JSXText_=(x: Type[JSXText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXText")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.LabeledStatement")
    @js.native
    def LabeledStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement] = js.native
    @scala.inline
    def LabeledStatement_=(x: Type[LabeledStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Line")
    @js.native
    def Line: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Line] = js.native
    @scala.inline
    def Line_=(x: Type[Line]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Literal")
    @js.native
    def Literal: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal] = js.native
    @scala.inline
    def Literal_=(x: Type[Literal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Literal")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.LogicalExpression")
    @js.native
    def LogicalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression] = js.native
    @scala.inline
    def LogicalExpression_=(x: Type[LogicalExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MemberExpression")
    @js.native
    def MemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression] = js.native
    @scala.inline
    def MemberExpression_=(x: Type[MemberExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MemberTypeAnnotation")
    @js.native
    def MemberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation] = js.native
    @scala.inline
    def MemberTypeAnnotation_=(x: Type[MemberTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MemberTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MetaProperty")
    @js.native
    def MetaProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty] = js.native
    @scala.inline
    def MetaProperty_=(x: Type[MetaProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MethodDefinition")
    @js.native
    def MethodDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition] = js.native
    @scala.inline
    def MethodDefinition_=(x: Type[MethodDefinition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MethodDefinition")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MixedTypeAnnotation")
    @js.native
    def MixedTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation] = js.native
    @scala.inline
    def MixedTypeAnnotation_=(x: Type[MixedTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MixedTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ModuleSpecifier")
    @js.native
    def ModuleSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ModuleSpecifier] = js.native
    @scala.inline
    def ModuleSpecifier_=(x: Type[ModuleSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModuleSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NewExpression")
    @js.native
    def NewExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression] = js.native
    @scala.inline
    def NewExpression_=(x: Type[NewExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Node")
    @js.native
    def Node: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Node] = js.native
    @scala.inline
    def Node_=(x: Type[Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Noop")
    @js.native
    def Noop: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop] = js.native
    @scala.inline
    def Noop_=(x: Type[Noop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Noop")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NullLiteral")
    @js.native
    def NullLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.NullLiteralTypeAnnotation")
    @js.native
    def NullLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation] = js.native
    @scala.inline
    def NullLiteralTypeAnnotation_=(x: Type[NullLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NullLiteral_=(x: Type[NullLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NullTypeAnnotation")
    @js.native
    def NullTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation] = js.native
    @scala.inline
    def NullTypeAnnotation_=(x: Type[NullTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NullableTypeAnnotation")
    @js.native
    def NullableTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation] = js.native
    @scala.inline
    def NullableTypeAnnotation_=(x: Type[NullableTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullableTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NumberLiteralTypeAnnotation")
    @js.native
    def NumberLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation] = js.native
    @scala.inline
    def NumberLiteralTypeAnnotation_=(x: Type[NumberLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumberLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NumberTypeAnnotation")
    @js.native
    def NumberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation] = js.native
    @scala.inline
    def NumberTypeAnnotation_=(x: Type[NumberTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumberTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NumericLiteral")
    @js.native
    def NumericLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.NumericLiteralTypeAnnotation")
    @js.native
    def NumericLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation] = js.native
    @scala.inline
    def NumericLiteralTypeAnnotation_=(x: Type[NumericLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NumericLiteral_=(x: Type[NumericLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectExpression")
    @js.native
    def ObjectExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression] = js.native
    @scala.inline
    def ObjectExpression_=(x: Type[ObjectExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectMethod")
    @js.native
    def ObjectMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod] = js.native
    @scala.inline
    def ObjectMethod_=(x: Type[ObjectMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectPattern")
    @js.native
    def ObjectPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern] = js.native
    @scala.inline
    def ObjectPattern_=(x: Type[ObjectPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectProperty")
    @js.native
    def ObjectProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty] = js.native
    @scala.inline
    def ObjectProperty_=(x: Type[ObjectProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeAnnotation")
    @js.native
    def ObjectTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation] = js.native
    @scala.inline
    def ObjectTypeAnnotation_=(x: Type[ObjectTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeCallProperty")
    @js.native
    def ObjectTypeCallProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty] = js.native
    @scala.inline
    def ObjectTypeCallProperty_=(x: Type[ObjectTypeCallProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCallProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeIndexer")
    @js.native
    def ObjectTypeIndexer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer] = js.native
    @scala.inline
    def ObjectTypeIndexer_=(x: Type[ObjectTypeIndexer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeIndexer")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeInternalSlot")
    @js.native
    def ObjectTypeInternalSlot: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot] = js.native
    @scala.inline
    def ObjectTypeInternalSlot_=(x: Type[ObjectTypeInternalSlot]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeInternalSlot")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeProperty")
    @js.native
    def ObjectTypeProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty] = js.native
    @scala.inline
    def ObjectTypeProperty_=(x: Type[ObjectTypeProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeSpreadProperty")
    @js.native
    def ObjectTypeSpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty] = js.native
    @scala.inline
    def ObjectTypeSpreadProperty_=(x: Type[ObjectTypeSpreadProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeSpreadProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.OpaqueType")
    @js.native
    def OpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType] = js.native
    @scala.inline
    def OpaqueType_=(x: Type[OpaqueType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OpaqueType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.OptionalCallExpression")
    @js.native
    def OptionalCallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression] = js.native
    @scala.inline
    def OptionalCallExpression_=(x: Type[OptionalCallExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptionalCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.OptionalMemberExpression")
    @js.native
    def OptionalMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression] = js.native
    @scala.inline
    def OptionalMemberExpression_=(x: Type[OptionalMemberExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptionalMemberExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ParenthesizedExpression")
    @js.native
    def ParenthesizedExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression] = js.native
    @scala.inline
    def ParenthesizedExpression_=(x: Type[ParenthesizedExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParenthesizedExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Pattern")
    @js.native
    def Pattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Pattern] = js.native
    @scala.inline
    def Pattern_=(x: Type[Pattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Position")
    @js.native
    def Position: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Position] = js.native
    @scala.inline
    def Position_=(x: Type[Position]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Position")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Printable")
    @js.native
    def Printable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Printable] = js.native
    @scala.inline
    def Printable_=(x: Type[Printable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Printable")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.PrivateName")
    @js.native
    def PrivateName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName] = js.native
    @scala.inline
    def PrivateName_=(x: Type[PrivateName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrivateName")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Program")
    @js.native
    def Program: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Program] = js.native
    @scala.inline
    def Program_=(x: Type[Program]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Program")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Property")
    @js.native
    def Property: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Property] = js.native
    
    @JSImport("ast-types", "namedTypes.PropertyPattern")
    @js.native
    def PropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern] = js.native
    @scala.inline
    def PropertyPattern_=(x: Type[PropertyPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropertyPattern")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Property_=(x: Type[Property]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Property")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.QualifiedTypeIdentifier")
    @js.native
    def QualifiedTypeIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier] = js.native
    @scala.inline
    def QualifiedTypeIdentifier_=(x: Type[QualifiedTypeIdentifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QualifiedTypeIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.RegExpLiteral")
    @js.native
    def RegExpLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral] = js.native
    @scala.inline
    def RegExpLiteral_=(x: Type[RegExpLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegExpLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.RestElement")
    @js.native
    def RestElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement] = js.native
    @scala.inline
    def RestElement_=(x: Type[RestElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.RestProperty")
    @js.native
    def RestProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty] = js.native
    @scala.inline
    def RestProperty_=(x: Type[RestProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RestProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ReturnStatement")
    @js.native
    def ReturnStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement] = js.native
    @scala.inline
    def ReturnStatement_=(x: Type[ReturnStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SequenceExpression")
    @js.native
    def SequenceExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression] = js.native
    @scala.inline
    def SequenceExpression_=(x: Type[SequenceExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SourceLocation")
    @js.native
    def SourceLocation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SourceLocation] = js.native
    @scala.inline
    def SourceLocation_=(x: Type[SourceLocation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SourceLocation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Specifier")
    @js.native
    def Specifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Specifier] = js.native
    @scala.inline
    def Specifier_=(x: Type[Specifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Specifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SpreadElement")
    @js.native
    def SpreadElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement] = js.native
    
    @JSImport("ast-types", "namedTypes.SpreadElementPattern")
    @js.native
    def SpreadElementPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern] = js.native
    @scala.inline
    def SpreadElementPattern_=(x: Type[SpreadElementPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadElementPattern")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SpreadElement_=(x: Type[SpreadElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SpreadProperty")
    @js.native
    def SpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty] = js.native
    
    @JSImport("ast-types", "namedTypes.SpreadPropertyPattern")
    @js.native
    def SpreadPropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern] = js.native
    @scala.inline
    def SpreadPropertyPattern_=(x: Type[SpreadPropertyPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadPropertyPattern")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SpreadProperty_=(x: Type[SpreadProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Statement")
    @js.native
    def Statement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Statement] = js.native
    @scala.inline
    def Statement_=(x: Type[Statement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Statement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.StringLiteral")
    @js.native
    def StringLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.StringLiteralTypeAnnotation")
    @js.native
    def StringLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation] = js.native
    @scala.inline
    def StringLiteralTypeAnnotation_=(x: Type[StringLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def StringLiteral_=(x: Type[StringLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.StringTypeAnnotation")
    @js.native
    def StringTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation] = js.native
    @scala.inline
    def StringTypeAnnotation_=(x: Type[StringTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Super")
    @js.native
    def Super: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Super] = js.native
    @scala.inline
    def Super_=(x: Type[Super]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Super")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SwitchCase")
    @js.native
    def SwitchCase: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase] = js.native
    @scala.inline
    def SwitchCase_=(x: Type[SwitchCase]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SwitchStatement")
    @js.native
    def SwitchStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement] = js.native
    @scala.inline
    def SwitchStatement_=(x: Type[SwitchStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SymbolTypeAnnotation")
    @js.native
    def SymbolTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation] = js.native
    @scala.inline
    def SymbolTypeAnnotation_=(x: Type[SymbolTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SymbolTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSAnyKeyword")
    @js.native
    def TSAnyKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword] = js.native
    @scala.inline
    def TSAnyKeyword_=(x: Type[TSAnyKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSAnyKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSArrayType")
    @js.native
    def TSArrayType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType] = js.native
    @scala.inline
    def TSArrayType_=(x: Type[TSArrayType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSArrayType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSAsExpression")
    @js.native
    def TSAsExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression] = js.native
    @scala.inline
    def TSAsExpression_=(x: Type[TSAsExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSAsExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSBigIntKeyword")
    @js.native
    def TSBigIntKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword] = js.native
    @scala.inline
    def TSBigIntKeyword_=(x: Type[TSBigIntKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSBigIntKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSBooleanKeyword")
    @js.native
    def TSBooleanKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword] = js.native
    @scala.inline
    def TSBooleanKeyword_=(x: Type[TSBooleanKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSBooleanKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration] = js.native
    @scala.inline
    def TSCallSignatureDeclaration_=(x: Type[TSCallSignatureDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSCallSignatureDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSConditionalType")
    @js.native
    def TSConditionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType] = js.native
    @scala.inline
    def TSConditionalType_=(x: Type[TSConditionalType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSConditionalType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration] = js.native
    @scala.inline
    def TSConstructSignatureDeclaration_=(x: Type[TSConstructSignatureDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSConstructSignatureDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSConstructorType")
    @js.native
    def TSConstructorType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType] = js.native
    @scala.inline
    def TSConstructorType_=(x: Type[TSConstructorType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSConstructorType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSDeclareFunction")
    @js.native
    def TSDeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction] = js.native
    @scala.inline
    def TSDeclareFunction_=(x: Type[TSDeclareFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSDeclareFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSDeclareMethod")
    @js.native
    def TSDeclareMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod] = js.native
    @scala.inline
    def TSDeclareMethod_=(x: Type[TSDeclareMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSDeclareMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSEnumDeclaration")
    @js.native
    def TSEnumDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration] = js.native
    @scala.inline
    def TSEnumDeclaration_=(x: Type[TSEnumDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSEnumDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSEnumMember")
    @js.native
    def TSEnumMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember] = js.native
    @scala.inline
    def TSEnumMember_=(x: Type[TSEnumMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSEnumMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSExportAssignment")
    @js.native
    def TSExportAssignment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment] = js.native
    @scala.inline
    def TSExportAssignment_=(x: Type[TSExportAssignment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSExportAssignment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSExpressionWithTypeArguments")
    @js.native
    def TSExpressionWithTypeArguments: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments] = js.native
    @scala.inline
    def TSExpressionWithTypeArguments_=(x: Type[TSExpressionWithTypeArguments]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSExpressionWithTypeArguments")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSExternalModuleReference")
    @js.native
    def TSExternalModuleReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference] = js.native
    @scala.inline
    def TSExternalModuleReference_=(x: Type[TSExternalModuleReference]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSExternalModuleReference")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSFunctionType")
    @js.native
    def TSFunctionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType] = js.native
    @scala.inline
    def TSFunctionType_=(x: Type[TSFunctionType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSFunctionType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSHasOptionalTypeAnnotation")
    @js.native
    def TSHasOptionalTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation] = js.native
    @scala.inline
    def TSHasOptionalTypeAnnotation_=(x: Type[TSHasOptionalTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSHasOptionalTypeParameterInstantiation")
    @js.native
    def TSHasOptionalTypeParameterInstantiation: Type[
        typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
      ] = js.native
    @scala.inline
    def TSHasOptionalTypeParameterInstantiation_=(x: Type[TSHasOptionalTypeParameterInstantiation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeParameterInstantiation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSHasOptionalTypeParameters")
    @js.native
    def TSHasOptionalTypeParameters: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters] = js.native
    @scala.inline
    def TSHasOptionalTypeParameters_=(x: Type[TSHasOptionalTypeParameters]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeParameters")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSImportEqualsDeclaration")
    @js.native
    def TSImportEqualsDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration] = js.native
    @scala.inline
    def TSImportEqualsDeclaration_=(x: Type[TSImportEqualsDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSImportEqualsDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSImportType")
    @js.native
    def TSImportType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType] = js.native
    @scala.inline
    def TSImportType_=(x: Type[TSImportType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSImportType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSIndexSignature")
    @js.native
    def TSIndexSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature] = js.native
    @scala.inline
    def TSIndexSignature_=(x: Type[TSIndexSignature]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSIndexSignature")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSIndexedAccessType")
    @js.native
    def TSIndexedAccessType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType] = js.native
    @scala.inline
    def TSIndexedAccessType_=(x: Type[TSIndexedAccessType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSIndexedAccessType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSInferType")
    @js.native
    def TSInferType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType] = js.native
    @scala.inline
    def TSInferType_=(x: Type[TSInferType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSInferType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSInterfaceBody")
    @js.native
    def TSInterfaceBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody] = js.native
    @scala.inline
    def TSInterfaceBody_=(x: Type[TSInterfaceBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSInterfaceBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration] = js.native
    @scala.inline
    def TSInterfaceDeclaration_=(x: Type[TSInterfaceDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSInterfaceDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSIntersectionType")
    @js.native
    def TSIntersectionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType] = js.native
    @scala.inline
    def TSIntersectionType_=(x: Type[TSIntersectionType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSIntersectionType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSLiteralType")
    @js.native
    def TSLiteralType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType] = js.native
    @scala.inline
    def TSLiteralType_=(x: Type[TSLiteralType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSLiteralType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSMappedType")
    @js.native
    def TSMappedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType] = js.native
    @scala.inline
    def TSMappedType_=(x: Type[TSMappedType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSMappedType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSMethodSignature")
    @js.native
    def TSMethodSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature] = js.native
    @scala.inline
    def TSMethodSignature_=(x: Type[TSMethodSignature]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSMethodSignature")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSModuleBlock")
    @js.native
    def TSModuleBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock] = js.native
    @scala.inline
    def TSModuleBlock_=(x: Type[TSModuleBlock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSModuleBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSModuleDeclaration")
    @js.native
    def TSModuleDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration] = js.native
    @scala.inline
    def TSModuleDeclaration_=(x: Type[TSModuleDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSModuleDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNamedTupleMember")
    @js.native
    def TSNamedTupleMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember] = js.native
    @scala.inline
    def TSNamedTupleMember_=(x: Type[TSNamedTupleMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNamedTupleMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNamespaceExportDeclaration")
    @js.native
    def TSNamespaceExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration] = js.native
    @scala.inline
    def TSNamespaceExportDeclaration_=(x: Type[TSNamespaceExportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNamespaceExportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNeverKeyword")
    @js.native
    def TSNeverKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword] = js.native
    @scala.inline
    def TSNeverKeyword_=(x: Type[TSNeverKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNeverKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNonNullExpression")
    @js.native
    def TSNonNullExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression] = js.native
    @scala.inline
    def TSNonNullExpression_=(x: Type[TSNonNullExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNonNullExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNullKeyword")
    @js.native
    def TSNullKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword] = js.native
    @scala.inline
    def TSNullKeyword_=(x: Type[TSNullKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNullKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNumberKeyword")
    @js.native
    def TSNumberKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword] = js.native
    @scala.inline
    def TSNumberKeyword_=(x: Type[TSNumberKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNumberKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSObjectKeyword")
    @js.native
    def TSObjectKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword] = js.native
    @scala.inline
    def TSObjectKeyword_=(x: Type[TSObjectKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSObjectKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSOptionalType")
    @js.native
    def TSOptionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType] = js.native
    @scala.inline
    def TSOptionalType_=(x: Type[TSOptionalType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSOptionalType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSParameterProperty")
    @js.native
    def TSParameterProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty] = js.native
    @scala.inline
    def TSParameterProperty_=(x: Type[TSParameterProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSParameterProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSParenthesizedType")
    @js.native
    def TSParenthesizedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType] = js.native
    @scala.inline
    def TSParenthesizedType_=(x: Type[TSParenthesizedType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSParenthesizedType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSPropertySignature")
    @js.native
    def TSPropertySignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature] = js.native
    @scala.inline
    def TSPropertySignature_=(x: Type[TSPropertySignature]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSPropertySignature")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSQualifiedName")
    @js.native
    def TSQualifiedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName] = js.native
    @scala.inline
    def TSQualifiedName_=(x: Type[TSQualifiedName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSQualifiedName")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSRestType")
    @js.native
    def TSRestType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType] = js.native
    @scala.inline
    def TSRestType_=(x: Type[TSRestType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSRestType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSStringKeyword")
    @js.native
    def TSStringKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword] = js.native
    @scala.inline
    def TSStringKeyword_=(x: Type[TSStringKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSStringKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSSymbolKeyword")
    @js.native
    def TSSymbolKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword] = js.native
    @scala.inline
    def TSSymbolKeyword_=(x: Type[TSSymbolKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSSymbolKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSThisType")
    @js.native
    def TSThisType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType] = js.native
    @scala.inline
    def TSThisType_=(x: Type[TSThisType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSThisType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTupleType")
    @js.native
    def TSTupleType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType] = js.native
    @scala.inline
    def TSTupleType_=(x: Type[TSTupleType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTupleType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSType")
    @js.native
    def TSType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSType] = js.native
    
    @JSImport("ast-types", "namedTypes.TSTypeAliasDeclaration")
    @js.native
    def TSTypeAliasDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration] = js.native
    @scala.inline
    def TSTypeAliasDeclaration_=(x: Type[TSTypeAliasDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAliasDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeAnnotation")
    @js.native
    def TSTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation] = js.native
    @scala.inline
    def TSTypeAnnotation_=(x: Type[TSTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeAssertion")
    @js.native
    def TSTypeAssertion: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion] = js.native
    @scala.inline
    def TSTypeAssertion_=(x: Type[TSTypeAssertion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAssertion")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeLiteral")
    @js.native
    def TSTypeLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral] = js.native
    @scala.inline
    def TSTypeLiteral_=(x: Type[TSTypeLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeOperator")
    @js.native
    def TSTypeOperator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator] = js.native
    @scala.inline
    def TSTypeOperator_=(x: Type[TSTypeOperator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeParameter")
    @js.native
    def TSTypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter] = js.native
    
    @JSImport("ast-types", "namedTypes.TSTypeParameterDeclaration")
    @js.native
    def TSTypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration] = js.native
    @scala.inline
    def TSTypeParameterDeclaration_=(x: Type[TSTypeParameterDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameterDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeParameterInstantiation")
    @js.native
    def TSTypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation] = js.native
    @scala.inline
    def TSTypeParameterInstantiation_=(x: Type[TSTypeParameterInstantiation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameterInstantiation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TSTypeParameter_=(x: Type[TSTypeParameter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameter")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypePredicate")
    @js.native
    def TSTypePredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate] = js.native
    @scala.inline
    def TSTypePredicate_=(x: Type[TSTypePredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypePredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeQuery")
    @js.native
    def TSTypeQuery: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery] = js.native
    @scala.inline
    def TSTypeQuery_=(x: Type[TSTypeQuery]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeQuery")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeReference")
    @js.native
    def TSTypeReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference] = js.native
    @scala.inline
    def TSTypeReference_=(x: Type[TSTypeReference]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeReference")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TSType_=(x: Type[TSType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSUndefinedKeyword")
    @js.native
    def TSUndefinedKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword] = js.native
    @scala.inline
    def TSUndefinedKeyword_=(x: Type[TSUndefinedKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSUndefinedKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSUnionType")
    @js.native
    def TSUnionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType] = js.native
    @scala.inline
    def TSUnionType_=(x: Type[TSUnionType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSUnionType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSUnknownKeyword")
    @js.native
    def TSUnknownKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword] = js.native
    @scala.inline
    def TSUnknownKeyword_=(x: Type[TSUnknownKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSUnknownKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSVoidKeyword")
    @js.native
    def TSVoidKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword] = js.native
    @scala.inline
    def TSVoidKeyword_=(x: Type[TSVoidKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSVoidKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TaggedTemplateExpression")
    @js.native
    def TaggedTemplateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression] = js.native
    @scala.inline
    def TaggedTemplateExpression_=(x: Type[TaggedTemplateExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TemplateElement")
    @js.native
    def TemplateElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement] = js.native
    @scala.inline
    def TemplateElement_=(x: Type[TemplateElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TemplateLiteral")
    @js.native
    def TemplateLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral] = js.native
    @scala.inline
    def TemplateLiteral_=(x: Type[TemplateLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ThisExpression")
    @js.native
    def ThisExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression] = js.native
    @scala.inline
    def ThisExpression_=(x: Type[ThisExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ThisTypeAnnotation")
    @js.native
    def ThisTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation] = js.native
    @scala.inline
    def ThisTypeAnnotation_=(x: Type[ThisTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThisTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ThrowStatement")
    @js.native
    def ThrowStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement] = js.native
    @scala.inline
    def ThrowStatement_=(x: Type[ThrowStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TryStatement")
    @js.native
    def TryStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement] = js.native
    @scala.inline
    def TryStatement_=(x: Type[TryStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TupleTypeAnnotation")
    @js.native
    def TupleTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation] = js.native
    @scala.inline
    def TupleTypeAnnotation_=(x: Type[TupleTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TupleTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeAlias")
    @js.native
    def TypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias] = js.native
    @scala.inline
    def TypeAlias_=(x: Type[TypeAlias]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeAnnotation")
    @js.native
    def TypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation] = js.native
    @scala.inline
    def TypeAnnotation_=(x: Type[TypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeCastExpression")
    @js.native
    def TypeCastExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression] = js.native
    @scala.inline
    def TypeCastExpression_=(x: Type[TypeCastExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeCastExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeParameter")
    @js.native
    def TypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter] = js.native
    
    @JSImport("ast-types", "namedTypes.TypeParameterDeclaration")
    @js.native
    def TypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration] = js.native
    @scala.inline
    def TypeParameterDeclaration_=(x: Type[TypeParameterDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeParameterInstantiation")
    @js.native
    def TypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation] = js.native
    @scala.inline
    def TypeParameterInstantiation_=(x: Type[TypeParameterInstantiation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterInstantiation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TypeParameter_=(x: Type[TypeParameter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeParameter")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeofTypeAnnotation")
    @js.native
    def TypeofTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation] = js.native
    @scala.inline
    def TypeofTypeAnnotation_=(x: Type[TypeofTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeofTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.UnaryExpression")
    @js.native
    def UnaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression] = js.native
    @scala.inline
    def UnaryExpression_=(x: Type[UnaryExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.UnionTypeAnnotation")
    @js.native
    def UnionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation] = js.native
    @scala.inline
    def UnionTypeAnnotation_=(x: Type[UnionTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.UpdateExpression")
    @js.native
    def UpdateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression] = js.native
    @scala.inline
    def UpdateExpression_=(x: Type[UpdateExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.VariableDeclaration")
    @js.native
    def VariableDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration] = js.native
    @scala.inline
    def VariableDeclaration_=(x: Type[VariableDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.VariableDeclarator")
    @js.native
    def VariableDeclarator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator] = js.native
    @scala.inline
    def VariableDeclarator_=(x: Type[VariableDeclarator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Variance")
    @js.native
    def Variance: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance] = js.native
    @scala.inline
    def Variance_=(x: Type[Variance]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variance")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.VoidTypeAnnotation")
    @js.native
    def VoidTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation] = js.native
    @scala.inline
    def VoidTypeAnnotation_=(x: Type[VoidTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VoidTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.WhileStatement")
    @js.native
    def WhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement] = js.native
    @scala.inline
    def WhileStatement_=(x: Type[WhileStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.WithStatement")
    @js.native
    def WithStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement] = js.native
    @scala.inline
    def WithStatement_=(x: Type[WithStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.YieldExpression")
    @js.native
    def YieldExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression] = js.native
    @scala.inline
    def YieldExpression_=(x: Type[YieldExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(x.asInstanceOf[js.Any])
  }
}
