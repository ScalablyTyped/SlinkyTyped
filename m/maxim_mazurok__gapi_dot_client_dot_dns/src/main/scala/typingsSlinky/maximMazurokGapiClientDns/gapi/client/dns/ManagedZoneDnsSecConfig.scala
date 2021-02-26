package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZoneDnsSecConfig extends StObject {
  
  /** Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF. */
  var defaultKeySpecs: js.UndefOr[js.Array[DnsKeySpec]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF. */
  var nonExistence: js.UndefOr[String] = js.native
  
  /** Specifies whether DNSSEC is enabled, and what mode it is in. */
  var state: js.UndefOr[String] = js.native
}
object ManagedZoneDnsSecConfig {
  
  @scala.inline
  def apply(): ManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneDnsSecConfig]
  }
  
  @scala.inline
  implicit class ManagedZoneDnsSecConfigMutableBuilder[Self <: ManagedZoneDnsSecConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultKeySpecs(value: js.Array[DnsKeySpec]): Self = StObject.set(x, "defaultKeySpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKeySpecsUndefined: Self = StObject.set(x, "defaultKeySpecs", js.undefined)
    
    @scala.inline
    def setDefaultKeySpecsVarargs(value: DnsKeySpec*): Self = StObject.set(x, "defaultKeySpecs", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNonExistence(value: String): Self = StObject.set(x, "nonExistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonExistenceUndefined: Self = StObject.set(x, "nonExistence", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
