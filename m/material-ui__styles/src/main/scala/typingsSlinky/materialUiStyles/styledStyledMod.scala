package typingsSlinky.materialUiStyles

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiStyles.anon.ClassName
import typingsSlinky.materialUiStyles.anon.ThemeTheme
import typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme
import typingsSlinky.materialUiStyles.materialUiStylesStrings.className
import typingsSlinky.materialUiStyles.materialUiStylesStrings.classes
import typingsSlinky.materialUiStyles.materialUiStylesStrings.root
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsSlinky.materialUiTypes.mod.Omit
import typingsSlinky.materialUiTypes.mod.Overwrite
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.ComponentPropsWithoutRef
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledStyledMod {
  
  @JSImport("@material-ui/styles/styled/styled", JSImport.Default)
  @js.native
  def default[Component /* <: ReactElement */](Component: Component): ComponentCreator[Component] = js.native
  
  type ComponentCreator[Component /* <: ReactElement */] = js.Function2[
    /* styles */ CreateCSSProperties[ComponentPropsWithoutRef[Component]] | (js.Function1[
      /* props */ ThemeTheme[DefaultTheme] with ComponentPropsWithoutRef[Component], 
      CreateCSSProperties[ComponentPropsWithoutRef[Component]]
    ]), 
    /* options */ js.UndefOr[WithStylesOptions[DefaultTheme]], 
    StyledComponent[
      (Omit[
        LibraryManagedAttributes[Component, ComponentProps[Component]], 
        classes | className
      ]) with StyledComponentProps[root] with (Overwrite[ComponentPropsWithoutRef[Component], ClassName[DefaultTheme]])
    ]
  ]
  
  type StyledComponent[P /* <: js.Object */] = js.Function1[/* props */ P, ReactElement | Null]
  
  @js.native
  trait StyledProps extends StObject {
    
    var className: String = js.native
  }
  object StyledProps {
    
    @scala.inline
    def apply(className: String): StyledProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledProps]
    }
    
    @scala.inline
    implicit class StyledPropsMutableBuilder[Self <: StyledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
}
