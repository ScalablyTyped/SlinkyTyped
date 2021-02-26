package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.anon.Cooked
import typingsSlinky.astTypes.astTypesStrings.Ampersand
import typingsSlinky.astTypes.astTypesStrings.AmpersandAmpersand
import typingsSlinky.astTypes.astTypesStrings.AmpersandEqualssign
import typingsSlinky.astTypes.astTypesStrings.Asterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsteriskEqualssign
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
import typingsSlinky.astTypes.astTypesStrings.`--`
import typingsSlinky.astTypes.astTypesStrings.`-Equalssign`
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.`^Equalssign`
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
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.void
import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.AssignmentPatternKind
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.BooleanLiteralKind
import typingsSlinky.astTypes.kindsMod.ChainElementKind
import typingsSlinky.astTypes.kindsMod.ClassBodyKind
import typingsSlinky.astTypes.kindsMod.ClassMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivateMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivatePropertyKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyKind
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.DirectiveLiteralKind
import typingsSlinky.astTypes.kindsMod.EnumBooleanBodyKind
import typingsSlinky.astTypes.kindsMod.EnumBooleanMemberKind
import typingsSlinky.astTypes.kindsMod.EnumDefaultedMemberKind
import typingsSlinky.astTypes.kindsMod.EnumNumberBodyKind
import typingsSlinky.astTypes.kindsMod.EnumNumberMemberKind
import typingsSlinky.astTypes.kindsMod.EnumStringBodyKind
import typingsSlinky.astTypes.kindsMod.EnumStringMemberKind
import typingsSlinky.astTypes.kindsMod.EnumSymbolBodyKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.FunctionKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeParamKind
import typingsSlinky.astTypes.kindsMod.GenericTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.JSXClosingFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXEmptyExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningElementKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.MemberTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.MethodDefinitionKind
import typingsSlinky.astTypes.kindsMod.NumericLiteralKind
import typingsSlinky.astTypes.kindsMod.ObjectMethodKind
import typingsSlinky.astTypes.kindsMod.ObjectPatternKind
import typingsSlinky.astTypes.kindsMod.ObjectPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
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
import typingsSlinky.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsSlinky.astTypes.kindsMod.TSImportTypeKind
import typingsSlinky.astTypes.kindsMod.TSIndexSignatureKind
import typingsSlinky.astTypes.kindsMod.TSInterfaceBodyKind
import typingsSlinky.astTypes.kindsMod.TSMethodSignatureKind
import typingsSlinky.astTypes.kindsMod.TSNamedTupleMemberKind
import typingsSlinky.astTypes.kindsMod.TSPropertySignatureKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSThisTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.kindsMod.TemplateElementKind
import typingsSlinky.astTypes.kindsMod.TemplateLiteralKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterKind
import typingsSlinky.astTypes.kindsMod.UnaryExpressionKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanBody
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberMember
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember
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
trait ASTNode extends StObject
object ASTNode {
  
