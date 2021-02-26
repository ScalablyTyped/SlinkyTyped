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
trait `3` extends StObject {
  
  def init(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[js.Array[_] | _]],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[_]
  ): BindingHandlerControlsDescendant = js.native
}
object `3` {
  
  @scala.inline
  def apply(
    init: (Node, js.Function0[MaybeSubscribable[js.Array[_] | _]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
  ): `3` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(
      value: (Node, js.Function0[MaybeSubscribable[js.Array[_] | _]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
  }
}
