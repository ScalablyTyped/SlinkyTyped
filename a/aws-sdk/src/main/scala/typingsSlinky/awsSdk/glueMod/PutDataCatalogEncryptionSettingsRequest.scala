package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDataCatalogEncryptionSettingsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The security configuration to set.
    */
  var DataCatalogEncryptionSettings: typingsSlinky.awsSdk.glueMod.DataCatalogEncryptionSettings = js.native
}
object PutDataCatalogEncryptionSettingsRequest {
  
  @scala.inline
  def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings): PutDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal(DataCatalogEncryptionSettings = DataCatalogEncryptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
  }
  
  @scala.inline
  implicit class PutDataCatalogEncryptionSettingsRequestMutableBuilder[Self <: PutDataCatalogEncryptionSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDataCatalogEncryptionSettings(value: DataCatalogEncryptionSettings): Self = StObject.set(x, "DataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
  }
}
