package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.knockout.mod.MaybeSubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends js.Object {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]]): Unit = js.native
}
object Update {
  
  @scala.inline
  def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit): Update = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
