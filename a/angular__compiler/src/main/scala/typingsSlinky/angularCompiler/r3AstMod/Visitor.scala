package typingsSlinky.angularCompiler.r3AstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor[Result] extends js.Object {
  var visit: js.UndefOr[js.Function1[/* node */ Node, Result]] = js.native
  def visitBoundAttribute(attribute: BoundAttribute): Result = js.native
  def visitBoundEvent(attribute: BoundEvent): Result = js.native
  def visitBoundText(text: BoundText): Result = js.native
  def visitContent(content: Content): Result = js.native
  def visitElement(element: Element): Result = js.native
  def visitIcu(icu: Icu): Result = js.native
  def visitReference(reference: Reference): Result = js.native
  def visitTemplate(template: Template): Result = js.native
  def visitText(text: Text): Result = js.native
  def visitTextAttribute(attribute: TextAttribute): Result = js.native
  def visitVariable(variable: Variable): Result = js.native
}

object Visitor {
  @scala.inline
  def apply[Result](
    visitBoundAttribute: BoundAttribute => Result,
    visitBoundEvent: BoundEvent => Result,
    visitBoundText: BoundText => Result,
    visitContent: Content => Result,
    visitElement: Element => Result,
    visitIcu: Icu => Result,
    visitReference: Reference => Result,
    visitTemplate: Template => Result,
    visitText: Text => Result,
    visitTextAttribute: TextAttribute => Result,
    visitVariable: Variable => Result
  ): Visitor[Result] = {
    val __obj = js.Dynamic.literal(visitBoundAttribute = js.Any.fromFunction1(visitBoundAttribute), visitBoundEvent = js.Any.fromFunction1(visitBoundEvent), visitBoundText = js.Any.fromFunction1(visitBoundText), visitContent = js.Any.fromFunction1(visitContent), visitElement = js.Any.fromFunction1(visitElement), visitIcu = js.Any.fromFunction1(visitIcu), visitReference = js.Any.fromFunction1(visitReference), visitTemplate = js.Any.fromFunction1(visitTemplate), visitText = js.Any.fromFunction1(visitText), visitTextAttribute = js.Any.fromFunction1(visitTextAttribute), visitVariable = js.Any.fromFunction1(visitVariable))
    __obj.asInstanceOf[Visitor[Result]]
  }
  @scala.inline
  implicit class VisitorOps[Self[result] <: Visitor[result], Result] (val x: Self[Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Result] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Result]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Result] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Result] with Other]
    @scala.inline
    def withVisitBoundAttribute(value: BoundAttribute => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBoundAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitBoundEvent(value: BoundEvent => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBoundEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitBoundText(value: BoundText => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitBoundText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitContent(value: Content => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitElement(value: Element => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitIcu(value: Icu => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitIcu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitReference(value: Reference => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitReference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitTemplate(value: Template => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitText(value: Text => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitTextAttribute(value: TextAttribute => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTextAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitVariable(value: Variable => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisit(value: /* node */ Node => Result): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVisit: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.undefined)
        ret
    }
  }
  
}

