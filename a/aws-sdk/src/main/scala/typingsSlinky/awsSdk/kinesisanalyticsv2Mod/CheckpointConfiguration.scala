package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointConfiguration extends js.Object {
  /**
    * Describes the interval in milliseconds between checkpoint operations.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval vaue of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointInterval: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CheckpointInterval] = js.native
  /**
    * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes whether the application uses Amazon Kinesis Data Analytics' default checkpointing behavior. You must set this property to CUSTOM in order to set the CheckpointingEnabled, CheckpointInterval, or MinPauseBetweenCheckpoints parameters.  If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ConfigurationType = js.native
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start. If a checkpoint operation takes longer than the CheckpointInterval, the application otherwise performs continual checkpoint operations. For more information, see  Tuning Checkpointing in the Apache Flink Documentation.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.native
}

object CheckpointConfiguration {
  @scala.inline
  def apply(ConfigurationType: ConfigurationType): CheckpointConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfiguration]
  }
  @scala.inline
  implicit class CheckpointConfigurationOps[Self <: CheckpointConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationType(value: ConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckpointInterval(value: CheckpointInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckpointingEnabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPauseBetweenCheckpoints(value: MinPauseBetweenCheckpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinPauseBetweenCheckpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPauseBetweenCheckpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinPauseBetweenCheckpoints")(js.undefined)
        ret
    }
  }
  
}

