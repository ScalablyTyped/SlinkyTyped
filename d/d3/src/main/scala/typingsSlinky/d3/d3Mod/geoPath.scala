package typingsSlinky.d3.d3Mod

import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoContext
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoPath
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoPermissibleObjects
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoProjection
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoStreamWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoPath")
@js.native
object geoPath extends js.Object {
  def apply(): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: Null, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
}

