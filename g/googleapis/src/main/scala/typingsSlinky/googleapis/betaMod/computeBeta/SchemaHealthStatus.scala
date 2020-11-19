package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHealthStatus extends js.Object {
  
  /**
    * Health state of the instance.
    */
  var healthState: js.UndefOr[String] = js.native
  
  /**
    * URL of the instance resource.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * The IP address represented by this resource.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * The port on the instance.
    */
  var port: js.UndefOr[Double] = js.native
}
object SchemaHealthStatus {
  
  @scala.inline
  def apply(): SchemaHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthStatus]
  }
  
  @scala.inline
  implicit class SchemaHealthStatusOps[Self <: SchemaHealthStatus] (val x: Self) extends AnyVal {
    
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
    def setHealthState(value: String): Self = this.set("healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthState: Self = this.set("healthState", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
