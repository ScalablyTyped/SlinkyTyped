package typingsSlinky.cypress

import typingsSlinky.cypress.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: typingsSlinky.cypress.JQuery_.Event): Unit = js.native
}

object AnonPostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: typingsSlinky.cypress.JQuery_.Event => Unit): AnonPostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[AnonPostDispatch[TTarget]]
  }
  @scala.inline
  implicit class AnonPostDispatchOps[Self[ttarget] <: AnonPostDispatch[ttarget], TTarget] (val x: Self[TTarget]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTarget] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTarget] with Other]
    @scala.inline
    def withPostDispatch(value: typingsSlinky.cypress.JQuery_.Event => Unit): Self[TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDispatch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

