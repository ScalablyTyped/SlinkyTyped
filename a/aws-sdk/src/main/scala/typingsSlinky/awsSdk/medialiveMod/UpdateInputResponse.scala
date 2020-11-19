package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputResponse extends js.Object {
  
  var Input: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Input] = js.native
}
object UpdateInputResponse {
  
  @scala.inline
  def apply(): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputResponse]
  }
  
  @scala.inline
  implicit class UpdateInputResponseOps[Self <: UpdateInputResponse] (val x: Self) extends AnyVal {
    
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
    def setInput(value: Input): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
  }
}
