package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRealtimeLogConfigsResult extends StObject {
  
  /**
    * A list of real-time log configurations.
    */
  var RealtimeLogConfigs: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.RealtimeLogConfigs] = js.native
}
object ListRealtimeLogConfigsResult {
  
  @scala.inline
  def apply(): ListRealtimeLogConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRealtimeLogConfigsResult]
  }
  
  @scala.inline
  implicit class ListRealtimeLogConfigsResultMutableBuilder[Self <: ListRealtimeLogConfigsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealtimeLogConfigs(value: RealtimeLogConfigs): Self = StObject.set(x, "RealtimeLogConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeLogConfigsUndefined: Self = StObject.set(x, "RealtimeLogConfigs", js.undefined)
  }
}
