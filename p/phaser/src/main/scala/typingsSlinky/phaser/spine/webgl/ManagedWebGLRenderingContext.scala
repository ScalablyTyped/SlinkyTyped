package typingsSlinky.phaser.spine.webgl

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.spine.Restorable
import typingsSlinky.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedWebGLRenderingContext extends StObject {
  
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
  implicit class ManagedWebGLRenderingContextMutableBuilder[Self <: ManagedWebGLRenderingContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRestorable(value: Restorable => Unit): Self = StObject.set(x, "addRestorable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestorable(value: Restorable => Unit): Self = StObject.set(x, "removeRestorable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestorables(value: js.Any): Self = StObject.set(x, "restorables", value.asInstanceOf[js.Any])
  }
}
