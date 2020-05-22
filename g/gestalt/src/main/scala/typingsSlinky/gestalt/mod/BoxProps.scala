package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import typingsSlinky.gestalt.anon.Style
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

trait BoxProps extends js.Object {
  var alignContent: js.UndefOr[start | end | center | between | around | evenly | stretch] = js.undefined
  var alignItems: js.UndefOr[start | end | center | baseline | stretch] = js.undefined
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.undefined
  var borderSize: js.UndefOr[sm | lg | none] = js.undefined
  var bottom: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var color: js.UndefOr[
    blue | darkGray | darkWash | eggplant | gray | green | lightGray | lightWash | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | transparent | transparentDarkGray | watermelon | white
  ] = js.undefined
  var column: js.UndefOr[UnsignedUpTo12] = js.undefined
  var dangerouslySetInlineStyle: js.UndefOr[Style] = js.undefined
  var direction: js.UndefOr[row | column] = js.undefined
  var display: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var fit: js.UndefOr[Boolean] = js.undefined
  var flex: js.UndefOr[grow | shrink | none] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var justifyContent: js.UndefOr[start | end | center | between | around | evenly] = js.undefined
  var left: js.UndefOr[Boolean] = js.undefined
  var lgColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  var lgDirection: js.UndefOr[row | column] = js.undefined
  var lgDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var lgMargin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var lgMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var lgMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var lgMarginLeft: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var lgMarginRight: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var lgMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var lgMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var lgPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var lgPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var lgPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var margin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var marginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var marginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var marginLeft: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var marginRight: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var marginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var marginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var mdColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdDirection: js.UndefOr[row | column] = js.undefined
  var mdDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var mdMargin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var mdMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var mdMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var mdMarginLeft: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var mdMarginRight: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var mdMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var mdMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var mdPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var minHeight: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
  var opacity: js.UndefOr[
    `0` | `0.1` | `0.2` | `0.3` | `0.4` | `0.5` | `0.6` | `0.7` | `0.8` | `0.9` | `1`
  ] = js.undefined
  var overflow: js.UndefOr[visible | hidden | scroll | scrollX | scrollY | auto] = js.undefined
  var padding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var paddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var paddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var position: js.UndefOr[static | absolute | relative | fixed] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  var smColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smDirection: js.UndefOr[row | column] = js.undefined
  var smDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var smMargin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var smMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var smMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var smMarginLeft: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var smMarginRight: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var smMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var smMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  var smPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

