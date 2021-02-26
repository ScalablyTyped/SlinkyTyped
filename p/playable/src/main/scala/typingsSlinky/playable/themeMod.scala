package typingsSlinky.playable

import typingsSlinky.playable.anon.ThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.playable.themeServiceMod.default {
    def this(hasThemeConfig: ThemeConfig) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/core/theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/theme", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/theme", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  object DEFAULT_THEME_CONFIG {
    
    @JSImport("playable/dist/src/modules/ui/core/theme", "DEFAULT_THEME_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/core/theme", "DEFAULT_THEME_CONFIG.color")
    @js.native
    def color: String = js.native
    @scala.inline
    def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/core/theme", "DEFAULT_THEME_CONFIG.liveColor")
    @js.native
    def liveColor: String = js.native
    @scala.inline
    def liveColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liveColor")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/core/theme", "DEFAULT_THEME_CONFIG.progressColor")
    @js.native
    def progressColor: String = js.native
    @scala.inline
    def progressColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/ui/core/theme", "transperentizeColor")
  @js.native
  def transperentizeColor(color: String): String = js.native
  @JSImport("playable/dist/src/modules/ui/core/theme", "transperentizeColor")
  @js.native
  def transperentizeColor(color: String, alpha: Double): String = js.native
}
