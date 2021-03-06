package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata the defines how a deployment is configured.
  */
@js.native
trait SchemaDeploymentConfig extends StObject {
  
  /**
    * The description for this deployment.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The manifest file name for this deployment.
    */
  var manifestFileName: js.UndefOr[String] = js.native
  
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  
  /**
    * The version number on which this deployment is based.
    */
  var versionNumber: js.UndefOr[Double] = js.native
}
object SchemaDeploymentConfig {
  
  @scala.inline
  def apply(): SchemaDeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentConfig]
  }
  
  @scala.inline
  implicit class SchemaDeploymentConfigMutableBuilder[Self <: SchemaDeploymentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setManifestFileName(value: String): Self = StObject.set(x, "manifestFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestFileNameUndefined: Self = StObject.set(x, "manifestFileName", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
