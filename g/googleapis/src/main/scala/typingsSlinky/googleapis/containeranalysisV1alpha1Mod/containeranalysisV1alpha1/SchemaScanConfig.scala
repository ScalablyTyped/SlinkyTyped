package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates various scans and whether they are turned on or off.
  */
@js.native
trait SchemaScanConfig extends StObject {
  
  /**
    * Output only. The time this scan config was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. A human-readable description of what the `ScanConfig` does.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the Scan is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The name of the ScanConfig in the form
    * “projects/{project_id}/scanConfigs/{scan_config_id}&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time this scan config was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaScanConfig {
  
  @scala.inline
  def apply(): SchemaScanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanConfig]
  }
  
  @scala.inline
  implicit class SchemaScanConfigMutableBuilder[Self <: SchemaScanConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
