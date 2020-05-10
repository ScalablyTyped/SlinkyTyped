package typingsSlinky.pulumiAws.getTaskDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTaskDefinitionResult extends js.Object {
  /**
    * The family of this task definition
    */
  val family: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The Docker networking mode to use for the containers in this task.
    */
  val networkMode: String = js.native
  /**
    * The revision of this task definition
    */
  val revision: Double = js.native
  /**
    * The status of this task definition
    */
  val status: String = js.native
  val taskDefinition: String = js.native
  /**
    * The ARN of the IAM role that containers in this task can assume
    */
  val taskRoleArn: String = js.native
}

object GetTaskDefinitionResult {
  @scala.inline
  def apply(
    family: String,
    id: String,
    networkMode: String,
    revision: Double,
    status: String,
    taskDefinition: String,
    taskRoleArn: String
  ): GetTaskDefinitionResult = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkMode = networkMode.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any], taskRoleArn = taskRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTaskDefinitionResult]
  }
  @scala.inline
  implicit class GetTaskDefinitionResultOps[Self <: GetTaskDefinitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

