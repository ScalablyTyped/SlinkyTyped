package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadJobResponse extends js.Object {
  
  /**
    * A section of the response body that provides information about the job.
    */
  var Job: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Job] = js.native
}
object ReadJobResponse {
  
  @scala.inline
  def apply(): ReadJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadJobResponse]
  }
  
  @scala.inline
  implicit class ReadJobResponseOps[Self <: ReadJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJob(value: Job): Self = this.set("Job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob: Self = this.set("Job", js.undefined)
  }
}
