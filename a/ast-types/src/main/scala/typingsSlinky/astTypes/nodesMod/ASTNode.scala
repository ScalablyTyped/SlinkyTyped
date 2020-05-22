package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.anon.Cooked
import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.anon.Parenthesized
import typingsSlinky.astTypes.anon.RawRawValue
import typingsSlinky.astTypes.anon.RawString
import typingsSlinky.astTypes.astTypesBooleans.`false`
import typingsSlinky.astTypes.astTypesStrings.Ampersand
import typingsSlinky.astTypes.astTypesStrings.AmpersandAmpersand
import typingsSlinky.astTypes.astTypesStrings.AmpersandEqualssign
import typingsSlinky.astTypes.astTypesStrings.Asterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskEqualssign
import typingsSlinky.astTypes.astTypesStrings.Equalssign
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Exclamationmark
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Greaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Lessthansign
import typingsSlinky.astTypes.astTypesStrings.LessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Percentsign
import typingsSlinky.astTypes.astTypesStrings.PercentsignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.PlussignEqualssign
import typingsSlinky.astTypes.astTypesStrings.PlussignPlussign
import typingsSlinky.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.astTypes.astTypesStrings.Slash
import typingsSlinky.astTypes.astTypesStrings.SlashEqualssign
import typingsSlinky.astTypes.astTypesStrings.Tilde
import typingsSlinky.astTypes.astTypesStrings.Verticalline
import typingsSlinky.astTypes.astTypesStrings.VerticallineEqualssign
import typingsSlinky.astTypes.astTypesStrings.VerticallineVerticalline
import typingsSlinky.astTypes.astTypesStrings.^
import typingsSlinky.astTypes.astTypesStrings.`--`
import typingsSlinky.astTypes.astTypesStrings.`-Equalssign`
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.`^Equalssign`
import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.`type`
import typingsSlinky.astTypes.astTypesStrings.`var`
import typingsSlinky.astTypes.astTypesStrings.const
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.delete
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.in
import typingsSlinky.astTypes.astTypesStrings.init
import typingsSlinky.astTypes.astTypesStrings.instanceof
import typingsSlinky.astTypes.astTypesStrings.let
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.value
import typingsSlinky.astTypes.astTypesStrings.void
import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.AssignmentPatternKind
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.BooleanLiteralKind
import typingsSlinky.astTypes.kindsMod.CatchClauseKind
import typingsSlinky.astTypes.kindsMod.ClassBodyKind
import typingsSlinky.astTypes.kindsMod.ClassImplementsKind
import typingsSlinky.astTypes.kindsMod.ClassMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivateMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivatePropertyKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.DeclareClassKind
import typingsSlinky.astTypes.kindsMod.DeclareFunctionKind
import typingsSlinky.astTypes.kindsMod.DeclareVariableKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
import typingsSlinky.astTypes.kindsMod.DirectiveKind
import typingsSlinky.astTypes.kindsMod.DirectiveLiteralKind
import typingsSlinky.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.FunctionKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeParamKind
import typingsSlinky.astTypes.kindsMod.GenericTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ImportDefaultSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportSpecifierKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.InterpreterDirectiveKind
import typingsSlinky.astTypes.kindsMod.JSXAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXClosingElementKind
import typingsSlinky.astTypes.kindsMod.JSXClosingFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningElementKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.MemberTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.MethodDefinitionKind
import typingsSlinky.astTypes.kindsMod.NoopKind
import typingsSlinky.astTypes.kindsMod.NumericLiteralKind
import typingsSlinky.astTypes.kindsMod.ObjectMethodKind
import typingsSlinky.astTypes.kindsMod.ObjectPatternKind
import typingsSlinky.astTypes.kindsMod.ObjectPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typingsSlinky.astTypes.kindsMod.ObjectTypePropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrivateNameKind
import typingsSlinky.astTypes.kindsMod.ProgramKind
import typingsSlinky.astTypes.kindsMod.PropertyKind
import typingsSlinky.astTypes.kindsMod.PropertyPatternKind
import typingsSlinky.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.kindsMod.RestPropertyKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyPatternKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.SwitchCaseKind
import typingsSlinky.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSDeclareMethodKind
import typingsSlinky.astTypes.kindsMod.TSEnumMemberKind
import typingsSlinky.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typingsSlinky.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsSlinky.astTypes.kindsMod.TSImportTypeKind
import typingsSlinky.astTypes.kindsMod.TSIndexSignatureKind
import typingsSlinky.astTypes.kindsMod.TSInterfaceBodyKind
import typingsSlinky.astTypes.kindsMod.TSMethodSignatureKind
import typingsSlinky.astTypes.kindsMod.TSModuleBlockKind
import typingsSlinky.astTypes.kindsMod.TSModuleDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSPropertySignatureKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSThisTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.kindsMod.TemplateElementKind
import typingsSlinky.astTypes.kindsMod.TemplateLiteralKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterKind
import typingsSlinky.astTypes.kindsMod.UnaryExpressionKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.nodesMod.File
  - typingsSlinky.astTypes.nodesMod.Program
  - typingsSlinky.astTypes.nodesMod.Identifier
  - typingsSlinky.astTypes.nodesMod.BlockStatement
  - typingsSlinky.astTypes.nodesMod.EmptyStatement
  - typingsSlinky.astTypes.nodesMod.ExpressionStatement
  - typingsSlinky.astTypes.nodesMod.IfStatement
  - typingsSlinky.astTypes.nodesMod.LabeledStatement
  - typingsSlinky.astTypes.nodesMod.BreakStatement
  - typingsSlinky.astTypes.nodesMod.ContinueStatement
  - typingsSlinky.astTypes.nodesMod.WithStatement
  - typingsSlinky.astTypes.nodesMod.SwitchStatement
  - typingsSlinky.astTypes.nodesMod.SwitchCase
  - typingsSlinky.astTypes.nodesMod.ReturnStatement
  - typingsSlinky.astTypes.nodesMod.ThrowStatement
  - typingsSlinky.astTypes.nodesMod.TryStatement
  - typingsSlinky.astTypes.nodesMod.CatchClause
  - typingsSlinky.astTypes.nodesMod.WhileStatement
  - typingsSlinky.astTypes.nodesMod.DoWhileStatement
  - typingsSlinky.astTypes.nodesMod.ForStatement
  - typingsSlinky.astTypes.nodesMod.VariableDeclaration
  - typingsSlinky.astTypes.nodesMod.ForInStatement
  - typingsSlinky.astTypes.nodesMod.DebuggerStatement
  - typingsSlinky.astTypes.nodesMod.FunctionDeclaration
  - typingsSlinky.astTypes.nodesMod.FunctionExpression
  - typingsSlinky.astTypes.nodesMod.VariableDeclarator
  - typingsSlinky.astTypes.nodesMod.ThisExpression
  - typingsSlinky.astTypes.nodesMod.ArrayExpression
  - typingsSlinky.astTypes.nodesMod.ObjectExpression
  - typingsSlinky.astTypes.nodesMod.Property
  - typingsSlinky.astTypes.nodesMod.Literal
  - typingsSlinky.astTypes.nodesMod.SequenceExpression
  - typingsSlinky.astTypes.nodesMod.UnaryExpression
  - typingsSlinky.astTypes.nodesMod.BinaryExpression
  - typingsSlinky.astTypes.nodesMod.AssignmentExpression
  - typingsSlinky.astTypes.nodesMod.MemberExpression
  - typingsSlinky.astTypes.nodesMod.UpdateExpression
  - typingsSlinky.astTypes.nodesMod.LogicalExpression
  - typingsSlinky.astTypes.nodesMod.ConditionalExpression
  - typingsSlinky.astTypes.nodesMod.NewExpression
  - typingsSlinky.astTypes.nodesMod.CallExpression
  - typingsSlinky.astTypes.nodesMod.RestElement
  - typingsSlinky.astTypes.nodesMod.TypeAnnotation
  - typingsSlinky.astTypes.nodesMod.TSTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.SpreadElementPattern
  - typingsSlinky.astTypes.nodesMod.ArrowFunctionExpression
  - typingsSlinky.astTypes.nodesMod.ForOfStatement
  - typingsSlinky.astTypes.nodesMod.YieldExpression
  - typingsSlinky.astTypes.nodesMod.GeneratorExpression
  - typingsSlinky.astTypes.nodesMod.ComprehensionBlock
  - typingsSlinky.astTypes.nodesMod.ComprehensionExpression
  - typingsSlinky.astTypes.nodesMod.ObjectProperty
  - typingsSlinky.astTypes.nodesMod.PropertyPattern
  - typingsSlinky.astTypes.nodesMod.ObjectPattern
  - typingsSlinky.astTypes.nodesMod.ArrayPattern
  - typingsSlinky.astTypes.nodesMod.MethodDefinition
  - typingsSlinky.astTypes.nodesMod.SpreadElement
  - typingsSlinky.astTypes.nodesMod.AssignmentPattern
  - typingsSlinky.astTypes.nodesMod.ClassPropertyDefinition
  - typingsSlinky.astTypes.nodesMod.ClassProperty
  - typingsSlinky.astTypes.nodesMod.ClassBody
  - typingsSlinky.astTypes.nodesMod.ClassDeclaration
  - typingsSlinky.astTypes.nodesMod.ClassExpression
  - typingsSlinky.astTypes.nodesMod.ImportSpecifier
  - typingsSlinky.astTypes.nodesMod.ImportNamespaceSpecifier
  - typingsSlinky.astTypes.nodesMod.ImportDefaultSpecifier
  - typingsSlinky.astTypes.nodesMod.ImportDeclaration
  - typingsSlinky.astTypes.nodesMod.TaggedTemplateExpression
  - typingsSlinky.astTypes.nodesMod.TemplateLiteral
  - typingsSlinky.astTypes.nodesMod.TemplateElement
  - typingsSlinky.astTypes.nodesMod.SpreadProperty
  - typingsSlinky.astTypes.nodesMod.SpreadPropertyPattern
  - typingsSlinky.astTypes.nodesMod.AwaitExpression
  - typingsSlinky.astTypes.nodesMod.JSXAttribute
  - typingsSlinky.astTypes.nodesMod.JSXIdentifier
  - typingsSlinky.astTypes.nodesMod.JSXNamespacedName
  - typingsSlinky.astTypes.nodesMod.JSXExpressionContainer
  - typingsSlinky.astTypes.nodesMod.JSXMemberExpression
  - typingsSlinky.astTypes.nodesMod.JSXSpreadAttribute
  - typingsSlinky.astTypes.nodesMod.JSXElement
  - typingsSlinky.astTypes.nodesMod.JSXOpeningElement
  - typingsSlinky.astTypes.nodesMod.JSXClosingElement
  - typingsSlinky.astTypes.nodesMod.JSXFragment
  - typingsSlinky.astTypes.nodesMod.JSXText
  - typingsSlinky.astTypes.nodesMod.JSXOpeningFragment
  - typingsSlinky.astTypes.nodesMod.JSXClosingFragment
  - typingsSlinky.astTypes.nodesMod.JSXEmptyExpression
  - typingsSlinky.astTypes.nodesMod.JSXSpreadChild
  - typingsSlinky.astTypes.nodesMod.TypeParameterDeclaration
  - typingsSlinky.astTypes.nodesMod.TSTypeParameterDeclaration
  - typingsSlinky.astTypes.nodesMod.TypeParameterInstantiation
  - typingsSlinky.astTypes.nodesMod.TSTypeParameterInstantiation
  - typingsSlinky.astTypes.nodesMod.ClassImplements
  - typingsSlinky.astTypes.nodesMod.TSExpressionWithTypeArguments
  - typingsSlinky.astTypes.nodesMod.AnyTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.EmptyTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.MixedTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.VoidTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NumberTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NumberLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NumericLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.StringTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.StringLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.BooleanTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.BooleanLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NullableTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NullLiteralTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.NullTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ThisTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ExistsTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ExistentialTypeParam
  - typingsSlinky.astTypes.nodesMod.FunctionTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.FunctionTypeParam
  - typingsSlinky.astTypes.nodesMod.ArrayTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ObjectTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.ObjectTypeProperty
  - typingsSlinky.astTypes.nodesMod.ObjectTypeSpreadProperty
  - typingsSlinky.astTypes.nodesMod.ObjectTypeIndexer
  - typingsSlinky.astTypes.nodesMod.ObjectTypeCallProperty
  - typingsSlinky.astTypes.nodesMod.ObjectTypeInternalSlot
  - typingsSlinky.astTypes.nodesMod.Variance
  - typingsSlinky.astTypes.nodesMod.QualifiedTypeIdentifier
  - typingsSlinky.astTypes.nodesMod.GenericTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.MemberTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.UnionTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.IntersectionTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.TypeofTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.TypeParameter
  - typingsSlinky.astTypes.nodesMod.InterfaceTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.InterfaceExtends
  - typingsSlinky.astTypes.nodesMod.InterfaceDeclaration
  - typingsSlinky.astTypes.nodesMod.DeclareInterface
  - typingsSlinky.astTypes.nodesMod.TypeAlias
  - typingsSlinky.astTypes.nodesMod.OpaqueType
  - typingsSlinky.astTypes.nodesMod.DeclareTypeAlias
  - typingsSlinky.astTypes.nodesMod.DeclareOpaqueType
  - typingsSlinky.astTypes.nodesMod.TypeCastExpression
  - typingsSlinky.astTypes.nodesMod.TupleTypeAnnotation
  - typingsSlinky.astTypes.nodesMod.DeclareVariable
  - typingsSlinky.astTypes.nodesMod.DeclareFunction
  - typingsSlinky.astTypes.nodesMod.DeclareClass
  - typingsSlinky.astTypes.nodesMod.DeclareModule
  - typingsSlinky.astTypes.nodesMod.DeclareModuleExports
  - typingsSlinky.astTypes.nodesMod.DeclareExportDeclaration
  - typingsSlinky.astTypes.nodesMod.ExportSpecifier
  - typingsSlinky.astTypes.nodesMod.ExportBatchSpecifier
  - typingsSlinky.astTypes.nodesMod.DeclareExportAllDeclaration
  - typingsSlinky.astTypes.nodesMod.InferredPredicate
  - typingsSlinky.astTypes.nodesMod.DeclaredPredicate
  - typingsSlinky.astTypes.nodesMod.ExportDeclaration
  - typingsSlinky.astTypes.nodesMod.Block
  - typingsSlinky.astTypes.nodesMod.Line
  - typingsSlinky.astTypes.nodesMod.Noop
  - typingsSlinky.astTypes.nodesMod.DoExpression
  - typingsSlinky.astTypes.nodesMod.Super
  - typingsSlinky.astTypes.nodesMod.BindExpression
  - typingsSlinky.astTypes.nodesMod.Decorator
  - typingsSlinky.astTypes.nodesMod.MetaProperty
  - typingsSlinky.astTypes.nodesMod.ParenthesizedExpression
  - typingsSlinky.astTypes.nodesMod.ExportDefaultDeclaration
  - typingsSlinky.astTypes.nodesMod.ExportNamedDeclaration
  - typingsSlinky.astTypes.nodesMod.ExportNamespaceSpecifier
  - typingsSlinky.astTypes.nodesMod.ExportDefaultSpecifier
  - typingsSlinky.astTypes.nodesMod.ExportAllDeclaration
  - typingsSlinky.astTypes.nodesMod.CommentBlock
  - typingsSlinky.astTypes.nodesMod.CommentLine
  - typingsSlinky.astTypes.nodesMod.Directive
  - typingsSlinky.astTypes.nodesMod.DirectiveLiteral
  - typingsSlinky.astTypes.nodesMod.InterpreterDirective
  - typingsSlinky.astTypes.nodesMod.StringLiteral
  - typingsSlinky.astTypes.nodesMod.NumericLiteral
  - typingsSlinky.astTypes.nodesMod.BigIntLiteral
  - typingsSlinky.astTypes.nodesMod.NullLiteral
  - typingsSlinky.astTypes.nodesMod.BooleanLiteral
  - typingsSlinky.astTypes.nodesMod.RegExpLiteral
  - typingsSlinky.astTypes.nodesMod.ObjectMethod
  - typingsSlinky.astTypes.nodesMod.ClassPrivateProperty
  - typingsSlinky.astTypes.nodesMod.ClassMethod
  - typingsSlinky.astTypes.nodesMod.ClassPrivateMethod
  - typingsSlinky.astTypes.nodesMod.PrivateName
  - typingsSlinky.astTypes.nodesMod.RestProperty
  - typingsSlinky.astTypes.nodesMod.ForAwaitStatement
  - typingsSlinky.astTypes.nodesMod.Import
  - typingsSlinky.astTypes.nodesMod.TSQualifiedName
  - typingsSlinky.astTypes.nodesMod.TSTypeReference
  - typingsSlinky.astTypes.nodesMod.TSAsExpression
  - typingsSlinky.astTypes.nodesMod.TSNonNullExpression
  - typingsSlinky.astTypes.nodesMod.TSAnyKeyword
  - typingsSlinky.astTypes.nodesMod.TSBigIntKeyword
  - typingsSlinky.astTypes.nodesMod.TSBooleanKeyword
  - typingsSlinky.astTypes.nodesMod.TSNeverKeyword
  - typingsSlinky.astTypes.nodesMod.TSNullKeyword
  - typingsSlinky.astTypes.nodesMod.TSNumberKeyword
  - typingsSlinky.astTypes.nodesMod.TSObjectKeyword
  - typingsSlinky.astTypes.nodesMod.TSStringKeyword
  - typingsSlinky.astTypes.nodesMod.TSSymbolKeyword
  - typingsSlinky.astTypes.nodesMod.TSUndefinedKeyword
  - typingsSlinky.astTypes.nodesMod.TSUnknownKeyword
  - typingsSlinky.astTypes.nodesMod.TSVoidKeyword
  - typingsSlinky.astTypes.nodesMod.TSThisType
  - typingsSlinky.astTypes.nodesMod.TSArrayType
  - typingsSlinky.astTypes.nodesMod.TSLiteralType
  - typingsSlinky.astTypes.nodesMod.TSUnionType
  - typingsSlinky.astTypes.nodesMod.TSIntersectionType
  - typingsSlinky.astTypes.nodesMod.TSConditionalType
  - typingsSlinky.astTypes.nodesMod.TSInferType
  - typingsSlinky.astTypes.nodesMod.TSTypeParameter
  - typingsSlinky.astTypes.nodesMod.TSParenthesizedType
  - typingsSlinky.astTypes.nodesMod.TSFunctionType
  - typingsSlinky.astTypes.nodesMod.TSConstructorType
  - typingsSlinky.astTypes.nodesMod.TSDeclareFunction
  - typingsSlinky.astTypes.nodesMod.TSDeclareMethod
  - typingsSlinky.astTypes.nodesMod.TSMappedType
  - typingsSlinky.astTypes.nodesMod.TSTupleType
  - typingsSlinky.astTypes.nodesMod.TSRestType
  - typingsSlinky.astTypes.nodesMod.TSOptionalType
  - typingsSlinky.astTypes.nodesMod.TSIndexedAccessType
  - typingsSlinky.astTypes.nodesMod.TSTypeOperator
  - typingsSlinky.astTypes.nodesMod.TSIndexSignature
  - typingsSlinky.astTypes.nodesMod.TSPropertySignature
  - typingsSlinky.astTypes.nodesMod.TSMethodSignature
  - typingsSlinky.astTypes.nodesMod.TSTypePredicate
  - typingsSlinky.astTypes.nodesMod.TSCallSignatureDeclaration
  - typingsSlinky.astTypes.nodesMod.TSConstructSignatureDeclaration
  - typingsSlinky.astTypes.nodesMod.TSEnumMember
  - typingsSlinky.astTypes.nodesMod.TSTypeQuery
  - typingsSlinky.astTypes.nodesMod.TSImportType
  - typingsSlinky.astTypes.nodesMod.TSTypeLiteral
  - typingsSlinky.astTypes.nodesMod.TSTypeAssertion
  - typingsSlinky.astTypes.nodesMod.TSEnumDeclaration
  - typingsSlinky.astTypes.nodesMod.TSTypeAliasDeclaration
  - typingsSlinky.astTypes.nodesMod.TSModuleBlock
  - typingsSlinky.astTypes.nodesMod.TSModuleDeclaration
  - typingsSlinky.astTypes.nodesMod.TSImportEqualsDeclaration
  - typingsSlinky.astTypes.nodesMod.TSExternalModuleReference
  - typingsSlinky.astTypes.nodesMod.TSExportAssignment
  - typingsSlinky.astTypes.nodesMod.TSNamespaceExportDeclaration
  - typingsSlinky.astTypes.nodesMod.TSInterfaceBody
  - typingsSlinky.astTypes.nodesMod.TSInterfaceDeclaration
  - typingsSlinky.astTypes.nodesMod.TSParameterProperty
  - typingsSlinky.astTypes.nodesMod.OptionalMemberExpression
  - typingsSlinky.astTypes.nodesMod.OptionalCallExpression
