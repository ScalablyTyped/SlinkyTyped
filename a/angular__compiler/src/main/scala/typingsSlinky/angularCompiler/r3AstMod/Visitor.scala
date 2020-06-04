package typingsSlinky.angularCompiler.r3AstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[Result] extends js.Object {
  var visit: js.UndefOr[js.Function1[/* node */ Node, Result]] = js.undefined
  def visitBoundAttribute(attribute: BoundAttribute): Result
  def visitBoundEvent(attribute: BoundEvent): Result
  def visitBoundText(text: BoundText): Result
  def visitContent(content: Content): Result
  def visitElement(element: Element): Result
  def visitIcu(icu: Icu): Result
  def visitReference(reference: Reference): Result
  def visitTemplate(template: Template): Result
  def visitText(text: Text): Result
  def visitTextAttribute(attribute: TextAttribute): Result
  def visitVariable(variable: Variable): Result
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
  implicit class VisitorOps[Self <: Visitor[_], Result] (val x: Self with Visitor[Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVisitBoundAttribute(value: BoundAttribute => Result): Self = this.set("visitBoundAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitBoundEvent(value: BoundEvent => Result): Self = this.set("visitBoundEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitBoundText(value: BoundText => Result): Self = this.set("visitBoundText", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitContent(value: Content => Result): Self = this.set("visitContent", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitElement(value: Element => Result): Self = this.set("visitElement", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitIcu(value: Icu => Result): Self = this.set("visitIcu", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitReference(value: Reference => Result): Self = this.set("visitReference", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitTemplate(value: Template => Result): Self = this.set("visitTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitText(value: Text => Result): Self = this.set("visitText", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitTextAttribute(value: TextAttribute => Result): Self = this.set("visitTextAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitVariable(value: Variable => Result): Self = this.set("visitVariable", js.Any.fromFunction1(value))
    @scala.inline
    def setVisit(value: /* node */ Node => Result): Self = this.set("visit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVisit: Self = this.set("visit", js.undefined)
  }
  
}

