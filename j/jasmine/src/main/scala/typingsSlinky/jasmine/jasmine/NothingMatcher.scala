package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NothingMatcher extends js.Object {
  def nothing(): Unit = js.native
}

object NothingMatcher {
  @scala.inline
  def apply(nothing: () => Unit): NothingMatcher = {
    val __obj = js.Dynamic.literal(nothing = js.Any.fromFunction0(nothing))
    __obj.asInstanceOf[NothingMatcher]
  }
  @scala.inline
  implicit class NothingMatcherOps[Self <: NothingMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNothing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothing")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

