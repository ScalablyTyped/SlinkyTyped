package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExportRequest extends StObject {
  
  /**
    * The format of the exported data.
    */
  var exportType: ExportType = js.native
  
  /**
    * The name of the bot to export.
    */
  var name: Name = js.native
  
  /**
    * The type of resource to export. 
    */
  var resourceType: ResourceType = js.native
  
  /**
    * The version of the bot to export.
    */
  var version: NumericalVersion = js.native
}
object GetExportRequest {
  
  @scala.inline
  def apply(exportType: ExportType, name: Name, resourceType: ResourceType, version: NumericalVersion): GetExportRequest = {
    val __obj = js.Dynamic.literal(exportType = exportType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportRequest]
  }
  
  @scala.inline
  implicit class GetExportRequestMutableBuilder[Self <: GetExportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportType(value: ExportType): Self = StObject.set(x, "exportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: NumericalVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
