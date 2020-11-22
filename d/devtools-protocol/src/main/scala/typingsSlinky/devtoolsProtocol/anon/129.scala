package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay.HighlightSourceOrderRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `129` extends js.Object {
  
  var paramsType: js.Array[HighlightSourceOrderRequest] = js.native
  
  var returnType: Unit = js.native
}
object `129` {
  
  @scala.inline
  def apply(paramsType: js.Array[HighlightSourceOrderRequest], returnType: Unit): `129` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit class `129Ops`[Self <: `129`] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: HighlightSourceOrderRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[HighlightSourceOrderRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: Unit): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
