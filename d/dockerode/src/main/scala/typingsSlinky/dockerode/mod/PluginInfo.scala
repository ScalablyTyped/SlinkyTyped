package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginInfo extends StObject {
  
  var Config: PluginConfig = js.native
  
  var Enabled: Boolean = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var Name: String = js.native
  
  var PluginReference: js.UndefOr[String] = js.native
  
  var Settings: PluginSettings = js.native
}
object PluginInfo {
  
  @scala.inline
  def apply(Config: PluginConfig, Enabled: Boolean, Name: String, Settings: PluginSettings): PluginInfo = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInfo]
  }
  
  @scala.inline
  implicit class PluginInfoMutableBuilder[Self <: PluginInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: PluginConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginReference(value: String): Self = StObject.set(x, "PluginReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginReferenceUndefined: Self = StObject.set(x, "PluginReference", js.undefined)
    
    @scala.inline
    def setSettings(value: PluginSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
