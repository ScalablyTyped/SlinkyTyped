package typingsSlinky.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait coreVisitors[V] extends js.Object {
  var ArrayExpression: js.UndefOr[V] = js.native
  var AssignmentExpression: js.UndefOr[V] = js.native
  var BinaryExpression: js.UndefOr[V] = js.native
  var BlockStatement: js.UndefOr[V] = js.native
  var BooleanLiteral: js.UndefOr[V] = js.native
  var BreakStatement: js.UndefOr[V] = js.native
  var CallExpression: js.UndefOr[V] = js.native
  var CatchClause: js.UndefOr[V] = js.native
  var ConditionalExpression: js.UndefOr[V] = js.native
  var ContinueStatement: js.UndefOr[V] = js.native
  var DebuggerStatement: js.UndefOr[V] = js.native
  var Directive: js.UndefOr[V] = js.native
  var DirectiveLiteral: js.UndefOr[V] = js.native
  var DoWhileStatement: js.UndefOr[V] = js.native
  var EmptyStatement: js.UndefOr[V] = js.native
  var ExpressionStatement: js.UndefOr[V] = js.native
  var File: js.UndefOr[V] = js.native
  var ForInStatement: js.UndefOr[V] = js.native
  var ForStatement: js.UndefOr[V] = js.native
  var FunctionDeclaration: js.UndefOr[V] = js.native
  var FunctionExpression: js.UndefOr[V] = js.native
  var Identifier: js.UndefOr[V] = js.native
  var IfStatement: js.UndefOr[V] = js.native
  var LabeledStatement: js.UndefOr[V] = js.native
  var LogicalExpression: js.UndefOr[V] = js.native
  var MemberExpression: js.UndefOr[V] = js.native
  var NewExpression: js.UndefOr[V] = js.native
  var NullLiteral: js.UndefOr[V] = js.native
  var NumericLiteral: js.UndefOr[V] = js.native
  var ObjectExpression: js.UndefOr[V] = js.native
  var ObjectMethod: js.UndefOr[V] = js.native
  var ObjectProperty: js.UndefOr[V] = js.native
  var Program: js.UndefOr[V] = js.native
  var RegExpLiteral: js.UndefOr[V] = js.native
  var RestElement: js.UndefOr[V] = js.native
  var ReturnStatement: js.UndefOr[V] = js.native
  var SequenceExpression: js.UndefOr[V] = js.native
  var StringLiteral: js.UndefOr[V] = js.native
  var SwitchCase: js.UndefOr[V] = js.native
  var SwitchStatement: js.UndefOr[V] = js.native
  var ThisExpression: js.UndefOr[V] = js.native
  var ThrowStatement: js.UndefOr[V] = js.native
  var TryStatement: js.UndefOr[V] = js.native
  var UnaryExpression: js.UndefOr[V] = js.native
  var UpdateExpression: js.UndefOr[V] = js.native
  var VariableDeclaration: js.UndefOr[V] = js.native
  var VariableDeclarator: js.UndefOr[V] = js.native
  var WhileStatement: js.UndefOr[V] = js.native
  var WithStatement: js.UndefOr[V] = js.native
}

object coreVisitors {
  @scala.inline
  def apply[V](): coreVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[coreVisitors[V]]
  }
  @scala.inline
  implicit class coreVisitorsOps[Self[v] <: coreVisitors[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withArrayExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanLiteral(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanLiteral: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withCallExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withCatchClause(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatchClause: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggerStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggerStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withDirective(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectiveLiteral(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectiveLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectiveLiteral: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectiveLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withDoWhileStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoWhileStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(js.undefined)
        ret
    }
    @scala.inline
    def withForInStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForInStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withForStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIfStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withLabeledStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabeledStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withNewExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withNullLiteral(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullLiteral: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericLiteral(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericLiteral: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMethod(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMethod: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectProperty(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectProperty: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withProgram(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Program")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExpLiteral(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExpLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExpLiteral: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExpLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withRestElement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestElement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withStringLiteral(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringLiteral: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchCase(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchCase: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withThisExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThisExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withTryStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTryStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withUnaryExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnaryExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableDeclarator(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableDeclarator: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(js.undefined)
        ret
    }
    @scala.inline
    def withWhileStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhileStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withWithStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(js.undefined)
        ret
    }
  }
  
}

