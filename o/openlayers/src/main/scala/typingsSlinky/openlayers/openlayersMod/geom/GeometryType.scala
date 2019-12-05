package typingsSlinky.openlayers.openlayersMod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The geometry type. One of `'Point'`, `'LineString'`, `'LinearRing'`,
  * `'Polygon'`, `'MultiPoint'`, `'MultiLineString'`, `'MultiPolygon'`,
  * `'GeometryCollection'`, `'Circle'`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.Point
  - typings.openlayers.openlayersStrings.LineString
  - typings.openlayers.openlayersStrings.LinearRing
  - typings.openlayers.openlayersStrings.Polygon
  - typings.openlayers.openlayersStrings.MultiPoint
  - typings.openlayers.openlayersStrings.MultiLineString
  - typings.openlayers.openlayersStrings.MultiPolygon
  - typings.openlayers.openlayersStrings.GeometryCollection
  - typings.openlayers.openlayersStrings.Circle
*/
trait GeometryType extends js.Object

object GeometryType {
  @scala.inline
  def Circle: typingsSlinky.openlayers.openlayersStrings.Circle = this.cast("Circle")
  @scala.inline
  def GeometryCollection: typingsSlinky.openlayers.openlayersStrings.GeometryCollection = this.cast("GeometryCollection")
  @scala.inline
  def LineString: typingsSlinky.openlayers.openlayersStrings.LineString = this.cast("LineString")
  @scala.inline
  def LinearRing: typingsSlinky.openlayers.openlayersStrings.LinearRing = this.cast("LinearRing")
  @scala.inline
  def MultiLineString: typingsSlinky.openlayers.openlayersStrings.MultiLineString = this.cast("MultiLineString")
  @scala.inline
  def MultiPoint: typingsSlinky.openlayers.openlayersStrings.MultiPoint = this.cast("MultiPoint")
  @scala.inline
  def MultiPolygon: typingsSlinky.openlayers.openlayersStrings.MultiPolygon = this.cast("MultiPolygon")
  @scala.inline
  def Point: typingsSlinky.openlayers.openlayersStrings.Point = this.cast("Point")
  @scala.inline
  def Polygon: typingsSlinky.openlayers.openlayersStrings.Polygon = this.cast("Polygon")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

