package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetJobs extends Generic {
  var allow_no_jobs: js.UndefOr[Boolean] = js.native
  var job_id: js.UndefOr[String] = js.native
}

object MlGetJobs {
  @scala.inline
  def apply(): MlGetJobs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetJobs]
  }
  @scala.inline
  implicit class MlGetJobsOps[Self <: MlGetJobs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_no_jobs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_no_jobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_jobs")(js.undefined)
        ret
    }
    @scala.inline
    def withJob_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJob_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job_id")(js.undefined)
        ret
    }
  }
  
}

