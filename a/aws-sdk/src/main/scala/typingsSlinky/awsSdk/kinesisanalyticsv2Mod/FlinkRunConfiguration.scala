package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlinkRunConfiguration extends StObject {
  
  /**
    * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. This will happen if the program is updated between snapshots to remove stateful parameters, and state data in the snapshot no longer corresponds to valid application data. For more information, see  Allowing Non-Restored State in the Apache Flink documentation.  This value defaults to false. If you update your application without specifying this parameter, AllowNonRestoredState will be set to false, even if it was previously set to true. 
    */
  var AllowNonRestoredState: js.UndefOr[BooleanObject] = js.native
}
object FlinkRunConfiguration {
  
  @scala.inline
  def apply(): FlinkRunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkRunConfiguration]
  }
  
  @scala.inline
  implicit class FlinkRunConfigurationMutableBuilder[Self <: FlinkRunConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNonRestoredState(value: BooleanObject): Self = StObject.set(x, "AllowNonRestoredState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNonRestoredStateUndefined: Self = StObject.set(x, "AllowNonRestoredState", js.undefined)
  }
}
