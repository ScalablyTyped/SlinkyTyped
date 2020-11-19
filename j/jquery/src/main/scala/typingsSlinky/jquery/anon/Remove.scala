package typingsSlinky.jquery.anon

import typingsSlinky.jquery.JQuery.HandleObject
import typingsSlinky.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remove[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  
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
  implicit class RemoveOps[Self <: Remove[_, _], TTarget, TData] (val x: Self with (Remove[TTarget, TData])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRemove(value: HandleObject[TTarget, TData] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
