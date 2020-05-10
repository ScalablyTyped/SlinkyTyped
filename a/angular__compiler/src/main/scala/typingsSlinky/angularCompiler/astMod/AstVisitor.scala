package typingsSlinky.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AstVisitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* ast */ AST, /* context */ js.UndefOr[js.Any], _]] = js.native
  var visitASTWithSource: js.UndefOr[js.Function2[/* ast */ ASTWithSource, /* context */ js.Any, _]] = js.native
  def visitBinary(ast: Binary, context: js.Any): js.Any = js.native
  def visitChain(ast: Chain, context: js.Any): js.Any = js.native
  def visitConditional(ast: Conditional, context: js.Any): js.Any = js.native
  def visitFunctionCall(ast: FunctionCall, context: js.Any): js.Any = js.native
  def visitImplicitReceiver(ast: ImplicitReceiver, context: js.Any): js.Any = js.native
  def visitInterpolation(ast: Interpolation, context: js.Any): js.Any = js.native
  def visitKeyedRead(ast: KeyedRead, context: js.Any): js.Any = js.native
  def visitKeyedWrite(ast: KeyedWrite, context: js.Any): js.Any = js.native
  def visitLiteralArray(ast: LiteralArray, context: js.Any): js.Any = js.native
  def visitLiteralMap(ast: LiteralMap, context: js.Any): js.Any = js.native
  def visitLiteralPrimitive(ast: LiteralPrimitive, context: js.Any): js.Any = js.native
  def visitMethodCall(ast: MethodCall, context: js.Any): js.Any = js.native
  def visitNonNullAssert(ast: NonNullAssert, context: js.Any): js.Any = js.native
  def visitPipe(ast: BindingPipe, context: js.Any): js.Any = js.native
  def visitPrefixNot(ast: PrefixNot, context: js.Any): js.Any = js.native
  def visitPropertyRead(ast: PropertyRead, context: js.Any): js.Any = js.native
  def visitPropertyWrite(ast: PropertyWrite, context: js.Any): js.Any = js.native
  def visitQuote(ast: Quote, context: js.Any): js.Any = js.native
  def visitSafeMethodCall(ast: SafeMethodCall, context: js.Any): js.Any = js.native
  def visitSafePropertyRead(ast: SafePropertyRead, context: js.Any): js.Any = js.native
}

object AstVisitor {
  @scala.inline
  def apply(
    visitBinary: (Binary, js.Any) => js.Any,
    visitChain: (Chain, js.Any) => js.Any,
    visitConditional: (Conditional, js.Any) => js.Any,
    visitFunctionCall: (FunctionCall, js.Any) => js.Any,
    visitImplicitReceiver: (ImplicitReceiver, js.Any) => js.Any,
    visitInterpolation: (Interpolation, js.Any) => js.Any,
    visitKeyedRead: (KeyedRead, js.Any) => js.Any,
    visitKeyedWrite: (KeyedWrite, js.Any) => js.Any,
    visitLiteralArray: (LiteralArray, js.Any) => js.Any,
    visitLiteralMap: (LiteralMap, js.Any) => js.Any,
    visitLiteralPrimitive: (LiteralPrimitive, js.Any) => js.Any,
    visitMethodCall: (MethodCall, js.Any) => js.Any,
    visitNonNullAssert: (NonNullAssert, js.Any) => js.Any,
    visitPipe: (BindingPipe, js.Any) => js.Any,
    visitPrefixNot: (PrefixNot, js.Any) => js.Any,
    visitPropertyRead: (PropertyRead, js.Any) => js.Any,
    visitPropertyWrite: (PropertyWrite, js.Any) => js.Any,
    visitQuote: (Quote, js.Any) => js.Any,
    visitSafeMethodCall: (SafeMethodCall, js.Any) => js.Any,
    visitSafePropertyRead: (SafePropertyRead, js.Any) => js.Any
  ): AstVisitor = {
    val __obj = js.Dynamic.literal(visitBinary = js.Any.fromFunction2(visitBinary), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitFunctionCall = js.Any.fromFunction2(visitFunctionCall), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitMethodCall = js.Any.fromFunction2(visitMethodCall), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitQuote = js.Any.fromFunction2(visitQuote), visitSafeMethodCall = js.Any.fromFunction2(visitSafeMethodCall), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead))
    __obj.asInstanceOf[AstVisitor]
  }
  @scala.inline
  implicit class AstVisitorOps[Self <: AstVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitBinary(value: (Binary, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBinary")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitChain(value: (Chain, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitChain")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitConditional(value: (Conditional, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitConditional")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitFunctionCall(value: (FunctionCall, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitFunctionCall")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitImplicitReceiver(value: (ImplicitReceiver, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitImplicitReceiver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitInterpolation(value: (Interpolation, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitInterpolation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitKeyedRead(value: (KeyedRead, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitKeyedRead")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitKeyedWrite(value: (KeyedWrite, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitKeyedWrite")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitLiteralArray(value: (LiteralArray, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteralArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitLiteralMap(value: (LiteralMap, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteralMap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitLiteralPrimitive(value: (LiteralPrimitive, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitLiteralPrimitive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitMethodCall(value: (MethodCall, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitMethodCall")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitNonNullAssert(value: (NonNullAssert, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNonNullAssert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitPipe(value: (BindingPipe, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPipe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitPrefixNot(value: (PrefixNot, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPrefixNot")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitPropertyRead(value: (PropertyRead, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPropertyRead")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitPropertyWrite(value: (PropertyWrite, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPropertyWrite")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitQuote(value: (Quote, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitQuote")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitSafeMethodCall(value: (SafeMethodCall, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSafeMethodCall")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitSafePropertyRead(value: (SafePropertyRead, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitSafePropertyRead")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisit(value: (/* ast */ AST, /* context */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVisit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitASTWithSource(value: (/* ast */ ASTWithSource, /* context */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitASTWithSource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVisitASTWithSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitASTWithSource")(js.undefined)
        ret
    }
  }
  
}

