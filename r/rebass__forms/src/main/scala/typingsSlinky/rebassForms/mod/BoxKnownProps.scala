package typingsSlinky.rebassForms.mod

import typingsSlinky.csstype.mod.FlexProperty
import typingsSlinky.csstype.mod.HeightProperty
import typingsSlinky.csstype.mod.MaxHeightProperty
import typingsSlinky.csstype.mod.MaxWidthProperty
import typingsSlinky.csstype.mod.MinHeightProperty
import typingsSlinky.csstype.mod.MinWidthProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.csstype.mod.WidthProperty
import typingsSlinky.rebass.mod.BaseProps
import typingsSlinky.rebass.mod.SxProps
import typingsSlinky.rebassForms.rebassFormsStrings.colors
import typingsSlinky.rebassForms.rebassFormsStrings.fontSizes
import typingsSlinky.rebassForms.rebassFormsStrings.space
import typingsSlinky.styledSystem.mod.AlignSelfProps
import typingsSlinky.styledSystem.mod.BackgroundColorProps
import typingsSlinky.styledSystem.mod.DisplayProps
import typingsSlinky.styledSystem.mod.FlexProps
import typingsSlinky.styledSystem.mod.FontSizeProps
import typingsSlinky.styledSystem.mod.HeightProps
import typingsSlinky.styledSystem.mod.MaxHeightProps
import typingsSlinky.styledSystem.mod.MaxWidthProps
import typingsSlinky.styledSystem.mod.MinHeightProps
import typingsSlinky.styledSystem.mod.MinWidthProps
import typingsSlinky.styledSystem.mod.OpacityProps
import typingsSlinky.styledSystem.mod.OrderProps
import typingsSlinky.styledSystem.mod.OverflowProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ResponsiveValue
import typingsSlinky.styledSystem.mod.SizeProps
import typingsSlinky.styledSystem.mod.SpaceProps
import typingsSlinky.styledSystem.mod.TLengthStyledSystem
import typingsSlinky.styledSystem.mod.TextColorProps
import typingsSlinky.styledSystem.mod.ThemeValue
import typingsSlinky.styledSystem.mod.VerticalAlignProps
import typingsSlinky.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxKnownProps
  extends BaseProps
     with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
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
     with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme]
     with FlexProps[RequiredTheme, FlexProperty[TLengthStyledSystem]]
     with OrderProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]
     with SxProps {
  var tx: js.UndefOr[String] = js.native
  var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.native
}

object BoxKnownProps {
  @scala.inline
  def apply(): BoxKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxKnownProps]
  }
  @scala.inline
  implicit class BoxKnownPropsOps[Self <: BoxKnownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: ResponsiveValue[String, RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(null)
        ret
    }
  }
  
}

