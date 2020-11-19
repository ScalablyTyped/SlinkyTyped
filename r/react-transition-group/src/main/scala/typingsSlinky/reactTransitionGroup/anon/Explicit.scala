package typingsSlinky.reactTransitionGroup.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explicit[ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, Unit] */] extends js.Object {
  
  var explicit: ExplicitRefHandler = js.native
  
  var `implicit`: ImplicitRefHandler = js.native
}
object Explicit {
  
  @scala.inline
  def apply[ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, Unit] */](explicit: ExplicitRefHandler, `implicit`: ImplicitRefHandler): Explicit[ImplicitRefHandler, ExplicitRefHandler] = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explicit[ImplicitRefHandler, ExplicitRefHandler]]
  }
  
  @scala.inline
  implicit class ExplicitOps[Self <: Explicit[_, _], ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, Unit] */] (val x: Self with (Explicit[ImplicitRefHandler, ExplicitRefHandler])) extends AnyVal {
    
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
    def setExplicit(value: ExplicitRefHandler): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicit(value: ImplicitRefHandler): Self = this.set("implicit", value.asInstanceOf[js.Any])
  }
}
