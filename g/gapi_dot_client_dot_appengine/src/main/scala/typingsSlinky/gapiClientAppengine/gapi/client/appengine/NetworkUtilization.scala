package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkUtilization extends js.Object {
  
  /** Target bytes received per second. */
  var targetReceivedBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target packets received per second. */
  var targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.native
  
  /** Target bytes sent per second. */
  var targetSentBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target packets sent per second. */
  var targetSentPacketsPerSecond: js.UndefOr[Double] = js.native
}
object NetworkUtilization {
  
  @scala.inline
  def apply(): NetworkUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkUtilization]
  }
  
  @scala.inline
  implicit class NetworkUtilizationOps[Self <: NetworkUtilization] (val x: Self) extends AnyVal {
    
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
    def setTargetReceivedBytesPerSecond(value: Double): Self = this.set("targetReceivedBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetReceivedBytesPerSecond: Self = this.set("targetReceivedBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetReceivedPacketsPerSecond(value: Double): Self = this.set("targetReceivedPacketsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetReceivedPacketsPerSecond: Self = this.set("targetReceivedPacketsPerSecond", js.undefined)
    
    @scala.inline
    def setTargetSentBytesPerSecond(value: Double): Self = this.set("targetSentBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSentBytesPerSecond: Self = this.set("targetSentBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetSentPacketsPerSecond(value: Double): Self = this.set("targetSentPacketsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSentPacketsPerSecond: Self = this.set("targetSentPacketsPerSecond", js.undefined)
  }
}
