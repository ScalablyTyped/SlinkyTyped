package typingsSlinky.phaser.spine.webgl

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.spine.Restorable
import typingsSlinky.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedWebGLRenderingContext extends js.Object {
  var canvas: HTMLCanvasElement | OffscreenCanvas = js.native
  var gl: WebGLRenderingContext = js.native
  var restorables: js.Any = js.native
  def addRestorable(restorable: Restorable): Unit = js.native
  def removeRestorable(restorable: Restorable): Unit = js.native
}

object ManagedWebGLRenderingContext {
  @scala.inline
  def apply(
    addRestorable: Restorable => Unit,
    canvas: HTMLCanvasElement | OffscreenCanvas,
    gl: WebGLRenderingContext,
    removeRestorable: Restorable => Unit,
    restorables: js.Any
  ): ManagedWebGLRenderingContext = {
    val __obj = js.Dynamic.literal(addRestorable = js.Any.fromFunction1(addRestorable), canvas = canvas.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], removeRestorable = js.Any.fromFunction1(removeRestorable), restorables = restorables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedWebGLRenderingContext]
  }
  @scala.inline
  implicit class ManagedWebGLRenderingContextOps[Self <: ManagedWebGLRenderingContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRestorable(value: Restorable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRestorable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanvasHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGl(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRestorable(value: Restorable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRestorable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestorables(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restorables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

