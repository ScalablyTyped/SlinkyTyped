package typingsSlinky.prosemirrorTestBuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EqMethod extends js.Object {
  def eq(param: EqMethod): Boolean = js.native
}

object EqMethod {
  @scala.inline
  def apply(eq: EqMethod => Boolean): EqMethod = {
    val __obj = js.Dynamic.literal(eq = js.Any.fromFunction1(eq))
    __obj.asInstanceOf[EqMethod]
  }
  @scala.inline
  implicit class EqMethodOps[Self <: EqMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEq(value: EqMethod => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

