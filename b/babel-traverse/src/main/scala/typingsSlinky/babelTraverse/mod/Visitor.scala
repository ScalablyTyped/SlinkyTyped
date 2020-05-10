package typingsSlinky.babelTraverse.mod

import typingsSlinky.babelTypes.mod.AnyTypeAnnotation_
import typingsSlinky.babelTypes.mod.ArrayExpression_
import typingsSlinky.babelTypes.mod.ArrayPattern_
import typingsSlinky.babelTypes.mod.ArrayTypeAnnotation_
import typingsSlinky.babelTypes.mod.ArrowFunctionExpression_
import typingsSlinky.babelTypes.mod.AssignmentExpression_
import typingsSlinky.babelTypes.mod.AssignmentPattern_
import typingsSlinky.babelTypes.mod.AwaitExpression_
import typingsSlinky.babelTypes.mod.Binary
import typingsSlinky.babelTypes.mod.BinaryExpression_
import typingsSlinky.babelTypes.mod.BindExpression_
import typingsSlinky.babelTypes.mod.Block
import typingsSlinky.babelTypes.mod.BlockParent
import typingsSlinky.babelTypes.mod.BlockStatement_
import typingsSlinky.babelTypes.mod.BooleanLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.BooleanLiteral_
import typingsSlinky.babelTypes.mod.BooleanTypeAnnotation_
import typingsSlinky.babelTypes.mod.BreakStatement_
import typingsSlinky.babelTypes.mod.CallExpression_
import typingsSlinky.babelTypes.mod.CatchClause_
import typingsSlinky.babelTypes.mod.Class
import typingsSlinky.babelTypes.mod.ClassBody_
import typingsSlinky.babelTypes.mod.ClassDeclaration_
import typingsSlinky.babelTypes.mod.ClassExpression_
import typingsSlinky.babelTypes.mod.ClassImplements_
import typingsSlinky.babelTypes.mod.ClassMethod_
import typingsSlinky.babelTypes.mod.ClassProperty_
import typingsSlinky.babelTypes.mod.CompletionStatement
import typingsSlinky.babelTypes.mod.Conditional
import typingsSlinky.babelTypes.mod.ConditionalExpression_
import typingsSlinky.babelTypes.mod.ContinueStatement_
import typingsSlinky.babelTypes.mod.DebuggerStatement_
import typingsSlinky.babelTypes.mod.Declaration
import typingsSlinky.babelTypes.mod.DeclareClass_
import typingsSlinky.babelTypes.mod.DeclareFunction_
import typingsSlinky.babelTypes.mod.DeclareInterface_
import typingsSlinky.babelTypes.mod.DeclareModule_
import typingsSlinky.babelTypes.mod.DeclareTypeAlias_
import typingsSlinky.babelTypes.mod.DeclareVariable_
import typingsSlinky.babelTypes.mod.Decorator_
import typingsSlinky.babelTypes.mod.DirectiveLiteral_
import typingsSlinky.babelTypes.mod.Directive_
import typingsSlinky.babelTypes.mod.DoExpression_
import typingsSlinky.babelTypes.mod.DoWhileStatement_
import typingsSlinky.babelTypes.mod.EmptyStatement_
import typingsSlinky.babelTypes.mod.ExistentialTypeParam_
import typingsSlinky.babelTypes.mod.ExportAllDeclaration_
import typingsSlinky.babelTypes.mod.ExportDeclaration
import typingsSlinky.babelTypes.mod.ExportDefaultDeclaration_
import typingsSlinky.babelTypes.mod.ExportDefaultSpecifier_
import typingsSlinky.babelTypes.mod.ExportNamedDeclaration_
import typingsSlinky.babelTypes.mod.ExportNamespaceSpecifier_
import typingsSlinky.babelTypes.mod.ExportSpecifier_
import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.ExpressionStatement_
import typingsSlinky.babelTypes.mod.ExpressionWrapper
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.babelTypes.mod.Flow
import typingsSlinky.babelTypes.mod.FlowBaseAnnotation
import typingsSlinky.babelTypes.mod.FlowDeclaration
import typingsSlinky.babelTypes.mod.For
import typingsSlinky.babelTypes.mod.ForInStatement_
import typingsSlinky.babelTypes.mod.ForOfStatement_
import typingsSlinky.babelTypes.mod.ForStatement_
import typingsSlinky.babelTypes.mod.ForXStatement
import typingsSlinky.babelTypes.mod.Function
import typingsSlinky.babelTypes.mod.FunctionDeclaration_
import typingsSlinky.babelTypes.mod.FunctionExpression_
import typingsSlinky.babelTypes.mod.FunctionParent
import typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_
import typingsSlinky.babelTypes.mod.FunctionTypeParam_
import typingsSlinky.babelTypes.mod.GenericTypeAnnotation_
import typingsSlinky.babelTypes.mod.Identifier_
import typingsSlinky.babelTypes.mod.IfStatement_
import typingsSlinky.babelTypes.mod.Immutable
import typingsSlinky.babelTypes.mod.ImportDeclaration_
import typingsSlinky.babelTypes.mod.ImportDefaultSpecifier_
import typingsSlinky.babelTypes.mod.ImportNamespaceSpecifier_
import typingsSlinky.babelTypes.mod.ImportSpecifier_
import typingsSlinky.babelTypes.mod.InterfaceDeclaration_
import typingsSlinky.babelTypes.mod.InterfaceExtends_
import typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_
import typingsSlinky.babelTypes.mod.JSX
import typingsSlinky.babelTypes.mod.JSXAttribute_
import typingsSlinky.babelTypes.mod.JSXClosingElement_
import typingsSlinky.babelTypes.mod.JSXElement_
import typingsSlinky.babelTypes.mod.JSXEmptyExpression_
import typingsSlinky.babelTypes.mod.JSXExpressionContainer_
import typingsSlinky.babelTypes.mod.JSXIdentifier_
import typingsSlinky.babelTypes.mod.JSXMemberExpression_
import typingsSlinky.babelTypes.mod.JSXNamespacedName_
import typingsSlinky.babelTypes.mod.JSXOpeningElement_
import typingsSlinky.babelTypes.mod.JSXSpreadAttribute_
import typingsSlinky.babelTypes.mod.JSXText_
import typingsSlinky.babelTypes.mod.LVal
import typingsSlinky.babelTypes.mod.LabeledStatement_
import typingsSlinky.babelTypes.mod.Literal
import typingsSlinky.babelTypes.mod.LogicalExpression_
import typingsSlinky.babelTypes.mod.Loop
import typingsSlinky.babelTypes.mod.MemberExpression_
import typingsSlinky.babelTypes.mod.MetaProperty_
import typingsSlinky.babelTypes.mod.Method
import typingsSlinky.babelTypes.mod.MixedTypeAnnotation_
import typingsSlinky.babelTypes.mod.ModuleDeclaration
import typingsSlinky.babelTypes.mod.ModuleSpecifier
import typingsSlinky.babelTypes.mod.NewExpression_
import typingsSlinky.babelTypes.mod.Noop_
import typingsSlinky.babelTypes.mod.NullLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.NullLiteral_
import typingsSlinky.babelTypes.mod.NullableTypeAnnotation_
import typingsSlinky.babelTypes.mod.NumberTypeAnnotation_
import typingsSlinky.babelTypes.mod.NumericLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.NumericLiteral_
import typingsSlinky.babelTypes.mod.ObjectExpression_
import typingsSlinky.babelTypes.mod.ObjectMember
import typingsSlinky.babelTypes.mod.ObjectMethod_
import typingsSlinky.babelTypes.mod.ObjectPattern_
import typingsSlinky.babelTypes.mod.ObjectProperty_
import typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_
import typingsSlinky.babelTypes.mod.ObjectTypeCallProperty_
import typingsSlinky.babelTypes.mod.ObjectTypeIndexer_
import typingsSlinky.babelTypes.mod.ObjectTypeProperty_
import typingsSlinky.babelTypes.mod.ParenthesizedExpression_
import typingsSlinky.babelTypes.mod.Pattern
import typingsSlinky.babelTypes.mod.Program_
import typingsSlinky.babelTypes.mod.Property
import typingsSlinky.babelTypes.mod.Pureish
import typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_
import typingsSlinky.babelTypes.mod.RegExpLiteral_
import typingsSlinky.babelTypes.mod.RestElement_
import typingsSlinky.babelTypes.mod.RestProperty_
import typingsSlinky.babelTypes.mod.ReturnStatement_
import typingsSlinky.babelTypes.mod.Scopable
import typingsSlinky.babelTypes.mod.SequenceExpression_
import typingsSlinky.babelTypes.mod.SpreadElement_
import typingsSlinky.babelTypes.mod.SpreadProperty_
import typingsSlinky.babelTypes.mod.Statement
import typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.StringLiteral_
import typingsSlinky.babelTypes.mod.StringTypeAnnotation_
import typingsSlinky.babelTypes.mod.Super
import typingsSlinky.babelTypes.mod.SwitchCase_
import typingsSlinky.babelTypes.mod.SwitchStatement_
import typingsSlinky.babelTypes.mod.TaggedTemplateExpression_
import typingsSlinky.babelTypes.mod.TemplateElement_
import typingsSlinky.babelTypes.mod.TemplateLiteral_
import typingsSlinky.babelTypes.mod.Terminatorless
import typingsSlinky.babelTypes.mod.ThisExpression_
import typingsSlinky.babelTypes.mod.ThisTypeAnnotation_
import typingsSlinky.babelTypes.mod.ThrowStatement_
import typingsSlinky.babelTypes.mod.TryStatement_
import typingsSlinky.babelTypes.mod.TupleTypeAnnotation_
import typingsSlinky.babelTypes.mod.TypeAlias_
import typingsSlinky.babelTypes.mod.TypeAnnotation_
import typingsSlinky.babelTypes.mod.TypeCastExpression_
import typingsSlinky.babelTypes.mod.TypeParameterDeclaration_
import typingsSlinky.babelTypes.mod.TypeParameterInstantiation_
import typingsSlinky.babelTypes.mod.TypeofTypeAnnotation_
import typingsSlinky.babelTypes.mod.UnaryExpression_
import typingsSlinky.babelTypes.mod.UnaryLike
import typingsSlinky.babelTypes.mod.UnionTypeAnnotation_
import typingsSlinky.babelTypes.mod.UpdateExpression_
import typingsSlinky.babelTypes.mod.UserWhitespacable
import typingsSlinky.babelTypes.mod.VariableDeclaration_
import typingsSlinky.babelTypes.mod.VariableDeclarator_
import typingsSlinky.babelTypes.mod.VoidTypeAnnotation_
import typingsSlinky.babelTypes.mod.While
import typingsSlinky.babelTypes.mod.WhileStatement_
import typingsSlinky.babelTypes.mod.WithStatement_
import typingsSlinky.babelTypes.mod.YieldExpression_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor[S] extends VisitNodeObject[Node] {
  var AnyTypeAnnotation: js.UndefOr[VisitNode[S, AnyTypeAnnotation_]] = js.native
  var ArrayExpression: js.UndefOr[VisitNode[S, ArrayExpression_]] = js.native
  var ArrayPattern: js.UndefOr[VisitNode[S, ArrayPattern_]] = js.native
  var ArrayTypeAnnotation: js.UndefOr[VisitNode[S, ArrayTypeAnnotation_]] = js.native
  var ArrowFunctionExpression: js.UndefOr[VisitNode[S, ArrowFunctionExpression_]] = js.native
  var AssignmentExpression: js.UndefOr[VisitNode[S, AssignmentExpression_]] = js.native
  var AssignmentPattern: js.UndefOr[VisitNode[S, AssignmentPattern_]] = js.native
  var AwaitExpression: js.UndefOr[VisitNode[S, AwaitExpression_]] = js.native
  var Binary: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Binary]] = js.native
  var BinaryExpression: js.UndefOr[VisitNode[S, BinaryExpression_]] = js.native
  var BindExpression: js.UndefOr[VisitNode[S, BindExpression_]] = js.native
  var Block: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Block]] = js.native
  var BlockParent: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.BlockParent]] = js.native
  var BlockStatement: js.UndefOr[VisitNode[S, BlockStatement_]] = js.native
  var BooleanLiteral: js.UndefOr[VisitNode[S, BooleanLiteral_]] = js.native
  var BooleanLiteralTypeAnnotation: js.UndefOr[VisitNode[S, BooleanLiteralTypeAnnotation_]] = js.native
  var BooleanTypeAnnotation: js.UndefOr[VisitNode[S, BooleanTypeAnnotation_]] = js.native
  var BreakStatement: js.UndefOr[VisitNode[S, BreakStatement_]] = js.native
  var CallExpression: js.UndefOr[VisitNode[S, CallExpression_]] = js.native
  var CatchClause: js.UndefOr[VisitNode[S, CatchClause_]] = js.native
  var Class: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Class]] = js.native
  var ClassBody: js.UndefOr[VisitNode[S, ClassBody_]] = js.native
  var ClassDeclaration: js.UndefOr[VisitNode[S, ClassDeclaration_]] = js.native
  var ClassExpression: js.UndefOr[VisitNode[S, ClassExpression_]] = js.native
  var ClassImplements: js.UndefOr[VisitNode[S, ClassImplements_]] = js.native
  var ClassMethod: js.UndefOr[VisitNode[S, ClassMethod_]] = js.native
  var ClassProperty: js.UndefOr[VisitNode[S, ClassProperty_]] = js.native
  var CompletionStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.CompletionStatement]] = js.native
  var Conditional: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Conditional]] = js.native
  var ConditionalExpression: js.UndefOr[VisitNode[S, ConditionalExpression_]] = js.native
  var ContinueStatement: js.UndefOr[VisitNode[S, ContinueStatement_]] = js.native
  var DebuggerStatement: js.UndefOr[VisitNode[S, DebuggerStatement_]] = js.native
  var Declaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Declaration]] = js.native
  var DeclareClass: js.UndefOr[VisitNode[S, DeclareClass_]] = js.native
  var DeclareFunction: js.UndefOr[VisitNode[S, DeclareFunction_]] = js.native
  var DeclareInterface: js.UndefOr[VisitNode[S, DeclareInterface_]] = js.native
  var DeclareModule: js.UndefOr[VisitNode[S, DeclareModule_]] = js.native
  var DeclareTypeAlias: js.UndefOr[VisitNode[S, DeclareTypeAlias_]] = js.native
  var DeclareVariable: js.UndefOr[VisitNode[S, DeclareVariable_]] = js.native
  var Decorator: js.UndefOr[VisitNode[S, Decorator_]] = js.native
  var Directive: js.UndefOr[VisitNode[S, Directive_]] = js.native
  var DirectiveLiteral: js.UndefOr[VisitNode[S, DirectiveLiteral_]] = js.native
  var DoExpression: js.UndefOr[VisitNode[S, DoExpression_]] = js.native
  var DoWhileStatement: js.UndefOr[VisitNode[S, DoWhileStatement_]] = js.native
  var EmptyStatement: js.UndefOr[VisitNode[S, EmptyStatement_]] = js.native
  var ExistentialTypeParam: js.UndefOr[VisitNode[S, ExistentialTypeParam_]] = js.native
  var ExportAllDeclaration: js.UndefOr[VisitNode[S, ExportAllDeclaration_]] = js.native
  var ExportDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ExportDeclaration]] = js.native
  var ExportDefaultDeclaration: js.UndefOr[VisitNode[S, ExportDefaultDeclaration_]] = js.native
  var ExportDefaultSpecifier: js.UndefOr[VisitNode[S, ExportDefaultSpecifier_]] = js.native
  var ExportNamedDeclaration: js.UndefOr[VisitNode[S, ExportNamedDeclaration_]] = js.native
  var ExportNamespaceSpecifier: js.UndefOr[VisitNode[S, ExportNamespaceSpecifier_]] = js.native
  var ExportSpecifier: js.UndefOr[VisitNode[S, ExportSpecifier_]] = js.native
  var Expression: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Expression]] = js.native
  var ExpressionStatement: js.UndefOr[VisitNode[S, ExpressionStatement_]] = js.native
  var ExpressionWrapper: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ExpressionWrapper]] = js.native
  var File: js.UndefOr[VisitNode[S, File_]] = js.native
  var Flow: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Flow]] = js.native
  var FlowBaseAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.FlowBaseAnnotation]] = js.native
  var FlowDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.FlowDeclaration]] = js.native
  var For: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.For]] = js.native
  var ForInStatement: js.UndefOr[VisitNode[S, ForInStatement_]] = js.native
  var ForOfStatement: js.UndefOr[VisitNode[S, ForOfStatement_]] = js.native
  var ForStatement: js.UndefOr[VisitNode[S, ForStatement_]] = js.native
  var ForXStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ForXStatement]] = js.native
  var Function: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Function]] = js.native
  var FunctionDeclaration: js.UndefOr[VisitNode[S, FunctionDeclaration_]] = js.native
  var FunctionExpression: js.UndefOr[VisitNode[S, FunctionExpression_]] = js.native
  var FunctionParent: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.FunctionParent]] = js.native
  var FunctionTypeAnnotation: js.UndefOr[VisitNode[S, FunctionTypeAnnotation_]] = js.native
  var FunctionTypeParam: js.UndefOr[VisitNode[S, FunctionTypeParam_]] = js.native
  var GenericTypeAnnotation: js.UndefOr[VisitNode[S, GenericTypeAnnotation_]] = js.native
  var Identifier: js.UndefOr[VisitNode[S, Identifier_]] = js.native
  var IfStatement: js.UndefOr[VisitNode[S, IfStatement_]] = js.native
  var Immutable: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Immutable]] = js.native
  var ImportDeclaration: js.UndefOr[VisitNode[S, ImportDeclaration_]] = js.native
  var ImportDefaultSpecifier: js.UndefOr[VisitNode[S, ImportDefaultSpecifier_]] = js.native
  var ImportNamespaceSpecifier: js.UndefOr[VisitNode[S, ImportNamespaceSpecifier_]] = js.native
  var ImportSpecifier: js.UndefOr[VisitNode[S, ImportSpecifier_]] = js.native
  var InterfaceDeclaration: js.UndefOr[VisitNode[S, InterfaceDeclaration_]] = js.native
  var InterfaceExtends: js.UndefOr[VisitNode[S, InterfaceExtends_]] = js.native
  var IntersectionTypeAnnotation: js.UndefOr[VisitNode[S, IntersectionTypeAnnotation_]] = js.native
  var JSX: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.JSX]] = js.native
  var JSXAttribute: js.UndefOr[VisitNode[S, JSXAttribute_]] = js.native
  var JSXClosingElement: js.UndefOr[VisitNode[S, JSXClosingElement_]] = js.native
  var JSXElement: js.UndefOr[VisitNode[S, JSXElement_]] = js.native
  var JSXEmptyExpression: js.UndefOr[VisitNode[S, JSXEmptyExpression_]] = js.native
  var JSXExpressionContainer: js.UndefOr[VisitNode[S, JSXExpressionContainer_]] = js.native
  var JSXIdentifier: js.UndefOr[VisitNode[S, JSXIdentifier_]] = js.native
  var JSXMemberExpression: js.UndefOr[VisitNode[S, JSXMemberExpression_]] = js.native
  var JSXNamespacedName: js.UndefOr[VisitNode[S, JSXNamespacedName_]] = js.native
  var JSXOpeningElement: js.UndefOr[VisitNode[S, JSXOpeningElement_]] = js.native
  var JSXSpreadAttribute: js.UndefOr[VisitNode[S, JSXSpreadAttribute_]] = js.native
  var JSXText: js.UndefOr[VisitNode[S, JSXText_]] = js.native
  var LVal: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.LVal]] = js.native
  var LabeledStatement: js.UndefOr[VisitNode[S, LabeledStatement_]] = js.native
  var Literal: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Literal]] = js.native
  var LogicalExpression: js.UndefOr[VisitNode[S, LogicalExpression_]] = js.native
  var Loop: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Loop]] = js.native
  var MemberExpression: js.UndefOr[VisitNode[S, MemberExpression_]] = js.native
  var MetaProperty: js.UndefOr[VisitNode[S, MetaProperty_]] = js.native
  var Method: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Method]] = js.native
  var MixedTypeAnnotation: js.UndefOr[VisitNode[S, MixedTypeAnnotation_]] = js.native
  var ModuleDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ModuleDeclaration]] = js.native
  var ModuleSpecifier: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ModuleSpecifier]] = js.native
  var NewExpression: js.UndefOr[VisitNode[S, NewExpression_]] = js.native
  var Noop: js.UndefOr[VisitNode[S, Noop_]] = js.native
  var NullLiteral: js.UndefOr[VisitNode[S, NullLiteral_]] = js.native
  var NullLiteralTypeAnnotation: js.UndefOr[VisitNode[S, NullLiteralTypeAnnotation_]] = js.native
  var NullableTypeAnnotation: js.UndefOr[VisitNode[S, NullableTypeAnnotation_]] = js.native
  var NumberTypeAnnotation: js.UndefOr[VisitNode[S, NumberTypeAnnotation_]] = js.native
  var NumericLiteral: js.UndefOr[VisitNode[S, NumericLiteral_]] = js.native
  var NumericLiteralTypeAnnotation: js.UndefOr[VisitNode[S, NumericLiteralTypeAnnotation_]] = js.native
  var ObjectExpression: js.UndefOr[VisitNode[S, ObjectExpression_]] = js.native
  var ObjectMember: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ObjectMember]] = js.native
  var ObjectMethod: js.UndefOr[VisitNode[S, ObjectMethod_]] = js.native
  var ObjectPattern: js.UndefOr[VisitNode[S, ObjectPattern_]] = js.native
  var ObjectProperty: js.UndefOr[VisitNode[S, ObjectProperty_]] = js.native
  var ObjectTypeAnnotation: js.UndefOr[VisitNode[S, ObjectTypeAnnotation_]] = js.native
  var ObjectTypeCallProperty: js.UndefOr[VisitNode[S, ObjectTypeCallProperty_]] = js.native
  var ObjectTypeIndexer: js.UndefOr[VisitNode[S, ObjectTypeIndexer_]] = js.native
  var ObjectTypeProperty: js.UndefOr[VisitNode[S, ObjectTypeProperty_]] = js.native
  var ParenthesizedExpression: js.UndefOr[VisitNode[S, ParenthesizedExpression_]] = js.native
  var Pattern: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Pattern]] = js.native
  var Program: js.UndefOr[VisitNode[S, Program_]] = js.native
  var Property: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Property]] = js.native
  var Pureish: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Pureish]] = js.native
  var QualifiedTypeIdentifier: js.UndefOr[VisitNode[S, QualifiedTypeIdentifier_]] = js.native
  var RegExpLiteral: js.UndefOr[VisitNode[S, RegExpLiteral_]] = js.native
  var RestElement: js.UndefOr[VisitNode[S, RestElement_]] = js.native
  var RestProperty: js.UndefOr[VisitNode[S, RestProperty_]] = js.native
  var ReturnStatement: js.UndefOr[VisitNode[S, ReturnStatement_]] = js.native
  var Scopable: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Scopable]] = js.native
  var Scope: js.UndefOr[VisitNode[S, Scopable]] = js.native
  var SequenceExpression: js.UndefOr[VisitNode[S, SequenceExpression_]] = js.native
  var SpreadElement: js.UndefOr[VisitNode[S, SpreadElement_]] = js.native
  var SpreadProperty: js.UndefOr[VisitNode[S, SpreadProperty_]] = js.native
  var Statement: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Statement]] = js.native
  var StringLiteral: js.UndefOr[VisitNode[S, StringLiteral_]] = js.native
  var StringLiteralTypeAnnotation: js.UndefOr[VisitNode[S, StringLiteralTypeAnnotation_]] = js.native
  var StringTypeAnnotation: js.UndefOr[VisitNode[S, StringTypeAnnotation_]] = js.native
  var Super: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Super]] = js.native
  var SwitchCase: js.UndefOr[VisitNode[S, SwitchCase_]] = js.native
  var SwitchStatement: js.UndefOr[VisitNode[S, SwitchStatement_]] = js.native
  var TaggedTemplateExpression: js.UndefOr[VisitNode[S, TaggedTemplateExpression_]] = js.native
  var TemplateElement: js.UndefOr[VisitNode[S, TemplateElement_]] = js.native
  var TemplateLiteral: js.UndefOr[VisitNode[S, TemplateLiteral_]] = js.native
  var Terminatorless: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Terminatorless]] = js.native
  var ThisExpression: js.UndefOr[VisitNode[S, ThisExpression_]] = js.native
  var ThisTypeAnnotation: js.UndefOr[VisitNode[S, ThisTypeAnnotation_]] = js.native
  var ThrowStatement: js.UndefOr[VisitNode[S, ThrowStatement_]] = js.native
  var TryStatement: js.UndefOr[VisitNode[S, TryStatement_]] = js.native
  var TupleTypeAnnotation: js.UndefOr[VisitNode[S, TupleTypeAnnotation_]] = js.native
  var TypeAlias: js.UndefOr[VisitNode[S, TypeAlias_]] = js.native
  var TypeAnnotation: js.UndefOr[VisitNode[S, TypeAnnotation_]] = js.native
  var TypeCastExpression: js.UndefOr[VisitNode[S, TypeCastExpression_]] = js.native
  var TypeParameterDeclaration: js.UndefOr[VisitNode[S, TypeParameterDeclaration_]] = js.native
  var TypeParameterInstantiation: js.UndefOr[VisitNode[S, TypeParameterInstantiation_]] = js.native
  var TypeofTypeAnnotation: js.UndefOr[VisitNode[S, TypeofTypeAnnotation_]] = js.native
  var UnaryExpression: js.UndefOr[VisitNode[S, UnaryExpression_]] = js.native
  var UnaryLike: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.UnaryLike]] = js.native
  var UnionTypeAnnotation: js.UndefOr[VisitNode[S, UnionTypeAnnotation_]] = js.native
  var UpdateExpression: js.UndefOr[VisitNode[S, UpdateExpression_]] = js.native
  var UserWhitespacable: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.UserWhitespacable]] = js.native
  var VariableDeclaration: js.UndefOr[VisitNode[S, VariableDeclaration_]] = js.native
  var VariableDeclarator: js.UndefOr[VisitNode[S, VariableDeclarator_]] = js.native
  var VoidTypeAnnotation: js.UndefOr[VisitNode[S, VoidTypeAnnotation_]] = js.native
  var While: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.While]] = js.native
  var WhileStatement: js.UndefOr[VisitNode[S, WhileStatement_]] = js.native
  var WithStatement: js.UndefOr[VisitNode[S, WithStatement_]] = js.native
  var YieldExpression: js.UndefOr[VisitNode[S, YieldExpression_]] = js.native
}

