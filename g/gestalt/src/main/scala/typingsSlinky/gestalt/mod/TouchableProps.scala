package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import typingsSlinky.gestalt.anon.EventSyntheticEvent
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltNumbers.`7`
import typingsSlinky.gestalt.gestaltNumbers.`8`
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.copy
import typingsSlinky.gestalt.gestaltStrings.grab
import typingsSlinky.gestalt.gestaltStrings.grabbing
import typingsSlinky.gestalt.gestaltStrings.move
import typingsSlinky.gestalt.gestaltStrings.noDrop
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.pointer
import typingsSlinky.gestalt.gestaltStrings.zoomIn
import typingsSlinky.gestalt.gestaltStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var fullHeight: js.UndefOr[Boolean] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.undefined
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  def onTouch(args: typingsSlinky.gestalt.anon.`3`): Unit
}

object TouchableProps {
  @scala.inline
  def apply(
    onTouch: typingsSlinky.gestalt.anon.`3` => Unit,
    children: TagMod[Any] = null,
    fullHeight: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    mouseCursor: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut = null,
    onMouseEnter: /* args */ EventSyntheticEvent => Unit = null,
    onMouseLeave: /* args */ EventSyntheticEvent => Unit = null,
    rounding: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = null
  ): TouchableProps = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fullHeight)) __obj.updateDynamic("fullHeight")(fullHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.get.asInstanceOf[js.Any])
    if (mouseCursor != null) __obj.updateDynamic("mouseCursor")(mouseCursor.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (rounding != null) __obj.updateDynamic("rounding")(rounding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchableProps]
  }
}

