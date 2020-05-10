package typingsSlinky.ionic.deployBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployBuild extends js.Object {
  var automation_id: Double = js.native
  var automation_name: String = js.native
  var caller_id: Double = js.native
  var commit: js.Any = js.native
  var created: String = js.native
  var environment_id: Double = js.native
  var environment_name: String = js.native
  var finished: String = js.native
  var id: String = js.native
  var job: js.Any = js.native
  var job_id: Double = js.native
  var native_config_id: Double = js.native
  var pending_channels: js.Array[String] = js.native
  var state: String = js.native
}

object DeployBuild {
  @scala.inline
  def apply(
    automation_id: Double,
    automation_name: String,
    caller_id: Double,
    commit: js.Any,
    created: String,
    environment_id: Double,
    environment_name: String,
    finished: String,
    id: String,
    job: js.Any,
    job_id: Double,
    native_config_id: Double,
    pending_channels: js.Array[String],
    state: String
  ): DeployBuild = {
    val __obj = js.Dynamic.literal(automation_id = automation_id.asInstanceOf[js.Any], automation_name = automation_name.asInstanceOf[js.Any], caller_id = caller_id.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], native_config_id = native_config_id.asInstanceOf[js.Any], pending_channels = pending_channels.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployBuild]
  }
  @scala.inline
  implicit class DeployBuildOps[Self <: DeployBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomation_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automation_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomation_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automation_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaller_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinished(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJob(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJob_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative_config_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_config_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending_channels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

