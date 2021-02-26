package typingsSlinky.ionic

import typingsSlinky.elementtree.mod.ElementTree
import typingsSlinky.ionic.anon.RequiredProjectIntegratio
import typingsSlinky.ionic.anon.Version
import typingsSlinky.ionic.definitionsMod.CordovaPackageJson
import typingsSlinky.ionic.definitionsMod.ResourcesPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaConfigMod {
  
  @JSImport("ionic/lib/integrations/cordova/config", "CordovaConfig")
  @js.native
  class CordovaConfig protected () extends StObject {
    def this(configXmlPath: String, packageJsonPath: String) = this()
    
    var _doc: js.UndefOr[ElementTree] = js.native
    
    var _pkg: js.UndefOr[CordovaPackageJson] = js.native
    
    var _sessionid: js.UndefOr[String] = js.native
    
    val configXmlPath: String = js.native
    
    def doc: ElementTree = js.native
    
    def ensurePlatformImages(platform: String, resourcesPlatform: ResourcesPlatform): Unit = js.native
    
    def ensureSplashScreenPreferences(): Unit = js.native
    
    def getBundleId(): js.UndefOr[String] = js.native
    
    def getConfiguredPlatforms(): js.Array[ConfiguredPlatform] = js.native
    
    def getPreference(prefName: String): js.UndefOr[String] = js.native
    
    def getProjectInfo(): Version = js.native
    
    val packageJsonPath: String = js.native
    
    def pkg: CordovaPackageJson = js.native
    
    /* protected */ def reload(): js.Promise[Unit] = js.native
    
    /**
      * Set config.xml src url back to its original url
      */
    def resetContentSrc(): Unit = js.native
    
    def save(): js.Promise[Unit] = js.native
    
    var saving: Boolean = js.native
    
    def sessionid: String = js.native
    
    def setBundleId(bundleId: String): Unit = js.native
    
    def setName(name: String): Unit = js.native
    
    /* protected */ def write(): String = js.native
    
    /**
      * Update config.xml content src to be a dev server url. As part of this
      * backup the original content src for a reset to occur at a later time.
      */
    def writeContentSrc(newSrc: String): Unit = js.native
  }
  /* static members */
  object CordovaConfig {
    
    @JSImport("ionic/lib/integrations/cordova/config", "CordovaConfig.load")
    @js.native
    def load(configXmlPath: String, packageJsonPath: String): js.Promise[CordovaConfig] = js.native
  }
  
  @JSImport("ionic/lib/integrations/cordova/config", "loadCordovaConfig")
  @js.native
  def loadCordovaConfig(integration: RequiredProjectIntegratio): js.Promise[CordovaConfig] = js.native
  
  @js.native
  trait ConfiguredPlatform extends StObject {
    
    var name: String = js.native
    
    var spec: js.UndefOr[String] = js.native
  }
  object ConfiguredPlatform {
    
    @scala.inline
    def apply(name: String): ConfiguredPlatform = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfiguredPlatform]
    }
    
    @scala.inline
    implicit class ConfiguredPlatformMutableBuilder[Self <: ConfiguredPlatform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
