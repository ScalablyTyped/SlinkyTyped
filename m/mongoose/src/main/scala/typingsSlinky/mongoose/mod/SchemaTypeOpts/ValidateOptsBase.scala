package typingsSlinky.mongoose.mod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateOptsBase extends js.Object {
  
  var message: js.UndefOr[String | ValidatorMessageFn] = js.native
  
  var msg: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ValidateOptsBase {
  
  @scala.inline
  def apply(): ValidateOptsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptsBase]
  }
  
  @scala.inline
  implicit class ValidateOptsBaseOps[Self <: ValidateOptsBase] (val x: Self) extends AnyVal {
    
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
    def setMessageFunction1(value: /* props */ ValidatorProps => String): Self = this.set("message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessage(value: String | ValidatorMessageFn): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
