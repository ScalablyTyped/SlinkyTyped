package typingsSlinky.reactDashMapDashGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
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
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.LayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.Layer] {
  @JSImport("react-map-gl", "Layer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String,
    beforeId: String = null,
    filter: js.Array[_] = null,
    layout: AnyLayout = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    source: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.Layer] = {
    val __obj = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (beforeId != null) __obj.updateDynamic("beforeId")(beforeId.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LayerProps
}

