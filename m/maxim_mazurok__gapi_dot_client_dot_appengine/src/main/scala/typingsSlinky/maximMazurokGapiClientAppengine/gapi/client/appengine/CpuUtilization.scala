package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuUtilization extends js.Object {
  
  /** Period of time over which CPU utilization is calculated. */
  var aggregationWindowLength: js.UndefOr[String] = js.native
  
  /** Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1. */
  var targetUtilization: js.UndefOr[Double] = js.native
}
object CpuUtilization {
  
  @scala.inline
  def apply(): CpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuUtilization]
  }
  
  @scala.inline
  implicit class CpuUtilizationOps[Self <: CpuUtilization] (val x: Self) extends AnyVal {
    
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
    def setAggregationWindowLength(value: String): Self = this.set("aggregationWindowLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationWindowLength: Self = this.set("aggregationWindowLength", js.undefined)
    
    @scala.inline
    def setTargetUtilization(value: Double): Self = this.set("targetUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetUtilization: Self = this.set("targetUtilization", js.undefined)
  }
}
