package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  /**
    * Date and time when the command was acknowledged.
    */
  var AcknowledgedAt: js.UndefOr[DateTime] = js.native
  /**
    * The command ID.
    */
  var CommandId: js.UndefOr[String] = js.native
  /**
    * Date when the command completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.native
  /**
    * Date and time when the command was run.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The command deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.native
  /**
    * The command exit code.
    */
  var ExitCode: js.UndefOr[Integer] = js.native
  /**
    * The ID of the instance where the command was executed.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The URL of the command log.
    */
  var LogUrl: js.UndefOr[String] = js.native
  /**
    * The command status:   failed   successful   skipped   pending  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The command type:    configure     deploy     execute_recipes     install_dependencies     restart     rollback     setup     start     stop     undeploy     update_custom_cookbooks     update_dependencies   
    */
  var Type: js.UndefOr[String] = js.native
}

object Command {
  @scala.inline
  def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcknowledgedAt(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcknowledgedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcknowledgedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcknowledgedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedAt(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withExitCode(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitCode")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

