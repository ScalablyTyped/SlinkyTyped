package typingsSlinky.reactOverlays.dropdownMenuMod

import slinky.core.SyntheticEvent
import typingsSlinky.reactOverlays.AnonArialabelledby
import typingsSlinky.reactOverlays.AnonRef
import typingsSlinky.reactOverlays.overlayMod.OverlayRenderProps
import typingsSlinky.reactOverlays.overlayMod.Placements
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuRenderProps extends OverlayRenderProps {
  var alignEnd: Boolean
  def close(event: SyntheticEvent[Event_, _]): Unit
}

object DropdownMenuRenderProps {
  @scala.inline
  def apply(
    alignEnd: Boolean,
    arrowProps: AnonRef,
    close: SyntheticEvent[Event_, _] => Unit,
    placement: Placements,
    props: AnonArialabelledby,
    scheduleUpdate: () => Unit,
    show: Boolean,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): DropdownMenuRenderProps = {
    val __obj = js.Dynamic.literal(alignEnd = alignEnd.asInstanceOf[js.Any], arrowProps = arrowProps.asInstanceOf[js.Any], close = js.Any.fromFunction1(close), placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show.asInstanceOf[js.Any])
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuRenderProps]
  }
}

