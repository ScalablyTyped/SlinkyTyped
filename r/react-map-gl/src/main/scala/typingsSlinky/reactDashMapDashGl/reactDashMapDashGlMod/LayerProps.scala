package typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod

import typingsSlinky.mapboxDashGl.mapboxDashGlMod.AnyLayout
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.BackgroundPaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.CirclePaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.FillExtrusionPaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.FillPaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.HeatmapPaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.HillshadePaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.LinePaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.RasterPaint
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.SymbolPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var beforeId: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[AnyLayout] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
  var source: js.UndefOr[String] = js.undefined
  var `type`: String
}

object LayerProps {
  @scala.inline
  def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String,
    beforeId: String = null,
    filter: js.Array[_] = null,
    id: String = null,
    layout: AnyLayout = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    source: String = null
  ): LayerProps = {
    val __obj = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (beforeId != null) __obj.updateDynamic("beforeId")(beforeId.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerProps]
  }
}

