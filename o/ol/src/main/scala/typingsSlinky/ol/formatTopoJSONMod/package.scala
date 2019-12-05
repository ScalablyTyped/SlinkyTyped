package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatTopoJSONMod {
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.LineString
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.MultiLineString
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPoint
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Point
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
  import typingsSlinky.topojsonDashSpecification.topojsonDashSpecificationMod.Topology

  type TopoJSON = typingsSlinky.ol.formatJSONFeatureMod.default
  type TopoJSONGeometry = GeometryObject[js.Object]
  type TopoJSONGeometryCollection = GeometryCollection[js.Object]
  type TopoJSONLineString = LineString[js.Object]
  type TopoJSONMultiLineString = MultiLineString[js.Object]
  type TopoJSONMultiPoint = MultiPoint[js.Object]
  type TopoJSONMultiPolygon = MultiPolygon[js.Object]
  type TopoJSONPoint = Point[js.Object]
  type TopoJSONPolygon = Polygon[js.Object]
  type TopoJSONTopology = Topology[Objects[Properties]]
}
