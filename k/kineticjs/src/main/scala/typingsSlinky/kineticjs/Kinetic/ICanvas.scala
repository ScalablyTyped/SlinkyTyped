package typingsSlinky.kineticjs.Kinetic

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvas extends js.Object {
  var _canvas: HTMLCanvasElement = js.native
  var height: Double = js.native
  var width: Double = js.native
  def getPixelRatio(): Double = js.native
  def setPixelRatio(pixelRatio: Double): js.Any = js.native
}

object ICanvas {
  @scala.inline
  def apply(
    _canvas: HTMLCanvasElement,
    getPixelRatio: () => Double,
    height: Double,
    setPixelRatio: Double => js.Any,
    width: Double
  ): ICanvas = {
    val __obj = js.Dynamic.literal(_canvas = _canvas.asInstanceOf[js.Any], getPixelRatio = js.Any.fromFunction0(getPixelRatio), height = height.asInstanceOf[js.Any], setPixelRatio = js.Any.fromFunction1(setPixelRatio), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvas]
  }
  @scala.inline
  implicit class ICanvasOps[Self <: ICanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_canvas(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPixelRatio(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPixelRatio")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPixelRatio(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPixelRatio")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

