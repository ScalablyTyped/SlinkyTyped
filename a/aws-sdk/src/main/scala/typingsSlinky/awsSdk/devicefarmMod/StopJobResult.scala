package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopJobResult extends js.Object {
  
  /**
    * The job that was stopped.
    */
  var job: js.UndefOr[Job] = js.native
}
object StopJobResult {
  
  @scala.inline
  def apply(): StopJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopJobResult]
  }
  
  @scala.inline
  implicit class StopJobResultOps[Self <: StopJobResult] (val x: Self) extends AnyVal {
    
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
    def setJob(value: Job): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
  }
}
