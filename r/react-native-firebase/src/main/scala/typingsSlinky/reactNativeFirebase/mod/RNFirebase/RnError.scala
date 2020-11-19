package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RnError extends Error {
  
  var code: js.UndefOr[String] = js.native
}
object RnError {
  
  @scala.inline
  def apply(message: String, name: String): RnError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RnError]
  }
  
  @scala.inline
  implicit class RnErrorOps[Self <: RnError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
}
