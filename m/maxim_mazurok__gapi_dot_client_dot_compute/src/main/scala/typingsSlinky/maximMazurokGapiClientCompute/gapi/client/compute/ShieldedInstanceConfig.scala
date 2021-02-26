package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShieldedInstanceConfig extends StObject {
  
  /** Defines whether the instance has integrity monitoring enabled. Enabled by default. */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.native
  
  /** Defines whether the instance has Secure Boot enabled. Disabled by default. */
  var enableSecureBoot: js.UndefOr[Boolean] = js.native
  
  /** Defines whether the instance has the vTPM enabled. Enabled by default. */
  var enableVtpm: js.UndefOr[Boolean] = js.native
}
object ShieldedInstanceConfig {
  
  @scala.inline
  def apply(): ShieldedInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceConfig]
  }
  
  @scala.inline
  implicit class ShieldedInstanceConfigMutableBuilder[Self <: ShieldedInstanceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableIntegrityMonitoring(value: Boolean): Self = StObject.set(x, "enableIntegrityMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIntegrityMonitoringUndefined: Self = StObject.set(x, "enableIntegrityMonitoring", js.undefined)
    
    @scala.inline
    def setEnableSecureBoot(value: Boolean): Self = StObject.set(x, "enableSecureBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSecureBootUndefined: Self = StObject.set(x, "enableSecureBoot", js.undefined)
    
    @scala.inline
    def setEnableVtpm(value: Boolean): Self = StObject.set(x, "enableVtpm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVtpmUndefined: Self = StObject.set(x, "enableVtpm", js.undefined)
  }
}
