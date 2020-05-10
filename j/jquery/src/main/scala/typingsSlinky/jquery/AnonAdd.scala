package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery_.HandleObject
import typingsSlinky.jquery.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * Each time an event handler is added to an element through an API such as `.on()`, jQuery calls this hook. The `this` keyword will be the element to which the event handler is being added, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#add-function-handleobj }\`
    */
  def add(handleObj: HandleObject[TTarget, TData]): Unit = js.native
}

object AnonAdd {
  @scala.inline
  def apply[TTarget, TData](add: HandleObject[TTarget, TData] => Unit): AnonAdd[TTarget, TData] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    __obj.asInstanceOf[AnonAdd[TTarget, TData]]
  }
  @scala.inline
  implicit class AnonAddOps[Self[ttarget, tdata] <: AnonAdd[ttarget, tdata], TTarget, TData] (val x: Self[TTarget, TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget, TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget, TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTarget, TData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTarget, TData]) with Other]
    @scala.inline
    def withAdd(value: HandleObject[TTarget, TData] => Unit): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

