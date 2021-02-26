package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureSettings extends StObject {
  
  /**
    * Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to 'readiness_check' and
    * 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is always true, this setting can be removed.
    */
  var splitHealthChecks: js.UndefOr[Boolean] = js.native
  
  /** If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base image for VMs, rather than a base Debian image. */
  var useContainerOptimizedOs: js.UndefOr[Boolean] = js.native
}
object FeatureSettings {
  
  @scala.inline
  def apply(): FeatureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSettings]
  }
  
  @scala.inline
  implicit class FeatureSettingsMutableBuilder[Self <: FeatureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSplitHealthChecks(value: Boolean): Self = StObject.set(x, "splitHealthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitHealthChecksUndefined: Self = StObject.set(x, "splitHealthChecks", js.undefined)
    
    @scala.inline
    def setUseContainerOptimizedOs(value: Boolean): Self = StObject.set(x, "useContainerOptimizedOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContainerOptimizedOsUndefined: Self = StObject.set(x, "useContainerOptimizedOs", js.undefined)
  }
}
