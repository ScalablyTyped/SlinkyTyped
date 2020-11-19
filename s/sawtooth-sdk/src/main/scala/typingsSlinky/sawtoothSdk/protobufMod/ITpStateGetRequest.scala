package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateGetRequest extends js.Object {
  
  /** TpStateGetRequest addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TpStateGetRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
}
object ITpStateGetRequest {
  
  @scala.inline
  def apply(): ITpStateGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateGetRequest]
  }
  
  @scala.inline
  implicit class ITpStateGetRequestOps[Self <: ITpStateGetRequest] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setAddressesNull: Self = this.set("addresses", null)
    
    @scala.inline
    def setContextId(value: String): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextId: Self = this.set("contextId", js.undefined)
    
    @scala.inline
    def setContextIdNull: Self = this.set("contextId", null)
  }
}
