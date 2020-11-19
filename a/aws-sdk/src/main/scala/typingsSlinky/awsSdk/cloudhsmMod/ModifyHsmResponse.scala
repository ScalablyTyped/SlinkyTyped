package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyHsmResponse extends js.Object {
  
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HsmArn] = js.native
}
object ModifyHsmResponse {
  
  @scala.inline
  def apply(): ModifyHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyHsmResponse]
  }
  
  @scala.inline
  implicit class ModifyHsmResponseOps[Self <: ModifyHsmResponse] (val x: Self) extends AnyVal {
    
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
    def setHsmArn(value: HsmArn): Self = this.set("HsmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmArn: Self = this.set("HsmArn", js.undefined)
  }
}
