package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.knockout.mod.AllBindings
import typingsSlinky.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitUpdate extends StObject {
  
  def init(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]], allBindings: AllBindings): Unit = js.native
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]]): Unit = js.native
}
object InitUpdate {
  
  @scala.inline
  def apply(
    init: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit,
    update: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit
  ): InitUpdate = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[InitUpdate]
  }
  
  @scala.inline
  implicit class InitUpdateMutableBuilder[Self <: InitUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
