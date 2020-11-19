package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetSystemInfoOptions: js.UndefOr[js.Function1[/* res */ SystemInfo, Unit]] = js.native
}
object GetSystemInfoOptions {
  
  @scala.inline
  def apply(): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
  
  @scala.inline
  implicit class GetSystemInfoOptionsOps[Self <: GetSystemInfoOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: /* res */ SystemInfo => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
