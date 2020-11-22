package typingsSlinky.rebassGrid.mod

import typingsSlinky.rebassGrid.rebassGridStrings.colors
import typingsSlinky.rebassGrid.rebassGridStrings.fontSizes
import typingsSlinky.rebassGrid.rebassGridStrings.space
import typingsSlinky.styledSystem.mod.AlignItemsProps
import typingsSlinky.styledSystem.mod.AlignSelfProps
import typingsSlinky.styledSystem.mod.BackgroundColorProps
import typingsSlinky.styledSystem.mod.FlexDirectionProps
import typingsSlinky.styledSystem.mod.FlexWrapProps
import typingsSlinky.styledSystem.mod.FontSizeProps
import typingsSlinky.styledSystem.mod.JustifyContentProps
import typingsSlinky.styledSystem.mod.OpacityProps
import typingsSlinky.styledSystem.mod.OrderProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.SpaceProps
import typingsSlinky.styledSystem.mod.TextColorProps
import typingsSlinky.styledSystem.mod.ThemeValue
import typingsSlinky.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexKnownProps
  extends BaseProps
     with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with WidthProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any
    ]
     with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme]
     with typingsSlinky.styledSystem.mod.FlexProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any
    ]
     with OrderProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]
     with FlexWrapProps[RequiredTheme]
     with FlexDirectionProps[RequiredTheme]
     with AlignItemsProps[RequiredTheme]
     with JustifyContentProps[RequiredTheme]
object FlexKnownProps {
  
  @scala.inline
  def apply(): FlexKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexKnownProps]
  }
}
