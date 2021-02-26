package typingsSlinky.emotionReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionReact.anon.ThemeExclude
import typingsSlinky.emotionReact.anon.ThemeT
import typingsSlinky.emotionReact.emotionReactMod.Theme
import typingsSlinky.emotionReact.emotionReactStrings.theme
import typingsSlinky.emotionReact.helperMod.DistributiveOmit
import typingsSlinky.emotionReact.helperMod.PropsOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themingMod {
  
  @JSImport("@emotion/react/types/theming", "ThemeProvider")
  @js.native
  val ThemeProvider: typingsSlinky.emotionReact.themingMod.ThemeProvider = js.native
  type ThemeProvider = js.Function1[/* props */ ThemeProviderProps, ReactElement]
  
  @JSImport("@emotion/react/types/theming", "useTheme")
  @js.native
  def useTheme(): Theme = js.native
  
  @JSImport("@emotion/react/types/theming", "withTheme")
  @js.native
  val withTheme: typingsSlinky.emotionReact.themingMod.withTheme = js.native
  type withTheme = js.Function1[
    /* component */ js.Any, 
    ReactComponentClass[(DistributiveOmit[PropsOf[_], theme]) with typingsSlinky.emotionReact.anon.Theme]
  ]
  
  @js.native
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme]) = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    @scala.inline
    implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTheme(value: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  type WithTheme_[P, T] = (P with ThemeT[T]) | (P with ThemeExclude)
}
