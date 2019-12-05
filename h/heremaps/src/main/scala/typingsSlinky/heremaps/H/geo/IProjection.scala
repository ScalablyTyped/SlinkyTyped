package typingsSlinky.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjection extends js.Object {
  def geoToPoint(geoPoint: IPoint): typingsSlinky.heremaps.H.math.Point = js.native
  def geoToPoint(geoPoint: IPoint, opt_out: typingsSlinky.heremaps.H.math.Point): typingsSlinky.heremaps.H.math.Point = js.native
  def latLngToPoint(lat: Double, lng: Double): typingsSlinky.heremaps.H.math.Point = js.native
  def latLngToPoint(lat: Double, lng: Double, opt_out: typingsSlinky.heremaps.H.math.Point): typingsSlinky.heremaps.H.math.Point = js.native
  def pointToGeo(point: typingsSlinky.heremaps.H.math.IPoint): Point = js.native
  def pointToGeo(point: typingsSlinky.heremaps.H.math.IPoint, opt_out: Point): Point = js.native
  def xyToGeo(x: Double, y: Double): Point = js.native
  def xyToGeo(x: Double, y: Double, opt_out: Point): Point = js.native
}

