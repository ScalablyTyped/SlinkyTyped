package typingsSlinky.babylonjs.anon

import org.scalajs.dom.raw.FocusEvent
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerName extends js.Object {
  
  var handler: Nullable[js.Function1[/* e */ FocusEvent, _]] = js.native
  
  var name: String = js.native
}
object HandlerName {
  
  @scala.inline
  def apply(name: String): HandlerName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerName]
  }
  
  @scala.inline
  implicit class HandlerNameOps[Self <: HandlerName] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: /* e */ FocusEvent => _): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlerNull: Self = this.set("handler", null)
  }
}
