package typingsSlinky.mapboxGl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  type AnyLayout = typingsSlinky.mapboxGl.mod._AnyLayout | typingsSlinky.mapboxGl.mod.BackgroundLayout | typingsSlinky.mapboxGl.mod.FillExtrusionLayout | typingsSlinky.mapboxGl.mod.RasterLayout | typingsSlinky.mapboxGl.mod.HeatmapLayout | typingsSlinky.mapboxGl.mod.HillshadeLayout
  
  type BackgroundLayout = typingsSlinky.mapboxGl.mod.Layout
  
  type EventData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Expression = Array[typingsSlinky.mapboxGl.mod.ExpressionName | js.Any]
  
  type FillExtrusionLayout = typingsSlinky.mapboxGl.mod.Layout
  
  type HeatmapLayout = typingsSlinky.mapboxGl.mod.Layout
  
  type HillshadeLayout = typingsSlinky.mapboxGl.mod.Layout
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mapboxGl.mod.LngLatBounds
    - js.Tuple2[typingsSlinky.mapboxGl.mod.LngLatLike, typingsSlinky.mapboxGl.mod.LngLatLike]
    - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
    - typingsSlinky.mapboxGl.mod.LngLatLike
  */
  type LngLatBoundsLike = typingsSlinky.mapboxGl.mod._LngLatBoundsLike | (js.Tuple2[
    scala.Double | typingsSlinky.mapboxGl.mod.LngLatLike, 
    scala.Double | typingsSlinky.mapboxGl.mod.LngLatLike
  ]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  
  /* Rewritten from type alias, can be one of: 
    - js.Tuple2[scala.Double, scala.Double]
    - typingsSlinky.mapboxGl.mod.LngLat
    - typingsSlinky.mapboxGl.anon.Lat
    - typingsSlinky.mapboxGl.anon.Lon
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
  
  @scala.inline
  def accessToken: java.lang.String = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("accessToken").asInstanceOf[java.lang.String]
  @scala.inline
  def accessToken_=(x: java.lang.String): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def baseApiUrl: java.lang.String = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("baseApiUrl").asInstanceOf[java.lang.String]
  @scala.inline
  def baseApiUrl_=(x: java.lang.String): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def clearPrewarmedResources(): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def clearStorage(): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[scala.Unit]
  @scala.inline
  def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getRTLTextPluginStatus(): typingsSlinky.mapboxGl.mod.PluginStatus = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[typingsSlinky.mapboxGl.mod.PluginStatus]
  
  /**
    * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
    * 16 by default.
    */
  @scala.inline
  def maxParallelImageRequests: scala.Double = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("maxParallelImageRequests").asInstanceOf[scala.Double]
  @scala.inline
  def maxParallelImageRequests_=(x: scala.Double): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def prewarm(): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def setRTLTextPlugin(pluginURL: java.lang.String, callback: js.Function1[/* error */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setRTLTextPlugin(
    pluginURL: java.lang.String,
    callback: js.Function1[/* error */ js.Error, scala.Unit],
    deferred: scala.Boolean
  ): scala.Unit = (typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def supported(): scala.Boolean = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[scala.Boolean]
  @scala.inline
  def supported(options: typingsSlinky.mapboxGl.anon.FailIfMajorPerformanceCaveat): scala.Boolean = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  /**
    * Number of web workers instantiated on a page with GL JS maps.
    * By default, it is set to half the number of CPU cores (capped at 6).
    */
  @scala.inline
  def workerCount: scala.Double = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("workerCount").asInstanceOf[scala.Double]
  @scala.inline
  def workerCount_=(x: scala.Double): scala.Unit = typingsSlinky.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])
}
