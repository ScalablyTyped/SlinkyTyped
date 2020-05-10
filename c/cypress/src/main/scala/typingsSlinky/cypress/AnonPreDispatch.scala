package typingsSlinky.cypress

import typingsSlinky.cypress.JQuery_._SpecialEventHook
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: typingsSlinky.cypress.JQuery_.Event): `false` | Unit = js.native
}

object AnonPreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: typingsSlinky.cypress.JQuery_.Event => `false` | Unit): AnonPreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
    __obj.asInstanceOf[AnonPreDispatch[TTarget]]
  }
  @scala.inline
  implicit class AnonPreDispatchOps[Self[ttarget] <: AnonPreDispatch[ttarget], TTarget] (val x: Self[TTarget]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTarget] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTarget] with Other]
    @scala.inline
    def withPreDispatch(value: typingsSlinky.cypress.JQuery_.Event => `false` | Unit): Self[TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDispatch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

