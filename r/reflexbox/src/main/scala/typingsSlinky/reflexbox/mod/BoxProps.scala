package typingsSlinky.reflexbox.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.csstype.mod.FlexBasisProperty
import typingsSlinky.csstype.mod.FlexProperty
import typingsSlinky.csstype.mod.HeightProperty
import typingsSlinky.csstype.mod.MaxHeightProperty
import typingsSlinky.csstype.mod.MaxWidthProperty
import typingsSlinky.csstype.mod.MinHeightProperty
import typingsSlinky.csstype.mod.MinWidthProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.csstype.mod.WidthProperty
import typingsSlinky.reflexbox.reflexboxStrings.colors
import typingsSlinky.reflexbox.reflexboxStrings.fontSizes
import typingsSlinky.reflexbox.reflexboxStrings.fontWeights
import typingsSlinky.reflexbox.reflexboxStrings.letterSpacings
import typingsSlinky.reflexbox.reflexboxStrings.lineHeights
import typingsSlinky.reflexbox.reflexboxStrings.space
import typingsSlinky.styledSystem.mod.AlignContentProps
import typingsSlinky.styledSystem.mod.AlignItemsProps
import typingsSlinky.styledSystem.mod.AlignSelfProps
import typingsSlinky.styledSystem.mod.BackgroundColorProps
import typingsSlinky.styledSystem.mod.DisplayProps
import typingsSlinky.styledSystem.mod.FlexBasisProps
import typingsSlinky.styledSystem.mod.FlexDirectionProps
import typingsSlinky.styledSystem.mod.FlexGrowProps
import typingsSlinky.styledSystem.mod.FlexProps
import typingsSlinky.styledSystem.mod.FlexShrinkProps
import typingsSlinky.styledSystem.mod.FlexWrapProps
import typingsSlinky.styledSystem.mod.FontFamilyProps
import typingsSlinky.styledSystem.mod.FontSizeProps
import typingsSlinky.styledSystem.mod.FontStyleProps
import typingsSlinky.styledSystem.mod.FontWeightProps
import typingsSlinky.styledSystem.mod.HeightProps
import typingsSlinky.styledSystem.mod.JustifyContentProps
import typingsSlinky.styledSystem.mod.JustifyItemsProps
import typingsSlinky.styledSystem.mod.JustifySelfProps
import typingsSlinky.styledSystem.mod.LetterSpacingProps
import typingsSlinky.styledSystem.mod.LineHeightProps
import typingsSlinky.styledSystem.mod.MaxHeightProps
import typingsSlinky.styledSystem.mod.MaxWidthProps
import typingsSlinky.styledSystem.mod.MinHeightProps
import typingsSlinky.styledSystem.mod.MinWidthProps
import typingsSlinky.styledSystem.mod.OpacityProps
import typingsSlinky.styledSystem.mod.OrderProps
import typingsSlinky.styledSystem.mod.OverflowProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.SizeProps
import typingsSlinky.styledSystem.mod.SpaceProps
import typingsSlinky.styledSystem.mod.TLengthStyledSystem
import typingsSlinky.styledSystem.mod.TextAlignProps
import typingsSlinky.styledSystem.mod.TextColorProps
import typingsSlinky.styledSystem.mod.ThemeValue
import typingsSlinky.styledSystem.mod.VerticalAlignProps
import typingsSlinky.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxProps
  extends SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with WidthProps[RequiredTheme, WidthProperty[TLengthStyledSystem]]
     with HeightProps[RequiredTheme, HeightProperty[TLengthStyledSystem]]
     with MinWidthProps[RequiredTheme, MinWidthProperty[TLengthStyledSystem]]
     with MinHeightProps[RequiredTheme, MinHeightProperty[TLengthStyledSystem]]
     with MaxWidthProps[RequiredTheme, MaxWidthProperty[TLengthStyledSystem]]
     with MaxHeightProps[RequiredTheme, MaxHeightProperty[TLengthStyledSystem]]
     with DisplayProps[RequiredTheme]
     with VerticalAlignProps[RequiredTheme, VerticalAlignProperty[TLengthStyledSystem]]
     with SizeProps[RequiredTheme, HeightProperty[TLengthStyledSystem]]
     with OverflowProps[RequiredTheme]
     with FontFamilyProps[RequiredTheme]
     with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
     with FontWeightProps[RequiredTheme, ThemeValue[fontWeights, RequiredTheme, js.Any]]
     with LineHeightProps[RequiredTheme, ThemeValue[lineHeights, RequiredTheme, js.Any]]
     with LetterSpacingProps[RequiredTheme, ThemeValue[letterSpacings, RequiredTheme, js.Any]]
     with FontStyleProps[RequiredTheme]
     with TextAlignProps[RequiredTheme]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme]
     with AlignItemsProps[RequiredTheme]
     with AlignContentProps[RequiredTheme]
     with JustifyItemsProps[RequiredTheme]
     with JustifyContentProps[RequiredTheme]
     with FlexWrapProps[RequiredTheme]
     with FlexDirectionProps[RequiredTheme]
     with FlexProps[RequiredTheme, FlexProperty[TLengthStyledSystem]]
     with FlexGrowProps[RequiredTheme]
     with FlexShrinkProps[RequiredTheme]
     with FlexBasisProps[RequiredTheme, FlexBasisProperty[TLengthStyledSystem]]
     with JustifySelfProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]
     with OrderProps[RequiredTheme] {
  var as: js.UndefOr[ReactElement] = js.native
}

object BoxProps {
  @scala.inline
  def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  @scala.inline
  implicit class BoxPropsOps[Self <: BoxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
  }
  
}

