package typingsSlinky.leafletPolylinedecorator.mod

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.leaflet.mod.FeatureGroup_
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.Polygon_
import typingsSlinky.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "PolylineDecorator")
@js.native
class PolylineDecorator_ protected ()
  extends FeatureGroup_[js.Any] {
  def this(paths: js.Array[
        js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
      ]) = this()
  def this(paths: Polygon_[_]) = this()
  def this(paths: Polyline_[LineString | MultiLineString, _]) = this()
  def this(
    paths: js.Array[
        js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
      ],
    options: PolylineDecoratorOptions
  ) = this()
  def this(paths: Polygon_[_], options: PolylineDecoratorOptions) = this()
  def this(paths: Polyline_[LineString | MultiLineString, _], options: PolylineDecoratorOptions) = this()
  def initialize(
    paths: js.Array[
      js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
    ]
  ): Unit = js.native
  def initialize(
    paths: js.Array[
      js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
    ],
    options: PolylineDecoratorOptions
  ): Unit = js.native
  def initialize(paths: Polygon_[_]): Unit = js.native
  def initialize(paths: Polygon_[_], options: PolylineDecoratorOptions): Unit = js.native
  def initialize(paths: Polyline_[LineString | MultiLineString, _]): Unit = js.native
  def initialize(paths: Polyline_[LineString | MultiLineString, _], options: PolylineDecoratorOptions): Unit = js.native
  def redraw(): Unit = js.native
  def setPaths(
    paths: js.Array[
      js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
    ]
  ): Unit = js.native
  def setPaths(paths: Polygon_[_]): Unit = js.native
  def setPaths(paths: Polyline_[LineString | MultiLineString, _]): Unit = js.native
  def setPatterns(patterns: js.Array[Pattern]): Unit = js.native
}