*/
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  def TSTupleType(
    elementTypes: js.Array[TSTypeKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTupleType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAnnotation,
    typeAnnotation: TSTypeKind | TSTypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXOpeningElement(
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    selfClosing: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXOpeningElement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ForStatement(
    body: StatementKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ForStatement,
    comments: js.Array[CommentKind] = null,
    init: VariableDeclarationKind | ExpressionKind = null,
    loc: SourceLocationKind = null,
    test: ExpressionKind = null,
    update: ExpressionKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSBigIntKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSBigIntKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DoWhileStatement(
    body: StatementKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DoWhileStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeOperator(
    operator: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSUnknownKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSUnknownKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def IfStatement(
    consequent: StatementKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.IfStatement,
    alternate: StatementKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], alternate = alternate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSInterfaceBody(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSInterfaceBody,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassExpression(
    body: ClassBodyKind,
    implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassExpression,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSLiteralType(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSLiteralType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NumberLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumberLiteralTypeAnnotation,
    value: Double,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSConditionalType(
    checkType: TSTypeKind,
    extendsType: TSTypeKind,
    falseType: TSTypeKind,
    trueType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConditionalType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[ExpressionKind],
    quasis: js.Array[TemplateElementKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TemplateLiteral,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ThisTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.ThisTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXText(
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXText,
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NullLiteral(
    `type`: typingsSlinky.astTypes.astTypesStrings.NullLiteral,
    value: Null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ComprehensionBlock(
    each: Boolean,
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionBlock,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(each = each.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ForInStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ForInStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareVariable(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareVariable,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSVoidKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSVoidKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ContinueStatement(
    `type`: typingsSlinky.astTypes.astTypesStrings.ContinueStatement,
    comments: js.Array[CommentKind] = null,
    label: IdentifierKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeIndexer(
    id: IdentifierKind,
    key: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeIndexer,
    value: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    variance: VarianceKind | plus | minus = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def CatchClause(
    body: BlockStatementKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.CatchClause,
    comments: js.Array[CommentKind] = null,
    guard: ExpressionKind = null,
    loc: SourceLocationKind = null,
    param: PatternKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], guard = guard.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXAttribute(
    name: JSXIdentifierKind | JSXNamespacedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXAttribute,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    value: LiteralKind | JSXExpressionContainerKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NullTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.NullTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BlockStatement(
    body: js.Array[StatementKind],
    directives: js.Array[DirectiveKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.BlockStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXClosingFragment(
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXClosingFragment,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSUnionType(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSUnionType,
    types: js.Array[TSTypeKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectPattern,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSParenthesizedType(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSParenthesizedType,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXOpeningFragment(
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXOpeningFragment,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def File(
    program: ProgramKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.File,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    name: String = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UnionTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.UnionTypeAnnotation,
    types: js.Array[FlowTypeKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSBooleanKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSBooleanKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def CommentBlock(
    leading: Boolean,
    trailing: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.CommentBlock,
    value: String,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SpreadElementPattern(
    argument: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.SpreadElementPattern,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSIntersectionType(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIntersectionType,
    types: js.Array[TSTypeKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: DeclarationKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportDefaultDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def MemberTypeAnnotation(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MemberTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSParameterProperty(
    parameter: IdentifierKind | AssignmentPatternKind,
    readonly: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSParameterProperty,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Import(
    `type`: typingsSlinky.astTypes.astTypesStrings.Import,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def YieldExpression(
    delegate: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.YieldExpression,
    argument: ExpressionKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSPropertySignature(
    computed: Boolean,
    key: ExpressionKind,
    optional: Boolean,
    readonly: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSPropertySignature,
    comments: js.Array[CommentKind] = null,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def RegExpLiteral(
    flags: String,
    pattern: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.RegExpLiteral,
    value: js.RegExp,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SwitchCase(
    consequent: js.Array[StatementKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.SwitchCase,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    test: ExpressionKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSDeclareFunction(
    async: Boolean,
    declare: Boolean,
    generator: Boolean,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSDeclareFunction,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableDeclaration(
    declarations: js.Array[VariableDeclaratorKind | IdentifierKind],
    kind: `var` | let | const,
    `type`: typingsSlinky.astTypes.astTypesStrings.VariableDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportDeclaration(
    default: Boolean,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportDeclaration,
    comments: js.Array[CommentKind] = null,
    declaration: DeclarationKind | ExpressionKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXNamespacedName(
    name: JSXIdentifierKind,
    namespace: JSXIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXNamespacedName,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def CallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.CallExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSNullKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSNullKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StringLiteral(
    `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteral,
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConstructSignatureDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def QualifiedTypeIdentifier(
    id: IdentifierKind,
    qualification: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.QualifiedTypeIdentifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSExportAssignment(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSExportAssignment,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSIndexSignature(
    parameters: js.Array[IdentifierKind],
    readonly: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexSignature,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BinaryExpression(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.BinaryExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXExpressionContainer(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXExpressionContainer,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InferredPredicate(
    `type`: typingsSlinky.astTypes.astTypesStrings.InferredPredicate,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def OpaqueType(
    id: IdentifierKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OpaqueType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], supertype = supertype.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BigIntLiteral(
    extra: RawString,
    `type`: typingsSlinky.astTypes.astTypesStrings.BigIntLiteral,
    value: String | Double,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSNeverKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSNeverKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeProperty(
    key: LiteralKind | IdentifierKind,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeProperty,
    value: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    variance: VarianceKind | plus | minus = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DoExpression(
    body: js.Array[StatementKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.DoExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassPrivateProperty(
    computed: Boolean,
    key: PrivateNameKind,
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateProperty,
    access: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null,
    value: ExpressionKind = null,
    variance: VarianceKind | plus | minus = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeLiteral,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def OptionalMemberExpression(
    computed: Boolean,
    `object`: ExpressionKind,
    optional: Boolean,
    property: IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OptionalMemberExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeInternalSlot(
    id: IdentifierKind,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeInternalSlot,
    value: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UpdateExpression(
    argument: ExpressionKind,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.UpdateExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassImplements(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassImplements,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    typeParameters: TypeParameterInstantiationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSEnumMember(
    id: IdentifierKind | StringLiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSEnumMember,
    comments: js.Array[CommentKind] = null,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Property(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.Property,
    value: ExpressionKind | PatternKind,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SpreadProperty(
    argument: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.SpreadProperty,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSStringKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSStringKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def PropertyPattern(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    pattern: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.PropertyPattern,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSExternalModuleReference(
    expression: StringLiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSExternalModuleReference,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NumberTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.NumberTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ParenthesizedExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ParenthesizedExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DebuggerStatement(
    `type`: typingsSlinky.astTypes.astTypesStrings.DebuggerStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportAllDeclaration(
    source: LiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportAllDeclaration,
    comments: js.Array[CommentKind] = null,
    exported: IdentifierKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeParameter(
    name: String,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter,
    comments: js.Array[CommentKind] = null,
    constraint: TSTypeKind = null,
    default: TSTypeKind = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ThisExpression(
    `type`: typingsSlinky.astTypes.astTypesStrings.ThisExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeAliasDeclaration(
    declare: Boolean,
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def MethodDefinition(
    computed: Boolean,
    key: ExpressionKind,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.MethodDefinition,
    value: FunctionKind,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportDefaultSpecifier(
    exported: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportDefaultSpecifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def GeneratorExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.GeneratorExpression,
    comments: js.Array[CommentKind] = null,
    filter: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def MixedTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.MixedTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSNamespaceExportDeclaration(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSNamespaceExportDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Line(
    leading: Boolean,
    trailing: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.Line,
    value: String,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeAnnotation(
    callProperties: js.Array[ObjectTypeCallPropertyKind],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexerKind],
    internalSlots: js.Array[ObjectTypeInternalSlotKind],
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    inexact: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact.get.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXClosingElement(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXClosingElement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def LogicalExpression(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.LogicalExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NumericLiteral(
    extra: RawRawValue,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteral,
    value: Double,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    raw: String = null,
    regex: Flags = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BooleanLiteral(
    `type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteral,
    value: Boolean,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ImportDefaultSpecifier(
    `type`: typingsSlinky.astTypes.astTypesStrings.ImportDefaultSpecifier,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    local: IdentifierKind = null,
    name: IdentifierKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ArrowFunctionExpression(
    async: Boolean,
    body: BlockStatementKind | ExpressionKind,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: `false`,
    id: Null,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrowFunctionExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXEmptyExpression(
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXEmptyExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionExpression(
    async: Boolean,
    body: BlockStatementKind,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: Boolean,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionExpression,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareExportAllDeclaration(
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportAllDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSExpressionWithTypeArguments(
    expression: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSExpressionWithTypeArguments,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeParameterInstantiation(
    params: js.Array[TSTypeKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameterInstantiation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BooleanTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.BooleanTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportBatchSpecifier(
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportBatchSpecifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionTypeParam(
    name: IdentifierKind,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def PrivateName(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.PrivateName,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AnyTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.AnyTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NumericLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteralTypeAnnotation,
    value: Double,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def CommentLine(
    leading: Boolean,
    trailing: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.CommentLine,
    value: String,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassPrivateMethod(
    async: Boolean,
    body: BlockStatementKind,
    computed: Boolean,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: Boolean,
    key: PrivateNameKind,
    kind: get | set | method | constructor,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateMethod,
    `abstract`: Boolean = null.asInstanceOf[Boolean],
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    static: Boolean = null.asInstanceOf[Boolean],
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], access = access.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NewExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.NewExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeReference(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeReference,
    typeName: IdentifierKind | TSQualifiedNameKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssignmentPattern(
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentPattern,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSIndexedAccessType(
    indexType: TSTypeKind,
    objectType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexedAccessType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssignmentExpression(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Super(
    `type`: typingsSlinky.astTypes.astTypesStrings.Super,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Identifier(
    name: String,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.Identifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Decorator(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.Decorator,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSThisType(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSThisType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ConditionalExpression(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ConditionalExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypePredicate(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate,
    typeAnnotation: TSTypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def MetaProperty(
    meta: IdentifierKind,
    property: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MetaProperty,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeSpreadProperty(
    argument: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeSpreadProperty,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSAnyKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSAnyKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UnaryExpression(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.UnaryExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeParameterDeclaration(
    params: js.Array[TSTypeParameterKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameterDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Program(
    body: js.Array[StatementKind],
    directives: js.Array[DirectiveKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.Program,
    comments: js.Array[CommentKind] = null,
    interpreter: InterpreterDirectiveKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], interpreter = interpreter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSInferType(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSInferType,
    typeParameter: TSTypeParameterKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeQuery(
    exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeQuery,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassDeclaration(
    body: ClassBodyKind,
    implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassDeclaration,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ImportSpecifier(
    imported: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ImportSpecifier,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    local: IdentifierKind = null,
    name: IdentifierKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ArrayTypeAnnotation(
    elementType: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrayTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSImportEqualsDeclaration(
    id: IdentifierKind,
    isExport: Boolean,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSImportEqualsDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSNumberKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSNumberKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def WithStatement(
    body: StatementKind,
    `object`: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.WithStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Noop(
    `type`: typingsSlinky.astTypes.astTypesStrings.Noop,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ForOfStatement(
    body: StatementKind,
    left: VariableDeclarationKind | PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ForOfStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteralKind,
    tag: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TaggedTemplateExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclaredPredicate(
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclaredPredicate,
    value: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ThrowStatement(
    argument: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ThrowStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TryStatement(
    block: BlockStatementKind,
    guardedHandlers: js.Array[CatchClauseKind],
    handlers: js.Array[CatchClauseKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TryStatement,
    comments: js.Array[CommentKind] = null,
    finalizer: BlockStatementKind = null,
    handler: CatchClauseKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], guardedHandlers = guardedHandlers.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], finalizer = finalizer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareModuleExports(
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareModuleExports,
    typeAnnotation: TypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TypeParameterDeclaration(
    params: js.Array[TypeParameterKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameterDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TypeAlias(
    id: IdentifierKind,
    right: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeAlias,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ImportNamespaceSpecifier(
    `type`: typingsSlinky.astTypes.astTypesStrings.ImportNamespaceSpecifier,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    local: IdentifierKind = null,
    name: IdentifierKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MemberExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NullableTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.NullableTypeAnnotation,
    typeAnnotation: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSUndefinedKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSUndefinedKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSModuleDeclaration(
    declare: Boolean,
    global: Boolean,
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSModuleDeclaration,
    body: TSModuleBlockKind | TSModuleDeclarationKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportNamespaceSpecifier(
    exported: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportNamespaceSpecifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def IntersectionTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.IntersectionTypeAnnotation,
    types: js.Array[FlowTypeKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXSpreadAttribute(
    argument: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXSpreadAttribute,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareClass(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareClass,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSTypeAssertion(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    extra: Parenthesized = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassPropertyDefinition(
    definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassPropertyDefinition,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSObjectKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSObjectKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ArrayExpression(
    elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrayExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSNonNullExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSNonNullExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InterfaceDeclaration(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def RestProperty(
    argument: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.RestProperty,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXSpreadChild(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXSpreadChild,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCaseKind],
    discriminant: ExpressionKind,
    lexical: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.SwitchStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], lexical = lexical.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Block(
    leading: Boolean,
    trailing: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.Block,
    value: String,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def LabeledStatement(
    body: StatementKind,
    label: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.LabeledStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    rest: FunctionTypeParamKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EmptyTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.EmptyTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def WhileStatement(
    body: StatementKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.WhileStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ReturnStatement(
    `type`: typingsSlinky.astTypes.astTypesStrings.ReturnStatement,
    argument: ExpressionKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def GenericTypeAnnotation(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.GenericTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterInstantiationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSMethodSignature(
    computed: Boolean,
    key: ExpressionKind,
    optional: Boolean,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSMethodSignature,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TypeParameterInstantiation(
    params: js.Array[FlowTypeKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameterInstantiation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareOpaqueType(
    id: IdentifierKind,
    right: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSConstructorType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConstructorType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExpressionStatement(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExpressionStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InterfaceTypeAnnotation(
    body: ObjectTypeAnnotationKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    `extends`: js.Array[InterfaceExtendsKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareInterface(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareInterface,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def RestElement(
    argument: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.RestElement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSOptionalType(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSOptionalType,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BindExpression(
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.BindExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    `object`: ExpressionKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSAsExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    extra: Parenthesized = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSDeclareMethod(
    `abstract`: Boolean,
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    kind: get | set | method | constructor,
    optional: Boolean,
    params: js.Array[PatternKind],
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSDeclareMethod,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ImportDeclaration(
    importKind: value | `type`,
    source: LiteralKind,
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ImportDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(importKind = importKind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareFunction(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareFunction,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSFunctionType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSFunctionType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSRestType(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSRestType,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SpreadElement(
    argument: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.SpreadElement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableDeclarator(
    id: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.VariableDeclarator,
    comments: js.Array[CommentKind] = null,
    init: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VoidTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.VoidTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXElement(
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    openingElement: JSXOpeningElementKind,
    selfClosing: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXElement,
    closingElement: JSXClosingElementKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassBody,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSImportType(
    argument: StringLiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSImportType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    qualifier: IdentifierKind | TSQualifiedNameKind = null,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TypeCastExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AwaitExpression(
    all: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.AwaitExpression,
    argument: ExpressionKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Literal(
    `type`: typingsSlinky.astTypes.astTypesStrings.Literal,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null,
    value: String | Boolean | Double | js.RegExp = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionDeclaration(
    async: Boolean,
    body: BlockStatementKind,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: Boolean,
    id: IdentifierKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportSpecifier(
    exported: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportSpecifier,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    local: IdentifierKind = null,
    name: IdentifierKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeAnnotation,
    typeAnnotation: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StringLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteralTypeAnnotation,
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSQualifiedName(
    left: IdentifierKind | TSQualifiedNameKind,
    right: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSQualifiedName,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXIdentifier(
    name: String,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXIdentifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EmptyStatement(
    `type`: typingsSlinky.astTypes.astTypesStrings.EmptyStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ArrayPattern(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrayPattern,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BreakStatement(
    `type`: typingsSlinky.astTypes.astTypesStrings.BreakStatement,
    comments: js.Array[CommentKind] = null,
    label: IdentifierKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSSymbolKeyword(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSSymbolKeyword,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSArrayType(
    elementType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSArrayType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExistentialTypeParam(
    `type`: typingsSlinky.astTypes.astTypesStrings.ExistentialTypeParam,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectMethod(
    async: Boolean,
    body: BlockStatementKind,
    computed: Boolean,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: method | get | set,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectMethod,
    accessibility: LiteralKind = null,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Directive(
    `type`: typingsSlinky.astTypes.astTypesStrings.Directive,
    value: DirectiveLiteralKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXMemberExpression(
    computed: Boolean,
    `object`: JSXIdentifierKind | JSXMemberExpressionKind,
    property: JSXIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXMemberExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareExportDeclaration(
    default: Boolean,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportDeclaration,
    comments: js.Array[CommentKind] = null,
    declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSEnumDeclaration(
    const: Boolean,
    declare: Boolean,
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSEnumDeclaration,
    comments: js.Array[CommentKind] = null,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSMappedType(
    optional: Boolean | Plussign | `-_`,
    readonly: Boolean | Plussign | `-_`,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSMappedType,
    typeParameter: TSTypeParameterKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def JSXFragment(
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    closingElement: JSXClosingFragmentKind,
    openingElement: JSXOpeningFragmentKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXFragment,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StringTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.StringTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ForAwaitStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ForAwaitStatement,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSModuleBlock(
    body: js.Array[StatementKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSModuleBlock,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassProperty(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassProperty,
    access: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null,
    value: ExpressionKind = null,
    variance: VarianceKind | plus | minus = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSCallSignatureDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeAnnotationKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TypeParameter(
    name: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameter,
    bound: TypeAnnotationKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    variance: VarianceKind | plus | minus = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeCallProperty(
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeCallProperty,
    value: FunctionTypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TypeofTypeAnnotation(
    argument: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeofTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareModule(
    body: BlockStatementKind,
    id: IdentifierKind | LiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareModule,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InterpreterDirective(
    `type`: typingsSlinky.astTypes.astTypesStrings.InterpreterDirective,
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TSInterfaceDeclaration(
    body: TSInterfaceBodyKind,
    declare: Boolean,
    id: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSInterfaceDeclaration,
    comments: js.Array[CommentKind] = null,
    `extends`: js.Array[TSExpressionWithTypeArgumentsKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExistsTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.ExistsTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InterfaceExtends(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceExtends,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterInstantiationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def OptionalCallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.OptionalCallExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BooleanLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteralTypeAnnotation,
    value: Boolean,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NullLiteralTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.NullLiteralTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TemplateElement(
    tail: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.TemplateElement,
    value: Cooked,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DeclareTypeAlias(
    id: IdentifierKind,
    right: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareTypeAlias,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SequenceExpression(
    expressions: js.Array[ExpressionKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.SequenceExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExportNamedDeclaration(
    specifiers: js.Array[ExportSpecifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportNamedDeclaration,
    comments: js.Array[CommentKind] = null,
    declaration: DeclarationKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ComprehensionExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionExpression,
    comments: js.Array[CommentKind] = null,
    filter: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectProperty(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    shorthand: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectProperty,
    value: ExpressionKind | PatternKind,
    accessibility: LiteralKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Variance(
    kind: plus | minus,
    `type`: typingsSlinky.astTypes.astTypesStrings.Variance,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SpreadPropertyPattern(
    argument: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.SpreadPropertyPattern,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TupleTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.TupleTypeAnnotation,
    types: js.Array[FlowTypeKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DirectiveLiteral(
    `type`: typingsSlinky.astTypes.astTypesStrings.DirectiveLiteral,
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ClassMethod(
    async: Boolean,
    body: BlockStatementKind,
    computed: Boolean,
    defaults: js.Array[ExpressionKind | Null],
    expression: Boolean,
    generator: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: get | set | method | constructor,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassMethod,
    `abstract`: Boolean = null.asInstanceOf[Boolean],
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    static: Boolean = null.asInstanceOf[Boolean],
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], access = access.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

