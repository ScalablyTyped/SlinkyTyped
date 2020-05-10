package typingsSlinky.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait helpers extends js.Object {
  def helperExpression(node: Node): Boolean = js.native
  def scopeId(path: PathExpression): Boolean = js.native
  def simpleId(path: PathExpression): Boolean = js.native
}

object helpers {
  @scala.inline
  def apply(
    helperExpression: Node => Boolean,
    scopeId: PathExpression => Boolean,
    simpleId: PathExpression => Boolean
  ): helpers = {
    val __obj = js.Dynamic.literal(helperExpression = js.Any.fromFunction1(helperExpression), scopeId = js.Any.fromFunction1(scopeId), simpleId = js.Any.fromFunction1(simpleId))
    __obj.asInstanceOf[helpers]
  }
  @scala.inline
  implicit class helpersOps[Self <: helpers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHelperExpression(value: Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScopeId(value: PathExpression => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSimpleId(value: PathExpression => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

