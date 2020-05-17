package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery.Event
import typingsSlinky.cypress.JQuery.SpecialEventHook
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreDispatch[TTarget]
  extends SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: Event): `false` | Unit = js.native
}

object PreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: Event => `false` | Unit): PreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
    __obj.asInstanceOf[PreDispatch[TTarget]]
  }
  @scala.inline
  implicit class PreDispatchOps[Self[ttarget] <: PreDispatch[ttarget], TTarget] (val x: Self[TTarget]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTarget] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTarget] with Other]
    @scala.inline
    def withPreDispatch(value: Event => `false` | Unit): Self[TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDispatch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

