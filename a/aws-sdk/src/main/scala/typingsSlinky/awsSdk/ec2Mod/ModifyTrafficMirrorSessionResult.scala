package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTrafficMirrorSessionResult extends StObject {
  
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
  implicit class ModifyTrafficMirrorSessionResultMutableBuilder[Self <: ModifyTrafficMirrorSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficMirrorSession(value: TrafficMirrorSession): Self = StObject.set(x, "TrafficMirrorSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorSessionUndefined: Self = StObject.set(x, "TrafficMirrorSession", js.undefined)
  }
}
