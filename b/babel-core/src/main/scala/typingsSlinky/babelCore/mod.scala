package typingsSlinky.babelCore

import typingsSlinky.babelCore.anon.Exported
import typingsSlinky.babelCore.anon.Loc
import typingsSlinky.babelCore.babelCoreStrings.Ampersand
import typingsSlinky.babelCore.babelCoreStrings.AmpersandAmpersand
import typingsSlinky.babelCore.babelCoreStrings.Asterisk
import typingsSlinky.babelCore.babelCoreStrings.AsteriskAsterisk
import typingsSlinky.babelCore.babelCoreStrings.EqualssignEqualssign
import typingsSlinky.babelCore.babelCoreStrings.EqualssignEqualssignEqualssign
import typingsSlinky.babelCore.babelCoreStrings.Exclamationmark
import typingsSlinky.babelCore.babelCoreStrings.ExclamationmarkEqualssign
import typingsSlinky.babelCore.babelCoreStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.babelCore.babelCoreStrings.Greaterthansign
import typingsSlinky.babelCore.babelCoreStrings.GreaterthansignEqualssign
import typingsSlinky.babelCore.babelCoreStrings.GreaterthansignGreaterthansign
import typingsSlinky.babelCore.babelCoreStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.babelCore.babelCoreStrings.Lessthansign
import typingsSlinky.babelCore.babelCoreStrings.LessthansignEqualssign
import typingsSlinky.babelCore.babelCoreStrings.LessthansignLessthansign
import typingsSlinky.babelCore.babelCoreStrings.Percentsign
import typingsSlinky.babelCore.babelCoreStrings.Plussign
import typingsSlinky.babelCore.babelCoreStrings.PlussignPlussign
import typingsSlinky.babelCore.babelCoreStrings.Slash
import typingsSlinky.babelCore.babelCoreStrings.Tilde
import typingsSlinky.babelCore.babelCoreStrings.Verticalline
import typingsSlinky.babelCore.babelCoreStrings.VerticallineVerticalline
import typingsSlinky.babelCore.babelCoreStrings.^
import typingsSlinky.babelCore.babelCoreStrings.`--`
import typingsSlinky.babelCore.babelCoreStrings.`-_`
import typingsSlinky.babelCore.babelCoreStrings.`inline`
import typingsSlinky.babelCore.babelCoreStrings.`var`
import typingsSlinky.babelCore.babelCoreStrings.auto
import typingsSlinky.babelCore.babelCoreStrings.both
import typingsSlinky.babelCore.babelCoreStrings.const
import typingsSlinky.babelCore.babelCoreStrings.constructor
import typingsSlinky.babelCore.babelCoreStrings.delete
import typingsSlinky.babelCore.babelCoreStrings.enter
import typingsSlinky.babelCore.babelCoreStrings.exit
import typingsSlinky.babelCore.babelCoreStrings.get
import typingsSlinky.babelCore.babelCoreStrings.in
import typingsSlinky.babelCore.babelCoreStrings.instanceof
import typingsSlinky.babelCore.babelCoreStrings.let
import typingsSlinky.babelCore.babelCoreStrings.method
import typingsSlinky.babelCore.babelCoreStrings.module
import typingsSlinky.babelCore.babelCoreStrings.script
import typingsSlinky.babelCore.babelCoreStrings.set
import typingsSlinky.babelCore.babelCoreStrings.typeof
import typingsSlinky.babelCore.babelCoreStrings.void
import typingsSlinky.babelGenerator.mod.GeneratorOptions
import typingsSlinky.babelTemplate.mod.UseTemplate
import typingsSlinky.babelTraverse.mod.NodePath
import typingsSlinky.babelTraverse.mod.Scope
import typingsSlinky.babelTraverse.mod.TraverseOptions
import typingsSlinky.babelTraverse.mod.Visitor
import typingsSlinky.babelTypes.anon.Cooked
import typingsSlinky.babelTypes.ts36Mod.AnyTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.ArrayExpression_
import typingsSlinky.babelTypes.ts36Mod.ArrayPattern_
import typingsSlinky.babelTypes.ts36Mod.ArrayTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.ArrowFunctionExpression_
import typingsSlinky.babelTypes.ts36Mod.AssignmentExpression_
import typingsSlinky.babelTypes.ts36Mod.AssignmentPattern_
import typingsSlinky.babelTypes.ts36Mod.AssignmentProperty
import typingsSlinky.babelTypes.ts36Mod.AwaitExpression_
import typingsSlinky.babelTypes.ts36Mod.BinaryExpression_
import typingsSlinky.babelTypes.ts36Mod.BindExpression_
import typingsSlinky.babelTypes.ts36Mod.BlockStatement_
import typingsSlinky.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.BooleanLiteral_
import typingsSlinky.babelTypes.ts36Mod.BooleanTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.BreakStatement_
import typingsSlinky.babelTypes.ts36Mod.CallExpression_
import typingsSlinky.babelTypes.ts36Mod.CatchClause_
import typingsSlinky.babelTypes.ts36Mod.ClassBody_
import typingsSlinky.babelTypes.ts36Mod.ClassDeclaration_
import typingsSlinky.babelTypes.ts36Mod.ClassExpression_
import typingsSlinky.babelTypes.ts36Mod.ClassImplements_
import typingsSlinky.babelTypes.ts36Mod.ClassMethod_
import typingsSlinky.babelTypes.ts36Mod.ClassProperty_
import typingsSlinky.babelTypes.ts36Mod.Comment
import typingsSlinky.babelTypes.ts36Mod.ConditionalExpression_
import typingsSlinky.babelTypes.ts36Mod.ContinueStatement_
import typingsSlinky.babelTypes.ts36Mod.DebuggerStatement_
import typingsSlinky.babelTypes.ts36Mod.Declaration
import typingsSlinky.babelTypes.ts36Mod.DeclareClass_
import typingsSlinky.babelTypes.ts36Mod.DeclareFunction_
import typingsSlinky.babelTypes.ts36Mod.DeclareInterface_
import typingsSlinky.babelTypes.ts36Mod.DeclareModule_
import typingsSlinky.babelTypes.ts36Mod.DeclareTypeAlias_
import typingsSlinky.babelTypes.ts36Mod.DeclareVariable_
import typingsSlinky.babelTypes.ts36Mod.Decorator_
import typingsSlinky.babelTypes.ts36Mod.DirectiveLiteral_
import typingsSlinky.babelTypes.ts36Mod.Directive_
import typingsSlinky.babelTypes.ts36Mod.DoExpression_
import typingsSlinky.babelTypes.ts36Mod.DoWhileStatement_
import typingsSlinky.babelTypes.ts36Mod.EmptyStatement_
import typingsSlinky.babelTypes.ts36Mod.ExistentialTypeParam_
import typingsSlinky.babelTypes.ts36Mod.ExportAllDeclaration_
import typingsSlinky.babelTypes.ts36Mod.ExportDefaultDeclaration_
import typingsSlinky.babelTypes.ts36Mod.ExportDefaultSpecifier_
import typingsSlinky.babelTypes.ts36Mod.ExportNamedDeclaration_
import typingsSlinky.babelTypes.ts36Mod.ExportNamespaceSpecifier_
import typingsSlinky.babelTypes.ts36Mod.ExportSpecifier_
import typingsSlinky.babelTypes.ts36Mod.Expression
import typingsSlinky.babelTypes.ts36Mod.ExpressionStatement_
import typingsSlinky.babelTypes.ts36Mod.File_
import typingsSlinky.babelTypes.ts36Mod.Flow
import typingsSlinky.babelTypes.ts36Mod.FlowTypeAnnotation
import typingsSlinky.babelTypes.ts36Mod.ForInStatement_
import typingsSlinky.babelTypes.ts36Mod.ForOfStatement_
import typingsSlinky.babelTypes.ts36Mod.ForStatement_
import typingsSlinky.babelTypes.ts36Mod.FunctionDeclaration_
import typingsSlinky.babelTypes.ts36Mod.FunctionExpression_
import typingsSlinky.babelTypes.ts36Mod.FunctionTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.FunctionTypeParam_
import typingsSlinky.babelTypes.ts36Mod.GenericTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.Identifier_
import typingsSlinky.babelTypes.ts36Mod.IfStatement_
import typingsSlinky.babelTypes.ts36Mod.ImportDeclaration_
import typingsSlinky.babelTypes.ts36Mod.ImportDefaultSpecifier_
import typingsSlinky.babelTypes.ts36Mod.ImportNamespaceSpecifier_
import typingsSlinky.babelTypes.ts36Mod.ImportSpecifier_
import typingsSlinky.babelTypes.ts36Mod.InterfaceDeclaration_
import typingsSlinky.babelTypes.ts36Mod.InterfaceExtends_
import typingsSlinky.babelTypes.ts36Mod.IntersectionTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.JSXAttribute_
import typingsSlinky.babelTypes.ts36Mod.JSXClosingElement_
import typingsSlinky.babelTypes.ts36Mod.JSXElement_
import typingsSlinky.babelTypes.ts36Mod.JSXEmptyExpression_
import typingsSlinky.babelTypes.ts36Mod.JSXExpressionContainer_
import typingsSlinky.babelTypes.ts36Mod.JSXIdentifier_
import typingsSlinky.babelTypes.ts36Mod.JSXMemberExpression_
import typingsSlinky.babelTypes.ts36Mod.JSXNamespacedName_
import typingsSlinky.babelTypes.ts36Mod.JSXOpeningElement_
import typingsSlinky.babelTypes.ts36Mod.JSXSpreadAttribute_
import typingsSlinky.babelTypes.ts36Mod.JSXText_
import typingsSlinky.babelTypes.ts36Mod.LVal
import typingsSlinky.babelTypes.ts36Mod.LabeledStatement_
import typingsSlinky.babelTypes.ts36Mod.LogicalExpression_
import typingsSlinky.babelTypes.ts36Mod.MemberExpression_
import typingsSlinky.babelTypes.ts36Mod.MetaProperty_
import typingsSlinky.babelTypes.ts36Mod.MixedTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.ModuleDeclaration
import typingsSlinky.babelTypes.ts36Mod.NewExpression_
import typingsSlinky.babelTypes.ts36Mod.Noop_
import typingsSlinky.babelTypes.ts36Mod.NullLiteralTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.NullLiteral_
import typingsSlinky.babelTypes.ts36Mod.NullableTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.NumberTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.NumericLiteral_
import typingsSlinky.babelTypes.ts36Mod.ObjectExpression_
import typingsSlinky.babelTypes.ts36Mod.ObjectMethod_
import typingsSlinky.babelTypes.ts36Mod.ObjectPattern_
import typingsSlinky.babelTypes.ts36Mod.ObjectProperty_
import typingsSlinky.babelTypes.ts36Mod.ObjectTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.ObjectTypeCallProperty_
import typingsSlinky.babelTypes.ts36Mod.ObjectTypeIndexer_
import typingsSlinky.babelTypes.ts36Mod.ObjectTypeProperty_
import typingsSlinky.babelTypes.ts36Mod.ParenthesizedExpression_
import typingsSlinky.babelTypes.ts36Mod.Program_
import typingsSlinky.babelTypes.ts36Mod.QualifiedTypeIdentifier_
import typingsSlinky.babelTypes.ts36Mod.ReactHelpers
import typingsSlinky.babelTypes.ts36Mod.RegExpLiteral_
import typingsSlinky.babelTypes.ts36Mod.RestElement_
import typingsSlinky.babelTypes.ts36Mod.RestProperty_
import typingsSlinky.babelTypes.ts36Mod.ReturnStatement_
import typingsSlinky.babelTypes.ts36Mod.SequenceExpression_
import typingsSlinky.babelTypes.ts36Mod.SpreadElement_
import typingsSlinky.babelTypes.ts36Mod.SpreadProperty_
import typingsSlinky.babelTypes.ts36Mod.Statement
import typingsSlinky.babelTypes.ts36Mod.StringLiteralTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.StringLiteral_
import typingsSlinky.babelTypes.ts36Mod.StringTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.Super
import typingsSlinky.babelTypes.ts36Mod.SwitchCase_
import typingsSlinky.babelTypes.ts36Mod.SwitchStatement_
import typingsSlinky.babelTypes.ts36Mod.TSEntityName
import typingsSlinky.babelTypes.ts36Mod.TSEnumMember
import typingsSlinky.babelTypes.ts36Mod.TSExpressionWithTypeArguments
import typingsSlinky.babelTypes.ts36Mod.TSExternalModuleReference
import typingsSlinky.babelTypes.ts36Mod.TSInterfaceBody
import typingsSlinky.babelTypes.ts36Mod.TSModuleBlock
import typingsSlinky.babelTypes.ts36Mod.TSThisType
import typingsSlinky.babelTypes.ts36Mod.TSType
import typingsSlinky.babelTypes.ts36Mod.TSTypeAnnotation
import typingsSlinky.babelTypes.ts36Mod.TSTypeElement
import typingsSlinky.babelTypes.ts36Mod.TSTypeParameter
import typingsSlinky.babelTypes.ts36Mod.TSTypeParameterInstantiation
import typingsSlinky.babelTypes.ts36Mod.TaggedTemplateExpression_
import typingsSlinky.babelTypes.ts36Mod.TemplateElement_
import typingsSlinky.babelTypes.ts36Mod.TemplateLiteral_
import typingsSlinky.babelTypes.ts36Mod.ThisExpression_
import typingsSlinky.babelTypes.ts36Mod.ThisTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.ThrowStatement_
import typingsSlinky.babelTypes.ts36Mod.TryStatement_
import typingsSlinky.babelTypes.ts36Mod.TupleTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.TypeAlias_
import typingsSlinky.babelTypes.ts36Mod.TypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.TypeCastExpression_
import typingsSlinky.babelTypes.ts36Mod.TypeParameterDeclaration_
import typingsSlinky.babelTypes.ts36Mod.TypeParameterInstantiation_
import typingsSlinky.babelTypes.ts36Mod.TypeParameter_
import typingsSlinky.babelTypes.ts36Mod.TypeofTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.UnaryExpression_
import typingsSlinky.babelTypes.ts36Mod.UnionTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.UpdateExpression_
import typingsSlinky.babelTypes.ts36Mod.VariableDeclaration_
import typingsSlinky.babelTypes.ts36Mod.VariableDeclarator_
import typingsSlinky.babelTypes.ts36Mod.VoidTypeAnnotation_
import typingsSlinky.babelTypes.ts36Mod.WhileStatement_
import typingsSlinky.babelTypes.ts36Mod.WithStatement_
import typingsSlinky.babelTypes.ts36Mod.YieldExpression_
import typingsSlinky.babylon.mod.BabylonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-core", "template")
  @js.native
  def template(code: String): UseTemplate = js.native
  @JSImport("babel-core", "template")
  @js.native
  def template(code: String, opts: BabylonOptions): UseTemplate = js.native
  
  @JSImport("babel-core", "transform")
  @js.native
  def transform(code: String): BabelFileResult = js.native
  @JSImport("babel-core", "transform")
  @js.native
  def transform(code: String, opts: TransformOptions): BabelFileResult = js.native
  
  @JSImport("babel-core", "transformFile")
  @js.native
  def transformFile(
    filename: String,
    opts: TransformOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ BabelFileResult, Unit]
  ): Unit = js.native
  
  @JSImport("babel-core", "transformFileSync")
  @js.native
  def transformFileSync(filename: String): BabelFileResult = js.native
  @JSImport("babel-core", "transformFileSync")
  @js.native
  def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult = js.native
  
  @JSImport("babel-core", "transformFromAst")
  @js.native
  def transformFromAst(ast: Node): BabelFileResult = js.native
  @JSImport("babel-core", "transformFromAst")
  @js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions): BabelFileResult = js.native
  @JSImport("babel-core", "transformFromAst")
  @js.native
  def transformFromAst(ast: Node, code: String): BabelFileResult = js.native
  @JSImport("babel-core", "transformFromAst")
  @js.native
  def transformFromAst(ast: Node, code: String, opts: TransformOptions): BabelFileResult = js.native
  
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: js.UndefOr[scala.Nothing],
    state: js.UndefOr[scala.Nothing],
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: js.UndefOr[scala.Nothing],
    state: js.Any
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: js.UndefOr[scala.Nothing],
    state: js.Any,
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope,
    state: js.UndefOr[scala.Nothing],
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: js.UndefOr[scala.Nothing],
    state: js.UndefOr[scala.Nothing],
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: js.UndefOr[scala.Nothing],
    state: js.Any
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: js.UndefOr[scala.Nothing],
    state: js.Any,
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope,
    state: js.UndefOr[scala.Nothing],
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse(
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsSlinky.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse[S](
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse[S](
    parent: js.Array[typingsSlinky.babelTraverse.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse[S](parent: typingsSlinky.babelTraverse.mod.Node, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  @JSImport("babel-core", "traverse")
  @js.native
  def traverse[S](
    parent: typingsSlinky.babelTraverse.mod.Node,
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typingsSlinky.babelTraverse.mod.Node]
  ): Unit = js.native
  
  object types {
    
    @JSImport("babel-core", "types.TSAnyKeyword")
    @js.native
    def TSAnyKeyword(): typingsSlinky.babelTypes.ts36Mod.TSAnyKeyword = js.native
    
    @JSImport("babel-core", "types.TSArrayType")
    @js.native
    def TSArrayType(elementType: TSType): typingsSlinky.babelTypes.ts36Mod.TSArrayType = js.native
    
    @JSImport("babel-core", "types.TSAsExpression")
    @js.native
    def TSAsExpression(expression: Expression, typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSAsExpression = js.native
    
    @JSImport("babel-core", "types.TSBooleanKeyword")
    @js.native
    def TSBooleanKeyword(): typingsSlinky.babelTypes.ts36Mod.TSBooleanKeyword = js.native
    
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier_ | RestElement_]): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(typeParameters: TypeParameterDeclaration_): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(
      typeParameters: TypeParameterDeclaration_,
      parameters: js.UndefOr[scala.Nothing],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    @JSImport("babel-core", "types.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration(
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSCallSignatureDeclaration = js.native
    
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(): TSTypeElement = js.native
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      typeAnnotation: TSTypeAnnotation
    ): TSTypeElement = js.native
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier_ | RestElement_]): TSTypeElement = js.native
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): TSTypeElement = js.native
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(typeParameters: TypeParameterDeclaration_): TSTypeElement = js.native
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(
      typeParameters: TypeParameterDeclaration_,
      parameters: js.UndefOr[scala.Nothing],
      typeAnnotation: TSTypeAnnotation
    ): TSTypeElement = js.native
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSTypeElement = js.native
    @JSImport("babel-core", "types.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration(
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): TSTypeElement = js.native
    
    @JSImport("babel-core", "types.TSConstructorType")
    @js.native
    def TSConstructorType(): typingsSlinky.babelTypes.ts36Mod.TSConstructorType = js.native
    @JSImport("babel-core", "types.TSConstructorType")
    @js.native
    def TSConstructorType(typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSConstructorType = js.native
    @JSImport("babel-core", "types.TSConstructorType")
    @js.native
    def TSConstructorType(typeParameters: TypeParameterDeclaration_): typingsSlinky.babelTypes.ts36Mod.TSConstructorType = js.native
    @JSImport("babel-core", "types.TSConstructorType")
    @js.native
    def TSConstructorType(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSConstructorType = js.native
    
    @JSImport("babel-core", "types.TSDeclareFunction")
    @js.native
    def TSDeclareFunction(
      id: js.UndefOr[Identifier_ | Null],
      typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
      params: js.Array[LVal],
      returnType: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareFunction = js.native
    
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.UndefOr[scala.Nothing],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(decorators: js.Array[Decorator_], key: Expression, typeParameters: Null, params: js.Array[LVal]): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(decorators: js.Array[Decorator_], key: Expression, typeParameters: Noop_, params: js.Array[LVal]): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: js.Array[Decorator_],
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal]): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal], returnType: Noop_): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Null,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(decorators: Null, key: Expression, typeParameters: Noop_, params: js.Array[LVal]): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: Noop_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal]
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: Noop_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    @JSImport("babel-core", "types.TSDeclareMethod")
    @js.native
    def TSDeclareMethod(
      decorators: Null,
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[LVal],
      returnType: TypeAnnotation_
    ): typingsSlinky.babelTypes.ts36Mod.TSDeclareMethod = js.native
    
    @JSImport("babel-core", "types.TSEnumDeclaration")
    @js.native
    def TSEnumDeclaration(id: Identifier_, members: js.Array[TSEnumMember]): typingsSlinky.babelTypes.ts36Mod.TSEnumDeclaration = js.native
    
    @JSImport("babel-core", "types.TSEnumMember")
    @js.native
    def TSEnumMember(id: Identifier_): typingsSlinky.babelTypes.ts36Mod.TSEnumMember = js.native
    @JSImport("babel-core", "types.TSEnumMember")
    @js.native
    def TSEnumMember(id: Identifier_, initializer: Expression): typingsSlinky.babelTypes.ts36Mod.TSEnumMember = js.native
    @JSImport("babel-core", "types.TSEnumMember")
    @js.native
    def TSEnumMember(id: StringLiteral_): typingsSlinky.babelTypes.ts36Mod.TSEnumMember = js.native
    @JSImport("babel-core", "types.TSEnumMember")
    @js.native
    def TSEnumMember(id: StringLiteral_, initializer: Expression): typingsSlinky.babelTypes.ts36Mod.TSEnumMember = js.native
    
    @JSImport("babel-core", "types.TSExportAssignment")
    @js.native
    def TSExportAssignment(expression: Expression): typingsSlinky.babelTypes.ts36Mod.TSExportAssignment = js.native
    
    @JSImport("babel-core", "types.TSExpressionWithTypeArguments")
    @js.native
    def TSExpressionWithTypeArguments(expression: TSEntityName): typingsSlinky.babelTypes.ts36Mod.TSExpressionWithTypeArguments = js.native
    @JSImport("babel-core", "types.TSExpressionWithTypeArguments")
    @js.native
    def TSExpressionWithTypeArguments(expression: TSEntityName, typeParameters: TypeParameterInstantiation_): typingsSlinky.babelTypes.ts36Mod.TSExpressionWithTypeArguments = js.native
    
    @JSImport("babel-core", "types.TSExternalModuleReference")
    @js.native
    def TSExternalModuleReference(expression: StringLiteral_): typingsSlinky.babelTypes.ts36Mod.TSExternalModuleReference = js.native
    
    @JSImport("babel-core", "types.TSFunctionType")
    @js.native
    def TSFunctionType(): typingsSlinky.babelTypes.ts36Mod.TSFunctionType = js.native
    @JSImport("babel-core", "types.TSFunctionType")
    @js.native
    def TSFunctionType(typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSFunctionType = js.native
    @JSImport("babel-core", "types.TSFunctionType")
    @js.native
    def TSFunctionType(typeParameters: TypeParameterDeclaration_): typingsSlinky.babelTypes.ts36Mod.TSFunctionType = js.native
    @JSImport("babel-core", "types.TSFunctionType")
    @js.native
    def TSFunctionType(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSFunctionType = js.native
    
    @JSImport("babel-core", "types.TSImportEqualsDeclaration")
    @js.native
    def TSImportEqualsDeclaration(id: Identifier_, moduleReference: TSEntityName): typingsSlinky.babelTypes.ts36Mod.TSImportEqualsDeclaration = js.native
    @JSImport("babel-core", "types.TSImportEqualsDeclaration")
    @js.native
    def TSImportEqualsDeclaration(id: Identifier_, moduleReference: TSExternalModuleReference): typingsSlinky.babelTypes.ts36Mod.TSImportEqualsDeclaration = js.native
    
    @JSImport("babel-core", "types.TSIndexSignature")
    @js.native
    def TSIndexSignature(parameters: js.Array[Identifier_]): typingsSlinky.babelTypes.ts36Mod.TSIndexSignature = js.native
    @JSImport("babel-core", "types.TSIndexSignature")
    @js.native
    def TSIndexSignature(parameters: js.Array[Identifier_], typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSIndexSignature = js.native
    
    @JSImport("babel-core", "types.TSIndexedAccessType")
    @js.native
    def TSIndexedAccessType(objectType: TSType, indexType: TSType): typingsSlinky.babelTypes.ts36Mod.TSIndexedAccessType = js.native
    
    @JSImport("babel-core", "types.TSInterfaceBody")
    @js.native
    def TSInterfaceBody(body: js.Array[TSTypeElement]): typingsSlinky.babelTypes.ts36Mod.TSInterfaceBody = js.native
    
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      extends_ : js.UndefOr[scala.Nothing],
      body: TSInterfaceBody
    ): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      extends_ : js.Array[TSExpressionWithTypeArguments],
      body: TSInterfaceBody
    ): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], extends_ : Null, body: TSInterfaceBody): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: Null, extends_ : js.UndefOr[scala.Nothing], body: TSInterfaceBody): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: Null,
      extends_ : js.Array[TSExpressionWithTypeArguments],
      body: TSInterfaceBody
    ): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: Null, extends_ : Null, body: TSInterfaceBody): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      extends_ : js.UndefOr[scala.Nothing],
      body: TSInterfaceBody
    ): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      extends_ : js.Array[TSExpressionWithTypeArguments],
      body: TSInterfaceBody
    ): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    @JSImport("babel-core", "types.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_, extends_ : Null, body: TSInterfaceBody): typingsSlinky.babelTypes.ts36Mod.TSInterfaceDeclaration = js.native
    
    @JSImport("babel-core", "types.TSIntersectionType")
    @js.native
    def TSIntersectionType(types: js.Array[TSType]): typingsSlinky.babelTypes.ts36Mod.TSIntersectionType = js.native
    
    @JSImport("babel-core", "types.TSLiteralType")
    @js.native
    def TSLiteralType(literal: BooleanLiteral_): typingsSlinky.babelTypes.ts36Mod.TSLiteralType = js.native
    @JSImport("babel-core", "types.TSLiteralType")
    @js.native
    def TSLiteralType(literal: NumericLiteral_): typingsSlinky.babelTypes.ts36Mod.TSLiteralType = js.native
    @JSImport("babel-core", "types.TSLiteralType")
    @js.native
    def TSLiteralType(literal: StringLiteral_): typingsSlinky.babelTypes.ts36Mod.TSLiteralType = js.native
    
    @JSImport("babel-core", "types.TSMappedType")
    @js.native
    def TSMappedType(typeParameter: TypeParameter_): typingsSlinky.babelTypes.ts36Mod.TSMappedType = js.native
    @JSImport("babel-core", "types.TSMappedType")
    @js.native
    def TSMappedType(typeParameter: TypeParameter_, typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSMappedType = js.native
    
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(key: Expression): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[Identifier_ | RestElement_]
    ): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(key: Expression, typeParameters: TypeParameterDeclaration_): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      parameters: js.UndefOr[scala.Nothing],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_]
    ): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    @JSImport("babel-core", "types.TSMethodSignature")
    @js.native
    def TSMethodSignature(
      key: Expression,
      typeParameters: TypeParameterDeclaration_,
      parameters: js.Array[Identifier_ | RestElement_],
      typeAnnotation: TSTypeAnnotation
    ): typingsSlinky.babelTypes.ts36Mod.TSMethodSignature = js.native
    
    @JSImport("babel-core", "types.TSModuleBlock")
    @js.native
    def TSModuleBlock(body: js.Array[Statement]): typingsSlinky.babelTypes.ts36Mod.TSModuleBlock = js.native
    
    @JSImport("babel-core", "types.TSModuleDeclaration")
    @js.native
    def TSModuleDeclaration(id: Identifier_, body: TSModuleBlock): typingsSlinky.babelTypes.ts36Mod.TSModuleDeclaration = js.native
    @JSImport("babel-core", "types.TSModuleDeclaration")
    @js.native
    def TSModuleDeclaration(id: Identifier_, body: typingsSlinky.babelTypes.ts36Mod.TSModuleDeclaration): typingsSlinky.babelTypes.ts36Mod.TSModuleDeclaration = js.native
    @JSImport("babel-core", "types.TSModuleDeclaration")
    @js.native
    def TSModuleDeclaration(id: StringLiteral_, body: TSModuleBlock): typingsSlinky.babelTypes.ts36Mod.TSModuleDeclaration = js.native
    @JSImport("babel-core", "types.TSModuleDeclaration")
    @js.native
    def TSModuleDeclaration(id: StringLiteral_, body: typingsSlinky.babelTypes.ts36Mod.TSModuleDeclaration): typingsSlinky.babelTypes.ts36Mod.TSModuleDeclaration = js.native
    
    @JSImport("babel-core", "types.TSNamespaceExportDeclaration")
    @js.native
    def TSNamespaceExportDeclaration(id: Identifier_): typingsSlinky.babelTypes.ts36Mod.TSNamespaceExportDeclaration = js.native
    
    @JSImport("babel-core", "types.TSNeverKeyword")
    @js.native
    def TSNeverKeyword(): typingsSlinky.babelTypes.ts36Mod.TSNeverKeyword = js.native
    
    @JSImport("babel-core", "types.TSNonNullExpression")
    @js.native
    def TSNonNullExpression(expression: Expression): typingsSlinky.babelTypes.ts36Mod.TSNonNullExpression = js.native
    
    @JSImport("babel-core", "types.TSNullKeyword")
    @js.native
    def TSNullKeyword(): typingsSlinky.babelTypes.ts36Mod.TSNullKeyword = js.native
    
    @JSImport("babel-core", "types.TSNumberKeyword")
    @js.native
    def TSNumberKeyword(): typingsSlinky.babelTypes.ts36Mod.TSNumberKeyword = js.native
    
    @JSImport("babel-core", "types.TSObjectKeyword")
    @js.native
    def TSObjectKeyword(): typingsSlinky.babelTypes.ts36Mod.TSObjectKeyword = js.native
    
    @JSImport("babel-core", "types.TSParameterProperty")
    @js.native
    def TSParameterProperty(parameter: AssignmentPattern_): typingsSlinky.babelTypes.ts36Mod.TSParameterProperty = js.native
    @JSImport("babel-core", "types.TSParameterProperty")
    @js.native
    def TSParameterProperty(parameter: Identifier_): typingsSlinky.babelTypes.ts36Mod.TSParameterProperty = js.native
    
    @JSImport("babel-core", "types.TSParenthesizedType")
    @js.native
    def TSParenthesizedType(typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSParenthesizedType = js.native
    
    @JSImport("babel-core", "types.TSPropertySignature")
    @js.native
    def TSPropertySignature(key: Expression): typingsSlinky.babelTypes.ts36Mod.TSPropertySignature = js.native
    @JSImport("babel-core", "types.TSPropertySignature")
    @js.native
    def TSPropertySignature(key: Expression, typeAnnotation: js.UndefOr[scala.Nothing], initializer: Expression): typingsSlinky.babelTypes.ts36Mod.TSPropertySignature = js.native
    @JSImport("babel-core", "types.TSPropertySignature")
    @js.native
    def TSPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSPropertySignature = js.native
    @JSImport("babel-core", "types.TSPropertySignature")
    @js.native
    def TSPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): typingsSlinky.babelTypes.ts36Mod.TSPropertySignature = js.native
    
    @JSImport("babel-core", "types.TSQualifiedName")
    @js.native
    def TSQualifiedName(left: TSEntityName, right: Identifier_): typingsSlinky.babelTypes.ts36Mod.TSQualifiedName = js.native
    
    @JSImport("babel-core", "types.TSStringKeyword")
    @js.native
    def TSStringKeyword(): typingsSlinky.babelTypes.ts36Mod.TSStringKeyword = js.native
    
    @JSImport("babel-core", "types.TSSymbolKeyword")
    @js.native
    def TSSymbolKeyword(): typingsSlinky.babelTypes.ts36Mod.TSSymbolKeyword = js.native
    
    @JSImport("babel-core", "types.TSThisType")
    @js.native
    def TSThisType(): typingsSlinky.babelTypes.ts36Mod.TSThisType = js.native
    
    @JSImport("babel-core", "types.TSTupleType")
    @js.native
    def TSTupleType(elementTypes: js.Array[TSType]): typingsSlinky.babelTypes.ts36Mod.TSTupleType = js.native
    
    @JSImport("babel-core", "types.TSTypeAliasDeclaration")
    @js.native
    def TSTypeAliasDeclaration(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeAliasDeclaration = js.native
    @JSImport("babel-core", "types.TSTypeAliasDeclaration")
    @js.native
    def TSTypeAliasDeclaration(id: Identifier_, typeParameters: Null, typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeAliasDeclaration = js.native
    @JSImport("babel-core", "types.TSTypeAliasDeclaration")
    @js.native
    def TSTypeAliasDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_, typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeAliasDeclaration = js.native
    
    @JSImport("babel-core", "types.TSTypeAnnotation")
    @js.native
    def TSTypeAnnotation(typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeAnnotation = js.native
    
    @JSImport("babel-core", "types.TSTypeAssertion")
    @js.native
    def TSTypeAssertion(typeAnnotation: TSType, expression: Expression): typingsSlinky.babelTypes.ts36Mod.TSTypeAssertion = js.native
    
    @JSImport("babel-core", "types.TSTypeLiteral")
    @js.native
    def TSTypeLiteral(members: js.Array[TSTypeElement]): typingsSlinky.babelTypes.ts36Mod.TSTypeLiteral = js.native
    
    @JSImport("babel-core", "types.TSTypeOperator")
    @js.native
    def TSTypeOperator(typeAnnotation: TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeOperator = js.native
    
    @JSImport("babel-core", "types.TSTypeParameter")
    @js.native
    def TSTypeParameter(): typingsSlinky.babelTypes.ts36Mod.TSTypeParameter = js.native
    @JSImport("babel-core", "types.TSTypeParameter")
    @js.native
    def TSTypeParameter(constraint: js.UndefOr[scala.Nothing], default_ : TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeParameter = js.native
    @JSImport("babel-core", "types.TSTypeParameter")
    @js.native
    def TSTypeParameter(constraint: TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeParameter = js.native
    @JSImport("babel-core", "types.TSTypeParameter")
    @js.native
    def TSTypeParameter(constraint: TSType, default_ : TSType): typingsSlinky.babelTypes.ts36Mod.TSTypeParameter = js.native
    
    @JSImport("babel-core", "types.TSTypeParameterDeclaration")
    @js.native
    def TSTypeParameterDeclaration(params: js.Array[TSTypeParameter]): typingsSlinky.babelTypes.ts36Mod.TSTypeParameterDeclaration = js.native
    
    @JSImport("babel-core", "types.TSTypeParameterInstantiation")
    @js.native
    def TSTypeParameterInstantiation(params: js.Array[TSType]): typingsSlinky.babelTypes.ts36Mod.TSTypeParameterInstantiation = js.native
    
    @JSImport("babel-core", "types.TSTypePredicate")
    @js.native
    def TSTypePredicate(parameterName: Identifier_, typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSTypePredicate = js.native
    @JSImport("babel-core", "types.TSTypePredicate")
    @js.native
    def TSTypePredicate(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): typingsSlinky.babelTypes.ts36Mod.TSTypePredicate = js.native
    
    @JSImport("babel-core", "types.TSTypeQuery")
    @js.native
    def TSTypeQuery(exprName: TSEntityName): typingsSlinky.babelTypes.ts36Mod.TSTypeQuery = js.native
    
    @JSImport("babel-core", "types.TSTypeReference")
    @js.native
    def TSTypeReference(typeName: TSEntityName): typingsSlinky.babelTypes.ts36Mod.TSTypeReference = js.native
    @JSImport("babel-core", "types.TSTypeReference")
    @js.native
    def TSTypeReference(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): typingsSlinky.babelTypes.ts36Mod.TSTypeReference = js.native
    
    @JSImport("babel-core", "types.TSUndefinedKeyword")
    @js.native
    def TSUndefinedKeyword(): typingsSlinky.babelTypes.ts36Mod.TSUndefinedKeyword = js.native
    
    @JSImport("babel-core", "types.TSUnionType")
    @js.native
    def TSUnionType(types: js.Array[TSType]): typingsSlinky.babelTypes.ts36Mod.TSUnionType = js.native
    
    @JSImport("babel-core", "types.TSVoidKeyword")
    @js.native
    def TSVoidKeyword(): typingsSlinky.babelTypes.ts36Mod.TSVoidKeyword = js.native
    
    @JSImport("babel-core", "types.anyTypeAnnotation")
    @js.native
    def anyTypeAnnotation(): AnyTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.arrayExpression")
    @js.native
    def arrayExpression(): ArrayExpression_ = js.native
    @JSImport("babel-core", "types.arrayExpression")
    @js.native
    def arrayExpression(elements: js.Array[Null | Expression | SpreadElement_]): ArrayExpression_ = js.native
    
    @JSImport("babel-core", "types.arrayPattern")
    @js.native
    def arrayPattern(): ArrayPattern_ = js.native
    @JSImport("babel-core", "types.arrayPattern")
    @js.native
    def arrayPattern(elements: js.UndefOr[scala.Nothing], typeAnnotation: TypeAnnotation_): ArrayPattern_ = js.native
    @JSImport("babel-core", "types.arrayPattern")
    @js.native
    def arrayPattern(elements: js.Array[Expression]): ArrayPattern_ = js.native
    @JSImport("babel-core", "types.arrayPattern")
    @js.native
    def arrayPattern(elements: js.Array[Expression], typeAnnotation: TypeAnnotation_): ArrayPattern_ = js.native
    
    @JSImport("babel-core", "types.arrayTypeAnnotation")
    @js.native
    def arrayTypeAnnotation(): ArrayTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.arrayTypeAnnotation")
    @js.native
    def arrayTypeAnnotation(elementType: FlowTypeAnnotation): ArrayTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.UndefOr[scala.Nothing], body: js.UndefOr[scala.Nothing], async: Boolean): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.UndefOr[scala.Nothing], body: BlockStatement_): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.UndefOr[scala.Nothing], body: BlockStatement_, async: Boolean): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.UndefOr[scala.Nothing], body: Expression): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.UndefOr[scala.Nothing], body: Expression, async: Boolean): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.Array[LVal]): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: js.UndefOr[scala.Nothing], async: Boolean): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement_): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement_, async: Boolean): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: Expression): ArrowFunctionExpression_ = js.native
    @JSImport("babel-core", "types.arrowFunctionExpression")
    @js.native
    def arrowFunctionExpression(params: js.Array[LVal], body: Expression, async: Boolean): ArrowFunctionExpression_ = js.native
    
    @JSImport("babel-core", "types.assertAnyTypeAnnotation")
    @js.native
    def assertAnyTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAnyTypeAnnotation")
    @js.native
    def assertAnyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAnyTypeAnnotation")
    @js.native
    def assertAnyTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAnyTypeAnnotation")
    @js.native
    def assertAnyTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAnyTypeAnnotation")
    @js.native
    def assertAnyTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AnyTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertArrayExpression")
    @js.native
    def assertArrayExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayExpression")
    @js.native
    def assertArrayExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayExpression")
    @js.native
    def assertArrayExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayExpression")
    @js.native
    def assertArrayExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayExpression")
    @js.native
    def assertArrayExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertArrayPattern")
    @js.native
    def assertArrayPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayPattern")
    @js.native
    def assertArrayPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayPattern")
    @js.native
    def assertArrayPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayPattern")
    @js.native
    def assertArrayPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayPattern")
    @js.native
    def assertArrayPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayPattern))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertArrayTypeAnnotation")
    @js.native
    def assertArrayTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayTypeAnnotation")
    @js.native
    def assertArrayTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayTypeAnnotation")
    @js.native
    def assertArrayTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayTypeAnnotation")
    @js.native
    def assertArrayTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrayTypeAnnotation")
    @js.native
    def assertArrayTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrayTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertArrowFunctionExpression")
    @js.native
    def assertArrowFunctionExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrowFunctionExpression")
    @js.native
    def assertArrowFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrowFunctionExpression")
    @js.native
    def assertArrowFunctionExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrowFunctionExpression")
    @js.native
    def assertArrowFunctionExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertArrowFunctionExpression")
    @js.native
    def assertArrowFunctionExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ArrowFunctionExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertAssignmentExpression")
    @js.native
    def assertAssignmentExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentExpression")
    @js.native
    def assertAssignmentExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentExpression")
    @js.native
    def assertAssignmentExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentExpression")
    @js.native
    def assertAssignmentExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentExpression")
    @js.native
    def assertAssignmentExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertAssignmentPattern")
    @js.native
    def assertAssignmentPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentPattern")
    @js.native
    def assertAssignmentPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentPattern")
    @js.native
    def assertAssignmentPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentPattern")
    @js.native
    def assertAssignmentPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAssignmentPattern")
    @js.native
    def assertAssignmentPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AssignmentPattern))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertAwaitExpression")
    @js.native
    def assertAwaitExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAwaitExpression")
    @js.native
    def assertAwaitExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAwaitExpression")
    @js.native
    def assertAwaitExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAwaitExpression")
    @js.native
    def assertAwaitExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertAwaitExpression")
    @js.native
    def assertAwaitExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(AwaitExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBinary")
    @js.native
    def assertBinary(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinary")
    @js.native
    def assertBinary(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinary")
    @js.native
    def assertBinary(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinary")
    @js.native
    def assertBinary(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinary")
    @js.native
    def assertBinary(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Binary))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBinaryExpression")
    @js.native
    def assertBinaryExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinaryExpression")
    @js.native
    def assertBinaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinaryExpression")
    @js.native
    def assertBinaryExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinaryExpression")
    @js.native
    def assertBinaryExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBinaryExpression")
    @js.native
    def assertBinaryExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BinaryExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBindExpression")
    @js.native
    def assertBindExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBindExpression")
    @js.native
    def assertBindExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBindExpression")
    @js.native
    def assertBindExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBindExpression")
    @js.native
    def assertBindExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBindExpression")
    @js.native
    def assertBindExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BindExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBlock")
    @js.native
    def assertBlock(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlock")
    @js.native
    def assertBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlock")
    @js.native
    def assertBlock(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlock")
    @js.native
    def assertBlock(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlock")
    @js.native
    def assertBlock(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Block))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBlockParent")
    @js.native
    def assertBlockParent(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockParent")
    @js.native
    def assertBlockParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockParent")
    @js.native
    def assertBlockParent(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockParent")
    @js.native
    def assertBlockParent(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockParent")
    @js.native
    def assertBlockParent(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockParent))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBlockStatement")
    @js.native
    def assertBlockStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockStatement")
    @js.native
    def assertBlockStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockStatement")
    @js.native
    def assertBlockStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockStatement")
    @js.native
    def assertBlockStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBlockStatement")
    @js.native
    def assertBlockStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BlockStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBooleanLiteral")
    @js.native
    def assertBooleanLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteral")
    @js.native
    def assertBooleanLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteral")
    @js.native
    def assertBooleanLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteral")
    @js.native
    def assertBooleanLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteral")
    @js.native
    def assertBooleanLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBooleanLiteralTypeAnnotation")
    @js.native
    def assertBooleanLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteralTypeAnnotation")
    @js.native
    def assertBooleanLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteralTypeAnnotation")
    @js.native
    def assertBooleanLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteralTypeAnnotation")
    @js.native
    def assertBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanLiteralTypeAnnotation")
    @js.native
    def assertBooleanLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBooleanTypeAnnotation")
    @js.native
    def assertBooleanTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanTypeAnnotation")
    @js.native
    def assertBooleanTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanTypeAnnotation")
    @js.native
    def assertBooleanTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanTypeAnnotation")
    @js.native
    def assertBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBooleanTypeAnnotation")
    @js.native
    def assertBooleanTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BooleanTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertBreakStatement")
    @js.native
    def assertBreakStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBreakStatement")
    @js.native
    def assertBreakStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBreakStatement")
    @js.native
    def assertBreakStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBreakStatement")
    @js.native
    def assertBreakStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertBreakStatement")
    @js.native
    def assertBreakStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(BreakStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertCallExpression")
    @js.native
    def assertCallExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCallExpression")
    @js.native
    def assertCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCallExpression")
    @js.native
    def assertCallExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCallExpression")
    @js.native
    def assertCallExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCallExpression")
    @js.native
    def assertCallExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CallExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertCatchClause")
    @js.native
    def assertCatchClause(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCatchClause")
    @js.native
    def assertCatchClause(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCatchClause")
    @js.native
    def assertCatchClause(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCatchClause")
    @js.native
    def assertCatchClause(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCatchClause")
    @js.native
    def assertCatchClause(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CatchClause))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertClass")
    @js.native
    def assertClass(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClass")
    @js.native
    def assertClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClass")
    @js.native
    def assertClass(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClass")
    @js.native
    def assertClass(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClass")
    @js.native
    def assertClass(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Class))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertClassBody")
    @js.native
    def assertClassBody(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassBody")
    @js.native
    def assertClassBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassBody")
    @js.native
    def assertClassBody(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassBody")
    @js.native
    def assertClassBody(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassBody")
    @js.native
    def assertClassBody(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassBody))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertClassDeclaration")
    @js.native
    def assertClassDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassDeclaration")
    @js.native
    def assertClassDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassDeclaration")
    @js.native
    def assertClassDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassDeclaration")
    @js.native
    def assertClassDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassDeclaration")
    @js.native
    def assertClassDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertClassExpression")
    @js.native
    def assertClassExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassExpression")
    @js.native
    def assertClassExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassExpression")
    @js.native
    def assertClassExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassExpression")
    @js.native
    def assertClassExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassExpression")
    @js.native
    def assertClassExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertClassImplements")
    @js.native
    def assertClassImplements(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassImplements")
    @js.native
    def assertClassImplements(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassImplements")
    @js.native
    def assertClassImplements(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassImplements")
    @js.native
    def assertClassImplements(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassImplements")
    @js.native
    def assertClassImplements(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassImplements))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertClassMethod")
    @js.native
    def assertClassMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassMethod")
    @js.native
    def assertClassMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassMethod")
    @js.native
    def assertClassMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassMethod")
    @js.native
    def assertClassMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassMethod")
    @js.native
    def assertClassMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassMethod))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertClassProperty")
    @js.native
    def assertClassProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassProperty")
    @js.native
    def assertClassProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassProperty")
    @js.native
    def assertClassProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassProperty")
    @js.native
    def assertClassProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertClassProperty")
    @js.native
    def assertClassProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ClassProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertCompletionStatement")
    @js.native
    def assertCompletionStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCompletionStatement")
    @js.native
    def assertCompletionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCompletionStatement")
    @js.native
    def assertCompletionStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCompletionStatement")
    @js.native
    def assertCompletionStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertCompletionStatement")
    @js.native
    def assertCompletionStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(CompletionStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertConditional")
    @js.native
    def assertConditional(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditional")
    @js.native
    def assertConditional(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditional")
    @js.native
    def assertConditional(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditional")
    @js.native
    def assertConditional(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditional")
    @js.native
    def assertConditional(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Conditional))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertConditionalExpression")
    @js.native
    def assertConditionalExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditionalExpression")
    @js.native
    def assertConditionalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditionalExpression")
    @js.native
    def assertConditionalExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditionalExpression")
    @js.native
    def assertConditionalExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertConditionalExpression")
    @js.native
    def assertConditionalExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ConditionalExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertContinueStatement")
    @js.native
    def assertContinueStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertContinueStatement")
    @js.native
    def assertContinueStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertContinueStatement")
    @js.native
    def assertContinueStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertContinueStatement")
    @js.native
    def assertContinueStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertContinueStatement")
    @js.native
    def assertContinueStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ContinueStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDebuggerStatement")
    @js.native
    def assertDebuggerStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDebuggerStatement")
    @js.native
    def assertDebuggerStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDebuggerStatement")
    @js.native
    def assertDebuggerStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDebuggerStatement")
    @js.native
    def assertDebuggerStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDebuggerStatement")
    @js.native
    def assertDebuggerStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DebuggerStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDeclaration")
    @js.native
    def assertDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclaration")
    @js.native
    def assertDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclaration")
    @js.native
    def assertDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclaration")
    @js.native
    def assertDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclaration")
    @js.native
    def assertDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Declaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDeclareClass")
    @js.native
    def assertDeclareClass(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareClass")
    @js.native
    def assertDeclareClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareClass")
    @js.native
    def assertDeclareClass(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareClass")
    @js.native
    def assertDeclareClass(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareClass")
    @js.native
    def assertDeclareClass(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareClass))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDeclareFunction")
    @js.native
    def assertDeclareFunction(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareFunction")
    @js.native
    def assertDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareFunction")
    @js.native
    def assertDeclareFunction(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareFunction")
    @js.native
    def assertDeclareFunction(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareFunction")
    @js.native
    def assertDeclareFunction(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareFunction))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDeclareInterface")
    @js.native
    def assertDeclareInterface(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareInterface")
    @js.native
    def assertDeclareInterface(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareInterface")
    @js.native
    def assertDeclareInterface(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareInterface")
    @js.native
    def assertDeclareInterface(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareInterface")
    @js.native
    def assertDeclareInterface(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareInterface))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDeclareModule")
    @js.native
    def assertDeclareModule(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareModule")
    @js.native
    def assertDeclareModule(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareModule")
    @js.native
    def assertDeclareModule(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareModule")
    @js.native
    def assertDeclareModule(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareModule")
    @js.native
    def assertDeclareModule(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareModule))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDeclareTypeAlias")
    @js.native
    def assertDeclareTypeAlias(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareTypeAlias")
    @js.native
    def assertDeclareTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareTypeAlias")
    @js.native
    def assertDeclareTypeAlias(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareTypeAlias")
    @js.native
    def assertDeclareTypeAlias(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareTypeAlias")
    @js.native
    def assertDeclareTypeAlias(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareTypeAlias))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDeclareVariable")
    @js.native
    def assertDeclareVariable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareVariable")
    @js.native
    def assertDeclareVariable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareVariable")
    @js.native
    def assertDeclareVariable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareVariable")
    @js.native
    def assertDeclareVariable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDeclareVariable")
    @js.native
    def assertDeclareVariable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DeclareVariable))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDecorator")
    @js.native
    def assertDecorator(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDecorator")
    @js.native
    def assertDecorator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDecorator")
    @js.native
    def assertDecorator(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDecorator")
    @js.native
    def assertDecorator(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDecorator")
    @js.native
    def assertDecorator(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Decorator))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDirective")
    @js.native
    def assertDirective(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirective")
    @js.native
    def assertDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirective")
    @js.native
    def assertDirective(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirective")
    @js.native
    def assertDirective(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirective")
    @js.native
    def assertDirective(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Directive))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDirectiveLiteral")
    @js.native
    def assertDirectiveLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirectiveLiteral")
    @js.native
    def assertDirectiveLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirectiveLiteral")
    @js.native
    def assertDirectiveLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirectiveLiteral")
    @js.native
    def assertDirectiveLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDirectiveLiteral")
    @js.native
    def assertDirectiveLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DirectiveLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDoExpression")
    @js.native
    def assertDoExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoExpression")
    @js.native
    def assertDoExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoExpression")
    @js.native
    def assertDoExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoExpression")
    @js.native
    def assertDoExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoExpression")
    @js.native
    def assertDoExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertDoWhileStatement")
    @js.native
    def assertDoWhileStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoWhileStatement")
    @js.native
    def assertDoWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoWhileStatement")
    @js.native
    def assertDoWhileStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoWhileStatement")
    @js.native
    def assertDoWhileStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertDoWhileStatement")
    @js.native
    def assertDoWhileStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(DoWhileStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertEmptyStatement")
    @js.native
    def assertEmptyStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertEmptyStatement")
    @js.native
    def assertEmptyStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertEmptyStatement")
    @js.native
    def assertEmptyStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertEmptyStatement")
    @js.native
    def assertEmptyStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertEmptyStatement")
    @js.native
    def assertEmptyStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(EmptyStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExistentialTypeParam")
    @js.native
    def assertExistentialTypeParam(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExistentialTypeParam")
    @js.native
    def assertExistentialTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExistentialTypeParam")
    @js.native
    def assertExistentialTypeParam(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExistentialTypeParam")
    @js.native
    def assertExistentialTypeParam(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExistentialTypeParam")
    @js.native
    def assertExistentialTypeParam(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExistentialTypeParam))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExportAllDeclaration")
    @js.native
    def assertExportAllDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportAllDeclaration")
    @js.native
    def assertExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportAllDeclaration")
    @js.native
    def assertExportAllDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportAllDeclaration")
    @js.native
    def assertExportAllDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportAllDeclaration")
    @js.native
    def assertExportAllDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportAllDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExportDeclaration")
    @js.native
    def assertExportDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDeclaration")
    @js.native
    def assertExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDeclaration")
    @js.native
    def assertExportDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDeclaration")
    @js.native
    def assertExportDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDeclaration")
    @js.native
    def assertExportDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExportDefaultDeclaration")
    @js.native
    def assertExportDefaultDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultDeclaration")
    @js.native
    def assertExportDefaultDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultDeclaration")
    @js.native
    def assertExportDefaultDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultDeclaration")
    @js.native
    def assertExportDefaultDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultDeclaration")
    @js.native
    def assertExportDefaultDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExportDefaultSpecifier")
    @js.native
    def assertExportDefaultSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultSpecifier")
    @js.native
    def assertExportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultSpecifier")
    @js.native
    def assertExportDefaultSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultSpecifier")
    @js.native
    def assertExportDefaultSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportDefaultSpecifier")
    @js.native
    def assertExportDefaultSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportDefaultSpecifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExportNamedDeclaration")
    @js.native
    def assertExportNamedDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamedDeclaration")
    @js.native
    def assertExportNamedDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamedDeclaration")
    @js.native
    def assertExportNamedDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamedDeclaration")
    @js.native
    def assertExportNamedDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamedDeclaration")
    @js.native
    def assertExportNamedDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamedDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExportNamespaceSpecifier")
    @js.native
    def assertExportNamespaceSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamespaceSpecifier")
    @js.native
    def assertExportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamespaceSpecifier")
    @js.native
    def assertExportNamespaceSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamespaceSpecifier")
    @js.native
    def assertExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportNamespaceSpecifier")
    @js.native
    def assertExportNamespaceSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExportSpecifier")
    @js.native
    def assertExportSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportSpecifier")
    @js.native
    def assertExportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportSpecifier")
    @js.native
    def assertExportSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportSpecifier")
    @js.native
    def assertExportSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExportSpecifier")
    @js.native
    def assertExportSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExportSpecifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExpression")
    @js.native
    def assertExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpression")
    @js.native
    def assertExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpression")
    @js.native
    def assertExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpression")
    @js.native
    def assertExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpression")
    @js.native
    def assertExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Expression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExpressionStatement")
    @js.native
    def assertExpressionStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionStatement")
    @js.native
    def assertExpressionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionStatement")
    @js.native
    def assertExpressionStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionStatement")
    @js.native
    def assertExpressionStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionStatement")
    @js.native
    def assertExpressionStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertExpressionWrapper")
    @js.native
    def assertExpressionWrapper(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionWrapper")
    @js.native
    def assertExpressionWrapper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionWrapper")
    @js.native
    def assertExpressionWrapper(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionWrapper")
    @js.native
    def assertExpressionWrapper(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertExpressionWrapper")
    @js.native
    def assertExpressionWrapper(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ExpressionWrapper))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFile")
    @js.native
    def assertFile(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFile")
    @js.native
    def assertFile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFile")
    @js.native
    def assertFile(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFile")
    @js.native
    def assertFile(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFile")
    @js.native
    def assertFile(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(File))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFlow")
    @js.native
    def assertFlow(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlow")
    @js.native
    def assertFlow(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlow")
    @js.native
    def assertFlow(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlow")
    @js.native
    def assertFlow(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlow")
    @js.native
    def assertFlow(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Flow))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFlowBaseAnnotation")
    @js.native
    def assertFlowBaseAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowBaseAnnotation")
    @js.native
    def assertFlowBaseAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowBaseAnnotation")
    @js.native
    def assertFlowBaseAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowBaseAnnotation")
    @js.native
    def assertFlowBaseAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowBaseAnnotation")
    @js.native
    def assertFlowBaseAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowBaseAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFlowDeclaration")
    @js.native
    def assertFlowDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowDeclaration")
    @js.native
    def assertFlowDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowDeclaration")
    @js.native
    def assertFlowDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowDeclaration")
    @js.native
    def assertFlowDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFlowDeclaration")
    @js.native
    def assertFlowDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FlowDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFor")
    @js.native
    def assertFor(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFor")
    @js.native
    def assertFor(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFor")
    @js.native
    def assertFor(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFor")
    @js.native
    def assertFor(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFor")
    @js.native
    def assertFor(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(For))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertForInStatement")
    @js.native
    def assertForInStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForInStatement")
    @js.native
    def assertForInStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForInStatement")
    @js.native
    def assertForInStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForInStatement")
    @js.native
    def assertForInStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForInStatement")
    @js.native
    def assertForInStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForInStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertForOfStatement")
    @js.native
    def assertForOfStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForOfStatement")
    @js.native
    def assertForOfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForOfStatement")
    @js.native
    def assertForOfStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForOfStatement")
    @js.native
    def assertForOfStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForOfStatement")
    @js.native
    def assertForOfStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForOfStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertForStatement")
    @js.native
    def assertForStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForStatement")
    @js.native
    def assertForStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForStatement")
    @js.native
    def assertForStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForStatement")
    @js.native
    def assertForStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForStatement")
    @js.native
    def assertForStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertForXStatement")
    @js.native
    def assertForXStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForXStatement")
    @js.native
    def assertForXStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForXStatement")
    @js.native
    def assertForXStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForXStatement")
    @js.native
    def assertForXStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertForXStatement")
    @js.native
    def assertForXStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ForXStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFunction")
    @js.native
    def assertFunction(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunction")
    @js.native
    def assertFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunction")
    @js.native
    def assertFunction(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunction")
    @js.native
    def assertFunction(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunction")
    @js.native
    def assertFunction(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFunctionDeclaration")
    @js.native
    def assertFunctionDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionDeclaration")
    @js.native
    def assertFunctionDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionDeclaration")
    @js.native
    def assertFunctionDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionDeclaration")
    @js.native
    def assertFunctionDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionDeclaration")
    @js.native
    def assertFunctionDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFunctionExpression")
    @js.native
    def assertFunctionExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionExpression")
    @js.native
    def assertFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionExpression")
    @js.native
    def assertFunctionExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionExpression")
    @js.native
    def assertFunctionExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionExpression")
    @js.native
    def assertFunctionExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFunctionParent")
    @js.native
    def assertFunctionParent(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionParent")
    @js.native
    def assertFunctionParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionParent")
    @js.native
    def assertFunctionParent(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionParent")
    @js.native
    def assertFunctionParent(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionParent")
    @js.native
    def assertFunctionParent(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionParent))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFunctionTypeAnnotation")
    @js.native
    def assertFunctionTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeAnnotation")
    @js.native
    def assertFunctionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeAnnotation")
    @js.native
    def assertFunctionTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeAnnotation")
    @js.native
    def assertFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeAnnotation")
    @js.native
    def assertFunctionTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertFunctionTypeParam")
    @js.native
    def assertFunctionTypeParam(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeParam")
    @js.native
    def assertFunctionTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeParam")
    @js.native
    def assertFunctionTypeParam(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeParam")
    @js.native
    def assertFunctionTypeParam(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertFunctionTypeParam")
    @js.native
    def assertFunctionTypeParam(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(FunctionTypeParam))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertGenericTypeAnnotation")
    @js.native
    def assertGenericTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertGenericTypeAnnotation")
    @js.native
    def assertGenericTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertGenericTypeAnnotation")
    @js.native
    def assertGenericTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertGenericTypeAnnotation")
    @js.native
    def assertGenericTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertGenericTypeAnnotation")
    @js.native
    def assertGenericTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(GenericTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertIdentifier")
    @js.native
    def assertIdentifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIdentifier")
    @js.native
    def assertIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIdentifier")
    @js.native
    def assertIdentifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIdentifier")
    @js.native
    def assertIdentifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIdentifier")
    @js.native
    def assertIdentifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Identifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertIfStatement")
    @js.native
    def assertIfStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIfStatement")
    @js.native
    def assertIfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIfStatement")
    @js.native
    def assertIfStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIfStatement")
    @js.native
    def assertIfStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIfStatement")
    @js.native
    def assertIfStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IfStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertImmutable")
    @js.native
    def assertImmutable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImmutable")
    @js.native
    def assertImmutable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImmutable")
    @js.native
    def assertImmutable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImmutable")
    @js.native
    def assertImmutable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImmutable")
    @js.native
    def assertImmutable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Immutable))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertImportDeclaration")
    @js.native
    def assertImportDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDeclaration")
    @js.native
    def assertImportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDeclaration")
    @js.native
    def assertImportDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDeclaration")
    @js.native
    def assertImportDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDeclaration")
    @js.native
    def assertImportDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertImportDefaultSpecifier")
    @js.native
    def assertImportDefaultSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDefaultSpecifier")
    @js.native
    def assertImportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDefaultSpecifier")
    @js.native
    def assertImportDefaultSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDefaultSpecifier")
    @js.native
    def assertImportDefaultSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportDefaultSpecifier")
    @js.native
    def assertImportDefaultSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportDefaultSpecifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertImportNamespaceSpecifier")
    @js.native
    def assertImportNamespaceSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportNamespaceSpecifier")
    @js.native
    def assertImportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportNamespaceSpecifier")
    @js.native
    def assertImportNamespaceSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportNamespaceSpecifier")
    @js.native
    def assertImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportNamespaceSpecifier")
    @js.native
    def assertImportNamespaceSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportNamespaceSpecifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertImportSpecifier")
    @js.native
    def assertImportSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportSpecifier")
    @js.native
    def assertImportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportSpecifier")
    @js.native
    def assertImportSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportSpecifier")
    @js.native
    def assertImportSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertImportSpecifier")
    @js.native
    def assertImportSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ImportSpecifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertInterfaceDeclaration")
    @js.native
    def assertInterfaceDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceDeclaration")
    @js.native
    def assertInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceDeclaration")
    @js.native
    def assertInterfaceDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceDeclaration")
    @js.native
    def assertInterfaceDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceDeclaration")
    @js.native
    def assertInterfaceDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertInterfaceExtends")
    @js.native
    def assertInterfaceExtends(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceExtends")
    @js.native
    def assertInterfaceExtends(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceExtends")
    @js.native
    def assertInterfaceExtends(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceExtends")
    @js.native
    def assertInterfaceExtends(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertInterfaceExtends")
    @js.native
    def assertInterfaceExtends(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(InterfaceExtends))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertIntersectionTypeAnnotation")
    @js.native
    def assertIntersectionTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIntersectionTypeAnnotation")
    @js.native
    def assertIntersectionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIntersectionTypeAnnotation")
    @js.native
    def assertIntersectionTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIntersectionTypeAnnotation")
    @js.native
    def assertIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertIntersectionTypeAnnotation")
    @js.native
    def assertIntersectionTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(IntersectionTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSX")
    @js.native
    def assertJSX(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSX")
    @js.native
    def assertJSX(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSX")
    @js.native
    def assertJSX(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSX")
    @js.native
    def assertJSX(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSX")
    @js.native
    def assertJSX(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSX))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXAttribute")
    @js.native
    def assertJSXAttribute(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXAttribute")
    @js.native
    def assertJSXAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXAttribute")
    @js.native
    def assertJSXAttribute(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXAttribute")
    @js.native
    def assertJSXAttribute(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXAttribute")
    @js.native
    def assertJSXAttribute(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXAttribute))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXClosingElement")
    @js.native
    def assertJSXClosingElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXClosingElement")
    @js.native
    def assertJSXClosingElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXClosingElement")
    @js.native
    def assertJSXClosingElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXClosingElement")
    @js.native
    def assertJSXClosingElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXClosingElement")
    @js.native
    def assertJSXClosingElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXClosingElement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXElement")
    @js.native
    def assertJSXElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXElement")
    @js.native
    def assertJSXElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXElement")
    @js.native
    def assertJSXElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXElement")
    @js.native
    def assertJSXElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXElement")
    @js.native
    def assertJSXElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXElement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXEmptyExpression")
    @js.native
    def assertJSXEmptyExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXEmptyExpression")
    @js.native
    def assertJSXEmptyExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXEmptyExpression")
    @js.native
    def assertJSXEmptyExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXEmptyExpression")
    @js.native
    def assertJSXEmptyExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXEmptyExpression")
    @js.native
    def assertJSXEmptyExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXEmptyExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXExpressionContainer")
    @js.native
    def assertJSXExpressionContainer(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXExpressionContainer")
    @js.native
    def assertJSXExpressionContainer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXExpressionContainer")
    @js.native
    def assertJSXExpressionContainer(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXExpressionContainer")
    @js.native
    def assertJSXExpressionContainer(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXExpressionContainer")
    @js.native
    def assertJSXExpressionContainer(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXExpressionContainer))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXIdentifier")
    @js.native
    def assertJSXIdentifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXIdentifier")
    @js.native
    def assertJSXIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXIdentifier")
    @js.native
    def assertJSXIdentifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXIdentifier")
    @js.native
    def assertJSXIdentifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXIdentifier")
    @js.native
    def assertJSXIdentifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXIdentifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXMemberExpression")
    @js.native
    def assertJSXMemberExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXMemberExpression")
    @js.native
    def assertJSXMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXMemberExpression")
    @js.native
    def assertJSXMemberExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXMemberExpression")
    @js.native
    def assertJSXMemberExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXMemberExpression")
    @js.native
    def assertJSXMemberExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXMemberExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXNamespacedName")
    @js.native
    def assertJSXNamespacedName(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXNamespacedName")
    @js.native
    def assertJSXNamespacedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXNamespacedName")
    @js.native
    def assertJSXNamespacedName(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXNamespacedName")
    @js.native
    def assertJSXNamespacedName(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXNamespacedName")
    @js.native
    def assertJSXNamespacedName(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXNamespacedName))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXOpeningElement")
    @js.native
    def assertJSXOpeningElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXOpeningElement")
    @js.native
    def assertJSXOpeningElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXOpeningElement")
    @js.native
    def assertJSXOpeningElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXOpeningElement")
    @js.native
    def assertJSXOpeningElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXOpeningElement")
    @js.native
    def assertJSXOpeningElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXOpeningElement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXSpreadAttribute")
    @js.native
    def assertJSXSpreadAttribute(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXSpreadAttribute")
    @js.native
    def assertJSXSpreadAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXSpreadAttribute")
    @js.native
    def assertJSXSpreadAttribute(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXSpreadAttribute")
    @js.native
    def assertJSXSpreadAttribute(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXSpreadAttribute")
    @js.native
    def assertJSXSpreadAttribute(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXSpreadAttribute))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertJSXText")
    @js.native
    def assertJSXText(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXText")
    @js.native
    def assertJSXText(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXText")
    @js.native
    def assertJSXText(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXText")
    @js.native
    def assertJSXText(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertJSXText")
    @js.native
    def assertJSXText(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(JSXText))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertLVal")
    @js.native
    def assertLVal(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLVal")
    @js.native
    def assertLVal(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLVal")
    @js.native
    def assertLVal(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLVal")
    @js.native
    def assertLVal(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLVal")
    @js.native
    def assertLVal(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LVal))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertLabeledStatement")
    @js.native
    def assertLabeledStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLabeledStatement")
    @js.native
    def assertLabeledStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLabeledStatement")
    @js.native
    def assertLabeledStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLabeledStatement")
    @js.native
    def assertLabeledStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLabeledStatement")
    @js.native
    def assertLabeledStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LabeledStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertLiteral")
    @js.native
    def assertLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLiteral")
    @js.native
    def assertLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLiteral")
    @js.native
    def assertLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLiteral")
    @js.native
    def assertLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLiteral")
    @js.native
    def assertLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Literal))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertLogicalExpression")
    @js.native
    def assertLogicalExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLogicalExpression")
    @js.native
    def assertLogicalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLogicalExpression")
    @js.native
    def assertLogicalExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLogicalExpression")
    @js.native
    def assertLogicalExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLogicalExpression")
    @js.native
    def assertLogicalExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(LogicalExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertLoop")
    @js.native
    def assertLoop(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLoop")
    @js.native
    def assertLoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLoop")
    @js.native
    def assertLoop(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLoop")
    @js.native
    def assertLoop(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertLoop")
    @js.native
    def assertLoop(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Loop))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertMemberExpression")
    @js.native
    def assertMemberExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMemberExpression")
    @js.native
    def assertMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMemberExpression")
    @js.native
    def assertMemberExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMemberExpression")
    @js.native
    def assertMemberExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMemberExpression")
    @js.native
    def assertMemberExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MemberExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertMetaProperty")
    @js.native
    def assertMetaProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMetaProperty")
    @js.native
    def assertMetaProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMetaProperty")
    @js.native
    def assertMetaProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMetaProperty")
    @js.native
    def assertMetaProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMetaProperty")
    @js.native
    def assertMetaProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MetaProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertMethod")
    @js.native
    def assertMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMethod")
    @js.native
    def assertMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMethod")
    @js.native
    def assertMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMethod")
    @js.native
    def assertMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMethod")
    @js.native
    def assertMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Method))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertMixedTypeAnnotation")
    @js.native
    def assertMixedTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMixedTypeAnnotation")
    @js.native
    def assertMixedTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMixedTypeAnnotation")
    @js.native
    def assertMixedTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMixedTypeAnnotation")
    @js.native
    def assertMixedTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertMixedTypeAnnotation")
    @js.native
    def assertMixedTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(MixedTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertModuleDeclaration")
    @js.native
    def assertModuleDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleDeclaration")
    @js.native
    def assertModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleDeclaration")
    @js.native
    def assertModuleDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleDeclaration")
    @js.native
    def assertModuleDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleDeclaration")
    @js.native
    def assertModuleDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertModuleSpecifier")
    @js.native
    def assertModuleSpecifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleSpecifier")
    @js.native
    def assertModuleSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleSpecifier")
    @js.native
    def assertModuleSpecifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleSpecifier")
    @js.native
    def assertModuleSpecifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertModuleSpecifier")
    @js.native
    def assertModuleSpecifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ModuleSpecifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNewExpression")
    @js.native
    def assertNewExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNewExpression")
    @js.native
    def assertNewExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNewExpression")
    @js.native
    def assertNewExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNewExpression")
    @js.native
    def assertNewExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNewExpression")
    @js.native
    def assertNewExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NewExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNoop")
    @js.native
    def assertNoop(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNoop")
    @js.native
    def assertNoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNoop")
    @js.native
    def assertNoop(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNoop")
    @js.native
    def assertNoop(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNoop")
    @js.native
    def assertNoop(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Noop))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNullLiteral")
    @js.native
    def assertNullLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteral")
    @js.native
    def assertNullLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteral")
    @js.native
    def assertNullLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteral")
    @js.native
    def assertNullLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteral")
    @js.native
    def assertNullLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNullLiteralTypeAnnotation")
    @js.native
    def assertNullLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteralTypeAnnotation")
    @js.native
    def assertNullLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteralTypeAnnotation")
    @js.native
    def assertNullLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteralTypeAnnotation")
    @js.native
    def assertNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullLiteralTypeAnnotation")
    @js.native
    def assertNullLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNullableTypeAnnotation")
    @js.native
    def assertNullableTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullableTypeAnnotation")
    @js.native
    def assertNullableTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullableTypeAnnotation")
    @js.native
    def assertNullableTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullableTypeAnnotation")
    @js.native
    def assertNullableTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNullableTypeAnnotation")
    @js.native
    def assertNullableTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NullableTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNumberLiteral")
    @js.native
    def assertNumberLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberLiteral")
    @js.native
    def assertNumberLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberLiteral")
    @js.native
    def assertNumberLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberLiteral")
    @js.native
    def assertNumberLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberLiteral")
    @js.native
    def assertNumberLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNumberTypeAnnotation")
    @js.native
    def assertNumberTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberTypeAnnotation")
    @js.native
    def assertNumberTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberTypeAnnotation")
    @js.native
    def assertNumberTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberTypeAnnotation")
    @js.native
    def assertNumberTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumberTypeAnnotation")
    @js.native
    def assertNumberTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumberTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNumericLiteral")
    @js.native
    def assertNumericLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteral")
    @js.native
    def assertNumericLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteral")
    @js.native
    def assertNumericLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteral")
    @js.native
    def assertNumericLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteral")
    @js.native
    def assertNumericLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertNumericLiteralTypeAnnotation")
    @js.native
    def assertNumericLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteralTypeAnnotation")
    @js.native
    def assertNumericLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteralTypeAnnotation")
    @js.native
    def assertNumericLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteralTypeAnnotation")
    @js.native
    def assertNumericLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertNumericLiteralTypeAnnotation")
    @js.native
    def assertNumericLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(NumericLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectExpression")
    @js.native
    def assertObjectExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectExpression")
    @js.native
    def assertObjectExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectExpression")
    @js.native
    def assertObjectExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectExpression")
    @js.native
    def assertObjectExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectExpression")
    @js.native
    def assertObjectExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectMember")
    @js.native
    def assertObjectMember(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMember")
    @js.native
    def assertObjectMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMember")
    @js.native
    def assertObjectMember(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMember")
    @js.native
    def assertObjectMember(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMember")
    @js.native
    def assertObjectMember(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMember))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectMethod")
    @js.native
    def assertObjectMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMethod")
    @js.native
    def assertObjectMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMethod")
    @js.native
    def assertObjectMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMethod")
    @js.native
    def assertObjectMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectMethod")
    @js.native
    def assertObjectMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectMethod))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectPattern")
    @js.native
    def assertObjectPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectPattern")
    @js.native
    def assertObjectPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectPattern")
    @js.native
    def assertObjectPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectPattern")
    @js.native
    def assertObjectPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectPattern")
    @js.native
    def assertObjectPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectPattern))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectProperty")
    @js.native
    def assertObjectProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectProperty")
    @js.native
    def assertObjectProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectProperty")
    @js.native
    def assertObjectProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectProperty")
    @js.native
    def assertObjectProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectProperty")
    @js.native
    def assertObjectProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectTypeAnnotation")
    @js.native
    def assertObjectTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeAnnotation")
    @js.native
    def assertObjectTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeAnnotation")
    @js.native
    def assertObjectTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeAnnotation")
    @js.native
    def assertObjectTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeAnnotation")
    @js.native
    def assertObjectTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectTypeCallProperty")
    @js.native
    def assertObjectTypeCallProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeCallProperty")
    @js.native
    def assertObjectTypeCallProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeCallProperty")
    @js.native
    def assertObjectTypeCallProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeCallProperty")
    @js.native
    def assertObjectTypeCallProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeCallProperty")
    @js.native
    def assertObjectTypeCallProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeCallProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectTypeIndexer")
    @js.native
    def assertObjectTypeIndexer(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeIndexer")
    @js.native
    def assertObjectTypeIndexer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeIndexer")
    @js.native
    def assertObjectTypeIndexer(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeIndexer")
    @js.native
    def assertObjectTypeIndexer(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeIndexer")
    @js.native
    def assertObjectTypeIndexer(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeIndexer))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertObjectTypeProperty")
    @js.native
    def assertObjectTypeProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeProperty")
    @js.native
    def assertObjectTypeProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeProperty")
    @js.native
    def assertObjectTypeProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeProperty")
    @js.native
    def assertObjectTypeProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertObjectTypeProperty")
    @js.native
    def assertObjectTypeProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ObjectTypeProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertParenthesizedExpression")
    @js.native
    def assertParenthesizedExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertParenthesizedExpression")
    @js.native
    def assertParenthesizedExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertParenthesizedExpression")
    @js.native
    def assertParenthesizedExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertParenthesizedExpression")
    @js.native
    def assertParenthesizedExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertParenthesizedExpression")
    @js.native
    def assertParenthesizedExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ParenthesizedExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertPattern")
    @js.native
    def assertPattern(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPattern")
    @js.native
    def assertPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPattern")
    @js.native
    def assertPattern(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPattern")
    @js.native
    def assertPattern(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPattern")
    @js.native
    def assertPattern(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pattern))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertProgram")
    @js.native
    def assertProgram(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProgram")
    @js.native
    def assertProgram(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProgram")
    @js.native
    def assertProgram(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProgram")
    @js.native
    def assertProgram(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProgram")
    @js.native
    def assertProgram(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Program))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertProperty")
    @js.native
    def assertProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProperty")
    @js.native
    def assertProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProperty")
    @js.native
    def assertProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProperty")
    @js.native
    def assertProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertProperty")
    @js.native
    def assertProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Property))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertPureish")
    @js.native
    def assertPureish(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPureish")
    @js.native
    def assertPureish(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPureish")
    @js.native
    def assertPureish(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPureish")
    @js.native
    def assertPureish(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertPureish")
    @js.native
    def assertPureish(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Pureish))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertQualifiedTypeIdentifier")
    @js.native
    def assertQualifiedTypeIdentifier(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertQualifiedTypeIdentifier")
    @js.native
    def assertQualifiedTypeIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertQualifiedTypeIdentifier")
    @js.native
    def assertQualifiedTypeIdentifier(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertQualifiedTypeIdentifier")
    @js.native
    def assertQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertQualifiedTypeIdentifier")
    @js.native
    def assertQualifiedTypeIdentifier(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(QualifiedTypeIdentifier))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertRegExpLiteral")
    @js.native
    def assertRegExpLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegExpLiteral")
    @js.native
    def assertRegExpLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegExpLiteral")
    @js.native
    def assertRegExpLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegExpLiteral")
    @js.native
    def assertRegExpLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegExpLiteral")
    @js.native
    def assertRegExpLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertRegexLiteral")
    @js.native
    def assertRegexLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegexLiteral")
    @js.native
    def assertRegexLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegexLiteral")
    @js.native
    def assertRegexLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegexLiteral")
    @js.native
    def assertRegexLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRegexLiteral")
    @js.native
    def assertRegexLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RegExpLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertRestElement")
    @js.native
    def assertRestElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestElement")
    @js.native
    def assertRestElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestElement")
    @js.native
    def assertRestElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestElement")
    @js.native
    def assertRestElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestElement")
    @js.native
    def assertRestElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestElement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertRestProperty")
    @js.native
    def assertRestProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestProperty")
    @js.native
    def assertRestProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestProperty")
    @js.native
    def assertRestProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestProperty")
    @js.native
    def assertRestProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertRestProperty")
    @js.native
    def assertRestProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(RestProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertReturnStatement")
    @js.native
    def assertReturnStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertReturnStatement")
    @js.native
    def assertReturnStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertReturnStatement")
    @js.native
    def assertReturnStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertReturnStatement")
    @js.native
    def assertReturnStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertReturnStatement")
    @js.native
    def assertReturnStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ReturnStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertScopable")
    @js.native
    def assertScopable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertScopable")
    @js.native
    def assertScopable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertScopable")
    @js.native
    def assertScopable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertScopable")
    @js.native
    def assertScopable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertScopable")
    @js.native
    def assertScopable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Scopable))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertSequenceExpression")
    @js.native
    def assertSequenceExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSequenceExpression")
    @js.native
    def assertSequenceExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSequenceExpression")
    @js.native
    def assertSequenceExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSequenceExpression")
    @js.native
    def assertSequenceExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSequenceExpression")
    @js.native
    def assertSequenceExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SequenceExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertSpreadElement")
    @js.native
    def assertSpreadElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadElement")
    @js.native
    def assertSpreadElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadElement")
    @js.native
    def assertSpreadElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadElement")
    @js.native
    def assertSpreadElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadElement")
    @js.native
    def assertSpreadElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadElement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertSpreadProperty")
    @js.native
    def assertSpreadProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadProperty")
    @js.native
    def assertSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadProperty")
    @js.native
    def assertSpreadProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadProperty")
    @js.native
    def assertSpreadProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSpreadProperty")
    @js.native
    def assertSpreadProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SpreadProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertStatement")
    @js.native
    def assertStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStatement")
    @js.native
    def assertStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStatement")
    @js.native
    def assertStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStatement")
    @js.native
    def assertStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStatement")
    @js.native
    def assertStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Statement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertStringLiteral")
    @js.native
    def assertStringLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteral")
    @js.native
    def assertStringLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteral")
    @js.native
    def assertStringLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteral")
    @js.native
    def assertStringLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteral")
    @js.native
    def assertStringLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertStringLiteralTypeAnnotation")
    @js.native
    def assertStringLiteralTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteralTypeAnnotation")
    @js.native
    def assertStringLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteralTypeAnnotation")
    @js.native
    def assertStringLiteralTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteralTypeAnnotation")
    @js.native
    def assertStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringLiteralTypeAnnotation")
    @js.native
    def assertStringLiteralTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringLiteralTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertStringTypeAnnotation")
    @js.native
    def assertStringTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringTypeAnnotation")
    @js.native
    def assertStringTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringTypeAnnotation")
    @js.native
    def assertStringTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringTypeAnnotation")
    @js.native
    def assertStringTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertStringTypeAnnotation")
    @js.native
    def assertStringTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(StringTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertSuper")
    @js.native
    def assertSuper(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSuper")
    @js.native
    def assertSuper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSuper")
    @js.native
    def assertSuper(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSuper")
    @js.native
    def assertSuper(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSuper")
    @js.native
    def assertSuper(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Super))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertSwitchCase")
    @js.native
    def assertSwitchCase(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchCase")
    @js.native
    def assertSwitchCase(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchCase")
    @js.native
    def assertSwitchCase(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchCase")
    @js.native
    def assertSwitchCase(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchCase")
    @js.native
    def assertSwitchCase(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchCase))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertSwitchStatement")
    @js.native
    def assertSwitchStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchStatement")
    @js.native
    def assertSwitchStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchStatement")
    @js.native
    def assertSwitchStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchStatement")
    @js.native
    def assertSwitchStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertSwitchStatement")
    @js.native
    def assertSwitchStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(SwitchStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSAnyKeyword")
    @js.native
    def assertTSAnyKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAnyKeyword")
    @js.native
    def assertTSAnyKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAnyKeyword")
    @js.native
    def assertTSAnyKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAnyKeyword")
    @js.native
    def assertTSAnyKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAnyKeyword")
    @js.native
    def assertTSAnyKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAnyKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSArrayType")
    @js.native
    def assertTSArrayType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSArrayType")
    @js.native
    def assertTSArrayType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSArrayType")
    @js.native
    def assertTSArrayType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSArrayType")
    @js.native
    def assertTSArrayType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSArrayType")
    @js.native
    def assertTSArrayType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSArrayType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSAsExpression")
    @js.native
    def assertTSAsExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAsExpression")
    @js.native
    def assertTSAsExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAsExpression")
    @js.native
    def assertTSAsExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAsExpression")
    @js.native
    def assertTSAsExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSAsExpression")
    @js.native
    def assertTSAsExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSAsExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSBooleanKeyword")
    @js.native
    def assertTSBooleanKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSBooleanKeyword")
    @js.native
    def assertTSBooleanKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSBooleanKeyword")
    @js.native
    def assertTSBooleanKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSBooleanKeyword")
    @js.native
    def assertTSBooleanKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSBooleanKeyword")
    @js.native
    def assertTSBooleanKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSBooleanKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSCallSignatureDeclaration")
    @js.native
    def assertTSCallSignatureDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSCallSignatureDeclaration")
    @js.native
    def assertTSCallSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSCallSignatureDeclaration")
    @js.native
    def assertTSCallSignatureDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSCallSignatureDeclaration")
    @js.native
    def assertTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSCallSignatureDeclaration")
    @js.native
    def assertTSCallSignatureDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSCallSignatureDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSConstructSignatureDeclaration")
    @js.native
    def assertTSConstructSignatureDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructSignatureDeclaration")
    @js.native
    def assertTSConstructSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructSignatureDeclaration")
    @js.native
    def assertTSConstructSignatureDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructSignatureDeclaration")
    @js.native
    def assertTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructSignatureDeclaration")
    @js.native
    def assertTSConstructSignatureDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructSignatureDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSConstructorType")
    @js.native
    def assertTSConstructorType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructorType")
    @js.native
    def assertTSConstructorType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructorType")
    @js.native
    def assertTSConstructorType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructorType")
    @js.native
    def assertTSConstructorType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSConstructorType")
    @js.native
    def assertTSConstructorType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSConstructorType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSDeclareFunction")
    @js.native
    def assertTSDeclareFunction(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareFunction")
    @js.native
    def assertTSDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareFunction")
    @js.native
    def assertTSDeclareFunction(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareFunction")
    @js.native
    def assertTSDeclareFunction(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareFunction")
    @js.native
    def assertTSDeclareFunction(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareFunction))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSDeclareMethod")
    @js.native
    def assertTSDeclareMethod(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareMethod")
    @js.native
    def assertTSDeclareMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareMethod")
    @js.native
    def assertTSDeclareMethod(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareMethod")
    @js.native
    def assertTSDeclareMethod(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSDeclareMethod")
    @js.native
    def assertTSDeclareMethod(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSDeclareMethod))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSEnumDeclaration")
    @js.native
    def assertTSEnumDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumDeclaration")
    @js.native
    def assertTSEnumDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumDeclaration")
    @js.native
    def assertTSEnumDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumDeclaration")
    @js.native
    def assertTSEnumDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumDeclaration")
    @js.native
    def assertTSEnumDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSEnumMember")
    @js.native
    def assertTSEnumMember(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumMember")
    @js.native
    def assertTSEnumMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumMember")
    @js.native
    def assertTSEnumMember(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumMember")
    @js.native
    def assertTSEnumMember(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSEnumMember")
    @js.native
    def assertTSEnumMember(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSEnumMember))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSExportAssignment")
    @js.native
    def assertTSExportAssignment(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExportAssignment")
    @js.native
    def assertTSExportAssignment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExportAssignment")
    @js.native
    def assertTSExportAssignment(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExportAssignment")
    @js.native
    def assertTSExportAssignment(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExportAssignment")
    @js.native
    def assertTSExportAssignment(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExportAssignment))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSExpressionWithTypeArguments")
    @js.native
    def assertTSExpressionWithTypeArguments(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExpressionWithTypeArguments")
    @js.native
    def assertTSExpressionWithTypeArguments(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExpressionWithTypeArguments")
    @js.native
    def assertTSExpressionWithTypeArguments(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExpressionWithTypeArguments")
    @js.native
    def assertTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExpressionWithTypeArguments")
    @js.native
    def assertTSExpressionWithTypeArguments(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExpressionWithTypeArguments))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSExternalModuleReference")
    @js.native
    def assertTSExternalModuleReference(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExternalModuleReference")
    @js.native
    def assertTSExternalModuleReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExternalModuleReference")
    @js.native
    def assertTSExternalModuleReference(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExternalModuleReference")
    @js.native
    def assertTSExternalModuleReference(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSExternalModuleReference")
    @js.native
    def assertTSExternalModuleReference(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSExternalModuleReference))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSFunctionType")
    @js.native
    def assertTSFunctionType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSFunctionType")
    @js.native
    def assertTSFunctionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSFunctionType")
    @js.native
    def assertTSFunctionType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSFunctionType")
    @js.native
    def assertTSFunctionType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSFunctionType")
    @js.native
    def assertTSFunctionType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSFunctionType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSImportEqualsDeclaration")
    @js.native
    def assertTSImportEqualsDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSImportEqualsDeclaration")
    @js.native
    def assertTSImportEqualsDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSImportEqualsDeclaration")
    @js.native
    def assertTSImportEqualsDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSImportEqualsDeclaration")
    @js.native
    def assertTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSImportEqualsDeclaration")
    @js.native
    def assertTSImportEqualsDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSImportEqualsDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSIndexSignature")
    @js.native
    def assertTSIndexSignature(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexSignature")
    @js.native
    def assertTSIndexSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexSignature")
    @js.native
    def assertTSIndexSignature(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexSignature")
    @js.native
    def assertTSIndexSignature(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexSignature")
    @js.native
    def assertTSIndexSignature(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexSignature))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSIndexedAccessType")
    @js.native
    def assertTSIndexedAccessType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexedAccessType")
    @js.native
    def assertTSIndexedAccessType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexedAccessType")
    @js.native
    def assertTSIndexedAccessType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexedAccessType")
    @js.native
    def assertTSIndexedAccessType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIndexedAccessType")
    @js.native
    def assertTSIndexedAccessType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIndexedAccessType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSInterfaceBody")
    @js.native
    def assertTSInterfaceBody(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceBody")
    @js.native
    def assertTSInterfaceBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceBody")
    @js.native
    def assertTSInterfaceBody(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceBody")
    @js.native
    def assertTSInterfaceBody(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceBody")
    @js.native
    def assertTSInterfaceBody(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceBody))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSInterfaceDeclaration")
    @js.native
    def assertTSInterfaceDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceDeclaration")
    @js.native
    def assertTSInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceDeclaration")
    @js.native
    def assertTSInterfaceDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceDeclaration")
    @js.native
    def assertTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSInterfaceDeclaration")
    @js.native
    def assertTSInterfaceDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSInterfaceDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSIntersectionType")
    @js.native
    def assertTSIntersectionType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIntersectionType")
    @js.native
    def assertTSIntersectionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIntersectionType")
    @js.native
    def assertTSIntersectionType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIntersectionType")
    @js.native
    def assertTSIntersectionType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSIntersectionType")
    @js.native
    def assertTSIntersectionType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSIntersectionType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSLiteralType")
    @js.native
    def assertTSLiteralType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSLiteralType")
    @js.native
    def assertTSLiteralType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSLiteralType")
    @js.native
    def assertTSLiteralType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSLiteralType")
    @js.native
    def assertTSLiteralType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSLiteralType")
    @js.native
    def assertTSLiteralType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSLiteralType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSMappedType")
    @js.native
    def assertTSMappedType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMappedType")
    @js.native
    def assertTSMappedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMappedType")
    @js.native
    def assertTSMappedType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMappedType")
    @js.native
    def assertTSMappedType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMappedType")
    @js.native
    def assertTSMappedType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMappedType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSMethodSignature")
    @js.native
    def assertTSMethodSignature(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMethodSignature")
    @js.native
    def assertTSMethodSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMethodSignature")
    @js.native
    def assertTSMethodSignature(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMethodSignature")
    @js.native
    def assertTSMethodSignature(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSMethodSignature")
    @js.native
    def assertTSMethodSignature(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSMethodSignature))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSModuleBlock")
    @js.native
    def assertTSModuleBlock(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleBlock")
    @js.native
    def assertTSModuleBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleBlock")
    @js.native
    def assertTSModuleBlock(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleBlock")
    @js.native
    def assertTSModuleBlock(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleBlock")
    @js.native
    def assertTSModuleBlock(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleBlock))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSModuleDeclaration")
    @js.native
    def assertTSModuleDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleDeclaration")
    @js.native
    def assertTSModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleDeclaration")
    @js.native
    def assertTSModuleDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleDeclaration")
    @js.native
    def assertTSModuleDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSModuleDeclaration")
    @js.native
    def assertTSModuleDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSModuleDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSNamespaceExportDeclaration")
    @js.native
    def assertTSNamespaceExportDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNamespaceExportDeclaration")
    @js.native
    def assertTSNamespaceExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNamespaceExportDeclaration")
    @js.native
    def assertTSNamespaceExportDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNamespaceExportDeclaration")
    @js.native
    def assertTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNamespaceExportDeclaration")
    @js.native
    def assertTSNamespaceExportDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNamespaceExportDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSNeverKeyword")
    @js.native
    def assertTSNeverKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNeverKeyword")
    @js.native
    def assertTSNeverKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNeverKeyword")
    @js.native
    def assertTSNeverKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNeverKeyword")
    @js.native
    def assertTSNeverKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNeverKeyword")
    @js.native
    def assertTSNeverKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNeverKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSNonNullExpression")
    @js.native
    def assertTSNonNullExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNonNullExpression")
    @js.native
    def assertTSNonNullExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNonNullExpression")
    @js.native
    def assertTSNonNullExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNonNullExpression")
    @js.native
    def assertTSNonNullExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNonNullExpression")
    @js.native
    def assertTSNonNullExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNonNullExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSNullKeyword")
    @js.native
    def assertTSNullKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNullKeyword")
    @js.native
    def assertTSNullKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNullKeyword")
    @js.native
    def assertTSNullKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNullKeyword")
    @js.native
    def assertTSNullKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNullKeyword")
    @js.native
    def assertTSNullKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNullKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSNumberKeyword")
    @js.native
    def assertTSNumberKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNumberKeyword")
    @js.native
    def assertTSNumberKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNumberKeyword")
    @js.native
    def assertTSNumberKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNumberKeyword")
    @js.native
    def assertTSNumberKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSNumberKeyword")
    @js.native
    def assertTSNumberKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSNumberKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSObjectKeyword")
    @js.native
    def assertTSObjectKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSObjectKeyword")
    @js.native
    def assertTSObjectKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSObjectKeyword")
    @js.native
    def assertTSObjectKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSObjectKeyword")
    @js.native
    def assertTSObjectKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSObjectKeyword")
    @js.native
    def assertTSObjectKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSObjectKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSParameterProperty")
    @js.native
    def assertTSParameterProperty(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParameterProperty")
    @js.native
    def assertTSParameterProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParameterProperty")
    @js.native
    def assertTSParameterProperty(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParameterProperty")
    @js.native
    def assertTSParameterProperty(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParameterProperty")
    @js.native
    def assertTSParameterProperty(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParameterProperty))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSParenthesizedType")
    @js.native
    def assertTSParenthesizedType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParenthesizedType")
    @js.native
    def assertTSParenthesizedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParenthesizedType")
    @js.native
    def assertTSParenthesizedType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParenthesizedType")
    @js.native
    def assertTSParenthesizedType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSParenthesizedType")
    @js.native
    def assertTSParenthesizedType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSParenthesizedType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSPropertySignature")
    @js.native
    def assertTSPropertySignature(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSPropertySignature")
    @js.native
    def assertTSPropertySignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSPropertySignature")
    @js.native
    def assertTSPropertySignature(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSPropertySignature")
    @js.native
    def assertTSPropertySignature(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSPropertySignature")
    @js.native
    def assertTSPropertySignature(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSPropertySignature))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSQualifiedName")
    @js.native
    def assertTSQualifiedName(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSQualifiedName")
    @js.native
    def assertTSQualifiedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSQualifiedName")
    @js.native
    def assertTSQualifiedName(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSQualifiedName")
    @js.native
    def assertTSQualifiedName(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSQualifiedName")
    @js.native
    def assertTSQualifiedName(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSQualifiedName))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSStringKeyword")
    @js.native
    def assertTSStringKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSStringKeyword")
    @js.native
    def assertTSStringKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSStringKeyword")
    @js.native
    def assertTSStringKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSStringKeyword")
    @js.native
    def assertTSStringKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSStringKeyword")
    @js.native
    def assertTSStringKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSStringKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSSymbolKeyword")
    @js.native
    def assertTSSymbolKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSSymbolKeyword")
    @js.native
    def assertTSSymbolKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSSymbolKeyword")
    @js.native
    def assertTSSymbolKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSSymbolKeyword")
    @js.native
    def assertTSSymbolKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSSymbolKeyword")
    @js.native
    def assertTSSymbolKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSSymbolKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSThisType")
    @js.native
    def assertTSThisType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSThisType")
    @js.native
    def assertTSThisType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSThisType")
    @js.native
    def assertTSThisType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSThisType")
    @js.native
    def assertTSThisType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSThisType")
    @js.native
    def assertTSThisType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSThisType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTupleType")
    @js.native
    def assertTSTupleType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTupleType")
    @js.native
    def assertTSTupleType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTupleType")
    @js.native
    def assertTSTupleType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTupleType")
    @js.native
    def assertTSTupleType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTupleType")
    @js.native
    def assertTSTupleType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTupleType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeAliasDeclaration")
    @js.native
    def assertTSTypeAliasDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAliasDeclaration")
    @js.native
    def assertTSTypeAliasDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAliasDeclaration")
    @js.native
    def assertTSTypeAliasDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAliasDeclaration")
    @js.native
    def assertTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAliasDeclaration")
    @js.native
    def assertTSTypeAliasDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAliasDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeAnnotation")
    @js.native
    def assertTSTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAnnotation")
    @js.native
    def assertTSTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAnnotation")
    @js.native
    def assertTSTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAnnotation")
    @js.native
    def assertTSTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAnnotation")
    @js.native
    def assertTSTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeAssertion")
    @js.native
    def assertTSTypeAssertion(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAssertion")
    @js.native
    def assertTSTypeAssertion(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAssertion")
    @js.native
    def assertTSTypeAssertion(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAssertion")
    @js.native
    def assertTSTypeAssertion(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeAssertion")
    @js.native
    def assertTSTypeAssertion(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeAssertion))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeLiteral")
    @js.native
    def assertTSTypeLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeLiteral")
    @js.native
    def assertTSTypeLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeLiteral")
    @js.native
    def assertTSTypeLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeLiteral")
    @js.native
    def assertTSTypeLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeLiteral")
    @js.native
    def assertTSTypeLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeOperator")
    @js.native
    def assertTSTypeOperator(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeOperator")
    @js.native
    def assertTSTypeOperator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeOperator")
    @js.native
    def assertTSTypeOperator(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeOperator")
    @js.native
    def assertTSTypeOperator(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeOperator")
    @js.native
    def assertTSTypeOperator(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeOperator))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeParameter")
    @js.native
    def assertTSTypeParameter(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameter")
    @js.native
    def assertTSTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameter")
    @js.native
    def assertTSTypeParameter(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameter")
    @js.native
    def assertTSTypeParameter(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameter")
    @js.native
    def assertTSTypeParameter(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameter))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeParameterDeclaration")
    @js.native
    def assertTSTypeParameterDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterDeclaration")
    @js.native
    def assertTSTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterDeclaration")
    @js.native
    def assertTSTypeParameterDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterDeclaration")
    @js.native
    def assertTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterDeclaration")
    @js.native
    def assertTSTypeParameterDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeParameterInstantiation")
    @js.native
    def assertTSTypeParameterInstantiation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterInstantiation")
    @js.native
    def assertTSTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterInstantiation")
    @js.native
    def assertTSTypeParameterInstantiation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterInstantiation")
    @js.native
    def assertTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeParameterInstantiation")
    @js.native
    def assertTSTypeParameterInstantiation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeParameterInstantiation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypePredicate")
    @js.native
    def assertTSTypePredicate(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypePredicate")
    @js.native
    def assertTSTypePredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypePredicate")
    @js.native
    def assertTSTypePredicate(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypePredicate")
    @js.native
    def assertTSTypePredicate(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypePredicate")
    @js.native
    def assertTSTypePredicate(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypePredicate))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeQuery")
    @js.native
    def assertTSTypeQuery(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeQuery")
    @js.native
    def assertTSTypeQuery(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeQuery")
    @js.native
    def assertTSTypeQuery(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeQuery")
    @js.native
    def assertTSTypeQuery(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeQuery")
    @js.native
    def assertTSTypeQuery(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeQuery))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSTypeReference")
    @js.native
    def assertTSTypeReference(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeReference")
    @js.native
    def assertTSTypeReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeReference")
    @js.native
    def assertTSTypeReference(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeReference")
    @js.native
    def assertTSTypeReference(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSTypeReference")
    @js.native
    def assertTSTypeReference(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSTypeReference))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSUndefinedKeyword")
    @js.native
    def assertTSUndefinedKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUndefinedKeyword")
    @js.native
    def assertTSUndefinedKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUndefinedKeyword")
    @js.native
    def assertTSUndefinedKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUndefinedKeyword")
    @js.native
    def assertTSUndefinedKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUndefinedKeyword")
    @js.native
    def assertTSUndefinedKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUndefinedKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSUnionType")
    @js.native
    def assertTSUnionType(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUnionType")
    @js.native
    def assertTSUnionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUnionType")
    @js.native
    def assertTSUnionType(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUnionType")
    @js.native
    def assertTSUnionType(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSUnionType")
    @js.native
    def assertTSUnionType(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSUnionType))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTSVoidKeyword")
    @js.native
    def assertTSVoidKeyword(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSVoidKeyword")
    @js.native
    def assertTSVoidKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSVoidKeyword")
    @js.native
    def assertTSVoidKeyword(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSVoidKeyword")
    @js.native
    def assertTSVoidKeyword(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTSVoidKeyword")
    @js.native
    def assertTSVoidKeyword(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TSVoidKeyword))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTaggedTemplateExpression")
    @js.native
    def assertTaggedTemplateExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTaggedTemplateExpression")
    @js.native
    def assertTaggedTemplateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTaggedTemplateExpression")
    @js.native
    def assertTaggedTemplateExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTaggedTemplateExpression")
    @js.native
    def assertTaggedTemplateExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTaggedTemplateExpression")
    @js.native
    def assertTaggedTemplateExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TaggedTemplateExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTemplateElement")
    @js.native
    def assertTemplateElement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateElement")
    @js.native
    def assertTemplateElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateElement")
    @js.native
    def assertTemplateElement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateElement")
    @js.native
    def assertTemplateElement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateElement")
    @js.native
    def assertTemplateElement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateElement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTemplateLiteral")
    @js.native
    def assertTemplateLiteral(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateLiteral")
    @js.native
    def assertTemplateLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateLiteral")
    @js.native
    def assertTemplateLiteral(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateLiteral")
    @js.native
    def assertTemplateLiteral(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTemplateLiteral")
    @js.native
    def assertTemplateLiteral(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TemplateLiteral))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTerminatorless")
    @js.native
    def assertTerminatorless(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTerminatorless")
    @js.native
    def assertTerminatorless(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTerminatorless")
    @js.native
    def assertTerminatorless(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTerminatorless")
    @js.native
    def assertTerminatorless(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTerminatorless")
    @js.native
    def assertTerminatorless(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(Terminatorless))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertThisExpression")
    @js.native
    def assertThisExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisExpression")
    @js.native
    def assertThisExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisExpression")
    @js.native
    def assertThisExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisExpression")
    @js.native
    def assertThisExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisExpression")
    @js.native
    def assertThisExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertThisTypeAnnotation")
    @js.native
    def assertThisTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisTypeAnnotation")
    @js.native
    def assertThisTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisTypeAnnotation")
    @js.native
    def assertThisTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisTypeAnnotation")
    @js.native
    def assertThisTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThisTypeAnnotation")
    @js.native
    def assertThisTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThisTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertThrowStatement")
    @js.native
    def assertThrowStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThrowStatement")
    @js.native
    def assertThrowStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThrowStatement")
    @js.native
    def assertThrowStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThrowStatement")
    @js.native
    def assertThrowStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertThrowStatement")
    @js.native
    def assertThrowStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(ThrowStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTryStatement")
    @js.native
    def assertTryStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTryStatement")
    @js.native
    def assertTryStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTryStatement")
    @js.native
    def assertTryStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTryStatement")
    @js.native
    def assertTryStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTryStatement")
    @js.native
    def assertTryStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TryStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTupleTypeAnnotation")
    @js.native
    def assertTupleTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTupleTypeAnnotation")
    @js.native
    def assertTupleTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTupleTypeAnnotation")
    @js.native
    def assertTupleTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTupleTypeAnnotation")
    @js.native
    def assertTupleTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTupleTypeAnnotation")
    @js.native
    def assertTupleTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TupleTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTypeAlias")
    @js.native
    def assertTypeAlias(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAlias")
    @js.native
    def assertTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAlias")
    @js.native
    def assertTypeAlias(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAlias")
    @js.native
    def assertTypeAlias(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAlias")
    @js.native
    def assertTypeAlias(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAlias))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTypeAnnotation")
    @js.native
    def assertTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAnnotation")
    @js.native
    def assertTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAnnotation")
    @js.native
    def assertTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAnnotation")
    @js.native
    def assertTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeAnnotation")
    @js.native
    def assertTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTypeCastExpression")
    @js.native
    def assertTypeCastExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeCastExpression")
    @js.native
    def assertTypeCastExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeCastExpression")
    @js.native
    def assertTypeCastExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeCastExpression")
    @js.native
    def assertTypeCastExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeCastExpression")
    @js.native
    def assertTypeCastExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeCastExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTypeParameter")
    @js.native
    def assertTypeParameter(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameter")
    @js.native
    def assertTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameter")
    @js.native
    def assertTypeParameter(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameter")
    @js.native
    def assertTypeParameter(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameter")
    @js.native
    def assertTypeParameter(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameter))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTypeParameterDeclaration")
    @js.native
    def assertTypeParameterDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterDeclaration")
    @js.native
    def assertTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterDeclaration")
    @js.native
    def assertTypeParameterDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterDeclaration")
    @js.native
    def assertTypeParameterDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterDeclaration")
    @js.native
    def assertTypeParameterDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTypeParameterInstantiation")
    @js.native
    def assertTypeParameterInstantiation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterInstantiation")
    @js.native
    def assertTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterInstantiation")
    @js.native
    def assertTypeParameterInstantiation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterInstantiation")
    @js.native
    def assertTypeParameterInstantiation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeParameterInstantiation")
    @js.native
    def assertTypeParameterInstantiation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeParameterInstantiation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertTypeofTypeAnnotation")
    @js.native
    def assertTypeofTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeofTypeAnnotation")
    @js.native
    def assertTypeofTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeofTypeAnnotation")
    @js.native
    def assertTypeofTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeofTypeAnnotation")
    @js.native
    def assertTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertTypeofTypeAnnotation")
    @js.native
    def assertTypeofTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(TypeofTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertUnaryExpression")
    @js.native
    def assertUnaryExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryExpression")
    @js.native
    def assertUnaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryExpression")
    @js.native
    def assertUnaryExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryExpression")
    @js.native
    def assertUnaryExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryExpression")
    @js.native
    def assertUnaryExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertUnaryLike")
    @js.native
    def assertUnaryLike(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryLike")
    @js.native
    def assertUnaryLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryLike")
    @js.native
    def assertUnaryLike(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryLike")
    @js.native
    def assertUnaryLike(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnaryLike")
    @js.native
    def assertUnaryLike(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnaryLike))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertUnionTypeAnnotation")
    @js.native
    def assertUnionTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnionTypeAnnotation")
    @js.native
    def assertUnionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnionTypeAnnotation")
    @js.native
    def assertUnionTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnionTypeAnnotation")
    @js.native
    def assertUnionTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUnionTypeAnnotation")
    @js.native
    def assertUnionTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UnionTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertUpdateExpression")
    @js.native
    def assertUpdateExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUpdateExpression")
    @js.native
    def assertUpdateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUpdateExpression")
    @js.native
    def assertUpdateExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUpdateExpression")
    @js.native
    def assertUpdateExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUpdateExpression")
    @js.native
    def assertUpdateExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UpdateExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertUserWhitespacable")
    @js.native
    def assertUserWhitespacable(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUserWhitespacable")
    @js.native
    def assertUserWhitespacable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUserWhitespacable")
    @js.native
    def assertUserWhitespacable(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUserWhitespacable")
    @js.native
    def assertUserWhitespacable(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertUserWhitespacable")
    @js.native
    def assertUserWhitespacable(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(UserWhitespacable))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertVariableDeclaration")
    @js.native
    def assertVariableDeclaration(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclaration")
    @js.native
    def assertVariableDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclaration")
    @js.native
    def assertVariableDeclaration(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclaration")
    @js.native
    def assertVariableDeclaration(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclaration")
    @js.native
    def assertVariableDeclaration(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclaration))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertVariableDeclarator")
    @js.native
    def assertVariableDeclarator(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclarator")
    @js.native
    def assertVariableDeclarator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclarator")
    @js.native
    def assertVariableDeclarator(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclarator")
    @js.native
    def assertVariableDeclarator(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVariableDeclarator")
    @js.native
    def assertVariableDeclarator(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VariableDeclarator))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertVoidTypeAnnotation")
    @js.native
    def assertVoidTypeAnnotation(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVoidTypeAnnotation")
    @js.native
    def assertVoidTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVoidTypeAnnotation")
    @js.native
    def assertVoidTypeAnnotation(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVoidTypeAnnotation")
    @js.native
    def assertVoidTypeAnnotation(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertVoidTypeAnnotation")
    @js.native
    def assertVoidTypeAnnotation(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(VoidTypeAnnotation))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertWhile")
    @js.native
    def assertWhile(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhile")
    @js.native
    def assertWhile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhile")
    @js.native
    def assertWhile(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhile")
    @js.native
    def assertWhile(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhile")
    @js.native
    def assertWhile(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(While))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertWhileStatement")
    @js.native
    def assertWhileStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhileStatement")
    @js.native
    def assertWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhileStatement")
    @js.native
    def assertWhileStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhileStatement")
    @js.native
    def assertWhileStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWhileStatement")
    @js.native
    def assertWhileStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WhileStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertWithStatement")
    @js.native
    def assertWithStatement(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWithStatement")
    @js.native
    def assertWithStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWithStatement")
    @js.native
    def assertWithStatement(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWithStatement")
    @js.native
    def assertWithStatement(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertWithStatement")
    @js.native
    def assertWithStatement(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(WithStatement))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assertYieldExpression")
    @js.native
    def assertYieldExpression(): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertYieldExpression")
    @js.native
    def assertYieldExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertYieldExpression")
    @js.native
    def assertYieldExpression(node: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertYieldExpression")
    @js.native
    def assertYieldExpression(node: js.Object, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    @JSImport("babel-core", "types.assertYieldExpression")
    @js.native
    def assertYieldExpression(node: Null, opts: js.Object): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-types), TsIdentModule(None,List(babel-types, ts3.6)), TsIdentSimple(YieldExpression))),IArray())*/ Boolean = js.native
    
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(): AssignmentExpression_ = js.native
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(operator: js.UndefOr[scala.Nothing], left: js.UndefOr[scala.Nothing], right: Expression): AssignmentExpression_ = js.native
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(operator: js.UndefOr[scala.Nothing], left: LVal): AssignmentExpression_ = js.native
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(operator: js.UndefOr[scala.Nothing], left: LVal, right: Expression): AssignmentExpression_ = js.native
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(operator: String): AssignmentExpression_ = js.native
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(operator: String, left: js.UndefOr[scala.Nothing], right: Expression): AssignmentExpression_ = js.native
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(operator: String, left: LVal): AssignmentExpression_ = js.native
    @JSImport("babel-core", "types.assignmentExpression")
    @js.native
    def assignmentExpression(operator: String, left: LVal, right: Expression): AssignmentExpression_ = js.native
    
    @JSImport("babel-core", "types.assignmentPattern")
    @js.native
    def assignmentPattern(): AssignmentPattern_ = js.native
    @JSImport("babel-core", "types.assignmentPattern")
    @js.native
    def assignmentPattern(left: js.UndefOr[scala.Nothing], right: Expression): AssignmentPattern_ = js.native
    @JSImport("babel-core", "types.assignmentPattern")
    @js.native
    def assignmentPattern(left: Identifier_): AssignmentPattern_ = js.native
    @JSImport("babel-core", "types.assignmentPattern")
    @js.native
    def assignmentPattern(left: Identifier_, right: Expression): AssignmentPattern_ = js.native
    
    @JSImport("babel-core", "types.awaitExpression")
    @js.native
    def awaitExpression(): AwaitExpression_ = js.native
    @JSImport("babel-core", "types.awaitExpression")
    @js.native
    def awaitExpression(argument: Expression): AwaitExpression_ = js.native
    
    @JSImport("babel-core", "types.binaryExpression")
    @js.native
    def binaryExpression(
      operator: js.UndefOr[
          Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
        ],
      left: js.UndefOr[Expression],
      right: js.UndefOr[Expression]
    ): BinaryExpression_ = js.native
    
    @JSImport("babel-core", "types.bindExpression")
    @js.native
    def bindExpression(): BindExpression_ = js.native
    @JSImport("babel-core", "types.bindExpression")
    @js.native
    def bindExpression(`object`: js.UndefOr[scala.Nothing], callee: Expression): BindExpression_ = js.native
    @JSImport("babel-core", "types.bindExpression")
    @js.native
    def bindExpression(`object`: Expression): BindExpression_ = js.native
    @JSImport("babel-core", "types.bindExpression")
    @js.native
    def bindExpression(`object`: Expression, callee: Expression): BindExpression_ = js.native
    
    @JSImport("babel-core", "types.blockStatement")
    @js.native
    def blockStatement(): BlockStatement_ = js.native
    @JSImport("babel-core", "types.blockStatement")
    @js.native
    def blockStatement(body: js.UndefOr[scala.Nothing], directives: js.Array[Directive_]): BlockStatement_ = js.native
    @JSImport("babel-core", "types.blockStatement")
    @js.native
    def blockStatement(body: js.Array[Statement]): BlockStatement_ = js.native
    @JSImport("babel-core", "types.blockStatement")
    @js.native
    def blockStatement(body: js.Array[Statement], directives: js.Array[Directive_]): BlockStatement_ = js.native
    
    @JSImport("babel-core", "types.booleanLiteral")
    @js.native
    def booleanLiteral(): BooleanLiteral_ = js.native
    @JSImport("babel-core", "types.booleanLiteral")
    @js.native
    def booleanLiteral(value: Boolean): BooleanLiteral_ = js.native
    
    @JSImport("babel-core", "types.booleanLiteralTypeAnnotation")
    @js.native
    def booleanLiteralTypeAnnotation(): BooleanLiteralTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.booleanTypeAnnotation")
    @js.native
    def booleanTypeAnnotation(): BooleanTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.breakStatement")
    @js.native
    def breakStatement(): BreakStatement_ = js.native
    @JSImport("babel-core", "types.breakStatement")
    @js.native
    def breakStatement(label: Identifier_): BreakStatement_ = js.native
    
    @JSImport("babel-core", "types.callExpression")
    @js.native
    def callExpression(): CallExpression_ = js.native
    @JSImport("babel-core", "types.callExpression")
    @js.native
    def callExpression(callee: js.UndefOr[scala.Nothing], _arguments: js.Array[Expression | SpreadElement_]): CallExpression_ = js.native
    @JSImport("babel-core", "types.callExpression")
    @js.native
    def callExpression(callee: Expression): CallExpression_ = js.native
    @JSImport("babel-core", "types.callExpression")
    @js.native
    def callExpression(callee: Expression, _arguments: js.Array[Expression | SpreadElement_]): CallExpression_ = js.native
    
    @JSImport("babel-core", "types.catchClause")
    @js.native
    def catchClause(): CatchClause_ = js.native
    @JSImport("babel-core", "types.catchClause")
    @js.native
    def catchClause(param: js.UndefOr[scala.Nothing], body: BlockStatement_): CatchClause_ = js.native
    @JSImport("babel-core", "types.catchClause")
    @js.native
    def catchClause(param: Identifier_): CatchClause_ = js.native
    @JSImport("babel-core", "types.catchClause")
    @js.native
    def catchClause(param: Identifier_, body: BlockStatement_): CatchClause_ = js.native
    
    @JSImport("babel-core", "types.classBody")
    @js.native
    def classBody(): ClassBody_ = js.native
    @JSImport("babel-core", "types.classBody")
    @js.native
    def classBody(body: js.Array[ClassMethod_ | ClassProperty_]): ClassBody_ = js.native
    
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(
      id: js.UndefOr[scala.Nothing],
      superClass: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: js.UndefOr[scala.Nothing], superClass: js.UndefOr[scala.Nothing], body: ClassBody_): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(
      id: js.UndefOr[scala.Nothing],
      superClass: js.UndefOr[scala.Nothing],
      body: ClassBody_,
      decorators: js.Array[Decorator_]
    ): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: js.UndefOr[scala.Nothing], superClass: Expression): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(
      id: js.UndefOr[scala.Nothing],
      superClass: Expression,
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: js.UndefOr[scala.Nothing], superClass: Expression, body: ClassBody_): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(
      id: js.UndefOr[scala.Nothing],
      superClass: Expression,
      body: ClassBody_,
      decorators: js.Array[Decorator_]
    ): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: Identifier_): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(
      id: Identifier_,
      superClass: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: Identifier_, superClass: js.UndefOr[scala.Nothing], body: ClassBody_): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(
      id: Identifier_,
      superClass: js.UndefOr[scala.Nothing],
      body: ClassBody_,
      decorators: js.Array[Decorator_]
    ): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: Identifier_, superClass: Expression): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(
      id: Identifier_,
      superClass: Expression,
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: Identifier_, superClass: Expression, body: ClassBody_): ClassDeclaration_ = js.native
    @JSImport("babel-core", "types.classDeclaration")
    @js.native
    def classDeclaration(id: Identifier_, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
    
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(
      id: js.UndefOr[scala.Nothing],
      superClass: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: js.UndefOr[scala.Nothing], superClass: js.UndefOr[scala.Nothing], body: ClassBody_): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(
      id: js.UndefOr[scala.Nothing],
      superClass: js.UndefOr[scala.Nothing],
      body: ClassBody_,
      decorators: js.Array[Decorator_]
    ): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: js.UndefOr[scala.Nothing], superClass: Expression): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(
      id: js.UndefOr[scala.Nothing],
      superClass: Expression,
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: js.UndefOr[scala.Nothing], superClass: Expression, body: ClassBody_): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(
      id: js.UndefOr[scala.Nothing],
      superClass: Expression,
      body: ClassBody_,
      decorators: js.Array[Decorator_]
    ): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: Identifier_): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(
      id: Identifier_,
      superClass: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: Identifier_, superClass: js.UndefOr[scala.Nothing], body: ClassBody_): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(
      id: Identifier_,
      superClass: js.UndefOr[scala.Nothing],
      body: ClassBody_,
      decorators: js.Array[Decorator_]
    ): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: Identifier_, superClass: Expression): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(
      id: Identifier_,
      superClass: Expression,
      body: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: Identifier_, superClass: Expression, body: ClassBody_): ClassExpression_ = js.native
    @JSImport("babel-core", "types.classExpression")
    @js.native
    def classExpression(id: Identifier_, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = js.native
    
    @JSImport("babel-core", "types.classImplements")
    @js.native
    def classImplements(): ClassImplements_ = js.native
    @JSImport("babel-core", "types.classImplements")
    @js.native
    def classImplements(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterInstantiation_): ClassImplements_ = js.native
    @JSImport("babel-core", "types.classImplements")
    @js.native
    def classImplements(id: Identifier_): ClassImplements_ = js.native
    @JSImport("babel-core", "types.classImplements")
    @js.native
    def classImplements(id: Identifier_, typeParameters: TypeParameterInstantiation_): ClassImplements_ = js.native
    
    @JSImport("babel-core", "types.classMethod")
    @js.native
    def classMethod(
      kind: js.UndefOr[constructor | method | get | set],
      key: js.UndefOr[Expression],
      params: js.UndefOr[js.Array[LVal]],
      body: js.UndefOr[BlockStatement_],
      computed: js.UndefOr[Boolean],
      _static: js.UndefOr[Boolean]
    ): ClassMethod_ = js.native
    
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      typeAnnotation: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(key: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      typeAnnotation: TypeAnnotation_,
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(key: js.UndefOr[scala.Nothing], value: Expression): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: js.UndefOr[scala.Nothing],
      value: Expression,
      typeAnnotation: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(key: js.UndefOr[scala.Nothing], value: Expression, typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: js.UndefOr[scala.Nothing],
      value: Expression,
      typeAnnotation: TypeAnnotation_,
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(key: Identifier_): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: Identifier_,
      value: js.UndefOr[scala.Nothing],
      typeAnnotation: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(key: Identifier_, value: js.UndefOr[scala.Nothing], typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: Identifier_,
      value: js.UndefOr[scala.Nothing],
      typeAnnotation: TypeAnnotation_,
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(key: Identifier_, value: Expression): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: Identifier_,
      value: Expression,
      typeAnnotation: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(key: Identifier_, value: Expression, typeAnnotation: TypeAnnotation_): ClassProperty_ = js.native
    @JSImport("babel-core", "types.classProperty")
    @js.native
    def classProperty(
      key: Identifier_,
      value: Expression,
      typeAnnotation: TypeAnnotation_,
      decorators: js.Array[Decorator_]
    ): ClassProperty_ = js.native
    
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(): ConditionalExpression_ = js.native
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(test: js.UndefOr[scala.Nothing], consequent: js.UndefOr[scala.Nothing], alternate: Expression): ConditionalExpression_ = js.native
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(test: js.UndefOr[scala.Nothing], consequent: Expression): ConditionalExpression_ = js.native
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(test: js.UndefOr[scala.Nothing], consequent: Expression, alternate: Expression): ConditionalExpression_ = js.native
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(test: Expression): ConditionalExpression_ = js.native
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(test: Expression, consequent: js.UndefOr[scala.Nothing], alternate: Expression): ConditionalExpression_ = js.native
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(test: Expression, consequent: Expression): ConditionalExpression_ = js.native
    @JSImport("babel-core", "types.conditionalExpression")
    @js.native
    def conditionalExpression(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression_ = js.native
    
    @JSImport("babel-core", "types.continueStatement")
    @js.native
    def continueStatement(): ContinueStatement_ = js.native
    @JSImport("babel-core", "types.continueStatement")
    @js.native
    def continueStatement(label: Identifier_): ContinueStatement_ = js.native
    
    @JSImport("babel-core", "types.debuggerStatement")
    @js.native
    def debuggerStatement(): DebuggerStatement_ = js.native
    
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_]
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterDeclaration_): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_]
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(id: Identifier_): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], _extends: js.Array[InterfaceExtends_]): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareClass_ = js.native
    @JSImport("babel-core", "types.declareClass")
    @js.native
    def declareClass(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareClass_ = js.native
    
    @JSImport("babel-core", "types.declareFunction")
    @js.native
    def declareFunction(): DeclareFunction_ = js.native
    @JSImport("babel-core", "types.declareFunction")
    @js.native
    def declareFunction(id: Identifier_): DeclareFunction_ = js.native
    
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_]
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterDeclaration_): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_]
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(id: Identifier_): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], _extends: js.Array[InterfaceExtends_]): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareInterface_ = js.native
    @JSImport("babel-core", "types.declareInterface")
    @js.native
    def declareInterface(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): DeclareInterface_ = js.native
    
    @JSImport("babel-core", "types.declareModule")
    @js.native
    def declareModule(): DeclareModule_ = js.native
    @JSImport("babel-core", "types.declareModule")
    @js.native
    def declareModule(id: js.UndefOr[scala.Nothing], body: BlockStatement_): DeclareModule_ = js.native
    @JSImport("babel-core", "types.declareModule")
    @js.native
    def declareModule(id: Identifier_): DeclareModule_ = js.native
    @JSImport("babel-core", "types.declareModule")
    @js.native
    def declareModule(id: Identifier_, body: BlockStatement_): DeclareModule_ = js.native
    @JSImport("babel-core", "types.declareModule")
    @js.native
    def declareModule(id: StringLiteral_): DeclareModule_ = js.native
    @JSImport("babel-core", "types.declareModule")
    @js.native
    def declareModule(id: StringLiteral_, body: BlockStatement_): DeclareModule_ = js.native
    
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(): DeclareTypeAlias_ = js.native
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      right: FlowTypeAnnotation
    ): DeclareTypeAlias_ = js.native
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterDeclaration_): DeclareTypeAlias_ = js.native
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      right: FlowTypeAnnotation
    ): DeclareTypeAlias_ = js.native
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(id: Identifier_): DeclareTypeAlias_ = js.native
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareTypeAlias_ = js.native
    @JSImport("babel-core", "types.declareTypeAlias")
    @js.native
    def declareTypeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_, right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
    
    @JSImport("babel-core", "types.declareVariable")
    @js.native
    def declareVariable(): DeclareVariable_ = js.native
    @JSImport("babel-core", "types.declareVariable")
    @js.native
    def declareVariable(id: Identifier_): DeclareVariable_ = js.native
    
    @JSImport("babel-core", "types.decorator")
    @js.native
    def decorator(): Decorator_ = js.native
    @JSImport("babel-core", "types.decorator")
    @js.native
    def decorator(expression: Expression): Decorator_ = js.native
    
    @JSImport("babel-core", "types.directive")
    @js.native
    def directive(): Directive_ = js.native
    @JSImport("babel-core", "types.directive")
    @js.native
    def directive(value: DirectiveLiteral_): Directive_ = js.native
    
    @JSImport("babel-core", "types.directiveLiteral")
    @js.native
    def directiveLiteral(): DirectiveLiteral_ = js.native
    @JSImport("babel-core", "types.directiveLiteral")
    @js.native
    def directiveLiteral(value: String): DirectiveLiteral_ = js.native
    
    @JSImport("babel-core", "types.doExpression")
    @js.native
    def doExpression(): DoExpression_ = js.native
    @JSImport("babel-core", "types.doExpression")
    @js.native
    def doExpression(body: BlockStatement_): DoExpression_ = js.native
    
    @JSImport("babel-core", "types.doWhileStatement")
    @js.native
    def doWhileStatement(): DoWhileStatement_ = js.native
    @JSImport("babel-core", "types.doWhileStatement")
    @js.native
    def doWhileStatement(test: js.UndefOr[scala.Nothing], body: Statement): DoWhileStatement_ = js.native
    @JSImport("babel-core", "types.doWhileStatement")
    @js.native
    def doWhileStatement(test: Expression): DoWhileStatement_ = js.native
    @JSImport("babel-core", "types.doWhileStatement")
    @js.native
    def doWhileStatement(test: Expression, body: Statement): DoWhileStatement_ = js.native
    
    @JSImport("babel-core", "types.emptyStatement")
    @js.native
    def emptyStatement(): EmptyStatement_ = js.native
    
    @JSImport("babel-core", "types.existentialTypeParam")
    @js.native
    def existentialTypeParam(): ExistentialTypeParam_ = js.native
    
    @JSImport("babel-core", "types.exportAllDeclaration")
    @js.native
    def exportAllDeclaration(): ExportAllDeclaration_ = js.native
    @JSImport("babel-core", "types.exportAllDeclaration")
    @js.native
    def exportAllDeclaration(source: StringLiteral_): ExportAllDeclaration_ = js.native
    
    @JSImport("babel-core", "types.exportDefaultDeclaration")
    @js.native
    def exportDefaultDeclaration(): ExportDefaultDeclaration_ = js.native
    @JSImport("babel-core", "types.exportDefaultDeclaration")
    @js.native
    def exportDefaultDeclaration(declaration: ClassDeclaration_): ExportDefaultDeclaration_ = js.native
    @JSImport("babel-core", "types.exportDefaultDeclaration")
    @js.native
    def exportDefaultDeclaration(declaration: Expression): ExportDefaultDeclaration_ = js.native
    @JSImport("babel-core", "types.exportDefaultDeclaration")
    @js.native
    def exportDefaultDeclaration(declaration: FunctionDeclaration_): ExportDefaultDeclaration_ = js.native
    
    @JSImport("babel-core", "types.exportDefaultSpecifier")
    @js.native
    def exportDefaultSpecifier(): ExportDefaultSpecifier_ = js.native
    @JSImport("babel-core", "types.exportDefaultSpecifier")
    @js.native
    def exportDefaultSpecifier(exported: Identifier_): ExportDefaultSpecifier_ = js.native
    
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(): ExportNamedDeclaration_ = js.native
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(
      declaration: js.UndefOr[scala.Nothing],
      specifiers: js.UndefOr[scala.Nothing],
      source: StringLiteral_
    ): ExportNamedDeclaration_ = js.native
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(declaration: js.UndefOr[scala.Nothing], specifiers: js.Array[ExportSpecifier_]): ExportNamedDeclaration_ = js.native
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(
      declaration: js.UndefOr[scala.Nothing],
      specifiers: js.Array[ExportSpecifier_],
      source: StringLiteral_
    ): ExportNamedDeclaration_ = js.native
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(declaration: Declaration): ExportNamedDeclaration_ = js.native
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(declaration: Declaration, specifiers: js.UndefOr[scala.Nothing], source: StringLiteral_): ExportNamedDeclaration_ = js.native
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(declaration: Declaration, specifiers: js.Array[ExportSpecifier_]): ExportNamedDeclaration_ = js.native
    @JSImport("babel-core", "types.exportNamedDeclaration")
    @js.native
    def exportNamedDeclaration(declaration: Declaration, specifiers: js.Array[ExportSpecifier_], source: StringLiteral_): ExportNamedDeclaration_ = js.native
    
    @JSImport("babel-core", "types.exportNamespaceSpecifier")
    @js.native
    def exportNamespaceSpecifier(): ExportNamespaceSpecifier_ = js.native
    @JSImport("babel-core", "types.exportNamespaceSpecifier")
    @js.native
    def exportNamespaceSpecifier(exported: Identifier_): ExportNamespaceSpecifier_ = js.native
    
    @JSImport("babel-core", "types.exportSpecifier")
    @js.native
    def exportSpecifier(): ExportSpecifier_ = js.native
    @JSImport("babel-core", "types.exportSpecifier")
    @js.native
    def exportSpecifier(local: js.UndefOr[scala.Nothing], exported: Identifier_): ExportSpecifier_ = js.native
    @JSImport("babel-core", "types.exportSpecifier")
    @js.native
    def exportSpecifier(local: Identifier_): ExportSpecifier_ = js.native
    @JSImport("babel-core", "types.exportSpecifier")
    @js.native
    def exportSpecifier(local: Identifier_, exported: Identifier_): ExportSpecifier_ = js.native
    
    @JSImport("babel-core", "types.expressionStatement")
    @js.native
    def expressionStatement(): ExpressionStatement_ = js.native
    @JSImport("babel-core", "types.expressionStatement")
    @js.native
    def expressionStatement(expression: Expression): ExpressionStatement_ = js.native
    
    @JSImport("babel-core", "types.file")
    @js.native
    def file(): File_ = js.native
    @JSImport("babel-core", "types.file")
    @js.native
    def file(program: js.UndefOr[scala.Nothing], comments: js.UndefOr[scala.Nothing], tokens: js.Array[_]): File_ = js.native
    @JSImport("babel-core", "types.file")
    @js.native
    def file(program: js.UndefOr[scala.Nothing], comments: js.Array[Comment]): File_ = js.native
    @JSImport("babel-core", "types.file")
    @js.native
    def file(program: js.UndefOr[scala.Nothing], comments: js.Array[Comment], tokens: js.Array[_]): File_ = js.native
    @JSImport("babel-core", "types.file")
    @js.native
    def file(program: Program_): File_ = js.native
    @JSImport("babel-core", "types.file")
    @js.native
    def file(program: Program_, comments: js.UndefOr[scala.Nothing], tokens: js.Array[_]): File_ = js.native
    @JSImport("babel-core", "types.file")
    @js.native
    def file(program: Program_, comments: js.Array[Comment]): File_ = js.native
    @JSImport("babel-core", "types.file")
    @js.native
    def file(program: Program_, comments: js.Array[Comment], tokens: js.Array[_]): File_ = js.native
    
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], body: Statement): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: js.UndefOr[scala.Nothing], right: Expression): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: js.UndefOr[scala.Nothing], right: Expression, body: Statement): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: LVal): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: LVal, right: js.UndefOr[scala.Nothing], body: Statement): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: LVal, right: Expression): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: LVal, right: Expression, body: Statement): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: VariableDeclaration_): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: VariableDeclaration_, right: js.UndefOr[scala.Nothing], body: Statement): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: VariableDeclaration_, right: Expression): ForInStatement_ = js.native
    @JSImport("babel-core", "types.forInStatement")
    @js.native
    def forInStatement(left: VariableDeclaration_, right: Expression, body: Statement): ForInStatement_ = js.native
    
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], body: Statement): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: js.UndefOr[scala.Nothing], right: Expression): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: js.UndefOr[scala.Nothing], right: Expression, body: Statement): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: LVal): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: LVal, right: js.UndefOr[scala.Nothing], body: Statement): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: LVal, right: Expression): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: LVal, right: Expression, body: Statement): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: VariableDeclaration_): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: VariableDeclaration_, right: js.UndefOr[scala.Nothing], body: Statement): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: VariableDeclaration_, right: Expression): ForOfStatement_ = js.native
    @JSImport("babel-core", "types.forOfStatement")
    @js.native
    def forOfStatement(left: VariableDeclaration_, right: Expression, body: Statement): ForOfStatement_ = js.native
    
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(
      init: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      update: js.UndefOr[scala.Nothing],
      body: Statement
    ): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: js.UndefOr[scala.Nothing], test: js.UndefOr[scala.Nothing], update: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(
      init: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      update: Expression,
      body: Statement
    ): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: js.UndefOr[scala.Nothing], test: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(
      init: js.UndefOr[scala.Nothing],
      test: Expression,
      update: js.UndefOr[scala.Nothing],
      body: Statement
    ): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: js.UndefOr[scala.Nothing], test: Expression, update: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: js.UndefOr[scala.Nothing], test: Expression, update: Expression, body: Statement): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(
      init: Expression,
      test: js.UndefOr[scala.Nothing],
      update: js.UndefOr[scala.Nothing],
      body: Statement
    ): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: Expression, test: js.UndefOr[scala.Nothing], update: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: Expression, test: js.UndefOr[scala.Nothing], update: Expression, body: Statement): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: Expression, test: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: Expression, test: Expression, update: js.UndefOr[scala.Nothing], body: Statement): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: Expression, test: Expression, update: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: Expression, test: Expression, update: Expression, body: Statement): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: VariableDeclaration_): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(
      init: VariableDeclaration_,
      test: js.UndefOr[scala.Nothing],
      update: js.UndefOr[scala.Nothing],
      body: Statement
    ): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: VariableDeclaration_, test: js.UndefOr[scala.Nothing], update: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: VariableDeclaration_, test: js.UndefOr[scala.Nothing], update: Expression, body: Statement): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: VariableDeclaration_, test: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: VariableDeclaration_, test: Expression, update: js.UndefOr[scala.Nothing], body: Statement): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: VariableDeclaration_, test: Expression, update: Expression): ForStatement_ = js.native
    @JSImport("babel-core", "types.forStatement")
    @js.native
    def forStatement(init: VariableDeclaration_, test: Expression, update: Expression, body: Statement): ForStatement_ = js.native
    
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], body: BlockStatement_): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: Boolean,
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: js.UndefOr[scala.Nothing], params: js.Array[LVal]): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: js.UndefOr[scala.Nothing], params: js.Array[LVal], body: BlockStatement_): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: js.UndefOr[scala.Nothing], params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: BlockStatement_,
      generator: Boolean,
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_, params: js.UndefOr[scala.Nothing], body: BlockStatement_): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_, params: js.UndefOr[scala.Nothing], body: BlockStatement_, generator: Boolean): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: Boolean,
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal]): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: js.UndefOr[scala.Nothing], generator: Boolean): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: BlockStatement_): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(
      id: Identifier_,
      params: js.Array[LVal],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionDeclaration_ = js.native
    @JSImport("babel-core", "types.functionDeclaration")
    @js.native
    def functionDeclaration(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean, async: Boolean): FunctionDeclaration_ = js.native
    
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], body: BlockStatement_): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: Boolean,
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: js.UndefOr[scala.Nothing], params: js.Array[LVal]): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: js.UndefOr[scala.Nothing], params: js.Array[LVal], body: BlockStatement_): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: js.UndefOr[scala.Nothing], params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: js.UndefOr[scala.Nothing],
      params: js.Array[LVal],
      body: BlockStatement_,
      generator: Boolean,
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_, params: js.UndefOr[scala.Nothing], body: BlockStatement_): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_, params: js.UndefOr[scala.Nothing], body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.UndefOr[scala.Nothing],
      body: BlockStatement_,
      generator: Boolean,
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal]): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: js.UndefOr[scala.Nothing], generator: Boolean): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.Array[LVal],
      body: js.UndefOr[scala.Nothing],
      generator: Boolean,
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: BlockStatement_): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(
      id: Identifier_,
      params: js.Array[LVal],
      body: BlockStatement_,
      generator: js.UndefOr[scala.Nothing],
      async: Boolean
    ): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
    @JSImport("babel-core", "types.functionExpression")
    @js.native
    def functionExpression(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
    
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      rest: js.UndefOr[scala.Nothing],
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      rest: FunctionTypeParam_
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      rest: FunctionTypeParam_,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(typeParameters: js.UndefOr[scala.Nothing], params: js.Array[FunctionTypeParam_]): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[FunctionTypeParam_],
      rest: js.UndefOr[scala.Nothing],
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[FunctionTypeParam_],
      rest: FunctionTypeParam_
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: js.UndefOr[scala.Nothing],
      params: js.Array[FunctionTypeParam_],
      rest: FunctionTypeParam_,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(typeParameters: TypeParameterDeclaration_): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.UndefOr[scala.Nothing],
      rest: js.UndefOr[scala.Nothing],
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.UndefOr[scala.Nothing],
      rest: FunctionTypeParam_
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.UndefOr[scala.Nothing],
      rest: FunctionTypeParam_,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(typeParameters: TypeParameterDeclaration_, params: js.Array[FunctionTypeParam_]): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[FunctionTypeParam_],
      rest: js.UndefOr[scala.Nothing],
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[FunctionTypeParam_],
      rest: FunctionTypeParam_
    ): FunctionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.functionTypeAnnotation")
    @js.native
    def functionTypeAnnotation(
      typeParameters: TypeParameterDeclaration_,
      params: js.Array[FunctionTypeParam_],
      rest: FunctionTypeParam_,
      returnType: FlowTypeAnnotation
    ): FunctionTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.functionTypeParam")
    @js.native
    def functionTypeParam(): FunctionTypeParam_ = js.native
    @JSImport("babel-core", "types.functionTypeParam")
    @js.native
    def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: FlowTypeAnnotation): FunctionTypeParam_ = js.native
    @JSImport("babel-core", "types.functionTypeParam")
    @js.native
    def functionTypeParam(name: Identifier_): FunctionTypeParam_ = js.native
    @JSImport("babel-core", "types.functionTypeParam")
    @js.native
    def functionTypeParam(name: Identifier_, typeAnnotation: FlowTypeAnnotation): FunctionTypeParam_ = js.native
    
    @JSImport("babel-core", "types.genericTypeAnnotation")
    @js.native
    def genericTypeAnnotation(): GenericTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.genericTypeAnnotation")
    @js.native
    def genericTypeAnnotation(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterInstantiation_): GenericTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.genericTypeAnnotation")
    @js.native
    def genericTypeAnnotation(id: Identifier_): GenericTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.genericTypeAnnotation")
    @js.native
    def genericTypeAnnotation(id: Identifier_, typeParameters: TypeParameterInstantiation_): GenericTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.identifier")
    @js.native
    def identifier(): Identifier_ = js.native
    @JSImport("babel-core", "types.identifier")
    @js.native
    def identifier(name: String): Identifier_ = js.native
    
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(): IfStatement_ = js.native
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(test: js.UndefOr[scala.Nothing], consequent: js.UndefOr[scala.Nothing], alternate: Statement): IfStatement_ = js.native
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(test: js.UndefOr[scala.Nothing], consequent: Statement): IfStatement_ = js.native
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(test: js.UndefOr[scala.Nothing], consequent: Statement, alternate: Statement): IfStatement_ = js.native
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(test: Expression): IfStatement_ = js.native
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(test: Expression, consequent: js.UndefOr[scala.Nothing], alternate: Statement): IfStatement_ = js.native
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(test: Expression, consequent: Statement): IfStatement_ = js.native
    @JSImport("babel-core", "types.ifStatement")
    @js.native
    def ifStatement(test: Expression, consequent: Statement, alternate: Statement): IfStatement_ = js.native
    
    @JSImport("babel-core", "types.importDeclaration")
    @js.native
    def importDeclaration(): ImportDeclaration_ = js.native
    @JSImport("babel-core", "types.importDeclaration")
    @js.native
    def importDeclaration(specifiers: js.UndefOr[scala.Nothing], source: StringLiteral_): ImportDeclaration_ = js.native
    @JSImport("babel-core", "types.importDeclaration")
    @js.native
    def importDeclaration(specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): ImportDeclaration_ = js.native
    @JSImport("babel-core", "types.importDeclaration")
    @js.native
    def importDeclaration(
      specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
      source: StringLiteral_
    ): ImportDeclaration_ = js.native
    
    @JSImport("babel-core", "types.importDefaultSpecifier")
    @js.native
    def importDefaultSpecifier(): ImportDefaultSpecifier_ = js.native
    @JSImport("babel-core", "types.importDefaultSpecifier")
    @js.native
    def importDefaultSpecifier(local: Identifier_): ImportDefaultSpecifier_ = js.native
    
    @JSImport("babel-core", "types.importNamespaceSpecifier")
    @js.native
    def importNamespaceSpecifier(): ImportNamespaceSpecifier_ = js.native
    @JSImport("babel-core", "types.importNamespaceSpecifier")
    @js.native
    def importNamespaceSpecifier(local: Identifier_): ImportNamespaceSpecifier_ = js.native
    
    @JSImport("babel-core", "types.importSpecifier")
    @js.native
    def importSpecifier(): ImportSpecifier_ = js.native
    @JSImport("babel-core", "types.importSpecifier")
    @js.native
    def importSpecifier(local: js.UndefOr[scala.Nothing], imported: Identifier_): ImportSpecifier_ = js.native
    @JSImport("babel-core", "types.importSpecifier")
    @js.native
    def importSpecifier(local: Identifier_): ImportSpecifier_ = js.native
    @JSImport("babel-core", "types.importSpecifier")
    @js.native
    def importSpecifier(local: Identifier_, imported: Identifier_): ImportSpecifier_ = js.native
    
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_]
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterDeclaration_): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_]
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(id: Identifier_): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], _extends: js.Array[InterfaceExtends_]): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: Identifier_,
      typeParameters: js.UndefOr[scala.Nothing],
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.UndefOr[scala.Nothing],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): InterfaceDeclaration_ = js.native
    @JSImport("babel-core", "types.interfaceDeclaration")
    @js.native
    def interfaceDeclaration(
      id: Identifier_,
      typeParameters: TypeParameterDeclaration_,
      _extends: js.Array[InterfaceExtends_],
      body: ObjectTypeAnnotation_
    ): InterfaceDeclaration_ = js.native
    
    @JSImport("babel-core", "types.interfaceExtends")
    @js.native
    def interfaceExtends(): InterfaceExtends_ = js.native
    @JSImport("babel-core", "types.interfaceExtends")
    @js.native
    def interfaceExtends(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterInstantiation_): InterfaceExtends_ = js.native
    @JSImport("babel-core", "types.interfaceExtends")
    @js.native
    def interfaceExtends(id: Identifier_): InterfaceExtends_ = js.native
    @JSImport("babel-core", "types.interfaceExtends")
    @js.native
    def interfaceExtends(id: Identifier_, typeParameters: TypeParameterInstantiation_): InterfaceExtends_ = js.native
    
    @JSImport("babel-core", "types.intersectionTypeAnnotation")
    @js.native
    def intersectionTypeAnnotation(): IntersectionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.intersectionTypeAnnotation")
    @js.native
    def intersectionTypeAnnotation(types: js.Array[FlowTypeAnnotation]): IntersectionTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.isAnyTypeAnnotation")
    @js.native
    def isAnyTypeAnnotation(): /* is babel-types.babel-types/ts3.6.AnyTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isAnyTypeAnnotation")
    @js.native
    def isAnyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.AnyTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isAnyTypeAnnotation")
    @js.native
    def isAnyTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.AnyTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isAnyTypeAnnotation")
    @js.native
    def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.AnyTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isAnyTypeAnnotation")
    @js.native
    def isAnyTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.AnyTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isArrayExpression")
    @js.native
    def isArrayExpression(): /* is babel-types.babel-types/ts3.6.ArrayExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayExpression")
    @js.native
    def isArrayExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayExpression")
    @js.native
    def isArrayExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.ArrayExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayExpression")
    @js.native
    def isArrayExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayExpression")
    @js.native
    def isArrayExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isArrayPattern")
    @js.native
    def isArrayPattern(): /* is babel-types.babel-types/ts3.6.ArrayPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayPattern")
    @js.native
    def isArrayPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayPattern")
    @js.native
    def isArrayPattern(node: js.Object): /* is babel-types.babel-types/ts3.6.ArrayPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayPattern")
    @js.native
    def isArrayPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayPattern")
    @js.native
    def isArrayPattern(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayPattern */ Boolean = js.native
    
    @JSImport("babel-core", "types.isArrayTypeAnnotation")
    @js.native
    def isArrayTypeAnnotation(): /* is babel-types.babel-types/ts3.6.ArrayTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayTypeAnnotation")
    @js.native
    def isArrayTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayTypeAnnotation")
    @js.native
    def isArrayTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.ArrayTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayTypeAnnotation")
    @js.native
    def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isArrayTypeAnnotation")
    @js.native
    def isArrayTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrayTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isArrowFunctionExpression")
    @js.native
    def isArrowFunctionExpression(): /* is babel-types.babel-types/ts3.6.ArrowFunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrowFunctionExpression")
    @js.native
    def isArrowFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrowFunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrowFunctionExpression")
    @js.native
    def isArrowFunctionExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.ArrowFunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrowFunctionExpression")
    @js.native
    def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrowFunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isArrowFunctionExpression")
    @js.native
    def isArrowFunctionExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ArrowFunctionExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isAssignmentExpression")
    @js.native
    def isAssignmentExpression(): /* is babel-types.babel-types/ts3.6.AssignmentExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentExpression")
    @js.native
    def isAssignmentExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentExpression")
    @js.native
    def isAssignmentExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentExpression")
    @js.native
    def isAssignmentExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentExpression")
    @js.native
    def isAssignmentExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isAssignmentPattern")
    @js.native
    def isAssignmentPattern(): /* is babel-types.babel-types/ts3.6.AssignmentPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentPattern")
    @js.native
    def isAssignmentPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentPattern")
    @js.native
    def isAssignmentPattern(node: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentPattern")
    @js.native
    def isAssignmentPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isAssignmentPattern")
    @js.native
    def isAssignmentPattern(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.AssignmentPattern */ Boolean = js.native
    
    @JSImport("babel-core", "types.isAwaitExpression")
    @js.native
    def isAwaitExpression(): /* is babel-types.babel-types/ts3.6.AwaitExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAwaitExpression")
    @js.native
    def isAwaitExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.AwaitExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAwaitExpression")
    @js.native
    def isAwaitExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.AwaitExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAwaitExpression")
    @js.native
    def isAwaitExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.AwaitExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isAwaitExpression")
    @js.native
    def isAwaitExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.AwaitExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBinary")
    @js.native
    def isBinary(): /* is babel-types.babel-types/ts3.6.Binary */ Boolean = js.native
    @JSImport("babel-core", "types.isBinary")
    @js.native
    def isBinary(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Binary */ Boolean = js.native
    @JSImport("babel-core", "types.isBinary")
    @js.native
    def isBinary(node: js.Object): /* is babel-types.babel-types/ts3.6.Binary */ Boolean = js.native
    @JSImport("babel-core", "types.isBinary")
    @js.native
    def isBinary(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Binary */ Boolean = js.native
    @JSImport("babel-core", "types.isBinary")
    @js.native
    def isBinary(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Binary */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBinaryExpression")
    @js.native
    def isBinaryExpression(): /* is babel-types.babel-types/ts3.6.BinaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBinaryExpression")
    @js.native
    def isBinaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BinaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBinaryExpression")
    @js.native
    def isBinaryExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.BinaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBinaryExpression")
    @js.native
    def isBinaryExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BinaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBinaryExpression")
    @js.native
    def isBinaryExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BinaryExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBindExpression")
    @js.native
    def isBindExpression(): /* is babel-types.babel-types/ts3.6.BindExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBindExpression")
    @js.native
    def isBindExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BindExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBindExpression")
    @js.native
    def isBindExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.BindExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBindExpression")
    @js.native
    def isBindExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BindExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isBindExpression")
    @js.native
    def isBindExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BindExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBindingIdentifier")
    @js.native
    def isBindingIdentifier(): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isBindingIdentifier")
    @js.native
    def isBindingIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isBindingIdentifier")
    @js.native
    def isBindingIdentifier(node: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isBindingIdentifier")
    @js.native
    def isBindingIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isBindingIdentifier")
    @js.native
    def isBindingIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBlock")
    @js.native
    def isBlock(): /* is babel-types.babel-types/ts3.6.Block */ Boolean = js.native
    @JSImport("babel-core", "types.isBlock")
    @js.native
    def isBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Block */ Boolean = js.native
    @JSImport("babel-core", "types.isBlock")
    @js.native
    def isBlock(node: js.Object): /* is babel-types.babel-types/ts3.6.Block */ Boolean = js.native
    @JSImport("babel-core", "types.isBlock")
    @js.native
    def isBlock(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Block */ Boolean = js.native
    @JSImport("babel-core", "types.isBlock")
    @js.native
    def isBlock(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Block */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBlockParent")
    @js.native
    def isBlockParent(): /* is babel-types.babel-types/ts3.6.BlockParent */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockParent")
    @js.native
    def isBlockParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BlockParent */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockParent")
    @js.native
    def isBlockParent(node: js.Object): /* is babel-types.babel-types/ts3.6.BlockParent */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockParent")
    @js.native
    def isBlockParent(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BlockParent */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockParent")
    @js.native
    def isBlockParent(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BlockParent */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBlockScoped")
    @js.native
    def isBlockScoped(): Boolean = js.native
    @JSImport("babel-core", "types.isBlockScoped")
    @js.native
    def isBlockScoped(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isBlockScoped")
    @js.native
    def isBlockScoped(node: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isBlockScoped")
    @js.native
    def isBlockScoped(node: js.Object, opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isBlockScoped")
    @js.native
    def isBlockScoped(node: Null, opts: js.Object): Boolean = js.native
    
    @JSImport("babel-core", "types.isBlockStatement")
    @js.native
    def isBlockStatement(): /* is babel-types.babel-types/ts3.6.BlockStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockStatement")
    @js.native
    def isBlockStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BlockStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockStatement")
    @js.native
    def isBlockStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.BlockStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockStatement")
    @js.native
    def isBlockStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BlockStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBlockStatement")
    @js.native
    def isBlockStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BlockStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBooleanLiteral")
    @js.native
    def isBooleanLiteral(): /* is babel-types.babel-types/ts3.6.BooleanLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteral")
    @js.native
    def isBooleanLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteral")
    @js.native
    def isBooleanLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteral")
    @js.native
    def isBooleanLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteral")
    @js.native
    def isBooleanLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBooleanLiteralTypeAnnotation")
    @js.native
    def isBooleanLiteralTypeAnnotation(): /* is babel-types.babel-types/ts3.6.BooleanLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteralTypeAnnotation")
    @js.native
    def isBooleanLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteralTypeAnnotation")
    @js.native
    def isBooleanLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteralTypeAnnotation")
    @js.native
    def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanLiteralTypeAnnotation")
    @js.native
    def isBooleanLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanLiteralTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBooleanTypeAnnotation")
    @js.native
    def isBooleanTypeAnnotation(): /* is babel-types.babel-types/ts3.6.BooleanTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanTypeAnnotation")
    @js.native
    def isBooleanTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanTypeAnnotation")
    @js.native
    def isBooleanTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.BooleanTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanTypeAnnotation")
    @js.native
    def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isBooleanTypeAnnotation")
    @js.native
    def isBooleanTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BooleanTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isBreakStatement")
    @js.native
    def isBreakStatement(): /* is babel-types.babel-types/ts3.6.BreakStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBreakStatement")
    @js.native
    def isBreakStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.BreakStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBreakStatement")
    @js.native
    def isBreakStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.BreakStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBreakStatement")
    @js.native
    def isBreakStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.BreakStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isBreakStatement")
    @js.native
    def isBreakStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.BreakStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isCallExpression")
    @js.native
    def isCallExpression(): /* is babel-types.babel-types/ts3.6.CallExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isCallExpression")
    @js.native
    def isCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.CallExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isCallExpression")
    @js.native
    def isCallExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.CallExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isCallExpression")
    @js.native
    def isCallExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.CallExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isCallExpression")
    @js.native
    def isCallExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.CallExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isCatchClause")
    @js.native
    def isCatchClause(): /* is babel-types.babel-types/ts3.6.CatchClause */ Boolean = js.native
    @JSImport("babel-core", "types.isCatchClause")
    @js.native
    def isCatchClause(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.CatchClause */ Boolean = js.native
    @JSImport("babel-core", "types.isCatchClause")
    @js.native
    def isCatchClause(node: js.Object): /* is babel-types.babel-types/ts3.6.CatchClause */ Boolean = js.native
    @JSImport("babel-core", "types.isCatchClause")
    @js.native
    def isCatchClause(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.CatchClause */ Boolean = js.native
    @JSImport("babel-core", "types.isCatchClause")
    @js.native
    def isCatchClause(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.CatchClause */ Boolean = js.native
    
    @JSImport("babel-core", "types.isClass")
    @js.native
    def isClass(): /* is babel-types.babel-types/ts3.6.Class */ Boolean = js.native
    @JSImport("babel-core", "types.isClass")
    @js.native
    def isClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Class */ Boolean = js.native
    @JSImport("babel-core", "types.isClass")
    @js.native
    def isClass(node: js.Object): /* is babel-types.babel-types/ts3.6.Class */ Boolean = js.native
    @JSImport("babel-core", "types.isClass")
    @js.native
    def isClass(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Class */ Boolean = js.native
    @JSImport("babel-core", "types.isClass")
    @js.native
    def isClass(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Class */ Boolean = js.native
    
    @JSImport("babel-core", "types.isClassBody")
    @js.native
    def isClassBody(): /* is babel-types.babel-types/ts3.6.ClassBody */ Boolean = js.native
    @JSImport("babel-core", "types.isClassBody")
    @js.native
    def isClassBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassBody */ Boolean = js.native
    @JSImport("babel-core", "types.isClassBody")
    @js.native
    def isClassBody(node: js.Object): /* is babel-types.babel-types/ts3.6.ClassBody */ Boolean = js.native
    @JSImport("babel-core", "types.isClassBody")
    @js.native
    def isClassBody(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassBody */ Boolean = js.native
    @JSImport("babel-core", "types.isClassBody")
    @js.native
    def isClassBody(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassBody */ Boolean = js.native
    
    @JSImport("babel-core", "types.isClassDeclaration")
    @js.native
    def isClassDeclaration(): /* is babel-types.babel-types/ts3.6.ClassDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isClassDeclaration")
    @js.native
    def isClassDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isClassDeclaration")
    @js.native
    def isClassDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.ClassDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isClassDeclaration")
    @js.native
    def isClassDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isClassDeclaration")
    @js.native
    def isClassDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isClassExpression")
    @js.native
    def isClassExpression(): /* is babel-types.babel-types/ts3.6.ClassExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isClassExpression")
    @js.native
    def isClassExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isClassExpression")
    @js.native
    def isClassExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.ClassExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isClassExpression")
    @js.native
    def isClassExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isClassExpression")
    @js.native
    def isClassExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isClassImplements")
    @js.native
    def isClassImplements(): /* is babel-types.babel-types/ts3.6.ClassImplements */ Boolean = js.native
    @JSImport("babel-core", "types.isClassImplements")
    @js.native
    def isClassImplements(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassImplements */ Boolean = js.native
    @JSImport("babel-core", "types.isClassImplements")
    @js.native
    def isClassImplements(node: js.Object): /* is babel-types.babel-types/ts3.6.ClassImplements */ Boolean = js.native
    @JSImport("babel-core", "types.isClassImplements")
    @js.native
    def isClassImplements(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassImplements */ Boolean = js.native
    @JSImport("babel-core", "types.isClassImplements")
    @js.native
    def isClassImplements(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassImplements */ Boolean = js.native
    
    @JSImport("babel-core", "types.isClassMethod")
    @js.native
    def isClassMethod(): /* is babel-types.babel-types/ts3.6.ClassMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isClassMethod")
    @js.native
    def isClassMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isClassMethod")
    @js.native
    def isClassMethod(node: js.Object): /* is babel-types.babel-types/ts3.6.ClassMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isClassMethod")
    @js.native
    def isClassMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isClassMethod")
    @js.native
    def isClassMethod(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassMethod */ Boolean = js.native
    
    @JSImport("babel-core", "types.isClassProperty")
    @js.native
    def isClassProperty(): /* is babel-types.babel-types/ts3.6.ClassProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isClassProperty")
    @js.native
    def isClassProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isClassProperty")
    @js.native
    def isClassProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.ClassProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isClassProperty")
    @js.native
    def isClassProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isClassProperty")
    @js.native
    def isClassProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ClassProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isCompletionStatement")
    @js.native
    def isCompletionStatement(): /* is babel-types.babel-types/ts3.6.CompletionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isCompletionStatement")
    @js.native
    def isCompletionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.CompletionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isCompletionStatement")
    @js.native
    def isCompletionStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.CompletionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isCompletionStatement")
    @js.native
    def isCompletionStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.CompletionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isCompletionStatement")
    @js.native
    def isCompletionStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.CompletionStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isConditional")
    @js.native
    def isConditional(): /* is babel-types.babel-types/ts3.6.Conditional */ Boolean = js.native
    @JSImport("babel-core", "types.isConditional")
    @js.native
    def isConditional(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Conditional */ Boolean = js.native
    @JSImport("babel-core", "types.isConditional")
    @js.native
    def isConditional(node: js.Object): /* is babel-types.babel-types/ts3.6.Conditional */ Boolean = js.native
    @JSImport("babel-core", "types.isConditional")
    @js.native
    def isConditional(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Conditional */ Boolean = js.native
    @JSImport("babel-core", "types.isConditional")
    @js.native
    def isConditional(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Conditional */ Boolean = js.native
    
    @JSImport("babel-core", "types.isConditionalExpression")
    @js.native
    def isConditionalExpression(): /* is babel-types.babel-types/ts3.6.ConditionalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isConditionalExpression")
    @js.native
    def isConditionalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ConditionalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isConditionalExpression")
    @js.native
    def isConditionalExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.ConditionalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isConditionalExpression")
    @js.native
    def isConditionalExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ConditionalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isConditionalExpression")
    @js.native
    def isConditionalExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ConditionalExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isContinueStatement")
    @js.native
    def isContinueStatement(): /* is babel-types.babel-types/ts3.6.ContinueStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isContinueStatement")
    @js.native
    def isContinueStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ContinueStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isContinueStatement")
    @js.native
    def isContinueStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ContinueStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isContinueStatement")
    @js.native
    def isContinueStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ContinueStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isContinueStatement")
    @js.native
    def isContinueStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ContinueStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDebuggerStatement")
    @js.native
    def isDebuggerStatement(): /* is babel-types.babel-types/ts3.6.DebuggerStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDebuggerStatement")
    @js.native
    def isDebuggerStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DebuggerStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDebuggerStatement")
    @js.native
    def isDebuggerStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.DebuggerStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDebuggerStatement")
    @js.native
    def isDebuggerStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DebuggerStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDebuggerStatement")
    @js.native
    def isDebuggerStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DebuggerStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDeclaration")
    @js.native
    def isDeclaration(): /* is babel-types.babel-types/ts3.6.Declaration */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclaration")
    @js.native
    def isDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Declaration */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclaration")
    @js.native
    def isDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.Declaration */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclaration")
    @js.native
    def isDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Declaration */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclaration")
    @js.native
    def isDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Declaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDeclareClass")
    @js.native
    def isDeclareClass(): /* is babel-types.babel-types/ts3.6.DeclareClass */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareClass")
    @js.native
    def isDeclareClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareClass */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareClass")
    @js.native
    def isDeclareClass(node: js.Object): /* is babel-types.babel-types/ts3.6.DeclareClass */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareClass")
    @js.native
    def isDeclareClass(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareClass */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareClass")
    @js.native
    def isDeclareClass(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareClass */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDeclareFunction")
    @js.native
    def isDeclareFunction(): /* is babel-types.babel-types/ts3.6.DeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareFunction")
    @js.native
    def isDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareFunction")
    @js.native
    def isDeclareFunction(node: js.Object): /* is babel-types.babel-types/ts3.6.DeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareFunction")
    @js.native
    def isDeclareFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareFunction")
    @js.native
    def isDeclareFunction(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareFunction */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDeclareInterface")
    @js.native
    def isDeclareInterface(): /* is babel-types.babel-types/ts3.6.DeclareInterface */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareInterface")
    @js.native
    def isDeclareInterface(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareInterface */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareInterface")
    @js.native
    def isDeclareInterface(node: js.Object): /* is babel-types.babel-types/ts3.6.DeclareInterface */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareInterface")
    @js.native
    def isDeclareInterface(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareInterface */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareInterface")
    @js.native
    def isDeclareInterface(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareInterface */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDeclareModule")
    @js.native
    def isDeclareModule(): /* is babel-types.babel-types/ts3.6.DeclareModule */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareModule")
    @js.native
    def isDeclareModule(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareModule */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareModule")
    @js.native
    def isDeclareModule(node: js.Object): /* is babel-types.babel-types/ts3.6.DeclareModule */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareModule")
    @js.native
    def isDeclareModule(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareModule */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareModule")
    @js.native
    def isDeclareModule(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareModule */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDeclareTypeAlias")
    @js.native
    def isDeclareTypeAlias(): /* is babel-types.babel-types/ts3.6.DeclareTypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareTypeAlias")
    @js.native
    def isDeclareTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareTypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareTypeAlias")
    @js.native
    def isDeclareTypeAlias(node: js.Object): /* is babel-types.babel-types/ts3.6.DeclareTypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareTypeAlias")
    @js.native
    def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareTypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareTypeAlias")
    @js.native
    def isDeclareTypeAlias(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareTypeAlias */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDeclareVariable")
    @js.native
    def isDeclareVariable(): /* is babel-types.babel-types/ts3.6.DeclareVariable */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareVariable")
    @js.native
    def isDeclareVariable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareVariable */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareVariable")
    @js.native
    def isDeclareVariable(node: js.Object): /* is babel-types.babel-types/ts3.6.DeclareVariable */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareVariable")
    @js.native
    def isDeclareVariable(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareVariable */ Boolean = js.native
    @JSImport("babel-core", "types.isDeclareVariable")
    @js.native
    def isDeclareVariable(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DeclareVariable */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDecorator")
    @js.native
    def isDecorator(): /* is babel-types.babel-types/ts3.6.Decorator */ Boolean = js.native
    @JSImport("babel-core", "types.isDecorator")
    @js.native
    def isDecorator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Decorator */ Boolean = js.native
    @JSImport("babel-core", "types.isDecorator")
    @js.native
    def isDecorator(node: js.Object): /* is babel-types.babel-types/ts3.6.Decorator */ Boolean = js.native
    @JSImport("babel-core", "types.isDecorator")
    @js.native
    def isDecorator(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Decorator */ Boolean = js.native
    @JSImport("babel-core", "types.isDecorator")
    @js.native
    def isDecorator(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Decorator */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDirective")
    @js.native
    def isDirective(): /* is babel-types.babel-types/ts3.6.Directive */ Boolean = js.native
    @JSImport("babel-core", "types.isDirective")
    @js.native
    def isDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Directive */ Boolean = js.native
    @JSImport("babel-core", "types.isDirective")
    @js.native
    def isDirective(node: js.Object): /* is babel-types.babel-types/ts3.6.Directive */ Boolean = js.native
    @JSImport("babel-core", "types.isDirective")
    @js.native
    def isDirective(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Directive */ Boolean = js.native
    @JSImport("babel-core", "types.isDirective")
    @js.native
    def isDirective(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Directive */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDirectiveLiteral")
    @js.native
    def isDirectiveLiteral(): /* is babel-types.babel-types/ts3.6.DirectiveLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isDirectiveLiteral")
    @js.native
    def isDirectiveLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DirectiveLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isDirectiveLiteral")
    @js.native
    def isDirectiveLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.DirectiveLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isDirectiveLiteral")
    @js.native
    def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DirectiveLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isDirectiveLiteral")
    @js.native
    def isDirectiveLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DirectiveLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDoExpression")
    @js.native
    def isDoExpression(): /* is babel-types.babel-types/ts3.6.DoExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isDoExpression")
    @js.native
    def isDoExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DoExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isDoExpression")
    @js.native
    def isDoExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.DoExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isDoExpression")
    @js.native
    def isDoExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DoExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isDoExpression")
    @js.native
    def isDoExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DoExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isDoWhileStatement")
    @js.native
    def isDoWhileStatement(): /* is babel-types.babel-types/ts3.6.DoWhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDoWhileStatement")
    @js.native
    def isDoWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.DoWhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDoWhileStatement")
    @js.native
    def isDoWhileStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.DoWhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDoWhileStatement")
    @js.native
    def isDoWhileStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.DoWhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isDoWhileStatement")
    @js.native
    def isDoWhileStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.DoWhileStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isEmptyStatement")
    @js.native
    def isEmptyStatement(): /* is babel-types.babel-types/ts3.6.EmptyStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isEmptyStatement")
    @js.native
    def isEmptyStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.EmptyStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isEmptyStatement")
    @js.native
    def isEmptyStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.EmptyStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isEmptyStatement")
    @js.native
    def isEmptyStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.EmptyStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isEmptyStatement")
    @js.native
    def isEmptyStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.EmptyStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExistentialTypeParam")
    @js.native
    def isExistentialTypeParam(): /* is babel-types.babel-types/ts3.6.ExistentialTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isExistentialTypeParam")
    @js.native
    def isExistentialTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExistentialTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isExistentialTypeParam")
    @js.native
    def isExistentialTypeParam(node: js.Object): /* is babel-types.babel-types/ts3.6.ExistentialTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isExistentialTypeParam")
    @js.native
    def isExistentialTypeParam(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExistentialTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isExistentialTypeParam")
    @js.native
    def isExistentialTypeParam(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExistentialTypeParam */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExportAllDeclaration")
    @js.native
    def isExportAllDeclaration(): /* is babel-types.babel-types/ts3.6.ExportAllDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportAllDeclaration")
    @js.native
    def isExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportAllDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportAllDeclaration")
    @js.native
    def isExportAllDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.ExportAllDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportAllDeclaration")
    @js.native
    def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportAllDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportAllDeclaration")
    @js.native
    def isExportAllDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportAllDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExportDeclaration")
    @js.native
    def isExportDeclaration(): /* is babel-types.babel-types/ts3.6.ExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDeclaration")
    @js.native
    def isExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDeclaration")
    @js.native
    def isExportDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.ExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDeclaration")
    @js.native
    def isExportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDeclaration")
    @js.native
    def isExportDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExportDefaultDeclaration")
    @js.native
    def isExportDefaultDeclaration(): /* is babel-types.babel-types/ts3.6.ExportDefaultDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultDeclaration")
    @js.native
    def isExportDefaultDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultDeclaration")
    @js.native
    def isExportDefaultDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultDeclaration")
    @js.native
    def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultDeclaration")
    @js.native
    def isExportDefaultDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExportDefaultSpecifier")
    @js.native
    def isExportDefaultSpecifier(): /* is babel-types.babel-types/ts3.6.ExportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultSpecifier")
    @js.native
    def isExportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultSpecifier")
    @js.native
    def isExportDefaultSpecifier(node: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultSpecifier")
    @js.native
    def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportDefaultSpecifier")
    @js.native
    def isExportDefaultSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportDefaultSpecifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExportNamedDeclaration")
    @js.native
    def isExportNamedDeclaration(): /* is babel-types.babel-types/ts3.6.ExportNamedDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamedDeclaration")
    @js.native
    def isExportNamedDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamedDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamedDeclaration")
    @js.native
    def isExportNamedDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamedDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamedDeclaration")
    @js.native
    def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamedDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamedDeclaration")
    @js.native
    def isExportNamedDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamedDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExportNamespaceSpecifier")
    @js.native
    def isExportNamespaceSpecifier(): /* is babel-types.babel-types/ts3.6.ExportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamespaceSpecifier")
    @js.native
    def isExportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamespaceSpecifier")
    @js.native
    def isExportNamespaceSpecifier(node: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamespaceSpecifier")
    @js.native
    def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportNamespaceSpecifier")
    @js.native
    def isExportNamespaceSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportNamespaceSpecifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExportSpecifier")
    @js.native
    def isExportSpecifier(): /* is babel-types.babel-types/ts3.6.ExportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportSpecifier")
    @js.native
    def isExportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportSpecifier")
    @js.native
    def isExportSpecifier(node: js.Object): /* is babel-types.babel-types/ts3.6.ExportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportSpecifier")
    @js.native
    def isExportSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isExportSpecifier")
    @js.native
    def isExportSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExportSpecifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExpression")
    @js.native
    def isExpression(): /* is babel-types.babel-types/ts3.6.Expression */ Boolean = js.native
    @JSImport("babel-core", "types.isExpression")
    @js.native
    def isExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Expression */ Boolean = js.native
    @JSImport("babel-core", "types.isExpression")
    @js.native
    def isExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.Expression */ Boolean = js.native
    @JSImport("babel-core", "types.isExpression")
    @js.native
    def isExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Expression */ Boolean = js.native
    @JSImport("babel-core", "types.isExpression")
    @js.native
    def isExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Expression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExpressionStatement")
    @js.native
    def isExpressionStatement(): /* is babel-types.babel-types/ts3.6.ExpressionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionStatement")
    @js.native
    def isExpressionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionStatement")
    @js.native
    def isExpressionStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionStatement")
    @js.native
    def isExpressionStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionStatement")
    @js.native
    def isExpressionStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isExpressionWrapper")
    @js.native
    def isExpressionWrapper(): /* is babel-types.babel-types/ts3.6.ExpressionWrapper */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionWrapper")
    @js.native
    def isExpressionWrapper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionWrapper */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionWrapper")
    @js.native
    def isExpressionWrapper(node: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionWrapper */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionWrapper")
    @js.native
    def isExpressionWrapper(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionWrapper */ Boolean = js.native
    @JSImport("babel-core", "types.isExpressionWrapper")
    @js.native
    def isExpressionWrapper(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ExpressionWrapper */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFile")
    @js.native
    def isFile(): /* is babel-types.babel-types/ts3.6.File */ Boolean = js.native
    @JSImport("babel-core", "types.isFile")
    @js.native
    def isFile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.File */ Boolean = js.native
    @JSImport("babel-core", "types.isFile")
    @js.native
    def isFile(node: js.Object): /* is babel-types.babel-types/ts3.6.File */ Boolean = js.native
    @JSImport("babel-core", "types.isFile")
    @js.native
    def isFile(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.File */ Boolean = js.native
    @JSImport("babel-core", "types.isFile")
    @js.native
    def isFile(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.File */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFlow")
    @js.native
    def isFlow(): /* is babel-types.babel-types/ts3.6.Flow */ Boolean = js.native
    @JSImport("babel-core", "types.isFlow")
    @js.native
    def isFlow(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Flow */ Boolean = js.native
    @JSImport("babel-core", "types.isFlow")
    @js.native
    def isFlow(node: js.Object): /* is babel-types.babel-types/ts3.6.Flow */ Boolean = js.native
    @JSImport("babel-core", "types.isFlow")
    @js.native
    def isFlow(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Flow */ Boolean = js.native
    @JSImport("babel-core", "types.isFlow")
    @js.native
    def isFlow(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Flow */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFlowBaseAnnotation")
    @js.native
    def isFlowBaseAnnotation(): /* is babel-types.babel-types/ts3.6.FlowBaseAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowBaseAnnotation")
    @js.native
    def isFlowBaseAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.FlowBaseAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowBaseAnnotation")
    @js.native
    def isFlowBaseAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.FlowBaseAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowBaseAnnotation")
    @js.native
    def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.FlowBaseAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowBaseAnnotation")
    @js.native
    def isFlowBaseAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.FlowBaseAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFlowDeclaration")
    @js.native
    def isFlowDeclaration(): /* is babel-types.babel-types/ts3.6.FlowDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowDeclaration")
    @js.native
    def isFlowDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.FlowDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowDeclaration")
    @js.native
    def isFlowDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.FlowDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowDeclaration")
    @js.native
    def isFlowDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.FlowDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFlowDeclaration")
    @js.native
    def isFlowDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.FlowDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFor")
    @js.native
    def isFor(): /* is babel-types.babel-types/ts3.6.For */ Boolean = js.native
    @JSImport("babel-core", "types.isFor")
    @js.native
    def isFor(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.For */ Boolean = js.native
    @JSImport("babel-core", "types.isFor")
    @js.native
    def isFor(node: js.Object): /* is babel-types.babel-types/ts3.6.For */ Boolean = js.native
    @JSImport("babel-core", "types.isFor")
    @js.native
    def isFor(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.For */ Boolean = js.native
    @JSImport("babel-core", "types.isFor")
    @js.native
    def isFor(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.For */ Boolean = js.native
    
    @JSImport("babel-core", "types.isForInStatement")
    @js.native
    def isForInStatement(): /* is babel-types.babel-types/ts3.6.ForInStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForInStatement")
    @js.native
    def isForInStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ForInStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForInStatement")
    @js.native
    def isForInStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ForInStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForInStatement")
    @js.native
    def isForInStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForInStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForInStatement")
    @js.native
    def isForInStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForInStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isForOfStatement")
    @js.native
    def isForOfStatement(): /* is babel-types.babel-types/ts3.6.ForOfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForOfStatement")
    @js.native
    def isForOfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ForOfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForOfStatement")
    @js.native
    def isForOfStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ForOfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForOfStatement")
    @js.native
    def isForOfStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForOfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForOfStatement")
    @js.native
    def isForOfStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForOfStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isForStatement")
    @js.native
    def isForStatement(): /* is babel-types.babel-types/ts3.6.ForStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForStatement")
    @js.native
    def isForStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ForStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForStatement")
    @js.native
    def isForStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ForStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForStatement")
    @js.native
    def isForStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForStatement")
    @js.native
    def isForStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isForXStatement")
    @js.native
    def isForXStatement(): /* is babel-types.babel-types/ts3.6.ForXStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForXStatement")
    @js.native
    def isForXStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ForXStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForXStatement")
    @js.native
    def isForXStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ForXStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForXStatement")
    @js.native
    def isForXStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForXStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isForXStatement")
    @js.native
    def isForXStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ForXStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFunction")
    @js.native
    def isFunction(): /* is babel-types.babel-types/ts3.6.Function */ Boolean = js.native
    @JSImport("babel-core", "types.isFunction")
    @js.native
    def isFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Function */ Boolean = js.native
    @JSImport("babel-core", "types.isFunction")
    @js.native
    def isFunction(node: js.Object): /* is babel-types.babel-types/ts3.6.Function */ Boolean = js.native
    @JSImport("babel-core", "types.isFunction")
    @js.native
    def isFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Function */ Boolean = js.native
    @JSImport("babel-core", "types.isFunction")
    @js.native
    def isFunction(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Function */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFunctionDeclaration")
    @js.native
    def isFunctionDeclaration(): /* is babel-types.babel-types/ts3.6.FunctionDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionDeclaration")
    @js.native
    def isFunctionDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionDeclaration")
    @js.native
    def isFunctionDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.FunctionDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionDeclaration")
    @js.native
    def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionDeclaration")
    @js.native
    def isFunctionDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFunctionExpression")
    @js.native
    def isFunctionExpression(): /* is babel-types.babel-types/ts3.6.FunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionExpression")
    @js.native
    def isFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionExpression")
    @js.native
    def isFunctionExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.FunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionExpression")
    @js.native
    def isFunctionExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionExpression")
    @js.native
    def isFunctionExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFunctionParent")
    @js.native
    def isFunctionParent(): /* is babel-types.babel-types/ts3.6.FunctionParent */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionParent")
    @js.native
    def isFunctionParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionParent */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionParent")
    @js.native
    def isFunctionParent(node: js.Object): /* is babel-types.babel-types/ts3.6.FunctionParent */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionParent")
    @js.native
    def isFunctionParent(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionParent */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionParent")
    @js.native
    def isFunctionParent(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionParent */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFunctionTypeAnnotation")
    @js.native
    def isFunctionTypeAnnotation(): /* is babel-types.babel-types/ts3.6.FunctionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeAnnotation")
    @js.native
    def isFunctionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeAnnotation")
    @js.native
    def isFunctionTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeAnnotation")
    @js.native
    def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeAnnotation")
    @js.native
    def isFunctionTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isFunctionTypeParam")
    @js.native
    def isFunctionTypeParam(): /* is babel-types.babel-types/ts3.6.FunctionTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeParam")
    @js.native
    def isFunctionTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeParam")
    @js.native
    def isFunctionTypeParam(node: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeParam")
    @js.native
    def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeParam */ Boolean = js.native
    @JSImport("babel-core", "types.isFunctionTypeParam")
    @js.native
    def isFunctionTypeParam(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.FunctionTypeParam */ Boolean = js.native
    
    @JSImport("babel-core", "types.isGenerated")
    @js.native
    def isGenerated(): Boolean = js.native
    @JSImport("babel-core", "types.isGenerated")
    @js.native
    def isGenerated(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isGenerated")
    @js.native
    def isGenerated(node: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isGenerated")
    @js.native
    def isGenerated(node: js.Object, opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isGenerated")
    @js.native
    def isGenerated(node: Null, opts: js.Object): Boolean = js.native
    
    @JSImport("babel-core", "types.isGenericTypeAnnotation")
    @js.native
    def isGenericTypeAnnotation(): /* is babel-types.babel-types/ts3.6.GenericTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isGenericTypeAnnotation")
    @js.native
    def isGenericTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.GenericTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isGenericTypeAnnotation")
    @js.native
    def isGenericTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.GenericTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isGenericTypeAnnotation")
    @js.native
    def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.GenericTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isGenericTypeAnnotation")
    @js.native
    def isGenericTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.GenericTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isIdentifier")
    @js.native
    def isIdentifier(): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isIdentifier")
    @js.native
    def isIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isIdentifier")
    @js.native
    def isIdentifier(node: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isIdentifier")
    @js.native
    def isIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    @JSImport("babel-core", "types.isIdentifier")
    @js.native
    def isIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Identifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isIfStatement")
    @js.native
    def isIfStatement(): /* is babel-types.babel-types/ts3.6.IfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isIfStatement")
    @js.native
    def isIfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.IfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isIfStatement")
    @js.native
    def isIfStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.IfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isIfStatement")
    @js.native
    def isIfStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.IfStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isIfStatement")
    @js.native
    def isIfStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.IfStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isImmutable")
    @js.native
    def isImmutable(): /* is babel-types.babel-types/ts3.6.Immutable */ Boolean = js.native
    @JSImport("babel-core", "types.isImmutable")
    @js.native
    def isImmutable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Immutable */ Boolean = js.native
    @JSImport("babel-core", "types.isImmutable")
    @js.native
    def isImmutable(node: js.Object): /* is babel-types.babel-types/ts3.6.Immutable */ Boolean = js.native
    @JSImport("babel-core", "types.isImmutable")
    @js.native
    def isImmutable(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Immutable */ Boolean = js.native
    @JSImport("babel-core", "types.isImmutable")
    @js.native
    def isImmutable(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Immutable */ Boolean = js.native
    
    @JSImport("babel-core", "types.isImportDeclaration")
    @js.native
    def isImportDeclaration(): /* is babel-types.babel-types/ts3.6.ImportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDeclaration")
    @js.native
    def isImportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDeclaration")
    @js.native
    def isImportDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.ImportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDeclaration")
    @js.native
    def isImportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDeclaration")
    @js.native
    def isImportDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isImportDefaultSpecifier")
    @js.native
    def isImportDefaultSpecifier(): /* is babel-types.babel-types/ts3.6.ImportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDefaultSpecifier")
    @js.native
    def isImportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDefaultSpecifier")
    @js.native
    def isImportDefaultSpecifier(node: js.Object): /* is babel-types.babel-types/ts3.6.ImportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDefaultSpecifier")
    @js.native
    def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportDefaultSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportDefaultSpecifier")
    @js.native
    def isImportDefaultSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportDefaultSpecifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isImportNamespaceSpecifier")
    @js.native
    def isImportNamespaceSpecifier(): /* is babel-types.babel-types/ts3.6.ImportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportNamespaceSpecifier")
    @js.native
    def isImportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportNamespaceSpecifier")
    @js.native
    def isImportNamespaceSpecifier(node: js.Object): /* is babel-types.babel-types/ts3.6.ImportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportNamespaceSpecifier")
    @js.native
    def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportNamespaceSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportNamespaceSpecifier")
    @js.native
    def isImportNamespaceSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportNamespaceSpecifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isImportSpecifier")
    @js.native
    def isImportSpecifier(): /* is babel-types.babel-types/ts3.6.ImportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportSpecifier")
    @js.native
    def isImportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportSpecifier")
    @js.native
    def isImportSpecifier(node: js.Object): /* is babel-types.babel-types/ts3.6.ImportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportSpecifier")
    @js.native
    def isImportSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isImportSpecifier")
    @js.native
    def isImportSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ImportSpecifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isInterfaceDeclaration")
    @js.native
    def isInterfaceDeclaration(): /* is babel-types.babel-types/ts3.6.InterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceDeclaration")
    @js.native
    def isInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceDeclaration")
    @js.native
    def isInterfaceDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceDeclaration")
    @js.native
    def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceDeclaration")
    @js.native
    def isInterfaceDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isInterfaceExtends")
    @js.native
    def isInterfaceExtends(): /* is babel-types.babel-types/ts3.6.InterfaceExtends */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceExtends")
    @js.native
    def isInterfaceExtends(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceExtends */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceExtends")
    @js.native
    def isInterfaceExtends(node: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceExtends */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceExtends")
    @js.native
    def isInterfaceExtends(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceExtends */ Boolean = js.native
    @JSImport("babel-core", "types.isInterfaceExtends")
    @js.native
    def isInterfaceExtends(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.InterfaceExtends */ Boolean = js.native
    
    @JSImport("babel-core", "types.isIntersectionTypeAnnotation")
    @js.native
    def isIntersectionTypeAnnotation(): /* is babel-types.babel-types/ts3.6.IntersectionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isIntersectionTypeAnnotation")
    @js.native
    def isIntersectionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.IntersectionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isIntersectionTypeAnnotation")
    @js.native
    def isIntersectionTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.IntersectionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isIntersectionTypeAnnotation")
    @js.native
    def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.IntersectionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isIntersectionTypeAnnotation")
    @js.native
    def isIntersectionTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.IntersectionTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSX")
    @js.native
    def isJSX(): /* is babel-types.babel-types/ts3.6.JSX */ Boolean = js.native
    @JSImport("babel-core", "types.isJSX")
    @js.native
    def isJSX(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSX */ Boolean = js.native
    @JSImport("babel-core", "types.isJSX")
    @js.native
    def isJSX(node: js.Object): /* is babel-types.babel-types/ts3.6.JSX */ Boolean = js.native
    @JSImport("babel-core", "types.isJSX")
    @js.native
    def isJSX(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSX */ Boolean = js.native
    @JSImport("babel-core", "types.isJSX")
    @js.native
    def isJSX(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSX */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXAttribute")
    @js.native
    def isJSXAttribute(): /* is babel-types.babel-types/ts3.6.JSXAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXAttribute")
    @js.native
    def isJSXAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXAttribute")
    @js.native
    def isJSXAttribute(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXAttribute")
    @js.native
    def isJSXAttribute(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXAttribute")
    @js.native
    def isJSXAttribute(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXAttribute */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXClosingElement")
    @js.native
    def isJSXClosingElement(): /* is babel-types.babel-types/ts3.6.JSXClosingElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXClosingElement")
    @js.native
    def isJSXClosingElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXClosingElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXClosingElement")
    @js.native
    def isJSXClosingElement(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXClosingElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXClosingElement")
    @js.native
    def isJSXClosingElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXClosingElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXClosingElement")
    @js.native
    def isJSXClosingElement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXClosingElement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXElement")
    @js.native
    def isJSXElement(): /* is babel-types.babel-types/ts3.6.JSXElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXElement")
    @js.native
    def isJSXElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXElement")
    @js.native
    def isJSXElement(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXElement")
    @js.native
    def isJSXElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXElement")
    @js.native
    def isJSXElement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXElement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXEmptyExpression")
    @js.native
    def isJSXEmptyExpression(): /* is babel-types.babel-types/ts3.6.JSXEmptyExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXEmptyExpression")
    @js.native
    def isJSXEmptyExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXEmptyExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXEmptyExpression")
    @js.native
    def isJSXEmptyExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXEmptyExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXEmptyExpression")
    @js.native
    def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXEmptyExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXEmptyExpression")
    @js.native
    def isJSXEmptyExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXEmptyExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXExpressionContainer")
    @js.native
    def isJSXExpressionContainer(): /* is babel-types.babel-types/ts3.6.JSXExpressionContainer */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXExpressionContainer")
    @js.native
    def isJSXExpressionContainer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXExpressionContainer */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXExpressionContainer")
    @js.native
    def isJSXExpressionContainer(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXExpressionContainer */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXExpressionContainer")
    @js.native
    def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXExpressionContainer */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXExpressionContainer")
    @js.native
    def isJSXExpressionContainer(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXExpressionContainer */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXIdentifier")
    @js.native
    def isJSXIdentifier(): /* is babel-types.babel-types/ts3.6.JSXIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXIdentifier")
    @js.native
    def isJSXIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXIdentifier")
    @js.native
    def isJSXIdentifier(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXIdentifier")
    @js.native
    def isJSXIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXIdentifier")
    @js.native
    def isJSXIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXIdentifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXMemberExpression")
    @js.native
    def isJSXMemberExpression(): /* is babel-types.babel-types/ts3.6.JSXMemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXMemberExpression")
    @js.native
    def isJSXMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXMemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXMemberExpression")
    @js.native
    def isJSXMemberExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXMemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXMemberExpression")
    @js.native
    def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXMemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXMemberExpression")
    @js.native
    def isJSXMemberExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXMemberExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXNamespacedName")
    @js.native
    def isJSXNamespacedName(): /* is babel-types.babel-types/ts3.6.JSXNamespacedName */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXNamespacedName")
    @js.native
    def isJSXNamespacedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXNamespacedName */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXNamespacedName")
    @js.native
    def isJSXNamespacedName(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXNamespacedName */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXNamespacedName")
    @js.native
    def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXNamespacedName */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXNamespacedName")
    @js.native
    def isJSXNamespacedName(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXNamespacedName */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXOpeningElement")
    @js.native
    def isJSXOpeningElement(): /* is babel-types.babel-types/ts3.6.JSXOpeningElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXOpeningElement")
    @js.native
    def isJSXOpeningElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXOpeningElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXOpeningElement")
    @js.native
    def isJSXOpeningElement(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXOpeningElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXOpeningElement")
    @js.native
    def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXOpeningElement */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXOpeningElement")
    @js.native
    def isJSXOpeningElement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXOpeningElement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXSpreadAttribute")
    @js.native
    def isJSXSpreadAttribute(): /* is babel-types.babel-types/ts3.6.JSXSpreadAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXSpreadAttribute")
    @js.native
    def isJSXSpreadAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXSpreadAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXSpreadAttribute")
    @js.native
    def isJSXSpreadAttribute(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXSpreadAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXSpreadAttribute")
    @js.native
    def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXSpreadAttribute */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXSpreadAttribute")
    @js.native
    def isJSXSpreadAttribute(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXSpreadAttribute */ Boolean = js.native
    
    @JSImport("babel-core", "types.isJSXText")
    @js.native
    def isJSXText(): /* is babel-types.babel-types/ts3.6.JSXText */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXText")
    @js.native
    def isJSXText(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXText */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXText")
    @js.native
    def isJSXText(node: js.Object): /* is babel-types.babel-types/ts3.6.JSXText */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXText")
    @js.native
    def isJSXText(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXText */ Boolean = js.native
    @JSImport("babel-core", "types.isJSXText")
    @js.native
    def isJSXText(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.JSXText */ Boolean = js.native
    
    @JSImport("babel-core", "types.isLVal")
    @js.native
    def isLVal(): /* is babel-types.babel-types/ts3.6.LVal */ Boolean = js.native
    @JSImport("babel-core", "types.isLVal")
    @js.native
    def isLVal(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.LVal */ Boolean = js.native
    @JSImport("babel-core", "types.isLVal")
    @js.native
    def isLVal(node: js.Object): /* is babel-types.babel-types/ts3.6.LVal */ Boolean = js.native
    @JSImport("babel-core", "types.isLVal")
    @js.native
    def isLVal(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.LVal */ Boolean = js.native
    @JSImport("babel-core", "types.isLVal")
    @js.native
    def isLVal(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.LVal */ Boolean = js.native
    
    @JSImport("babel-core", "types.isLabeledStatement")
    @js.native
    def isLabeledStatement(): /* is babel-types.babel-types/ts3.6.LabeledStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isLabeledStatement")
    @js.native
    def isLabeledStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.LabeledStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isLabeledStatement")
    @js.native
    def isLabeledStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.LabeledStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isLabeledStatement")
    @js.native
    def isLabeledStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.LabeledStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isLabeledStatement")
    @js.native
    def isLabeledStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.LabeledStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isLiteral")
    @js.native
    def isLiteral(): /* is babel-types.babel-types/ts3.6.Literal */ Boolean = js.native
    @JSImport("babel-core", "types.isLiteral")
    @js.native
    def isLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Literal */ Boolean = js.native
    @JSImport("babel-core", "types.isLiteral")
    @js.native
    def isLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.Literal */ Boolean = js.native
    @JSImport("babel-core", "types.isLiteral")
    @js.native
    def isLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Literal */ Boolean = js.native
    @JSImport("babel-core", "types.isLiteral")
    @js.native
    def isLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Literal */ Boolean = js.native
    
    @JSImport("babel-core", "types.isLogicalExpression")
    @js.native
    def isLogicalExpression(): /* is babel-types.babel-types/ts3.6.LogicalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isLogicalExpression")
    @js.native
    def isLogicalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.LogicalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isLogicalExpression")
    @js.native
    def isLogicalExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.LogicalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isLogicalExpression")
    @js.native
    def isLogicalExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.LogicalExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isLogicalExpression")
    @js.native
    def isLogicalExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.LogicalExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isLoop")
    @js.native
    def isLoop(): /* is babel-types.babel-types/ts3.6.Loop */ Boolean = js.native
    @JSImport("babel-core", "types.isLoop")
    @js.native
    def isLoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Loop */ Boolean = js.native
    @JSImport("babel-core", "types.isLoop")
    @js.native
    def isLoop(node: js.Object): /* is babel-types.babel-types/ts3.6.Loop */ Boolean = js.native
    @JSImport("babel-core", "types.isLoop")
    @js.native
    def isLoop(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Loop */ Boolean = js.native
    @JSImport("babel-core", "types.isLoop")
    @js.native
    def isLoop(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Loop */ Boolean = js.native
    
    @JSImport("babel-core", "types.isMemberExpression")
    @js.native
    def isMemberExpression(): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isMemberExpression")
    @js.native
    def isMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isMemberExpression")
    @js.native
    def isMemberExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isMemberExpression")
    @js.native
    def isMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isMemberExpression")
    @js.native
    def isMemberExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isMetaProperty")
    @js.native
    def isMetaProperty(): /* is babel-types.babel-types/ts3.6.MetaProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isMetaProperty")
    @js.native
    def isMetaProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.MetaProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isMetaProperty")
    @js.native
    def isMetaProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.MetaProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isMetaProperty")
    @js.native
    def isMetaProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.MetaProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isMetaProperty")
    @js.native
    def isMetaProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.MetaProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isMethod")
    @js.native
    def isMethod(): /* is babel-types.babel-types/ts3.6.Method */ Boolean = js.native
    @JSImport("babel-core", "types.isMethod")
    @js.native
    def isMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Method */ Boolean = js.native
    @JSImport("babel-core", "types.isMethod")
    @js.native
    def isMethod(node: js.Object): /* is babel-types.babel-types/ts3.6.Method */ Boolean = js.native
    @JSImport("babel-core", "types.isMethod")
    @js.native
    def isMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Method */ Boolean = js.native
    @JSImport("babel-core", "types.isMethod")
    @js.native
    def isMethod(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Method */ Boolean = js.native
    
    @JSImport("babel-core", "types.isMixedTypeAnnotation")
    @js.native
    def isMixedTypeAnnotation(): /* is babel-types.babel-types/ts3.6.MixedTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isMixedTypeAnnotation")
    @js.native
    def isMixedTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.MixedTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isMixedTypeAnnotation")
    @js.native
    def isMixedTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.MixedTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isMixedTypeAnnotation")
    @js.native
    def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.MixedTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isMixedTypeAnnotation")
    @js.native
    def isMixedTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.MixedTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isModuleDeclaration")
    @js.native
    def isModuleDeclaration(): /* is babel-types.babel-types/ts3.6.ModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleDeclaration")
    @js.native
    def isModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleDeclaration")
    @js.native
    def isModuleDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.ModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleDeclaration")
    @js.native
    def isModuleDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleDeclaration")
    @js.native
    def isModuleDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ModuleDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isModuleSpecifier")
    @js.native
    def isModuleSpecifier(): /* is babel-types.babel-types/ts3.6.ModuleSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleSpecifier")
    @js.native
    def isModuleSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ModuleSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleSpecifier")
    @js.native
    def isModuleSpecifier(node: js.Object): /* is babel-types.babel-types/ts3.6.ModuleSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleSpecifier")
    @js.native
    def isModuleSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ModuleSpecifier */ Boolean = js.native
    @JSImport("babel-core", "types.isModuleSpecifier")
    @js.native
    def isModuleSpecifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ModuleSpecifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNewExpression")
    @js.native
    def isNewExpression(): /* is babel-types.babel-types/ts3.6.NewExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isNewExpression")
    @js.native
    def isNewExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NewExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isNewExpression")
    @js.native
    def isNewExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.NewExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isNewExpression")
    @js.native
    def isNewExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NewExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isNewExpression")
    @js.native
    def isNewExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NewExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNoop")
    @js.native
    def isNoop(): /* is babel-types.babel-types/ts3.6.Noop */ Boolean = js.native
    @JSImport("babel-core", "types.isNoop")
    @js.native
    def isNoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Noop */ Boolean = js.native
    @JSImport("babel-core", "types.isNoop")
    @js.native
    def isNoop(node: js.Object): /* is babel-types.babel-types/ts3.6.Noop */ Boolean = js.native
    @JSImport("babel-core", "types.isNoop")
    @js.native
    def isNoop(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Noop */ Boolean = js.native
    @JSImport("babel-core", "types.isNoop")
    @js.native
    def isNoop(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Noop */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNullLiteral")
    @js.native
    def isNullLiteral(): /* is babel-types.babel-types/ts3.6.NullLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteral")
    @js.native
    def isNullLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteral")
    @js.native
    def isNullLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteral")
    @js.native
    def isNullLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteral")
    @js.native
    def isNullLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNullLiteralTypeAnnotation")
    @js.native
    def isNullLiteralTypeAnnotation(): /* is babel-types.babel-types/ts3.6.NullLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteralTypeAnnotation")
    @js.native
    def isNullLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteralTypeAnnotation")
    @js.native
    def isNullLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteralTypeAnnotation")
    @js.native
    def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullLiteralTypeAnnotation")
    @js.native
    def isNullLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NullLiteralTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNullableTypeAnnotation")
    @js.native
    def isNullableTypeAnnotation(): /* is babel-types.babel-types/ts3.6.NullableTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullableTypeAnnotation")
    @js.native
    def isNullableTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NullableTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullableTypeAnnotation")
    @js.native
    def isNullableTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.NullableTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullableTypeAnnotation")
    @js.native
    def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NullableTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNullableTypeAnnotation")
    @js.native
    def isNullableTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NullableTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNumberLiteral")
    @js.native
    def isNumberLiteral(): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberLiteral")
    @js.native
    def isNumberLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberLiteral")
    @js.native
    def isNumberLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberLiteral")
    @js.native
    def isNumberLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberLiteral")
    @js.native
    def isNumberLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNumberTypeAnnotation")
    @js.native
    def isNumberTypeAnnotation(): /* is babel-types.babel-types/ts3.6.NumberTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberTypeAnnotation")
    @js.native
    def isNumberTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NumberTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberTypeAnnotation")
    @js.native
    def isNumberTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.NumberTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberTypeAnnotation")
    @js.native
    def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumberTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumberTypeAnnotation")
    @js.native
    def isNumberTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumberTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNumericLiteral")
    @js.native
    def isNumericLiteral(): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteral")
    @js.native
    def isNumericLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteral")
    @js.native
    def isNumericLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteral")
    @js.native
    def isNumericLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteral")
    @js.native
    def isNumericLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isNumericLiteralTypeAnnotation")
    @js.native
    def isNumericLiteralTypeAnnotation(): /* is babel-types.babel-types/ts3.6.NumericLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteralTypeAnnotation")
    @js.native
    def isNumericLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteralTypeAnnotation")
    @js.native
    def isNumericLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteralTypeAnnotation")
    @js.native
    def isNumericLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isNumericLiteralTypeAnnotation")
    @js.native
    def isNumericLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.NumericLiteralTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectExpression")
    @js.native
    def isObjectExpression(): /* is babel-types.babel-types/ts3.6.ObjectExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectExpression")
    @js.native
    def isObjectExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectExpression")
    @js.native
    def isObjectExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectExpression")
    @js.native
    def isObjectExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectExpression")
    @js.native
    def isObjectExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectMember")
    @js.native
    def isObjectMember(): /* is babel-types.babel-types/ts3.6.ObjectMember */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMember")
    @js.native
    def isObjectMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMember */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMember")
    @js.native
    def isObjectMember(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMember */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMember")
    @js.native
    def isObjectMember(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMember */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMember")
    @js.native
    def isObjectMember(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMember */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectMethod")
    @js.native
    def isObjectMethod(): /* is babel-types.babel-types/ts3.6.ObjectMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMethod")
    @js.native
    def isObjectMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMethod")
    @js.native
    def isObjectMethod(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMethod")
    @js.native
    def isObjectMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectMethod")
    @js.native
    def isObjectMethod(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectMethod */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectPattern")
    @js.native
    def isObjectPattern(): /* is babel-types.babel-types/ts3.6.ObjectPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectPattern")
    @js.native
    def isObjectPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectPattern")
    @js.native
    def isObjectPattern(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectPattern")
    @js.native
    def isObjectPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectPattern */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectPattern")
    @js.native
    def isObjectPattern(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectPattern */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectProperty")
    @js.native
    def isObjectProperty(): /* is babel-types.babel-types/ts3.6.ObjectProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectProperty")
    @js.native
    def isObjectProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectProperty")
    @js.native
    def isObjectProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectProperty")
    @js.native
    def isObjectProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectProperty")
    @js.native
    def isObjectProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectTypeAnnotation")
    @js.native
    def isObjectTypeAnnotation(): /* is babel-types.babel-types/ts3.6.ObjectTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeAnnotation")
    @js.native
    def isObjectTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeAnnotation")
    @js.native
    def isObjectTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeAnnotation")
    @js.native
    def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeAnnotation")
    @js.native
    def isObjectTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectTypeCallProperty")
    @js.native
    def isObjectTypeCallProperty(): /* is babel-types.babel-types/ts3.6.ObjectTypeCallProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeCallProperty")
    @js.native
    def isObjectTypeCallProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeCallProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeCallProperty")
    @js.native
    def isObjectTypeCallProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeCallProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeCallProperty")
    @js.native
    def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeCallProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeCallProperty")
    @js.native
    def isObjectTypeCallProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeCallProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectTypeIndexer")
    @js.native
    def isObjectTypeIndexer(): /* is babel-types.babel-types/ts3.6.ObjectTypeIndexer */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeIndexer")
    @js.native
    def isObjectTypeIndexer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeIndexer */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeIndexer")
    @js.native
    def isObjectTypeIndexer(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeIndexer */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeIndexer")
    @js.native
    def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeIndexer */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeIndexer")
    @js.native
    def isObjectTypeIndexer(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeIndexer */ Boolean = js.native
    
    @JSImport("babel-core", "types.isObjectTypeProperty")
    @js.native
    def isObjectTypeProperty(): /* is babel-types.babel-types/ts3.6.ObjectTypeProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeProperty")
    @js.native
    def isObjectTypeProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeProperty")
    @js.native
    def isObjectTypeProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeProperty")
    @js.native
    def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isObjectTypeProperty")
    @js.native
    def isObjectTypeProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ObjectTypeProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isParenthesizedExpression")
    @js.native
    def isParenthesizedExpression(): /* is babel-types.babel-types/ts3.6.ParenthesizedExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isParenthesizedExpression")
    @js.native
    def isParenthesizedExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ParenthesizedExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isParenthesizedExpression")
    @js.native
    def isParenthesizedExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.ParenthesizedExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isParenthesizedExpression")
    @js.native
    def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ParenthesizedExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isParenthesizedExpression")
    @js.native
    def isParenthesizedExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ParenthesizedExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isPattern")
    @js.native
    def isPattern(): /* is babel-types.babel-types/ts3.6.Pattern */ Boolean = js.native
    @JSImport("babel-core", "types.isPattern")
    @js.native
    def isPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Pattern */ Boolean = js.native
    @JSImport("babel-core", "types.isPattern")
    @js.native
    def isPattern(node: js.Object): /* is babel-types.babel-types/ts3.6.Pattern */ Boolean = js.native
    @JSImport("babel-core", "types.isPattern")
    @js.native
    def isPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Pattern */ Boolean = js.native
    @JSImport("babel-core", "types.isPattern")
    @js.native
    def isPattern(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Pattern */ Boolean = js.native
    
    @JSImport("babel-core", "types.isProgram")
    @js.native
    def isProgram(): /* is babel-types.babel-types/ts3.6.Program */ Boolean = js.native
    @JSImport("babel-core", "types.isProgram")
    @js.native
    def isProgram(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Program */ Boolean = js.native
    @JSImport("babel-core", "types.isProgram")
    @js.native
    def isProgram(node: js.Object): /* is babel-types.babel-types/ts3.6.Program */ Boolean = js.native
    @JSImport("babel-core", "types.isProgram")
    @js.native
    def isProgram(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Program */ Boolean = js.native
    @JSImport("babel-core", "types.isProgram")
    @js.native
    def isProgram(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Program */ Boolean = js.native
    
    @JSImport("babel-core", "types.isProperty")
    @js.native
    def isProperty(): /* is babel-types.babel-types/ts3.6.Property */ Boolean = js.native
    @JSImport("babel-core", "types.isProperty")
    @js.native
    def isProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Property */ Boolean = js.native
    @JSImport("babel-core", "types.isProperty")
    @js.native
    def isProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.Property */ Boolean = js.native
    @JSImport("babel-core", "types.isProperty")
    @js.native
    def isProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Property */ Boolean = js.native
    @JSImport("babel-core", "types.isProperty")
    @js.native
    def isProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Property */ Boolean = js.native
    
    @JSImport("babel-core", "types.isPure")
    @js.native
    def isPure(): Boolean = js.native
    @JSImport("babel-core", "types.isPure")
    @js.native
    def isPure(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isPure")
    @js.native
    def isPure(node: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isPure")
    @js.native
    def isPure(node: js.Object, opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isPure")
    @js.native
    def isPure(node: Null, opts: js.Object): Boolean = js.native
    
    @JSImport("babel-core", "types.isPureish")
    @js.native
    def isPureish(): /* is babel-types.babel-types/ts3.6.Pureish */ Boolean = js.native
    @JSImport("babel-core", "types.isPureish")
    @js.native
    def isPureish(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Pureish */ Boolean = js.native
    @JSImport("babel-core", "types.isPureish")
    @js.native
    def isPureish(node: js.Object): /* is babel-types.babel-types/ts3.6.Pureish */ Boolean = js.native
    @JSImport("babel-core", "types.isPureish")
    @js.native
    def isPureish(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Pureish */ Boolean = js.native
    @JSImport("babel-core", "types.isPureish")
    @js.native
    def isPureish(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Pureish */ Boolean = js.native
    
    @JSImport("babel-core", "types.isQualifiedTypeIdentifier")
    @js.native
    def isQualifiedTypeIdentifier(): /* is babel-types.babel-types/ts3.6.QualifiedTypeIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isQualifiedTypeIdentifier")
    @js.native
    def isQualifiedTypeIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.QualifiedTypeIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isQualifiedTypeIdentifier")
    @js.native
    def isQualifiedTypeIdentifier(node: js.Object): /* is babel-types.babel-types/ts3.6.QualifiedTypeIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isQualifiedTypeIdentifier")
    @js.native
    def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.QualifiedTypeIdentifier */ Boolean = js.native
    @JSImport("babel-core", "types.isQualifiedTypeIdentifier")
    @js.native
    def isQualifiedTypeIdentifier(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.QualifiedTypeIdentifier */ Boolean = js.native
    
    @JSImport("babel-core", "types.isReferenced")
    @js.native
    def isReferenced(): Boolean = js.native
    @JSImport("babel-core", "types.isReferenced")
    @js.native
    def isReferenced(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isReferenced")
    @js.native
    def isReferenced(node: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isReferenced")
    @js.native
    def isReferenced(node: js.Object, opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isReferenced")
    @js.native
    def isReferenced(node: Null, opts: js.Object): Boolean = js.native
    
    @JSImport("babel-core", "types.isReferencedIdentifier")
    @js.native
    def isReferencedIdentifier(): Boolean = js.native
    @JSImport("babel-core", "types.isReferencedIdentifier")
    @js.native
    def isReferencedIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isReferencedIdentifier")
    @js.native
    def isReferencedIdentifier(node: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isReferencedIdentifier")
    @js.native
    def isReferencedIdentifier(node: js.Object, opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isReferencedIdentifier")
    @js.native
    def isReferencedIdentifier(node: Null, opts: js.Object): Boolean = js.native
    
    @JSImport("babel-core", "types.isReferencedMemberExpression")
    @js.native
    def isReferencedMemberExpression(): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isReferencedMemberExpression")
    @js.native
    def isReferencedMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isReferencedMemberExpression")
    @js.native
    def isReferencedMemberExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isReferencedMemberExpression")
    @js.native
    def isReferencedMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isReferencedMemberExpression")
    @js.native
    def isReferencedMemberExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.MemberExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isRegExpLiteral")
    @js.native
    def isRegExpLiteral(): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegExpLiteral")
    @js.native
    def isRegExpLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegExpLiteral")
    @js.native
    def isRegExpLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegExpLiteral")
    @js.native
    def isRegExpLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegExpLiteral")
    @js.native
    def isRegExpLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isRegexLiteral")
    @js.native
    def isRegexLiteral(): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegexLiteral")
    @js.native
    def isRegexLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegexLiteral")
    @js.native
    def isRegexLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegexLiteral")
    @js.native
    def isRegexLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isRegexLiteral")
    @js.native
    def isRegexLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.RegExpLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isRestElement")
    @js.native
    def isRestElement(): /* is babel-types.babel-types/ts3.6.RestElement */ Boolean = js.native
    @JSImport("babel-core", "types.isRestElement")
    @js.native
    def isRestElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.RestElement */ Boolean = js.native
    @JSImport("babel-core", "types.isRestElement")
    @js.native
    def isRestElement(node: js.Object): /* is babel-types.babel-types/ts3.6.RestElement */ Boolean = js.native
    @JSImport("babel-core", "types.isRestElement")
    @js.native
    def isRestElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.RestElement */ Boolean = js.native
    @JSImport("babel-core", "types.isRestElement")
    @js.native
    def isRestElement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.RestElement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isRestProperty")
    @js.native
    def isRestProperty(): /* is babel-types.babel-types/ts3.6.RestProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isRestProperty")
    @js.native
    def isRestProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.RestProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isRestProperty")
    @js.native
    def isRestProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.RestProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isRestProperty")
    @js.native
    def isRestProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.RestProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isRestProperty")
    @js.native
    def isRestProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.RestProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isReturnStatement")
    @js.native
    def isReturnStatement(): /* is babel-types.babel-types/ts3.6.ReturnStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isReturnStatement")
    @js.native
    def isReturnStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ReturnStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isReturnStatement")
    @js.native
    def isReturnStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ReturnStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isReturnStatement")
    @js.native
    def isReturnStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ReturnStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isReturnStatement")
    @js.native
    def isReturnStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ReturnStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isScopable")
    @js.native
    def isScopable(): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScopable")
    @js.native
    def isScopable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScopable")
    @js.native
    def isScopable(node: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScopable")
    @js.native
    def isScopable(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScopable")
    @js.native
    def isScopable(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    
    @JSImport("babel-core", "types.isScope")
    @js.native
    def isScope(): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScope")
    @js.native
    def isScope(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScope")
    @js.native
    def isScope(node: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScope")
    @js.native
    def isScope(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    @JSImport("babel-core", "types.isScope")
    @js.native
    def isScope(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Scopable */ Boolean = js.native
    
    @JSImport("babel-core", "types.isSequenceExpression")
    @js.native
    def isSequenceExpression(): /* is babel-types.babel-types/ts3.6.SequenceExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isSequenceExpression")
    @js.native
    def isSequenceExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.SequenceExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isSequenceExpression")
    @js.native
    def isSequenceExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.SequenceExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isSequenceExpression")
    @js.native
    def isSequenceExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.SequenceExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isSequenceExpression")
    @js.native
    def isSequenceExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.SequenceExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isSpreadElement")
    @js.native
    def isSpreadElement(): /* is babel-types.babel-types/ts3.6.SpreadElement */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadElement")
    @js.native
    def isSpreadElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.SpreadElement */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadElement")
    @js.native
    def isSpreadElement(node: js.Object): /* is babel-types.babel-types/ts3.6.SpreadElement */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadElement")
    @js.native
    def isSpreadElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.SpreadElement */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadElement")
    @js.native
    def isSpreadElement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.SpreadElement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isSpreadProperty")
    @js.native
    def isSpreadProperty(): /* is babel-types.babel-types/ts3.6.SpreadProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadProperty")
    @js.native
    def isSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.SpreadProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadProperty")
    @js.native
    def isSpreadProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.SpreadProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadProperty")
    @js.native
    def isSpreadProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.SpreadProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isSpreadProperty")
    @js.native
    def isSpreadProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.SpreadProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isStatement")
    @js.native
    def isStatement(): /* is babel-types.babel-types/ts3.6.Statement */ Boolean = js.native
    @JSImport("babel-core", "types.isStatement")
    @js.native
    def isStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Statement */ Boolean = js.native
    @JSImport("babel-core", "types.isStatement")
    @js.native
    def isStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.Statement */ Boolean = js.native
    @JSImport("babel-core", "types.isStatement")
    @js.native
    def isStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Statement */ Boolean = js.native
    @JSImport("babel-core", "types.isStatement")
    @js.native
    def isStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Statement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isStringLiteral")
    @js.native
    def isStringLiteral(): /* is babel-types.babel-types/ts3.6.StringLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteral")
    @js.native
    def isStringLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteral")
    @js.native
    def isStringLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteral")
    @js.native
    def isStringLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteral")
    @js.native
    def isStringLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isStringLiteralTypeAnnotation")
    @js.native
    def isStringLiteralTypeAnnotation(): /* is babel-types.babel-types/ts3.6.StringLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteralTypeAnnotation")
    @js.native
    def isStringLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteralTypeAnnotation")
    @js.native
    def isStringLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteralTypeAnnotation")
    @js.native
    def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteralTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringLiteralTypeAnnotation")
    @js.native
    def isStringLiteralTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.StringLiteralTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isStringTypeAnnotation")
    @js.native
    def isStringTypeAnnotation(): /* is babel-types.babel-types/ts3.6.StringTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringTypeAnnotation")
    @js.native
    def isStringTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.StringTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringTypeAnnotation")
    @js.native
    def isStringTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.StringTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringTypeAnnotation")
    @js.native
    def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.StringTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isStringTypeAnnotation")
    @js.native
    def isStringTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.StringTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isSuper")
    @js.native
    def isSuper(): /* is babel-types.babel-types/ts3.6.Super */ Boolean = js.native
    @JSImport("babel-core", "types.isSuper")
    @js.native
    def isSuper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Super */ Boolean = js.native
    @JSImport("babel-core", "types.isSuper")
    @js.native
    def isSuper(node: js.Object): /* is babel-types.babel-types/ts3.6.Super */ Boolean = js.native
    @JSImport("babel-core", "types.isSuper")
    @js.native
    def isSuper(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Super */ Boolean = js.native
    @JSImport("babel-core", "types.isSuper")
    @js.native
    def isSuper(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Super */ Boolean = js.native
    
    @JSImport("babel-core", "types.isSwitchCase")
    @js.native
    def isSwitchCase(): /* is babel-types.babel-types/ts3.6.SwitchCase */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchCase")
    @js.native
    def isSwitchCase(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.SwitchCase */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchCase")
    @js.native
    def isSwitchCase(node: js.Object): /* is babel-types.babel-types/ts3.6.SwitchCase */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchCase")
    @js.native
    def isSwitchCase(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.SwitchCase */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchCase")
    @js.native
    def isSwitchCase(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.SwitchCase */ Boolean = js.native
    
    @JSImport("babel-core", "types.isSwitchStatement")
    @js.native
    def isSwitchStatement(): /* is babel-types.babel-types/ts3.6.SwitchStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchStatement")
    @js.native
    def isSwitchStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.SwitchStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchStatement")
    @js.native
    def isSwitchStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.SwitchStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchStatement")
    @js.native
    def isSwitchStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.SwitchStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isSwitchStatement")
    @js.native
    def isSwitchStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.SwitchStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSAnyKeyword")
    @js.native
    def isTSAnyKeyword(): /* is babel-types.babel-types/ts3.6.TSAnyKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAnyKeyword")
    @js.native
    def isTSAnyKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSAnyKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAnyKeyword")
    @js.native
    def isTSAnyKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSAnyKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAnyKeyword")
    @js.native
    def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSAnyKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAnyKeyword")
    @js.native
    def isTSAnyKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSAnyKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSArrayType")
    @js.native
    def isTSArrayType(): /* is babel-types.babel-types/ts3.6.TSArrayType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSArrayType")
    @js.native
    def isTSArrayType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSArrayType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSArrayType")
    @js.native
    def isTSArrayType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSArrayType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSArrayType")
    @js.native
    def isTSArrayType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSArrayType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSArrayType")
    @js.native
    def isTSArrayType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSArrayType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSAsExpression")
    @js.native
    def isTSAsExpression(): /* is babel-types.babel-types/ts3.6.TSAsExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAsExpression")
    @js.native
    def isTSAsExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSAsExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAsExpression")
    @js.native
    def isTSAsExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.TSAsExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAsExpression")
    @js.native
    def isTSAsExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSAsExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSAsExpression")
    @js.native
    def isTSAsExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSAsExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSBooleanKeyword")
    @js.native
    def isTSBooleanKeyword(): /* is babel-types.babel-types/ts3.6.TSBooleanKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSBooleanKeyword")
    @js.native
    def isTSBooleanKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSBooleanKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSBooleanKeyword")
    @js.native
    def isTSBooleanKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSBooleanKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSBooleanKeyword")
    @js.native
    def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSBooleanKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSBooleanKeyword")
    @js.native
    def isTSBooleanKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSBooleanKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSCallSignatureDeclaration")
    @js.native
    def isTSCallSignatureDeclaration(): /* is babel-types.babel-types/ts3.6.TSCallSignatureDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSCallSignatureDeclaration")
    @js.native
    def isTSCallSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSCallSignatureDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSCallSignatureDeclaration")
    @js.native
    def isTSCallSignatureDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSCallSignatureDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSCallSignatureDeclaration")
    @js.native
    def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSCallSignatureDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSCallSignatureDeclaration")
    @js.native
    def isTSCallSignatureDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSCallSignatureDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSConstructSignatureDeclaration")
    @js.native
    def isTSConstructSignatureDeclaration(): /* is babel-types.babel-types/ts3.6.TSTypeElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructSignatureDeclaration")
    @js.native
    def isTSConstructSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructSignatureDeclaration")
    @js.native
    def isTSConstructSignatureDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructSignatureDeclaration")
    @js.native
    def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructSignatureDeclaration")
    @js.native
    def isTSConstructSignatureDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeElement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSConstructorType")
    @js.native
    def isTSConstructorType(): /* is babel-types.babel-types/ts3.6.TSConstructorType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructorType")
    @js.native
    def isTSConstructorType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSConstructorType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructorType")
    @js.native
    def isTSConstructorType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSConstructorType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructorType")
    @js.native
    def isTSConstructorType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSConstructorType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSConstructorType")
    @js.native
    def isTSConstructorType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSConstructorType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSDeclareFunction")
    @js.native
    def isTSDeclareFunction(): /* is babel-types.babel-types/ts3.6.TSDeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareFunction")
    @js.native
    def isTSDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareFunction")
    @js.native
    def isTSDeclareFunction(node: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareFunction")
    @js.native
    def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareFunction */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareFunction")
    @js.native
    def isTSDeclareFunction(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareFunction */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSDeclareMethod")
    @js.native
    def isTSDeclareMethod(): /* is babel-types.babel-types/ts3.6.TSDeclareMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareMethod")
    @js.native
    def isTSDeclareMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareMethod")
    @js.native
    def isTSDeclareMethod(node: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareMethod")
    @js.native
    def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareMethod */ Boolean = js.native
    @JSImport("babel-core", "types.isTSDeclareMethod")
    @js.native
    def isTSDeclareMethod(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSDeclareMethod */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSEnumDeclaration")
    @js.native
    def isTSEnumDeclaration(): /* is babel-types.babel-types/ts3.6.TSEnumDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumDeclaration")
    @js.native
    def isTSEnumDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumDeclaration")
    @js.native
    def isTSEnumDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumDeclaration")
    @js.native
    def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumDeclaration")
    @js.native
    def isTSEnumDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSEnumMember")
    @js.native
    def isTSEnumMember(): /* is babel-types.babel-types/ts3.6.TSEnumMember */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumMember")
    @js.native
    def isTSEnumMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumMember */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumMember")
    @js.native
    def isTSEnumMember(node: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumMember */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumMember")
    @js.native
    def isTSEnumMember(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumMember */ Boolean = js.native
    @JSImport("babel-core", "types.isTSEnumMember")
    @js.native
    def isTSEnumMember(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSEnumMember */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSExportAssignment")
    @js.native
    def isTSExportAssignment(): /* is babel-types.babel-types/ts3.6.TSExportAssignment */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExportAssignment")
    @js.native
    def isTSExportAssignment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExportAssignment */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExportAssignment")
    @js.native
    def isTSExportAssignment(node: js.Object): /* is babel-types.babel-types/ts3.6.TSExportAssignment */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExportAssignment")
    @js.native
    def isTSExportAssignment(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExportAssignment */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExportAssignment")
    @js.native
    def isTSExportAssignment(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExportAssignment */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSExpressionWithTypeArguments")
    @js.native
    def isTSExpressionWithTypeArguments(): /* is babel-types.babel-types/ts3.6.TSExpressionWithTypeArguments */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExpressionWithTypeArguments")
    @js.native
    def isTSExpressionWithTypeArguments(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExpressionWithTypeArguments */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExpressionWithTypeArguments")
    @js.native
    def isTSExpressionWithTypeArguments(node: js.Object): /* is babel-types.babel-types/ts3.6.TSExpressionWithTypeArguments */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExpressionWithTypeArguments")
    @js.native
    def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExpressionWithTypeArguments */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExpressionWithTypeArguments")
    @js.native
    def isTSExpressionWithTypeArguments(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExpressionWithTypeArguments */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSExternalModuleReference")
    @js.native
    def isTSExternalModuleReference(): /* is babel-types.babel-types/ts3.6.TSExternalModuleReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExternalModuleReference")
    @js.native
    def isTSExternalModuleReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExternalModuleReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExternalModuleReference")
    @js.native
    def isTSExternalModuleReference(node: js.Object): /* is babel-types.babel-types/ts3.6.TSExternalModuleReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExternalModuleReference")
    @js.native
    def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExternalModuleReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSExternalModuleReference")
    @js.native
    def isTSExternalModuleReference(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSExternalModuleReference */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSFunctionType")
    @js.native
    def isTSFunctionType(): /* is babel-types.babel-types/ts3.6.TSFunctionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSFunctionType")
    @js.native
    def isTSFunctionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSFunctionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSFunctionType")
    @js.native
    def isTSFunctionType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSFunctionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSFunctionType")
    @js.native
    def isTSFunctionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSFunctionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSFunctionType")
    @js.native
    def isTSFunctionType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSFunctionType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSImportEqualsDeclaration")
    @js.native
    def isTSImportEqualsDeclaration(): /* is babel-types.babel-types/ts3.6.TSImportEqualsDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSImportEqualsDeclaration")
    @js.native
    def isTSImportEqualsDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSImportEqualsDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSImportEqualsDeclaration")
    @js.native
    def isTSImportEqualsDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSImportEqualsDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSImportEqualsDeclaration")
    @js.native
    def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSImportEqualsDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSImportEqualsDeclaration")
    @js.native
    def isTSImportEqualsDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSImportEqualsDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSIndexSignature")
    @js.native
    def isTSIndexSignature(): /* is babel-types.babel-types/ts3.6.TSIndexSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexSignature")
    @js.native
    def isTSIndexSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexSignature")
    @js.native
    def isTSIndexSignature(node: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexSignature")
    @js.native
    def isTSIndexSignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexSignature")
    @js.native
    def isTSIndexSignature(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexSignature */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSIndexedAccessType")
    @js.native
    def isTSIndexedAccessType(): /* is babel-types.babel-types/ts3.6.TSIndexedAccessType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexedAccessType")
    @js.native
    def isTSIndexedAccessType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexedAccessType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexedAccessType")
    @js.native
    def isTSIndexedAccessType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexedAccessType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexedAccessType")
    @js.native
    def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexedAccessType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIndexedAccessType")
    @js.native
    def isTSIndexedAccessType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIndexedAccessType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSInterfaceBody")
    @js.native
    def isTSInterfaceBody(): /* is babel-types.babel-types/ts3.6.TSInterfaceBody */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceBody")
    @js.native
    def isTSInterfaceBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceBody */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceBody")
    @js.native
    def isTSInterfaceBody(node: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceBody */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceBody")
    @js.native
    def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceBody */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceBody")
    @js.native
    def isTSInterfaceBody(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceBody */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSInterfaceDeclaration")
    @js.native
    def isTSInterfaceDeclaration(): /* is babel-types.babel-types/ts3.6.TSInterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceDeclaration")
    @js.native
    def isTSInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceDeclaration")
    @js.native
    def isTSInterfaceDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceDeclaration")
    @js.native
    def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSInterfaceDeclaration")
    @js.native
    def isTSInterfaceDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSInterfaceDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSIntersectionType")
    @js.native
    def isTSIntersectionType(): /* is babel-types.babel-types/ts3.6.TSIntersectionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIntersectionType")
    @js.native
    def isTSIntersectionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIntersectionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIntersectionType")
    @js.native
    def isTSIntersectionType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSIntersectionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIntersectionType")
    @js.native
    def isTSIntersectionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIntersectionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSIntersectionType")
    @js.native
    def isTSIntersectionType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSIntersectionType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSLiteralType")
    @js.native
    def isTSLiteralType(): /* is babel-types.babel-types/ts3.6.TSLiteralType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSLiteralType")
    @js.native
    def isTSLiteralType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSLiteralType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSLiteralType")
    @js.native
    def isTSLiteralType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSLiteralType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSLiteralType")
    @js.native
    def isTSLiteralType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSLiteralType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSLiteralType")
    @js.native
    def isTSLiteralType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSLiteralType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSMappedType")
    @js.native
    def isTSMappedType(): /* is babel-types.babel-types/ts3.6.TSMappedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMappedType")
    @js.native
    def isTSMappedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSMappedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMappedType")
    @js.native
    def isTSMappedType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSMappedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMappedType")
    @js.native
    def isTSMappedType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSMappedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMappedType")
    @js.native
    def isTSMappedType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSMappedType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSMethodSignature")
    @js.native
    def isTSMethodSignature(): /* is babel-types.babel-types/ts3.6.TSMethodSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMethodSignature")
    @js.native
    def isTSMethodSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSMethodSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMethodSignature")
    @js.native
    def isTSMethodSignature(node: js.Object): /* is babel-types.babel-types/ts3.6.TSMethodSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMethodSignature")
    @js.native
    def isTSMethodSignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSMethodSignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSMethodSignature")
    @js.native
    def isTSMethodSignature(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSMethodSignature */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSModuleBlock")
    @js.native
    def isTSModuleBlock(): /* is babel-types.babel-types/ts3.6.TSModuleBlock */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleBlock")
    @js.native
    def isTSModuleBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleBlock */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleBlock")
    @js.native
    def isTSModuleBlock(node: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleBlock */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleBlock")
    @js.native
    def isTSModuleBlock(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleBlock */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleBlock")
    @js.native
    def isTSModuleBlock(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleBlock */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSModuleDeclaration")
    @js.native
    def isTSModuleDeclaration(): /* is babel-types.babel-types/ts3.6.TSModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleDeclaration")
    @js.native
    def isTSModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleDeclaration")
    @js.native
    def isTSModuleDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleDeclaration")
    @js.native
    def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSModuleDeclaration")
    @js.native
    def isTSModuleDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSModuleDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSNamespaceExportDeclaration")
    @js.native
    def isTSNamespaceExportDeclaration(): /* is babel-types.babel-types/ts3.6.TSNamespaceExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNamespaceExportDeclaration")
    @js.native
    def isTSNamespaceExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNamespaceExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNamespaceExportDeclaration")
    @js.native
    def isTSNamespaceExportDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSNamespaceExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNamespaceExportDeclaration")
    @js.native
    def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNamespaceExportDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNamespaceExportDeclaration")
    @js.native
    def isTSNamespaceExportDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNamespaceExportDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSNeverKeyword")
    @js.native
    def isTSNeverKeyword(): /* is babel-types.babel-types/ts3.6.TSNeverKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNeverKeyword")
    @js.native
    def isTSNeverKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNeverKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNeverKeyword")
    @js.native
    def isTSNeverKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSNeverKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNeverKeyword")
    @js.native
    def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNeverKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNeverKeyword")
    @js.native
    def isTSNeverKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNeverKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSNonNullExpression")
    @js.native
    def isTSNonNullExpression(): /* is babel-types.babel-types/ts3.6.TSNonNullExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNonNullExpression")
    @js.native
    def isTSNonNullExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNonNullExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNonNullExpression")
    @js.native
    def isTSNonNullExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.TSNonNullExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNonNullExpression")
    @js.native
    def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNonNullExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNonNullExpression")
    @js.native
    def isTSNonNullExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNonNullExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSNullKeyword")
    @js.native
    def isTSNullKeyword(): /* is babel-types.babel-types/ts3.6.TSNullKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNullKeyword")
    @js.native
    def isTSNullKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNullKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNullKeyword")
    @js.native
    def isTSNullKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSNullKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNullKeyword")
    @js.native
    def isTSNullKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNullKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNullKeyword")
    @js.native
    def isTSNullKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNullKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSNumberKeyword")
    @js.native
    def isTSNumberKeyword(): /* is babel-types.babel-types/ts3.6.TSNumberKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNumberKeyword")
    @js.native
    def isTSNumberKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNumberKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNumberKeyword")
    @js.native
    def isTSNumberKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSNumberKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNumberKeyword")
    @js.native
    def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNumberKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSNumberKeyword")
    @js.native
    def isTSNumberKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSNumberKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSObjectKeyword")
    @js.native
    def isTSObjectKeyword(): /* is babel-types.babel-types/ts3.6.TSObjectKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSObjectKeyword")
    @js.native
    def isTSObjectKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSObjectKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSObjectKeyword")
    @js.native
    def isTSObjectKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSObjectKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSObjectKeyword")
    @js.native
    def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSObjectKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSObjectKeyword")
    @js.native
    def isTSObjectKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSObjectKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSParameterProperty")
    @js.native
    def isTSParameterProperty(): /* is babel-types.babel-types/ts3.6.TSParameterProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParameterProperty")
    @js.native
    def isTSParameterProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSParameterProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParameterProperty")
    @js.native
    def isTSParameterProperty(node: js.Object): /* is babel-types.babel-types/ts3.6.TSParameterProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParameterProperty")
    @js.native
    def isTSParameterProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSParameterProperty */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParameterProperty")
    @js.native
    def isTSParameterProperty(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSParameterProperty */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSParenthesizedType")
    @js.native
    def isTSParenthesizedType(): /* is babel-types.babel-types/ts3.6.TSParenthesizedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParenthesizedType")
    @js.native
    def isTSParenthesizedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSParenthesizedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParenthesizedType")
    @js.native
    def isTSParenthesizedType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSParenthesizedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParenthesizedType")
    @js.native
    def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSParenthesizedType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSParenthesizedType")
    @js.native
    def isTSParenthesizedType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSParenthesizedType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSPropertySignature")
    @js.native
    def isTSPropertySignature(): /* is babel-types.babel-types/ts3.6.TSPropertySignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSPropertySignature")
    @js.native
    def isTSPropertySignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSPropertySignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSPropertySignature")
    @js.native
    def isTSPropertySignature(node: js.Object): /* is babel-types.babel-types/ts3.6.TSPropertySignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSPropertySignature")
    @js.native
    def isTSPropertySignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSPropertySignature */ Boolean = js.native
    @JSImport("babel-core", "types.isTSPropertySignature")
    @js.native
    def isTSPropertySignature(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSPropertySignature */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSQualifiedName")
    @js.native
    def isTSQualifiedName(): /* is babel-types.babel-types/ts3.6.TSQualifiedName */ Boolean = js.native
    @JSImport("babel-core", "types.isTSQualifiedName")
    @js.native
    def isTSQualifiedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSQualifiedName */ Boolean = js.native
    @JSImport("babel-core", "types.isTSQualifiedName")
    @js.native
    def isTSQualifiedName(node: js.Object): /* is babel-types.babel-types/ts3.6.TSQualifiedName */ Boolean = js.native
    @JSImport("babel-core", "types.isTSQualifiedName")
    @js.native
    def isTSQualifiedName(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSQualifiedName */ Boolean = js.native
    @JSImport("babel-core", "types.isTSQualifiedName")
    @js.native
    def isTSQualifiedName(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSQualifiedName */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSStringKeyword")
    @js.native
    def isTSStringKeyword(): /* is babel-types.babel-types/ts3.6.TSStringKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSStringKeyword")
    @js.native
    def isTSStringKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSStringKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSStringKeyword")
    @js.native
    def isTSStringKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSStringKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSStringKeyword")
    @js.native
    def isTSStringKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSStringKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSStringKeyword")
    @js.native
    def isTSStringKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSStringKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSSymbolKeyword")
    @js.native
    def isTSSymbolKeyword(): /* is babel-types.babel-types/ts3.6.TSSymbolKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSSymbolKeyword")
    @js.native
    def isTSSymbolKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSSymbolKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSSymbolKeyword")
    @js.native
    def isTSSymbolKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSSymbolKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSSymbolKeyword")
    @js.native
    def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSSymbolKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSSymbolKeyword")
    @js.native
    def isTSSymbolKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSSymbolKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSThisType")
    @js.native
    def isTSThisType(): /* is babel-types.babel-types/ts3.6.TSThisType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSThisType")
    @js.native
    def isTSThisType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSThisType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSThisType")
    @js.native
    def isTSThisType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSThisType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSThisType")
    @js.native
    def isTSThisType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSThisType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSThisType")
    @js.native
    def isTSThisType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSThisType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTupleType")
    @js.native
    def isTSTupleType(): /* is babel-types.babel-types/ts3.6.TSTupleType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTupleType")
    @js.native
    def isTSTupleType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTupleType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTupleType")
    @js.native
    def isTSTupleType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTupleType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTupleType")
    @js.native
    def isTSTupleType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTupleType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTupleType")
    @js.native
    def isTSTupleType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTupleType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeAliasDeclaration")
    @js.native
    def isTSTypeAliasDeclaration(): /* is babel-types.babel-types/ts3.6.TSTypeAliasDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAliasDeclaration")
    @js.native
    def isTSTypeAliasDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAliasDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAliasDeclaration")
    @js.native
    def isTSTypeAliasDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAliasDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAliasDeclaration")
    @js.native
    def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAliasDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAliasDeclaration")
    @js.native
    def isTSTypeAliasDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAliasDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeAnnotation")
    @js.native
    def isTSTypeAnnotation(): /* is babel-types.babel-types/ts3.6.TSTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAnnotation")
    @js.native
    def isTSTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAnnotation")
    @js.native
    def isTSTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAnnotation")
    @js.native
    def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAnnotation")
    @js.native
    def isTSTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeAssertion")
    @js.native
    def isTSTypeAssertion(): /* is babel-types.babel-types/ts3.6.TSTypeAssertion */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAssertion")
    @js.native
    def isTSTypeAssertion(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAssertion */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAssertion")
    @js.native
    def isTSTypeAssertion(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAssertion */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAssertion")
    @js.native
    def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAssertion */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeAssertion")
    @js.native
    def isTSTypeAssertion(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeAssertion */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeLiteral")
    @js.native
    def isTSTypeLiteral(): /* is babel-types.babel-types/ts3.6.TSTypeLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeLiteral")
    @js.native
    def isTSTypeLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeLiteral")
    @js.native
    def isTSTypeLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeLiteral")
    @js.native
    def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeLiteral")
    @js.native
    def isTSTypeLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeOperator")
    @js.native
    def isTSTypeOperator(): /* is babel-types.babel-types/ts3.6.TSTypeOperator */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeOperator")
    @js.native
    def isTSTypeOperator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeOperator */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeOperator")
    @js.native
    def isTSTypeOperator(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeOperator */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeOperator")
    @js.native
    def isTSTypeOperator(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeOperator */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeOperator")
    @js.native
    def isTSTypeOperator(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeOperator */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeParameter")
    @js.native
    def isTSTypeParameter(): /* is babel-types.babel-types/ts3.6.TSTypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameter")
    @js.native
    def isTSTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameter")
    @js.native
    def isTSTypeParameter(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameter")
    @js.native
    def isTSTypeParameter(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameter")
    @js.native
    def isTSTypeParameter(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameter */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeParameterDeclaration")
    @js.native
    def isTSTypeParameterDeclaration(): /* is babel-types.babel-types/ts3.6.TSTypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterDeclaration")
    @js.native
    def isTSTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterDeclaration")
    @js.native
    def isTSTypeParameterDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterDeclaration")
    @js.native
    def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterDeclaration")
    @js.native
    def isTSTypeParameterDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeParameterInstantiation")
    @js.native
    def isTSTypeParameterInstantiation(): /* is babel-types.babel-types/ts3.6.TSTypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterInstantiation")
    @js.native
    def isTSTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterInstantiation")
    @js.native
    def isTSTypeParameterInstantiation(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterInstantiation")
    @js.native
    def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeParameterInstantiation")
    @js.native
    def isTSTypeParameterInstantiation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeParameterInstantiation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypePredicate")
    @js.native
    def isTSTypePredicate(): /* is babel-types.babel-types/ts3.6.TSTypePredicate */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypePredicate")
    @js.native
    def isTSTypePredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypePredicate */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypePredicate")
    @js.native
    def isTSTypePredicate(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypePredicate */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypePredicate")
    @js.native
    def isTSTypePredicate(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypePredicate */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypePredicate")
    @js.native
    def isTSTypePredicate(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypePredicate */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeQuery")
    @js.native
    def isTSTypeQuery(): /* is babel-types.babel-types/ts3.6.TSTypeQuery */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeQuery")
    @js.native
    def isTSTypeQuery(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeQuery */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeQuery")
    @js.native
    def isTSTypeQuery(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeQuery */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeQuery")
    @js.native
    def isTSTypeQuery(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeQuery */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeQuery")
    @js.native
    def isTSTypeQuery(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeQuery */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSTypeReference")
    @js.native
    def isTSTypeReference(): /* is babel-types.babel-types/ts3.6.TSTypeReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeReference")
    @js.native
    def isTSTypeReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeReference")
    @js.native
    def isTSTypeReference(node: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeReference")
    @js.native
    def isTSTypeReference(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeReference */ Boolean = js.native
    @JSImport("babel-core", "types.isTSTypeReference")
    @js.native
    def isTSTypeReference(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSTypeReference */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSUndefinedKeyword")
    @js.native
    def isTSUndefinedKeyword(): /* is babel-types.babel-types/ts3.6.TSUndefinedKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUndefinedKeyword")
    @js.native
    def isTSUndefinedKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSUndefinedKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUndefinedKeyword")
    @js.native
    def isTSUndefinedKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSUndefinedKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUndefinedKeyword")
    @js.native
    def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSUndefinedKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUndefinedKeyword")
    @js.native
    def isTSUndefinedKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSUndefinedKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSUnionType")
    @js.native
    def isTSUnionType(): /* is babel-types.babel-types/ts3.6.TSUnionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUnionType")
    @js.native
    def isTSUnionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSUnionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUnionType")
    @js.native
    def isTSUnionType(node: js.Object): /* is babel-types.babel-types/ts3.6.TSUnionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUnionType")
    @js.native
    def isTSUnionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSUnionType */ Boolean = js.native
    @JSImport("babel-core", "types.isTSUnionType")
    @js.native
    def isTSUnionType(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSUnionType */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTSVoidKeyword")
    @js.native
    def isTSVoidKeyword(): /* is babel-types.babel-types/ts3.6.TSVoidKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSVoidKeyword")
    @js.native
    def isTSVoidKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TSVoidKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSVoidKeyword")
    @js.native
    def isTSVoidKeyword(node: js.Object): /* is babel-types.babel-types/ts3.6.TSVoidKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSVoidKeyword")
    @js.native
    def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSVoidKeyword */ Boolean = js.native
    @JSImport("babel-core", "types.isTSVoidKeyword")
    @js.native
    def isTSVoidKeyword(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TSVoidKeyword */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTaggedTemplateExpression")
    @js.native
    def isTaggedTemplateExpression(): /* is babel-types.babel-types/ts3.6.TaggedTemplateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTaggedTemplateExpression")
    @js.native
    def isTaggedTemplateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TaggedTemplateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTaggedTemplateExpression")
    @js.native
    def isTaggedTemplateExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.TaggedTemplateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTaggedTemplateExpression")
    @js.native
    def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TaggedTemplateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTaggedTemplateExpression")
    @js.native
    def isTaggedTemplateExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TaggedTemplateExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTemplateElement")
    @js.native
    def isTemplateElement(): /* is babel-types.babel-types/ts3.6.TemplateElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateElement")
    @js.native
    def isTemplateElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TemplateElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateElement")
    @js.native
    def isTemplateElement(node: js.Object): /* is babel-types.babel-types/ts3.6.TemplateElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateElement")
    @js.native
    def isTemplateElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TemplateElement */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateElement")
    @js.native
    def isTemplateElement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TemplateElement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTemplateLiteral")
    @js.native
    def isTemplateLiteral(): /* is babel-types.babel-types/ts3.6.TemplateLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateLiteral")
    @js.native
    def isTemplateLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TemplateLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateLiteral")
    @js.native
    def isTemplateLiteral(node: js.Object): /* is babel-types.babel-types/ts3.6.TemplateLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateLiteral")
    @js.native
    def isTemplateLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TemplateLiteral */ Boolean = js.native
    @JSImport("babel-core", "types.isTemplateLiteral")
    @js.native
    def isTemplateLiteral(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TemplateLiteral */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTerminatorless")
    @js.native
    def isTerminatorless(): /* is babel-types.babel-types/ts3.6.Terminatorless */ Boolean = js.native
    @JSImport("babel-core", "types.isTerminatorless")
    @js.native
    def isTerminatorless(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.Terminatorless */ Boolean = js.native
    @JSImport("babel-core", "types.isTerminatorless")
    @js.native
    def isTerminatorless(node: js.Object): /* is babel-types.babel-types/ts3.6.Terminatorless */ Boolean = js.native
    @JSImport("babel-core", "types.isTerminatorless")
    @js.native
    def isTerminatorless(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.Terminatorless */ Boolean = js.native
    @JSImport("babel-core", "types.isTerminatorless")
    @js.native
    def isTerminatorless(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.Terminatorless */ Boolean = js.native
    
    @JSImport("babel-core", "types.isThisExpression")
    @js.native
    def isThisExpression(): /* is babel-types.babel-types/ts3.6.ThisExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isThisExpression")
    @js.native
    def isThisExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ThisExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isThisExpression")
    @js.native
    def isThisExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.ThisExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isThisExpression")
    @js.native
    def isThisExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ThisExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isThisExpression")
    @js.native
    def isThisExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ThisExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isThisTypeAnnotation")
    @js.native
    def isThisTypeAnnotation(): /* is babel-types.babel-types/ts3.6.ThisTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isThisTypeAnnotation")
    @js.native
    def isThisTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ThisTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isThisTypeAnnotation")
    @js.native
    def isThisTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.ThisTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isThisTypeAnnotation")
    @js.native
    def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ThisTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isThisTypeAnnotation")
    @js.native
    def isThisTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ThisTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isThrowStatement")
    @js.native
    def isThrowStatement(): /* is babel-types.babel-types/ts3.6.ThrowStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isThrowStatement")
    @js.native
    def isThrowStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.ThrowStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isThrowStatement")
    @js.native
    def isThrowStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.ThrowStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isThrowStatement")
    @js.native
    def isThrowStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.ThrowStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isThrowStatement")
    @js.native
    def isThrowStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.ThrowStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTryStatement")
    @js.native
    def isTryStatement(): /* is babel-types.babel-types/ts3.6.TryStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isTryStatement")
    @js.native
    def isTryStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TryStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isTryStatement")
    @js.native
    def isTryStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.TryStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isTryStatement")
    @js.native
    def isTryStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TryStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isTryStatement")
    @js.native
    def isTryStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TryStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTupleTypeAnnotation")
    @js.native
    def isTupleTypeAnnotation(): /* is babel-types.babel-types/ts3.6.TupleTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTupleTypeAnnotation")
    @js.native
    def isTupleTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TupleTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTupleTypeAnnotation")
    @js.native
    def isTupleTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.TupleTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTupleTypeAnnotation")
    @js.native
    def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TupleTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTupleTypeAnnotation")
    @js.native
    def isTupleTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TupleTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTypeAlias")
    @js.native
    def isTypeAlias(): /* is babel-types.babel-types/ts3.6.TypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAlias")
    @js.native
    def isTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAlias")
    @js.native
    def isTypeAlias(node: js.Object): /* is babel-types.babel-types/ts3.6.TypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAlias")
    @js.native
    def isTypeAlias(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeAlias */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAlias")
    @js.native
    def isTypeAlias(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeAlias */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTypeAnnotation")
    @js.native
    def isTypeAnnotation(): /* is babel-types.babel-types/ts3.6.TypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAnnotation")
    @js.native
    def isTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAnnotation")
    @js.native
    def isTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.TypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAnnotation")
    @js.native
    def isTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeAnnotation")
    @js.native
    def isTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTypeCastExpression")
    @js.native
    def isTypeCastExpression(): /* is babel-types.babel-types/ts3.6.TypeCastExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeCastExpression")
    @js.native
    def isTypeCastExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeCastExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeCastExpression")
    @js.native
    def isTypeCastExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.TypeCastExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeCastExpression")
    @js.native
    def isTypeCastExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeCastExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeCastExpression")
    @js.native
    def isTypeCastExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeCastExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTypeParameter")
    @js.native
    def isTypeParameter(): /* is babel-types.babel-types/ts3.6.TypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameter")
    @js.native
    def isTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameter")
    @js.native
    def isTypeParameter(node: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameter")
    @js.native
    def isTypeParameter(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameter */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameter")
    @js.native
    def isTypeParameter(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameter */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTypeParameterDeclaration")
    @js.native
    def isTypeParameterDeclaration(): /* is babel-types.babel-types/ts3.6.TypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterDeclaration")
    @js.native
    def isTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterDeclaration")
    @js.native
    def isTypeParameterDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterDeclaration")
    @js.native
    def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterDeclaration")
    @js.native
    def isTypeParameterDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTypeParameterInstantiation")
    @js.native
    def isTypeParameterInstantiation(): /* is babel-types.babel-types/ts3.6.TypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterInstantiation")
    @js.native
    def isTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterInstantiation")
    @js.native
    def isTypeParameterInstantiation(node: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterInstantiation")
    @js.native
    def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterInstantiation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeParameterInstantiation")
    @js.native
    def isTypeParameterInstantiation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeParameterInstantiation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isTypeofTypeAnnotation")
    @js.native
    def isTypeofTypeAnnotation(): /* is babel-types.babel-types/ts3.6.TypeofTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeofTypeAnnotation")
    @js.native
    def isTypeofTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeofTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeofTypeAnnotation")
    @js.native
    def isTypeofTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.TypeofTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeofTypeAnnotation")
    @js.native
    def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeofTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isTypeofTypeAnnotation")
    @js.native
    def isTypeofTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.TypeofTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isUnaryExpression")
    @js.native
    def isUnaryExpression(): /* is babel-types.babel-types/ts3.6.UnaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryExpression")
    @js.native
    def isUnaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.UnaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryExpression")
    @js.native
    def isUnaryExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.UnaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryExpression")
    @js.native
    def isUnaryExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.UnaryExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryExpression")
    @js.native
    def isUnaryExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.UnaryExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isUnaryLike")
    @js.native
    def isUnaryLike(): /* is babel-types.babel-types/ts3.6.UnaryLike */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryLike")
    @js.native
    def isUnaryLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.UnaryLike */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryLike")
    @js.native
    def isUnaryLike(node: js.Object): /* is babel-types.babel-types/ts3.6.UnaryLike */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryLike")
    @js.native
    def isUnaryLike(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.UnaryLike */ Boolean = js.native
    @JSImport("babel-core", "types.isUnaryLike")
    @js.native
    def isUnaryLike(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.UnaryLike */ Boolean = js.native
    
    @JSImport("babel-core", "types.isUnionTypeAnnotation")
    @js.native
    def isUnionTypeAnnotation(): /* is babel-types.babel-types/ts3.6.UnionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isUnionTypeAnnotation")
    @js.native
    def isUnionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.UnionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isUnionTypeAnnotation")
    @js.native
    def isUnionTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.UnionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isUnionTypeAnnotation")
    @js.native
    def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.UnionTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isUnionTypeAnnotation")
    @js.native
    def isUnionTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.UnionTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isUpdateExpression")
    @js.native
    def isUpdateExpression(): /* is babel-types.babel-types/ts3.6.UpdateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUpdateExpression")
    @js.native
    def isUpdateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.UpdateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUpdateExpression")
    @js.native
    def isUpdateExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.UpdateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUpdateExpression")
    @js.native
    def isUpdateExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.UpdateExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isUpdateExpression")
    @js.native
    def isUpdateExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.UpdateExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.isUser")
    @js.native
    def isUser(): Boolean = js.native
    @JSImport("babel-core", "types.isUser")
    @js.native
    def isUser(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isUser")
    @js.native
    def isUser(node: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isUser")
    @js.native
    def isUser(node: js.Object, opts: js.Object): Boolean = js.native
    @JSImport("babel-core", "types.isUser")
    @js.native
    def isUser(node: Null, opts: js.Object): Boolean = js.native
    
    @JSImport("babel-core", "types.isUserWhitespacable")
    @js.native
    def isUserWhitespacable(): /* is babel-types.babel-types/ts3.6.UserWhitespacable */ Boolean = js.native
    @JSImport("babel-core", "types.isUserWhitespacable")
    @js.native
    def isUserWhitespacable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.UserWhitespacable */ Boolean = js.native
    @JSImport("babel-core", "types.isUserWhitespacable")
    @js.native
    def isUserWhitespacable(node: js.Object): /* is babel-types.babel-types/ts3.6.UserWhitespacable */ Boolean = js.native
    @JSImport("babel-core", "types.isUserWhitespacable")
    @js.native
    def isUserWhitespacable(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.UserWhitespacable */ Boolean = js.native
    @JSImport("babel-core", "types.isUserWhitespacable")
    @js.native
    def isUserWhitespacable(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.UserWhitespacable */ Boolean = js.native
    
    @JSImport("babel-core", "types.isVar")
    @js.native
    def isVar(): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVar")
    @js.native
    def isVar(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVar")
    @js.native
    def isVar(node: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVar")
    @js.native
    def isVar(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVar")
    @js.native
    def isVar(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isVariableDeclaration")
    @js.native
    def isVariableDeclaration(): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclaration")
    @js.native
    def isVariableDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclaration")
    @js.native
    def isVariableDeclaration(node: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclaration")
    @js.native
    def isVariableDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclaration")
    @js.native
    def isVariableDeclaration(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclaration */ Boolean = js.native
    
    @JSImport("babel-core", "types.isVariableDeclarator")
    @js.native
    def isVariableDeclarator(): /* is babel-types.babel-types/ts3.6.VariableDeclarator */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclarator")
    @js.native
    def isVariableDeclarator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclarator */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclarator")
    @js.native
    def isVariableDeclarator(node: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclarator */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclarator")
    @js.native
    def isVariableDeclarator(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclarator */ Boolean = js.native
    @JSImport("babel-core", "types.isVariableDeclarator")
    @js.native
    def isVariableDeclarator(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.VariableDeclarator */ Boolean = js.native
    
    @JSImport("babel-core", "types.isVoidTypeAnnotation")
    @js.native
    def isVoidTypeAnnotation(): /* is babel-types.babel-types/ts3.6.VoidTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isVoidTypeAnnotation")
    @js.native
    def isVoidTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.VoidTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isVoidTypeAnnotation")
    @js.native
    def isVoidTypeAnnotation(node: js.Object): /* is babel-types.babel-types/ts3.6.VoidTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isVoidTypeAnnotation")
    @js.native
    def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.VoidTypeAnnotation */ Boolean = js.native
    @JSImport("babel-core", "types.isVoidTypeAnnotation")
    @js.native
    def isVoidTypeAnnotation(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.VoidTypeAnnotation */ Boolean = js.native
    
    @JSImport("babel-core", "types.isWhile")
    @js.native
    def isWhile(): /* is babel-types.babel-types/ts3.6.While */ Boolean = js.native
    @JSImport("babel-core", "types.isWhile")
    @js.native
    def isWhile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.While */ Boolean = js.native
    @JSImport("babel-core", "types.isWhile")
    @js.native
    def isWhile(node: js.Object): /* is babel-types.babel-types/ts3.6.While */ Boolean = js.native
    @JSImport("babel-core", "types.isWhile")
    @js.native
    def isWhile(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.While */ Boolean = js.native
    @JSImport("babel-core", "types.isWhile")
    @js.native
    def isWhile(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.While */ Boolean = js.native
    
    @JSImport("babel-core", "types.isWhileStatement")
    @js.native
    def isWhileStatement(): /* is babel-types.babel-types/ts3.6.WhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWhileStatement")
    @js.native
    def isWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.WhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWhileStatement")
    @js.native
    def isWhileStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.WhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWhileStatement")
    @js.native
    def isWhileStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.WhileStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWhileStatement")
    @js.native
    def isWhileStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.WhileStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isWithStatement")
    @js.native
    def isWithStatement(): /* is babel-types.babel-types/ts3.6.WithStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWithStatement")
    @js.native
    def isWithStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.WithStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWithStatement")
    @js.native
    def isWithStatement(node: js.Object): /* is babel-types.babel-types/ts3.6.WithStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWithStatement")
    @js.native
    def isWithStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.WithStatement */ Boolean = js.native
    @JSImport("babel-core", "types.isWithStatement")
    @js.native
    def isWithStatement(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.WithStatement */ Boolean = js.native
    
    @JSImport("babel-core", "types.isYieldExpression")
    @js.native
    def isYieldExpression(): /* is babel-types.babel-types/ts3.6.YieldExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isYieldExpression")
    @js.native
    def isYieldExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types/ts3.6.YieldExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isYieldExpression")
    @js.native
    def isYieldExpression(node: js.Object): /* is babel-types.babel-types/ts3.6.YieldExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isYieldExpression")
    @js.native
    def isYieldExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types/ts3.6.YieldExpression */ Boolean = js.native
    @JSImport("babel-core", "types.isYieldExpression")
    @js.native
    def isYieldExpression(node: Null, opts: js.Object): /* is babel-types.babel-types/ts3.6.YieldExpression */ Boolean = js.native
    
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: js.UndefOr[scala.Nothing], value: JSXElement_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: js.UndefOr[scala.Nothing], value: JSXExpressionContainer_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: js.UndefOr[scala.Nothing], value: StringLiteral_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXIdentifier_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXIdentifier_, value: JSXElement_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXIdentifier_, value: JSXExpressionContainer_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXIdentifier_, value: StringLiteral_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXNamespacedName_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXNamespacedName_, value: JSXElement_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXNamespacedName_, value: JSXExpressionContainer_): JSXAttribute_ = js.native
    @JSImport("babel-core", "types.jSXAttribute")
    @js.native
    def jSXAttribute(name: JSXNamespacedName_, value: StringLiteral_): JSXAttribute_ = js.native
    
    @JSImport("babel-core", "types.jSXClosingElement")
    @js.native
    def jSXClosingElement(): JSXClosingElement_ = js.native
    @JSImport("babel-core", "types.jSXClosingElement")
    @js.native
    def jSXClosingElement(name: JSXIdentifier_): JSXClosingElement_ = js.native
    @JSImport("babel-core", "types.jSXClosingElement")
    @js.native
    def jSXClosingElement(name: JSXMemberExpression_): JSXClosingElement_ = js.native
    
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: js.UndefOr[scala.Nothing],
      closingElement: js.UndefOr[scala.Nothing],
      children: js.UndefOr[scala.Nothing],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: js.UndefOr[scala.Nothing],
      closingElement: js.UndefOr[scala.Nothing],
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: js.UndefOr[scala.Nothing],
      closingElement: js.UndefOr[scala.Nothing],
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(openingElement: js.UndefOr[scala.Nothing], closingElement: JSXClosingElement_): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: js.UndefOr[scala.Nothing],
      closingElement: JSXClosingElement_,
      children: js.UndefOr[scala.Nothing],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: js.UndefOr[scala.Nothing],
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: js.UndefOr[scala.Nothing],
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(openingElement: JSXOpeningElement_): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: js.UndefOr[scala.Nothing],
      children: js.UndefOr[scala.Nothing],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: js.UndefOr[scala.Nothing],
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: js.UndefOr[scala.Nothing],
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(openingElement: JSXOpeningElement_, closingElement: JSXClosingElement_): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: JSXClosingElement_,
      children: js.UndefOr[scala.Nothing],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
    ): JSXElement_ = js.native
    @JSImport("babel-core", "types.jSXElement")
    @js.native
    def jSXElement(
      openingElement: JSXOpeningElement_,
      closingElement: JSXClosingElement_,
      children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
      selfClosing: Boolean
    ): JSXElement_ = js.native
    
    @JSImport("babel-core", "types.jSXEmptyExpression")
    @js.native
    def jSXEmptyExpression(): JSXEmptyExpression_ = js.native
    
    @JSImport("babel-core", "types.jSXExpressionContainer")
    @js.native
    def jSXExpressionContainer(): JSXExpressionContainer_ = js.native
    @JSImport("babel-core", "types.jSXExpressionContainer")
    @js.native
    def jSXExpressionContainer(expression: Expression): JSXExpressionContainer_ = js.native
    
    @JSImport("babel-core", "types.jSXIdentifier")
    @js.native
    def jSXIdentifier(): JSXIdentifier_ = js.native
    @JSImport("babel-core", "types.jSXIdentifier")
    @js.native
    def jSXIdentifier(name: String): JSXIdentifier_ = js.native
    
    @JSImport("babel-core", "types.jSXMemberExpression")
    @js.native
    def jSXMemberExpression(): JSXMemberExpression_ = js.native
    @JSImport("babel-core", "types.jSXMemberExpression")
    @js.native
    def jSXMemberExpression(`object`: js.UndefOr[scala.Nothing], property: JSXIdentifier_): JSXMemberExpression_ = js.native
    @JSImport("babel-core", "types.jSXMemberExpression")
    @js.native
    def jSXMemberExpression(`object`: JSXIdentifier_): JSXMemberExpression_ = js.native
    @JSImport("babel-core", "types.jSXMemberExpression")
    @js.native
    def jSXMemberExpression(`object`: JSXIdentifier_, property: JSXIdentifier_): JSXMemberExpression_ = js.native
    @JSImport("babel-core", "types.jSXMemberExpression")
    @js.native
    def jSXMemberExpression(`object`: JSXMemberExpression_): JSXMemberExpression_ = js.native
    @JSImport("babel-core", "types.jSXMemberExpression")
    @js.native
    def jSXMemberExpression(`object`: JSXMemberExpression_, property: JSXIdentifier_): JSXMemberExpression_ = js.native
    
    @JSImport("babel-core", "types.jSXNamespacedName")
    @js.native
    def jSXNamespacedName(): JSXNamespacedName_ = js.native
    @JSImport("babel-core", "types.jSXNamespacedName")
    @js.native
    def jSXNamespacedName(namespace: js.UndefOr[scala.Nothing], name: JSXIdentifier_): JSXNamespacedName_ = js.native
    @JSImport("babel-core", "types.jSXNamespacedName")
    @js.native
    def jSXNamespacedName(namespace: JSXIdentifier_): JSXNamespacedName_ = js.native
    @JSImport("babel-core", "types.jSXNamespacedName")
    @js.native
    def jSXNamespacedName(namespace: JSXIdentifier_, name: JSXIdentifier_): JSXNamespacedName_ = js.native
    
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: js.UndefOr[scala.Nothing], attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: js.UndefOr[scala.Nothing], attributes: js.Array[JSXAttribute_]): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: js.UndefOr[scala.Nothing], attributes: js.Array[JSXAttribute_], selfClosing: Boolean): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXIdentifier_): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXIdentifier_, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXIdentifier_, attributes: js.Array[JSXAttribute_]): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXIdentifier_, attributes: js.Array[JSXAttribute_], selfClosing: Boolean): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXMemberExpression_): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXMemberExpression_, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXMemberExpression_, attributes: js.Array[JSXAttribute_]): JSXOpeningElement_ = js.native
    @JSImport("babel-core", "types.jSXOpeningElement")
    @js.native
    def jSXOpeningElement(name: JSXMemberExpression_, attributes: js.Array[JSXAttribute_], selfClosing: Boolean): JSXOpeningElement_ = js.native
    
    @JSImport("babel-core", "types.jSXSpreadAttribute")
    @js.native
    def jSXSpreadAttribute(): JSXSpreadAttribute_ = js.native
    @JSImport("babel-core", "types.jSXSpreadAttribute")
    @js.native
    def jSXSpreadAttribute(argument: Expression): JSXSpreadAttribute_ = js.native
    
    @JSImport("babel-core", "types.jSXText")
    @js.native
    def jSXText(): JSXText_ = js.native
    @JSImport("babel-core", "types.jSXText")
    @js.native
    def jSXText(value: String): JSXText_ = js.native
    
    @JSImport("babel-core", "types.labeledStatement")
    @js.native
    def labeledStatement(): LabeledStatement_ = js.native
    @JSImport("babel-core", "types.labeledStatement")
    @js.native
    def labeledStatement(label: js.UndefOr[scala.Nothing], body: Statement): LabeledStatement_ = js.native
    @JSImport("babel-core", "types.labeledStatement")
    @js.native
    def labeledStatement(label: Identifier_): LabeledStatement_ = js.native
    @JSImport("babel-core", "types.labeledStatement")
    @js.native
    def labeledStatement(label: Identifier_, body: Statement): LabeledStatement_ = js.native
    
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: js.UndefOr[scala.Nothing], left: js.UndefOr[scala.Nothing], right: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: js.UndefOr[scala.Nothing], left: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: js.UndefOr[scala.Nothing], left: Expression, right: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: AmpersandAmpersand): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: AmpersandAmpersand, left: js.UndefOr[scala.Nothing], right: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: AmpersandAmpersand, left: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: AmpersandAmpersand, left: Expression, right: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: VerticallineVerticalline): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: VerticallineVerticalline, left: js.UndefOr[scala.Nothing], right: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: VerticallineVerticalline, left: Expression): LogicalExpression_ = js.native
    @JSImport("babel-core", "types.logicalExpression")
    @js.native
    def logicalExpression(operator: VerticallineVerticalline, left: Expression, right: Expression): LogicalExpression_ = js.native
    
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: js.UndefOr[scala.Nothing], property: js.UndefOr[scala.Nothing], computed: Boolean): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: js.UndefOr[scala.Nothing], property: Expression): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: js.UndefOr[scala.Nothing], property: Expression, computed: Boolean): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Expression): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Expression, property: js.UndefOr[scala.Nothing], computed: Boolean): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Expression, property: Expression): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Expression, property: Expression, computed: Boolean): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Super): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Super, property: js.UndefOr[scala.Nothing], computed: Boolean): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Super, property: Expression): MemberExpression_ = js.native
    @JSImport("babel-core", "types.memberExpression")
    @js.native
    def memberExpression(`object`: Super, property: Expression, computed: Boolean): MemberExpression_ = js.native
    
    @JSImport("babel-core", "types.metaProperty")
    @js.native
    def metaProperty(): MetaProperty_ = js.native
    @JSImport("babel-core", "types.metaProperty")
    @js.native
    def metaProperty(meta: js.UndefOr[scala.Nothing], property: String): MetaProperty_ = js.native
    @JSImport("babel-core", "types.metaProperty")
    @js.native
    def metaProperty(meta: String): MetaProperty_ = js.native
    @JSImport("babel-core", "types.metaProperty")
    @js.native
    def metaProperty(meta: String, property: String): MetaProperty_ = js.native
    
    @JSImport("babel-core", "types.mixedTypeAnnotation")
    @js.native
    def mixedTypeAnnotation(): MixedTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.newExpression")
    @js.native
    def newExpression(): NewExpression_ = js.native
    @JSImport("babel-core", "types.newExpression")
    @js.native
    def newExpression(callee: js.UndefOr[scala.Nothing], _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
    @JSImport("babel-core", "types.newExpression")
    @js.native
    def newExpression(callee: Expression): NewExpression_ = js.native
    @JSImport("babel-core", "types.newExpression")
    @js.native
    def newExpression(callee: Expression, _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
    @JSImport("babel-core", "types.newExpression")
    @js.native
    def newExpression(callee: Super): NewExpression_ = js.native
    @JSImport("babel-core", "types.newExpression")
    @js.native
    def newExpression(callee: Super, _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
    
    @JSImport("babel-core", "types.noop")
    @js.native
    def noop(): Noop_ = js.native
    
    @JSImport("babel-core", "types.nullLiteral")
    @js.native
    def nullLiteral(): NullLiteral_ = js.native
    
    @JSImport("babel-core", "types.nullLiteralTypeAnnotation")
    @js.native
    def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.nullableTypeAnnotation")
    @js.native
    def nullableTypeAnnotation(): NullableTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.nullableTypeAnnotation")
    @js.native
    def nullableTypeAnnotation(typeAnnotation: FlowTypeAnnotation): NullableTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.numberTypeAnnotation")
    @js.native
    def numberTypeAnnotation(): NumberTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.numericLiteral")
    @js.native
    def numericLiteral(): NumericLiteral_ = js.native
    @JSImport("babel-core", "types.numericLiteral")
    @js.native
    def numericLiteral(value: Double): NumericLiteral_ = js.native
    
    @JSImport("babel-core", "types.numericLiteralTypeAnnotation")
    @js.native
    def numericLiteralTypeAnnotation(): NumericLiteralTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.objectExpression")
    @js.native
    def objectExpression(): ObjectExpression_ = js.native
    @JSImport("babel-core", "types.objectExpression")
    @js.native
    def objectExpression(properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_]): ObjectExpression_ = js.native
    
    @JSImport("babel-core", "types.objectMethod")
    @js.native
    def objectMethod(
      kind: js.UndefOr[get | set | method],
      key: js.UndefOr[Expression],
      params: js.UndefOr[js.Array[LVal]],
      body: js.UndefOr[BlockStatement_],
      computed: js.UndefOr[Boolean]
    ): ObjectMethod_ = js.native
    
    @JSImport("babel-core", "types.objectPattern")
    @js.native
    def objectPattern(): ObjectPattern_ = js.native
    @JSImport("babel-core", "types.objectPattern")
    @js.native
    def objectPattern(properties: js.UndefOr[scala.Nothing], typeAnnotation: TypeAnnotation_): ObjectPattern_ = js.native
    @JSImport("babel-core", "types.objectPattern")
    @js.native
    def objectPattern(properties: js.Array[AssignmentProperty | RestProperty_]): ObjectPattern_ = js.native
    @JSImport("babel-core", "types.objectPattern")
    @js.native
    def objectPattern(properties: js.Array[AssignmentProperty | RestProperty_], typeAnnotation: TypeAnnotation_): ObjectPattern_ = js.native
    
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      computed: js.UndefOr[scala.Nothing],
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      computed: js.UndefOr[scala.Nothing],
      shorthand: Boolean
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      computed: js.UndefOr[scala.Nothing],
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], computed: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      computed: Boolean,
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      computed: Boolean,
      shorthand: Boolean
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: js.UndefOr[scala.Nothing],
      computed: Boolean,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: js.UndefOr[scala.Nothing], value: Expression): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: Expression,
      computed: js.UndefOr[scala.Nothing],
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: Expression,
      computed: js.UndefOr[scala.Nothing],
      shorthand: Boolean
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: Expression,
      computed: js.UndefOr[scala.Nothing],
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: js.UndefOr[scala.Nothing], value: Expression, computed: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: Expression,
      computed: Boolean,
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: js.UndefOr[scala.Nothing], value: Expression, computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: js.UndefOr[scala.Nothing],
      value: Expression,
      computed: Boolean,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: Expression): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: js.UndefOr[scala.Nothing],
      computed: js.UndefOr[scala.Nothing],
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: js.UndefOr[scala.Nothing],
      computed: js.UndefOr[scala.Nothing],
      shorthand: Boolean
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: js.UndefOr[scala.Nothing],
      computed: js.UndefOr[scala.Nothing],
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: Expression, value: js.UndefOr[scala.Nothing], computed: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: js.UndefOr[scala.Nothing],
      computed: Boolean,
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: Expression, value: js.UndefOr[scala.Nothing], computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: js.UndefOr[scala.Nothing],
      computed: Boolean,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: Expression, value: Expression): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: js.UndefOr[scala.Nothing],
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: Expression, value: Expression, computed: js.UndefOr[scala.Nothing], shorthand: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: js.UndefOr[scala.Nothing],
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: Expression, value: Expression, computed: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: Boolean,
      shorthand: js.UndefOr[scala.Nothing],
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(key: Expression, value: Expression, computed: Boolean, shorthand: Boolean): ObjectProperty_ = js.native
    @JSImport("babel-core", "types.objectProperty")
    @js.native
    def objectProperty(
      key: Expression,
      value: Expression,
      computed: Boolean,
      shorthand: Boolean,
      decorators: js.Array[Decorator_]
    ): ObjectProperty_ = js.native
    
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(): ObjectTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(
      properties: js.UndefOr[scala.Nothing],
      indexers: js.UndefOr[scala.Nothing],
      callProperties: js.Array[ObjectTypeCallProperty_]
    ): ObjectTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(properties: js.UndefOr[scala.Nothing], indexers: js.Array[ObjectTypeIndexer_]): ObjectTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(
      properties: js.UndefOr[scala.Nothing],
      indexers: js.Array[ObjectTypeIndexer_],
      callProperties: js.Array[ObjectTypeCallProperty_]
    ): ObjectTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty_]): ObjectTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(
      properties: js.Array[ObjectTypeProperty_],
      indexers: js.UndefOr[scala.Nothing],
      callProperties: js.Array[ObjectTypeCallProperty_]
    ): ObjectTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty_], indexers: js.Array[ObjectTypeIndexer_]): ObjectTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.objectTypeAnnotation")
    @js.native
    def objectTypeAnnotation(
      properties: js.Array[ObjectTypeProperty_],
      indexers: js.Array[ObjectTypeIndexer_],
      callProperties: js.Array[ObjectTypeCallProperty_]
    ): ObjectTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.objectTypeCallProperty")
    @js.native
    def objectTypeCallProperty(): ObjectTypeCallProperty_ = js.native
    @JSImport("babel-core", "types.objectTypeCallProperty")
    @js.native
    def objectTypeCallProperty(value: FlowTypeAnnotation): ObjectTypeCallProperty_ = js.native
    
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(): ObjectTypeIndexer_ = js.native
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: FlowTypeAnnotation, value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(id: Expression): ObjectTypeIndexer_ = js.native
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(id: Expression, key: js.UndefOr[scala.Nothing], value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(id: Expression, key: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    @JSImport("babel-core", "types.objectTypeIndexer")
    @js.native
    def objectTypeIndexer(id: Expression, key: FlowTypeAnnotation, value: FlowTypeAnnotation): ObjectTypeIndexer_ = js.native
    
    @JSImport("babel-core", "types.objectTypeProperty")
    @js.native
    def objectTypeProperty(): ObjectTypeProperty_ = js.native
    @JSImport("babel-core", "types.objectTypeProperty")
    @js.native
    def objectTypeProperty(key: js.UndefOr[scala.Nothing], value: FlowTypeAnnotation): ObjectTypeProperty_ = js.native
    @JSImport("babel-core", "types.objectTypeProperty")
    @js.native
    def objectTypeProperty(key: Expression): ObjectTypeProperty_ = js.native
    @JSImport("babel-core", "types.objectTypeProperty")
    @js.native
    def objectTypeProperty(key: Expression, value: FlowTypeAnnotation): ObjectTypeProperty_ = js.native
    
    @JSImport("babel-core", "types.parenthesizedExpression")
    @js.native
    def parenthesizedExpression(): ParenthesizedExpression_ = js.native
    @JSImport("babel-core", "types.parenthesizedExpression")
    @js.native
    def parenthesizedExpression(expression: Expression): ParenthesizedExpression_ = js.native
    
    @JSImport("babel-core", "types.program")
    @js.native
    def program(): Program_ = js.native
    @JSImport("babel-core", "types.program")
    @js.native
    def program(body: js.UndefOr[scala.Nothing], directives: js.Array[Directive_]): Program_ = js.native
    @JSImport("babel-core", "types.program")
    @js.native
    def program(body: js.Array[Statement | ModuleDeclaration]): Program_ = js.native
    @JSImport("babel-core", "types.program")
    @js.native
    def program(body: js.Array[Statement | ModuleDeclaration], directives: js.Array[Directive_]): Program_ = js.native
    
    @JSImport("babel-core", "types.qualifiedTypeIdentifier")
    @js.native
    def qualifiedTypeIdentifier(): QualifiedTypeIdentifier_ = js.native
    @JSImport("babel-core", "types.qualifiedTypeIdentifier")
    @js.native
    def qualifiedTypeIdentifier(id: js.UndefOr[scala.Nothing], qualification: Identifier_): QualifiedTypeIdentifier_ = js.native
    @JSImport("babel-core", "types.qualifiedTypeIdentifier")
    @js.native
    def qualifiedTypeIdentifier(id: js.UndefOr[scala.Nothing], qualification: QualifiedTypeIdentifier_): QualifiedTypeIdentifier_ = js.native
    @JSImport("babel-core", "types.qualifiedTypeIdentifier")
    @js.native
    def qualifiedTypeIdentifier(id: Identifier_): QualifiedTypeIdentifier_ = js.native
    @JSImport("babel-core", "types.qualifiedTypeIdentifier")
    @js.native
    def qualifiedTypeIdentifier(id: Identifier_, qualification: Identifier_): QualifiedTypeIdentifier_ = js.native
    @JSImport("babel-core", "types.qualifiedTypeIdentifier")
    @js.native
    def qualifiedTypeIdentifier(id: Identifier_, qualification: QualifiedTypeIdentifier_): QualifiedTypeIdentifier_ = js.native
    
    @JSImport("babel-core", "types.react")
    @js.native
    val react: ReactHelpers = js.native
    
    @JSImport("babel-core", "types.regExpLiteral")
    @js.native
    def regExpLiteral(): RegExpLiteral_ = js.native
    @JSImport("babel-core", "types.regExpLiteral")
    @js.native
    def regExpLiteral(pattern: js.UndefOr[scala.Nothing], flags: String): RegExpLiteral_ = js.native
    @JSImport("babel-core", "types.regExpLiteral")
    @js.native
    def regExpLiteral(pattern: String): RegExpLiteral_ = js.native
    @JSImport("babel-core", "types.regExpLiteral")
    @js.native
    def regExpLiteral(pattern: String, flags: String): RegExpLiteral_ = js.native
    
    @JSImport("babel-core", "types.restElement")
    @js.native
    def restElement(): RestElement_ = js.native
    @JSImport("babel-core", "types.restElement")
    @js.native
    def restElement(argument: js.UndefOr[scala.Nothing], typeAnnotation: TypeAnnotation_): RestElement_ = js.native
    @JSImport("babel-core", "types.restElement")
    @js.native
    def restElement(argument: LVal): RestElement_ = js.native
    @JSImport("babel-core", "types.restElement")
    @js.native
    def restElement(argument: LVal, typeAnnotation: TypeAnnotation_): RestElement_ = js.native
    
    @JSImport("babel-core", "types.restProperty")
    @js.native
    def restProperty(): RestProperty_ = js.native
    @JSImport("babel-core", "types.restProperty")
    @js.native
    def restProperty(argument: LVal): RestProperty_ = js.native
    
    @JSImport("babel-core", "types.returnStatement")
    @js.native
    def returnStatement(): ReturnStatement_ = js.native
    @JSImport("babel-core", "types.returnStatement")
    @js.native
    def returnStatement(argument: Expression): ReturnStatement_ = js.native
    
    @JSImport("babel-core", "types.sequenceExpression")
    @js.native
    def sequenceExpression(): SequenceExpression_ = js.native
    @JSImport("babel-core", "types.sequenceExpression")
    @js.native
    def sequenceExpression(expressions: js.Array[Expression]): SequenceExpression_ = js.native
    
    @JSImport("babel-core", "types.spreadElement")
    @js.native
    def spreadElement(): SpreadElement_ = js.native
    @JSImport("babel-core", "types.spreadElement")
    @js.native
    def spreadElement(argument: Expression): SpreadElement_ = js.native
    
    @JSImport("babel-core", "types.spreadProperty")
    @js.native
    def spreadProperty(): SpreadProperty_ = js.native
    @JSImport("babel-core", "types.spreadProperty")
    @js.native
    def spreadProperty(argument: Expression): SpreadProperty_ = js.native
    
    @JSImport("babel-core", "types.stringLiteral")
    @js.native
    def stringLiteral(): StringLiteral_ = js.native
    @JSImport("babel-core", "types.stringLiteral")
    @js.native
    def stringLiteral(value: String): StringLiteral_ = js.native
    
    @JSImport("babel-core", "types.stringLiteralTypeAnnotation")
    @js.native
    def stringLiteralTypeAnnotation(): StringLiteralTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.stringTypeAnnotation")
    @js.native
    def stringTypeAnnotation(): StringTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.switchCase")
    @js.native
    def switchCase(): SwitchCase_ = js.native
    @JSImport("babel-core", "types.switchCase")
    @js.native
    def switchCase(test: js.UndefOr[scala.Nothing], consequent: js.Array[Statement]): SwitchCase_ = js.native
    @JSImport("babel-core", "types.switchCase")
    @js.native
    def switchCase(test: Expression): SwitchCase_ = js.native
    @JSImport("babel-core", "types.switchCase")
    @js.native
    def switchCase(test: Expression, consequent: js.Array[Statement]): SwitchCase_ = js.native
    
    @JSImport("babel-core", "types.switchStatement")
    @js.native
    def switchStatement(): SwitchStatement_ = js.native
    @JSImport("babel-core", "types.switchStatement")
    @js.native
    def switchStatement(discriminant: js.UndefOr[scala.Nothing], cases: js.Array[SwitchCase_]): SwitchStatement_ = js.native
    @JSImport("babel-core", "types.switchStatement")
    @js.native
    def switchStatement(discriminant: Expression): SwitchStatement_ = js.native
    @JSImport("babel-core", "types.switchStatement")
    @js.native
    def switchStatement(discriminant: Expression, cases: js.Array[SwitchCase_]): SwitchStatement_ = js.native
    
    @JSImport("babel-core", "types.taggedTemplateExpression")
    @js.native
    def taggedTemplateExpression(): TaggedTemplateExpression_ = js.native
    @JSImport("babel-core", "types.taggedTemplateExpression")
    @js.native
    def taggedTemplateExpression(tag: js.UndefOr[scala.Nothing], quasi: TemplateLiteral_): TaggedTemplateExpression_ = js.native
    @JSImport("babel-core", "types.taggedTemplateExpression")
    @js.native
    def taggedTemplateExpression(tag: Expression): TaggedTemplateExpression_ = js.native
    @JSImport("babel-core", "types.taggedTemplateExpression")
    @js.native
    def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral_): TaggedTemplateExpression_ = js.native
    
    @JSImport("babel-core", "types.templateElement")
    @js.native
    def templateElement(): TemplateElement_ = js.native
    @JSImport("babel-core", "types.templateElement")
    @js.native
    def templateElement(value: js.UndefOr[scala.Nothing], tail: Boolean): TemplateElement_ = js.native
    @JSImport("babel-core", "types.templateElement")
    @js.native
    def templateElement(value: Cooked): TemplateElement_ = js.native
    @JSImport("babel-core", "types.templateElement")
    @js.native
    def templateElement(value: Cooked, tail: Boolean): TemplateElement_ = js.native
    
    @JSImport("babel-core", "types.templateLiteral")
    @js.native
    def templateLiteral(): TemplateLiteral_ = js.native
    @JSImport("babel-core", "types.templateLiteral")
    @js.native
    def templateLiteral(quasis: js.UndefOr[scala.Nothing], expressions: js.Array[Expression]): TemplateLiteral_ = js.native
    @JSImport("babel-core", "types.templateLiteral")
    @js.native
    def templateLiteral(quasis: js.Array[TemplateElement_]): TemplateLiteral_ = js.native
    @JSImport("babel-core", "types.templateLiteral")
    @js.native
    def templateLiteral(quasis: js.Array[TemplateElement_], expressions: js.Array[Expression]): TemplateLiteral_ = js.native
    
    @JSImport("babel-core", "types.thisExpression")
    @js.native
    def thisExpression(): ThisExpression_ = js.native
    
    @JSImport("babel-core", "types.thisTypeAnnotation")
    @js.native
    def thisTypeAnnotation(): ThisTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.throwStatement")
    @js.native
    def throwStatement(): ThrowStatement_ = js.native
    @JSImport("babel-core", "types.throwStatement")
    @js.native
    def throwStatement(argument: Expression): ThrowStatement_ = js.native
    
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(): TryStatement_ = js.native
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(block: js.UndefOr[scala.Nothing], handler: js.UndefOr[scala.Nothing], finalizer: BlockStatement_): TryStatement_ = js.native
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(block: js.UndefOr[scala.Nothing], handler: CatchClause_): TryStatement_ = js.native
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(block: js.UndefOr[scala.Nothing], handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(block: BlockStatement_): TryStatement_ = js.native
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(block: BlockStatement_, handler: js.UndefOr[scala.Nothing], finalizer: BlockStatement_): TryStatement_ = js.native
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(block: BlockStatement_, handler: CatchClause_): TryStatement_ = js.native
    @JSImport("babel-core", "types.tryStatement")
    @js.native
    def tryStatement(block: BlockStatement_, handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = js.native
    
    @JSImport("babel-core", "types.tupleTypeAnnotation")
    @js.native
    def tupleTypeAnnotation(): TupleTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.tupleTypeAnnotation")
    @js.native
    def tupleTypeAnnotation(types: js.Array[FlowTypeAnnotation]): TupleTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(): TypeAlias_ = js.native
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(
      id: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      right: FlowTypeAnnotation
    ): TypeAlias_ = js.native
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterDeclaration_): TypeAlias_ = js.native
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(
      id: js.UndefOr[scala.Nothing],
      typeParameters: TypeParameterDeclaration_,
      right: FlowTypeAnnotation
    ): TypeAlias_ = js.native
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(id: Identifier_): TypeAlias_ = js.native
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], right: FlowTypeAnnotation): TypeAlias_ = js.native
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_): TypeAlias_ = js.native
    @JSImport("babel-core", "types.typeAlias")
    @js.native
    def typeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_, right: FlowTypeAnnotation): TypeAlias_ = js.native
    
    @JSImport("babel-core", "types.typeAnnotation")
    @js.native
    def typeAnnotation(): TypeAnnotation_ = js.native
    @JSImport("babel-core", "types.typeAnnotation")
    @js.native
    def typeAnnotation(typeAnnotation: FlowTypeAnnotation): TypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.typeCastExpression")
    @js.native
    def typeCastExpression(): TypeCastExpression_ = js.native
    @JSImport("babel-core", "types.typeCastExpression")
    @js.native
    def typeCastExpression(expression: js.UndefOr[scala.Nothing], typeAnnotation: FlowTypeAnnotation): TypeCastExpression_ = js.native
    @JSImport("babel-core", "types.typeCastExpression")
    @js.native
    def typeCastExpression(expression: Expression): TypeCastExpression_ = js.native
    @JSImport("babel-core", "types.typeCastExpression")
    @js.native
    def typeCastExpression(expression: Expression, typeAnnotation: FlowTypeAnnotation): TypeCastExpression_ = js.native
    
    @JSImport("babel-core", "types.typeParameter")
    @js.native
    def typeParameter(): TypeParameter_ = js.native
    @JSImport("babel-core", "types.typeParameter")
    @js.native
    def typeParameter(bound: js.UndefOr[scala.Nothing], default_ : Flow): TypeParameter_ = js.native
    @JSImport("babel-core", "types.typeParameter")
    @js.native
    def typeParameter(bound: TypeAnnotation_): TypeParameter_ = js.native
    @JSImport("babel-core", "types.typeParameter")
    @js.native
    def typeParameter(bound: TypeAnnotation_, default_ : Flow): TypeParameter_ = js.native
    
    @JSImport("babel-core", "types.typeParameterDeclaration")
    @js.native
    def typeParameterDeclaration(): TypeParameterDeclaration_ = js.native
    @JSImport("babel-core", "types.typeParameterDeclaration")
    @js.native
    def typeParameterDeclaration(params: js.Array[Identifier_]): TypeParameterDeclaration_ = js.native
    
    @JSImport("babel-core", "types.typeParameterInstantiation")
    @js.native
    def typeParameterInstantiation(): TypeParameterInstantiation_ = js.native
    @JSImport("babel-core", "types.typeParameterInstantiation")
    @js.native
    def typeParameterInstantiation(params: js.Array[FlowTypeAnnotation]): TypeParameterInstantiation_ = js.native
    
    @JSImport("babel-core", "types.typeofTypeAnnotation")
    @js.native
    def typeofTypeAnnotation(): TypeofTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.typeofTypeAnnotation")
    @js.native
    def typeofTypeAnnotation(argument: FlowTypeAnnotation): TypeofTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: js.UndefOr[scala.Nothing], argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: js.UndefOr[scala.Nothing], argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: js.UndefOr[scala.Nothing], argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Exclamationmark): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Exclamationmark, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Exclamationmark, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Exclamationmark, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Plussign): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: PlussignPlussign): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: PlussignPlussign, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: PlussignPlussign, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: PlussignPlussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Plussign, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Plussign, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Plussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Tilde): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Tilde, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Tilde, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: Tilde, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `--`): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `--`, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `--`, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `--`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `-_`): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `-_`, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `-_`, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression(operator: `-_`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_delete(operator: delete): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_delete(operator: delete, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_delete(operator: delete, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_delete(operator: delete, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_typeof(operator: typeof): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_typeof(operator: typeof, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_typeof(operator: typeof, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_typeof(operator: typeof, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_void(operator: void): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_void(operator: void, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_void(operator: void, argument: Expression): UnaryExpression_ = js.native
    @JSImport("babel-core", "types.unaryExpression")
    @js.native
    def unaryExpression_void(operator: void, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
    
    @JSImport("babel-core", "types.unionTypeAnnotation")
    @js.native
    def unionTypeAnnotation(): UnionTypeAnnotation_ = js.native
    @JSImport("babel-core", "types.unionTypeAnnotation")
    @js.native
    def unionTypeAnnotation(types: js.Array[FlowTypeAnnotation]): UnionTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: js.UndefOr[scala.Nothing], argument: js.UndefOr[scala.Nothing], prefix: Boolean): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: js.UndefOr[scala.Nothing], argument: Expression): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: js.UndefOr[scala.Nothing], argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: PlussignPlussign): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: PlussignPlussign, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: PlussignPlussign, argument: Expression): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: PlussignPlussign, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: `--`): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: `--`, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: `--`, argument: Expression): UpdateExpression_ = js.native
    @JSImport("babel-core", "types.updateExpression")
    @js.native
    def updateExpression(operator: `--`, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
    
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration(): VariableDeclaration_ = js.native
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration(kind: js.UndefOr[scala.Nothing], declarations: js.Array[VariableDeclarator_]): VariableDeclaration_ = js.native
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration_const(kind: const): VariableDeclaration_ = js.native
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration_const(kind: const, declarations: js.Array[VariableDeclarator_]): VariableDeclaration_ = js.native
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration_let(kind: let): VariableDeclaration_ = js.native
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration_let(kind: let, declarations: js.Array[VariableDeclarator_]): VariableDeclaration_ = js.native
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration_var(kind: `var`): VariableDeclaration_ = js.native
    @JSImport("babel-core", "types.variableDeclaration")
    @js.native
    def variableDeclaration_var(kind: `var`, declarations: js.Array[VariableDeclarator_]): VariableDeclaration_ = js.native
    
    @JSImport("babel-core", "types.variableDeclarator")
    @js.native
    def variableDeclarator(): VariableDeclarator_ = js.native
    @JSImport("babel-core", "types.variableDeclarator")
    @js.native
    def variableDeclarator(id: js.UndefOr[scala.Nothing], init: Expression): VariableDeclarator_ = js.native
    @JSImport("babel-core", "types.variableDeclarator")
    @js.native
    def variableDeclarator(id: LVal): VariableDeclarator_ = js.native
    @JSImport("babel-core", "types.variableDeclarator")
    @js.native
    def variableDeclarator(id: LVal, init: Expression): VariableDeclarator_ = js.native
    
    @JSImport("babel-core", "types.voidTypeAnnotation")
    @js.native
    def voidTypeAnnotation(): VoidTypeAnnotation_ = js.native
    
    @JSImport("babel-core", "types.whileStatement")
    @js.native
    def whileStatement(): WhileStatement_ = js.native
    @JSImport("babel-core", "types.whileStatement")
    @js.native
    def whileStatement(test: js.UndefOr[scala.Nothing], body: BlockStatement_): WhileStatement_ = js.native
    @JSImport("babel-core", "types.whileStatement")
    @js.native
    def whileStatement(test: js.UndefOr[scala.Nothing], body: Statement): WhileStatement_ = js.native
    @JSImport("babel-core", "types.whileStatement")
    @js.native
    def whileStatement(test: Expression): WhileStatement_ = js.native
    @JSImport("babel-core", "types.whileStatement")
    @js.native
    def whileStatement(test: Expression, body: BlockStatement_): WhileStatement_ = js.native
    @JSImport("babel-core", "types.whileStatement")
    @js.native
    def whileStatement(test: Expression, body: Statement): WhileStatement_ = js.native
    
    @JSImport("babel-core", "types.withStatement")
    @js.native
    def withStatement(): WithStatement_ = js.native
    @JSImport("babel-core", "types.withStatement")
    @js.native
    def withStatement(`object`: js.UndefOr[scala.Nothing], body: BlockStatement_): WithStatement_ = js.native
    @JSImport("babel-core", "types.withStatement")
    @js.native
    def withStatement(`object`: js.UndefOr[scala.Nothing], body: Statement): WithStatement_ = js.native
    @JSImport("babel-core", "types.withStatement")
    @js.native
    def withStatement(`object`: Expression): WithStatement_ = js.native
    @JSImport("babel-core", "types.withStatement")
    @js.native
    def withStatement(`object`: Expression, body: BlockStatement_): WithStatement_ = js.native
    @JSImport("babel-core", "types.withStatement")
    @js.native
    def withStatement(`object`: Expression, body: Statement): WithStatement_ = js.native
    
    @JSImport("babel-core", "types.yieldExpression")
    @js.native
    def yieldExpression(): YieldExpression_ = js.native
    @JSImport("babel-core", "types.yieldExpression")
    @js.native
    def yieldExpression(argument: js.UndefOr[scala.Nothing], delegate: Boolean): YieldExpression_ = js.native
    @JSImport("babel-core", "types.yieldExpression")
    @js.native
    def yieldExpression(argument: Expression): YieldExpression_ = js.native
    @JSImport("babel-core", "types.yieldExpression")
    @js.native
    def yieldExpression(argument: Expression, delegate: Boolean): YieldExpression_ = js.native
  }
  
  @JSImport("babel-core", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait BabelFileMetadata extends StObject {
    
    var marked: js.Array[Loc] = js.native
    
    var modules: BabelFileModulesMetadata = js.native
    
    var usedHelpers: js.Array[String] = js.native
  }
  object BabelFileMetadata {
    
    @scala.inline
    def apply(marked: js.Array[Loc], modules: BabelFileModulesMetadata, usedHelpers: js.Array[String]): BabelFileMetadata = {
      val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], usedHelpers = usedHelpers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BabelFileMetadata]
    }
    
    @scala.inline
    implicit class BabelFileMetadataMutableBuilder[Self <: BabelFileMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarked(value: js.Array[Loc]): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkedVarargs(value: Loc*): Self = StObject.set(x, "marked", js.Array(value :_*))
      
      @scala.inline
      def setModules(value: BabelFileModulesMetadata): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedHelpers(value: js.Array[String]): Self = StObject.set(x, "usedHelpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedHelpersVarargs(value: String*): Self = StObject.set(x, "usedHelpers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BabelFileModulesMetadata extends StObject {
    
    var exports: Exported = js.native
    
    var imports: js.Array[js.Object] = js.native
  }
  object BabelFileModulesMetadata {
    
    @scala.inline
    def apply(exports: Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
      __obj.asInstanceOf[BabelFileModulesMetadata]
    }
    
    @scala.inline
    implicit class BabelFileModulesMetadataMutableBuilder[Self <: BabelFileModulesMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: Exported): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImports(value: js.Array[js.Object]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsVarargs(value: js.Object*): Self = StObject.set(x, "imports", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BabelFileResult extends StObject {
    
    var ast: js.UndefOr[Node] = js.native
    
    var code: js.UndefOr[String] = js.native
    
    var ignored: js.UndefOr[Boolean] = js.native
    
    var map: js.UndefOr[js.Object] = js.native
    
    var metadata: js.UndefOr[BabelFileMetadata] = js.native
  }
  object BabelFileResult {
    
    @scala.inline
    def apply(): BabelFileResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelFileResult]
    }
    
    @scala.inline
    implicit class BabelFileResultMutableBuilder[Self <: BabelFileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: Node): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      @scala.inline
      def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMetadata(value: BabelFileMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  type Node = typingsSlinky.babelTypes.ts36Mod.Node
  
  @js.native
  trait PluginObj[S] extends StObject {
    
    var inherits: js.UndefOr[js.Any] = js.native
    
    var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, Unit]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.native
    
    var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.native
    
    var visitor: Visitor[S] = js.native
  }
  object PluginObj {
    
    @scala.inline
    def apply[S](visitor: Visitor[S]): PluginObj[S] = {
      val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginObj[S]]
    }
    
    @scala.inline
    implicit class PluginObjMutableBuilder[Self <: PluginObj[_], S] (val x: Self with PluginObj[S]) extends AnyVal {
      
      @scala.inline
      def setInherits(value: js.Any): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      @scala.inline
      def setManipulateOptions(value: (/* opts */ js.Any, /* parserOpts */ js.Any) => Unit): Self = StObject.set(x, "manipulateOptions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setManipulateOptionsUndefined: Self = StObject.set(x, "manipulateOptions", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPost(value: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPre(value: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setVisitor(value: Visitor[S]): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransformOptions extends StObject {
    
    /** Include the AST in the returned object. Default: `true`. */
    var ast: js.UndefOr[Boolean] = js.native
    
    /** Attach a comment after all non-user injected code. */
    var auxiliaryCommentAfter: js.UndefOr[String] = js.native
    
    /** Attach a comment before all non-user injected code. */
    var auxiliaryCommentBefore: js.UndefOr[String] = js.native
    
    /** Specify whether or not to use `.babelrc` and `.babelignore` files. Default: `true`. */
    var babelrc: js.UndefOr[Boolean] = js.native
    
    /** Enable code generation. Default: `true`. */
    var code: js.UndefOr[Boolean] = js.native
    
    /** write comments to generated output. Default: `true`. */
    var comments: js.UndefOr[Boolean] = js.native
    
    /**
      * Do not include superfluous whitespace characters and line terminators. When set to `"auto"`, `compact` is set to
      * `true` on input sizes of >100KB.
      */
    var compact: js.UndefOr[Boolean | auto] = js.native
    
    /**
      * This is an object of keys that represent different environments. For example, you may have:
      * `{ env: { production: { / * specific options * / } } }`
      * which will use those options when the enviroment variable `BABEL_ENV` is set to `"production"`.
      * If `BABEL_ENV` isn't set then `NODE_ENV` will be used, if it's not set then it defaults to `"development"`.
      */
    var env: js.UndefOr[js.Object] = js.native
    
    /** A path to an .babelrc file to extend. */
    var `extends`: js.UndefOr[String] = js.native
    
    /** Filename to use when reading from stdin - this will be used in source-maps, errors etc. Default: "unknown". */
    var filename: js.UndefOr[String] = js.native
    
    /** Filename relative to `sourceRoot`. */
    var filenameRelative: js.UndefOr[String] = js.native
    
    /** An object containing the options to be passed down to the babel code generator, babel-generator. Default: `{}` */
    var generatorOpts: js.UndefOr[GeneratorOptions] = js.native
    
    /**
      * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`.
      * If falsy value is returned then the generated module id is used.
      */
    var getModuleId: js.UndefOr[js.Function1[/* moduleName */ String, String]] = js.native
    
    /** Enable/disable ANSI syntax highlighting of code frames. Default: `true`. */
    var highlightCode: js.UndefOr[Boolean] = js.native
    
    /** list of glob paths to **not** compile. Opposite to the `only` option. */
    var ignore: js.UndefOr[js.Array[String]] = js.native
    
    /** A source map object that the output source map will be based on. */
    var inputSourceMap: js.UndefOr[js.Object] = js.native
    
    /** Should the output be minified. Default: `false` */
    var minified: js.UndefOr[Boolean] = js.native
    
    /** Specify a custom name for module ids. */
    var moduleId: js.UndefOr[String] = js.native
    
    /**
      * If truthy, insert an explicit id for modules. By default, all modules are anonymous.
      * (Not available for `common` modules).
      */
    var moduleIds: js.UndefOr[Boolean] = js.native
    
    /** Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions. */
    var moduleRoot: js.UndefOr[String] = js.native
    
    /**
      * A glob, regex, or mixed array of both, matching paths to only compile. Can also be an array of arrays containing
      * paths to explicitly match. When attempting to compile a non-matching file it's returned verbatim.
      */
    var only: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
    
    /** Babylon parser options. */
    var parserOpts: js.UndefOr[BabylonOptions] = js.native
    
    /** List of plugins to load and use. */
    var plugins: js.UndefOr[js.Array[_]] = js.native
    
    /** List of presets (a set of plugins) to load and use. */
    var presets: js.UndefOr[js.Array[_]] = js.native
    
    /** Resolve a module source ie. import "SOURCE"; to a custom value. */
    var resolveModuleSource: js.UndefOr[js.Function2[/* source */ String, /* filename */ String, String]] = js.native
    
    /** Retain line numbers - will result in really ugly code. Default: `false` */
    var retainLines: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional callback that controls whether a comment should be output or not. Called as
      * `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comments` option when used.
      */
    var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.native
    
    /** Set `sources[0]` on returned source map. */
    var sourceFileName: js.UndefOr[String] = js.native
    
    /** Set `file` on returned source map. */
    var sourceMapTarget: js.UndefOr[String] = js.native
    
    /**
      * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a `sourceMappingURL`
      * directive is added to the bottom of the returned code. If set to `"both"` then a map property is returned as well
      * as a source map comment appended.
      */
    var sourceMaps: js.UndefOr[Boolean | `inline` | both] = js.native
    
    /** The root from which all sources are relative. */
    var sourceRoot: js.UndefOr[String] = js.native
    
    /** Indicate the mode the code should be parsed in. Can be either “script” or “module”. Default: "module" */
    var sourceType: js.UndefOr[script | module] = js.native
    
    /**
      * An optional callback that can be used to wrap visitor methods.
      * NOTE: This is useful for things like introspection, and not really needed for implementing anything.
      */
    var wrapPluginVisitorMethod: js.UndefOr[
        js.Function3[
          /* pluginAlias */ String, 
          /* visitorType */ enter | exit, 
          /* callback */ js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ js.Any, Unit], 
          js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ _, Unit]
        ]
      ] = js.native
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      @scala.inline
      def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      @scala.inline
      def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      @scala.inline
      def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setGeneratorOpts(value: GeneratorOptions): Self = StObject.set(x, "generatorOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorOptsUndefined: Self = StObject.set(x, "generatorOpts", js.undefined)
      
      @scala.inline
      def setGetModuleId(value: /* moduleName */ String => String): Self = StObject.set(x, "getModuleId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
      
      @scala.inline
      def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInputSourceMap(value: js.Object): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      @scala.inline
      def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
      
      @scala.inline
      def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
      
      @scala.inline
      def setModuleIds(value: Boolean): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
      
      @scala.inline
      def setModuleRoot(value: String): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
      
      @scala.inline
      def setOnly(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyRegExp(value: js.RegExp): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setOnlyVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      @scala.inline
      def setParserOpts(value: BabylonOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPresets(value: js.Array[_]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: js.Any*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setResolveModuleSource(value: (/* source */ String, /* filename */ String) => String): Self = StObject.set(x, "resolveModuleSource", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveModuleSourceUndefined: Self = StObject.set(x, "resolveModuleSource", js.undefined)
      
      @scala.inline
      def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      @scala.inline
      def setShouldPrintComment(value: /* comment */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      @scala.inline
      def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      @scala.inline
      def setSourceMapTarget(value: String): Self = StObject.set(x, "sourceMapTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapTargetUndefined: Self = StObject.set(x, "sourceMapTarget", js.undefined)
      
      @scala.inline
      def setSourceMaps(value: Boolean | `inline` | both): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      @scala.inline
      def setWrapPluginVisitorMethod(
        value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ js.Any, Unit]) => js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ _, Unit]
      ): Self = StObject.set(x, "wrapPluginVisitorMethod", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWrapPluginVisitorMethodUndefined: Self = StObject.set(x, "wrapPluginVisitorMethod", js.undefined)
    }
  }
}
