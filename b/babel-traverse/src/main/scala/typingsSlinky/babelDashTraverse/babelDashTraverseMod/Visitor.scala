package typingsSlinky.babelDashTraverse.babelDashTraverseMod

import typingsSlinky.babelDashTypes.babelDashTypesMod.AnyTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.ArrayExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.ArrayPattern
import typingsSlinky.babelDashTypes.babelDashTypesMod.ArrayTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.ArrowFunctionExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.AssignmentExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.AssignmentPattern
import typingsSlinky.babelDashTypes.babelDashTypesMod.AwaitExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.Binary
import typingsSlinky.babelDashTypes.babelDashTypesMod.BinaryExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.BindExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.Block
import typingsSlinky.babelDashTypes.babelDashTypesMod.BlockParent
import typingsSlinky.babelDashTypes.babelDashTypesMod.BlockStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.BooleanLiteral
import typingsSlinky.babelDashTypes.babelDashTypesMod.BooleanLiteralTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.BooleanTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.BreakStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.CallExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.CatchClause
import typingsSlinky.babelDashTypes.babelDashTypesMod.Class
import typingsSlinky.babelDashTypes.babelDashTypesMod.ClassBody
import typingsSlinky.babelDashTypes.babelDashTypesMod.ClassDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.ClassExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.ClassImplements
import typingsSlinky.babelDashTypes.babelDashTypesMod.ClassMethod
import typingsSlinky.babelDashTypes.babelDashTypesMod.ClassProperty
import typingsSlinky.babelDashTypes.babelDashTypesMod.CompletionStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.Conditional
import typingsSlinky.babelDashTypes.babelDashTypesMod.ConditionalExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.ContinueStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.DebuggerStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.Declaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareClass
import typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareFunction
import typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareInterface
import typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareModule
import typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareTypeAlias
import typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareVariable
import typingsSlinky.babelDashTypes.babelDashTypesMod.Decorator
import typingsSlinky.babelDashTypes.babelDashTypesMod.Directive
import typingsSlinky.babelDashTypes.babelDashTypesMod.DirectiveLiteral
import typingsSlinky.babelDashTypes.babelDashTypesMod.DoExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.DoWhileStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.EmptyStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExistentialTypeParam
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExportAllDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExportDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExportDefaultDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExportDefaultSpecifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExportNamedDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExportNamespaceSpecifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExportSpecifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.Expression
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExpressionStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.ExpressionWrapper
import typingsSlinky.babelDashTypes.babelDashTypesMod.File
import typingsSlinky.babelDashTypes.babelDashTypesMod.Flow
import typingsSlinky.babelDashTypes.babelDashTypesMod.FlowBaseAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.FlowDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.For
import typingsSlinky.babelDashTypes.babelDashTypesMod.ForInStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.ForOfStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.ForStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.ForXStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.Function
import typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionParent
import typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionTypeParam
import typingsSlinky.babelDashTypes.babelDashTypesMod.GenericTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.Identifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.IfStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.Immutable
import typingsSlinky.babelDashTypes.babelDashTypesMod.ImportDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.ImportDefaultSpecifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.ImportNamespaceSpecifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.ImportSpecifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.InterfaceDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.InterfaceExtends
import typingsSlinky.babelDashTypes.babelDashTypesMod.IntersectionTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSX
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXAttribute
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXClosingElement
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXElement
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXEmptyExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXExpressionContainer
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXIdentifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXMemberExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXNamespacedName
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXOpeningElement
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXSpreadAttribute
import typingsSlinky.babelDashTypes.babelDashTypesMod.JSXText
import typingsSlinky.babelDashTypes.babelDashTypesMod.LVal
import typingsSlinky.babelDashTypes.babelDashTypesMod.LabeledStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.Literal
import typingsSlinky.babelDashTypes.babelDashTypesMod.LogicalExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.Loop
import typingsSlinky.babelDashTypes.babelDashTypesMod.MemberExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.MetaProperty
import typingsSlinky.babelDashTypes.babelDashTypesMod.Method
import typingsSlinky.babelDashTypes.babelDashTypesMod.MixedTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.ModuleDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.ModuleSpecifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.NewExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.Noop
import typingsSlinky.babelDashTypes.babelDashTypesMod.NullLiteral
import typingsSlinky.babelDashTypes.babelDashTypesMod.NullLiteralTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.NullableTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.NumberTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.NumericLiteral
import typingsSlinky.babelDashTypes.babelDashTypesMod.NumericLiteralTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectMember
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectMethod
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectPattern
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectProperty
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeCallProperty
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeIndexer
import typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeProperty
import typingsSlinky.babelDashTypes.babelDashTypesMod.ParenthesizedExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.Pattern
import typingsSlinky.babelDashTypes.babelDashTypesMod.Program
import typingsSlinky.babelDashTypes.babelDashTypesMod.Property
import typingsSlinky.babelDashTypes.babelDashTypesMod.Pureish
import typingsSlinky.babelDashTypes.babelDashTypesMod.QualifiedTypeIdentifier
import typingsSlinky.babelDashTypes.babelDashTypesMod.RegExpLiteral
import typingsSlinky.babelDashTypes.babelDashTypesMod.RestElement
import typingsSlinky.babelDashTypes.babelDashTypesMod.RestProperty
import typingsSlinky.babelDashTypes.babelDashTypesMod.ReturnStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.Scopable
import typingsSlinky.babelDashTypes.babelDashTypesMod.SequenceExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.SpreadElement
import typingsSlinky.babelDashTypes.babelDashTypesMod.SpreadProperty
import typingsSlinky.babelDashTypes.babelDashTypesMod.Statement
import typingsSlinky.babelDashTypes.babelDashTypesMod.StringLiteral
import typingsSlinky.babelDashTypes.babelDashTypesMod.StringLiteralTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.StringTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.Super
import typingsSlinky.babelDashTypes.babelDashTypesMod.SwitchCase
import typingsSlinky.babelDashTypes.babelDashTypesMod.SwitchStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.TaggedTemplateExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.TemplateElement
import typingsSlinky.babelDashTypes.babelDashTypesMod.TemplateLiteral
import typingsSlinky.babelDashTypes.babelDashTypesMod.Terminatorless
import typingsSlinky.babelDashTypes.babelDashTypesMod.ThisExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.ThisTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.ThrowStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.TryStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.TupleTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.TypeAlias
import typingsSlinky.babelDashTypes.babelDashTypesMod.TypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.TypeCastExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.TypeParameterDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.TypeParameterInstantiation
import typingsSlinky.babelDashTypes.babelDashTypesMod.TypeofTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.UnaryExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.UnaryLike
import typingsSlinky.babelDashTypes.babelDashTypesMod.UnionTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.UpdateExpression
import typingsSlinky.babelDashTypes.babelDashTypesMod.UserWhitespacable
import typingsSlinky.babelDashTypes.babelDashTypesMod.VariableDeclaration
import typingsSlinky.babelDashTypes.babelDashTypesMod.VariableDeclarator
import typingsSlinky.babelDashTypes.babelDashTypesMod.VoidTypeAnnotation
import typingsSlinky.babelDashTypes.babelDashTypesMod.While
import typingsSlinky.babelDashTypes.babelDashTypesMod.WhileStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.WithStatement
import typingsSlinky.babelDashTypes.babelDashTypesMod.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[S] extends VisitNodeObject[Node] {
  var AnyTypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.AnyTypeAnnotation]] = js.undefined
  var ArrayExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ArrayExpression]] = js.undefined
  var ArrayPattern: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ArrayPattern]] = js.undefined
  var ArrayTypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ArrayTypeAnnotation]] = js.undefined
  var ArrowFunctionExpression: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ArrowFunctionExpression]
  ] = js.undefined
  var AssignmentExpression: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.AssignmentExpression]
  ] = js.undefined
  var AssignmentPattern: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.AssignmentPattern]] = js.undefined
  var AwaitExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.AwaitExpression]] = js.undefined
  var Binary: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Binary]] = js.undefined
  var BinaryExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BinaryExpression]] = js.undefined
  var BindExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BindExpression]] = js.undefined
  var Block: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Block]] = js.undefined
  var BlockParent: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BlockParent]] = js.undefined
  var BlockStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BlockStatement]] = js.undefined
  var BooleanLiteral: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BooleanLiteral]] = js.undefined
  var BooleanLiteralTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BooleanLiteralTypeAnnotation]
  ] = js.undefined
  var BooleanTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BooleanTypeAnnotation]
  ] = js.undefined
  var BreakStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.BreakStatement]] = js.undefined
  var CallExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.CallExpression]] = js.undefined
  var CatchClause: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.CatchClause]] = js.undefined
  var Class: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Class]] = js.undefined
  var ClassBody: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ClassBody]] = js.undefined
  var ClassDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ClassDeclaration]] = js.undefined
  var ClassExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ClassExpression]] = js.undefined
  var ClassImplements: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ClassImplements]] = js.undefined
  var ClassMethod: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ClassMethod]] = js.undefined
  var ClassProperty: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ClassProperty]] = js.undefined
  var CompletionStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.CompletionStatement]] = js.undefined
  var Conditional: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Conditional]] = js.undefined
  var ConditionalExpression: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ConditionalExpression]
  ] = js.undefined
  var ContinueStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ContinueStatement]] = js.undefined
  var DebuggerStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DebuggerStatement]] = js.undefined
  var Declaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Declaration]] = js.undefined
  var DeclareClass: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareClass]] = js.undefined
  var DeclareFunction: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareFunction]] = js.undefined
  var DeclareInterface: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareInterface]] = js.undefined
  var DeclareModule: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareModule]] = js.undefined
  var DeclareTypeAlias: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareTypeAlias]] = js.undefined
  var DeclareVariable: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DeclareVariable]] = js.undefined
  var Decorator: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Decorator]] = js.undefined
  var Directive: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Directive]] = js.undefined
  var DirectiveLiteral: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DirectiveLiteral]] = js.undefined
  var DoExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DoExpression]] = js.undefined
  var DoWhileStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.DoWhileStatement]] = js.undefined
  var EmptyStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.EmptyStatement]] = js.undefined
  var ExistentialTypeParam: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExistentialTypeParam]
  ] = js.undefined
  var ExportAllDeclaration: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExportAllDeclaration]
  ] = js.undefined
  var ExportDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExportDeclaration]] = js.undefined
  var ExportDefaultDeclaration: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExportDefaultDeclaration]
  ] = js.undefined
  var ExportDefaultSpecifier: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExportDefaultSpecifier]
  ] = js.undefined
  var ExportNamedDeclaration: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExportNamedDeclaration]
  ] = js.undefined
  var ExportNamespaceSpecifier: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExportNamespaceSpecifier]
  ] = js.undefined
  var ExportSpecifier: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExportSpecifier]] = js.undefined
  var Expression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Expression]] = js.undefined
  var ExpressionStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExpressionStatement]] = js.undefined
  var ExpressionWrapper: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ExpressionWrapper]] = js.undefined
  var File: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.File]] = js.undefined
  var Flow: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Flow]] = js.undefined
  var FlowBaseAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.FlowBaseAnnotation]] = js.undefined
  var FlowDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.FlowDeclaration]] = js.undefined
  var For: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.For]] = js.undefined
  var ForInStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ForInStatement]] = js.undefined
  var ForOfStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ForOfStatement]] = js.undefined
  var ForStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ForStatement]] = js.undefined
  var ForXStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ForXStatement]] = js.undefined
  var Function: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Function]] = js.undefined
  var FunctionDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionDeclaration]] = js.undefined
  var FunctionExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionExpression]] = js.undefined
  var FunctionParent: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionParent]] = js.undefined
  var FunctionTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionTypeAnnotation]
  ] = js.undefined
  var FunctionTypeParam: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.FunctionTypeParam]] = js.undefined
  var GenericTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.GenericTypeAnnotation]
  ] = js.undefined
  var Identifier: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Identifier]] = js.undefined
  var IfStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.IfStatement]] = js.undefined
  var Immutable: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Immutable]] = js.undefined
  var ImportDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ImportDeclaration]] = js.undefined
  var ImportDefaultSpecifier: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ImportDefaultSpecifier]
  ] = js.undefined
  var ImportNamespaceSpecifier: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ImportNamespaceSpecifier]
  ] = js.undefined
  var ImportSpecifier: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ImportSpecifier]] = js.undefined
  var InterfaceDeclaration: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.InterfaceDeclaration]
  ] = js.undefined
  var InterfaceExtends: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.InterfaceExtends]] = js.undefined
  var IntersectionTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.IntersectionTypeAnnotation]
  ] = js.undefined
  var JSX: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSX]] = js.undefined
  var JSXAttribute: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXAttribute]] = js.undefined
  var JSXClosingElement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXClosingElement]] = js.undefined
  var JSXElement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXElement]] = js.undefined
  var JSXEmptyExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXEmptyExpression]] = js.undefined
  var JSXExpressionContainer: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXExpressionContainer]
  ] = js.undefined
  var JSXIdentifier: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXIdentifier]] = js.undefined
  var JSXMemberExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXMemberExpression]] = js.undefined
  var JSXNamespacedName: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXNamespacedName]] = js.undefined
  var JSXOpeningElement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXOpeningElement]] = js.undefined
  var JSXSpreadAttribute: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXSpreadAttribute]] = js.undefined
  var JSXText: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.JSXText]] = js.undefined
  var LVal: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.LVal]] = js.undefined
  var LabeledStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.LabeledStatement]] = js.undefined
  var Literal: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Literal]] = js.undefined
  var LogicalExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.LogicalExpression]] = js.undefined
  var Loop: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Loop]] = js.undefined
  var MemberExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.MemberExpression]] = js.undefined
  var MetaProperty: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.MetaProperty]] = js.undefined
  var Method: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Method]] = js.undefined
  var MixedTypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.MixedTypeAnnotation]] = js.undefined
  var ModuleDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ModuleDeclaration]] = js.undefined
  var ModuleSpecifier: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ModuleSpecifier]] = js.undefined
  var NewExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.NewExpression]] = js.undefined
  var Noop: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Noop]] = js.undefined
  var NullLiteral: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.NullLiteral]] = js.undefined
  var NullLiteralTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.NullLiteralTypeAnnotation]
  ] = js.undefined
  var NullableTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.NullableTypeAnnotation]
  ] = js.undefined
  var NumberTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.NumberTypeAnnotation]
  ] = js.undefined
  var NumericLiteral: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.NumericLiteral]] = js.undefined
  var NumericLiteralTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.NumericLiteralTypeAnnotation]
  ] = js.undefined
  var ObjectExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectExpression]] = js.undefined
  var ObjectMember: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectMember]] = js.undefined
  var ObjectMethod: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectMethod]] = js.undefined
  var ObjectPattern: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectPattern]] = js.undefined
  var ObjectProperty: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectProperty]] = js.undefined
  var ObjectTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeAnnotation]
  ] = js.undefined
  var ObjectTypeCallProperty: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeCallProperty]
  ] = js.undefined
  var ObjectTypeIndexer: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeIndexer]] = js.undefined
  var ObjectTypeProperty: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ObjectTypeProperty]] = js.undefined
  var ParenthesizedExpression: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ParenthesizedExpression]
  ] = js.undefined
  var Pattern: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Pattern]] = js.undefined
  var Program: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Program]] = js.undefined
  var Property: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Property]] = js.undefined
  var Pureish: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Pureish]] = js.undefined
  var QualifiedTypeIdentifier: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.QualifiedTypeIdentifier]
  ] = js.undefined
  var RegExpLiteral: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.RegExpLiteral]] = js.undefined
  var RestElement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.RestElement]] = js.undefined
  var RestProperty: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.RestProperty]] = js.undefined
  var ReturnStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ReturnStatement]] = js.undefined
  var Scopable: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Scopable]] = js.undefined
  var Scope: js.UndefOr[VisitNode[S, Scopable]] = js.undefined
  var SequenceExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.SequenceExpression]] = js.undefined
  var SpreadElement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.SpreadElement]] = js.undefined
  var SpreadProperty: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.SpreadProperty]] = js.undefined
  var Statement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Statement]] = js.undefined
  var StringLiteral: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.StringLiteral]] = js.undefined
  var StringLiteralTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.StringLiteralTypeAnnotation]
  ] = js.undefined
  var StringTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.StringTypeAnnotation]
  ] = js.undefined
  var Super: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Super]] = js.undefined
  var SwitchCase: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.SwitchCase]] = js.undefined
  var SwitchStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.SwitchStatement]] = js.undefined
  var TaggedTemplateExpression: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TaggedTemplateExpression]
  ] = js.undefined
  var TemplateElement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TemplateElement]] = js.undefined
  var TemplateLiteral: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TemplateLiteral]] = js.undefined
  var Terminatorless: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.Terminatorless]] = js.undefined
  var ThisExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ThisExpression]] = js.undefined
  var ThisTypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ThisTypeAnnotation]] = js.undefined
  var ThrowStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.ThrowStatement]] = js.undefined
  var TryStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TryStatement]] = js.undefined
  var TupleTypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TupleTypeAnnotation]] = js.undefined
  var TypeAlias: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TypeAlias]] = js.undefined
  var TypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TypeAnnotation]] = js.undefined
  var TypeCastExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TypeCastExpression]] = js.undefined
  var TypeParameterDeclaration: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TypeParameterDeclaration]
  ] = js.undefined
  var TypeParameterInstantiation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TypeParameterInstantiation]
  ] = js.undefined
  var TypeofTypeAnnotation: js.UndefOr[
    VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.TypeofTypeAnnotation]
  ] = js.undefined
  var UnaryExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.UnaryExpression]] = js.undefined
  var UnaryLike: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.UnaryLike]] = js.undefined
  var UnionTypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.UnionTypeAnnotation]] = js.undefined
  var UpdateExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.UpdateExpression]] = js.undefined
  var UserWhitespacable: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.UserWhitespacable]] = js.undefined
  var VariableDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.VariableDeclaration]] = js.undefined
  var VariableDeclarator: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.VariableDeclarator]] = js.undefined
  var VoidTypeAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.VoidTypeAnnotation]] = js.undefined
  var While: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.While]] = js.undefined
  var WhileStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.WhileStatement]] = js.undefined
  var WithStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.WithStatement]] = js.undefined
  var YieldExpression: js.UndefOr[VisitNode[S, typingsSlinky.babelDashTypes.babelDashTypesMod.YieldExpression]] = js.undefined
}

