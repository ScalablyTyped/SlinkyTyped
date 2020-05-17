package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styleStyleMod {
  type GeometryFunction = js.Function1[
    /* p0 */ typingsSlinky.ol.olFeatureMod.FeatureLike, 
    typingsSlinky.ol.geometryMod.default | typingsSlinky.ol.renderFeatureMod.default
  ]
  type RenderFunction = js.Function2[
    /* p0 */ typingsSlinky.ol.coordinateMod.Coordinate | (js.Array[
      js.Array[typingsSlinky.ol.coordinateMod.Coordinate] | typingsSlinky.ol.coordinateMod.Coordinate
    ]), 
    /* p1 */ typingsSlinky.ol.renderMod.State, 
    scala.Unit
  ]
  type StyleFunction = js.Function2[
    /* p0 */ typingsSlinky.ol.olFeatureMod.FeatureLike, 
    /* p1 */ scala.Double, 
    typingsSlinky.ol.styleStyleMod.Style | js.Array[typingsSlinky.ol.styleStyleMod.Style] | scala.Unit
  ]
}
