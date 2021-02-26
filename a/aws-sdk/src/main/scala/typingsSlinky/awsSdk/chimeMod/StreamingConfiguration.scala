package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingConfiguration extends StObject {
  
  /**
    * The retention period, in hours, for the Amazon Kinesis data.
    */
  var DataRetentionInHours: typingsSlinky.awsSdk.chimeMod.DataRetentionInHours = js.native
  
  /**
    * When true, media streaming to Amazon Kinesis is turned off.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The streaming notification targets.
    */
  var StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList] = js.native
}
object StreamingConfiguration {
  
  @scala.inline
  def apply(DataRetentionInHours: DataRetentionInHours): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataRetentionInHours = DataRetentionInHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
  
  @scala.inline
  implicit class StreamingConfigurationMutableBuilder[Self <: StreamingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRetentionInHours(value: DataRetentionInHours): Self = StObject.set(x, "DataRetentionInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setStreamingNotificationTargets(value: StreamingNotificationTargetList): Self = StObject.set(x, "StreamingNotificationTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingNotificationTargetsUndefined: Self = StObject.set(x, "StreamingNotificationTargets", js.undefined)
    
    @scala.inline
    def setStreamingNotificationTargetsVarargs(value: StreamingNotificationTarget*): Self = StObject.set(x, "StreamingNotificationTargets", js.Array(value :_*))
  }
}
