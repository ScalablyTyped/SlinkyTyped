package typingsSlinky.ol.styleStyleMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.renderMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fill: js.UndefOr[typingsSlinky.ol.styleFillMod.default] = js.undefined
  var geometry: js.UndefOr[String | typingsSlinky.ol.geomGeometryMod.default | GeometryFunction] = js.undefined
  var image: js.UndefOr[typingsSlinky.ol.styleImageMod.default] = js.undefined
  var renderer: js.UndefOr[RenderFunction] = js.undefined
  var stroke: js.UndefOr[typingsSlinky.ol.styleStrokeMod.default] = js.undefined
  var text: js.UndefOr[typingsSlinky.ol.styleTextMod.default] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fill: typingsSlinky.ol.styleFillMod.default = null,
    geometry: String | typingsSlinky.ol.geomGeometryMod.default | GeometryFunction = null,
    image: typingsSlinky.ol.styleImageMod.default = null,
    renderer: (/* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* p1 */ State) => Unit = null,
    stroke: typingsSlinky.ol.styleStrokeMod.default = null,
    text: typingsSlinky.ol.styleTextMod.default = null,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction2(renderer))
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

