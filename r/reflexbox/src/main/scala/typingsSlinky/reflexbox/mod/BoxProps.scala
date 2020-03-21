package typingsSlinky.reflexbox.mod

import slinky.core.facade.ReactElement
import typingsSlinky.csstype.mod.AlignContentProperty
import typingsSlinky.csstype.mod.AlignItemsProperty
import typingsSlinky.csstype.mod.AlignSelfProperty
import typingsSlinky.csstype.mod.DisplayProperty
import typingsSlinky.csstype.mod.FlexBasisProperty
import typingsSlinky.csstype.mod.FlexDirectionProperty
import typingsSlinky.csstype.mod.FlexProperty
import typingsSlinky.csstype.mod.FlexWrapProperty
import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontStyleProperty
import typingsSlinky.csstype.mod.GlobalsNumber
import typingsSlinky.csstype.mod.HeightProperty
import typingsSlinky.csstype.mod.JustifyContentProperty
import typingsSlinky.csstype.mod.JustifyItemsProperty
import typingsSlinky.csstype.mod.JustifySelfProperty
import typingsSlinky.csstype.mod.MaxHeightProperty
import typingsSlinky.csstype.mod.MaxWidthProperty
import typingsSlinky.csstype.mod.MinHeightProperty
import typingsSlinky.csstype.mod.MinWidthProperty
import typingsSlinky.csstype.mod.OverflowProperty
import typingsSlinky.csstype.mod.OverflowXProperty
import typingsSlinky.csstype.mod.OverflowYProperty
import typingsSlinky.csstype.mod.TextAlignProperty
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
import typingsSlinky.styledSystem.mod.ResponsiveValue
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
  var as: js.UndefOr[ReactElement] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    alignContent: ResponsiveValue[AlignContentProperty, RequiredTheme] = null,
    alignItems: ResponsiveValue[AlignItemsProperty, RequiredTheme] = null,
    alignSelf: ResponsiveValue[AlignSelfProperty, RequiredTheme] = null,
    as: ReactElement = null,
    backgroundColor: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    bg: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    color: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    display: ResponsiveValue[DisplayProperty, RequiredTheme] = null,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme] = null,
    flexBasis: ResponsiveValue[FlexBasisProperty[TLengthStyledSystem], RequiredTheme] = null,
    flexDirection: ResponsiveValue[FlexDirectionProperty, RequiredTheme] = null,
    flexGrow: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    flexShrink: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    flexWrap: ResponsiveValue[FlexWrapProperty, RequiredTheme] = null,
    fontFamily: ResponsiveValue[FontFamilyProperty, RequiredTheme] = null,
    fontSize: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme] = null,
    fontStyle: ResponsiveValue[FontStyleProperty, RequiredTheme] = null,
    fontWeight: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme] = null,
    height: ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    justifyContent: ResponsiveValue[JustifyContentProperty, RequiredTheme] = null,
    justifyItems: ResponsiveValue[JustifyItemsProperty, RequiredTheme] = null,
    justifySelf: ResponsiveValue[JustifySelfProperty, RequiredTheme] = null,
    letterSpacing: ResponsiveValue[ThemeValue[letterSpacings, RequiredTheme, js.Any], RequiredTheme] = null,
    lineHeight: ResponsiveValue[ThemeValue[lineHeights, RequiredTheme, js.Any], RequiredTheme] = null,
    m: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    margin: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], RequiredTheme] = null,
    mb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    minHeight: ResponsiveValue[MinHeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    minWidth: ResponsiveValue[MinWidthProperty[TLengthStyledSystem], RequiredTheme] = null,
    ml: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mx: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    my: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    opacity: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    order: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    overflow: ResponsiveValue[OverflowProperty, RequiredTheme] = null,
    overflowX: ResponsiveValue[OverflowXProperty, RequiredTheme] = null,
    overflowY: ResponsiveValue[OverflowYProperty, RequiredTheme] = null,
    p: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    padding: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pl: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    px: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    py: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    size: ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    textAlign: ResponsiveValue[TextAlignProperty, RequiredTheme] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], RequiredTheme] = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem], RequiredTheme] = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

