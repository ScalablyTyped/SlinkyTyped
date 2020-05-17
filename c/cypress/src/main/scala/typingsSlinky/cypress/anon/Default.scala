package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery.SpecialEventHook
import typingsSlinky.cypress.JQuery.TriggeredEvent
import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default[TTarget, TData] extends SpecialEventHook[TTarget, TData] {
  /**
    * When the `.trigger()` method finishes running all the event handlers for an event, it also looks for and runs any method on the target object by the same name unless of the handlers called `event.preventDefault()`. So, `.trigger( "submit" )` will execute the `submit()` method on the element if one exists. When a `_default` hook is specified, the hook is called just prior to checking for and executing the element's default method. If this hook returns the value `false` the element's default method will be called; otherwise it is not.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#_default-function-event-jquery-event-data-object }\`
    */
  def _default(event: TriggeredEvent[TTarget, TData, _, _], data: TData): Unit | `false` = js.native
}

object Default {
  @scala.inline
  def apply[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, _, _], TData) => Unit | `false`): Default[TTarget, TData] = {
    val __obj = js.Dynamic.literal(_default = js.Any.fromFunction2(_default))
    __obj.asInstanceOf[Default[TTarget, TData]]
  }
  @scala.inline
  implicit class DefaultOps[Self[ttarget, tdata] <: Default[ttarget, tdata], TTarget, TData] (val x: Self[TTarget, TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget, TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget, TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTarget, TData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTarget, TData]) with Other]
    @scala.inline
    def with_default(value: (TriggeredEvent[TTarget, TData, _, _], TData) => Unit | `false`): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_default")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

