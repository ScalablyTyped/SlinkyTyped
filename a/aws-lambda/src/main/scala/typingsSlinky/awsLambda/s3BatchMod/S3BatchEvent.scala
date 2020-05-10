package typingsSlinky.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BatchEvent extends js.Object {
  var invocationId: String = js.native
  var invocationSchemaVersion: String = js.native
  var job: S3BatchEventJob = js.native
  var tasks: js.Array[S3BatchEventTask] = js.native
}

object S3BatchEvent {
  @scala.inline
  def apply(
    invocationId: String,
    invocationSchemaVersion: String,
    job: S3BatchEventJob,
    tasks: js.Array[S3BatchEventTask]
  ): S3BatchEvent = {
    val __obj = js.Dynamic.literal(invocationId = invocationId.asInstanceOf[js.Any], invocationSchemaVersion = invocationSchemaVersion.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BatchEvent]
  }
  @scala.inline
  implicit class S3BatchEventOps[Self <: S3BatchEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvocationSchemaVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationSchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJob(value: S3BatchEventJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[S3BatchEventTask]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

