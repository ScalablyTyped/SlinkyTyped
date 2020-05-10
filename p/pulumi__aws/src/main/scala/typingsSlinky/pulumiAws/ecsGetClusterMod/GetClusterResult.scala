package typingsSlinky.pulumiAws.ecsGetClusterMod

import typingsSlinky.pulumiAws.outputMod.ecs.GetClusterSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  /**
    * The ARN of the ECS Cluster
    */
  val arn: String = js.native
  val clusterName: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The number of pending tasks for the ECS Cluster
    */
  val pendingTasksCount: Double = js.native
  /**
    * The number of registered container instances for the ECS Cluster
    */
  val registeredContainerInstancesCount: Double = js.native
  /**
    * The number of running tasks for the ECS Cluster
    */
  val runningTasksCount: Double = js.native
  /**
    * The settings associated with the ECS Cluster.
    */
  val settings: js.Array[GetClusterSetting] = js.native
  /**
    * The status of the ECS Cluster
    */
  val status: String = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    clusterName: String,
    id: String,
    pendingTasksCount: Double,
    registeredContainerInstancesCount: Double,
    runningTasksCount: Double,
    settings: js.Array[GetClusterSetting],
    status: String
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pendingTasksCount = pendingTasksCount.asInstanceOf[js.Any], registeredContainerInstancesCount = registeredContainerInstancesCount.asInstanceOf[js.Any], runningTasksCount = runningTasksCount.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
  @scala.inline
  implicit class GetClusterResultOps[Self <: GetClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingTasksCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTasksCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredContainerInstancesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredContainerInstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunningTasksCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningTasksCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: js.Array[GetClusterSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

