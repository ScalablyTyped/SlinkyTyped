package typingsSlinky.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicRouteConfig extends js.Object {
  
  /** The timestamp when the Route was last updated. */
  var lastUpdated: js.UndefOr[String] = js.native
  
  /** The route config. */
  var routeConfig: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicRouteConfig with TopLevel[js.Any]
  ] = js.native
  
  /** This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the route configuration was loaded. */
  var versionInfo: js.UndefOr[String] = js.native
}
object DynamicRouteConfig {
  
  @scala.inline
  def apply(): DynamicRouteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicRouteConfig]
  }
  
  @scala.inline
  implicit class DynamicRouteConfigOps[Self <: DynamicRouteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastUpdated(value: String): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
    
    @scala.inline
    def setRouteConfig(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicRouteConfig with TopLevel[js.Any]
    ): Self = this.set("routeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteConfig: Self = this.set("routeConfig", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: String): Self = this.set("versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionInfo: Self = this.set("versionInfo", js.undefined)
  }
}
