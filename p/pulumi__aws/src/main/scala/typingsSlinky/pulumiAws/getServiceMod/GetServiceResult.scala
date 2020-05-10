package typingsSlinky.pulumiAws.getServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceResult extends js.Object {
  /**
    * The ARN of the ECS Service
    */
  val arn: String = js.native
  val clusterArn: String = js.native
  /**
    * The number of tasks for the ECS Service
    */
  val desiredCount: Double = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The launch type for the ECS Service
    */
  val launchType: String = js.native
  /**
    * The scheduling strategy for the ECS Service
    */
  val schedulingStrategy: String = js.native
  val serviceName: String = js.native
  /**
    * The family for the latest ACTIVE revision
    */
  val taskDefinition: String = js.native
}

object GetServiceResult {
  @scala.inline
  def apply(
    arn: String,
    clusterArn: String,
    desiredCount: Double,
    id: String,
    launchType: String,
    schedulingStrategy: String,
    serviceName: String,
    taskDefinition: String
  ): GetServiceResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], clusterArn = clusterArn.asInstanceOf[js.Any], desiredCount = desiredCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchType = launchType.asInstanceOf[js.Any], schedulingStrategy = schedulingStrategy.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceResult]
  }
  @scala.inline
  implicit class GetServiceResultOps[Self <: GetServiceResult] (val x: Self) extends AnyVal {
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
    def withClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedulingStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

