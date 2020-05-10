package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.fast
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeployJobStatus extends js.Object {
  var appUrl: js.UndefOr[String] = js.native
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.native
  var buildstatus: String | Null = js.native
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.native
  var jobid: String = js.native
  var startTime: Double = js.native
  var status: IUpdateAppJobStatus = js.native
  /**
    * Used to keep track of which steps this app update went trough,
    * mainly for debugging
    *
    * @memberOf IGetUpdateAppStatusResponse
    */
  var trace: js.Array[String] = js.native
  var `type`: full | fast = js.native
}

object IDeployJobStatus {
  @scala.inline
  def apply(
    jobid: String,
    startTime: Double,
    status: IUpdateAppJobStatus,
    trace: js.Array[String],
    `type`: full | fast
  ): IDeployJobStatus = {
    val __obj = js.Dynamic.literal(jobid = jobid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeployJobStatus]
  }
  @scala.inline
  implicit class IDeployJobStatusOps[Self <: IDeployJobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: IUpdateAppJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrace(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: full | fast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildErrors(value: js.Array[IBuildError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildstatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildstatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildstatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildstatus")(null)
        ret
    }
    @scala.inline
    def withConsistencyErrors(value: js.Array[IProblem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyErrors")(js.undefined)
        ret
    }
  }
  
}

