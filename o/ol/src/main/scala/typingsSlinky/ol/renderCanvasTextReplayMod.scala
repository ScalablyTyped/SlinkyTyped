package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/TextReplay", JSImport.Namespace)
@js.native
object renderCanvasTextReplayMod extends js.Object {
  @js.native
  trait CanvasTextReplay
    extends typingsSlinky.ol.renderCanvasReplayMod.default {
    def getImage(text: String, textKey: String, fillKey: String, strokeKey: String): HTMLCanvasElement = js.native
  }
  
  @js.native
  class default protected () extends CanvasTextReplay {
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any
    ) = this()
  }
  
  def measureTextWidths(font: String, lines: js.Array[String], widths: js.Array[Double]): Double = js.native
}

