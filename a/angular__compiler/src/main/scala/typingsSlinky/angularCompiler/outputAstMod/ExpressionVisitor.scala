package typingsSlinky.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionVisitor extends js.Object {
  def visitAssertNotNullExpr(ast: AssertNotNull_, context: js.Any): js.Any = js.native
  def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: js.Any): js.Any = js.native
  def visitCastExpr(ast: CastExpr, context: js.Any): js.Any = js.native
  def visitCommaExpr(ast: CommaExpr, context: js.Any): js.Any = js.native
  def visitConditionalExpr(ast: ConditionalExpr, context: js.Any): js.Any = js.native
  def visitExternalExpr(ast: ExternalExpr, context: js.Any): js.Any = js.native
  def visitFunctionExpr(ast: FunctionExpr, context: js.Any): js.Any = js.native
  def visitInstantiateExpr(ast: InstantiateExpr, context: js.Any): js.Any = js.native
  def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: js.Any): js.Any = js.native
  def visitInvokeMethodExpr(ast: InvokeMethodExpr, context: js.Any): js.Any = js.native
  def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: js.Any): js.Any = js.native
  def visitLiteralExpr(ast: LiteralExpr, context: js.Any): js.Any = js.native
  def visitLiteralMapExpr(ast: LiteralMapExpr, context: js.Any): js.Any = js.native
  def visitNotExpr(ast: NotExpr, context: js.Any): js.Any = js.native
  def visitReadKeyExpr(ast: ReadKeyExpr, context: js.Any): js.Any = js.native
  def visitReadPropExpr(ast: ReadPropExpr, context: js.Any): js.Any = js.native
  def visitReadVarExpr(ast: ReadVarExpr, context: js.Any): js.Any = js.native
  def visitTypeofExpr(ast: TypeofExpr_, context: js.Any): js.Any = js.native
  def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], context: js.Any): js.Any = js.native
  def visitWriteKeyExpr(expr: WriteKeyExpr, context: js.Any): js.Any = js.native
  def visitWritePropExpr(expr: WritePropExpr, context: js.Any): js.Any = js.native
  def visitWriteVarExpr(expr: WriteVarExpr, context: js.Any): js.Any = js.native
}

