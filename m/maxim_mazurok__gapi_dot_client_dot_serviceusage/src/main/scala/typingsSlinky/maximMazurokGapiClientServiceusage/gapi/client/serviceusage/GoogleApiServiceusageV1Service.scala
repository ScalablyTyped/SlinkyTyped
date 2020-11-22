package typingsSlinky.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiServiceusageV1Service extends js.Object {
  
  /**
    * The service configuration of the available service. Some fields may be filtered out of the configuration in responses to the `ListServices` method. These fields are present only in
    * responses to the `GetService` method.
    */
  var config: js.UndefOr[GoogleApiServiceusageV1ServiceConfig] = js.native
  
  /** The resource name of the consumer and service. A valid name would be: - projects/123/services/serviceusage.googleapis.com */
  var name: js.UndefOr[String] = js.native
  
  /** The resource name of the consumer. A valid name would be: - projects/123 */
  var parent: js.UndefOr[String] = js.native
  
  /** Whether or not the service has been enabled for use by the consumer. */
  var state: js.UndefOr[String] = js.native
}
object GoogleApiServiceusageV1Service {
  
  @scala.inline
  def apply(): GoogleApiServiceusageV1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1Service]
  }
  
  @scala.inline
  implicit class GoogleApiServiceusageV1ServiceOps[Self <: GoogleApiServiceusageV1Service] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: GoogleApiServiceusageV1ServiceConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
