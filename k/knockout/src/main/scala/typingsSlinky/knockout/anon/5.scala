package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.Node
import typingsSlinky.knockout.mod.AllBindings
import typingsSlinky.knockout.mod.BindingContext
import typingsSlinky.knockout.mod.BindingHandlerControlsDescendant
import typingsSlinky.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  def init(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[js.Object]],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[_]
  ): BindingHandlerControlsDescendant = js.native
}
object `5` {
  
  @scala.inline
  def apply(
    init: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
  ): `5` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(
      value: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
  }
}
