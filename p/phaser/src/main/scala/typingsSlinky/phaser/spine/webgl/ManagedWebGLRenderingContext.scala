package typingsSlinky.phaser.spine.webgl

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.spine.Restorable
import typingsSlinky.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedWebGLRenderingContext extends js.Object {
  
  def addRestorable(restorable: Restorable): Unit = js.native
  
  var canvas: HTMLCanvasElement | OffscreenCanvas = js.native
  
  var gl: WebGLRenderingContext = js.native
  
  def removeRestorable(restorable: Restorable): Unit = js.native
  
  var restorables: js.Any = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddRestorable(value: Restorable => Unit): Self = this.set("addRestorable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanvasHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGl(value: WebGLRenderingContext): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestorable(value: Restorable => Unit): Self = this.set("removeRestorable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestorables(value: js.Any): Self = this.set("restorables", value.asInstanceOf[js.Any])
  }
}
