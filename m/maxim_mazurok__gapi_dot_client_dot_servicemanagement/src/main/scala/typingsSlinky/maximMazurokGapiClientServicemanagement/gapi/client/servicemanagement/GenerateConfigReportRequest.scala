package typingsSlinky.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateConfigReportRequest extends StObject {
  
  /**
    * Required. Service configuration for which we want to generate the report. For this version of API, the supported types are google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var newConfig: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.GenerateConfigReportRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Optional. Service configuration against which the comparison will be done. For this version of API, the supported types are google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var oldConfig: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.GenerateConfigReportRequest with TopLevel[js.Any]
  ] = js.native
}
object GenerateConfigReportRequest {
  
  @scala.inline
  def apply(): GenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConfigReportRequest]
  }
  
  @scala.inline
  implicit class GenerateConfigReportRequestMutableBuilder[Self <: GenerateConfigReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewConfig(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.GenerateConfigReportRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "newConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewConfigUndefined: Self = StObject.set(x, "newConfig", js.undefined)
    
    @scala.inline
    def setOldConfig(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.GenerateConfigReportRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "oldConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldConfigUndefined: Self = StObject.set(x, "oldConfig", js.undefined)
  }
}
