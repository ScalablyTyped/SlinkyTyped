package typingsSlinky.playable.anon

import typingsSlinky.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeConfig extends StObject {
  
  var themeConfig: IThemeConfig = js.native
}
object ThemeConfig {
  
  @scala.inline
  def apply(themeConfig: IThemeConfig): ThemeConfig = {
    val __obj = js.Dynamic.literal(themeConfig = themeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeConfig]
  }
  
  @scala.inline
  implicit class ThemeConfigMutableBuilder[Self <: ThemeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThemeConfig(value: IThemeConfig): Self = StObject.set(x, "themeConfig", value.asInstanceOf[js.Any])
  }
}
