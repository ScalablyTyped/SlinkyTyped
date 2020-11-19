package typingsSlinky.reactVis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AbstractSeriesPoint = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type DecorativeAxisPoint = typingsSlinky.reactVis.mod.AbstractSeriesPoint
  
  type HeatmapSeriesProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.HeatmapSeriesPoint]
  
  type HorizontalRectSeriesCanvasProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.HorizontalRectSeriesPoint]
  
  type HorizontalRectSeriesPoint = typingsSlinky.reactVis.mod.RectSeriesPoint
  
  type HorizontalRectSeriesProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.HorizontalRectSeriesPoint]
  
  type LineMarkSeriesCanvasProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.LineMarkSeriesPoint]
  
  type MarkSeriesCanvasProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.MarkSeriesPoint]
  
  type PolygonSeriesProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.PolygonSeriesPoint]
  
  type RVGet[T /* <: typingsSlinky.reactVis.mod.AbstractSeriesPoint */, K /* <: /* keyof T */ java.lang.String */] = js.Function1[
    /* datapoint */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  
  type RVGetAlignStyle = js.Function3[
    /* align */ typingsSlinky.reactVis.anon.Horizontal, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    typingsSlinky.react.mod.CSSProperties
  ]
  
  type RVGetNull[T /* <: typingsSlinky.reactVis.mod.AbstractSeriesPoint */] = js.Function1[/* datapoint */ T, js.Any]
  
  type RVItemEventHandler = js.Function3[
    /* item */ js.Any, 
    /* index */ scala.Double, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  
  type RVMouseEventHandler = typingsSlinky.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLElement]
  
  type RVNearestXEventHandler[T /* <: typingsSlinky.reactVis.mod.AbstractSeriesPoint */] = js.Function2[
    /* datapoint */ T, 
    /* data */ typingsSlinky.reactVis.mod.RVNearestXData[T], 
    scala.Unit
  ]
  
  type RVNearestXYEventHandler[T /* <: typingsSlinky.reactVis.mod.AbstractSeriesPoint */] = js.Function2[
    /* datapoint */ T, 
    /* data */ typingsSlinky.reactVis.mod.RVNearestXYData[T], 
    scala.Unit
  ]
  
  type RVTickFormat = js.Function1[/* tick */ js.Any, java.lang.String]
  
  type RVTouchEventHandler = typingsSlinky.react.mod.TouchEventHandler[org.scalajs.dom.raw.HTMLElement]
  
  type RVValueEventHandler[T /* <: typingsSlinky.reactVis.mod.AbstractSeriesPoint */] = js.Function2[
    /* datapoint */ T, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  
  type RVWheelEventHandler = typingsSlinky.react.mod.WheelEventHandler[org.scalajs.dom.raw.HTMLElement]
  
  type RadarChartPoint = typingsSlinky.reactVis.mod.AbstractSeriesPoint
  
  type RectSeriesCanvasProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.RectSeriesPoint]
  
  type VerticalRectSeriesCanvasProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.VerticalRectSeriesPoint]
  
  type VerticalRectSeriesPoint = typingsSlinky.reactVis.mod.RectSeriesPoint
  
  type VerticalRectSeriesProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.VerticalRectSeriesPoint]
}
