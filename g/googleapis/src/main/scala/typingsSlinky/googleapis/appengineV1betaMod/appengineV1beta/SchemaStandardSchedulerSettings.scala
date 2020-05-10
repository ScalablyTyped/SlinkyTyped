package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scheduler settings for standard environment.
  */
@js.native
trait SchemaStandardSchedulerSettings extends js.Object {
  /**
    * Maximum number of instances to run for this version. Set to zero to
    * disable max_instances configuration.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Minimum number of instances to run for this version. Set to zero to
    * disable min_instances configuration.
    */
  var minInstances: js.UndefOr[Double] = js.native
  /**
    * Target CPU utilization ratio to maintain when scaling.
    */
  var targetCpuUtilization: js.UndefOr[Double] = js.native
  /**
    * Target throughput utilization ratio to maintain when scaling
    */
  var targetThroughputUtilization: js.UndefOr[Double] = js.native
}

object SchemaStandardSchedulerSettings {
  @scala.inline
  def apply(): SchemaStandardSchedulerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSchedulerSettings]
  }
  @scala.inline
  implicit class SchemaStandardSchedulerSettingsOps[Self <: SchemaStandardSchedulerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withMinInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCpuUtilization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpuUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCpuUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpuUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetThroughputUtilization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetThroughputUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetThroughputUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetThroughputUtilization")(js.undefined)
        ret
    }
  }
  
}

