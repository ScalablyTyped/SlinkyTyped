package typingsSlinky.rotJs.canvasMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rotJs.typesMod.DisplayData
import typingsSlinky.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/display/canvas", JSImport.Default)
@js.native
abstract class default () extends Canvas {
  /* CompleteClass */
  override var _ctx: CanvasRenderingContext2D = js.native
  /* CompleteClass */
  override var _options: DisplayOptions = js.native
  /* CompleteClass */
  override def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  /* CompleteClass */
  override def _updateSize(): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def computeFontSize(availWidth: Double, availHeight: Double): Double = js.native
  /* CompleteClass */
  override def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double] = js.native
  /* CompleteClass */
  override def draw(data: DisplayData, clearBefore: Boolean): Unit = js.native
  /* CompleteClass */
  override def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  /* CompleteClass */
  override def getContainer(): HTMLElement | Null = js.native
  /* CompleteClass */
  override def schedule(cb: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def setOptions(options: DisplayOptions): Unit = js.native
}

