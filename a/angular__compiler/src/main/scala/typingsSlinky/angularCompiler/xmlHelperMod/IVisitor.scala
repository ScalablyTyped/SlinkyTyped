package typingsSlinky.angularCompiler.xmlHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVisitor extends js.Object {
  def visitDeclaration(decl: Declaration): js.Any = js.native
  def visitDoctype(doctype: Doctype): js.Any = js.native
  def visitTag(tag: Tag): js.Any = js.native
  def visitText(text: Text): js.Any = js.native
}

object IVisitor {
  @scala.inline
  def apply(
    visitDeclaration: Declaration => js.Any,
    visitDoctype: Doctype => js.Any,
    visitTag: Tag => js.Any,
    visitText: Text => js.Any
  ): IVisitor = {
    val __obj = js.Dynamic.literal(visitDeclaration = js.Any.fromFunction1(visitDeclaration), visitDoctype = js.Any.fromFunction1(visitDoctype), visitTag = js.Any.fromFunction1(visitTag), visitText = js.Any.fromFunction1(visitText))
    __obj.asInstanceOf[IVisitor]
  }
  @scala.inline
  implicit class IVisitorOps[Self <: IVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitDeclaration(value: Declaration => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDeclaration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitDoctype(value: Doctype => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitDoctype")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitTag(value: Tag => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitText(value: Text => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

