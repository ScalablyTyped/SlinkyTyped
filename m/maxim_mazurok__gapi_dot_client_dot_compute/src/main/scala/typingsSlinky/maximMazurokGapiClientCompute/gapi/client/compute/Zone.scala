package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zone extends StObject {
  
  /** [Output Only] Available cpu/platform selections for the zone. */
  var availableCpuPlatforms: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** [Output Only] The deprecation status associated with this zone. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.native
  
  /** [Output Only] Textual description of the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#zone for zones. */
  var kind: js.UndefOr[String] = js.native
  
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[String] = js.native
  
  /** [Output Only] Full URL reference to the region which hosts the zone. */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** [Output Only] Status of the zone, either UP or DOWN. */
  var status: js.UndefOr[String] = js.native
}
object Zone {
  
  @scala.inline
  def apply(): Zone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zone]
  }
  
  @scala.inline
  implicit class ZoneMutableBuilder[Self <: Zone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableCpuPlatforms(value: js.Array[String]): Self = StObject.set(x, "availableCpuPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableCpuPlatformsUndefined: Self = StObject.set(x, "availableCpuPlatforms", js.undefined)
    
    @scala.inline
    def setAvailableCpuPlatformsVarargs(value: String*): Self = StObject.set(x, "availableCpuPlatforms", js.Array(value :_*))
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeprecated(value: DeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
