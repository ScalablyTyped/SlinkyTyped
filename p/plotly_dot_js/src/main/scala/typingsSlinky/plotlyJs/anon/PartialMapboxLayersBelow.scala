package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.MapboxSymbol
import typingsSlinky.plotlyJs.mod.ShapeLine
import typingsSlinky.plotlyJs.plotlyJsBooleans.`true`
import typingsSlinky.plotlyJs.plotlyJsStrings.circle
import typingsSlinky.plotlyJs.plotlyJsStrings.fill
import typingsSlinky.plotlyJs.plotlyJsStrings.geojson
import typingsSlinky.plotlyJs.plotlyJsStrings.image
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.raster
import typingsSlinky.plotlyJs.plotlyJsStrings.symbol
import typingsSlinky.plotlyJs.plotlyJsStrings.vecotr
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.MapboxLayers> */
trait PartialMapboxLayersBelow extends js.Object {
  var below: js.UndefOr[String] = js.undefined
  var circle: js.UndefOr[Radius] = js.undefined
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.undefined
  var coordinates: js.UndefOr[Double | String] = js.undefined
  var fill: js.UndefOr[Outlinecolor] = js.undefined
  var line: js.UndefOr[Partial[ShapeLine]] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Double | String] = js.undefined
  var sourceattribution: js.UndefOr[String] = js.undefined
  var sourcelayer: js.UndefOr[String] = js.undefined
  var sourcetype: js.UndefOr[geojson | vecotr | raster | image] = js.undefined
  var symbol: js.UndefOr[Partial[MapboxSymbol]] = js.undefined
  var templateitemname: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[circle | line | fill | symbol | raster] = js.undefined
  var visible: js.UndefOr[`true`] = js.undefined
}

object PartialMapboxLayersBelow {
  @scala.inline
  def apply(
    below: String = null,
    circle: Radius = null,
    color: typingsSlinky.plotlyJs.mod.Color = null,
    coordinates: Double | String = null,
    fill: Outlinecolor = null,
    line: Partial[ShapeLine] = null,
    maxzoom: js.UndefOr[Double] = js.undefined,
    minzoom: js.UndefOr[Double] = js.undefined,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    source: Double | String = null,
    sourceattribution: String = null,
    sourcelayer: String = null,
    sourcetype: geojson | vecotr | raster | image = null,
    symbol: Partial[MapboxSymbol] = null,
    templateitemname: String = null,
    `type`: circle | line | fill | symbol | raster = null,
    visible: `true` = null
  ): PartialMapboxLayersBelow = {
    val __obj = js.Dynamic.literal()
    if (below != null) __obj.updateDynamic("below")(below.asInstanceOf[js.Any])
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minzoom)) __obj.updateDynamic("minzoom")(minzoom.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceattribution != null) __obj.updateDynamic("sourceattribution")(sourceattribution.asInstanceOf[js.Any])
    if (sourcelayer != null) __obj.updateDynamic("sourcelayer")(sourcelayer.asInstanceOf[js.Any])
    if (sourcetype != null) __obj.updateDynamic("sourcetype")(sourcetype.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (templateitemname != null) __obj.updateDynamic("templateitemname")(templateitemname.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMapboxLayersBelow]
  }
}

