package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styleStyleMod {
  import typingsSlinky.ol.coordinateMod.Coordinate
  import typingsSlinky.ol.featureMod.FeatureLike
  import typingsSlinky.ol.renderMod.State

  type GeometryFunction = js.Function1[
    /* p0 */ FeatureLike, 
    js.UndefOr[
      typingsSlinky.ol.geomGeometryMod.default | typingsSlinky.ol.renderFeatureMod.default
    ]
  ]
  type RenderFunction = js.Function2[
    /* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), 
    /* p1 */ State, 
    Unit
  ]
  type StyleFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ Double, Style | js.Array[Style]]
  type StyleLike = Style | js.Array[Style] | StyleFunction
}
