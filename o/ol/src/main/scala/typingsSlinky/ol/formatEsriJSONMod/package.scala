package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatEsriJSONMod {
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Feature
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.FeatureSet
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Geometry
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.HasZM
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Multipoint
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Point
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Polygon
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Polyline
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Position
  import typingsSlinky.arcgisDashRestDashApi.arcgisDashRestDashApiMod.SpatialReferenceWkid

  type EsriJSON = typingsSlinky.ol.formatJSONFeatureMod.default
  type EsriJSONFeature = Feature
  type EsriJSONFeatureSet = FeatureSet
  type EsriJSONGeometry = Geometry
  type EsriJSONHasZM = HasZM
  type EsriJSONMultipoint = Multipoint
  type EsriJSONPoint = Point
  type EsriJSONPolygon = Polygon
  type EsriJSONPolyline = Polyline
  type EsriJSONPosition = Position
  type EsriJSONSpatialReferenceWkid = SpatialReferenceWkid
}
