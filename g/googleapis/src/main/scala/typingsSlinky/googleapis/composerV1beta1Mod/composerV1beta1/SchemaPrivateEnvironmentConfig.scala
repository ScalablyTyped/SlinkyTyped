package typingsSlinky.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration information for configuring a Private IP Cloud Composer
  * environment.
  */
@js.native
trait SchemaPrivateEnvironmentConfig extends StObject {
  
  /**
    * Optional. If `true`, a Private IP Cloud Composer environment is created.
    * If this field is true, `use_ip_aliases` must be true.
    */
  var enablePrivateEnvironment: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Configuration for the private GKE cluster for a Private IP
    * Cloud Composer environment.
    */
  var privateClusterConfig: js.UndefOr[SchemaPrivateClusterConfig] = js.native
}
object SchemaPrivateEnvironmentConfig {
  
  @scala.inline
  def apply(): SchemaPrivateEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateEnvironmentConfig]
  }
  
  @scala.inline
  implicit class SchemaPrivateEnvironmentConfigMutableBuilder[Self <: SchemaPrivateEnvironmentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablePrivateEnvironment(value: Boolean): Self = StObject.set(x, "enablePrivateEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePrivateEnvironmentUndefined: Self = StObject.set(x, "enablePrivateEnvironment", js.undefined)
    
    @scala.inline
    def setPrivateClusterConfig(value: SchemaPrivateClusterConfig): Self = StObject.set(x, "privateClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateClusterConfigUndefined: Self = StObject.set(x, "privateClusterConfig", js.undefined)
  }
}
