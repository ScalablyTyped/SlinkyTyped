package typingsSlinky.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends js.Object {
  
  def method(request: js.Any, h: js.Any): js.Any = js.native
}
object `1` {
  
  @scala.inline
  def apply(method: (js.Any, js.Any) => js.Any): `1` = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: (js.Any, js.Any) => js.Any): Self = this.set("method", js.Any.fromFunction2(value))
  }
}
