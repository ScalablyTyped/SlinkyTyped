package typingsSlinky.openlayers.openlayersMod.olx.interaction

import typingsSlinky.openlayers.openlayersMod.Collection
import typingsSlinky.openlayers.openlayersMod.EventsConditionType
import typingsSlinky.openlayers.openlayersMod.Feature
import typingsSlinky.openlayers.openlayersMod.MapBrowserEvent
import typingsSlinky.openlayers.openlayersMod.StyleFunction
import typingsSlinky.openlayers.openlayersMod.source.Vector
import typingsSlinky.openlayers.openlayersMod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var deleteCondition: js.UndefOr[EventsConditionType] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var insertVertexCondition: js.UndefOr[EventsConditionType] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Vector] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object ModifyOptions {
  @scala.inline
  def apply(
    condition: /* event */ MapBrowserEvent => Boolean = null,
    deleteCondition: /* event */ MapBrowserEvent => Boolean = null,
    features: Collection[Feature] = null,
    insertVertexCondition: /* event */ MapBrowserEvent => Boolean = null,
    pixelTolerance: Int | Double = null,
    source: Vector = null,
    style: Style | js.Array[Style] | StyleFunction = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (deleteCondition != null) __obj.updateDynamic("deleteCondition")(js.Any.fromFunction1(deleteCondition))
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (insertVertexCondition != null) __obj.updateDynamic("insertVertexCondition")(js.Any.fromFunction1(insertVertexCondition))
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptions]
  }
}

