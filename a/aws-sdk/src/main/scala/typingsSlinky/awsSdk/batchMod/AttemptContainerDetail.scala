package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptContainerDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS container instance that hosts the job attempt.
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The exit code for the job attempt. A non-zero exit code is considered a failure.
    */
  var exitCode: js.UndefOr[Integer] = js.native
  /**
    * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
    */
  var logStreamName: js.UndefOr[String] = js.native
  /**
    * The network interfaces associated with the job attempt.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.native
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the job attempt. Each container attempt receives a task ARN when they reach the STARTING status.
    */
  var taskArn: js.UndefOr[String] = js.native
}

object AttemptContainerDetail {
  @scala.inline
  def apply(): AttemptContainerDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttemptContainerDetail]
  }
  @scala.inline
  implicit class AttemptContainerDetailOps[Self <: AttemptContainerDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withExitCode(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: NetworkInterfaceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskArn")(js.undefined)
        ret
    }
  }
  
}

