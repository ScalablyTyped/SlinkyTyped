package typingsSlinky.eslint.mod.Rule

import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void} */
@js.native
trait NodeListener extends js.Object {
  var ArrayExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ArrayPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ArrowFunctionExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var AssignmentExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var AssignmentPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var AwaitExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var BinaryExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var BlockStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var BreakStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var CallExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var CatchClause: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ClassBody: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ClassDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ClassExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ConditionalExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ContinueStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var DebuggerStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var DoWhileStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var EmptyStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportAllDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportDefaultDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportNamedDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExpressionStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ForInStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ForOfStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ForStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var FunctionDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var FunctionExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Identifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var IfStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportDefaultSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportNamespaceSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var LabeledStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Literal: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var LogicalExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var MemberExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var MetaProperty: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var MethodDefinition: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var NewExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ObjectExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ObjectPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Program: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Property: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var RestElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ReturnStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SequenceExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SpreadElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Super: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SwitchCase: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SwitchStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TaggedTemplateExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TemplateElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TemplateLiteral: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ThisExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ThrowStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TryStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var UnaryExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var UpdateExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var VariableDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var VariableDeclarator: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var WhileStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var WithStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var YieldExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}

object NodeListener {
  @scala.inline
  def apply(): NodeListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeListener]
  }
  @scala.inline
  implicit class NodeListenerOps[Self <: NodeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutArrayExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayPattern(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutArrayPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowFunctionExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutArrowFunctionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAssignmentExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentPattern(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAssignmentPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withAwaitExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAwaitExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBinaryExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlockStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBreakStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withCallExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withCatchClause(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCatchClause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(js.undefined)
        ret
    }
    @scala.inline
    def withClassBody(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClassBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(js.undefined)
        ret
    }
    @scala.inline
    def withClassDeclaration(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClassDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withClassExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClassExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConditionalExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContinueStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggerStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDebuggerStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withDoWhileStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoWhileStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEmptyStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withExportAllDeclaration(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportAllDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportDefaultDeclaration(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportDefaultDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportNamedDeclaration(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportNamedDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSpecifier(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportSpecifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpressionStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withForInStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutForInStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withForOfStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutForOfStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withForStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutForStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionDeclaration(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFunctionDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFunctionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIfStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIfStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDeclaration(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutImportDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDefaultSpecifier(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutImportDefaultSpecifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withImportExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutImportExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withImportNamespaceSpecifier(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutImportNamespaceSpecifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withImportSpecifier(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutImportSpecifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withLabeledStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLabeledStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteral(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogicalExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMemberExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaProperty(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMetaProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodDefinition(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodDefinition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMethodDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withNewExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNewExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutObjectExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectPattern(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutObjectPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withProgram(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Program")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Program")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(js.undefined)
        ret
    }
    @scala.inline
    def withRestElement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReturnStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSequenceExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadElement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSpreadElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSuper(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Super")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Super")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchCase(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSwitchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSwitchStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withTaggedTemplateExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTaggedTemplateExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateElement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplateElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateLiteral(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplateLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withThisExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutThisExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutThrowStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withTryStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTryStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withUnaryExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnaryExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableDeclaration(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVariableDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableDeclarator(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVariableDeclarator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(js.undefined)
        ret
    }
    @scala.inline
    def withWhileStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWhileStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withWithStatement(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWithStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withYieldExpression(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutYieldExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(js.undefined)
        ret
    }
  }
  
}

