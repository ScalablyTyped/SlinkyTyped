package typingsSlinky.plotlyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ButtonClickEvent = js.Function2[
    /* gd */ typingsSlinky.plotlyJs.mod.PlotlyHTMLElement, 
    /* ev */ org.scalajs.dom.raw.MouseEvent, 
    scala.Unit
  ]
  
  type Color = java.lang.String | scala.Double | (js.Array[
    js.UndefOr[
      (js.Array[js.UndefOr[java.lang.String | scala.Double | scala.Null]]) | scala.Double | scala.Null | java.lang.String
    ]
  ])
  
  type ColorScale = java.lang.String | (js.Array[java.lang.String | (js.Tuple2[scala.Double, java.lang.String])])
  
  type DTickValue = scala.Double | java.lang.String
  
  type Datum = java.lang.String | scala.Double | js.Date | scala.Null
  
  type ErrorBar = typingsSlinky.plotlyJs.anon.PartialErrorOptions with (typingsSlinky.plotlyJs.anon.Type | typingsSlinky.plotlyJs.anon.Array)
  
  type MarkerSymbol = java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])
  
  type PlotRestyleEvent = js.Tuple2[typingsSlinky.plotlyJs.mod.PlotRestyleEventUpdate, js.Array[scala.Double]]
  
  type PlotRestyleEventUpdate = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def Plots: typingsSlinky.plotlyJs.mod.StaticPlots = typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Plots").asInstanceOf[typingsSlinky.plotlyJs.mod.StaticPlots]
  
  type Root = java.lang.String | org.scalajs.dom.raw.HTMLElement
  
  type ScatterData = typingsSlinky.plotlyJs.mod.PlotData
  
  type ScatterMarker = typingsSlinky.plotlyJs.mod.PlotMarker
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  @scala.inline
  def addFrames(root: typingsSlinky.plotlyJs.mod.Root, frames: js.Array[typingsSlinky.plotlyJs.anon.PartialFrame]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addFrames")(root.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def addTraces(root: typingsSlinky.plotlyJs.mod.Root, traces: js.Array[typingsSlinky.plotlyJs.mod.Data]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def addTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    traces: js.Array[typingsSlinky.plotlyJs.mod.Data],
    newIndices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def addTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    traces: js.Array[typingsSlinky.plotlyJs.mod.Data],
    newIndices: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def addTraces(root: typingsSlinky.plotlyJs.mod.Root, traces: typingsSlinky.plotlyJs.mod.Data): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def addTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    traces: typingsSlinky.plotlyJs.mod.Data,
    newIndices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def addTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    traces: typingsSlinky.plotlyJs.mod.Data,
    newIndices: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def deleteFrames(root: typingsSlinky.plotlyJs.mod.Root, frames: js.Array[scala.Double]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteFrames")(root.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def deleteTraces(root: typingsSlinky.plotlyJs.mod.Root, indices: js.Array[scala.Double]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteTraces")(root.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def deleteTraces(root: typingsSlinky.plotlyJs.mod.Root, indices: scala.Double): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteTraces")(root.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def downloadImage(root: typingsSlinky.plotlyJs.mod.Root, opts: typingsSlinky.plotlyJs.mod.DownloadImgopts): js.Promise[java.lang.String] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: js.Array[typingsSlinky.plotlyJs.mod.Data],
    indices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: js.Array[typingsSlinky.plotlyJs.mod.Data],
    indices: js.Array[scala.Double],
    maxPoints: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: js.Array[typingsSlinky.plotlyJs.mod.Data],
    indices: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: js.Array[typingsSlinky.plotlyJs.mod.Data],
    indices: scala.Double,
    maxPoints: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: typingsSlinky.plotlyJs.mod.Data,
    indices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: typingsSlinky.plotlyJs.mod.Data,
    indices: js.Array[scala.Double],
    maxPoints: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: typingsSlinky.plotlyJs.mod.Data,
    indices: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def extendTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: typingsSlinky.plotlyJs.mod.Data,
    indices: scala.Double,
    maxPoints: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def moveTraces(root: typingsSlinky.plotlyJs.mod.Root, currentIndices: js.Array[scala.Double]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def moveTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    currentIndices: js.Array[scala.Double],
    newIndices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def moveTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    currentIndices: js.Array[scala.Double],
    newIndices: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def moveTraces(root: typingsSlinky.plotlyJs.mod.Root, currentIndices: scala.Double): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def moveTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    currentIndices: scala.Double,
    newIndices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def moveTraces(root: typingsSlinky.plotlyJs.mod.Root, currentIndices: scala.Double, newIndices: scala.Double): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def newPlot(root: typingsSlinky.plotlyJs.mod.Root, data: js.Array[typingsSlinky.plotlyJs.mod.Data]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def newPlot(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: js.UndefOr[scala.Nothing],
    config: typingsSlinky.plotlyJs.anon.PartialConfig
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def newPlot(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: typingsSlinky.plotlyJs.anon.PartialLayout
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def newPlot(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: typingsSlinky.plotlyJs.anon.PartialLayout,
    config: typingsSlinky.plotlyJs.anon.PartialConfig
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def plot(root: typingsSlinky.plotlyJs.mod.Root, data: js.Array[typingsSlinky.plotlyJs.mod.Data]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def plot(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: js.UndefOr[scala.Nothing],
    config: typingsSlinky.plotlyJs.anon.PartialConfig
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def plot(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: typingsSlinky.plotlyJs.anon.PartialLayout
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def plot(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: typingsSlinky.plotlyJs.anon.PartialLayout,
    config: typingsSlinky.plotlyJs.anon.PartialConfig
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def prependTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: js.Array[typingsSlinky.plotlyJs.mod.Data],
    indices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def prependTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: js.Array[typingsSlinky.plotlyJs.mod.Data],
    indices: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def prependTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: typingsSlinky.plotlyJs.mod.Data,
    indices: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def prependTraces(
    root: typingsSlinky.plotlyJs.mod.Root,
    update: typingsSlinky.plotlyJs.mod.Data,
    indices: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def purge(root: typingsSlinky.plotlyJs.mod.Root): scala.Unit = typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("purge")(root.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def react(root: typingsSlinky.plotlyJs.mod.Root, data: js.Array[typingsSlinky.plotlyJs.mod.Data]): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def react(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: js.UndefOr[scala.Nothing],
    config: typingsSlinky.plotlyJs.anon.PartialConfig
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def react(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: typingsSlinky.plotlyJs.anon.PartialLayout
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def react(
    root: typingsSlinky.plotlyJs.mod.Root,
    data: js.Array[typingsSlinky.plotlyJs.mod.Data],
    layout: typingsSlinky.plotlyJs.anon.PartialLayout,
    config: typingsSlinky.plotlyJs.anon.PartialConfig
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def redraw(root: typingsSlinky.plotlyJs.mod.Root): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("redraw")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def relayout(root: typingsSlinky.plotlyJs.mod.Root, layout: typingsSlinky.plotlyJs.anon.PartialLayout): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relayout")(root.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def restyle(root: typingsSlinky.plotlyJs.mod.Root, aobj: typingsSlinky.plotlyJs.mod.Data): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def restyle(
    root: typingsSlinky.plotlyJs.mod.Root,
    aobj: typingsSlinky.plotlyJs.mod.Data,
    traces: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def restyle(root: typingsSlinky.plotlyJs.mod.Root, aobj: typingsSlinky.plotlyJs.mod.Data, traces: scala.Double): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  
  @scala.inline
  def toImage(root: typingsSlinky.plotlyJs.mod.Root, opts: typingsSlinky.plotlyJs.mod.ToImgopts): js.Promise[java.lang.String] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def update(
    root: typingsSlinky.plotlyJs.mod.Root,
    traceUpdate: typingsSlinky.plotlyJs.mod.Data,
    layoutUpdate: typingsSlinky.plotlyJs.anon.PartialLayout
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def update(
    root: typingsSlinky.plotlyJs.mod.Root,
    traceUpdate: typingsSlinky.plotlyJs.mod.Data,
    layoutUpdate: typingsSlinky.plotlyJs.anon.PartialLayout,
    traces: js.Array[scala.Double]
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
  @scala.inline
  def update(
    root: typingsSlinky.plotlyJs.mod.Root,
    traceUpdate: typingsSlinky.plotlyJs.mod.Data,
    layoutUpdate: typingsSlinky.plotlyJs.anon.PartialLayout,
    traces: scala.Double
  ): js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement] = (typingsSlinky.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.plotlyJs.mod.PlotlyHTMLElement]]
}
