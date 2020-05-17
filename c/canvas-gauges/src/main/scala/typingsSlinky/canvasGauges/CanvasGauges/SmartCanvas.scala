package typingsSlinky.canvasGauges.CanvasGauges

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartCanvas extends js.Object {
  var context: CanvasRenderingContext2D = js.native
  var contextClone: CanvasRenderingContext2D = js.native
  var drawHeight: Double = js.native
  var drawWidth: Double = js.native
  var drawX: Double = js.native
  var drawY: Double = js.native
  var element: HTMLCanvasElement = js.native
  var elementClone: HTMLCanvasElement = js.native
  var height: Double = js.native
  var minSide: Double = js.native
  var pixelRatio: Double = js.native
  var width: Double = js.native
  def commit(): SmartCanvas = js.native
  def destroy(): js.Any = js.native
  def init(): js.Any = js.native
  def onRedraw(): js.Any = js.native
  def redraw(): SmartCanvas = js.native
}

object SmartCanvas {
  @scala.inline
  def apply(
    commit: () => SmartCanvas,
    context: CanvasRenderingContext2D,
    contextClone: CanvasRenderingContext2D,
    destroy: () => js.Any,
    drawHeight: Double,
    drawWidth: Double,
    drawX: Double,
    drawY: Double,
    element: HTMLCanvasElement,
    elementClone: HTMLCanvasElement,
    height: Double,
    init: () => js.Any,
    minSide: Double,
    onRedraw: () => js.Any,
    pixelRatio: Double,
    redraw: () => SmartCanvas,
    width: Double
  ): SmartCanvas = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), context = context.asInstanceOf[js.Any], contextClone = contextClone.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), drawHeight = drawHeight.asInstanceOf[js.Any], drawWidth = drawWidth.asInstanceOf[js.Any], drawX = drawX.asInstanceOf[js.Any], drawY = drawY.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], elementClone = elementClone.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), minSide = minSide.asInstanceOf[js.Any], onRedraw = js.Any.fromFunction0(onRedraw), pixelRatio = pixelRatio.asInstanceOf[js.Any], redraw = js.Any.fromFunction0(redraw), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCanvas]
  }
  @scala.inline
  implicit class SmartCanvasOps[Self <: SmartCanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: () => SmartCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContext(value: CanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextClone(value: CanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextClone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementClone(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementClone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinSide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRedraw(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRedraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedraw(value: () => SmartCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.Any.fromFunction0(value))
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