object Visitor {
  @scala.inline
  def apply[S](): Visitor[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visitor[S]]
  }
  @scala.inline
  implicit class VisitorOps[Self[s] <: Visitor[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withAnyTypeAnnotation(value: VisitNode[S, AnyTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayExpression(value: VisitNode[S, ArrayExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayPattern(value: VisitNode[S, ArrayPattern_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayPattern: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayTypeAnnotation(value: VisitNode[S, ArrayTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowFunctionExpression(value: VisitNode[S, ArrowFunctionExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowFunctionExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentExpression(value: VisitNode[S, AssignmentExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentPattern(value: VisitNode[S, AssignmentPattern_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentPattern: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withAwaitExpression(value: VisitNode[S, AwaitExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: VisitNode[S, Binary]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Binary")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryExpression(value: VisitNode[S, BinaryExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBindExpression(value: VisitNode[S, BindExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBlock(value: VisitNode[S, Block]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Block")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockParent(value: VisitNode[S, BlockParent]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockParent: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockParent")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStatement(value: VisitNode[S, BlockStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanLiteral(value: VisitNode[S, BooleanLiteral_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanLiteralTypeAnnotation(value: VisitNode[S, BooleanLiteralTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanLiteralTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanTypeAnnotation(value: VisitNode[S, BooleanTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakStatement(value: VisitNode[S, BreakStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withCallExpression(value: VisitNode[S, CallExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withCatchClause(value: VisitNode[S, CatchClause_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatchClause: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: VisitNode[S, Class]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassBody(value: VisitNode[S, ClassBody_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassBody: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(js.undefined)
        ret
    }
    @scala.inline
    def withClassDeclaration(value: VisitNode[S, ClassDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withClassExpression(value: VisitNode[S, ClassExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withClassImplements(value: VisitNode[S, ClassImplements_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassImplements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassImplements: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassImplements")(js.undefined)
        ret
    }
    @scala.inline
    def withClassMethod(value: VisitNode[S, ClassMethod_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassMethod: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withClassProperty(value: VisitNode[S, ClassProperty_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionStatement(value: VisitNode[S, CompletionStatement]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withConditional(value: VisitNode[S, Conditional]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditional: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditional")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalExpression(value: VisitNode[S, ConditionalExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueStatement(value: VisitNode[S, ContinueStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggerStatement(value: VisitNode[S, DebuggerStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggerStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaration(value: VisitNode[S, Declaration]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Declaration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareClass(value: VisitNode[S, DeclareClass_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareClass: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareFunction(value: VisitNode[S, DeclareFunction_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareFunction: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareInterface(value: VisitNode[S, DeclareInterface_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareInterface: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareModule(value: VisitNode[S, DeclareModule_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareModule: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareTypeAlias(value: VisitNode[S, DeclareTypeAlias_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareTypeAlias: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareVariable(value: VisitNode[S, DeclareVariable_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareVariable: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorator(value: VisitNode[S, Decorator_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorator: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decorator")(js.undefined)
        ret
    }
    @scala.inline
    def withDirective(value: VisitNode[S, Directive_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectiveLiteral(value: VisitNode[S, DirectiveLiteral_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectiveLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectiveLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectiveLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withDoExpression(value: VisitNode[S, DoExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withDoWhileStatement(value: VisitNode[S, DoWhileStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoWhileStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyStatement(value: VisitNode[S, EmptyStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withExistentialTypeParam(value: VisitNode[S, ExistentialTypeParam_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistentialTypeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistentialTypeParam: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistentialTypeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withExportAllDeclaration(value: VisitNode[S, ExportAllDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportAllDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportDeclaration(value: VisitNode[S, ExportDeclaration]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportDefaultDeclaration(value: VisitNode[S, ExportDefaultDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportDefaultDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportDefaultSpecifier(value: VisitNode[S, ExportDefaultSpecifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportDefaultSpecifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withExportNamedDeclaration(value: VisitNode[S, ExportNamedDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportNamedDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportNamespaceSpecifier(value: VisitNode[S, ExportNamespaceSpecifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportNamespaceSpecifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSpecifier(value: VisitNode[S, ExportSpecifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSpecifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: VisitNode[S, Expression]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionStatement(value: VisitNode[S, ExpressionStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionWrapper(value: VisitNode[S, ExpressionWrapper]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionWrapper: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: VisitNode[S, File_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(js.undefined)
        ret
    }
    @scala.inline
    def withFlow(value: VisitNode[S, Flow]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlow: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowBaseAnnotation(value: VisitNode[S, FlowBaseAnnotation]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowBaseAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowBaseAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowBaseAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowDeclaration(value: VisitNode[S, FlowDeclaration]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withFor(value: VisitNode[S, For]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("For")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFor: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("For")(js.undefined)
        ret
    }
    @scala.inline
    def withForInStatement(value: VisitNode[S, ForInStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForInStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withForOfStatement(value: VisitNode[S, ForOfStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForOfStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withForStatement(value: VisitNode[S, ForStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withForXStatement(value: VisitNode[S, ForXStatement]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForXStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForXStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForXStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withFunction(value: VisitNode[S, Function]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunction: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Function")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionDeclaration(value: VisitNode[S, FunctionDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionExpression(value: VisitNode[S, FunctionExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionParent(value: VisitNode[S, FunctionParent]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionParent: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionTypeAnnotation(value: VisitNode[S, FunctionTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionTypeParam(value: VisitNode[S, FunctionTypeParam_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionTypeParam: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGenericTypeAnnotation(value: VisitNode[S, GenericTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenericTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: VisitNode[S, Identifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIfStatement(value: VisitNode[S, IfStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutable(value: VisitNode[S, Immutable]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutable: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDeclaration(value: VisitNode[S, ImportDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDefaultSpecifier(value: VisitNode[S, ImportDefaultSpecifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportDefaultSpecifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withImportNamespaceSpecifier(value: VisitNode[S, ImportNamespaceSpecifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportNamespaceSpecifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withImportSpecifier(value: VisitNode[S, ImportSpecifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportSpecifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceDeclaration(value: VisitNode[S, InterfaceDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceExtends(value: VisitNode[S, InterfaceExtends_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceExtends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceExtends: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceExtends")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectionTypeAnnotation(value: VisitNode[S, IntersectionTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntersectionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectionTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntersectionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withJSX(value: VisitNode[S, JSX]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSX: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSX")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXAttribute(value: VisitNode[S, JSXAttribute_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXAttribute: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXClosingElement(value: VisitNode[S, JSXClosingElement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXClosingElement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingElement")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXElement(value: VisitNode[S, JSXElement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXElement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXEmptyExpression(value: VisitNode[S, JSXEmptyExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXEmptyExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXEmptyExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXEmptyExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXExpressionContainer(value: VisitNode[S, JSXExpressionContainer_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXExpressionContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXExpressionContainer: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXExpressionContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXIdentifier(value: VisitNode[S, JSXIdentifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXIdentifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXMemberExpression(value: VisitNode[S, JSXMemberExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXMemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXMemberExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXMemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXNamespacedName(value: VisitNode[S, JSXNamespacedName_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXNamespacedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXNamespacedName: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXNamespacedName")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXOpeningElement(value: VisitNode[S, JSXOpeningElement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXOpeningElement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningElement")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXSpreadAttribute(value: VisitNode[S, JSXSpreadAttribute_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXSpreadAttribute: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXText(value: VisitNode[S, JSXText_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXText: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXText")(js.undefined)
        ret
    }
    @scala.inline
    def withLVal(value: VisitNode[S, LVal]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLVal: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LVal")(js.undefined)
        ret
    }
    @scala.inline
    def withLabeledStatement(value: VisitNode[S, LabeledStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabeledStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteral(value: VisitNode[S, Literal]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalExpression(value: VisitNode[S, LogicalExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: VisitNode[S, Loop]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberExpression(value: VisitNode[S, MemberExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaProperty(value: VisitNode[S, MetaProperty_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: VisitNode[S, Method]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(js.undefined)
        ret
    }
    @scala.inline
    def withMixedTypeAnnotation(value: VisitNode[S, MixedTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MixedTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixedTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MixedTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleDeclaration(value: VisitNode[S, ModuleDeclaration]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleSpecifier(value: VisitNode[S, ModuleSpecifier]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleSpecifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNewExpression(value: VisitNode[S, NewExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withNoop(value: VisitNode[S, Noop_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Noop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoop: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Noop")(js.undefined)
        ret
    }
    @scala.inline
    def withNullLiteral(value: VisitNode[S, NullLiteral_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withNullLiteralTypeAnnotation(value: VisitNode[S, NullLiteralTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullLiteralTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withNullableTypeAnnotation(value: VisitNode[S, NullableTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullableTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullableTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullableTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberTypeAnnotation(value: VisitNode[S, NumberTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericLiteral(value: VisitNode[S, NumericLiteral_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericLiteralTypeAnnotation(value: VisitNode[S, NumericLiteralTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericLiteralTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectExpression(value: VisitNode[S, ObjectExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMember(value: VisitNode[S, ObjectMember]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMember: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectMember")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMethod(value: VisitNode[S, ObjectMethod_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMethod: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectPattern(value: VisitNode[S, ObjectPattern_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPattern: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectProperty(value: VisitNode[S, ObjectProperty_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeAnnotation(value: VisitNode[S, ObjectTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeCallProperty(value: VisitNode[S, ObjectTypeCallProperty_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCallProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeCallProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCallProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeIndexer(value: VisitNode[S, ObjectTypeIndexer_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeIndexer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeIndexer: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeIndexer")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeProperty(value: VisitNode[S, ObjectTypeProperty_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withParenthesizedExpression(value: VisitNode[S, ParenthesizedExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParenthesizedExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParenthesizedExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParenthesizedExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: VisitNode[S, Pattern]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withProgram(value: VisitNode[S, Program_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Program")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: VisitNode[S, Property]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(js.undefined)
        ret
    }
    @scala.inline
    def withPureish(value: VisitNode[S, Pureish]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pureish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPureish: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pureish")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifiedTypeIdentifier(value: VisitNode[S, QualifiedTypeIdentifier_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualifiedTypeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifiedTypeIdentifier: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualifiedTypeIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExpLiteral(value: VisitNode[S, RegExpLiteral_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExpLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExpLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExpLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withRestElement(value: VisitNode[S, RestElement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestElement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRestProperty(value: VisitNode[S, RestProperty_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnStatement(value: VisitNode[S, ReturnStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withScopable(value: VisitNode[S, Scopable]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scopable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopable: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scopable")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: VisitNode[S, Scopable]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceExpression(value: VisitNode[S, SequenceExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadElement(value: VisitNode[S, SpreadElement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadElement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadProperty(value: VisitNode[S, SpreadProperty_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadProperty: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement(value: VisitNode[S, Statement]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(js.undefined)
        ret
    }
    @scala.inline
    def withStringLiteral(value: VisitNode[S, StringLiteral_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withStringLiteralTypeAnnotation(value: VisitNode[S, StringLiteralTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringLiteralTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withStringTypeAnnotation(value: VisitNode[S, StringTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSuper(value: VisitNode[S, Super]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Super")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuper: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Super")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchCase(value: VisitNode[S, SwitchCase_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchCase: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchStatement(value: VisitNode[S, SwitchStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withTaggedTemplateExpression(value: VisitNode[S, TaggedTemplateExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaggedTemplateExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateElement(value: VisitNode[S, TemplateElement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateElement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateLiteral(value: VisitNode[S, TemplateLiteral_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateLiteral: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminatorless(value: VisitNode[S, Terminatorless]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terminatorless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminatorless: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terminatorless")(js.undefined)
        ret
    }
    @scala.inline
    def withThisExpression(value: VisitNode[S, ThisExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThisExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withThisTypeAnnotation(value: VisitNode[S, ThisTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThisTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowStatement(value: VisitNode[S, ThrowStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withTryStatement(value: VisitNode[S, TryStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTryStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withTupleTypeAnnotation(value: VisitNode[S, TupleTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TupleTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTupleTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TupleTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAlias(value: VisitNode[S, TypeAlias_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAlias: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: VisitNode[S, TypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCastExpression(value: VisitNode[S, TypeCastExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeCastExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCastExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeCastExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParameterDeclaration(value: VisitNode[S, TypeParameterDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameterDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParameterInstantiation(value: VisitNode[S, TypeParameterInstantiation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameterInstantiation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterInstantiation")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeofTypeAnnotation(value: VisitNode[S, TypeofTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeofTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeofTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeofTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withUnaryExpression(value: VisitNode[S, UnaryExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnaryExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withUnaryLike(value: VisitNode[S, UnaryLike]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryLike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnaryLike: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryLike")(js.undefined)
        ret
    }
    @scala.inline
    def withUnionTypeAnnotation(value: VisitNode[S, UnionTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnionTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateExpression(value: VisitNode[S, UpdateExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withUserWhitespacable(value: VisitNode[S, UserWhitespacable]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserWhitespacable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserWhitespacable: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserWhitespacable")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableDeclaration(value: VisitNode[S, VariableDeclaration_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableDeclaration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableDeclarator(value: VisitNode[S, VariableDeclarator_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableDeclarator: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(js.undefined)
        ret
    }
    @scala.inline
    def withVoidTypeAnnotation(value: VisitNode[S, VoidTypeAnnotation_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoidTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoidTypeAnnotation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoidTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withWhile(value: VisitNode[S, While]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("While")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhile: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("While")(js.undefined)
        ret
    }
    @scala.inline
    def withWhileStatement(value: VisitNode[S, WhileStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhileStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withWithStatement(value: VisitNode[S, WithStatement_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithStatement: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withYieldExpression(value: VisitNode[S, YieldExpression_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYieldExpression: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(js.undefined)
        ret
    }
  }
  
}

