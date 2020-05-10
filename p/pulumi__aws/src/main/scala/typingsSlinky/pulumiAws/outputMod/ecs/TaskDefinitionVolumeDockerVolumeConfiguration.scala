package typingsSlinky.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionVolumeDockerVolumeConfiguration extends js.Object {
  /**
    * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
    */
  var autoprovision: js.UndefOr[Boolean] = js.native
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
    */
  var driver: js.UndefOr[String] = js.native
  /**
    * A map of Docker driver specific options.
    */
  var driverOpts: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A map of custom metadata to add to your Docker volume.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are `scoped` as shared persist after the task stops.
    */
  var scope: String = js.native
}

object TaskDefinitionVolumeDockerVolumeConfiguration {
  @scala.inline
  def apply(scope: String): TaskDefinitionVolumeDockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeDockerVolumeConfiguration]
  }
  @scala.inline
  implicit class TaskDefinitionVolumeDockerVolumeConfigurationOps[Self <: TaskDefinitionVolumeDockerVolumeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoprovision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoprovision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoprovision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoprovision")(js.undefined)
        ret
    }
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(js.undefined)
        ret
    }
    @scala.inline
    def withDriverOpts(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driverOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriverOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driverOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

