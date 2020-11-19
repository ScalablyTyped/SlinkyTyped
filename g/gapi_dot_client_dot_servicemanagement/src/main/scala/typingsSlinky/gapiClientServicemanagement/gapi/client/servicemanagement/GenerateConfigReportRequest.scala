package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateConfigReportRequest extends js.Object {
  
  /**
    * Service configuration for which we want to generate the report.
    * For this version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource,
    * and google.api.Service
    */
  var newConfig: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * Service configuration against which the comparison will be done.
    * For this version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource,
    * and google.api.Service
    */
  var oldConfig: js.UndefOr[Record[String, _]] = js.native
}
object GenerateConfigReportRequest {
  
  @scala.inline
  def apply(): GenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConfigReportRequest]
  }
  
  @scala.inline
  implicit class GenerateConfigReportRequestOps[Self <: GenerateConfigReportRequest] (val x: Self) extends AnyVal {
    
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
    def setNewConfig(value: Record[String, _]): Self = this.set("newConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewConfig: Self = this.set("newConfig", js.undefined)
    
    @scala.inline
    def setOldConfig(value: Record[String, _]): Self = this.set("oldConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldConfig: Self = this.set("oldConfig", js.undefined)
  }
}
