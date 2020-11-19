package typingsSlinky.formData.mod

import typingsSlinky.formData.formDataStrings.httpColon
import typingsSlinky.formData.formDataStrings.httpsColon
import typingsSlinky.node.httpMod.ClientRequestArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitOptions extends ClientRequestArgs {
  
  @JSName("protocol")
  var protocol_SubmitOptions: js.UndefOr[httpsColon | httpColon] = js.native
}
object SubmitOptions {
  
  @scala.inline
  def apply(): SubmitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitOptions]
  }
  
  @scala.inline
  implicit class SubmitOptionsOps[Self <: SubmitOptions] (val x: Self) extends AnyVal {
    
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
    def setProtocol(value: httpsColon | httpColon): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
}
