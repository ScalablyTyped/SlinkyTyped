package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import typingsSlinky.gestalt.Anon1
import typingsSlinky.gestalt.AnonEventSyntheticEvent
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.copy
import typingsSlinky.gestalt.gestaltStrings.grab
import typingsSlinky.gestalt.gestaltStrings.grabbing
import typingsSlinky.gestalt.gestaltStrings.move
import typingsSlinky.gestalt.gestaltStrings.noDrop
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.pointer
import typingsSlinky.gestalt.gestaltStrings.rounded
import typingsSlinky.gestalt.gestaltStrings.roundedBottom
import typingsSlinky.gestalt.gestaltStrings.roundedLeft
import typingsSlinky.gestalt.gestaltStrings.roundedRight
import typingsSlinky.gestalt.gestaltStrings.roundedTop
import typingsSlinky.gestalt.gestaltStrings.square
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
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
  var shape: js.UndefOr[
    square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight
  ] = js.undefined
  def onTouch(args: Anon1): Unit
}

object TouchableProps {
  @scala.inline
  def apply(
    onTouch: Anon1 => Unit,
    children: TagMod[Any] = null,
    fullHeight: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    mouseCursor: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut = null,
    onMouseEnter: /* args */ AnonEventSyntheticEvent => Unit = null,
    onMouseLeave: /* args */ AnonEventSyntheticEvent => Unit = null,
    shape: square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight = null
  ): TouchableProps = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fullHeight)) __obj.updateDynamic("fullHeight")(fullHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (mouseCursor != null) __obj.updateDynamic("mouseCursor")(mouseCursor.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchableProps]
  }
}

