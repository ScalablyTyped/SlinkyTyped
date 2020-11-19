package typingsSlinky.d3Geo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoRawProjection extends js.Object {
  
  /**
    * Projects the specified point [lambda, phi] in radians, returning a new point [x, y] in unitless coordinates.
    * @param lambda Spherical lambda coordinate in radians.
    * @param phi Spherical phi coordinate in radians.
    */
  def apply(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
  
  /**
    * Inverts the projected point [x, y] in unitless coordinates, returning an unprojected point in spherical coordinates [lambda, phi] in radians.
    * @param x x-coordinate (unitless).
    * @param y y-coordinate (unitless).
    */
  var invert: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, js.Tuple2[Double, Double]]] = js.native
}
