package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetJobs extends Generic {
  
  var allow_no_jobs: js.UndefOr[Boolean] = js.native
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllow_no_jobs(value: Boolean): Self = this.set("allow_no_jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_jobs: Self = this.set("allow_no_jobs", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
  }
}
