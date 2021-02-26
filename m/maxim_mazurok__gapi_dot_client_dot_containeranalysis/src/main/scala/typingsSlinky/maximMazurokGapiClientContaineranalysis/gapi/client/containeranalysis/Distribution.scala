package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends StObject {
  
  /** The CPU architecture for which packages in this distribution channel were built. */
  var architecture: js.UndefOr[String] = js.native
  
  /** Required. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. */
  var cpeUri: js.UndefOr[String] = js.native
  
  /** The distribution channel-specific description of this package. */
  var description: js.UndefOr[String] = js.native
  
  /** The latest available version of this package in this distribution channel. */
  var latestVersion: js.UndefOr[Version] = js.native
  
  /** A freeform string denoting the maintainer of this package. */
  var maintainer: js.UndefOr[String] = js.native
  
  /** The distribution channel-specific homepage for this package. */
  var url: js.UndefOr[String] = js.native
}
object Distribution {
  
  @scala.inline
  def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit class DistributionMutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLatestVersion(value: Version): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionUndefined: Self = StObject.set(x, "latestVersion", js.undefined)
    
    @scala.inline
    def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
