package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckpointConfigurationDescription extends StObject {
  
  /**
    * Describes the interval in milliseconds between checkpoint operations.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval vaue of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointInterval: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CheckpointInterval] = js.native
  
  /**
    * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.   If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationType: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ConfigurationType] = js.native
  
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.native
}
object CheckpointConfigurationDescription {
  
  @scala.inline
  def apply(): CheckpointConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckpointConfigurationDescription]
  }
  
  @scala.inline
  implicit class CheckpointConfigurationDescriptionMutableBuilder[Self <: CheckpointConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckpointInterval(value: CheckpointInterval): Self = StObject.set(x, "CheckpointInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointIntervalUndefined: Self = StObject.set(x, "CheckpointInterval", js.undefined)
    
    @scala.inline
    def setCheckpointingEnabled(value: BooleanObject): Self = StObject.set(x, "CheckpointingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointingEnabledUndefined: Self = StObject.set(x, "CheckpointingEnabled", js.undefined)
    
    @scala.inline
    def setConfigurationType(value: ConfigurationType): Self = StObject.set(x, "ConfigurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTypeUndefined: Self = StObject.set(x, "ConfigurationType", js.undefined)
    
    @scala.inline
    def setMinPauseBetweenCheckpoints(value: MinPauseBetweenCheckpoints): Self = StObject.set(x, "MinPauseBetweenCheckpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPauseBetweenCheckpointsUndefined: Self = StObject.set(x, "MinPauseBetweenCheckpoints", js.undefined)
  }
}
