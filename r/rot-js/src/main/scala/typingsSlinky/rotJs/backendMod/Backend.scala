package typingsSlinky.rotJs.backendMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rotJs.typesMod.DisplayData
import typingsSlinky.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends js.Object {
  var _options: DisplayOptions = js.native
  def clear(): Unit = js.native
  def computeFontSize(availWidth: Double, availHeight: Double): Double = js.native
  def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double] = js.native
  def draw(data: DisplayData, clearBefore: Boolean): Unit = js.native
  def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  def getContainer(): HTMLElement | Null = js.native
  def schedule(cb: js.Function0[Unit]): Unit = js.native
  def setOptions(options: DisplayOptions): Unit = js.native
}

object Backend {
  @scala.inline
  def apply(
    _options: DisplayOptions,
    clear: () => Unit,
    computeFontSize: (Double, Double) => Double,
    computeSize: (Double, Double) => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): Backend = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction2(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Backend]
  }
  @scala.inline
  implicit class BackendOps[Self <: Backend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_options(value: DisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeFontSize(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeFontSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComputeSize(value: (Double, Double) => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDraw(value: (DisplayData, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEventToPosition(value: (Double, Double) => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventToPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetContainer(value: () => HTMLElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSchedule(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: DisplayOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

