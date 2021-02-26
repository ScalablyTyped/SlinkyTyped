package typingsSlinky.grommet

import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.ValueThemeValue
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeContextMod {
  
  @JSImport("grommet/contexts/ThemeContext", "ThemeContext")
  @js.native
  val ThemeContext: ThemeContextI = js.native
  
  @js.native
  trait ThemeContextI extends Context[ThemeValue] {
    
    var Extend: ReactComponentClass[ValueThemeValue] = js.native
  }
  object ThemeContextI {
    
    @scala.inline
    def apply(
      Consumer: ReactComponentClass[ConsumerProps[ThemeValue]],
      Extend: ReactComponentClass[ValueThemeValue],
      Provider: ReactComponentClass[ProviderProps[ThemeValue]]
    ): ThemeContextI = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeContextI]
    }
    
    @scala.inline
    implicit class ThemeContextIMutableBuilder[Self <: ThemeContextI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: ReactComponentClass[ValueThemeValue]): Self = StObject.set(x, "Extend", value.asInstanceOf[js.Any])
    }
  }
  
  type ThemeValue = js.Object
}
