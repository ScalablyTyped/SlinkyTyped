package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyInfo extends StObject {
  
  /** For a direct proxy, the hosts for which the proxy is bypassed. The host names may contain wildcards such as *.example.com. */
  var excludedHosts: js.UndefOr[js.Array[String]] = js.native
  
  /** The host of the direct proxy. */
  var host: js.UndefOr[String] = js.native
  
  /** The URI of the PAC script used to configure the proxy. */
  var pacUri: js.UndefOr[String] = js.native
  
  /** The port of the direct proxy. */
  var port: js.UndefOr[Double] = js.native
}
object ProxyInfo {
  
  @scala.inline
  def apply(): ProxyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyInfo]
  }
  
  @scala.inline
  implicit class ProxyInfoMutableBuilder[Self <: ProxyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedHosts(value: js.Array[String]): Self = StObject.set(x, "excludedHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedHostsUndefined: Self = StObject.set(x, "excludedHosts", js.undefined)
    
    @scala.inline
    def setExcludedHostsVarargs(value: String*): Self = StObject.set(x, "excludedHosts", js.Array(value :_*))
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPacUri(value: String): Self = StObject.set(x, "pacUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacUriUndefined: Self = StObject.set(x, "pacUri", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
