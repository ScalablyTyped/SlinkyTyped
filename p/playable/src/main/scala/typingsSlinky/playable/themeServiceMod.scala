package typingsSlinky.playable

import typingsSlinky.playable.anon.ThemeConfig
import typingsSlinky.playable.coreTypesMod.IStyles
import typingsSlinky.playable.themeTypesMod.ICSSRules
import typingsSlinky.playable.themeTypesMod.IThemeConfig
import typingsSlinky.playable.themeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeServiceMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", JSImport.Default)
  @js.native
  class default protected () extends ThemeService {
    def this(hasThemeConfig: ThemeConfig) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  object DEFAULT_THEME_CONFIG {
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG.color")
    @js.native
    def color: String = js.native
    @scala.inline
    def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG.liveColor")
    @js.native
    def liveColor: String = js.native
    @scala.inline
    def liveColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liveColor")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/core/theme/theme-service", "DEFAULT_THEME_CONFIG.progressColor")
    @js.native
    def progressColor: String = js.native
    @scala.inline
    def progressColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ThemeService extends IThemeService {
    
    var _styleSheet: js.Any = js.native
    
    def get(module: js.Any): IStyles = js.native
  }
  object ThemeService {
    
    @scala.inline
    def apply(
      _styleSheet: js.Any,
      destroy: () => Unit,
      get: js.Any => IStyles,
      registerModuleTheme: (js.Object, ICSSRules) => Unit,
      updateTheme: IThemeConfig => Unit
    ): ThemeService = {
      val __obj = js.Dynamic.literal(_styleSheet = _styleSheet.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), get = js.Any.fromFunction1(get), registerModuleTheme = js.Any.fromFunction2(registerModuleTheme), updateTheme = js.Any.fromFunction1(updateTheme))
      __obj.asInstanceOf[ThemeService]
    }
    
    @scala.inline
    implicit class ThemeServiceMutableBuilder[Self <: ThemeService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: js.Any => IStyles): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_styleSheet(value: js.Any): Self = StObject.set(x, "_styleSheet", value.asInstanceOf[js.Any])
    }
  }
}
