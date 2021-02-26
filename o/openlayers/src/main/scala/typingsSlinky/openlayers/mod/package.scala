package typingsSlinky.openlayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributionLike = java.lang.String | (js.Array[typingsSlinky.openlayers.mod.Attribution | java.lang.String]) | typingsSlinky.openlayers.mod.Attribution
  
  type CanvasFunctionType = js.Function5[
    /* extent */ typingsSlinky.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* pixelRatio */ scala.Double, 
    /* size */ typingsSlinky.openlayers.mod.Size, 
    /* proj */ typingsSlinky.openlayers.mod.proj.Projection, 
    org.scalajs.dom.raw.HTMLCanvasElement
  ]
  
  type ColorLike_ = java.lang.String | org.scalajs.dom.raw.CanvasPattern | org.scalajs.dom.raw.CanvasGradient
  
  type Color_ = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray
  
  type CoordinateFormatType = js.Function1[
    /* coords */ js.UndefOr[typingsSlinky.openlayers.mod.Coordinate_], 
    java.lang.String
  ]
  
  type Coordinate_ = js.Tuple2[scala.Double, scala.Double]
  
  type DragBoxEndConditionType = js.Function3[
    /* event */ typingsSlinky.openlayers.mod.MapBrowserEvent, 
    /* pixel1 */ typingsSlinky.openlayers.mod.Pixel, 
    /* pixel2 */ typingsSlinky.openlayers.mod.Pixel, 
    scala.Boolean
  ]
  
  type DrawGeometryFunctionType = js.Function2[
    /* coords */ typingsSlinky.openlayers.mod.Coordinate_ | (js.Array[
      js.Array[typingsSlinky.openlayers.mod.Coordinate_] | typingsSlinky.openlayers.mod.Coordinate_
    ]), 
    /* geo */ js.UndefOr[typingsSlinky.openlayers.mod.geom.SimpleGeometry], 
    typingsSlinky.openlayers.mod.geom.SimpleGeometry
  ]
  
  type EventsConditionType = js.Function1[/* event */ typingsSlinky.openlayers.mod.MapBrowserEvent, scala.Boolean]
  
  type EventsKey = typingsSlinky.openlayers.mod.GlobalObject
  
  type EventsListenerFunctionType = js.Function1[/* evt */ typingsSlinky.openlayers.mod.events.Event, scala.Boolean | scala.Unit]
  
  type Extent_ = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  type FeatureLoader_ = js.Function3[
    /* extent */ typingsSlinky.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* proj */ typingsSlinky.openlayers.mod.proj.Projection, 
    scala.Unit
  ]
  
  type FeatureStyleFunction = js.Function1[
    /* resolution */ scala.Double, 
    typingsSlinky.openlayers.mod.style.Style | js.Array[typingsSlinky.openlayers.mod.style.Style] | scala.Null
  ]
  
  type FeatureUrlFunction = js.Function3[
    /* extent */ typingsSlinky.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* proj */ typingsSlinky.openlayers.mod.proj.Projection, 
    java.lang.String
  ]
  
  type GlobalObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ImageLoadFunctionType = js.Function2[
    /* image */ typingsSlinky.openlayers.mod.Image, 
    /* url */ java.lang.String, 
    scala.Unit
  ]
  
  type ImageState = scala.Double
  
  type LoadingStrategy_ = js.Function2[
    /* extent */ typingsSlinky.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    js.Array[typingsSlinky.openlayers.mod.Extent_]
  ]
  
  type ModifyEventType = java.lang.String
  
  type Pixel = js.Tuple2[scala.Double, scala.Double]
  
  type PreRenderFunction = js.Function2[
    /* map */ typingsSlinky.openlayers.mod.Map, 
    /* state */ js.UndefOr[typingsSlinky.openlayers.mod.olx.FrameState], 
    scala.Boolean
  ]
  
  type ProjectionLike = js.UndefOr[typingsSlinky.openlayers.mod.proj.Projection | java.lang.String]
  
  type RasterOperation = js.Function2[
    /* data */ js.Array[js.Array[scala.Double] | org.scalajs.dom.raw.ImageData], 
    /* obj */ typingsSlinky.openlayers.mod.GlobalObject, 
    js.Array[scala.Double] | org.scalajs.dom.raw.ImageData
  ]
  
  type SelectFilterFunction = js.Function2[
    /* feature */ typingsSlinky.openlayers.mod.Feature | typingsSlinky.openlayers.mod.render.Feature, 
    /* layer */ typingsSlinky.openlayers.mod.layer.Layer, 
    scala.Boolean
  ]
  
  type Size = js.Tuple2[scala.Double, scala.Double]
  
  type StyleFunction = js.Function2[
    /* feature */ typingsSlinky.openlayers.mod.Feature | typingsSlinky.openlayers.mod.render.Feature, 
    /* resolution */ scala.Double, 
    typingsSlinky.openlayers.mod.style.Style | js.Array[typingsSlinky.openlayers.mod.style.Style] | scala.Null
  ]
  
  type StyleGeometryFunction = js.Function1[
    /* feature */ typingsSlinky.openlayers.mod.Feature | typingsSlinky.openlayers.mod.render.Feature, 
    typingsSlinky.openlayers.mod.geom.Geometry | typingsSlinky.openlayers.mod.render.Feature
  ]
  
  type TileCoord = js.Tuple3[scala.Double, scala.Double, scala.Double]
  
  type TileLoadFunctionType = js.Function2[/* tile */ typingsSlinky.openlayers.mod.Tile, /* url */ java.lang.String, scala.Unit]
  
  type TileUrlFunctionType = js.Function3[
    /* coords */ typingsSlinky.openlayers.mod.TileCoord, 
    /* pixelRatio */ scala.Double, 
    /* proj */ typingsSlinky.openlayers.mod.proj.Projection, 
    java.lang.String
  ]
  
  type TransformFunction = js.Function3[
    /* array */ js.Array[scala.Double], 
    /* out */ js.UndefOr[js.Array[scala.Double]], 
    /* dimension */ js.UndefOr[scala.Double], 
    js.Array[scala.Double]
  ]
  
  type WFSFeatureCollectionMetadata = typingsSlinky.openlayers.mod.GlobalObject
  
  type WFSTransactionResponse = typingsSlinky.openlayers.mod.GlobalObject
  
  @scala.inline
  def inherits(childCtor: js.Function0[_], parentCtor: js.Function0[_]): scala.Unit = (typingsSlinky.openlayers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(childCtor.asInstanceOf[js.Any], parentCtor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
