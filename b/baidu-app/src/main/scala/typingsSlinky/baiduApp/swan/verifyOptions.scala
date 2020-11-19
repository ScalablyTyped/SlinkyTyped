package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait verifyOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_verifyOptions: js.UndefOr[js.Function1[/* res */ verifyTask, Unit]] = js.native
}
object verifyOptions {
  
  @scala.inline
  def apply(): verifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[verifyOptions]
  }
  
  @scala.inline
  implicit class verifyOptionsOps[Self <: verifyOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: /* res */ verifyTask => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
