package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJobOutput extends js.Object {
  
  var Success: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Success] = js.native
}
object CancelJobOutput {
  
  @scala.inline
  def apply(): CancelJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJobOutput]
  }
  
  @scala.inline
  implicit class CancelJobOutputOps[Self <: CancelJobOutput] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: Success): Self = this.set("Success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("Success", js.undefined)
  }
}
