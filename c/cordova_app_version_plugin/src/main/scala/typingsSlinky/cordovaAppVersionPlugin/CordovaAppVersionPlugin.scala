package typingsSlinky.cordovaAppVersionPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Keep the type global namespace clean by using a module
  */
object CordovaAppVersionPlugin {
  
  @js.native
  trait CordovaAppVersionPlugin extends StObject {
    
    /**
      * App version from config.xml's version (e.g. <widget id="my.app.id" version="1.5.0">)
      * @example window.cordova.plugins.version.getAppVersion() // e.g: "1.5.0"
      */
    def getAppVersion(): String = js.native
  }
  object CordovaAppVersionPlugin {
    
    @scala.inline
    def apply(getAppVersion: () => String): typingsSlinky.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin = {
      val __obj = js.Dynamic.literal(getAppVersion = js.Any.fromFunction0(getAppVersion))
      __obj.asInstanceOf[typingsSlinky.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin]
    }
    
    @scala.inline
    implicit class CordovaAppVersionPluginMutableBuilder[Self <: typingsSlinky.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAppVersion(value: () => String): Self = StObject.set(x, "getAppVersion", js.Any.fromFunction0(value))
    }
  }
}
