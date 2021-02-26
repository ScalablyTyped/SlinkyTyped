package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.knockout.mod.AllBindings
import typingsSlinky.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterInitUpdate extends StObject {
  
  var after: js.Array[String] = js.native
  
  def init(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]], allBindings: AllBindings): Unit = js.native
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]]): Unit = js.native
}
object AfterInitUpdate {
  
  @scala.inline
  def apply(
    after: js.Array[String],
    init: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit,
    update: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit
  ): AfterInitUpdate = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], init = js.Any.fromFunction3(init), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[AfterInitUpdate]
  }
  
  @scala.inline
  implicit class AfterInitUpdateMutableBuilder[Self <: AfterInitUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
