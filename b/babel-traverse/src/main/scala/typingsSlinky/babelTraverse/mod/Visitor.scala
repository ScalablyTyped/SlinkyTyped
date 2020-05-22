package typingsSlinky.babelTraverse.mod

import typingsSlinky.babelTypes.mod.AnyTypeAnnotation_
import typingsSlinky.babelTypes.mod.ArrayExpression_
import typingsSlinky.babelTypes.mod.ArrayPattern_
import typingsSlinky.babelTypes.mod.ArrayTypeAnnotation_
import typingsSlinky.babelTypes.mod.ArrowFunctionExpression_
import typingsSlinky.babelTypes.mod.AssignmentExpression_
import typingsSlinky.babelTypes.mod.AssignmentPattern_
import typingsSlinky.babelTypes.mod.AwaitExpression_
import typingsSlinky.babelTypes.mod.BinaryExpression_
import typingsSlinky.babelTypes.mod.BindExpression_
import typingsSlinky.babelTypes.mod.BlockStatement_
import typingsSlinky.babelTypes.mod.BooleanLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.BooleanLiteral_
import typingsSlinky.babelTypes.mod.BooleanTypeAnnotation_
import typingsSlinky.babelTypes.mod.BreakStatement_
import typingsSlinky.babelTypes.mod.CallExpression_
import typingsSlinky.babelTypes.mod.CatchClause_
import typingsSlinky.babelTypes.mod.ClassBody_
import typingsSlinky.babelTypes.mod.ClassDeclaration_
import typingsSlinky.babelTypes.mod.ClassExpression_
import typingsSlinky.babelTypes.mod.ClassImplements_
import typingsSlinky.babelTypes.mod.ClassMethod_
import typingsSlinky.babelTypes.mod.ClassProperty_
import typingsSlinky.babelTypes.mod.ConditionalExpression_
import typingsSlinky.babelTypes.mod.ContinueStatement_
import typingsSlinky.babelTypes.mod.DebuggerStatement_
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
import typingsSlinky.babelTypes.mod.ExportDefaultDeclaration_
import typingsSlinky.babelTypes.mod.ExportDefaultSpecifier_
import typingsSlinky.babelTypes.mod.ExportNamedDeclaration_
import typingsSlinky.babelTypes.mod.ExportNamespaceSpecifier_
import typingsSlinky.babelTypes.mod.ExportSpecifier_
import typingsSlinky.babelTypes.mod.ExpressionStatement_
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.babelTypes.mod.ForInStatement_
import typingsSlinky.babelTypes.mod.ForOfStatement_
import typingsSlinky.babelTypes.mod.ForStatement_
import typingsSlinky.babelTypes.mod.FunctionDeclaration_
import typingsSlinky.babelTypes.mod.FunctionExpression_
import typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_
import typingsSlinky.babelTypes.mod.FunctionTypeParam_
import typingsSlinky.babelTypes.mod.GenericTypeAnnotation_
import typingsSlinky.babelTypes.mod.Identifier_
import typingsSlinky.babelTypes.mod.IfStatement_
import typingsSlinky.babelTypes.mod.ImportDeclaration_
import typingsSlinky.babelTypes.mod.ImportDefaultSpecifier_
import typingsSlinky.babelTypes.mod.ImportNamespaceSpecifier_
import typingsSlinky.babelTypes.mod.ImportSpecifier_
import typingsSlinky.babelTypes.mod.InterfaceDeclaration_
import typingsSlinky.babelTypes.mod.InterfaceExtends_
import typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_
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
import typingsSlinky.babelTypes.mod.LabeledStatement_
import typingsSlinky.babelTypes.mod.LogicalExpression_
import typingsSlinky.babelTypes.mod.MemberExpression_
import typingsSlinky.babelTypes.mod.MetaProperty_
import typingsSlinky.babelTypes.mod.MixedTypeAnnotation_
import typingsSlinky.babelTypes.mod.NewExpression_
import typingsSlinky.babelTypes.mod.Noop_
import typingsSlinky.babelTypes.mod.NullLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.NullLiteral_
import typingsSlinky.babelTypes.mod.NullableTypeAnnotation_
import typingsSlinky.babelTypes.mod.NumberTypeAnnotation_
import typingsSlinky.babelTypes.mod.NumericLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.NumericLiteral_
import typingsSlinky.babelTypes.mod.ObjectExpression_
import typingsSlinky.babelTypes.mod.ObjectMethod_
import typingsSlinky.babelTypes.mod.ObjectPattern_
import typingsSlinky.babelTypes.mod.ObjectProperty_
import typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_
import typingsSlinky.babelTypes.mod.ObjectTypeCallProperty_
import typingsSlinky.babelTypes.mod.ObjectTypeIndexer_
import typingsSlinky.babelTypes.mod.ObjectTypeProperty_
import typingsSlinky.babelTypes.mod.ParenthesizedExpression_
import typingsSlinky.babelTypes.mod.Program_
import typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_
import typingsSlinky.babelTypes.mod.RegExpLiteral_
import typingsSlinky.babelTypes.mod.RestElement_
import typingsSlinky.babelTypes.mod.RestProperty_
import typingsSlinky.babelTypes.mod.ReturnStatement_
import typingsSlinky.babelTypes.mod.Scopable
import typingsSlinky.babelTypes.mod.SequenceExpression_
import typingsSlinky.babelTypes.mod.SpreadElement_
import typingsSlinky.babelTypes.mod.SpreadProperty_
import typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_
import typingsSlinky.babelTypes.mod.StringLiteral_
import typingsSlinky.babelTypes.mod.StringTypeAnnotation_
import typingsSlinky.babelTypes.mod.SwitchCase_
import typingsSlinky.babelTypes.mod.SwitchStatement_
import typingsSlinky.babelTypes.mod.TaggedTemplateExpression_
import typingsSlinky.babelTypes.mod.TemplateElement_
import typingsSlinky.babelTypes.mod.TemplateLiteral_
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
import typingsSlinky.babelTypes.mod.UnionTypeAnnotation_
import typingsSlinky.babelTypes.mod.UpdateExpression_
import typingsSlinky.babelTypes.mod.VariableDeclaration_
import typingsSlinky.babelTypes.mod.VariableDeclarator_
import typingsSlinky.babelTypes.mod.VoidTypeAnnotation_
import typingsSlinky.babelTypes.mod.WhileStatement_
import typingsSlinky.babelTypes.mod.WithStatement_
import typingsSlinky.babelTypes.mod.YieldExpression_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[S] extends VisitNodeObject[Node] {
  var AnyTypeAnnotation: js.UndefOr[VisitNode[S, AnyTypeAnnotation_]] = js.undefined
  var ArrayExpression: js.UndefOr[VisitNode[S, ArrayExpression_]] = js.undefined
  var ArrayPattern: js.UndefOr[VisitNode[S, ArrayPattern_]] = js.undefined
  var ArrayTypeAnnotation: js.UndefOr[VisitNode[S, ArrayTypeAnnotation_]] = js.undefined
  var ArrowFunctionExpression: js.UndefOr[VisitNode[S, ArrowFunctionExpression_]] = js.undefined
  var AssignmentExpression: js.UndefOr[VisitNode[S, AssignmentExpression_]] = js.undefined
  var AssignmentPattern: js.UndefOr[VisitNode[S, AssignmentPattern_]] = js.undefined
  var AwaitExpression: js.UndefOr[VisitNode[S, AwaitExpression_]] = js.undefined
  var Binary: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Binary]] = js.undefined
  var BinaryExpression: js.UndefOr[VisitNode[S, BinaryExpression_]] = js.undefined
  var BindExpression: js.UndefOr[VisitNode[S, BindExpression_]] = js.undefined
  var Block: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Block]] = js.undefined
  var BlockParent: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.BlockParent]] = js.undefined
  var BlockStatement: js.UndefOr[VisitNode[S, BlockStatement_]] = js.undefined
  var BooleanLiteral: js.UndefOr[VisitNode[S, BooleanLiteral_]] = js.undefined
  var BooleanLiteralTypeAnnotation: js.UndefOr[VisitNode[S, BooleanLiteralTypeAnnotation_]] = js.undefined
  var BooleanTypeAnnotation: js.UndefOr[VisitNode[S, BooleanTypeAnnotation_]] = js.undefined
  var BreakStatement: js.UndefOr[VisitNode[S, BreakStatement_]] = js.undefined
  var CallExpression: js.UndefOr[VisitNode[S, CallExpression_]] = js.undefined
  var CatchClause: js.UndefOr[VisitNode[S, CatchClause_]] = js.undefined
  var Class: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Class]] = js.undefined
  var ClassBody: js.UndefOr[VisitNode[S, ClassBody_]] = js.undefined
  var ClassDeclaration: js.UndefOr[VisitNode[S, ClassDeclaration_]] = js.undefined
  var ClassExpression: js.UndefOr[VisitNode[S, ClassExpression_]] = js.undefined
  var ClassImplements: js.UndefOr[VisitNode[S, ClassImplements_]] = js.undefined
  var ClassMethod: js.UndefOr[VisitNode[S, ClassMethod_]] = js.undefined
  var ClassProperty: js.UndefOr[VisitNode[S, ClassProperty_]] = js.undefined
  var CompletionStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.CompletionStatement]] = js.undefined
  var Conditional: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Conditional]] = js.undefined
  var ConditionalExpression: js.UndefOr[VisitNode[S, ConditionalExpression_]] = js.undefined
  var ContinueStatement: js.UndefOr[VisitNode[S, ContinueStatement_]] = js.undefined
  var DebuggerStatement: js.UndefOr[VisitNode[S, DebuggerStatement_]] = js.undefined
  var Declaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Declaration]] = js.undefined
  var DeclareClass: js.UndefOr[VisitNode[S, DeclareClass_]] = js.undefined
  var DeclareFunction: js.UndefOr[VisitNode[S, DeclareFunction_]] = js.undefined
  var DeclareInterface: js.UndefOr[VisitNode[S, DeclareInterface_]] = js.undefined
  var DeclareModule: js.UndefOr[VisitNode[S, DeclareModule_]] = js.undefined
  var DeclareTypeAlias: js.UndefOr[VisitNode[S, DeclareTypeAlias_]] = js.undefined
  var DeclareVariable: js.UndefOr[VisitNode[S, DeclareVariable_]] = js.undefined
  var Decorator: js.UndefOr[VisitNode[S, Decorator_]] = js.undefined
  var Directive: js.UndefOr[VisitNode[S, Directive_]] = js.undefined
  var DirectiveLiteral: js.UndefOr[VisitNode[S, DirectiveLiteral_]] = js.undefined
  var DoExpression: js.UndefOr[VisitNode[S, DoExpression_]] = js.undefined
  var DoWhileStatement: js.UndefOr[VisitNode[S, DoWhileStatement_]] = js.undefined
  var EmptyStatement: js.UndefOr[VisitNode[S, EmptyStatement_]] = js.undefined
  var ExistentialTypeParam: js.UndefOr[VisitNode[S, ExistentialTypeParam_]] = js.undefined
  var ExportAllDeclaration: js.UndefOr[VisitNode[S, ExportAllDeclaration_]] = js.undefined
  var ExportDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ExportDeclaration]] = js.undefined
  var ExportDefaultDeclaration: js.UndefOr[VisitNode[S, ExportDefaultDeclaration_]] = js.undefined
  var ExportDefaultSpecifier: js.UndefOr[VisitNode[S, ExportDefaultSpecifier_]] = js.undefined
  var ExportNamedDeclaration: js.UndefOr[VisitNode[S, ExportNamedDeclaration_]] = js.undefined
  var ExportNamespaceSpecifier: js.UndefOr[VisitNode[S, ExportNamespaceSpecifier_]] = js.undefined
  var ExportSpecifier: js.UndefOr[VisitNode[S, ExportSpecifier_]] = js.undefined
  var Expression: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Expression]] = js.undefined
  var ExpressionStatement: js.UndefOr[VisitNode[S, ExpressionStatement_]] = js.undefined
  var ExpressionWrapper: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ExpressionWrapper]] = js.undefined
  var File: js.UndefOr[VisitNode[S, File_]] = js.undefined
  var Flow: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Flow]] = js.undefined
  var FlowBaseAnnotation: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.FlowBaseAnnotation]] = js.undefined
  var FlowDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.FlowDeclaration]] = js.undefined
  var For: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.For]] = js.undefined
  var ForInStatement: js.UndefOr[VisitNode[S, ForInStatement_]] = js.undefined
  var ForOfStatement: js.UndefOr[VisitNode[S, ForOfStatement_]] = js.undefined
  var ForStatement: js.UndefOr[VisitNode[S, ForStatement_]] = js.undefined
  var ForXStatement: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ForXStatement]] = js.undefined
  var Function: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Function]] = js.undefined
  var FunctionDeclaration: js.UndefOr[VisitNode[S, FunctionDeclaration_]] = js.undefined
  var FunctionExpression: js.UndefOr[VisitNode[S, FunctionExpression_]] = js.undefined
  var FunctionParent: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.FunctionParent]] = js.undefined
  var FunctionTypeAnnotation: js.UndefOr[VisitNode[S, FunctionTypeAnnotation_]] = js.undefined
  var FunctionTypeParam: js.UndefOr[VisitNode[S, FunctionTypeParam_]] = js.undefined
  var GenericTypeAnnotation: js.UndefOr[VisitNode[S, GenericTypeAnnotation_]] = js.undefined
  var Identifier: js.UndefOr[VisitNode[S, Identifier_]] = js.undefined
  var IfStatement: js.UndefOr[VisitNode[S, IfStatement_]] = js.undefined
  var Immutable: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Immutable]] = js.undefined
  var ImportDeclaration: js.UndefOr[VisitNode[S, ImportDeclaration_]] = js.undefined
  var ImportDefaultSpecifier: js.UndefOr[VisitNode[S, ImportDefaultSpecifier_]] = js.undefined
  var ImportNamespaceSpecifier: js.UndefOr[VisitNode[S, ImportNamespaceSpecifier_]] = js.undefined
  var ImportSpecifier: js.UndefOr[VisitNode[S, ImportSpecifier_]] = js.undefined
  var InterfaceDeclaration: js.UndefOr[VisitNode[S, InterfaceDeclaration_]] = js.undefined
  var InterfaceExtends: js.UndefOr[VisitNode[S, InterfaceExtends_]] = js.undefined
  var IntersectionTypeAnnotation: js.UndefOr[VisitNode[S, IntersectionTypeAnnotation_]] = js.undefined
  var JSX: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.JSX]] = js.undefined
  var JSXAttribute: js.UndefOr[VisitNode[S, JSXAttribute_]] = js.undefined
  var JSXClosingElement: js.UndefOr[VisitNode[S, JSXClosingElement_]] = js.undefined
  var JSXElement: js.UndefOr[VisitNode[S, JSXElement_]] = js.undefined
  var JSXEmptyExpression: js.UndefOr[VisitNode[S, JSXEmptyExpression_]] = js.undefined
  var JSXExpressionContainer: js.UndefOr[VisitNode[S, JSXExpressionContainer_]] = js.undefined
  var JSXIdentifier: js.UndefOr[VisitNode[S, JSXIdentifier_]] = js.undefined
  var JSXMemberExpression: js.UndefOr[VisitNode[S, JSXMemberExpression_]] = js.undefined
  var JSXNamespacedName: js.UndefOr[VisitNode[S, JSXNamespacedName_]] = js.undefined
  var JSXOpeningElement: js.UndefOr[VisitNode[S, JSXOpeningElement_]] = js.undefined
  var JSXSpreadAttribute: js.UndefOr[VisitNode[S, JSXSpreadAttribute_]] = js.undefined
  var JSXText: js.UndefOr[VisitNode[S, JSXText_]] = js.undefined
  var LVal: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.LVal]] = js.undefined
  var LabeledStatement: js.UndefOr[VisitNode[S, LabeledStatement_]] = js.undefined
  var Literal: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Literal]] = js.undefined
  var LogicalExpression: js.UndefOr[VisitNode[S, LogicalExpression_]] = js.undefined
  var Loop: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Loop]] = js.undefined
  var MemberExpression: js.UndefOr[VisitNode[S, MemberExpression_]] = js.undefined
  var MetaProperty: js.UndefOr[VisitNode[S, MetaProperty_]] = js.undefined
  var Method: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Method]] = js.undefined
  var MixedTypeAnnotation: js.UndefOr[VisitNode[S, MixedTypeAnnotation_]] = js.undefined
  var ModuleDeclaration: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ModuleDeclaration]] = js.undefined
  var ModuleSpecifier: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ModuleSpecifier]] = js.undefined
  var NewExpression: js.UndefOr[VisitNode[S, NewExpression_]] = js.undefined
  var Noop: js.UndefOr[VisitNode[S, Noop_]] = js.undefined
  var NullLiteral: js.UndefOr[VisitNode[S, NullLiteral_]] = js.undefined
  var NullLiteralTypeAnnotation: js.UndefOr[VisitNode[S, NullLiteralTypeAnnotation_]] = js.undefined
  var NullableTypeAnnotation: js.UndefOr[VisitNode[S, NullableTypeAnnotation_]] = js.undefined
  var NumberTypeAnnotation: js.UndefOr[VisitNode[S, NumberTypeAnnotation_]] = js.undefined
  var NumericLiteral: js.UndefOr[VisitNode[S, NumericLiteral_]] = js.undefined
  var NumericLiteralTypeAnnotation: js.UndefOr[VisitNode[S, NumericLiteralTypeAnnotation_]] = js.undefined
  var ObjectExpression: js.UndefOr[VisitNode[S, ObjectExpression_]] = js.undefined
  var ObjectMember: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.ObjectMember]] = js.undefined
  var ObjectMethod: js.UndefOr[VisitNode[S, ObjectMethod_]] = js.undefined
  var ObjectPattern: js.UndefOr[VisitNode[S, ObjectPattern_]] = js.undefined
  var ObjectProperty: js.UndefOr[VisitNode[S, ObjectProperty_]] = js.undefined
  var ObjectTypeAnnotation: js.UndefOr[VisitNode[S, ObjectTypeAnnotation_]] = js.undefined
  var ObjectTypeCallProperty: js.UndefOr[VisitNode[S, ObjectTypeCallProperty_]] = js.undefined
  var ObjectTypeIndexer: js.UndefOr[VisitNode[S, ObjectTypeIndexer_]] = js.undefined
  var ObjectTypeProperty: js.UndefOr[VisitNode[S, ObjectTypeProperty_]] = js.undefined
  var ParenthesizedExpression: js.UndefOr[VisitNode[S, ParenthesizedExpression_]] = js.undefined
  var Pattern: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Pattern]] = js.undefined
  var Program: js.UndefOr[VisitNode[S, Program_]] = js.undefined
  var Property: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Property]] = js.undefined
  var Pureish: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Pureish]] = js.undefined
  var QualifiedTypeIdentifier: js.UndefOr[VisitNode[S, QualifiedTypeIdentifier_]] = js.undefined
  var RegExpLiteral: js.UndefOr[VisitNode[S, RegExpLiteral_]] = js.undefined
  var RestElement: js.UndefOr[VisitNode[S, RestElement_]] = js.undefined
  var RestProperty: js.UndefOr[VisitNode[S, RestProperty_]] = js.undefined
  var ReturnStatement: js.UndefOr[VisitNode[S, ReturnStatement_]] = js.undefined
  var Scopable: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Scopable]] = js.undefined
  var Scope: js.UndefOr[VisitNode[S, Scopable]] = js.undefined
  var SequenceExpression: js.UndefOr[VisitNode[S, SequenceExpression_]] = js.undefined
  var SpreadElement: js.UndefOr[VisitNode[S, SpreadElement_]] = js.undefined
  var SpreadProperty: js.UndefOr[VisitNode[S, SpreadProperty_]] = js.undefined
  var Statement: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Statement]] = js.undefined
  var StringLiteral: js.UndefOr[VisitNode[S, StringLiteral_]] = js.undefined
  var StringLiteralTypeAnnotation: js.UndefOr[VisitNode[S, StringLiteralTypeAnnotation_]] = js.undefined
  var StringTypeAnnotation: js.UndefOr[VisitNode[S, StringTypeAnnotation_]] = js.undefined
  var Super: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Super]] = js.undefined
  var SwitchCase: js.UndefOr[VisitNode[S, SwitchCase_]] = js.undefined
  var SwitchStatement: js.UndefOr[VisitNode[S, SwitchStatement_]] = js.undefined
  var TaggedTemplateExpression: js.UndefOr[VisitNode[S, TaggedTemplateExpression_]] = js.undefined
  var TemplateElement: js.UndefOr[VisitNode[S, TemplateElement_]] = js.undefined
  var TemplateLiteral: js.UndefOr[VisitNode[S, TemplateLiteral_]] = js.undefined
  var Terminatorless: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.Terminatorless]] = js.undefined
  var ThisExpression: js.UndefOr[VisitNode[S, ThisExpression_]] = js.undefined
  var ThisTypeAnnotation: js.UndefOr[VisitNode[S, ThisTypeAnnotation_]] = js.undefined
  var ThrowStatement: js.UndefOr[VisitNode[S, ThrowStatement_]] = js.undefined
  var TryStatement: js.UndefOr[VisitNode[S, TryStatement_]] = js.undefined
  var TupleTypeAnnotation: js.UndefOr[VisitNode[S, TupleTypeAnnotation_]] = js.undefined
  var TypeAlias: js.UndefOr[VisitNode[S, TypeAlias_]] = js.undefined
  var TypeAnnotation: js.UndefOr[VisitNode[S, TypeAnnotation_]] = js.undefined
  var TypeCastExpression: js.UndefOr[VisitNode[S, TypeCastExpression_]] = js.undefined
  var TypeParameterDeclaration: js.UndefOr[VisitNode[S, TypeParameterDeclaration_]] = js.undefined
  var TypeParameterInstantiation: js.UndefOr[VisitNode[S, TypeParameterInstantiation_]] = js.undefined
  var TypeofTypeAnnotation: js.UndefOr[VisitNode[S, TypeofTypeAnnotation_]] = js.undefined
  var UnaryExpression: js.UndefOr[VisitNode[S, UnaryExpression_]] = js.undefined
  var UnaryLike: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.UnaryLike]] = js.undefined
  var UnionTypeAnnotation: js.UndefOr[VisitNode[S, UnionTypeAnnotation_]] = js.undefined
  var UpdateExpression: js.UndefOr[VisitNode[S, UpdateExpression_]] = js.undefined
  var UserWhitespacable: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.UserWhitespacable]] = js.undefined
  var VariableDeclaration: js.UndefOr[VisitNode[S, VariableDeclaration_]] = js.undefined
  var VariableDeclarator: js.UndefOr[VisitNode[S, VariableDeclarator_]] = js.undefined
  var VoidTypeAnnotation: js.UndefOr[VisitNode[S, VoidTypeAnnotation_]] = js.undefined
  var While: js.UndefOr[VisitNode[S, typingsSlinky.babelTypes.mod.While]] = js.undefined
  var WhileStatement: js.UndefOr[VisitNode[S, WhileStatement_]] = js.undefined
  var WithStatement: js.UndefOr[VisitNode[S, WithStatement_]] = js.undefined
  var YieldExpression: js.UndefOr[VisitNode[S, YieldExpression_]] = js.undefined
}

