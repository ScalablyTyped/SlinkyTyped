package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Commute details related to this job.
  */
@js.native
trait SchemaCommuteInfo extends js.Object {
  
  /**
    * Location used as the destination in the commute calculation.
    */
  var jobLocation: js.UndefOr[SchemaJobLocation] = js.native
  
  /**
    * The number of seconds required to travel to the job location from the
    * query location. A duration of 0 seconds indicates that the job is not
    * reachable within the requested duration, but was returned as part of an
    * expanded query.
    */
  var travelDuration: js.UndefOr[String] = js.native
}
object SchemaCommuteInfo {
  
  @scala.inline
  def apply(): SchemaCommuteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommuteInfo]
  }
  
  @scala.inline
  implicit class SchemaCommuteInfoOps[Self <: SchemaCommuteInfo] (val x: Self) extends AnyVal {
    
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
    def setJobLocation(value: SchemaJobLocation): Self = this.set("jobLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobLocation: Self = this.set("jobLocation", js.undefined)
    
    @scala.inline
    def setTravelDuration(value: String): Self = this.set("travelDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravelDuration: Self = this.set("travelDuration", js.undefined)
  }
}
