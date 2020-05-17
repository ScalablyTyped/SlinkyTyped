package typingsSlinky.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ButtonClickEvent = js.Function2[
    /* gd */ typingsSlinky.plotlyJs.mod.PlotlyHTMLElement, 
    /* ev */ org.scalajs.dom.raw.MouseEvent, 
    scala.Unit
  ]
  type ErrorBar = typingsSlinky.plotlyJs.anon.PartialErrorOptions with (typingsSlinky.plotlyJs.anon.Type | typingsSlinky.plotlyJs.anon.Array)
  type PlotRestyleEvent = js.Tuple2[js.Any, js.Array[scala.Double]]
  type ScatterData = typingsSlinky.plotlyJs.mod.PlotData
  type ScatterMarker = typingsSlinky.plotlyJs.mod.PlotMarker
}
