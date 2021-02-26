package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRealtimeLogConfigResult extends StObject {
  
  /**
    * A real-time log configuration.
    */
  var RealtimeLogConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.RealtimeLogConfig] = js.native
}
object UpdateRealtimeLogConfigResult {
  
  @scala.inline
  def apply(): UpdateRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRealtimeLogConfigResult]
  }
  
  @scala.inline
  implicit class UpdateRealtimeLogConfigResultMutableBuilder[Self <: UpdateRealtimeLogConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealtimeLogConfig(value: RealtimeLogConfig): Self = StObject.set(x, "RealtimeLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeLogConfigUndefined: Self = StObject.set(x, "RealtimeLogConfig", js.undefined)
  }
}
