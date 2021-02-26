package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerVersionsListItem extends StObject {
  
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  
  /**
    * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Description] = js.native
  
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LayerVersionArn] = js.native
  
  /**
    * The layer's open-source license.
    */
  var LicenseInfo: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LicenseInfo] = js.native
  
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.native
}
object LayerVersionsListItem {
  
  @scala.inline
  def apply(): LayerVersionsListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionsListItem]
  }
  
  @scala.inline
  implicit class LayerVersionsListItemMutableBuilder[Self <: LayerVersionsListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleRuntimes(value: CompatibleRuntimes): Self = StObject.set(x, "CompatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimesUndefined: Self = StObject.set(x, "CompatibleRuntimes", js.undefined)
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: Runtime*): Self = StObject.set(x, "CompatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLayerVersionArn(value: LayerVersionArn): Self = StObject.set(x, "LayerVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerVersionArnUndefined: Self = StObject.set(x, "LayerVersionArn", js.undefined)
    
    @scala.inline
    def setLicenseInfo(value: LicenseInfo): Self = StObject.set(x, "LicenseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseInfoUndefined: Self = StObject.set(x, "LicenseInfo", js.undefined)
    
    @scala.inline
    def setVersion(value: LayerVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
