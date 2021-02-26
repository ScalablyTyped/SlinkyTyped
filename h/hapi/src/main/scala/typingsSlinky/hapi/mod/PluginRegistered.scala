package typingsSlinky.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRegistered extends StObject {
  
  /**
    * the plugin name.
    */
  var name: String = js.native
  
  /**
    * options used to register the plugin.
    */
  var options: js.Object = js.native
  
  /**
    * the plugin version.
    */
  var version: String = js.native
}
object PluginRegistered {
  
  @scala.inline
  def apply(name: String, options: js.Object, version: String): PluginRegistered = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRegistered]
  }
  
  @scala.inline
  implicit class PluginRegisteredMutableBuilder[Self <: PluginRegistered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
