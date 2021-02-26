package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.knockout.mod.AllBindings
import typingsSlinky.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterInit extends StObject {
  
  var after: js.Array[String] = js.native
  
  def init(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]], allBindings: AllBindings): Unit = js.native
}
object AfterInit {
  
  @scala.inline
  def apply(
    after: js.Array[String],
    init: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit
  ): AfterInit = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[AfterInit]
  }
  
  @scala.inline
  implicit class AfterInitMutableBuilder[Self <: AfterInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
  }
}
