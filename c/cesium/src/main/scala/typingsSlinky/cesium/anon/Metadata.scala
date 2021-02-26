package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.GoogleEarthEnterpriseMetadata
import typingsSlinky.cesium.mod.Resource
import typingsSlinky.cesium.mod.TileDiscardPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  var credit: js.UndefOr[typingsSlinky.cesium.mod.Credit | String] = js.native
  
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  
  var metadata: GoogleEarthEnterpriseMetadata = js.native
  
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  
  var url: Resource | String = js.native
}
object Metadata {
  
  @scala.inline
  def apply(metadata: GoogleEarthEnterpriseMetadata, url: Resource | String): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredit(value: typingsSlinky.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setMetadata(value: GoogleEarthEnterpriseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
    
    @scala.inline
    def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
