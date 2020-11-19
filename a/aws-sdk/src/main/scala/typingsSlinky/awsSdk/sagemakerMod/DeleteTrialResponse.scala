package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrialResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the trial that is being deleted.
    */
  var TrialArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialArn] = js.native
}
object DeleteTrialResponse {
  
  @scala.inline
  def apply(): DeleteTrialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrialResponse]
  }
  
  @scala.inline
  implicit class DeleteTrialResponseOps[Self <: DeleteTrialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = this.set("TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialArn: Self = this.set("TrialArn", js.undefined)
  }
}
