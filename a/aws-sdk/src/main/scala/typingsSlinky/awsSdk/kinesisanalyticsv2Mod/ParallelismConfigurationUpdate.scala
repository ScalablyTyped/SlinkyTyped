package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelismConfigurationUpdate extends js.Object {
  /**
    * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service, or if a custom parallelism is used. You must set this property to CUSTOM in order to change your application's AutoScalingEnabled, Parallelism, or ParallelismPerKPU properties.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  /**
    * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU] = js.native
  /**
    * Describes updates to the initial number of parallel tasks an application can perform. If AutoScalingEnabled is set to True, then Kinesis Data Analytics can increase the CurrentParallelism value in response to application load. The service can increase CurrentParallelism up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service will reduce CurrentParallelism down to the Parallelism setting.
    */
  var ParallelismUpdate: js.UndefOr[Parallelism] = js.native
}

object ParallelismConfigurationUpdate {
  @scala.inline
  def apply(): ParallelismConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelismConfigurationUpdate]
  }
  @scala.inline
  implicit class ParallelismConfigurationUpdateOps[Self <: ParallelismConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingEnabledUpdate(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingEnabledUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingEnabledUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingEnabledUpdate")(js.undefined)
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
    def withParallelismPerKPUUpdate(value: ParallelismPerKPU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismPerKPUUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelismPerKPUUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismPerKPUUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelismUpdate(value: Parallelism): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelismUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismUpdate")(js.undefined)
        ret
    }
  }
  
}

