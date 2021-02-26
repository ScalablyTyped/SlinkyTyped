package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssetId extends StObject {
  
  /**
    * Name of the creative asset. This is a required field while inserting an asset. After insertion, this assetIdentifier is used to identify the uploaded asset. Characters in the name
    * must be alphanumeric or one of the following: ".-_ ". Spaces are allowed.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Type of asset to upload. This is a required field. FLASH and IMAGE are no longer supported for new uploads. All image assets should use HTML_IMAGE. */
  var `type`: js.UndefOr[String] = js.native
}
object CreativeAssetId {
  
  @scala.inline
  def apply(): CreativeAssetId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetId]
  }
  
  @scala.inline
  implicit class CreativeAssetIdMutableBuilder[Self <: CreativeAssetId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
