package typingsSlinky.jupyterlabApputils

import typingsSlinky.jupyterlabApputils.splashMod.ISplashScreen
import typingsSlinky.jupyterlabApputils.thememanagerMod.ThemeManager.IOptions
import typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thememanagerMod {
  
  @JSImport("@jupyterlab/apputils/lib/thememanager", "ThemeManager")
  @js.native
  class ThemeManager protected () extends IThemeManager {
    /**
      * Construct a new theme manager.
      */
    def this(options: IOptions) = this()
    
    var _base: js.Any = js.native
    
    var _current: js.Any = js.native
    
    var _host: js.Any = js.native
    
    /**
      * Change a font size by a positive or negative increment.
      */
    var _incrFontSize: js.Any = js.native
    
    /**
      * Initialize the key -> property dict for the overrides
      */
    var _initOverrideProps: js.Any = js.native
    
    var _links: js.Any = js.native
    
    /**
      * Handle the current settings.
      */
    var _loadSettings: js.Any = js.native
    
    /**
      * Load the theme.
      *
      * #### Notes
      * This method assumes that the `theme` exists.
      */
    var _loadTheme: js.Any = js.native
    
    /**
      * Handle a theme error.
      */
    var _onError: js.Any = js.native
    
    var _outstanding: js.Any = js.native
    
    var _overrideProps: js.Any = js.native
    
    var _overrides: js.Any = js.native
    
    var _pending: js.Any = js.native
    
    var _requests: js.Any = js.native
    
    var _settings: js.Any = js.native
    
    var _splash: js.Any = js.native
    
    var _themeChanged: js.Any = js.native
    
    var _themes: js.Any = js.native
    
    /**
      * Decrease a font size w.r.t. its current setting or its value in the
      * current theme.
      *
      * @param key - A Jupyterlab font size CSS variable, without the leading '--jp-'.
      */
    def decrFontSize(key: String): js.Promise[Unit] = js.native
    
    /**
      * Get the value of a CSS variable from its key.
      *
      * @param key - A Jupyterlab CSS variable, without the leading '--jp-'.
      *
      * @return value - The current value of the Jupyterlab CSS variable
      */
    def getCSS(key: String): String = js.native
    
    /**
      * Increase a font size w.r.t. its current setting or its value in the
      * current theme.
      *
      * @param key - A Jupyterlab font size CSS variable, without the leading '--jp-'.
      */
    def incrFontSize(key: String): js.Promise[Unit] = js.native
    
    /**
      * Test if the user has scrollbar styling enabled.
      */
    def isToggledThemeScrollbars(): Boolean = js.native
    
    /**
      * Loads all current CSS overrides from settings. If an override has been
      * removed or is invalid, this function unloads it instead.
      */
    def loadCSSOverrides(): Unit = js.native
    
    /**
      * Add a CSS override to the settings.
      */
    def setCSSOverride(key: String, value: String): js.Promise[Unit] = js.native
    
    /**
      * A signal fired when the application theme changes.
      */
    @JSName("themeChanged")
    def themeChanged_MThemeManager: ISignal[this.type, IChangedArgs[String, String | Null, String]] = js.native
    
    /**
      * Get the name of the current theme.
      */
    @JSName("theme")
    def theme_MThemeManager: String | Null = js.native
    
    /**
      * The names of the registered themes.
      */
    @JSName("themes")
    def themes_MThemeManager: js.Array[String] = js.native
    
    /**
      * Toggle the `theme-scrollbbars` setting.
      */
    def toggleThemeScrollbars(): js.Promise[Unit] = js.native
    
    /**
      * Validate a CSS value w.r.t. a key
      *
      * @param key - A Jupyterlab CSS variable, without the leading '--jp-'.
      *
      * @param val - A candidate CSS value
      */
    def validateCSS(key: String, `val`: String): Boolean = js.native
  }
  object ThemeManager {
    
    /**
      * The options used to create a theme manager.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The host widget for the theme manager.
        */
      var host: Widget = js.native
      
      /**
        * The setting registry key that holds theme setting data.
        */
      var key: String = js.native
      
      /**
        * The settings registry.
        */
      var settings: ISettingRegistry = js.native
      
      /**
        * The splash screen to show when loading themes.
        */
      var splash: js.UndefOr[ISplashScreen] = js.native
      
      /**
        * The url for local theme loading.
        */
      var url: String = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(host: Widget, key: String, settings: ISettingRegistry, url: String): IOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHost(value: Widget): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSettings(value: ISettingRegistry): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSplash(value: ISplashScreen): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
