package typingsSlinky.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeHandlerSubmitLoginFormOptions extends js.Object {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var parameters: js.UndefOr[js.Object] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ChallengeHandlerSubmitLoginFormOptions {
  
  @scala.inline
  def apply(): ChallengeHandlerSubmitLoginFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeHandlerSubmitLoginFormOptions]
  }
  
  @scala.inline
  implicit class ChallengeHandlerSubmitLoginFormOptionsOps[Self <: ChallengeHandlerSubmitLoginFormOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Object): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
