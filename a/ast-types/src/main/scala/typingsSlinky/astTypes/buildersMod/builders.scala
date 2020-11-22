package typingsSlinky.astTypes.buildersMod

import org.scalablytyped.runtime.StringDictionary
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
import typingsSlinky.astTypes.astTypesStrings.^
import typingsSlinky.astTypes.astTypesStrings.`--`
import typingsSlinky.astTypes.astTypesStrings.`-Equalssign`
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.`^Equalssign`
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
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.value
import typingsSlinky.astTypes.astTypesStrings.void
import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.AssignmentPatternKind
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.BooleanLiteralKind
import typingsSlinky.astTypes.kindsMod.CatchClauseKind
import typingsSlinky.astTypes.kindsMod.ChainElementKind
import typingsSlinky.astTypes.kindsMod.ClassBodyKind
import typingsSlinky.astTypes.kindsMod.ClassMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivateMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivatePropertyKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyKind
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.DeclareClassKind
import typingsSlinky.astTypes.kindsMod.DeclareFunctionKind
import typingsSlinky.astTypes.kindsMod.DeclareOpaqueTypeKind
import typingsSlinky.astTypes.kindsMod.DeclareVariableKind
import typingsSlinky.astTypes.kindsMod.DirectiveLiteralKind
import typingsSlinky.astTypes.kindsMod.EnumBooleanBodyKind
import typingsSlinky.astTypes.kindsMod.EnumBooleanMemberKind
import typingsSlinky.astTypes.kindsMod.EnumDefaultedMemberKind
import typingsSlinky.astTypes.kindsMod.EnumNumberBodyKind
import typingsSlinky.astTypes.kindsMod.EnumNumberMemberKind
import typingsSlinky.astTypes.kindsMod.EnumStringBodyKind
import typingsSlinky.astTypes.kindsMod.EnumStringMemberKind
import typingsSlinky.astTypes.kindsMod.EnumSymbolBodyKind
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
import typingsSlinky.astTypes.kindsMod.InterfaceDeclarationKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.JSXAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXClosingElementKind
import typingsSlinky.astTypes.kindsMod.JSXClosingFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXEmptyExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningElementKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadChildKind
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
import typingsSlinky.astTypes.kindsMod.TSModuleBlockKind
import typingsSlinky.astTypes.kindsMod.TSModuleDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSNamedTupleMemberKind
import typingsSlinky.astTypes.kindsMod.TSPropertySignatureKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSThisTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.kindsMod.TemplateElementKind
import typingsSlinky.astTypes.kindsMod.TemplateLiteralKind
import typingsSlinky.astTypes.kindsMod.TypeAliasKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterKind
import typingsSlinky.astTypes.kindsMod.UnaryExpressionKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait builders
  extends /* builderName */ StringDictionary[js.Any] {
  
  def anyTypeAnnotation(): AnyTypeAnnotation = js.native
  @JSName("anyTypeAnnotation")
  var anyTypeAnnotation_Original: AnyTypeAnnotationBuilder = js.native
  
  def arrayExpression(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  @JSName("arrayExpression")
  var arrayExpression_Original: ArrayExpressionBuilder = js.native
  
  def arrayPattern(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern = js.native
  @JSName("arrayPattern")
  var arrayPattern_Original: ArrayPatternBuilder = js.native
  
  def arrayTypeAnnotation(elementType: FlowTypeKind): ArrayTypeAnnotation = js.native
  @JSName("arrayTypeAnnotation")
  var arrayTypeAnnotation_Original: ArrayTypeAnnotationBuilder = js.native
  
  def arrowFunctionExpression(params: js.Array[PatternKind], body: BlockStatementKind): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[PatternKind], body: BlockStatementKind, expression: Boolean): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[PatternKind], body: ExpressionKind): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[PatternKind], body: ExpressionKind, expression: Boolean): ArrowFunctionExpression = js.native
  @JSName("arrowFunctionExpression")
  var arrowFunctionExpression_Original: ArrowFunctionExpressionBuilder = js.native
  
  def assignmentExpression(operator: AmpersandEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: AmpersandEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: AsteriskAsteriskEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: AsteriskAsteriskEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: AsteriskEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: AsteriskEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: Equalssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: Equalssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(
    operator: GreaterthansignGreaterthansignEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def assignmentExpression(operator: GreaterthansignGreaterthansignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(
    operator: GreaterthansignGreaterthansignGreaterthansignEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def assignmentExpression(
    operator: GreaterthansignGreaterthansignGreaterthansignEqualssign,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def assignmentExpression(operator: LessthansignLessthansignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: LessthansignLessthansignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: PercentsignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: PercentsignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: PlussignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: PlussignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: SlashEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: SlashEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: VerticallineEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: VerticallineEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: `-Equalssign`, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: `-Equalssign`, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: `^Equalssign`, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression = js.native
  def assignmentExpression(operator: `^Equalssign`, left: PatternKind, right: ExpressionKind): AssignmentExpression = js.native
  @JSName("assignmentExpression")
  var assignmentExpression_Original: AssignmentExpressionBuilder = js.native
  
  def assignmentPattern(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  @JSName("assignmentPattern")
  var assignmentPattern_Original: AssignmentPatternBuilder = js.native
  
  def awaitExpression(): AwaitExpression = js.native
  def awaitExpression(argument: Null, all: Boolean): AwaitExpression = js.native
  def awaitExpression(argument: ExpressionKind): AwaitExpression = js.native
  def awaitExpression(argument: ExpressionKind, all: Boolean): AwaitExpression = js.native
  @JSName("awaitExpression")
  var awaitExpression_Original: AwaitExpressionBuilder = js.native
  
  def bigIntLiteral(value: String): BigIntLiteral = js.native
  def bigIntLiteral(value: Double): BigIntLiteral = js.native
  
  def bigIntLiteralTypeAnnotation(value: Null, raw: String): BigIntLiteralTypeAnnotation = js.native
  @JSName("bigIntLiteralTypeAnnotation")
  var bigIntLiteralTypeAnnotation_Original: BigIntLiteralTypeAnnotationBuilder = js.native
  
  @JSName("bigIntLiteral")
  var bigIntLiteral_Original: BigIntLiteralBuilder = js.native
  
  def bigIntTypeAnnotation(): BigIntTypeAnnotation = js.native
  @JSName("bigIntTypeAnnotation")
  var bigIntTypeAnnotation_Original: BigIntTypeAnnotationBuilder = js.native
  
  def binaryExpression(operator: Ampersand, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: AsteriskAsterisk, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: Asterisk, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: EqualssignEqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: EqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: ExclamationmarkEqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: ExclamationmarkEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: GreaterthansignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(
    operator: GreaterthansignGreaterthansignGreaterthansign,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def binaryExpression(operator: GreaterthansignGreaterthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: Greaterthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: LessthansignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: LessthansignLessthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: Lessthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: Percentsign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: Plussign, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: Slash, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: Verticalline, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: ^, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  def binaryExpression(operator: `-_`, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  @JSName("binaryExpression")
  var binaryExpression_Original: BinaryExpressionBuilder = js.native
  @JSName("binaryExpression")
  def binaryExpression_in(operator: in, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  @JSName("binaryExpression")
  def binaryExpression_instanceof(operator: instanceof, left: ExpressionKind, right: ExpressionKind): BinaryExpression = js.native
  
  def bindExpression(`object`: Null, callee: ExpressionKind): BindExpression = js.native
  def bindExpression(`object`: ExpressionKind, callee: ExpressionKind): BindExpression = js.native
  @JSName("bindExpression")
  var bindExpression_Original: BindExpressionBuilder = js.native
  
  def block(value: String): Block = js.native
  def block(value: String, leading: js.UndefOr[scala.Nothing], trailing: Boolean): Block = js.native
  def block(value: String, leading: Boolean): Block = js.native
  def block(value: String, leading: Boolean, trailing: Boolean): Block = js.native
  
  def blockStatement(body: js.Array[StatementKind]): BlockStatement = js.native
  @JSName("blockStatement")
  var blockStatement_Original: BlockStatementBuilder = js.native
  
  @JSName("block")
  var block_Original: BlockBuilder = js.native
  
  def booleanLiteral(value: Boolean): BooleanLiteral = js.native
  
  def booleanLiteralTypeAnnotation(value: Boolean, raw: String): BooleanLiteralTypeAnnotation = js.native
  @JSName("booleanLiteralTypeAnnotation")
  var booleanLiteralTypeAnnotation_Original: BooleanLiteralTypeAnnotationBuilder = js.native
  
  @JSName("booleanLiteral")
  var booleanLiteral_Original: BooleanLiteralBuilder = js.native
  
  def booleanTypeAnnotation(): BooleanTypeAnnotation = js.native
  @JSName("booleanTypeAnnotation")
  var booleanTypeAnnotation_Original: BooleanTypeAnnotationBuilder = js.native
  
  def breakStatement(): BreakStatement = js.native
  def breakStatement(label: IdentifierKind): BreakStatement = js.native
  @JSName("breakStatement")
  var breakStatement_Original: BreakStatementBuilder = js.native
  
  def callExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): CallExpression = js.native
  @JSName("callExpression")
  var callExpression_Original: CallExpressionBuilder = js.native
  
  def catchClause(param: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], guard: Null, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: Null, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: Null, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: Null, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: PatternKind, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: PatternKind, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: PatternKind, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  @JSName("catchClause")
  var catchClause_Original: CatchClauseBuilder = js.native
  
  def chainExpression(expression: ChainElementKind): ChainExpression = js.native
  @JSName("chainExpression")
  var chainExpression_Original: ChainExpressionBuilder = js.native
  
  def classBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): ClassBody = js.native
  @JSName("classBody")
  var classBody_Original: ClassBodyBuilder = js.native
  
  def classDeclaration(id: Null, body: ClassBodyKind): ClassDeclaration = js.native
  def classDeclaration(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def classDeclaration(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration = js.native
  def classDeclaration(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  @JSName("classDeclaration")
  var classDeclaration_Original: ClassDeclarationBuilder = js.native
  
  def classExpression(id: js.UndefOr[scala.Nothing], body: ClassBodyKind): ClassExpression = js.native
  def classExpression(id: js.UndefOr[scala.Nothing], body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def classExpression(id: Null, body: ClassBodyKind): ClassExpression = js.native
  def classExpression(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def classExpression(id: IdentifierKind, body: ClassBodyKind): ClassExpression = js.native
  def classExpression(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  @JSName("classExpression")
  var classExpression_Original: ClassExpressionBuilder = js.native
  
  def classImplements(id: IdentifierKind): ClassImplements = js.native
  @JSName("classImplements")
  var classImplements_Original: ClassImplementsBuilder = js.native
  
  def classMethod(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: js.UndefOr[Boolean],
    staticParam: js.UndefOr[Boolean | Null]
  ): ClassMethod = js.native
  @JSName("classMethod")
  var classMethod_Original: ClassMethodBuilder = js.native
  
  def classPrivateMethod(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind): ClassPrivateMethod = js.native
  def classPrivateMethod(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: js.UndefOr[scala.Nothing],
    computed: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def classPrivateMethod(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: js.UndefOr[scala.Nothing],
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def classPrivateMethod(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: js.UndefOr[scala.Nothing],
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  var classPrivateMethod_Original: ClassPrivateMethodBuilder = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: constructor): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: get): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: method): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: set): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  
  def classPrivateProperty(key: PrivateNameKind): ClassPrivateProperty = js.native
  def classPrivateProperty(key: PrivateNameKind, value: ExpressionKind): ClassPrivateProperty = js.native
  @JSName("classPrivateProperty")
  var classPrivateProperty_Original: ClassPrivatePropertyBuilder = js.native
  
  def classProperty(key: ExpressionKind): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: js.UndefOr[scala.Nothing], staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind): ClassProperty = js.native
  def classProperty(
    key: ExpressionKind,
    value: ExpressionKind,
    typeAnnotation: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: ExpressionKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: ExpressionKind,
    value: ExpressionKind,
    typeAnnotation: TypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: IdentifierKind): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: js.UndefOr[scala.Nothing], staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind): ClassProperty = js.native
  def classProperty(
    key: IdentifierKind,
    value: ExpressionKind,
    typeAnnotation: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: IdentifierKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: IdentifierKind,
    value: ExpressionKind,
    typeAnnotation: TypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: LiteralKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: js.UndefOr[scala.Nothing], staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind): ClassProperty = js.native
  def classProperty(
    key: LiteralKind,
    value: ExpressionKind,
    typeAnnotation: js.UndefOr[scala.Nothing],
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: LiteralKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  
  def classPropertyDefinition(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition = js.native
  def classPropertyDefinition(definition: ClassPropertyKind): ClassPropertyDefinition = js.native
  def classPropertyDefinition(definition: MethodDefinitionKind): ClassPropertyDefinition = js.native
  def classPropertyDefinition(definition: VariableDeclaratorKind): ClassPropertyDefinition = js.native
  @JSName("classPropertyDefinition")
  var classPropertyDefinition_Original: ClassPropertyDefinitionBuilder = js.native
  
  @JSName("classProperty")
  var classProperty_Original: ClassPropertyBuilder = js.native
  
  def commentBlock(value: String): CommentBlock = js.native
  def commentBlock(value: String, leading: js.UndefOr[scala.Nothing], trailing: Boolean): CommentBlock = js.native
  def commentBlock(value: String, leading: Boolean): CommentBlock = js.native
  def commentBlock(value: String, leading: Boolean, trailing: Boolean): CommentBlock = js.native
  @JSName("commentBlock")
  var commentBlock_Original: CommentBlockBuilder = js.native
  
  def commentLine(value: String): CommentLine = js.native
  def commentLine(value: String, leading: js.UndefOr[scala.Nothing], trailing: Boolean): CommentLine = js.native
  def commentLine(value: String, leading: Boolean): CommentLine = js.native
  def commentLine(value: String, leading: Boolean, trailing: Boolean): CommentLine = js.native
  @JSName("commentLine")
  var commentLine_Original: CommentLineBuilder = js.native
  
  def comprehensionBlock(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock = js.native
  @JSName("comprehensionBlock")
  var comprehensionBlock_Original: ComprehensionBlockBuilder = js.native
  
  def comprehensionExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): ComprehensionExpression = js.native
  def comprehensionExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): ComprehensionExpression = js.native
  @JSName("comprehensionExpression")
  var comprehensionExpression_Original: ComprehensionExpressionBuilder = js.native
  
  def conditionalExpression(test: ExpressionKind, consequent: ExpressionKind, alternate: ExpressionKind): ConditionalExpression = js.native
  @JSName("conditionalExpression")
  var conditionalExpression_Original: ConditionalExpressionBuilder = js.native
  
  def continueStatement(): ContinueStatement = js.native
  def continueStatement(label: IdentifierKind): ContinueStatement = js.native
  @JSName("continueStatement")
  var continueStatement_Original: ContinueStatementBuilder = js.native
  
  def debuggerStatement(): DebuggerStatement = js.native
  @JSName("debuggerStatement")
  var debuggerStatement_Original: DebuggerStatementBuilder = js.native
  
  def declareClass(id: IdentifierKind): DeclareClass = js.native
  @JSName("declareClass")
  var declareClass_Original: DeclareClassBuilder = js.native
  
  def declareExportAllDeclaration(): DeclareExportAllDeclaration = js.native
  def declareExportAllDeclaration(source: LiteralKind): DeclareExportAllDeclaration = js.native
  @JSName("declareExportAllDeclaration")
  var declareExportAllDeclaration_Original: DeclareExportAllDeclarationBuilder = js.native
  
  def declareExportDeclaration(defaultParam: Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareClassKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareFunctionKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareOpaqueTypeKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareOpaqueTypeKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareOpaqueTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareOpaqueTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareVariableKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: FlowTypeKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: InterfaceDeclarationKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: InterfaceDeclarationKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: InterfaceDeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: InterfaceDeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: TypeAliasKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: TypeAliasKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: TypeAliasKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: TypeAliasKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  @JSName("declareExportDeclaration")
  var declareExportDeclaration_Original: DeclareExportDeclarationBuilder = js.native
  
  def declareFunction(id: IdentifierKind): DeclareFunction = js.native
  @JSName("declareFunction")
  var declareFunction_Original: DeclareFunctionBuilder = js.native
  
  def declareInterface(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): DeclareInterface = js.native
  @JSName("declareInterface")
  var declareInterface_Original: DeclareInterfaceBuilder = js.native
  
  def declareModule(id: IdentifierKind, body: BlockStatementKind): DeclareModule = js.native
  def declareModule(id: LiteralKind, body: BlockStatementKind): DeclareModule = js.native
  
  def declareModuleExports(typeAnnotation: TypeAnnotationKind): DeclareModuleExports = js.native
  @JSName("declareModuleExports")
  var declareModuleExports_Original: DeclareModuleExportsBuilder = js.native
  
  @JSName("declareModule")
  var declareModule_Original: DeclareModuleBuilder = js.native
  
  def declareOpaqueType(id: IdentifierKind): DeclareOpaqueType = js.native
  def declareOpaqueType(id: IdentifierKind, typeParameters: Null, supertype: FlowTypeKind): DeclareOpaqueType = js.native
  def declareOpaqueType(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind): DeclareOpaqueType = js.native
  def declareOpaqueType(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, supertype: FlowTypeKind): DeclareOpaqueType = js.native
  @JSName("declareOpaqueType")
  var declareOpaqueType_Original: DeclareOpaqueTypeBuilder = js.native
  
  def declareTypeAlias(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): DeclareTypeAlias = js.native
  def declareTypeAlias(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): DeclareTypeAlias = js.native
  @JSName("declareTypeAlias")
  var declareTypeAlias_Original: DeclareTypeAliasBuilder = js.native
  
  def declareVariable(id: IdentifierKind): DeclareVariable = js.native
  @JSName("declareVariable")
  var declareVariable_Original: DeclareVariableBuilder = js.native
  
  def declaredPredicate(value: ExpressionKind): DeclaredPredicate = js.native
  @JSName("declaredPredicate")
  var declaredPredicate_Original: DeclaredPredicateBuilder = js.native
  
  def decorator(expression: ExpressionKind): Decorator = js.native
  @JSName("decorator")
  var decorator_Original: DecoratorBuilder = js.native
  
  def directive(value: DirectiveLiteralKind): Directive = js.native
  
  def directiveLiteral(): DirectiveLiteral = js.native
  def directiveLiteral(value: String): DirectiveLiteral = js.native
  @JSName("directiveLiteral")
  var directiveLiteral_Original: DirectiveLiteralBuilder = js.native
  
  @JSName("directive")
  var directive_Original: DirectiveBuilder = js.native
  
  def doExpression(body: js.Array[StatementKind]): DoExpression = js.native
  @JSName("doExpression")
  var doExpression_Original: DoExpressionBuilder = js.native
  
  def doWhileStatement(body: StatementKind, test: ExpressionKind): DoWhileStatement = js.native
  @JSName("doWhileStatement")
  var doWhileStatement_Original: DoWhileStatementBuilder = js.native
  
  def emptyStatement(): EmptyStatement = js.native
  @JSName("emptyStatement")
  var emptyStatement_Original: EmptyStatementBuilder = js.native
  
  def emptyTypeAnnotation(): EmptyTypeAnnotation = js.native
  @JSName("emptyTypeAnnotation")
  var emptyTypeAnnotation_Original: EmptyTypeAnnotationBuilder = js.native
  
  def enumBooleanBody(members: js.Array[EnumBooleanMemberKind], explicitType: Boolean): EnumBooleanBody = js.native
  @JSName("enumBooleanBody")
  var enumBooleanBody_Original: EnumBooleanBodyBuilder = js.native
  
  def enumBooleanMember(id: IdentifierKind, init: Boolean): EnumBooleanMember = js.native
  def enumBooleanMember(id: IdentifierKind, init: LiteralKind): EnumBooleanMember = js.native
  @JSName("enumBooleanMember")
  var enumBooleanMember_Original: EnumBooleanMemberBuilder = js.native
  
  def enumDeclaration(id: IdentifierKind, body: EnumBooleanBodyKind): EnumDeclaration = js.native
  def enumDeclaration(id: IdentifierKind, body: EnumNumberBodyKind): EnumDeclaration = js.native
  def enumDeclaration(id: IdentifierKind, body: EnumStringBodyKind): EnumDeclaration = js.native
  def enumDeclaration(id: IdentifierKind, body: EnumSymbolBodyKind): EnumDeclaration = js.native
  @JSName("enumDeclaration")
  var enumDeclaration_Original: EnumDeclarationBuilder = js.native
  
  def enumDefaultedMember(id: IdentifierKind): EnumDefaultedMember = js.native
  @JSName("enumDefaultedMember")
  var enumDefaultedMember_Original: EnumDefaultedMemberBuilder = js.native
  
  def enumNumberBody(members: js.Array[EnumNumberMemberKind], explicitType: Boolean): EnumNumberBody = js.native
  @JSName("enumNumberBody")
  var enumNumberBody_Original: EnumNumberBodyBuilder = js.native
  
  def enumNumberMember(id: IdentifierKind, init: LiteralKind): EnumNumberMember = js.native
  @JSName("enumNumberMember")
  var enumNumberMember_Original: EnumNumberMemberBuilder = js.native
  
  def enumStringBody(members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind], explicitType: Boolean): EnumStringBody = js.native
  @JSName("enumStringBody")
  var enumStringBody_Original: EnumStringBodyBuilder = js.native
  
  def enumStringMember(id: IdentifierKind, init: LiteralKind): EnumStringMember = js.native
  @JSName("enumStringMember")
  var enumStringMember_Original: EnumStringMemberBuilder = js.native
  
  def enumSymbolBody(members: js.Array[EnumDefaultedMemberKind]): EnumSymbolBody = js.native
  @JSName("enumSymbolBody")
  var enumSymbolBody_Original: EnumSymbolBodyBuilder = js.native
  
  def existentialTypeParam(): ExistentialTypeParam = js.native
  @JSName("existentialTypeParam")
  var existentialTypeParam_Original: ExistentialTypeParamBuilder = js.native
  
  def existsTypeAnnotation(): ExistsTypeAnnotation = js.native
  @JSName("existsTypeAnnotation")
  var existsTypeAnnotation_Original: ExistsTypeAnnotationBuilder = js.native
  
  def exportAllDeclaration(source: LiteralKind): ExportAllDeclaration = js.native
  def exportAllDeclaration(source: LiteralKind, exported: IdentifierKind): ExportAllDeclaration = js.native
  @JSName("exportAllDeclaration")
  var exportAllDeclaration_Original: ExportAllDeclarationBuilder = js.native
  
  def exportBatchSpecifier(): ExportBatchSpecifier = js.native
  @JSName("exportBatchSpecifier")
  var exportBatchSpecifier_Original: ExportBatchSpecifierBuilder = js.native
  
  def exportDeclaration(defaultParam: Boolean): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDeclaration(defaultParam: Boolean, declaration: DeclarationKind): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDeclaration(defaultParam: Boolean, declaration: ExpressionKind): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  @JSName("exportDeclaration")
  var exportDeclaration_Original: ExportDeclarationBuilder = js.native
  
  def exportDefaultDeclaration(declaration: DeclarationKind): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: ExpressionKind): ExportDefaultDeclaration = js.native
  @JSName("exportDefaultDeclaration")
  var exportDefaultDeclaration_Original: ExportDefaultDeclarationBuilder = js.native
  
  def exportDefaultSpecifier(exported: IdentifierKind): ExportDefaultSpecifier = js.native
  @JSName("exportDefaultSpecifier")
  var exportDefaultSpecifier_Original: ExportDefaultSpecifierBuilder = js.native
  
  def exportNamedDeclaration(): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Null, specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: DeclarationKind): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  var exportNamedDeclaration_Original: ExportNamedDeclarationBuilder = js.native
  
  def exportNamespaceSpecifier(exported: IdentifierKind): ExportNamespaceSpecifier = js.native
  @JSName("exportNamespaceSpecifier")
  var exportNamespaceSpecifier_Original: ExportNamespaceSpecifierBuilder = js.native
  
  def exportSpecifier(): ExportSpecifier = js.native
  def exportSpecifier(id: js.UndefOr[scala.Nothing], name: IdentifierKind): ExportSpecifier = js.native
  def exportSpecifier(id: Null, name: IdentifierKind): ExportSpecifier = js.native
  def exportSpecifier(id: IdentifierKind): ExportSpecifier = js.native
  def exportSpecifier(id: IdentifierKind, name: IdentifierKind): ExportSpecifier = js.native
  @JSName("exportSpecifier")
  var exportSpecifier_Original: ExportSpecifierBuilder = js.native
  
  def expressionStatement(expression: ExpressionKind): ExpressionStatement = js.native
  @JSName("expressionStatement")
  var expressionStatement_Original: ExpressionStatementBuilder = js.native
  
  def file(program: ProgramKind): File = js.native
  def file(program: ProgramKind, name: String): File = js.native
  @JSName("file")
  var file_Original: FileBuilder = js.native
  
  def forAwaitStatement(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement = js.native
  def forAwaitStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement = js.native
  @JSName("forAwaitStatement")
  var forAwaitStatement_Original: ForAwaitStatementBuilder = js.native
  
  def forInStatement(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def forInStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  @JSName("forInStatement")
  var forInStatement_Original: ForInStatementBuilder = js.native
  
  def forOfStatement(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  @JSName("forOfStatement")
  var forOfStatement_Original: ForOfStatementBuilder = js.native
  
  def forStatement(init: Null, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: Null, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: Null, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: Null, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  @JSName("forStatement")
  var forStatement_Original: ForStatementBuilder = js.native
  
  def functionDeclaration(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def functionDeclaration(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: js.UndefOr[scala.Nothing],
    expression: Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def functionDeclaration(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def functionDeclaration(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: js.UndefOr[scala.Nothing],
    expression: Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def functionDeclaration(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  @JSName("functionDeclaration")
  var functionDeclaration_Original: FunctionDeclarationBuilder = js.native
  
  def functionExpression(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: js.UndefOr[scala.Nothing],
    expression: Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def functionExpression(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def functionExpression(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: js.UndefOr[scala.Nothing],
    expression: Boolean
  ): FunctionExpression = js.native
  def functionExpression(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def functionExpression(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def functionExpression(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def functionExpression(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: js.UndefOr[scala.Nothing],
    expression: Boolean
  ): FunctionExpression = js.native
  def functionExpression(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def functionExpression(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  @JSName("functionExpression")
  var functionExpression_Original: FunctionExpressionBuilder = js.native
  
  def functionTypeAnnotation(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: Null,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind, rest: FunctionTypeParamKind): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: FunctionTypeParamKind,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  @JSName("functionTypeAnnotation")
  var functionTypeAnnotation_Original: FunctionTypeAnnotationBuilder = js.native
  
  def functionTypeParam(name: Null, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  def functionTypeParam(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  @JSName("functionTypeParam")
  var functionTypeParam_Original: FunctionTypeParamBuilder = js.native
  
  def generatorExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): GeneratorExpression = js.native
  def generatorExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): GeneratorExpression = js.native
  @JSName("generatorExpression")
  var generatorExpression_Original: GeneratorExpressionBuilder = js.native
  
  def genericTypeAnnotation(id: IdentifierKind): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: IdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifierKind): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  @JSName("genericTypeAnnotation")
  var genericTypeAnnotation_Original: GenericTypeAnnotationBuilder = js.native
  
  def identifier(name: String): Identifier = js.native
  @JSName("identifier")
  var identifier_Original: IdentifierBuilder = js.native
  
  def ifStatement(test: ExpressionKind, consequent: StatementKind): IfStatement = js.native
  def ifStatement(test: ExpressionKind, consequent: StatementKind, alternate: StatementKind): IfStatement = js.native
  @JSName("ifStatement")
  var ifStatement_Original: IfStatementBuilder = js.native
  
  def `import`(): Import = js.native
  
  def importDeclaration(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ImportDeclaration = js.native
  def importDeclaration(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  var importDeclaration_Original: ImportDeclarationBuilder = js.native
  @JSName("importDeclaration")
  def importDeclaration_type(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: `type`): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_type(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_typeof(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: typeof): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_typeof(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: typeof
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_value(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: value): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_value(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration = js.native
  
  def importDefaultSpecifier(): ImportDefaultSpecifier = js.native
  def importDefaultSpecifier(local: IdentifierKind): ImportDefaultSpecifier = js.native
  @JSName("importDefaultSpecifier")
  var importDefaultSpecifier_Original: ImportDefaultSpecifierBuilder = js.native
  
  def importExpression(source: ExpressionKind): ImportExpression = js.native
  @JSName("importExpression")
  var importExpression_Original: ImportExpressionBuilder = js.native
  
  def importNamespaceSpecifier(): ImportNamespaceSpecifier = js.native
  def importNamespaceSpecifier(local: IdentifierKind): ImportNamespaceSpecifier = js.native
  @JSName("importNamespaceSpecifier")
  var importNamespaceSpecifier_Original: ImportNamespaceSpecifierBuilder = js.native
  
  def importSpecifier(imported: IdentifierKind): ImportSpecifier = js.native
  def importSpecifier(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier = js.native
  @JSName("importSpecifier")
  var importSpecifier_Original: ImportSpecifierBuilder = js.native
  
  @JSName("import")
  var import_Original: ImportBuilder = js.native
  
  def inferredPredicate(): InferredPredicate = js.native
  @JSName("inferredPredicate")
  var inferredPredicate_Original: InferredPredicateBuilder = js.native
  
  def interfaceDeclaration(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceDeclaration = js.native
  @JSName("interfaceDeclaration")
  var interfaceDeclaration_Original: InterfaceDeclarationBuilder = js.native
  
  def interfaceExtends(id: IdentifierKind): InterfaceExtends = js.native
  @JSName("interfaceExtends")
  var interfaceExtends_Original: InterfaceExtendsBuilder = js.native
  
  def interfaceTypeAnnotation(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  @JSName("interfaceTypeAnnotation")
  var interfaceTypeAnnotation_Original: InterfaceTypeAnnotationBuilder = js.native
  
  def interpreterDirective(value: String): InterpreterDirective = js.native
  @JSName("interpreterDirective")
  var interpreterDirective_Original: InterpreterDirectiveBuilder = js.native
  
  def intersectionTypeAnnotation(types: js.Array[FlowTypeKind]): IntersectionTypeAnnotation = js.native
  @JSName("intersectionTypeAnnotation")
  var intersectionTypeAnnotation_Original: IntersectionTypeAnnotationBuilder = js.native
  
  def jsxAttribute(name: JSXIdentifierKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifierKind, value: JSXElementKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifierKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifierKind, value: JSXFragmentKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifierKind, value: LiteralKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind, value: JSXElementKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind, value: JSXFragmentKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind, value: LiteralKind): JSXAttribute = js.native
  @JSName("jsxAttribute")
  var jsxAttribute_Original: JSXAttributeBuilder = js.native
  
  def jsxClosingElement(name: JSXIdentifierKind): JSXClosingElement = js.native
  def jsxClosingElement(name: JSXMemberExpressionKind): JSXClosingElement = js.native
  def jsxClosingElement(name: JSXNamespacedNameKind): JSXClosingElement = js.native
  @JSName("jsxClosingElement")
  var jsxClosingElement_Original: JSXClosingElementBuilder = js.native
  
  def jsxClosingFragment(): JSXClosingFragment = js.native
  @JSName("jsxClosingFragment")
  var jsxClosingFragment_Original: JSXClosingFragmentBuilder = js.native
  
  def jsxElement(openingElement: JSXOpeningElementKind): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: Null,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement = js.native
  def jsxElement(openingElement: JSXOpeningElementKind, closingElement: JSXClosingElementKind): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: JSXClosingElementKind,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement = js.native
  @JSName("jsxElement")
  var jsxElement_Original: JSXElementBuilder = js.native
  
  def jsxEmptyExpression(): JSXEmptyExpression = js.native
  @JSName("jsxEmptyExpression")
  var jsxEmptyExpression_Original: JSXEmptyExpressionBuilder = js.native
  
  def jsxExpressionContainer(expression: ExpressionKind): JSXExpressionContainer = js.native
  def jsxExpressionContainer(expression: JSXEmptyExpressionKind): JSXExpressionContainer = js.native
  @JSName("jsxExpressionContainer")
  var jsxExpressionContainer_Original: JSXExpressionContainerBuilder = js.native
  
  def jsxFragment(openingFragment: JSXOpeningFragmentKind, closingFragment: JSXClosingFragmentKind): JSXFragment = js.native
  def jsxFragment(
    openingFragment: JSXOpeningFragmentKind,
    closingFragment: JSXClosingFragmentKind,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXFragment = js.native
  @JSName("jsxFragment")
  var jsxFragment_Original: JSXFragmentBuilder = js.native
  
  def jsxIdentifier(name: String): JSXIdentifier = js.native
  @JSName("jsxIdentifier")
  var jsxIdentifier_Original: JSXIdentifierBuilder = js.native
  
  def jsxMemberExpression(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def jsxMemberExpression(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  @JSName("jsxMemberExpression")
  var jsxMemberExpression_Original: JSXMemberExpressionBuilder = js.native
  
  def jsxNamespacedName(namespace: JSXIdentifierKind, name: JSXIdentifierKind): JSXNamespacedName = js.native
  @JSName("jsxNamespacedName")
  var jsxNamespacedName_Original: JSXNamespacedNameBuilder = js.native
  
  def jsxOpeningElement(name: JSXIdentifierKind): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXIdentifierKind, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXIdentifierKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXIdentifierKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXMemberExpressionKind): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXMemberExpressionKind, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXMemberExpressionKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpressionKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXNamespacedNameKind): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXNamespacedNameKind, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXNamespacedNameKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXNamespacedNameKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  @JSName("jsxOpeningElement")
  var jsxOpeningElement_Original: JSXOpeningElementBuilder = js.native
  
  def jsxOpeningFragment(): JSXOpeningFragment = js.native
  @JSName("jsxOpeningFragment")
  var jsxOpeningFragment_Original: JSXOpeningFragmentBuilder = js.native
  
  def jsxSpreadAttribute(argument: ExpressionKind): JSXSpreadAttribute = js.native
  @JSName("jsxSpreadAttribute")
  var jsxSpreadAttribute_Original: JSXSpreadAttributeBuilder = js.native
  
  def jsxSpreadChild(expression: ExpressionKind): JSXSpreadChild = js.native
  @JSName("jsxSpreadChild")
  var jsxSpreadChild_Original: JSXSpreadChildBuilder = js.native
  
  def jsxText(value: String): JSXText = js.native
  def jsxText(value: String, raw: String): JSXText = js.native
  @JSName("jsxText")
  var jsxText_Original: JSXTextBuilder = js.native
  
  def labeledStatement(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  @JSName("labeledStatement")
  var labeledStatement_Original: LabeledStatementBuilder = js.native
  
  def line(value: String): Line = js.native
  def line(value: String, leading: js.UndefOr[scala.Nothing], trailing: Boolean): Line = js.native
  def line(value: String, leading: Boolean): Line = js.native
  def line(value: String, leading: Boolean, trailing: Boolean): Line = js.native
  @JSName("line")
  var line_Original: LineBuilder = js.native
  
  def literal(): Literal = js.native
  def literal(value: String): Literal = js.native
  def literal(value: Boolean): Literal = js.native
  def literal(value: Double): Literal = js.native
  def literal(value: js.RegExp): Literal = js.native
  @JSName("literal")
  var literal_Original: LiteralBuilder = js.native
  
  def logicalExpression(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def logicalExpression(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def logicalExpression(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  @JSName("logicalExpression")
  var logicalExpression_Original: LogicalExpressionBuilder = js.native
  
  def memberExpression(`object`: ExpressionKind, property: ExpressionKind): MemberExpression = js.native
  def memberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): MemberExpression = js.native
  def memberExpression(`object`: ExpressionKind, property: IdentifierKind): MemberExpression = js.native
  def memberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): MemberExpression = js.native
  @JSName("memberExpression")
  var memberExpression_Original: MemberExpressionBuilder = js.native
  
  def memberTypeAnnotation(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation = js.native
  def memberTypeAnnotation(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation = js.native
  @JSName("memberTypeAnnotation")
  var memberTypeAnnotation_Original: MemberTypeAnnotationBuilder = js.native
  
  def metaProperty(meta: IdentifierKind, property: IdentifierKind): MetaProperty = js.native
  @JSName("metaProperty")
  var metaProperty_Original: MetaPropertyBuilder = js.native
  
  @JSName("methodDefinition")
  var methodDefinition_Original: MethodDefinitionBuilder = js.native
  @JSName("methodDefinition")
  def methodDefinition_constructor(kind: constructor, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_constructor(kind: constructor, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_get(kind: get, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_get(kind: get, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_method(kind: method, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_method(kind: method, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_set(kind: set, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_set(kind: set, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  
  def mixedTypeAnnotation(): MixedTypeAnnotation = js.native
  @JSName("mixedTypeAnnotation")
  var mixedTypeAnnotation_Original: MixedTypeAnnotationBuilder = js.native
  
  def newExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): NewExpression = js.native
  @JSName("newExpression")
  var newExpression_Original: NewExpressionBuilder = js.native
  
  def noop(): Noop = js.native
  @JSName("noop")
  var noop_Original: NoopBuilder = js.native
  
  def nullLiteral(): NullLiteral = js.native
  
  def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation = js.native
  @JSName("nullLiteralTypeAnnotation")
  var nullLiteralTypeAnnotation_Original: NullLiteralTypeAnnotationBuilder = js.native
  
  @JSName("nullLiteral")
  var nullLiteral_Original: NullLiteralBuilder = js.native
  
  def nullTypeAnnotation(): NullTypeAnnotation = js.native
  @JSName("nullTypeAnnotation")
  var nullTypeAnnotation_Original: NullTypeAnnotationBuilder = js.native
  
  def nullableTypeAnnotation(typeAnnotation: FlowTypeKind): NullableTypeAnnotation = js.native
  @JSName("nullableTypeAnnotation")
  var nullableTypeAnnotation_Original: NullableTypeAnnotationBuilder = js.native
  
  def numberLiteralTypeAnnotation(value: Double, raw: String): NumberLiteralTypeAnnotation = js.native
  @JSName("numberLiteralTypeAnnotation")
  var numberLiteralTypeAnnotation_Original: NumberLiteralTypeAnnotationBuilder = js.native
  
  def numberTypeAnnotation(): NumberTypeAnnotation = js.native
  @JSName("numberTypeAnnotation")
  var numberTypeAnnotation_Original: NumberTypeAnnotationBuilder = js.native
  
  def numericLiteral(value: Double): NumericLiteral = js.native
  
  def numericLiteralTypeAnnotation(value: Double, raw: String): NumericLiteralTypeAnnotation = js.native
  @JSName("numericLiteralTypeAnnotation")
  var numericLiteralTypeAnnotation_Original: NumericLiteralTypeAnnotationBuilder = js.native
  
  @JSName("numericLiteral")
  var numericLiteral_Original: NumericLiteralBuilder = js.native
  
  def objectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): ObjectExpression = js.native
  @JSName("objectExpression")
  var objectExpression_Original: ObjectExpressionBuilder = js.native
  
  @JSName("objectMethod")
  var objectMethod_Original: ObjectMethodBuilder = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  
  def objectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ]
  ): ObjectPattern = js.native
  @JSName("objectPattern")
  var objectPattern_Original: ObjectPatternBuilder = js.native
  
  def objectProperty(key: ExpressionKind, value: ExpressionKind): ObjectProperty = js.native
  def objectProperty(key: ExpressionKind, value: PatternKind): ObjectProperty = js.native
  def objectProperty(key: IdentifierKind, value: ExpressionKind): ObjectProperty = js.native
  def objectProperty(key: IdentifierKind, value: PatternKind): ObjectProperty = js.native
  def objectProperty(key: LiteralKind, value: ExpressionKind): ObjectProperty = js.native
  def objectProperty(key: LiteralKind, value: PatternKind): ObjectProperty = js.native
  @JSName("objectProperty")
  var objectProperty_Original: ObjectPropertyBuilder = js.native
  
  def objectTypeAnnotation(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.UndefOr[scala.Nothing],
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation = js.native
  @JSName("objectTypeAnnotation")
  var objectTypeAnnotation_Original: ObjectTypeAnnotationBuilder = js.native
  
  def objectTypeCallProperty(value: FunctionTypeAnnotationKind): ObjectTypeCallProperty = js.native
  @JSName("objectTypeCallProperty")
  var objectTypeCallProperty_Original: ObjectTypeCallPropertyBuilder = js.native
  
  def objectTypeIndexer(id: IdentifierKind, key: FlowTypeKind, value: FlowTypeKind): ObjectTypeIndexer = js.native
  @JSName("objectTypeIndexer")
  var objectTypeIndexer_Original: ObjectTypeIndexerBuilder = js.native
  
  def objectTypeInternalSlot(id: IdentifierKind, value: FlowTypeKind, optional: Boolean, staticParam: Boolean, method: Boolean): ObjectTypeInternalSlot = js.native
  @JSName("objectTypeInternalSlot")
  var objectTypeInternalSlot_Original: ObjectTypeInternalSlotBuilder = js.native
  
  def objectTypeProperty(key: IdentifierKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def objectTypeProperty(key: LiteralKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  var objectTypeProperty_Original: ObjectTypePropertyBuilder = js.native
  
  def objectTypeSpreadProperty(argument: FlowTypeKind): ObjectTypeSpreadProperty = js.native
  @JSName("objectTypeSpreadProperty")
  var objectTypeSpreadProperty_Original: ObjectTypeSpreadPropertyBuilder = js.native
  
  def opaqueType(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind): OpaqueType = js.native
  def opaqueType(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind, supertype: FlowTypeKind): OpaqueType = js.native
  def opaqueType(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, impltype: FlowTypeKind): OpaqueType = js.native
  def opaqueType(
    id: IdentifierKind,
    typeParameters: TypeParameterDeclarationKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind
  ): OpaqueType = js.native
  @JSName("opaqueType")
  var opaqueType_Original: OpaqueTypeBuilder = js.native
  
  def optionalCallExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: ExpressionKind,
    argumentsParam: js.Array[ExpressionKind | SpreadElementKind],
    optional: Boolean
  ): OptionalCallExpression = js.native
  @JSName("optionalCallExpression")
  var optionalCallExpression_Original: OptionalCallExpressionBuilder = js.native
  
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind): OptionalMemberExpression = js.native
  def optionalMemberExpression(
    `object`: ExpressionKind,
    property: ExpressionKind,
    computed: js.UndefOr[scala.Nothing],
    optional: Boolean
  ): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind): OptionalMemberExpression = js.native
  def optionalMemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind,
    computed: js.UndefOr[scala.Nothing],
    optional: Boolean
  ): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  @JSName("optionalMemberExpression")
  var optionalMemberExpression_Original: OptionalMemberExpressionBuilder = js.native
  
  def parenthesizedExpression(expression: ExpressionKind): ParenthesizedExpression = js.native
  @JSName("parenthesizedExpression")
  var parenthesizedExpression_Original: ParenthesizedExpressionBuilder = js.native
  
  def privateName(id: IdentifierKind): PrivateName = js.native
  @JSName("privateName")
  var privateName_Original: PrivateNameBuilder = js.native
  
  def program(body: js.Array[StatementKind]): Program = js.native
  @JSName("program")
  var program_Original: ProgramBuilder = js.native
  
  def propertyPattern(key: ExpressionKind, pattern: PatternKind): PropertyPattern = js.native
  def propertyPattern(key: IdentifierKind, pattern: PatternKind): PropertyPattern = js.native
  def propertyPattern(key: LiteralKind, pattern: PatternKind): PropertyPattern = js.native
  @JSName("propertyPattern")
  var propertyPattern_Original: PropertyPatternBuilder = js.native
  
  @JSName("property")
  var property_Original: PropertyBuilder = js.native
  @JSName("property")
  def property_get(kind: get, key: ExpressionKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: ExpressionKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: IdentifierKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: IdentifierKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: LiteralKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: LiteralKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: ExpressionKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: ExpressionKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: IdentifierKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: IdentifierKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: LiteralKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: LiteralKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: ExpressionKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: ExpressionKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: IdentifierKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: IdentifierKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: LiteralKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: LiteralKind, value: PatternKind): Property = js.native
  
  def qualifiedTypeIdentifier(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  @JSName("qualifiedTypeIdentifier")
  var qualifiedTypeIdentifier_Original: QualifiedTypeIdentifierBuilder = js.native
  
  def regExpLiteral(pattern: String, flags: String): RegExpLiteral = js.native
  @JSName("regExpLiteral")
  var regExpLiteral_Original: RegExpLiteralBuilder = js.native
  
  def restElement(argument: PatternKind): RestElement = js.native
  @JSName("restElement")
  var restElement_Original: RestElementBuilder = js.native
  
  def restProperty(argument: ExpressionKind): RestProperty = js.native
  @JSName("restProperty")
  var restProperty_Original: RestPropertyBuilder = js.native
  
  def returnStatement(): ReturnStatement = js.native
  def returnStatement(argument: ExpressionKind): ReturnStatement = js.native
  @JSName("returnStatement")
  var returnStatement_Original: ReturnStatementBuilder = js.native
  
  def sequenceExpression(expressions: js.Array[ExpressionKind]): SequenceExpression = js.native
  @JSName("sequenceExpression")
  var sequenceExpression_Original: SequenceExpressionBuilder = js.native
  
  def spreadElement(argument: ExpressionKind): SpreadElement = js.native
  
  def spreadElementPattern(argument: PatternKind): SpreadElementPattern = js.native
  @JSName("spreadElementPattern")
  var spreadElementPattern_Original: SpreadElementPatternBuilder = js.native
  
  @JSName("spreadElement")
  var spreadElement_Original: SpreadElementBuilder = js.native
  
  def spreadProperty(argument: ExpressionKind): SpreadProperty = js.native
  
  def spreadPropertyPattern(argument: PatternKind): SpreadPropertyPattern = js.native
  @JSName("spreadPropertyPattern")
  var spreadPropertyPattern_Original: SpreadPropertyPatternBuilder = js.native
  
  @JSName("spreadProperty")
  var spreadProperty_Original: SpreadPropertyBuilder = js.native
  
  def stringLiteral(value: String): StringLiteral = js.native
  
  def stringLiteralTypeAnnotation(value: String, raw: String): StringLiteralTypeAnnotation = js.native
  @JSName("stringLiteralTypeAnnotation")
  var stringLiteralTypeAnnotation_Original: StringLiteralTypeAnnotationBuilder = js.native
  
  @JSName("stringLiteral")
  var stringLiteral_Original: StringLiteralBuilder = js.native
  
  def stringTypeAnnotation(): StringTypeAnnotation = js.native
  @JSName("stringTypeAnnotation")
  var stringTypeAnnotation_Original: StringTypeAnnotationBuilder = js.native
  
  def `super`(): Super = js.native
  @JSName("super")
  var super_Original: SuperBuilder = js.native
  
  def switchCase(test: Null, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def switchCase(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase = js.native
  @JSName("switchCase")
  var switchCase_Original: SwitchCaseBuilder = js.native
  
  def switchStatement(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind]): SwitchStatement = js.native
  def switchStatement(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind], lexical: Boolean): SwitchStatement = js.native
  @JSName("switchStatement")
  var switchStatement_Original: SwitchStatementBuilder = js.native
  
  def symbolTypeAnnotation(): SymbolTypeAnnotation = js.native
  @JSName("symbolTypeAnnotation")
  var symbolTypeAnnotation_Original: SymbolTypeAnnotationBuilder = js.native
  
  def taggedTemplateExpression(tag: ExpressionKind, quasi: TemplateLiteralKind): TaggedTemplateExpression = js.native
  @JSName("taggedTemplateExpression")
  var taggedTemplateExpression_Original: TaggedTemplateExpressionBuilder = js.native
  
  def templateElement(value: Cooked, tail: Boolean): TemplateElement = js.native
  @JSName("templateElement")
  var templateElement_Original: TemplateElementBuilder = js.native
  
  def templateLiteral(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral = js.native
  @JSName("templateLiteral")
  var templateLiteral_Original: TemplateLiteralBuilder = js.native
  
  def thisExpression(): ThisExpression = js.native
  @JSName("thisExpression")
  var thisExpression_Original: ThisExpressionBuilder = js.native
  
  def thisTypeAnnotation(): ThisTypeAnnotation = js.native
  @JSName("thisTypeAnnotation")
  var thisTypeAnnotation_Original: ThisTypeAnnotationBuilder = js.native
  
  def throwStatement(argument: ExpressionKind): ThrowStatement = js.native
  @JSName("throwStatement")
  var throwStatement_Original: ThrowStatementBuilder = js.native
  
  def tryStatement(block: BlockStatementKind): TryStatement = js.native
  def tryStatement(block: BlockStatementKind, handler: js.UndefOr[scala.Nothing], finalizer: BlockStatementKind): TryStatement = js.native
  def tryStatement(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement = js.native
  def tryStatement(block: BlockStatementKind, handler: CatchClauseKind): TryStatement = js.native
  def tryStatement(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement = js.native
  @JSName("tryStatement")
  var tryStatement_Original: TryStatementBuilder = js.native
  
  def tsAnyKeyword(): TSAnyKeyword = js.native
  @JSName("tsAnyKeyword")
  var tsAnyKeyword_Original: TSAnyKeywordBuilder = js.native
  
  def tsArrayType(elementType: TSTypeKind): TSArrayType = js.native
  @JSName("tsArrayType")
  var tsArrayType_Original: TSArrayTypeBuilder = js.native
  
  def tsAsExpression(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  @JSName("tsAsExpression")
  var tsAsExpression_Original: TSAsExpressionBuilder = js.native
  
  def tsBigIntKeyword(): TSBigIntKeyword = js.native
  @JSName("tsBigIntKeyword")
  var tsBigIntKeyword_Original: TSBigIntKeywordBuilder = js.native
  
  def tsBooleanKeyword(): TSBooleanKeyword = js.native
  @JSName("tsBooleanKeyword")
  var tsBooleanKeyword_Original: TSBooleanKeywordBuilder = js.native
  
  def tsCallSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSCallSignatureDeclaration = js.native
  @JSName("tsCallSignatureDeclaration")
  var tsCallSignatureDeclaration_Original: TSCallSignatureDeclarationBuilder = js.native
  
  def tsConditionalType(checkType: TSTypeKind, extendsType: TSTypeKind, trueType: TSTypeKind, falseType: TSTypeKind): TSConditionalType = js.native
  @JSName("tsConditionalType")
  var tsConditionalType_Original: TSConditionalTypeBuilder = js.native
  
  def tsConstructSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSConstructSignatureDeclaration = js.native
  @JSName("tsConstructSignatureDeclaration")
  var tsConstructSignatureDeclaration_Original: TSConstructSignatureDeclarationBuilder = js.native
  
  def tsConstructorType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructorType = js.native
  @JSName("tsConstructorType")
  var tsConstructorType_Original: TSConstructorTypeBuilder = js.native
  
  def tsDeclareFunction(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def tsDeclareFunction(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  @JSName("tsDeclareFunction")
  var tsDeclareFunction_Original: TSDeclareFunctionBuilder = js.native
  
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  @JSName("tsDeclareMethod")
  var tsDeclareMethod_Original: TSDeclareMethodBuilder = js.native
  
  def tsEnumDeclaration(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration = js.native
  @JSName("tsEnumDeclaration")
  var tsEnumDeclaration_Original: TSEnumDeclarationBuilder = js.native
  
  def tsEnumMember(id: IdentifierKind): TSEnumMember = js.native
  def tsEnumMember(id: IdentifierKind, initializer: ExpressionKind): TSEnumMember = js.native
  def tsEnumMember(id: StringLiteralKind): TSEnumMember = js.native
  def tsEnumMember(id: StringLiteralKind, initializer: ExpressionKind): TSEnumMember = js.native
  @JSName("tsEnumMember")
  var tsEnumMember_Original: TSEnumMemberBuilder = js.native
  
  def tsExportAssignment(expression: ExpressionKind): TSExportAssignment = js.native
  @JSName("tsExportAssignment")
  var tsExportAssignment_Original: TSExportAssignmentBuilder = js.native
  
  def tsExpressionWithTypeArguments(expression: IdentifierKind): TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  @JSName("tsExpressionWithTypeArguments")
  var tsExpressionWithTypeArguments_Original: TSExpressionWithTypeArgumentsBuilder = js.native
  
  def tsExternalModuleReference(expression: StringLiteralKind): TSExternalModuleReference = js.native
  @JSName("tsExternalModuleReference")
  var tsExternalModuleReference_Original: TSExternalModuleReferenceBuilder = js.native
  
  def tsFunctionType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSFunctionType = js.native
  @JSName("tsFunctionType")
  var tsFunctionType_Original: TSFunctionTypeBuilder = js.native
  
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: IdentifierKind): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: TSExternalModuleReferenceKind): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: TSQualifiedNameKind): TSImportEqualsDeclaration = js.native
  @JSName("tsImportEqualsDeclaration")
  var tsImportEqualsDeclaration_Original: TSImportEqualsDeclarationBuilder = js.native
  
  def tsImportType(argument: StringLiteralKind): TSImportType = js.native
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: js.UndefOr[scala.Nothing],
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def tsImportType(argument: StringLiteralKind, qualifier: IdentifierKind): TSImportType = js.native
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: IdentifierKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def tsImportType(argument: StringLiteralKind, qualifier: TSQualifiedNameKind): TSImportType = js.native
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: TSQualifiedNameKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  @JSName("tsImportType")
  var tsImportType_Original: TSImportTypeBuilder = js.native
  
  def tsIndexSignature(parameters: js.Array[IdentifierKind]): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature = js.native
  @JSName("tsIndexSignature")
  var tsIndexSignature_Original: TSIndexSignatureBuilder = js.native
  
  def tsIndexedAccessType(objectType: TSTypeKind, indexType: TSTypeKind): TSIndexedAccessType = js.native
  @JSName("tsIndexedAccessType")
  var tsIndexedAccessType_Original: TSIndexedAccessTypeBuilder = js.native
  
  def tsInferType(typeParameter: TSTypeParameterKind): TSInferType = js.native
  @JSName("tsInferType")
  var tsInferType_Original: TSInferTypeBuilder = js.native
  
  def tsInterfaceBody(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSInterfaceBody = js.native
  @JSName("tsInterfaceBody")
  var tsInterfaceBody_Original: TSInterfaceBodyBuilder = js.native
  
  def tsInterfaceDeclaration(id: IdentifierKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: TSQualifiedNameKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  @JSName("tsInterfaceDeclaration")
  var tsInterfaceDeclaration_Original: TSInterfaceDeclarationBuilder = js.native
  
  def tsIntersectionType(types: js.Array[TSTypeKind]): TSIntersectionType = js.native
  @JSName("tsIntersectionType")
  var tsIntersectionType_Original: TSIntersectionTypeBuilder = js.native
  
  def tsLiteralType(literal: BooleanLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: NumericLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: StringLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: TemplateLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: UnaryExpressionKind): TSLiteralType = js.native
  @JSName("tsLiteralType")
  var tsLiteralType_Original: TSLiteralTypeBuilder = js.native
  
  def tsMappedType(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  @JSName("tsMappedType")
  var tsMappedType_Original: TSMappedTypeBuilder = js.native
  
  def tsMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSMethodSignature = js.native
  @JSName("tsMethodSignature")
  var tsMethodSignature_Original: TSMethodSignatureBuilder = js.native
  
  def tsModuleBlock(body: js.Array[StatementKind]): TSModuleBlock = js.native
  @JSName("tsModuleBlock")
  var tsModuleBlock_Original: TSModuleBlockBuilder = js.native
  
  def tsModuleDeclaration(id: IdentifierKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: IdentifierKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: IdentifierKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteralKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteralKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteralKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: TSQualifiedNameKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: TSQualifiedNameKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: TSQualifiedNameKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  @JSName("tsModuleDeclaration")
  var tsModuleDeclaration_Original: TSModuleDeclarationBuilder = js.native
  
  def tsNamedTupleMember(label: IdentifierKind, elementType: TSTypeKind): TSNamedTupleMember = js.native
  def tsNamedTupleMember(label: IdentifierKind, elementType: TSTypeKind, optional: Boolean): TSNamedTupleMember = js.native
  @JSName("tsNamedTupleMember")
  var tsNamedTupleMember_Original: TSNamedTupleMemberBuilder = js.native
  
  def tsNamespaceExportDeclaration(id: IdentifierKind): TSNamespaceExportDeclaration = js.native
  @JSName("tsNamespaceExportDeclaration")
  var tsNamespaceExportDeclaration_Original: TSNamespaceExportDeclarationBuilder = js.native
  
  def tsNeverKeyword(): TSNeverKeyword = js.native
  @JSName("tsNeverKeyword")
  var tsNeverKeyword_Original: TSNeverKeywordBuilder = js.native
  
  def tsNonNullExpression(expression: ExpressionKind): TSNonNullExpression = js.native
  @JSName("tsNonNullExpression")
  var tsNonNullExpression_Original: TSNonNullExpressionBuilder = js.native
  
  def tsNullKeyword(): TSNullKeyword = js.native
  @JSName("tsNullKeyword")
  var tsNullKeyword_Original: TSNullKeywordBuilder = js.native
  
  def tsNumberKeyword(): TSNumberKeyword = js.native
  @JSName("tsNumberKeyword")
  var tsNumberKeyword_Original: TSNumberKeywordBuilder = js.native
  
  def tsObjectKeyword(): TSObjectKeyword = js.native
  @JSName("tsObjectKeyword")
  var tsObjectKeyword_Original: TSObjectKeywordBuilder = js.native
  
  def tsOptionalType(typeAnnotation: TSTypeKind): TSOptionalType = js.native
  @JSName("tsOptionalType")
  var tsOptionalType_Original: TSOptionalTypeBuilder = js.native
  
  def tsParameterProperty(parameter: AssignmentPatternKind): TSParameterProperty = js.native
  def tsParameterProperty(parameter: IdentifierKind): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  var tsParameterProperty_Original: TSParameterPropertyBuilder = js.native
  
  def tsParenthesizedType(typeAnnotation: TSTypeKind): TSParenthesizedType = js.native
  @JSName("tsParenthesizedType")
  var tsParenthesizedType_Original: TSParenthesizedTypeBuilder = js.native
  
  def tsPropertySignature(key: ExpressionKind): TSPropertySignature = js.native
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: js.UndefOr[scala.Nothing], optional: Boolean): TSPropertySignature = js.native
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: Null, optional: Boolean): TSPropertySignature = js.native
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): TSPropertySignature = js.native
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind, optional: Boolean): TSPropertySignature = js.native
  @JSName("tsPropertySignature")
  var tsPropertySignature_Original: TSPropertySignatureBuilder = js.native
  
  def tsQualifiedName(left: IdentifierKind, right: IdentifierKind): TSQualifiedName = js.native
  def tsQualifiedName(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def tsQualifiedName(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName = js.native
  def tsQualifiedName(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  @JSName("tsQualifiedName")
  var tsQualifiedName_Original: TSQualifiedNameBuilder = js.native
  
  def tsRestType(typeAnnotation: TSTypeKind): TSRestType = js.native
  @JSName("tsRestType")
  var tsRestType_Original: TSRestTypeBuilder = js.native
  
  def tsStringKeyword(): TSStringKeyword = js.native
  @JSName("tsStringKeyword")
  var tsStringKeyword_Original: TSStringKeywordBuilder = js.native
  
  def tsSymbolKeyword(): TSSymbolKeyword = js.native
  @JSName("tsSymbolKeyword")
  var tsSymbolKeyword_Original: TSSymbolKeywordBuilder = js.native
  
  def tsThisType(): TSThisType = js.native
  @JSName("tsThisType")
  var tsThisType_Original: TSThisTypeBuilder = js.native
  
  def tsTupleType(elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind]): TSTupleType = js.native
  @JSName("tsTupleType")
  var tsTupleType_Original: TSTupleTypeBuilder = js.native
  
  def tsTypeAliasDeclaration(id: IdentifierKind, typeAnnotation: TSTypeKind): TSTypeAliasDeclaration = js.native
  @JSName("tsTypeAliasDeclaration")
  var tsTypeAliasDeclaration_Original: TSTypeAliasDeclarationBuilder = js.native
  
  def tsTypeAnnotation(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation = js.native
  def tsTypeAnnotation(typeAnnotation: TSTypeKind): TSTypeAnnotation = js.native
  @JSName("tsTypeAnnotation")
  var tsTypeAnnotation_Original: TSTypeAnnotationBuilder = js.native
  
  def tsTypeAssertion(typeAnnotation: TSTypeKind, expression: ExpressionKind): TSTypeAssertion = js.native
  @JSName("tsTypeAssertion")
  var tsTypeAssertion_Original: TSTypeAssertionBuilder = js.native
  
  def tsTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSTypeLiteral = js.native
  @JSName("tsTypeLiteral")
  var tsTypeLiteral_Original: TSTypeLiteralBuilder = js.native
  
  def tsTypeOperator(operator: String): TSTypeOperator = js.native
  @JSName("tsTypeOperator")
  var tsTypeOperator_Original: TSTypeOperatorBuilder = js.native
  
  def tsTypeParameter(name: String): TSTypeParameter = js.native
  def tsTypeParameter(name: String, constraint: js.UndefOr[scala.Nothing], defaultParam: TSTypeKind): TSTypeParameter = js.native
  def tsTypeParameter(name: String, constraint: TSTypeKind): TSTypeParameter = js.native
  def tsTypeParameter(name: String, constraint: TSTypeKind, defaultParam: TSTypeKind): TSTypeParameter = js.native
  
  def tsTypeParameterDeclaration(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration = js.native
  @JSName("tsTypeParameterDeclaration")
  var tsTypeParameterDeclaration_Original: TSTypeParameterDeclarationBuilder = js.native
  
  def tsTypeParameterInstantiation(params: js.Array[TSTypeKind]): TSTypeParameterInstantiation = js.native
  @JSName("tsTypeParameterInstantiation")
  var tsTypeParameterInstantiation_Original: TSTypeParameterInstantiationBuilder = js.native
  
  @JSName("tsTypeParameter")
  var tsTypeParameter_Original: TSTypeParameterBuilder = js.native
  
  def tsTypePredicate(parameterName: IdentifierKind): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: js.UndefOr[scala.Nothing], asserts: Boolean): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind, asserts: Boolean): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisTypeKind): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: js.UndefOr[scala.Nothing], asserts: Boolean): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind, asserts: Boolean): TSTypePredicate = js.native
  @JSName("tsTypePredicate")
  var tsTypePredicate_Original: TSTypePredicateBuilder = js.native
  
  def tsTypeQuery(exprName: IdentifierKind): TSTypeQuery = js.native
  def tsTypeQuery(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def tsTypeQuery(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  @JSName("tsTypeQuery")
  var tsTypeQuery_Original: TSTypeQueryBuilder = js.native
  
  def tsTypeReference(typeName: IdentifierKind): TSTypeReference = js.native
  def tsTypeReference(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def tsTypeReference(typeName: TSQualifiedNameKind): TSTypeReference = js.native
  def tsTypeReference(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  @JSName("tsTypeReference")
  var tsTypeReference_Original: TSTypeReferenceBuilder = js.native
  
  def tsUndefinedKeyword(): TSUndefinedKeyword = js.native
  @JSName("tsUndefinedKeyword")
  var tsUndefinedKeyword_Original: TSUndefinedKeywordBuilder = js.native
  
  def tsUnionType(types: js.Array[TSTypeKind]): TSUnionType = js.native
  @JSName("tsUnionType")
  var tsUnionType_Original: TSUnionTypeBuilder = js.native
  
  def tsUnknownKeyword(): TSUnknownKeyword = js.native
  @JSName("tsUnknownKeyword")
  var tsUnknownKeyword_Original: TSUnknownKeywordBuilder = js.native
  
  def tsVoidKeyword(): TSVoidKeyword = js.native
  @JSName("tsVoidKeyword")
  var tsVoidKeyword_Original: TSVoidKeywordBuilder = js.native
  
  def tupleTypeAnnotation(types: js.Array[FlowTypeKind]): TupleTypeAnnotation = js.native
  @JSName("tupleTypeAnnotation")
  var tupleTypeAnnotation_Original: TupleTypeAnnotationBuilder = js.native
  
  def typeAlias(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): TypeAlias = js.native
  def typeAlias(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): TypeAlias = js.native
  @JSName("typeAlias")
  var typeAlias_Original: TypeAliasBuilder = js.native
  
  def typeAnnotation(typeAnnotation: FlowTypeKind): TypeAnnotation = js.native
  @JSName("typeAnnotation")
  var typeAnnotation_Original: TypeAnnotationBuilder = js.native
  
  def typeCastExpression(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): TypeCastExpression = js.native
  @JSName("typeCastExpression")
  var typeCastExpression_Original: TypeCastExpressionBuilder = js.native
  
  def typeParameter(name: String): TypeParameter = js.native
  def typeParameter(
    name: String,
    variance: js.UndefOr[scala.Nothing],
    bound: js.UndefOr[scala.Nothing],
    defaultParam: FlowTypeKind
  ): TypeParameter = js.native
  def typeParameter(name: String, variance: js.UndefOr[scala.Nothing], bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def typeParameter(name: String, variance: js.UndefOr[scala.Nothing], bound: TypeAnnotationKind): TypeParameter = js.native
  def typeParameter(
    name: String,
    variance: js.UndefOr[scala.Nothing],
    bound: TypeAnnotationKind,
    defaultParam: FlowTypeKind
  ): TypeParameter = js.native
  def typeParameter(name: String, variance: Null, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  def typeParameter(name: String, variance: Null, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def typeParameter(name: String, variance: Null, bound: TypeAnnotationKind): TypeParameter = js.native
  def typeParameter(name: String, variance: Null, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  def typeParameter(name: String, variance: VarianceKind): TypeParameter = js.native
  def typeParameter(name: String, variance: VarianceKind, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  def typeParameter(name: String, variance: VarianceKind, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  def typeParameter(name: String, variance: VarianceKind, bound: TypeAnnotationKind): TypeParameter = js.native
  def typeParameter(name: String, variance: VarianceKind, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  
  def typeParameterDeclaration(params: js.Array[TypeParameterKind]): TypeParameterDeclaration = js.native
  @JSName("typeParameterDeclaration")
  var typeParameterDeclaration_Original: TypeParameterDeclarationBuilder = js.native
  
  def typeParameterInstantiation(params: js.Array[FlowTypeKind]): TypeParameterInstantiation = js.native
  @JSName("typeParameterInstantiation")
  var typeParameterInstantiation_Original: TypeParameterInstantiationBuilder = js.native
  
  @JSName("typeParameter")
  var typeParameter_Original: TypeParameterBuilder = js.native
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: TypeAnnotationKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: js.UndefOr[scala.Nothing], defaultParam: FlowTypeKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: Null, defaultParam: FlowTypeKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: TypeAnnotationKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter = js.native
  
  def typeofTypeAnnotation(argument: FlowTypeKind): TypeofTypeAnnotation = js.native
  @JSName("typeofTypeAnnotation")
  var typeofTypeAnnotation_Original: TypeofTypeAnnotationBuilder = js.native
  
  def unaryExpression(operator: Exclamationmark, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: Exclamationmark, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: Plussign, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: Plussign, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: Tilde, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: Tilde, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: `-_`, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: `-_`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  var unaryExpression_Original: UnaryExpressionBuilder = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: ExpressionKind): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: ExpressionKind): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: ExpressionKind): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  
  def unionTypeAnnotation(types: js.Array[FlowTypeKind]): UnionTypeAnnotation = js.native
  @JSName("unionTypeAnnotation")
  var unionTypeAnnotation_Original: UnionTypeAnnotationBuilder = js.native
  
  def updateExpression(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def updateExpression(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  @JSName("updateExpression")
  var updateExpression_Original: UpdateExpressionBuilder = js.native
  
  @JSName("variableDeclaration")
  var variableDeclaration_Original: VariableDeclarationBuilder = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  
  def variableDeclarator(id: PatternKind): VariableDeclarator = js.native
  def variableDeclarator(id: PatternKind, init: ExpressionKind): VariableDeclarator = js.native
  @JSName("variableDeclarator")
  var variableDeclarator_Original: VariableDeclaratorBuilder = js.native
  
  @JSName("variance")
  var variance_Original: VarianceBuilder = js.native
  @JSName("variance")
  def variance_minus(kind: minus): Variance = js.native
  @JSName("variance")
  def variance_plus(kind: plus): Variance = js.native
  
  def voidTypeAnnotation(): VoidTypeAnnotation = js.native
  @JSName("voidTypeAnnotation")
  var voidTypeAnnotation_Original: VoidTypeAnnotationBuilder = js.native
  
  def whileStatement(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  @JSName("whileStatement")
  var whileStatement_Original: WhileStatementBuilder = js.native
  
  def withStatement(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  @JSName("withStatement")
  var withStatement_Original: WithStatementBuilder = js.native
  
  def yieldExpression(): YieldExpression = js.native
  def yieldExpression(argument: Null, delegate: Boolean): YieldExpression = js.native
  def yieldExpression(argument: ExpressionKind): YieldExpression = js.native
  def yieldExpression(argument: ExpressionKind, delegate: Boolean): YieldExpression = js.native
  @JSName("yieldExpression")
  var yieldExpression_Original: YieldExpressionBuilder = js.native
}
