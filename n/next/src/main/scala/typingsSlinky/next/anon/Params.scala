package typingsSlinky.next.anon

import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params[P /* <: ParsedUrlQuery */] extends js.Object {
  
  var params: P = js.native
}
object Params {
  
  @scala.inline
  def apply[P /* <: ParsedUrlQuery */](params: P): Params[P] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params[P]]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params[_], P /* <: ParsedUrlQuery */] (val x: Self with Params[P]) extends AnyVal {
    
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
    def setParams(value: P): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
