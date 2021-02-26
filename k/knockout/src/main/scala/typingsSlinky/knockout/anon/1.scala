package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[String | js.Object]]): Unit = js.native
}
object `1` {
  
  @scala.inline
  def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[String | js.Object]]) => Unit): `1` = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[String | js.Object]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
