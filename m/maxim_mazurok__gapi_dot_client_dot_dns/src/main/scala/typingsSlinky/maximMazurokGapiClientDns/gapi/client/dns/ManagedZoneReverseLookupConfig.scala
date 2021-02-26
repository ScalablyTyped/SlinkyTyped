package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZoneReverseLookupConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.native
}
object ManagedZoneReverseLookupConfig {
  
  @scala.inline
  def apply(): ManagedZoneReverseLookupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneReverseLookupConfig]
  }
  
  @scala.inline
  implicit class ManagedZoneReverseLookupConfigMutableBuilder[Self <: ManagedZoneReverseLookupConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
