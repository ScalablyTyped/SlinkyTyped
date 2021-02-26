package typingsSlinky.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for the private GKE cluster in a Cloud Composer
  * environment.
  */
@js.native
trait SchemaPrivateClusterConfig extends StObject {
  
  /**
    * Optional. If `true`, access to the public endpoint of the GKE cluster is
    * denied.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * The IP range in CIDR notation to use for the hosted master network. This
    * range is used for assigning internal IP addresses to the cluster master
    * or set of masters and to the internal load balancer virtual IP. This
    * range must not overlap with any other ranges in use within the
    * cluster&#39;s network. If left blank, the default value of
    * &#39;172.16.0.0/28&#39; is used.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
}
object SchemaPrivateClusterConfig {
  
  @scala.inline
  def apply(): SchemaPrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateClusterConfig]
  }
  
  @scala.inline
  implicit class SchemaPrivateClusterConfigMutableBuilder[Self <: SchemaPrivateClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablePrivateEndpoint(value: Boolean): Self = StObject.set(x, "enablePrivateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePrivateEndpointUndefined: Self = StObject.set(x, "enablePrivateEndpoint", js.undefined)
    
    @scala.inline
    def setMasterIpv4CidrBlock(value: String): Self = StObject.set(x, "masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterIpv4CidrBlockUndefined: Self = StObject.set(x, "masterIpv4CidrBlock", js.undefined)
  }
}
