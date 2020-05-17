package typingsSlinky.pixiJs.PIXI.utils

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a Canvas element of the given size to be used as a target for rendering to.
  *
  * @class
  * @memberof PIXI.utils
  */
@js.native
trait CanvasRenderTarget extends js.Object {
  /**
    * The Canvas object that belongs to this CanvasRenderTarget.
    *
    * @member {HTMLCanvasElement} PIXI.utils.CanvasRenderTarget#canvas
    */
  var canvas: HTMLCanvasElement = js.native
  /**
    * A CanvasRenderingContext2D object representing a two-dimensional rendering context.
    *
    * @member {CanvasRenderingContext2D} PIXI.utils.CanvasRenderTarget#context
    */
  var context: CanvasRenderingContext2D = js.native
  /**
    * The height of the canvas buffer in pixels.
    *
    * @member {number}
    */
  var height: Double = js.native
  /**
    * The width of the canvas buffer in pixels.
    *
    * @member {number}
    */
  var width: Double = js.native
  /**
    * Destroys this canvas.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Resizes the canvas to the specified width and height.
    *
    * @param {number} width - the new width of the canvas
    * @param {number} height - the new height of the canvas
    */
  def resize(width: Double, height: Double): Unit = js.native
}

object CanvasRenderTarget {
  @scala.inline
  def apply(
    canvas: HTMLCanvasElement,
    context: CanvasRenderingContext2D,
    destroy: () => Unit,
    height: Double,
    resize: (Double, Double) => Unit,
    width: Double
  ): CanvasRenderTarget = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderTarget]
  }
  @scala.inline
  implicit class CanvasRenderTargetOps[Self <: CanvasRenderTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: CanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction2(value))
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

