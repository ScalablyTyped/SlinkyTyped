package typingsSlinky.parse.mod.global.Parse.Push

import typingsSlinky.parse.mod.global.Parse.Error
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendOptions extends UseMasterKeyOption {
  
  var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object SendOptions {
  
  @scala.inline
  def apply(): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendOptions]
  }
  
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
    
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
    def setError(value: /* error */ Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
