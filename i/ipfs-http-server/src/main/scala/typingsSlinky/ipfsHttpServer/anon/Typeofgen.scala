package typingsSlinky.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgen extends js.Object {
  
  def handler_3(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_6: Typeofoptions6 = js.native
}
object Typeofgen {
  
  @scala.inline
  def apply(handler_3: (js.Any, js.Any) => js.Promise[_], options_6: Typeofoptions6): Typeofgen = {
    val __obj = js.Dynamic.literal(handler_3 = js.Any.fromFunction2(handler_3), options_6 = options_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgen]
  }
  
  @scala.inline
  implicit class TypeofgenOps[Self <: Typeofgen] (val x: Self) extends AnyVal {
    
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
    def setHandler_3(value: (js.Any, js.Any) => js.Promise[_]): Self = this.set("handler_3", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_6(value: Typeofoptions6): Self = this.set("options_6", value.asInstanceOf[js.Any])
  }
}
