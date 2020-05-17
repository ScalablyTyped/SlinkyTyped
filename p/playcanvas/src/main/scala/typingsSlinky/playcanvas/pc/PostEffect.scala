package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.PostEffect
  * @classdesc Base class for all post effects. Post effects take a a render target as input
  * apply effects to it and then render the result to an output render target or the screen
  * if no output is specified.
  * @description Creates new PostEffect.
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device of the application.
  * @property {pc.GraphicsDevice} device The graphics device of the application. [read only].
  * @property {pc.VertexBuffer} vertexBuffer The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only].
  * @property {pc.Shader|null} shader The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
  * @property {boolean} needsDepthBuffer The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
  */
@js.native
trait PostEffect extends js.Object {
  /**
    * The graphics device of the application. [read only].
    */
  var device: GraphicsDevice = js.native
  /**
    * The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
    */
  var needsDepthBuffer: Boolean = js.native
  /**
    * The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
    */
  var shader: Shader | Null = js.native
  /**
    * The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only].
    */
  var vertexBuffer: VertexBuffer = js.native
  /**
    * @function
    * @name pc.PostEffect#render
    * @description Render the post effect using the specified inputTarget
    * to the specified outputTarget.
    * @param {pc.RenderTarget} inputTarget - The input render target.
    * @param {pc.RenderTarget} outputTarget - The output render target. If null then this will be the screen.
    * @param {pc.Vec4} rect - (Optional) The rect of the current camera. If not specified then it will default to [0,0,1,1].
    */
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget, rect: Vec4): Unit = js.native
}

object PostEffect {
  @scala.inline
  def apply(
    device: GraphicsDevice,
    needsDepthBuffer: Boolean,
    render: (RenderTarget, RenderTarget, Vec4) => Unit,
    vertexBuffer: VertexBuffer
  ): PostEffect = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], needsDepthBuffer = needsDepthBuffer.asInstanceOf[js.Any], render = js.Any.fromFunction3(render), vertexBuffer = vertexBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostEffect]
  }
  @scala.inline
  implicit class PostEffectOps[Self <: PostEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: GraphicsDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsDepthBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsDepthBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: (RenderTarget, RenderTarget, Vec4) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withVertexBuffer(value: VertexBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShader(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(null)
        ret
    }
  }
  
}

