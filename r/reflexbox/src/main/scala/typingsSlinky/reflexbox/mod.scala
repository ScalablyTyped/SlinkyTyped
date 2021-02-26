package typingsSlinky.reflexbox

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reflexbox.reflexboxStrings.colors
import typingsSlinky.reflexbox.reflexboxStrings.key
import typingsSlinky.reflexbox.reflexboxStrings.ref
import typingsSlinky.reflexbox.reflexboxStrings.space
import typingsSlinky.std.Omit
import typingsSlinky.styledSystem.mod.ColorProps
import typingsSlinky.styledSystem.mod.FlexboxProps
import typingsSlinky.styledSystem.mod.LayoutProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.SpaceProps
import typingsSlinky.styledSystem.mod.ThemeValue
import typingsSlinky.styledSystem.mod.TypographyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reflexbox", "Box")
  @js.native
  val Box: BoxType = js.native
  
  @JSImport("reflexbox", "Flex")
  @js.native
  val Flex: BoxType = js.native
  
  @js.native
  trait BoxProps
    extends FlexboxProps[RequiredTheme]
       with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
       with LayoutProps[RequiredTheme]
       with TypographyProps[RequiredTheme]
       with ColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]] {
    
    var as: js.UndefOr[ReactElement] = js.native
  }
  object BoxProps {
    
    @scala.inline
    def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    @scala.inline
    implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: ReactElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  type BoxType = StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Omit[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with BoxProps, 
      /* keyof react.react.ClassAttributes<any> */ ref | key
    ], 
    js.Object
  ]
}
