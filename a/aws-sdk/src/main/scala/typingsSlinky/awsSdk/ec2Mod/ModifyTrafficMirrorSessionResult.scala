package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTrafficMirrorSessionResult extends js.Object {
  
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorSession] = js.native
}
object ModifyTrafficMirrorSessionResult {
  
  @scala.inline
  def apply(): ModifyTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorSessionResult]
  }
  
  @scala.inline
  implicit class ModifyTrafficMirrorSessionResultOps[Self <: ModifyTrafficMirrorSessionResult] (val x: Self) extends AnyVal {
    
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
    def setTrafficMirrorSession(value: TrafficMirrorSession): Self = this.set("TrafficMirrorSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorSession: Self = this.set("TrafficMirrorSession", js.undefined)
  }
}
