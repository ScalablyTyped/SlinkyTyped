package typingsSlinky.jupyterlabApputils

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager.ITheme
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/apputils/lib/tokens", "ISessionContextDialogs")
  @js.native
  val ISessionContextDialogs: Token[IDialogs] = js.native
  type ISessionContextDialogs = IDialogs
  
  @js.native
  trait IThemeManager extends StObject {
    
    /**
      * Test whether a given theme is light.
      */
    def isLight(name: String): Boolean = js.native
    
    /**
      * Load a theme CSS file by path.
      *
      * @param path - The path of the file to load.
      */
    def loadCSS(path: String): js.Promise[Unit] = js.native
    
    /**
      * Register a theme with the theme manager.
      *
      * @param theme - The theme to register.
      *
      * @returns A disposable that can be used to unregister the theme.
      */
    def register(theme: ITheme): IDisposable = js.native
    
    /**
      * Set the current theme.
      */
    def setTheme(name: String): js.Promise[Unit] = js.native
    
    /**
      * Get the name of the current theme.
      */
    val theme: String | Null = js.native
    
    /**
      * A signal fired when the application theme changes.
      */
    val themeChanged: ISignal[this.type, IChangedArgs[String, String | Null, String]] = js.native
    
    /**
      * Test whether a given theme styles scrollbars,
      * and if the user has scrollbar styling enabled.
      */
    def themeScrollbars(name: String): Boolean = js.native
    
    /**
      * The names of the registered themes.
      */
    val themes: js.Array[String] = js.native
  }
  object IThemeManager extends Shortcut {
    
    @scala.inline
    def apply(
      isLight: String => Boolean,
      loadCSS: String => js.Promise[Unit],
      register: ITheme => IDisposable,
      setTheme: String => js.Promise[Unit],
      themeChanged: ISignal[IThemeManager, IChangedArgs[String, String | Null, String]],
      themeScrollbars: String => Boolean,
      themes: js.Array[String]
    ): IThemeManager = {
      val __obj = js.Dynamic.literal(isLight = js.Any.fromFunction1(isLight), loadCSS = js.Any.fromFunction1(loadCSS), register = js.Any.fromFunction1(register), setTheme = js.Any.fromFunction1(setTheme), themeChanged = themeChanged.asInstanceOf[js.Any], themeScrollbars = js.Any.fromFunction1(themeScrollbars), themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemeManager]
    }
    
    @JSImport("@jupyterlab/apputils/lib/tokens", "IThemeManager")
    @js.native
    val ^ : Token[IThemeManager] = js.native
    
    /**
      * An interface for a theme.
      */
    @js.native
    trait ITheme extends StObject {
      
      /**
        * Whether the theme is light or dark. Downstream authors
        * of extensions can use this information to customize their
        * UI depending upon the current theme.
        */
      var isLight: Boolean = js.native
      
      /**
        * Load the theme.
        *
        * @returns A promise that resolves when the theme has loaded.
        */
      def load(): js.Promise[Unit] = js.native
      
      /**
        * The display name of the theme.
        */
      var name: String = js.native
      
      /**
        * Whether the theme includes styling for the scrollbar.
        * If set to false, this theme will leave the native scrollbar untouched.
        */
      var themeScrollbars: js.UndefOr[Boolean] = js.native
      
      /**
        * Unload the theme.
        *
        * @returns A promise that resolves when the theme has unloaded.
        */
      def unload(): js.Promise[Unit] = js.native
    }
    object ITheme {
      
      @scala.inline
      def apply(isLight: Boolean, load: () => js.Promise[Unit], name: String, unload: () => js.Promise[Unit]): ITheme = {
        val __obj = js.Dynamic.literal(isLight = isLight.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), name = name.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload))
        __obj.asInstanceOf[ITheme]
      }
      
      @scala.inline
      implicit class IThemeMutableBuilder[Self <: ITheme] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsLight(value: Boolean): Self = StObject.set(x, "isLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThemeScrollbars(value: Boolean): Self = StObject.set(x, "themeScrollbars", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThemeScrollbarsUndefined: Self = StObject.set(x, "themeScrollbars", js.undefined)
        
        @scala.inline
        def setUnload(value: () => js.Promise[Unit]): Self = StObject.set(x, "unload", js.Any.fromFunction0(value))
      }
    }
    
    @scala.inline
    implicit class IThemeManagerMutableBuilder[Self <: IThemeManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLight(value: String => Boolean): Self = StObject.set(x, "isLight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadCSS(value: String => js.Promise[Unit]): Self = StObject.set(x, "loadCSS", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegister(value: ITheme => IDisposable): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTheme(value: String => js.Promise[Unit]): Self = StObject.set(x, "setTheme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeChanged(value: ISignal[IThemeManager, IChangedArgs[String, String | Null, String]]): Self = StObject.set(x, "themeChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeNull: Self = StObject.set(x, "theme", null)
      
      @scala.inline
      def setThemeScrollbars(value: String => Boolean): Self = StObject.set(x, "themeScrollbars", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThemes(value: js.Array[String]): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemesVarargs(value: String*): Self = StObject.set(x, "themes", js.Array(value :_*))
    }
    
    type _To = Token[IThemeManager]
    
    /* This means you don't have to write `^`, but can instead just say `IThemeManager.foo` */
    override def _to: Token[IThemeManager] = ^
  }
}
