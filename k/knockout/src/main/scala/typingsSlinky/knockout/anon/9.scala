package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.knockout.mod.AllBindings
import typingsSlinky.knockout.mod.BindingHandlerControlsDescendant
import typingsSlinky.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `9` extends StObject {
  
  def init(element: HTMLElement): BindingHandlerControlsDescendant = js.native
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]], allBindings: AllBindings): Unit = js.native
}
object `9` {
  
  @scala.inline
  def apply(
    init: HTMLElement => BindingHandlerControlsDescendant,
    update: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit
  ): `9` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: HTMLElement => BindingHandlerControlsDescendant): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
