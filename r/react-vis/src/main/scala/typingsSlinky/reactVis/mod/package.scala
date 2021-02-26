package typingsSlinky.reactVis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AbstractSeriesPoint = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def ContinuousColorLegend: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.ContinuousColorLegendProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContinuousColorLegend").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.ContinuousColorLegendProps]]
  
  @scala.inline
  def ContinuousSizeLegend: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.ContinuousSizeLegendProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContinuousSizeLegend").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.ContinuousSizeLegendProps]]
  
  type DecorativeAxisPoint = typingsSlinky.reactVis.mod.AbstractSeriesPoint
  
  @scala.inline
  def DiscreteColorLegend: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.DiscreteColorLegendProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DiscreteColorLegend").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.DiscreteColorLegendProps]]
  
  type HeatmapSeriesProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.HeatmapSeriesPoint]
  
  @scala.inline
  def HorizontalGridLines: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.HorizontalGridLinesProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HorizontalGridLines").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.HorizontalGridLinesProps]]
  
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
  
  @scala.inline
  def SearchableDiscreteColorLegend: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.SearchableDiscreteColorLegendProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SearchableDiscreteColorLegend").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.SearchableDiscreteColorLegendProps]]
  
  @scala.inline
  def VerticalGridLines: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.VerticalGridLinesProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VerticalGridLines").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.VerticalGridLinesProps]]
  
  type VerticalRectSeriesCanvasProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.VerticalRectSeriesPoint]
  
  type VerticalRectSeriesPoint = typingsSlinky.reactVis.mod.RectSeriesPoint
  
  type VerticalRectSeriesProps = typingsSlinky.reactVis.mod.AbstractSeriesProps[typingsSlinky.reactVis.mod.VerticalRectSeriesPoint]
  
  @scala.inline
  def Voronoi: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.VoronoiProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Voronoi").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.VoronoiProps]]
  
  @scala.inline
  def XAxis: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.XAxisProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("XAxis").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.XAxisProps]]
  
  @scala.inline
  def YAxis: slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.YAxisProps] = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("YAxis").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVis.mod.YAxisProps]]
  
  @scala.inline
  def makeHeightFlexible(): js.Any = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeHeightFlexible")().asInstanceOf[js.Any]
  @scala.inline
  def makeHeightFlexible(component: js.Any): js.Any = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeHeightFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def makeVisFlexible(): js.Any = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeVisFlexible")().asInstanceOf[js.Any]
  @scala.inline
  def makeVisFlexible(component: js.Any): js.Any = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeVisFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def makeWidthFlexible(): js.Any = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeWidthFlexible")().asInstanceOf[js.Any]
  @scala.inline
  def makeWidthFlexible(component: js.Any): js.Any = typingsSlinky.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeWidthFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
