package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the interval in milliseconds between checkpoint operations.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval vaue of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.native
  /**
    * Describes updates to whether checkpointing is enabled for an application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics. You must set this property to CUSTOM in order to set the CheckpointingEnabled, CheckpointInterval, or MinPauseBetweenCheckpoints parameters.   If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  /**
    * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.native
}

object CheckpointConfigurationUpdate {
  @scala.inline
  def apply(): CheckpointConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckpointConfigurationUpdate]
  }
  @scala.inline
  implicit class CheckpointConfigurationUpdateOps[Self <: CheckpointConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckpointIntervalUpdate(value: CheckpointInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointIntervalUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointIntervalUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointIntervalUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckpointingEnabledUpdate(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointingEnabledUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointingEnabledUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointingEnabledUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationTypeUpdate(value: ConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTypeUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationTypeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTypeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPauseBetweenCheckpointsUpdate(value: MinPauseBetweenCheckpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinPauseBetweenCheckpointsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPauseBetweenCheckpointsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinPauseBetweenCheckpointsUpdate")(js.undefined)
        ret
    }
  }
  
}