object Visitor {
  @scala.inline
  def apply[S](
    AnyTypeAnnotation: VisitNode[S, AnyTypeAnnotation] = null,
    ArrayExpression: VisitNode[S, ArrayExpression] = null,
    ArrayPattern: VisitNode[S, ArrayPattern] = null,
    ArrayTypeAnnotation: VisitNode[S, ArrayTypeAnnotation] = null,
    ArrowFunctionExpression: VisitNode[S, ArrowFunctionExpression] = null,
    AssignmentExpression: VisitNode[S, AssignmentExpression] = null,
    AssignmentPattern: VisitNode[S, AssignmentPattern] = null,
    AwaitExpression: VisitNode[S, AwaitExpression] = null,
    Binary: VisitNode[S, Binary] = null,
    BinaryExpression: VisitNode[S, BinaryExpression] = null,
    BindExpression: VisitNode[S, BindExpression] = null,
    Block: VisitNode[S, Block] = null,
    BlockParent: VisitNode[S, BlockParent] = null,
    BlockStatement: VisitNode[S, BlockStatement] = null,
    BooleanLiteral: VisitNode[S, BooleanLiteral] = null,
    BooleanLiteralTypeAnnotation: VisitNode[S, BooleanLiteralTypeAnnotation] = null,
    BooleanTypeAnnotation: VisitNode[S, BooleanTypeAnnotation] = null,
    BreakStatement: VisitNode[S, BreakStatement] = null,
    CallExpression: VisitNode[S, CallExpression] = null,
    CatchClause: VisitNode[S, CatchClause] = null,
    Class: VisitNode[S, Class] = null,
    ClassBody: VisitNode[S, ClassBody] = null,
    ClassDeclaration: VisitNode[S, ClassDeclaration] = null,
    ClassExpression: VisitNode[S, ClassExpression] = null,
    ClassImplements: VisitNode[S, ClassImplements] = null,
    ClassMethod: VisitNode[S, ClassMethod] = null,
    ClassProperty: VisitNode[S, ClassProperty] = null,
    CompletionStatement: VisitNode[S, CompletionStatement] = null,
    Conditional: VisitNode[S, Conditional] = null,
    ConditionalExpression: VisitNode[S, ConditionalExpression] = null,
    ContinueStatement: VisitNode[S, ContinueStatement] = null,
    DebuggerStatement: VisitNode[S, DebuggerStatement] = null,
    Declaration: VisitNode[S, Declaration] = null,
    DeclareClass: VisitNode[S, DeclareClass] = null,
    DeclareFunction: VisitNode[S, DeclareFunction] = null,
    DeclareInterface: VisitNode[S, DeclareInterface] = null,
    DeclareModule: VisitNode[S, DeclareModule] = null,
    DeclareTypeAlias: VisitNode[S, DeclareTypeAlias] = null,
    DeclareVariable: VisitNode[S, DeclareVariable] = null,
    Decorator: VisitNode[S, Decorator] = null,
    Directive: VisitNode[S, Directive] = null,
    DirectiveLiteral: VisitNode[S, DirectiveLiteral] = null,
    DoExpression: VisitNode[S, DoExpression] = null,
    DoWhileStatement: VisitNode[S, DoWhileStatement] = null,
    EmptyStatement: VisitNode[S, EmptyStatement] = null,
    ExistentialTypeParam: VisitNode[S, ExistentialTypeParam] = null,
    ExportAllDeclaration: VisitNode[S, ExportAllDeclaration] = null,
    ExportDeclaration: VisitNode[S, ExportDeclaration] = null,
    ExportDefaultDeclaration: VisitNode[S, ExportDefaultDeclaration] = null,
    ExportDefaultSpecifier: VisitNode[S, ExportDefaultSpecifier] = null,
    ExportNamedDeclaration: VisitNode[S, ExportNamedDeclaration] = null,
    ExportNamespaceSpecifier: VisitNode[S, ExportNamespaceSpecifier] = null,
    ExportSpecifier: VisitNode[S, ExportSpecifier] = null,
    Expression: VisitNode[S, Expression] = null,
    ExpressionStatement: VisitNode[S, ExpressionStatement] = null,
    ExpressionWrapper: VisitNode[S, ExpressionWrapper] = null,
    File: VisitNode[S, File] = null,
    Flow: VisitNode[S, Flow] = null,
    FlowBaseAnnotation: VisitNode[S, FlowBaseAnnotation] = null,
    FlowDeclaration: VisitNode[S, FlowDeclaration] = null,
    For: VisitNode[S, For] = null,
    ForInStatement: VisitNode[S, ForInStatement] = null,
    ForOfStatement: VisitNode[S, ForOfStatement] = null,
    ForStatement: VisitNode[S, ForStatement] = null,
    ForXStatement: VisitNode[S, ForXStatement] = null,
    Function: VisitNode[S, Function] = null,
    FunctionDeclaration: VisitNode[S, FunctionDeclaration] = null,
    FunctionExpression: VisitNode[S, FunctionExpression] = null,
    FunctionParent: VisitNode[S, FunctionParent] = null,
    FunctionTypeAnnotation: VisitNode[S, FunctionTypeAnnotation] = null,
    FunctionTypeParam: VisitNode[S, FunctionTypeParam] = null,
    GenericTypeAnnotation: VisitNode[S, GenericTypeAnnotation] = null,
    Identifier: VisitNode[S, Identifier] = null,
    IfStatement: VisitNode[S, IfStatement] = null,
    Immutable: VisitNode[S, Immutable] = null,
    ImportDeclaration: VisitNode[S, ImportDeclaration] = null,
    ImportDefaultSpecifier: VisitNode[S, ImportDefaultSpecifier] = null,
    ImportNamespaceSpecifier: VisitNode[S, ImportNamespaceSpecifier] = null,
    ImportSpecifier: VisitNode[S, ImportSpecifier] = null,
    InterfaceDeclaration: VisitNode[S, InterfaceDeclaration] = null,
    InterfaceExtends: VisitNode[S, InterfaceExtends] = null,
    IntersectionTypeAnnotation: VisitNode[S, IntersectionTypeAnnotation] = null,
    JSX: VisitNode[S, JSX] = null,
    JSXAttribute: VisitNode[S, JSXAttribute] = null,
    JSXClosingElement: VisitNode[S, JSXClosingElement] = null,
    JSXElement: VisitNode[S, JSXElement] = null,
    JSXEmptyExpression: VisitNode[S, JSXEmptyExpression] = null,
    JSXExpressionContainer: VisitNode[S, JSXExpressionContainer] = null,
    JSXIdentifier: VisitNode[S, JSXIdentifier] = null,
    JSXMemberExpression: VisitNode[S, JSXMemberExpression] = null,
    JSXNamespacedName: VisitNode[S, JSXNamespacedName] = null,
    JSXOpeningElement: VisitNode[S, JSXOpeningElement] = null,
    JSXSpreadAttribute: VisitNode[S, JSXSpreadAttribute] = null,
    JSXText: VisitNode[S, JSXText] = null,
    LVal: VisitNode[S, LVal] = null,
    LabeledStatement: VisitNode[S, LabeledStatement] = null,
    Literal: VisitNode[S, Literal] = null,
    LogicalExpression: VisitNode[S, LogicalExpression] = null,
    Loop: VisitNode[S, Loop] = null,
    MemberExpression: VisitNode[S, MemberExpression] = null,
    MetaProperty: VisitNode[S, MetaProperty] = null,
    Method: VisitNode[S, Method] = null,
    MixedTypeAnnotation: VisitNode[S, MixedTypeAnnotation] = null,
    ModuleDeclaration: VisitNode[S, ModuleDeclaration] = null,
    ModuleSpecifier: VisitNode[S, ModuleSpecifier] = null,
    NewExpression: VisitNode[S, NewExpression] = null,
    Noop: VisitNode[S, Noop] = null,
    NullLiteral: VisitNode[S, NullLiteral] = null,
    NullLiteralTypeAnnotation: VisitNode[S, NullLiteralTypeAnnotation] = null,
    NullableTypeAnnotation: VisitNode[S, NullableTypeAnnotation] = null,
    NumberTypeAnnotation: VisitNode[S, NumberTypeAnnotation] = null,
    NumericLiteral: VisitNode[S, NumericLiteral] = null,
    NumericLiteralTypeAnnotation: VisitNode[S, NumericLiteralTypeAnnotation] = null,
    ObjectExpression: VisitNode[S, ObjectExpression] = null,
    ObjectMember: VisitNode[S, ObjectMember] = null,
    ObjectMethod: VisitNode[S, ObjectMethod] = null,
    ObjectPattern: VisitNode[S, ObjectPattern] = null,
    ObjectProperty: VisitNode[S, ObjectProperty] = null,
    ObjectTypeAnnotation: VisitNode[S, ObjectTypeAnnotation] = null,
    ObjectTypeCallProperty: VisitNode[S, ObjectTypeCallProperty] = null,
    ObjectTypeIndexer: VisitNode[S, ObjectTypeIndexer] = null,
    ObjectTypeProperty: VisitNode[S, ObjectTypeProperty] = null,
    ParenthesizedExpression: VisitNode[S, ParenthesizedExpression] = null,
    Pattern: VisitNode[S, Pattern] = null,
    Program: VisitNode[S, Program] = null,
    Property: VisitNode[S, Property] = null,
    Pureish: VisitNode[S, Pureish] = null,
    QualifiedTypeIdentifier: VisitNode[S, QualifiedTypeIdentifier] = null,
    RegExpLiteral: VisitNode[S, RegExpLiteral] = null,
    RestElement: VisitNode[S, RestElement] = null,
    RestProperty: VisitNode[S, RestProperty] = null,
    ReturnStatement: VisitNode[S, ReturnStatement] = null,
    Scopable: VisitNode[S, Scopable] = null,
    Scope: VisitNode[S, Scopable] = null,
    SequenceExpression: VisitNode[S, SequenceExpression] = null,
    SpreadElement: VisitNode[S, SpreadElement] = null,
    SpreadProperty: VisitNode[S, SpreadProperty] = null,
    Statement: VisitNode[S, Statement] = null,
    StringLiteral: VisitNode[S, StringLiteral] = null,
    StringLiteralTypeAnnotation: VisitNode[S, StringLiteralTypeAnnotation] = null,
    StringTypeAnnotation: VisitNode[S, StringTypeAnnotation] = null,
    Super: VisitNode[S, Super] = null,
    SwitchCase: VisitNode[S, SwitchCase] = null,
    SwitchStatement: VisitNode[S, SwitchStatement] = null,
    TaggedTemplateExpression: VisitNode[S, TaggedTemplateExpression] = null,
    TemplateElement: VisitNode[S, TemplateElement] = null,
    TemplateLiteral: VisitNode[S, TemplateLiteral] = null,
    Terminatorless: VisitNode[S, Terminatorless] = null,
    ThisExpression: VisitNode[S, ThisExpression] = null,
    ThisTypeAnnotation: VisitNode[S, ThisTypeAnnotation] = null,
    ThrowStatement: VisitNode[S, ThrowStatement] = null,
    TryStatement: VisitNode[S, TryStatement] = null,
    TupleTypeAnnotation: VisitNode[S, TupleTypeAnnotation] = null,
    TypeAlias: VisitNode[S, TypeAlias] = null,
    TypeAnnotation: VisitNode[S, TypeAnnotation] = null,
    TypeCastExpression: VisitNode[S, TypeCastExpression] = null,
    TypeParameterDeclaration: VisitNode[S, TypeParameterDeclaration] = null,
    TypeParameterInstantiation: VisitNode[S, TypeParameterInstantiation] = null,
    TypeofTypeAnnotation: VisitNode[S, TypeofTypeAnnotation] = null,
    UnaryExpression: VisitNode[S, UnaryExpression] = null,
    UnaryLike: VisitNode[S, UnaryLike] = null,
    UnionTypeAnnotation: VisitNode[S, UnionTypeAnnotation] = null,
    UpdateExpression: VisitNode[S, UpdateExpression] = null,
    UserWhitespacable: VisitNode[S, UserWhitespacable] = null,
    VariableDeclaration: VisitNode[S, VariableDeclaration] = null,
    VariableDeclarator: VisitNode[S, VariableDeclarator] = null,
    VoidTypeAnnotation: VisitNode[S, VoidTypeAnnotation] = null,
    While: VisitNode[S, While] = null,
    WhileStatement: VisitNode[S, WhileStatement] = null,
    WithStatement: VisitNode[S, WithStatement] = null,
    YieldExpression: VisitNode[S, YieldExpression] = null,
    enter: (/* path */ NodePath[Node], /* state */ js.Any) => Unit = null,
    exit: (/* path */ NodePath[Node], /* state */ js.Any) => Unit = null
  ): Visitor[S] = {
    val __obj = js.Dynamic.literal()
    if (AnyTypeAnnotation != null) __obj.updateDynamic("AnyTypeAnnotation")(AnyTypeAnnotation.asInstanceOf[js.Any])
    if (ArrayExpression != null) __obj.updateDynamic("ArrayExpression")(ArrayExpression.asInstanceOf[js.Any])
    if (ArrayPattern != null) __obj.updateDynamic("ArrayPattern")(ArrayPattern.asInstanceOf[js.Any])
    if (ArrayTypeAnnotation != null) __obj.updateDynamic("ArrayTypeAnnotation")(ArrayTypeAnnotation.asInstanceOf[js.Any])
    if (ArrowFunctionExpression != null) __obj.updateDynamic("ArrowFunctionExpression")(ArrowFunctionExpression.asInstanceOf[js.Any])
    if (AssignmentExpression != null) __obj.updateDynamic("AssignmentExpression")(AssignmentExpression.asInstanceOf[js.Any])
    if (AssignmentPattern != null) __obj.updateDynamic("AssignmentPattern")(AssignmentPattern.asInstanceOf[js.Any])
    if (AwaitExpression != null) __obj.updateDynamic("AwaitExpression")(AwaitExpression.asInstanceOf[js.Any])
    if (Binary != null) __obj.updateDynamic("Binary")(Binary.asInstanceOf[js.Any])
    if (BinaryExpression != null) __obj.updateDynamic("BinaryExpression")(BinaryExpression.asInstanceOf[js.Any])
    if (BindExpression != null) __obj.updateDynamic("BindExpression")(BindExpression.asInstanceOf[js.Any])
    if (Block != null) __obj.updateDynamic("Block")(Block.asInstanceOf[js.Any])
    if (BlockParent != null) __obj.updateDynamic("BlockParent")(BlockParent.asInstanceOf[js.Any])
    if (BlockStatement != null) __obj.updateDynamic("BlockStatement")(BlockStatement.asInstanceOf[js.Any])
    if (BooleanLiteral != null) __obj.updateDynamic("BooleanLiteral")(BooleanLiteral.asInstanceOf[js.Any])
    if (BooleanLiteralTypeAnnotation != null) __obj.updateDynamic("BooleanLiteralTypeAnnotation")(BooleanLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (BooleanTypeAnnotation != null) __obj.updateDynamic("BooleanTypeAnnotation")(BooleanTypeAnnotation.asInstanceOf[js.Any])
    if (BreakStatement != null) __obj.updateDynamic("BreakStatement")(BreakStatement.asInstanceOf[js.Any])
    if (CallExpression != null) __obj.updateDynamic("CallExpression")(CallExpression.asInstanceOf[js.Any])
    if (CatchClause != null) __obj.updateDynamic("CatchClause")(CatchClause.asInstanceOf[js.Any])
    if (Class != null) __obj.updateDynamic("Class")(Class.asInstanceOf[js.Any])
    if (ClassBody != null) __obj.updateDynamic("ClassBody")(ClassBody.asInstanceOf[js.Any])
    if (ClassDeclaration != null) __obj.updateDynamic("ClassDeclaration")(ClassDeclaration.asInstanceOf[js.Any])
    if (ClassExpression != null) __obj.updateDynamic("ClassExpression")(ClassExpression.asInstanceOf[js.Any])
    if (ClassImplements != null) __obj.updateDynamic("ClassImplements")(ClassImplements.asInstanceOf[js.Any])
    if (ClassMethod != null) __obj.updateDynamic("ClassMethod")(ClassMethod.asInstanceOf[js.Any])
    if (ClassProperty != null) __obj.updateDynamic("ClassProperty")(ClassProperty.asInstanceOf[js.Any])
    if (CompletionStatement != null) __obj.updateDynamic("CompletionStatement")(CompletionStatement.asInstanceOf[js.Any])
    if (Conditional != null) __obj.updateDynamic("Conditional")(Conditional.asInstanceOf[js.Any])
    if (ConditionalExpression != null) __obj.updateDynamic("ConditionalExpression")(ConditionalExpression.asInstanceOf[js.Any])
    if (ContinueStatement != null) __obj.updateDynamic("ContinueStatement")(ContinueStatement.asInstanceOf[js.Any])
    if (DebuggerStatement != null) __obj.updateDynamic("DebuggerStatement")(DebuggerStatement.asInstanceOf[js.Any])
    if (Declaration != null) __obj.updateDynamic("Declaration")(Declaration.asInstanceOf[js.Any])
    if (DeclareClass != null) __obj.updateDynamic("DeclareClass")(DeclareClass.asInstanceOf[js.Any])
    if (DeclareFunction != null) __obj.updateDynamic("DeclareFunction")(DeclareFunction.asInstanceOf[js.Any])
    if (DeclareInterface != null) __obj.updateDynamic("DeclareInterface")(DeclareInterface.asInstanceOf[js.Any])
    if (DeclareModule != null) __obj.updateDynamic("DeclareModule")(DeclareModule.asInstanceOf[js.Any])
    if (DeclareTypeAlias != null) __obj.updateDynamic("DeclareTypeAlias")(DeclareTypeAlias.asInstanceOf[js.Any])
    if (DeclareVariable != null) __obj.updateDynamic("DeclareVariable")(DeclareVariable.asInstanceOf[js.Any])
    if (Decorator != null) __obj.updateDynamic("Decorator")(Decorator.asInstanceOf[js.Any])
    if (Directive != null) __obj.updateDynamic("Directive")(Directive.asInstanceOf[js.Any])
    if (DirectiveLiteral != null) __obj.updateDynamic("DirectiveLiteral")(DirectiveLiteral.asInstanceOf[js.Any])
    if (DoExpression != null) __obj.updateDynamic("DoExpression")(DoExpression.asInstanceOf[js.Any])
    if (DoWhileStatement != null) __obj.updateDynamic("DoWhileStatement")(DoWhileStatement.asInstanceOf[js.Any])
    if (EmptyStatement != null) __obj.updateDynamic("EmptyStatement")(EmptyStatement.asInstanceOf[js.Any])
    if (ExistentialTypeParam != null) __obj.updateDynamic("ExistentialTypeParam")(ExistentialTypeParam.asInstanceOf[js.Any])
    if (ExportAllDeclaration != null) __obj.updateDynamic("ExportAllDeclaration")(ExportAllDeclaration.asInstanceOf[js.Any])
    if (ExportDeclaration != null) __obj.updateDynamic("ExportDeclaration")(ExportDeclaration.asInstanceOf[js.Any])
    if (ExportDefaultDeclaration != null) __obj.updateDynamic("ExportDefaultDeclaration")(ExportDefaultDeclaration.asInstanceOf[js.Any])
    if (ExportDefaultSpecifier != null) __obj.updateDynamic("ExportDefaultSpecifier")(ExportDefaultSpecifier.asInstanceOf[js.Any])
    if (ExportNamedDeclaration != null) __obj.updateDynamic("ExportNamedDeclaration")(ExportNamedDeclaration.asInstanceOf[js.Any])
    if (ExportNamespaceSpecifier != null) __obj.updateDynamic("ExportNamespaceSpecifier")(ExportNamespaceSpecifier.asInstanceOf[js.Any])
    if (ExportSpecifier != null) __obj.updateDynamic("ExportSpecifier")(ExportSpecifier.asInstanceOf[js.Any])
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    if (ExpressionStatement != null) __obj.updateDynamic("ExpressionStatement")(ExpressionStatement.asInstanceOf[js.Any])
    if (ExpressionWrapper != null) __obj.updateDynamic("ExpressionWrapper")(ExpressionWrapper.asInstanceOf[js.Any])
    if (File != null) __obj.updateDynamic("File")(File.asInstanceOf[js.Any])
    if (Flow != null) __obj.updateDynamic("Flow")(Flow.asInstanceOf[js.Any])
    if (FlowBaseAnnotation != null) __obj.updateDynamic("FlowBaseAnnotation")(FlowBaseAnnotation.asInstanceOf[js.Any])
    if (FlowDeclaration != null) __obj.updateDynamic("FlowDeclaration")(FlowDeclaration.asInstanceOf[js.Any])
    if (For != null) __obj.updateDynamic("For")(For.asInstanceOf[js.Any])
    if (ForInStatement != null) __obj.updateDynamic("ForInStatement")(ForInStatement.asInstanceOf[js.Any])
    if (ForOfStatement != null) __obj.updateDynamic("ForOfStatement")(ForOfStatement.asInstanceOf[js.Any])
    if (ForStatement != null) __obj.updateDynamic("ForStatement")(ForStatement.asInstanceOf[js.Any])
    if (ForXStatement != null) __obj.updateDynamic("ForXStatement")(ForXStatement.asInstanceOf[js.Any])
    if (Function != null) __obj.updateDynamic("Function")(Function.asInstanceOf[js.Any])
    if (FunctionDeclaration != null) __obj.updateDynamic("FunctionDeclaration")(FunctionDeclaration.asInstanceOf[js.Any])
    if (FunctionExpression != null) __obj.updateDynamic("FunctionExpression")(FunctionExpression.asInstanceOf[js.Any])
    if (FunctionParent != null) __obj.updateDynamic("FunctionParent")(FunctionParent.asInstanceOf[js.Any])
    if (FunctionTypeAnnotation != null) __obj.updateDynamic("FunctionTypeAnnotation")(FunctionTypeAnnotation.asInstanceOf[js.Any])
    if (FunctionTypeParam != null) __obj.updateDynamic("FunctionTypeParam")(FunctionTypeParam.asInstanceOf[js.Any])
    if (GenericTypeAnnotation != null) __obj.updateDynamic("GenericTypeAnnotation")(GenericTypeAnnotation.asInstanceOf[js.Any])
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    if (IfStatement != null) __obj.updateDynamic("IfStatement")(IfStatement.asInstanceOf[js.Any])
    if (Immutable != null) __obj.updateDynamic("Immutable")(Immutable.asInstanceOf[js.Any])
    if (ImportDeclaration != null) __obj.updateDynamic("ImportDeclaration")(ImportDeclaration.asInstanceOf[js.Any])
    if (ImportDefaultSpecifier != null) __obj.updateDynamic("ImportDefaultSpecifier")(ImportDefaultSpecifier.asInstanceOf[js.Any])
    if (ImportNamespaceSpecifier != null) __obj.updateDynamic("ImportNamespaceSpecifier")(ImportNamespaceSpecifier.asInstanceOf[js.Any])
    if (ImportSpecifier != null) __obj.updateDynamic("ImportSpecifier")(ImportSpecifier.asInstanceOf[js.Any])
    if (InterfaceDeclaration != null) __obj.updateDynamic("InterfaceDeclaration")(InterfaceDeclaration.asInstanceOf[js.Any])
    if (InterfaceExtends != null) __obj.updateDynamic("InterfaceExtends")(InterfaceExtends.asInstanceOf[js.Any])
    if (IntersectionTypeAnnotation != null) __obj.updateDynamic("IntersectionTypeAnnotation")(IntersectionTypeAnnotation.asInstanceOf[js.Any])
    if (JSX != null) __obj.updateDynamic("JSX")(JSX.asInstanceOf[js.Any])
    if (JSXAttribute != null) __obj.updateDynamic("JSXAttribute")(JSXAttribute.asInstanceOf[js.Any])
    if (JSXClosingElement != null) __obj.updateDynamic("JSXClosingElement")(JSXClosingElement.asInstanceOf[js.Any])
    if (JSXElement != null) __obj.updateDynamic("JSXElement")(JSXElement.asInstanceOf[js.Any])
    if (JSXEmptyExpression != null) __obj.updateDynamic("JSXEmptyExpression")(JSXEmptyExpression.asInstanceOf[js.Any])
    if (JSXExpressionContainer != null) __obj.updateDynamic("JSXExpressionContainer")(JSXExpressionContainer.asInstanceOf[js.Any])
    if (JSXIdentifier != null) __obj.updateDynamic("JSXIdentifier")(JSXIdentifier.asInstanceOf[js.Any])
    if (JSXMemberExpression != null) __obj.updateDynamic("JSXMemberExpression")(JSXMemberExpression.asInstanceOf[js.Any])
    if (JSXNamespacedName != null) __obj.updateDynamic("JSXNamespacedName")(JSXNamespacedName.asInstanceOf[js.Any])
    if (JSXOpeningElement != null) __obj.updateDynamic("JSXOpeningElement")(JSXOpeningElement.asInstanceOf[js.Any])
    if (JSXSpreadAttribute != null) __obj.updateDynamic("JSXSpreadAttribute")(JSXSpreadAttribute.asInstanceOf[js.Any])
    if (JSXText != null) __obj.updateDynamic("JSXText")(JSXText.asInstanceOf[js.Any])
    if (LVal != null) __obj.updateDynamic("LVal")(LVal.asInstanceOf[js.Any])
    if (LabeledStatement != null) __obj.updateDynamic("LabeledStatement")(LabeledStatement.asInstanceOf[js.Any])
    if (Literal != null) __obj.updateDynamic("Literal")(Literal.asInstanceOf[js.Any])
    if (LogicalExpression != null) __obj.updateDynamic("LogicalExpression")(LogicalExpression.asInstanceOf[js.Any])
    if (Loop != null) __obj.updateDynamic("Loop")(Loop.asInstanceOf[js.Any])
    if (MemberExpression != null) __obj.updateDynamic("MemberExpression")(MemberExpression.asInstanceOf[js.Any])
    if (MetaProperty != null) __obj.updateDynamic("MetaProperty")(MetaProperty.asInstanceOf[js.Any])
    if (Method != null) __obj.updateDynamic("Method")(Method.asInstanceOf[js.Any])
    if (MixedTypeAnnotation != null) __obj.updateDynamic("MixedTypeAnnotation")(MixedTypeAnnotation.asInstanceOf[js.Any])
    if (ModuleDeclaration != null) __obj.updateDynamic("ModuleDeclaration")(ModuleDeclaration.asInstanceOf[js.Any])
    if (ModuleSpecifier != null) __obj.updateDynamic("ModuleSpecifier")(ModuleSpecifier.asInstanceOf[js.Any])
    if (NewExpression != null) __obj.updateDynamic("NewExpression")(NewExpression.asInstanceOf[js.Any])
    if (Noop != null) __obj.updateDynamic("Noop")(Noop.asInstanceOf[js.Any])
    if (NullLiteral != null) __obj.updateDynamic("NullLiteral")(NullLiteral.asInstanceOf[js.Any])
    if (NullLiteralTypeAnnotation != null) __obj.updateDynamic("NullLiteralTypeAnnotation")(NullLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (NullableTypeAnnotation != null) __obj.updateDynamic("NullableTypeAnnotation")(NullableTypeAnnotation.asInstanceOf[js.Any])
    if (NumberTypeAnnotation != null) __obj.updateDynamic("NumberTypeAnnotation")(NumberTypeAnnotation.asInstanceOf[js.Any])
    if (NumericLiteral != null) __obj.updateDynamic("NumericLiteral")(NumericLiteral.asInstanceOf[js.Any])
    if (NumericLiteralTypeAnnotation != null) __obj.updateDynamic("NumericLiteralTypeAnnotation")(NumericLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (ObjectExpression != null) __obj.updateDynamic("ObjectExpression")(ObjectExpression.asInstanceOf[js.Any])
    if (ObjectMember != null) __obj.updateDynamic("ObjectMember")(ObjectMember.asInstanceOf[js.Any])
    if (ObjectMethod != null) __obj.updateDynamic("ObjectMethod")(ObjectMethod.asInstanceOf[js.Any])
    if (ObjectPattern != null) __obj.updateDynamic("ObjectPattern")(ObjectPattern.asInstanceOf[js.Any])
    if (ObjectProperty != null) __obj.updateDynamic("ObjectProperty")(ObjectProperty.asInstanceOf[js.Any])
    if (ObjectTypeAnnotation != null) __obj.updateDynamic("ObjectTypeAnnotation")(ObjectTypeAnnotation.asInstanceOf[js.Any])
    if (ObjectTypeCallProperty != null) __obj.updateDynamic("ObjectTypeCallProperty")(ObjectTypeCallProperty.asInstanceOf[js.Any])
    if (ObjectTypeIndexer != null) __obj.updateDynamic("ObjectTypeIndexer")(ObjectTypeIndexer.asInstanceOf[js.Any])
    if (ObjectTypeProperty != null) __obj.updateDynamic("ObjectTypeProperty")(ObjectTypeProperty.asInstanceOf[js.Any])
    if (ParenthesizedExpression != null) __obj.updateDynamic("ParenthesizedExpression")(ParenthesizedExpression.asInstanceOf[js.Any])
    if (Pattern != null) __obj.updateDynamic("Pattern")(Pattern.asInstanceOf[js.Any])
    if (Program != null) __obj.updateDynamic("Program")(Program.asInstanceOf[js.Any])
    if (Property != null) __obj.updateDynamic("Property")(Property.asInstanceOf[js.Any])
    if (Pureish != null) __obj.updateDynamic("Pureish")(Pureish.asInstanceOf[js.Any])
    if (QualifiedTypeIdentifier != null) __obj.updateDynamic("QualifiedTypeIdentifier")(QualifiedTypeIdentifier.asInstanceOf[js.Any])
    if (RegExpLiteral != null) __obj.updateDynamic("RegExpLiteral")(RegExpLiteral.asInstanceOf[js.Any])
    if (RestElement != null) __obj.updateDynamic("RestElement")(RestElement.asInstanceOf[js.Any])
    if (RestProperty != null) __obj.updateDynamic("RestProperty")(RestProperty.asInstanceOf[js.Any])
    if (ReturnStatement != null) __obj.updateDynamic("ReturnStatement")(ReturnStatement.asInstanceOf[js.Any])
    if (Scopable != null) __obj.updateDynamic("Scopable")(Scopable.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    if (SequenceExpression != null) __obj.updateDynamic("SequenceExpression")(SequenceExpression.asInstanceOf[js.Any])
    if (SpreadElement != null) __obj.updateDynamic("SpreadElement")(SpreadElement.asInstanceOf[js.Any])
    if (SpreadProperty != null) __obj.updateDynamic("SpreadProperty")(SpreadProperty.asInstanceOf[js.Any])
    if (Statement != null) __obj.updateDynamic("Statement")(Statement.asInstanceOf[js.Any])
    if (StringLiteral != null) __obj.updateDynamic("StringLiteral")(StringLiteral.asInstanceOf[js.Any])
    if (StringLiteralTypeAnnotation != null) __obj.updateDynamic("StringLiteralTypeAnnotation")(StringLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (StringTypeAnnotation != null) __obj.updateDynamic("StringTypeAnnotation")(StringTypeAnnotation.asInstanceOf[js.Any])
    if (Super != null) __obj.updateDynamic("Super")(Super.asInstanceOf[js.Any])
    if (SwitchCase != null) __obj.updateDynamic("SwitchCase")(SwitchCase.asInstanceOf[js.Any])
    if (SwitchStatement != null) __obj.updateDynamic("SwitchStatement")(SwitchStatement.asInstanceOf[js.Any])
    if (TaggedTemplateExpression != null) __obj.updateDynamic("TaggedTemplateExpression")(TaggedTemplateExpression.asInstanceOf[js.Any])
    if (TemplateElement != null) __obj.updateDynamic("TemplateElement")(TemplateElement.asInstanceOf[js.Any])
    if (TemplateLiteral != null) __obj.updateDynamic("TemplateLiteral")(TemplateLiteral.asInstanceOf[js.Any])
    if (Terminatorless != null) __obj.updateDynamic("Terminatorless")(Terminatorless.asInstanceOf[js.Any])
    if (ThisExpression != null) __obj.updateDynamic("ThisExpression")(ThisExpression.asInstanceOf[js.Any])
    if (ThisTypeAnnotation != null) __obj.updateDynamic("ThisTypeAnnotation")(ThisTypeAnnotation.asInstanceOf[js.Any])
    if (ThrowStatement != null) __obj.updateDynamic("ThrowStatement")(ThrowStatement.asInstanceOf[js.Any])
    if (TryStatement != null) __obj.updateDynamic("TryStatement")(TryStatement.asInstanceOf[js.Any])
    if (TupleTypeAnnotation != null) __obj.updateDynamic("TupleTypeAnnotation")(TupleTypeAnnotation.asInstanceOf[js.Any])
    if (TypeAlias != null) __obj.updateDynamic("TypeAlias")(TypeAlias.asInstanceOf[js.Any])
    if (TypeAnnotation != null) __obj.updateDynamic("TypeAnnotation")(TypeAnnotation.asInstanceOf[js.Any])
    if (TypeCastExpression != null) __obj.updateDynamic("TypeCastExpression")(TypeCastExpression.asInstanceOf[js.Any])
    if (TypeParameterDeclaration != null) __obj.updateDynamic("TypeParameterDeclaration")(TypeParameterDeclaration.asInstanceOf[js.Any])
    if (TypeParameterInstantiation != null) __obj.updateDynamic("TypeParameterInstantiation")(TypeParameterInstantiation.asInstanceOf[js.Any])
    if (TypeofTypeAnnotation != null) __obj.updateDynamic("TypeofTypeAnnotation")(TypeofTypeAnnotation.asInstanceOf[js.Any])
    if (UnaryExpression != null) __obj.updateDynamic("UnaryExpression")(UnaryExpression.asInstanceOf[js.Any])
    if (UnaryLike != null) __obj.updateDynamic("UnaryLike")(UnaryLike.asInstanceOf[js.Any])
    if (UnionTypeAnnotation != null) __obj.updateDynamic("UnionTypeAnnotation")(UnionTypeAnnotation.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression.asInstanceOf[js.Any])
    if (UserWhitespacable != null) __obj.updateDynamic("UserWhitespacable")(UserWhitespacable.asInstanceOf[js.Any])
    if (VariableDeclaration != null) __obj.updateDynamic("VariableDeclaration")(VariableDeclaration.asInstanceOf[js.Any])
    if (VariableDeclarator != null) __obj.updateDynamic("VariableDeclarator")(VariableDeclarator.asInstanceOf[js.Any])
    if (VoidTypeAnnotation != null) __obj.updateDynamic("VoidTypeAnnotation")(VoidTypeAnnotation.asInstanceOf[js.Any])
    if (While != null) __obj.updateDynamic("While")(While.asInstanceOf[js.Any])
    if (WhileStatement != null) __obj.updateDynamic("WhileStatement")(WhileStatement.asInstanceOf[js.Any])
    if (WithStatement != null) __obj.updateDynamic("WithStatement")(WithStatement.asInstanceOf[js.Any])
    if (YieldExpression != null) __obj.updateDynamic("YieldExpression")(YieldExpression.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction2(exit))
    __obj.asInstanceOf[Visitor[S]]
  }
}

