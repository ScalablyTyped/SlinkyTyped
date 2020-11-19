package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("pc.drawFullscreenQuad")
@js.native
object drawFullscreenQuad extends js.Object {
  
  /**
    * Draw a screen-space rectangle in a render target. Primarily meant to be used in custom post effects based on {@link pc.PostEffect}.
    * @param device - The graphics device of the application.
    * @param target - The output render target.
    * @param vertexBuffer - The vertex buffer for the rectangle mesh. When calling from a custom post effect, pass the field {@link pc.PostEffect#vertexBuffer}.
    * @param shader - The shader to be used for drawing the rectangle. When calling from a custom post effect, pass the field {@link pc.PostEffect#shader}.
    * @param [rect] - The normalized screen-space position (rect.x, rect.y) and size (rect.z, rect.w) of the rectangle. Default is [0, 0, 1, 1].
    */
  def apply(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    target: typingsSlinky.playcanvas.pc.RenderTarget,
    vertexBuffer: typingsSlinky.playcanvas.pc.VertexBuffer,
    shader: typingsSlinky.playcanvas.pc.Shader
  ): Unit = js.native
  def apply(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    target: typingsSlinky.playcanvas.pc.RenderTarget,
    vertexBuffer: typingsSlinky.playcanvas.pc.VertexBuffer,
    shader: typingsSlinky.playcanvas.pc.Shader,
    rect: typingsSlinky.playcanvas.pc.Vec4
  ): Unit = js.native
}
