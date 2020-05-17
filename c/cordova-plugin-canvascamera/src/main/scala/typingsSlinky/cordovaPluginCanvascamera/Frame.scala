package typingsSlinky.cordovaPluginCanvascamera

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var dHeight: Double = js.native
  var dWidth: Double = js.native
  var dx: Double = js.native
  var dy: Double = js.native
  var element: HTMLCanvasElement = js.native
  var image: HTMLImageElement = js.native
  var sHeight: Double = js.native
  var sWidth: Double = js.native
  var sx: Double = js.native
  var sy: Double = js.native
  def initialize(): Frame = js.native
  def recycle(): Unit = js.native
}

object Frame {
  @scala.inline
  def apply(
    dHeight: Double,
    dWidth: Double,
    dx: Double,
    dy: Double,
    element: HTMLCanvasElement,
    image: HTMLImageElement,
    initialize: () => Frame,
    recycle: () => Unit,
    sHeight: Double,
    sWidth: Double,
    sx: Double,
    sy: Double
  ): Frame = {
    val __obj = js.Dynamic.literal(dHeight = dHeight.asInstanceOf[js.Any], dWidth = dWidth.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], initialize = js.Any.fromFunction0(initialize), recycle = js.Any.fromFunction0(recycle), sHeight = sHeight.asInstanceOf[js.Any], sWidth = sWidth.asInstanceOf[js.Any], sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialize(value: () => Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecycle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

