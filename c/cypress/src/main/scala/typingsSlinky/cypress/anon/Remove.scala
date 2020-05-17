package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery.HandleObject
import typingsSlinky.cypress.JQuery.SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remove[TTarget, TData] extends SpecialEventHook[TTarget, TData] {
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  def remove(handleObj: HandleObject[TTarget, TData]): Unit = js.native
}

object Remove {
  @scala.inline
  def apply[TTarget, TData](remove: HandleObject[TTarget, TData] => Unit): Remove[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Remove[TTarget, TData]]
  }
  @scala.inline
  implicit class RemoveOps[Self[ttarget, tdata] <: Remove[ttarget, tdata], TTarget, TData] (val x: Self[TTarget, TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget, TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget, TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTarget, TData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTarget, TData]) with Other]
    @scala.inline
    def withRemove(value: HandleObject[TTarget, TData] => Unit): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