object ExpressionVisitor {
  @scala.inline
  def apply(
    visitAssertNotNullExpr: (AssertNotNull_, js.Any) => js.Any,
    visitBinaryOperatorExpr: (BinaryOperatorExpr, js.Any) => js.Any,
    visitCastExpr: (CastExpr, js.Any) => js.Any,
    visitCommaExpr: (CommaExpr, js.Any) => js.Any,
    visitConditionalExpr: (ConditionalExpr, js.Any) => js.Any,
    visitExternalExpr: (ExternalExpr, js.Any) => js.Any,
    visitFunctionExpr: (FunctionExpr, js.Any) => js.Any,
    visitInstantiateExpr: (InstantiateExpr, js.Any) => js.Any,
    visitInvokeFunctionExpr: (InvokeFunctionExpr, js.Any) => js.Any,
    visitInvokeMethodExpr: (InvokeMethodExpr, js.Any) => js.Any,
    visitLiteralArrayExpr: (LiteralArrayExpr, js.Any) => js.Any,
    visitLiteralExpr: (LiteralExpr, js.Any) => js.Any,
    visitLiteralMapExpr: (LiteralMapExpr, js.Any) => js.Any,
    visitNotExpr: (NotExpr, js.Any) => js.Any,
    visitReadKeyExpr: (ReadKeyExpr, js.Any) => js.Any,
    visitReadPropExpr: (ReadPropExpr, js.Any) => js.Any,
    visitReadVarExpr: (ReadVarExpr, js.Any) => js.Any,
    visitTypeofExpr: (TypeofExpr_, js.Any) => js.Any,
    visitWrappedNodeExpr: (WrappedNodeExpr[_], js.Any) => js.Any,
    visitWriteKeyExpr: (WriteKeyExpr, js.Any) => js.Any,
    visitWritePropExpr: (WritePropExpr, js.Any) => js.Any,
    visitWriteVarExpr: (WriteVarExpr, js.Any) => js.Any
  ): ExpressionVisitor = {
    val __obj = js.Dynamic.literal(visitAssertNotNullExpr = js.Any.fromFunction2(visitAssertNotNullExpr), visitBinaryOperatorExpr = js.Any.fromFunction2(visitBinaryOperatorExpr), visitCastExpr = js.Any.fromFunction2(visitCastExpr), visitCommaExpr = js.Any.fromFunction2(visitCommaExpr), visitConditionalExpr = js.Any.fromFunction2(visitConditionalExpr), visitExternalExpr = js.Any.fromFunction2(visitExternalExpr), visitFunctionExpr = js.Any.fromFunction2(visitFunctionExpr), visitInstantiateExpr = js.Any.fromFunction2(visitInstantiateExpr), visitInvokeFunctionExpr = js.Any.fromFunction2(visitInvokeFunctionExpr), visitInvokeMethodExpr = js.Any.fromFunction2(visitInvokeMethodExpr), visitLiteralArrayExpr = js.Any.fromFunction2(visitLiteralArrayExpr), visitLiteralExpr = js.Any.fromFunction2(visitLiteralExpr), visitLiteralMapExpr = js.Any.fromFunction2(visitLiteralMapExpr), visitNotExpr = js.Any.fromFunction2(visitNotExpr), visitReadKeyExpr = js.Any.fromFunction2(visitReadKeyExpr), visitReadPropExpr = js.Any.fromFunction2(visitReadPropExpr), visitReadVarExpr = js.Any.fromFunction2(visitReadVarExpr), visitTypeofExpr = js.Any.fromFunction2(visitTypeofExpr), visitWrappedNodeExpr = js.Any.fromFunction2(visitWrappedNodeExpr), visitWriteKeyExpr = js.Any.fromFunction2(visitWriteKeyExpr), visitWritePropExpr = js.Any.fromFunction2(visitWritePropExpr), visitWriteVarExpr = js.Any.fromFunction2(visitWriteVarExpr))
    __obj.asInstanceOf[ExpressionVisitor]
  }
  @scala.inline
  implicit class ExpressionVisitorOps[Self <: ExpressionVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitAssertNotNullExpr(value: (AssertNotNull_, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAssertNotNullExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitBinaryOperatorExpr(value: (BinaryOperatorExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBinaryOperatorExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitCastExpr(value: (CastExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCastExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitCommaExpr(value: (CommaExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCommaExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitConditionalExpr(value: (ConditionalExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitConditionalExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitExternalExpr(value: (ExternalExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExternalExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitFunctionExpr(value: (FunctionExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitInstantiateExpr(value: (InstantiateExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInstantiateExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitInvokeFunctionExpr(value: (InvokeFunctionExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInvokeFunctionExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitInvokeMethodExpr(value: (InvokeMethodExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInvokeMethodExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitLiteralArrayExpr(value: (LiteralArrayExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteralArrayExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitLiteralExpr(value: (LiteralExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteralExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitLiteralMapExpr(value: (LiteralMapExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteralMapExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitNotExpr(value: (NotExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNotExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitReadKeyExpr(value: (ReadKeyExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitReadKeyExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitReadPropExpr(value: (ReadPropExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitReadPropExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitReadVarExpr(value: (ReadVarExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitReadVarExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitTypeofExpr(value: (TypeofExpr_, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTypeofExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitWrappedNodeExpr(value: (WrappedNodeExpr[_], js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitWrappedNodeExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitWriteKeyExpr(value: (WriteKeyExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitWriteKeyExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitWritePropExpr(value: (WritePropExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitWritePropExpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitWriteVarExpr(value: (WriteVarExpr, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitWriteVarExpr")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

