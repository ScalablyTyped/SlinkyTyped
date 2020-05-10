package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelismConfigurationDescription extends js.Object {
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. 
    */
  var ConfigurationType: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ConfigurationType] = js.native
  /**
    * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, Kinesis Data Analytics can increase this value in response to application load. The service can increase this value up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var CurrentParallelism: js.UndefOr[Parallelism] = js.native
  /**
    * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, then Kinesis Data Analytics can increase the CurrentParallelism value in response to application load. The service can increase CurrentParallelism up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var Parallelism: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Parallelism] = js.native
  /**
    * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPU: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ParallelismPerKPU] = js.native
}

object ParallelismConfigurationDescription {
  @scala.inline
  def apply(): ParallelismConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelismConfigurationDescription]
  }
  @scala.inline
  implicit class ParallelismConfigurationDescriptionOps[Self <: ParallelismConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingEnabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationType(value: ConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationType")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentParallelism(value: Parallelism): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentParallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentParallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelism(value: Parallelism): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelismPerKPU(value: ParallelismPerKPU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismPerKPU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelismPerKPU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismPerKPU")(js.undefined)
        ret
    }
  }
  
}

