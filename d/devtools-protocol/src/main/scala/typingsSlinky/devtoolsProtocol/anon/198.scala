package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Tethering.BindRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `198` extends js.Object {
  
  var paramsType: js.Array[BindRequest] = js.native
  
  var returnType: Unit = js.native
}
object `198` {
  
  @scala.inline
  def apply(paramsType: js.Array[BindRequest], returnType: Unit): `198` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`198`]
  }
  
  @scala.inline
  implicit class `198Ops`[Self <: `198`] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: BindRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[BindRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: Unit): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
