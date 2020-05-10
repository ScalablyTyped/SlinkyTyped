package typingsSlinky.angularCompiler.mlParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* node */ Node, /* context */ js.Any, _]] = js.native
  def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
  def visitComment(comment: Comment, context: js.Any): js.Any = js.native
  def visitElement(element: Element, context: js.Any): js.Any = js.native
  def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
  def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
  def visitText(text: Text, context: js.Any): js.Any = js.native
}

object Visitor {
  @scala.inline
  def apply(
    visitAttribute: (Attribute, js.Any) => js.Any,
    visitComment: (Comment, js.Any) => js.Any,
    visitElement: (Element, js.Any) => js.Any,
    visitExpansion: (Expansion, js.Any) => js.Any,
    visitExpansionCase: (ExpansionCase, js.Any) => js.Any,
    visitText: (Text, js.Any) => js.Any
  ): Visitor = {
    val __obj = js.Dynamic.literal(visitAttribute = js.Any.fromFunction2(visitAttribute), visitComment = js.Any.fromFunction2(visitComment), visitElement = js.Any.fromFunction2(visitElement), visitExpansion = js.Any.fromFunction2(visitExpansion), visitExpansionCase = js.Any.fromFunction2(visitExpansionCase), visitText = js.Any.fromFunction2(visitText))
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitAttribute(value: (Attribute, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitComment(value: (Comment, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitComment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitElement(value: (Element, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitExpansion(value: (Expansion, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExpansion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitExpansionCase(value: (ExpansionCase, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitExpansionCase")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitText(value: (Text, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisit(value: (/* node */ Node, /* context */ js.Any) => _): Self = {
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
  }
  
}

