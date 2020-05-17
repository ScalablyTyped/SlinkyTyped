package typingsSlinky.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BetweenBuilder extends js.Object {
  def and(end: js.Any): SimpleMatcher = js.native
}

object BetweenBuilder {
  @scala.inline
  def apply(and: js.Any => SimpleMatcher): BetweenBuilder = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and))
    __obj.asInstanceOf[BetweenBuilder]
  }
  @scala.inline
  implicit class BetweenBuilderOps[Self <: BetweenBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: js.Any => SimpleMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

