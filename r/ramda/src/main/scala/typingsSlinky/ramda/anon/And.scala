package typingsSlinky.ramda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait And extends js.Object {
  var and: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object And {
  @scala.inline
  def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  @scala.inline
  implicit class AndOps[Self <: And] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.undefined)
        ret
    }
  }
  
}

