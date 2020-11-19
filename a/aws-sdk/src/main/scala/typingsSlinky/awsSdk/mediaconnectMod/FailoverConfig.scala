package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverConfig extends js.Object {
  
  /**
    * Search window time to look for dash-7 packets
    */
  var RecoveryWindow: js.UndefOr[integer] = js.native
  
  var State: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.State] = js.native
}
object FailoverConfig {
  
  @scala.inline
  def apply(): FailoverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverConfig]
  }
  
  @scala.inline
  implicit class FailoverConfigOps[Self <: FailoverConfig] (val x: Self) extends AnyVal {
    
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
    def setRecoveryWindow(value: integer): Self = this.set("RecoveryWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryWindow: Self = this.set("RecoveryWindow", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
