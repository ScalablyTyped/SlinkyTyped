package typingsSlinky.rotJs.canvasMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rotJs.backendMod.Backend
import typingsSlinky.rotJs.typesMod.DisplayData
import typingsSlinky.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends Backend {
  var _ctx: CanvasRenderingContext2D = js.native
  def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  def _updateSize(): Unit = js.native
}

object Canvas {
  @scala.inline
  def apply(
    _ctx: CanvasRenderingContext2D,
    _normalizedEventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    _options: DisplayOptions,
    _updateSize: () => Unit,
    clear: () => Unit,
    computeFontSize: (Double, Double) => Double,
    computeSize: (Double, Double) => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): Canvas = {
    val __obj = js.Dynamic.literal(_ctx = _ctx.asInstanceOf[js.Any], _normalizedEventToPosition = js.Any.fromFunction2(_normalizedEventToPosition), _options = _options.asInstanceOf[js.Any], _updateSize = js.Any.fromFunction0(_updateSize), clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction2(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Canvas]
  }
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_ctx(value: CanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_normalizedEventToPosition(value: (Double, Double) => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_normalizedEventToPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_updateSize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_updateSize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

