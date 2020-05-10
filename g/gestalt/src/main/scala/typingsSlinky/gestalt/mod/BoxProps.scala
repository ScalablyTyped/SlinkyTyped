package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.AnonStyle
import typingsSlinky.gestalt.gestaltNumbers.`0.1`
import typingsSlinky.gestalt.gestaltNumbers.`0.2`
import typingsSlinky.gestalt.gestaltNumbers.`0.3`
import typingsSlinky.gestalt.gestaltNumbers.`0.4`
import typingsSlinky.gestalt.gestaltNumbers.`0.5`
import typingsSlinky.gestalt.gestaltNumbers.`0.6`
import typingsSlinky.gestalt.gestaltNumbers.`0.7`
import typingsSlinky.gestalt.gestaltNumbers.`0.8`
import typingsSlinky.gestalt.gestaltNumbers.`0.9`
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltNumbers.`7`
import typingsSlinky.gestalt.gestaltNumbers.`8`
import typingsSlinky.gestalt.gestaltStrings.absolute
import typingsSlinky.gestalt.gestaltStrings.around
import typingsSlinky.gestalt.gestaltStrings.auto
import typingsSlinky.gestalt.gestaltStrings.baseline
import typingsSlinky.gestalt.gestaltStrings.between
import typingsSlinky.gestalt.gestaltStrings.block
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.center
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.column
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.darkWash
import typingsSlinky.gestalt.gestaltStrings.eggplant
import typingsSlinky.gestalt.gestaltStrings.end
import typingsSlinky.gestalt.gestaltStrings.evenly
import typingsSlinky.gestalt.gestaltStrings.fixed
import typingsSlinky.gestalt.gestaltStrings.flex
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.green
import typingsSlinky.gestalt.gestaltStrings.grow
import typingsSlinky.gestalt.gestaltStrings.hidden
import typingsSlinky.gestalt.gestaltStrings.inlineBlock
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.lightWash
import typingsSlinky.gestalt.gestaltStrings.maroon
import typingsSlinky.gestalt.gestaltStrings.midnight
import typingsSlinky.gestalt.gestaltStrings.navy
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.olive
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.orchid
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.pine
import typingsSlinky.gestalt.gestaltStrings.purple
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.relative
import typingsSlinky.gestalt.gestaltStrings.row
import typingsSlinky.gestalt.gestaltStrings.scroll
import typingsSlinky.gestalt.gestaltStrings.scrollX
import typingsSlinky.gestalt.gestaltStrings.scrollY
import typingsSlinky.gestalt.gestaltStrings.shrink
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.start
import typingsSlinky.gestalt.gestaltStrings.static
import typingsSlinky.gestalt.gestaltStrings.stretch
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.transparentDarkGray
import typingsSlinky.gestalt.gestaltStrings.visible
import typingsSlinky.gestalt.gestaltStrings.visuallyHidden
import typingsSlinky.gestalt.gestaltStrings.watermelon
import typingsSlinky.gestalt.gestaltStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxProps extends js.Object {
  var alignContent: js.UndefOr[start | end | center | between | around | evenly | stretch] = js.native
  var alignItems: js.UndefOr[start | end | center | baseline | stretch] = js.native
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.native
  var borderSize: js.UndefOr[sm | lg | none] = js.native
  var bottom: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var color: js.UndefOr[
    blue | darkGray | darkWash | eggplant | gray | green | lightGray | lightWash | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | transparent | transparentDarkGray | watermelon | white
  ] = js.native
  var column: js.UndefOr[UnsignedUpTo12] = js.native
  var dangerouslySetInlineStyle: js.UndefOr[AnonStyle] = js.native
  var direction: js.UndefOr[row | column] = js.native
  var display: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.native
  var fit: js.UndefOr[Boolean] = js.native
  var flex: js.UndefOr[grow | shrink | none] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var justifyContent: js.UndefOr[start | end | center | between | around | evenly] = js.native
  var left: js.UndefOr[Boolean] = js.native
  var lgColumn: js.UndefOr[UnsignedUpTo12] = js.native
  var lgDirection: js.UndefOr[row | column] = js.native
  var lgDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.native
  var lgMargin: js.UndefOr[SignedUpTo12 | auto] = js.native
  var lgMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.native
  var lgMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.native
  var lgMarginLeft: js.UndefOr[SignedUpTo12 | auto] = js.native
  var lgMarginRight: js.UndefOr[SignedUpTo12 | auto] = js.native
  var lgMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.native
  var lgMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.native
  var lgPadding: js.UndefOr[UnsignedUpTo12] = js.native
  var lgPaddingX: js.UndefOr[UnsignedUpTo12] = js.native
  var lgPaddingY: js.UndefOr[UnsignedUpTo12] = js.native
  var margin: js.UndefOr[SignedUpTo12 | auto] = js.native
  var marginBottom: js.UndefOr[SignedUpTo12 | auto] = js.native
  var marginEnd: js.UndefOr[SignedUpTo12 | auto] = js.native
  var marginLeft: js.UndefOr[SignedUpTo12 | auto] = js.native
  var marginRight: js.UndefOr[SignedUpTo12 | auto] = js.native
  var marginStart: js.UndefOr[SignedUpTo12 | auto] = js.native
  var marginTop: js.UndefOr[SignedUpTo12 | auto] = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var mdColumn: js.UndefOr[UnsignedUpTo12] = js.native
  var mdDirection: js.UndefOr[row | column] = js.native
  var mdDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.native
  var mdMargin: js.UndefOr[SignedUpTo12 | auto] = js.native
  var mdMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.native
  var mdMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.native
  var mdMarginLeft: js.UndefOr[SignedUpTo12 | auto] = js.native
  var mdMarginRight: js.UndefOr[SignedUpTo12 | auto] = js.native
  var mdMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.native
  var mdMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.native
  var mdPadding: js.UndefOr[UnsignedUpTo12] = js.native
  var mdPaddingX: js.UndefOr[UnsignedUpTo12] = js.native
  var mdPaddingY: js.UndefOr[UnsignedUpTo12] = js.native
  var minHeight: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
  var opacity: js.UndefOr[
    `0` | `0.1` | `0.2` | `0.3` | `0.4` | `0.5` | `0.6` | `0.7` | `0.8` | `0.9` | `1`
  ] = js.native
  var overflow: js.UndefOr[visible | hidden | scroll | scrollX | scrollY | auto] = js.native
  var padding: js.UndefOr[UnsignedUpTo12] = js.native
  var paddingX: js.UndefOr[UnsignedUpTo12] = js.native
  var paddingY: js.UndefOr[UnsignedUpTo12] = js.native
  var position: js.UndefOr[static | absolute | relative | fixed] = js.native
  var right: js.UndefOr[Boolean] = js.native
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  var smColumn: js.UndefOr[UnsignedUpTo12] = js.native
  var smDirection: js.UndefOr[row | column] = js.native
  var smDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.native
  var smMargin: js.UndefOr[SignedUpTo12 | auto] = js.native
  var smMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.native
  var smMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.native
  var smMarginLeft: js.UndefOr[SignedUpTo12 | auto] = js.native
  var smMarginRight: js.UndefOr[SignedUpTo12 | auto] = js.native
  var smMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.native
  var smMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.native
  var smPadding: js.UndefOr[UnsignedUpTo12] = js.native
  var smPaddingX: js.UndefOr[UnsignedUpTo12] = js.native
  var smPaddingY: js.UndefOr[UnsignedUpTo12] = js.native
  var top: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
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
    def withAlignContent(value: start | end | center | between | around | evenly | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignItems(value: start | end | center | baseline | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignSelf(value: auto | start | end | center | baseline | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderSize(value: sm | lg | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(
      value: blue | darkGray | darkWash | eggplant | gray | green | lightGray | lightWash | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | transparent | transparentDarkGray | watermelon | white
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerouslySetInlineStyle(value: AnonStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslySetInlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: row | column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withFlex(value: grow | shrink | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyContent(value: start | end | center | between | around | evenly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLgColumn(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withLgDirection(value: row | column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLgDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withLgMargin(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLgMarginBottom(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withLgMarginEnd(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgMarginEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withLgMarginLeft(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withLgMarginRight(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withLgMarginStart(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgMarginStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginStart")(js.undefined)
        ret
    }
    @scala.inline
    def withLgMarginTop(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgMarginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withLgPadding(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLgPaddingX(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPaddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgPaddingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPaddingX")(js.undefined)
        ret
    }
    @scala.inline
    def withLgPaddingY(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPaddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgPaddingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPaddingY")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginEnd(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginStart(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMdColumn(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withMdDirection(value: row | column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withMdDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withMdMargin(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMdMarginBottom(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMdMarginEnd(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdMarginEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMdMarginLeft(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMdMarginRight(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMdMarginStart(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdMarginStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMdMarginTop(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdMarginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMdPadding(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withMdPaddingX(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPaddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdPaddingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPaddingX")(js.undefined)
        ret
    }
    @scala.inline
    def withMdPaddingY(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPaddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdPaddingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPaddingY")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: `0` | `0.1` | `0.2` | `0.3` | `0.4` | `0.5` | `0.6` | `0.7` | `0.8` | `0.9` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: visible | hidden | scroll | scrollX | scrollY | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingX(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingY(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: static | absolute | relative | fixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(js.undefined)
        ret
    }
    @scala.inline
    def withSmColumn(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSmDirection(value: row | column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSmDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSmMargin(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSmMarginBottom(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSmMarginEnd(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmMarginEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSmMarginLeft(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSmMarginRight(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withSmMarginStart(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmMarginStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSmMarginTop(value: SignedUpTo12 | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smMarginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSmPadding(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSmPaddingX(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPaddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmPaddingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPaddingX")(js.undefined)
        ret
    }
    @scala.inline
    def withSmPaddingY(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPaddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmPaddingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPaddingY")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

