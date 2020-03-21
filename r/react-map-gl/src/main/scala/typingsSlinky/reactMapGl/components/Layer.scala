package typingsSlinky.reactMapGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mapboxGl.mod.AnyLayout
import typingsSlinky.mapboxGl.mod.BackgroundPaint
import typingsSlinky.mapboxGl.mod.CirclePaint
import typingsSlinky.mapboxGl.mod.FillExtrusionPaint
import typingsSlinky.mapboxGl.mod.FillPaint
import typingsSlinky.mapboxGl.mod.HeatmapPaint
import typingsSlinky.mapboxGl.mod.HillshadePaint
import typingsSlinky.mapboxGl.mod.LinePaint
import typingsSlinky.mapboxGl.mod.RasterPaint
import typingsSlinky.mapboxGl.mod.SymbolPaint
import typingsSlinky.reactMapGl.mod.LayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMapGl.mod.Layer] {
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
  ): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.Layer] = {
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

