package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.gestalt.mod.BoxProps
import typingsSlinky.gestalt.mod.SignedUpTo12
import typingsSlinky.gestalt.mod.UnsignedUpTo12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Box {
  @JSImport("gestalt", "Box")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Box] {
    @scala.inline
    def alignContent(value: start | end | center | between | around | evenly | stretch): this.type = set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def alignItems(value: start | end | center | baseline | stretch): this.type = set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def alignSelf(value: auto | start | end | center | baseline | stretch): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def borderSize(value: sm | lg | none): this.type = set("borderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def bottom(value: Boolean): this.type = set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def color(
      value: blue | darkGray | darkWash | eggplant | gray | green | lightGray | lightWash | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | transparent | transparentDarkGray | watermelon | white
    ): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def column(value: UnsignedUpTo12): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def dangerouslySetInlineStyle(value: AnonStyle): this.type = set("dangerouslySetInlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: row | column): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def display(value: none | flex | block | inlineBlock | visuallyHidden): this.type = set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def fit(value: Boolean): this.type = set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def flex(value: grow | shrink | none): this.type = set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def justifyContent(value: start | end | center | between | around | evenly): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def left(value: Boolean): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def lgColumn(value: UnsignedUpTo12): this.type = set("lgColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def lgDirection(value: row | column): this.type = set("lgDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def lgDisplay(value: none | flex | block | inlineBlock | visuallyHidden): this.type = set("lgDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def lgMargin(value: SignedUpTo12 | auto): this.type = set("lgMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def lgMarginBottom(value: SignedUpTo12 | auto): this.type = set("lgMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def lgMarginEnd(value: SignedUpTo12 | auto): this.type = set("lgMarginEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def lgMarginLeft(value: SignedUpTo12 | auto): this.type = set("lgMarginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def lgMarginRight(value: SignedUpTo12 | auto): this.type = set("lgMarginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def lgMarginStart(value: SignedUpTo12 | auto): this.type = set("lgMarginStart", value.asInstanceOf[js.Any])
    @scala.inline
    def lgMarginTop(value: SignedUpTo12 | auto): this.type = set("lgMarginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def lgPadding(value: UnsignedUpTo12): this.type = set("lgPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def lgPaddingX(value: UnsignedUpTo12): this.type = set("lgPaddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def lgPaddingY(value: UnsignedUpTo12): this.type = set("lgPaddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: SignedUpTo12 | auto): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def marginBottom(value: SignedUpTo12 | auto): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def marginEnd(value: SignedUpTo12 | auto): this.type = set("marginEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def marginLeft(value: SignedUpTo12 | auto): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def marginRight(value: SignedUpTo12 | auto): this.type = set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def marginStart(value: SignedUpTo12 | auto): this.type = set("marginStart", value.asInstanceOf[js.Any])
    @scala.inline
    def marginTop(value: SignedUpTo12 | auto): this.type = set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def mdColumn(value: UnsignedUpTo12): this.type = set("mdColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def mdDirection(value: row | column): this.type = set("mdDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def mdDisplay(value: none | flex | block | inlineBlock | visuallyHidden): this.type = set("mdDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def mdMargin(value: SignedUpTo12 | auto): this.type = set("mdMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def mdMarginBottom(value: SignedUpTo12 | auto): this.type = set("mdMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def mdMarginEnd(value: SignedUpTo12 | auto): this.type = set("mdMarginEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def mdMarginLeft(value: SignedUpTo12 | auto): this.type = set("mdMarginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def mdMarginRight(value: SignedUpTo12 | auto): this.type = set("mdMarginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def mdMarginStart(value: SignedUpTo12 | auto): this.type = set("mdMarginStart", value.asInstanceOf[js.Any])
    @scala.inline
    def mdMarginTop(value: SignedUpTo12 | auto): this.type = set("mdMarginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def mdPadding(value: UnsignedUpTo12): this.type = set("mdPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def mdPaddingX(value: UnsignedUpTo12): this.type = set("mdPaddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def mdPaddingY(value: UnsignedUpTo12): this.type = set("mdPaddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def opacity(value: `0` | `0.1` | `0.2` | `0.3` | `0.4` | `0.5` | `0.6` | `0.7` | `0.8` | `0.9` | `1`): this.type = set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def overflow(value: visible | hidden | scroll | scrollX | scrollY | auto): this.type = set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: UnsignedUpTo12): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingX(value: UnsignedUpTo12): this.type = set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingY(value: UnsignedUpTo12): this.type = set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: static | absolute | relative | fixed): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def rounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): this.type = set("rounding", value.asInstanceOf[js.Any])
    @scala.inline
    def smColumn(value: UnsignedUpTo12): this.type = set("smColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def smDirection(value: row | column): this.type = set("smDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def smDisplay(value: none | flex | block | inlineBlock | visuallyHidden): this.type = set("smDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def smMargin(value: SignedUpTo12 | auto): this.type = set("smMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def smMarginBottom(value: SignedUpTo12 | auto): this.type = set("smMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def smMarginEnd(value: SignedUpTo12 | auto): this.type = set("smMarginEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def smMarginLeft(value: SignedUpTo12 | auto): this.type = set("smMarginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def smMarginRight(value: SignedUpTo12 | auto): this.type = set("smMarginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def smMarginStart(value: SignedUpTo12 | auto): this.type = set("smMarginStart", value.asInstanceOf[js.Any])
    @scala.inline
    def smMarginTop(value: SignedUpTo12 | auto): this.type = set("smMarginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def smPadding(value: UnsignedUpTo12): this.type = set("smPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def smPaddingX(value: UnsignedUpTo12): this.type = set("smPaddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def smPaddingY(value: UnsignedUpTo12): this.type = set("smPaddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