  @scala.inline
  def AnyTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.AnyTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  }
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrayExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  }
  
  @scala.inline
  def ArrayPattern(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrayPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  }
  
  @scala.inline
  def ArrayTypeAnnotation(elementType: FlowTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.ArrayTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatementKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrowFunctionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  }
  
  @scala.inline
  def AssignmentPattern(
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  }
  
  @scala.inline
  def AwaitExpression(`type`: typingsSlinky.astTypes.astTypesStrings.AwaitExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  }
  
  @scala.inline
  def BigIntLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.BigIntLiteral, value: String | Double): typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  }
  
  @scala.inline
  def BigIntLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.BigIntLiteralTypeAnnotation,
    value: Null
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BigIntTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.BigIntTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation]
  }
  
  @scala.inline
  def BinaryExpression(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | typingsSlinky.astTypes.astTypesStrings.^ | in | instanceof | AsteriskAsterisk,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.BinaryExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  }
  
  @scala.inline
  def BindExpression(callee: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.BindExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression]
  }
  
  @scala.inline
  def Block(`type`: typingsSlinky.astTypes.astTypesStrings.Block, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.Block = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Block]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[StatementKind], `type`: typingsSlinky.astTypes.astTypesStrings.BlockStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement]
  }
  
  @scala.inline
  def BooleanLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteral, value: Boolean): typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteralTypeAnnotation,
    value: Boolean
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BooleanTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.BooleanTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  }
  
  @scala.inline
  def BreakStatement(`type`: typingsSlinky.astTypes.astTypesStrings.BreakStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.CallExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression]
  }
  
  @scala.inline
  def CatchClause(body: BlockStatementKind, `type`: typingsSlinky.astTypes.astTypesStrings.CatchClause): typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElementKind, `type`: typingsSlinky.astTypes.astTypesStrings.ChainExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression]
  }
  
  @scala.inline
  def ClassBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassBody
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBodyKind, `type`: typingsSlinky.astTypes.astTypesStrings.ClassDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBodyKind, `type`: typingsSlinky.astTypes.astTypesStrings.ClassExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression]
  }
  
  @scala.inline
  def ClassImplements(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.ClassImplements): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements]
  }
  
  @scala.inline
  def ClassMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod]
  }
  
  @scala.inline
  def ClassPrivateMethod(
    body: BlockStatementKind,
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  }
  
  @scala.inline
  def ClassPrivateProperty(key: PrivateNameKind, `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateProperty): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  }
  
  @scala.inline
  def ClassProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassProperty
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty]
  }
  
  @scala.inline
  def ClassPropertyDefinition(
    definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassPropertyDefinition
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition]
  }
  
  @scala.inline
  def CommentBlock(`type`: typingsSlinky.astTypes.astTypesStrings.CommentBlock, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock]
  }
  
  @scala.inline
  def CommentLine(`type`: typingsSlinky.astTypes.astTypesStrings.CommentLine, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine]
  }
  
  @scala.inline
  def ComprehensionBlock(
    each: Boolean,
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionBlock
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock = {
    val __obj = js.Dynamic.literal(each = each.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock]
  }
  
  @scala.inline
  def ComprehensionExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ConditionalExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typingsSlinky.astTypes.astTypesStrings.ContinueStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement]
  }
  
  @scala.inline
  def DebuggerStatement(`type`: typingsSlinky.astTypes.astTypesStrings.DebuggerStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement]
  }
  
  @scala.inline
  def DeclareClass(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareClass
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass]
  }
  
  @scala.inline
  def DeclareExportAllDeclaration(`type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportAllDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration]
  }
  
  @scala.inline
  def DeclareExportDeclaration(default: Boolean, `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration]
  }
  
  @scala.inline
  def DeclareFunction(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.DeclareFunction): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction]
  }
  
  @scala.inline
  def DeclareInterface(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareInterface
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  }
  
  @scala.inline
  def DeclareModule(
    body: BlockStatementKind,
    id: IdentifierKind | LiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareModule
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule]
  }
  
  @scala.inline
  def DeclareModuleExports(
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareModuleExports,
    typeAnnotation: TypeAnnotationKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports]
  }
  
  @scala.inline
  def DeclareOpaqueType(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  }
  
  @scala.inline
  def DeclareTypeAlias(
    id: IdentifierKind,
    right: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareTypeAlias
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias]
  }
  
  @scala.inline
  def DeclareVariable(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.DeclareVariable): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable]
  }
  
  @scala.inline
  def DeclaredPredicate(`type`: typingsSlinky.astTypes.astTypesStrings.DeclaredPredicate, value: ExpressionKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  }
  
  @scala.inline
  def Decorator(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.Decorator): typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator]
  }
  
  @scala.inline
  def Directive(`type`: typingsSlinky.astTypes.astTypesStrings.Directive, value: DirectiveLiteralKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive]
  }
  
  @scala.inline
  def DirectiveLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.DirectiveLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  }
  
  @scala.inline
  def DoExpression(body: js.Array[StatementKind], `type`: typingsSlinky.astTypes.astTypesStrings.DoExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression]
  }
  
  @scala.inline
  def DoWhileStatement(
    body: StatementKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DoWhileStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement]
  }
  
  @scala.inline
  def EmptyStatement(`type`: typingsSlinky.astTypes.astTypesStrings.EmptyStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement]
  }
  
  @scala.inline
  def EmptyTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.EmptyTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  }
  
  @scala.inline
  def EnumBooleanBody(
    explicitType: Boolean,
    members: js.Array[EnumBooleanMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumBooleanBody
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanBody = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanBody]
  }
  
  @scala.inline
  def EnumBooleanMember(
    id: IdentifierKind,
    init: LiteralKind | Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumBooleanMember
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember]
  }
  
  @scala.inline
  def EnumDeclaration(
    body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind,
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration]
  }
  
  @scala.inline
  def EnumDefaultedMember(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.EnumDefaultedMember): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember]
  }
  
  @scala.inline
  def EnumNumberBody(
    explicitType: Boolean,
    members: js.Array[EnumNumberMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumNumberBody
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody]
  }
  
  @scala.inline
  def EnumNumberMember(
    id: IdentifierKind,
    init: LiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumNumberMember
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberMember]
  }
  
  @scala.inline
  def EnumStringBody(
    explicitType: Boolean,
    members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumStringBody
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody]
  }
  
  @scala.inline
  def EnumStringMember(
    id: IdentifierKind,
    init: LiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumStringMember
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember]
  }
  
  @scala.inline
  def EnumSymbolBody(
    members: js.Array[EnumDefaultedMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.EnumSymbolBody
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody]
  }
  
  @scala.inline
  def ExistentialTypeParam(`type`: typingsSlinky.astTypes.astTypesStrings.ExistentialTypeParam): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  }
  
  @scala.inline
  def ExistsTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.ExistsTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  }
  
  @scala.inline
  def ExportAllDeclaration(source: LiteralKind, `type`: typingsSlinky.astTypes.astTypesStrings.ExportAllDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration]
  }
  
  @scala.inline
  def ExportBatchSpecifier(`type`: typingsSlinky.astTypes.astTypesStrings.ExportBatchSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier]
  }
  
  @scala.inline
  def ExportDeclaration(default: Boolean, `type`: typingsSlinky.astTypes.astTypesStrings.ExportDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: DeclarationKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportDefaultDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration]
  }
  
  @scala.inline
  def ExportDefaultSpecifier(exported: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.ExportDefaultSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier]
  }
  
  @scala.inline
  def ExportNamedDeclaration(`type`: typingsSlinky.astTypes.astTypesStrings.ExportNamedDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier(exported: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.ExportNamespaceSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier]
  }
  
  @scala.inline
  def ExportSpecifier(exported: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.ExportSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  }
  
  @scala.inline
  def ExpressionStatement(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.ExpressionStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement]
  }
  
  @scala.inline
  def File(program: ProgramKind, `type`: typingsSlinky.astTypes.astTypesStrings.File): typingsSlinky.astTypes.namedTypesMod.namedTypes.File = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.File]
  }
  
  @scala.inline
  def ForAwaitStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ForAwaitStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement]
  }
  
  @scala.inline
  def ForInStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ForInStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement]
  }
  
  @scala.inline
  def ForOfStatement(
    body: StatementKind,
    left: VariableDeclarationKind | PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ForOfStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement]
  }
  
  @scala.inline
  def ForStatement(body: StatementKind, `type`: typingsSlinky.astTypes.astTypesStrings.ForStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  }
  
  @scala.inline
  def FunctionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  }
  
  @scala.inline
  def FunctionTypeParam(
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam]
  }
  
  @scala.inline
  def GeneratorExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.GeneratorExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  }
  
  @scala.inline
  def GenericTypeAnnotation(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.GenericTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.Identifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  @scala.inline
  def IfStatement(
    consequent: StatementKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.IfStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement]
  }
  
  @scala.inline
  def Import(`type`: typingsSlinky.astTypes.astTypesStrings.Import): typingsSlinky.astTypes.namedTypesMod.namedTypes.Import = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Import]
  }
  
  @scala.inline
  def ImportDeclaration(source: LiteralKind, `type`: typingsSlinky.astTypes.astTypesStrings.ImportDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(`type`: typingsSlinky.astTypes.astTypesStrings.ImportDefaultSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  }
  
  @scala.inline
  def ImportExpression(source: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.ImportExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(`type`: typingsSlinky.astTypes.astTypesStrings.ImportNamespaceSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier(imported: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.ImportSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  }
  
  @scala.inline
  def InferredPredicate(`type`: typingsSlinky.astTypes.astTypesStrings.InferredPredicate): typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  }
  
  @scala.inline
  def InterfaceDeclaration(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  }
  
  @scala.inline
  def InterfaceExtends(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceExtends): typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends]
  }
  
  @scala.inline
  def InterfaceTypeAnnotation(
    body: ObjectTypeAnnotationKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  }
  
  @scala.inline
  def InterpreterDirective(`type`: typingsSlinky.astTypes.astTypesStrings.InterpreterDirective, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.IntersectionTypeAnnotation,
    types: js.Array[FlowTypeKind]
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  }
  
  @scala.inline
  def JSXAttribute(
    name: JSXIdentifierKind | JSXNamespacedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXAttribute
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute]
  }
  
  @scala.inline
  def JSXClosingElement(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXClosingElement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement]
  }
  
  @scala.inline
  def JSXClosingFragment(`type`: typingsSlinky.astTypes.astTypesStrings.JSXClosingFragment): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment]
  }
  
  @scala.inline
  def JSXElement(openingElement: JSXOpeningElementKind, `type`: typingsSlinky.astTypes.astTypesStrings.JSXElement): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement]
  }
  
  @scala.inline
  def JSXEmptyExpression(`type`: typingsSlinky.astTypes.astTypesStrings.JSXEmptyExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: ExpressionKind | JSXEmptyExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXExpressionContainer
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  }
  
  @scala.inline
  def JSXFragment(
    closingFragment: JSXClosingFragmentKind,
    openingFragment: JSXOpeningFragmentKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXFragment
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment = {
    val __obj = js.Dynamic.literal(closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.JSXIdentifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  @scala.inline
  def JSXMemberExpression(
    `object`: JSXIdentifierKind | JSXMemberExpressionKind,
    property: JSXIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXMemberExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  }
  
  @scala.inline
  def JSXNamespacedName(
    name: JSXIdentifierKind,
    namespace: JSXIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXNamespacedName
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName]
  }
  
  @scala.inline
  def JSXOpeningElement(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXOpeningElement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement]
  }
  
  @scala.inline
  def JSXOpeningFragment(`type`: typingsSlinky.astTypes.astTypesStrings.JSXOpeningFragment): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment]
  }
  
  @scala.inline
  def JSXSpreadAttribute(argument: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.JSXSpreadAttribute): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute]
  }
  
  @scala.inline
  def JSXSpreadChild(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.JSXSpreadChild): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild]
  }
  
  @scala.inline
  def JSXText(`type`: typingsSlinky.astTypes.astTypesStrings.JSXText, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText]
  }
  
  @scala.inline
  def LabeledStatement(
    body: StatementKind,
    label: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.LabeledStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement]
  }
  
  @scala.inline
  def Line(`type`: typingsSlinky.astTypes.astTypesStrings.Line, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.Line = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Line]
  }
  
  @scala.inline
  def Literal(`type`: typingsSlinky.astTypes.astTypesStrings.Literal): typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal]
  }
  
  @scala.inline
  def LogicalExpression(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.LogicalExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MemberExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression]
  }
  
  @scala.inline
  def MemberTypeAnnotation(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MemberTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  }
  
  @scala.inline
  def MetaProperty(
    meta: IdentifierKind,
    property: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MetaProperty
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty]
  }
  
  @scala.inline
  def MethodDefinition(
    key: ExpressionKind,
    kind: constructor | method | get | set,
    `type`: typingsSlinky.astTypes.astTypesStrings.MethodDefinition,
    value: FunctionKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition]
  }
  
  @scala.inline
  def MixedTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.MixedTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.NewExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression]
  }
  
  @scala.inline
  def Noop(`type`: typingsSlinky.astTypes.astTypesStrings.Noop): typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop]
  }
  
  @scala.inline
  def NullLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.NullLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral]
  }
  
  @scala.inline
  def NullLiteralTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.NullLiteralTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NullTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.NullTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  }
  
  @scala.inline
  def NullableTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.NullableTypeAnnotation,
    typeAnnotation: FlowTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  }
  
  @scala.inline
  def NumberLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumberLiteralTypeAnnotation,
    value: Double
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NumberTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.NumberTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  }
  
  @scala.inline
  def NumericLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteral, value: Double): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteralTypeAnnotation,
    value: Double
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  }
  
  @scala.inline
  def ObjectMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: method | get | set,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern]
  }
  
  @scala.inline
  def ObjectProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectProperty,
    value: ExpressionKind | PatternKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty]
  }
  
  @scala.inline
  def ObjectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  }
  
  @scala.inline
  def ObjectTypeCallProperty(
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeCallProperty,
    value: FunctionTypeAnnotationKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty]
  }
  
  @scala.inline
  def ObjectTypeIndexer(
    id: IdentifierKind,
    key: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeIndexer,
    value: FlowTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer]
  }
  
  @scala.inline
  def ObjectTypeInternalSlot(
    id: IdentifierKind,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeInternalSlot,
    value: FlowTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot]
  }
  
  @scala.inline
  def ObjectTypeProperty(
    key: LiteralKind | IdentifierKind,
    optional: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeProperty,
    value: FlowTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty]
  }
  
  @scala.inline
  def ObjectTypeSpreadProperty(argument: FlowTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeSpreadProperty): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty]
  }
  
  @scala.inline
  def OpaqueType(
    id: IdentifierKind,
    impltype: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OpaqueType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType]
  }
  
  @scala.inline
  def OptionalCallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OptionalCallExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  }
  
  @scala.inline
  def OptionalMemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OptionalMemberExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  }
  
  @scala.inline
  def ParenthesizedExpression(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.ParenthesizedExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  }
  
  @scala.inline
  def PrivateName(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.PrivateName): typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName]
  }
  
  @scala.inline
  def Program(body: js.Array[StatementKind], `type`: typingsSlinky.astTypes.astTypesStrings.Program): typingsSlinky.astTypes.namedTypesMod.namedTypes.Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Program]
  }
  
  @scala.inline
  def Property(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    `type`: typingsSlinky.astTypes.astTypesStrings.Property,
    value: ExpressionKind | PatternKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.Property = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Property]
  }
  
  @scala.inline
  def PropertyPattern(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    pattern: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.PropertyPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern]
  }
  
  @scala.inline
  def QualifiedTypeIdentifier(
    id: IdentifierKind,
    qualification: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.QualifiedTypeIdentifier
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier]
  }
  
  @scala.inline
  def RegExpLiteral(flags: String, pattern: String, `type`: typingsSlinky.astTypes.astTypesStrings.RegExpLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  }
  
  @scala.inline
  def RestElement(argument: PatternKind, `type`: typingsSlinky.astTypes.astTypesStrings.RestElement): typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement]
  }
  
  @scala.inline
  def RestProperty(argument: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.RestProperty): typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typingsSlinky.astTypes.astTypesStrings.ReturnStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement]
  }
  
  @scala.inline
  def SequenceExpression(
    expressions: js.Array[ExpressionKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.SequenceExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  }
  
  @scala.inline
  def SpreadElement(argument: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.SpreadElement): typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement]
  }
  
  @scala.inline
  def SpreadElementPattern(argument: PatternKind, `type`: typingsSlinky.astTypes.astTypesStrings.SpreadElementPattern): typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern]
  }
  
  @scala.inline
  def SpreadProperty(argument: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.SpreadProperty): typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty]
  }
  
  @scala.inline
  def SpreadPropertyPattern(argument: PatternKind, `type`: typingsSlinky.astTypes.astTypesStrings.SpreadPropertyPattern): typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern]
  }
  
  @scala.inline
  def StringLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.StringLiteral, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteralTypeAnnotation,
    value: String
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  }
  
  @scala.inline
  def StringTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.StringTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  }
  
  @scala.inline
  def Super(`type`: typingsSlinky.astTypes.astTypesStrings.Super): typingsSlinky.astTypes.namedTypesMod.namedTypes.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Super]
  }
  
  @scala.inline
  def SwitchCase(consequent: js.Array[StatementKind], `type`: typingsSlinky.astTypes.astTypesStrings.SwitchCase): typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase]
  }
  
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCaseKind],
    discriminant: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.SwitchStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement]
  }
  
  @scala.inline
  def SymbolTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.SymbolTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation]
  }
  
  @scala.inline
  def TSAnyKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSAnyKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword]
  }
  
  @scala.inline
  def TSArrayType(elementType: TSTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSArrayType): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType]
  }
  
  @scala.inline
  def TSAsExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  }
  
  @scala.inline
  def TSBigIntKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSBigIntKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword]
  }
  
  @scala.inline
  def TSBooleanKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSBooleanKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword]
  }
  
  @scala.inline
  def TSCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSCallSignatureDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  }
  
  @scala.inline
  def TSConditionalType(
    checkType: TSTypeKind,
    extendsType: TSTypeKind,
    falseType: TSTypeKind,
    trueType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConditionalType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConstructSignatureDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructorType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConstructorType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  }
  
  @scala.inline
  def TSDeclareFunction(params: js.Array[PatternKind], `type`: typingsSlinky.astTypes.astTypesStrings.TSDeclareFunction): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction]
  }
  
  @scala.inline
  def TSDeclareMethod(
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSDeclareMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod]
  }
  
  @scala.inline
  def TSEnumDeclaration(
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSEnumDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration]
  }
  
  @scala.inline
  def TSEnumMember(
    id: IdentifierKind | StringLiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSEnumMember
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember]
  }
  
  @scala.inline
  def TSExportAssignment(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSExportAssignment): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments(
    expression: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSExpressionWithTypeArguments
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
  }
  
  @scala.inline
  def TSExternalModuleReference(
    expression: StringLiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSExternalModuleReference
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference]
  }
  
  @scala.inline
  def TSFunctionType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSFunctionType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  }
  
  @scala.inline
  def TSImportEqualsDeclaration(
    id: IdentifierKind,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSImportEqualsDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration]
  }
  
  @scala.inline
  def TSImportType(argument: StringLiteralKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSImportType): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType]
  }
  
  @scala.inline
  def TSIndexSignature(
    parameters: js.Array[IdentifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexSignature
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature]
  }
  
  @scala.inline
  def TSIndexedAccessType(
    indexType: TSTypeKind,
    objectType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSIndexedAccessType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType]
  }
  
  @scala.inline
  def TSInferType(`type`: typingsSlinky.astTypes.astTypesStrings.TSInferType, typeParameter: TSTypeParameterKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType]
  }
  
  @scala.inline
  def TSInterfaceBody(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSInterfaceBody
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody]
  }
  
  @scala.inline
  def TSInterfaceDeclaration(
    body: TSInterfaceBodyKind,
    id: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSInterfaceDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration]
  }
  
  @scala.inline
  def TSIntersectionType(`type`: typingsSlinky.astTypes.astTypesStrings.TSIntersectionType, types: js.Array[TSTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType]
  }
  
  @scala.inline
  def TSLiteralType(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSLiteralType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType]
  }
  
  @scala.inline
  def TSMappedType(`type`: typingsSlinky.astTypes.astTypesStrings.TSMappedType, typeParameter: TSTypeParameterKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType]
  }
  
  @scala.inline
  def TSMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSMethodSignature
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  }
  
  @scala.inline
  def TSModuleBlock(body: js.Array[StatementKind], `type`: typingsSlinky.astTypes.astTypesStrings.TSModuleBlock): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock]
  }
  
  @scala.inline
  def TSModuleDeclaration(
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSModuleDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration]
  }
  
  @scala.inline
  def TSNamedTupleMember(
    elementType: TSTypeKind,
    label: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSNamedTupleMember
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember]
  }
  
  @scala.inline
  def TSNamespaceExportDeclaration(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSNamespaceExportDeclaration): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration]
  }
  
  @scala.inline
  def TSNeverKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSNeverKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword]
  }
  
  @scala.inline
  def TSNonNullExpression(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSNonNullExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  }
  
  @scala.inline
  def TSNullKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSNullKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword]
  }
  
  @scala.inline
  def TSNumberKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSNumberKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword]
  }
  
  @scala.inline
  def TSObjectKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSObjectKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword]
  }
  
  @scala.inline
  def TSOptionalType(`type`: typingsSlinky.astTypes.astTypesStrings.TSOptionalType, typeAnnotation: TSTypeKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType]
  }
  
  @scala.inline
  def TSParameterProperty(
    parameter: IdentifierKind | AssignmentPatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSParameterProperty
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty]
  }
  
  @scala.inline
  def TSParenthesizedType(`type`: typingsSlinky.astTypes.astTypesStrings.TSParenthesizedType, typeAnnotation: TSTypeKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType]
  }
  
  @scala.inline
  def TSPropertySignature(key: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSPropertySignature): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature]
  }
  
  @scala.inline
  def TSQualifiedName(
    left: IdentifierKind | TSQualifiedNameKind,
    right: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSQualifiedName
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName]
  }
  
  @scala.inline
  def TSRestType(`type`: typingsSlinky.astTypes.astTypesStrings.TSRestType, typeAnnotation: TSTypeKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType]
  }
  
  @scala.inline
  def TSStringKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSStringKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword]
  }
  
  @scala.inline
  def TSSymbolKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSSymbolKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword]
  }
  
  @scala.inline
  def TSThisType(`type`: typingsSlinky.astTypes.astTypesStrings.TSThisType): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType]
  }
  
  @scala.inline
  def TSTupleType(
    elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTupleType
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType]
  }
  
  @scala.inline
  def TSTypeAliasDeclaration(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  }
  
  @scala.inline
  def TSTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAnnotation,
    typeAnnotation: TSTypeKind | TSTypeAnnotationKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation]
  }
  
  @scala.inline
  def TSTypeAssertion(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  }
  
  @scala.inline
  def TSTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeLiteral
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral]
  }
  
  @scala.inline
  def TSTypeOperator(
    operator: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator]
  }
  
  @scala.inline
  def TSTypeParameter(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
  
  @scala.inline
  def TSTypeParameterDeclaration(
    params: js.Array[TSTypeParameterKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameterDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration]
  }
  
  @scala.inline
  def TSTypeParameterInstantiation(
    params: js.Array[TSTypeKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameterInstantiation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation]
  }
  
  @scala.inline
  def TSTypePredicate(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  }
  
  @scala.inline
  def TSTypeQuery(
    exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeQuery
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery]
  }
  
  @scala.inline
  def TSTypeReference(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeReference,
    typeName: IdentifierKind | TSQualifiedNameKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  }
  
  @scala.inline
  def TSUndefinedKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSUndefinedKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword]
  }
  
  @scala.inline
  def TSUnionType(`type`: typingsSlinky.astTypes.astTypesStrings.TSUnionType, types: js.Array[TSTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType]
  }
  
  @scala.inline
  def TSUnknownKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSUnknownKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword]
  }
  
  @scala.inline
  def TSVoidKeyword(`type`: typingsSlinky.astTypes.astTypesStrings.TSVoidKeyword): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteralKind,
    tag: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TaggedTemplateExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  }
  
  @scala.inline
  def TemplateElement(tail: Boolean, `type`: typingsSlinky.astTypes.astTypesStrings.TemplateElement, value: Cooked): typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[ExpressionKind],
    quasis: js.Array[TemplateElementKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TemplateLiteral
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  }
  
  @scala.inline
  def ThisExpression(`type`: typingsSlinky.astTypes.astTypesStrings.ThisExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression]
  }
  
  @scala.inline
  def ThisTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.ThisTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  }
  
  @scala.inline
  def ThrowStatement(argument: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.ThrowStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement]
  }
  
  @scala.inline
  def TryStatement(block: BlockStatementKind, `type`: typingsSlinky.astTypes.astTypesStrings.TryStatement): typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement]
  }
  
  @scala.inline
  def TupleTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.TupleTypeAnnotation, types: js.Array[FlowTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  }
  
  @scala.inline
  def TypeAlias(id: IdentifierKind, right: FlowTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.TypeAlias): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias]
  }
  
  @scala.inline
  def TypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.TypeAnnotation, typeAnnotation: FlowTypeKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation]
  }
  
  @scala.inline
  def TypeCastExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  }
  
  @scala.inline
  def TypeParameter(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameter): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter]
  }
  
  @scala.inline
  def TypeParameterDeclaration(
    params: js.Array[TypeParameterKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameterDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration]
  }
  
  @scala.inline
  def TypeParameterInstantiation(
    params: js.Array[FlowTypeKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameterInstantiation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation]
  }
  
  @scala.inline
  def TypeofTypeAnnotation(argument: FlowTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.TypeofTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    `type`: typingsSlinky.astTypes.astTypesStrings.UnaryExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  }
  
  @scala.inline
  def UnionTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.UnionTypeAnnotation, types: js.Array[FlowTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: ExpressionKind,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.UpdateExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  }
  
  @scala.inline
  def VariableDeclaration(
    declarations: js.Array[VariableDeclaratorKind | IdentifierKind],
    kind: `var` | let | const,
    `type`: typingsSlinky.astTypes.astTypesStrings.VariableDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration]
  }
  
  @scala.inline
  def VariableDeclarator(id: PatternKind, `type`: typingsSlinky.astTypes.astTypesStrings.VariableDeclarator): typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator]
  }
  
  @scala.inline
  def Variance(kind: plus | minus, `type`: typingsSlinky.astTypes.astTypesStrings.Variance): typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance]
  }
  
  @scala.inline
  def VoidTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.VoidTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  }
  
  @scala.inline
  def WhileStatement(
    body: StatementKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.WhileStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement]
  }
  
  @scala.inline
  def WithStatement(
    body: StatementKind,
    `object`: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.WithStatement
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement]
  }
  
  @scala.inline
  def YieldExpression(`type`: typingsSlinky.astTypes.astTypesStrings.YieldExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression]
  }
}
