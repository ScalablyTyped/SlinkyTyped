package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.Outlinecolor
import typingsSlinky.plotlyJs.anon.PartialMapboxSymbolIcon
import typingsSlinky.plotlyJs.anon.PartialShapeLine
import typingsSlinky.plotlyJs.anon.Radius
import typingsSlinky.plotlyJs.plotlyJsBooleans.`true`
import typingsSlinky.plotlyJs.plotlyJsStrings.circle
import typingsSlinky.plotlyJs.plotlyJsStrings.fill
import typingsSlinky.plotlyJs.plotlyJsStrings.geojson
import typingsSlinky.plotlyJs.plotlyJsStrings.image
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.raster
import typingsSlinky.plotlyJs.plotlyJsStrings.symbol
import typingsSlinky.plotlyJs.plotlyJsStrings.vecotr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxLayers extends js.Object {
  var below: String
  var circle: Radius
  var color: Color
  var coordinates: Double | String
  var fill: Outlinecolor
  var line: PartialShapeLine
  var maxzoom: Double
  var minzoom: Double
  var name: String
  var opacity: Double
  var source: Double | String
  var sourceattribution: String
  var sourcelayer: String
  var sourcetype: geojson | vecotr | raster | image
  var symbol: PartialMapboxSymbolIcon
  var templateitemname: String
  var `type`: circle | line | fill | symbol | raster
  var visible: `true`
}

object MapboxLayers {
  @scala.inline
  def apply(
    below: String,
    circle: Radius,
    color: Color,
    coordinates: Double | String,
    fill: Outlinecolor,
    line: PartialShapeLine,
    maxzoom: Double,
    minzoom: Double,
    name: String,
    opacity: Double,
    source: Double | String,
    sourceattribution: String,
    sourcelayer: String,
    sourcetype: geojson | vecotr | raster | image,
    symbol: PartialMapboxSymbolIcon,
    templateitemname: String,
    `type`: circle | line | fill | symbol | raster,
    visible: `true`
  ): MapboxLayers = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceattribution = sourceattribution.asInstanceOf[js.Any], sourcelayer = sourcelayer.asInstanceOf[js.Any], sourcetype = sourcetype.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxLayers]
  }
}

