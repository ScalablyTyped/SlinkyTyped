package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.DrawGeometryFunctionType
import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.geom.GeometryType
import typingsSlinky.openlayers.mod.geom.SimpleGeometry
import typingsSlinky.openlayers.mod.source.Vector
import typingsSlinky.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var finishCondition: js.UndefOr[EventsConditionType] = js.undefined
  var freehand: js.UndefOr[Boolean] = js.undefined
  var freehandCondition: js.UndefOr[EventsConditionType] = js.undefined
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
  var minPoints: js.UndefOr[Double] = js.undefined
  var snapTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Vector] = js.undefined
  var stopClick: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var `type`: GeometryType
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    `type`: GeometryType,
    clickTolerance: js.UndefOr[Double] = js.undefined,
    condition: /* event */ MapBrowserEvent => Boolean = null,
    features: Collection[Feature] = null,
    finishCondition: /* event */ MapBrowserEvent => Boolean = null,
    freehand: js.UndefOr[Boolean] = js.undefined,
    freehandCondition: /* event */ MapBrowserEvent => Boolean = null,
    geometryFunction: (/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), /* geo */ js.UndefOr[SimpleGeometry]) => SimpleGeometry = null,
    geometryName: String = null,
    maxPoints: js.UndefOr[Double] = js.undefined,
    minPoints: js.UndefOr[Double] = js.undefined,
    snapTolerance: js.UndefOr[Double] = js.undefined,
    source: Vector = null,
    stopClick: js.UndefOr[Boolean] = js.undefined,
    style: Style | js.Array[Style] | StyleFunction = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(clickTolerance)) __obj.updateDynamic("clickTolerance")(clickTolerance.get.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (finishCondition != null) __obj.updateDynamic("finishCondition")(js.Any.fromFunction1(finishCondition))
    if (!js.isUndefined(freehand)) __obj.updateDynamic("freehand")(freehand.get.asInstanceOf[js.Any])
    if (freehandCondition != null) __obj.updateDynamic("freehandCondition")(js.Any.fromFunction1(freehandCondition))
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction2(geometryFunction))
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPoints)) __obj.updateDynamic("maxPoints")(maxPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPoints)) __obj.updateDynamic("minPoints")(minPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapTolerance)) __obj.updateDynamic("snapTolerance")(snapTolerance.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(stopClick)) __obj.updateDynamic("stopClick")(stopClick.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}

