package typingsSlinky.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZonePrivateVisibilityConfigNetwork extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfigNetwork&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var networkUrl: js.UndefOr[String] = js.native
}
object SchemaManagedZonePrivateVisibilityConfigNetwork {
  
  @scala.inline
  def apply(): SchemaManagedZonePrivateVisibilityConfigNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfigNetwork]
  }
  
  @scala.inline
  implicit class SchemaManagedZonePrivateVisibilityConfigNetworkMutableBuilder[Self <: SchemaManagedZonePrivateVisibilityConfigNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
