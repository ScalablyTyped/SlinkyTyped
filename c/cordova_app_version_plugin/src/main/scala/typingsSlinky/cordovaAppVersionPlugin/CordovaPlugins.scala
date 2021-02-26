package typingsSlinky.cordovaAppVersionPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends StObject {
  
  /**
    * cordova_app_version_plugin interface
    */
  var version: typingsSlinky.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin = js.native
}
object CordovaPlugins {
  
  @scala.inline
  def apply(version: typingsSlinky.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: typingsSlinky.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
