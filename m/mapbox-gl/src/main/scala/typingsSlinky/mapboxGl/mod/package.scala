package typingsSlinky.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mapboxGl.mod.BackgroundLayout
    - typingsSlinky.mapboxGl.mod.FillLayout
    - typingsSlinky.mapboxGl.mod.FillExtrusionLayout
    - typingsSlinky.mapboxGl.mod.LineLayout
    - typingsSlinky.mapboxGl.mod.SymbolLayout
    - typingsSlinky.mapboxGl.mod.RasterLayout
    - typingsSlinky.mapboxGl.mod.CircleLayout
    - typingsSlinky.mapboxGl.mod.HeatmapLayout
    - typingsSlinky.mapboxGl.mod.HillshadeLayout
  */
  type AnyLayout = typingsSlinky.mapboxGl.mod._AnyLayout | typingsSlinky.mapboxGl.mod.BackgroundLayout | typingsSlinky.mapboxGl.mod.FillExtrusionLayout | typingsSlinky.mapboxGl.mod.RasterLayout | typingsSlinky.mapboxGl.mod.CircleLayout | typingsSlinky.mapboxGl.mod.HeatmapLayout | typingsSlinky.mapboxGl.mod.HillshadeLayout
  type BackgroundLayout = typingsSlinky.mapboxGl.mod.Layout
  type CircleLayout = typingsSlinky.mapboxGl.mod.Layout
  type EventData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Expression = Array[typingsSlinky.mapboxGl.mod.ExpressionName | js.Any]
  type FillExtrusionLayout = typingsSlinky.mapboxGl.mod.Layout
  type HeatmapLayout = typingsSlinky.mapboxGl.mod.Layout
  type HillshadeLayout = typingsSlinky.mapboxGl.mod.Layout
  type LngLatBoundsLike = typingsSlinky.mapboxGl.mod.LngLatBounds | (js.Tuple2[typingsSlinky.mapboxGl.mod.LngLatLike, typingsSlinky.mapboxGl.mod.LngLatLike]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mapboxGl.mod.LngLat
    - typingsSlinky.mapboxGl.AnonLat
    - typingsSlinky.mapboxGl.AnonLon
    - js.Tuple2[scala.Double, scala.Double]
  */
  type LngLatLike = typingsSlinky.mapboxGl.mod._LngLatLike | (js.Tuple2[scala.Double, scala.Double])
  type PointLike = typingsSlinky.mapboxGl.mod.Point | (js.Tuple2[scala.Double, scala.Double])
  type PromoteIdSpecification = org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String
  type RasterLayout = typingsSlinky.mapboxGl.mod.Layout
  type Sources = org.scalablytyped.runtime.StringDictionary[typingsSlinky.mapboxGl.mod.AnySourceData]
  type TransformRequestFunction = js.Function2[
    /* url */ java.lang.String, 
    /* resourceType */ typingsSlinky.mapboxGl.mod.ResourceType, 
    typingsSlinky.mapboxGl.mod.RequestParameters
  ]
}
