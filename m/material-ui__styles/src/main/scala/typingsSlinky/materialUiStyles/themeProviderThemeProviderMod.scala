package typingsSlinky.materialUiStyles

import slinky.core.facade.ReactElement
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderThemeProviderMod {
  
  @JSImport("@material-ui/styles/ThemeProvider/ThemeProvider", JSImport.Default)
  @js.native
  def default[T](props: ThemeProviderProps[T]): ReactElement = js.native
  
  @js.native
  trait ThemeProviderProps[Theme] extends StObject {
    
    var children: ReactElement = js.native
    
    var theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme]) = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply[Theme](theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps[Theme]]
    }
    
    @scala.inline
    implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps[_], Theme] (val x: Self with ThemeProviderProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTheme(value: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
}
