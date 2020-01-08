package typingsSlinky.plotlyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plotlyDotJsMod {
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.MouseEvent
  import typingsSlinky.plotlyDotJs.Anon_Array
  import typingsSlinky.plotlyDotJs.Anon_Constant
  import typingsSlinky.std.Partial

  type ButtonClickEvent = js.Function2[/* gd */ PlotlyHTMLElement, /* ev */ MouseEvent, Unit]
  type Color = String | Double | (js.Array[
    js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String]
  ])
  type ColorScale = String | (js.Array[String | (js.Tuple2[Double, String])])
  type Data = Partial[PlotData]
  type DataTransform = Partial[Transform]
  type Datum = String | Double | js.Date | Null
  type ErrorBar = Partial[ErrorOptions] with (Anon_Constant | Anon_Array)
  type MarkerSymbol = String | Double | (js.Array[String | Double])
  type PlotRestyleEvent = js.Tuple2[js.Any, js.Array[Double]]
  type PlotSelectedData = Partial[PlotDatum]
  type Root = String | HTMLElement
  type ScatterData = PlotData
  type ScatterMarker = PlotMarker
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
}
