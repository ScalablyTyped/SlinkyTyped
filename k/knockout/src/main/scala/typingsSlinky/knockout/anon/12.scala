package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.Node
import typingsSlinky.knockout.mod.AllBindings
import typingsSlinky.knockout.mod.BindingContext
import typingsSlinky.knockout.mod.BindingHandlerControlsDescendant
import typingsSlinky.knockout.mod.MaybeSubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends js.Object {
  
  def init(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[Name]],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[_]
  ): BindingHandlerControlsDescendant = js.native
}
object `12` {
  
  @scala.inline
  def apply(
    init: (Node, js.Function0[MaybeSubscribable[Name]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
  ): `12` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12Ops`[Self <: `12`] (val x: Self) extends AnyVal {
    
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
    def setInit(
      value: (Node, js.Function0[MaybeSubscribable[Name]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
    ): Self = this.set("init", js.Any.fromFunction5(value))
  }
}
