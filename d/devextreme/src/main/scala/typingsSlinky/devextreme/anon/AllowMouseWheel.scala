package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.alt
import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.ctrl
import typingsSlinky.devextreme.devextremeStrings.meta
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.pan
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.devextremeStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowMouseWheel extends js.Object {
  var allowMouseWheel: js.UndefOr[Boolean] = js.undefined
  var allowTouchGestures: js.UndefOr[Boolean] = js.undefined
  var argumentAxis: js.UndefOr[both | none | pan | zoom] = js.undefined
  var dragBoxStyle: js.UndefOr[Opacity] = js.undefined
  var dragToZoom: js.UndefOr[Boolean] = js.undefined
  var panKey: js.UndefOr[alt | ctrl | meta | shift] = js.undefined
  var valueAxis: js.UndefOr[both | none | pan | zoom] = js.undefined
}

object AllowMouseWheel {
  @scala.inline
  def apply(
    allowMouseWheel: js.UndefOr[Boolean] = js.undefined,
    allowTouchGestures: js.UndefOr[Boolean] = js.undefined,
    argumentAxis: both | none | pan | zoom = null,
    dragBoxStyle: Opacity = null,
    dragToZoom: js.UndefOr[Boolean] = js.undefined,
    panKey: alt | ctrl | meta | shift = null,
    valueAxis: both | none | pan | zoom = null
  ): AllowMouseWheel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMouseWheel)) __obj.updateDynamic("allowMouseWheel")(allowMouseWheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTouchGestures)) __obj.updateDynamic("allowTouchGestures")(allowTouchGestures.get.asInstanceOf[js.Any])
    if (argumentAxis != null) __obj.updateDynamic("argumentAxis")(argumentAxis.asInstanceOf[js.Any])
    if (dragBoxStyle != null) __obj.updateDynamic("dragBoxStyle")(dragBoxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dragToZoom)) __obj.updateDynamic("dragToZoom")(dragToZoom.get.asInstanceOf[js.Any])
    if (panKey != null) __obj.updateDynamic("panKey")(panKey.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowMouseWheel]
  }
}

