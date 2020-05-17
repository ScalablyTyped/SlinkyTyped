package typingsSlinky.pixiJs.PIXI.systems

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.pixiJs.PIXI.GLProgram
import typingsSlinky.pixiJs.PIXI.Renderer
import typingsSlinky.pixiJs.PIXI.Shader
import typingsSlinky.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage shaders.
  *
  * @class
  * @memberof PIXI.systems
  * @extends PIXI.System
  */
@js.native
trait ShaderSystem extends System {
  /**
    * The current WebGL rendering context
    *
    * @member {WebGLRenderingContext} PIXI.systems.ShaderSystem#gl
    */
  var gl: WebGLRenderingContext = js.native
  /**
    * Changes the current shader to the one given in parameter
    *
    * @param {PIXI.Shader} shader - the new shader
    * @param {boolean} dontSync - false if the shader should automatically sync its uniforms.
    * @returns {PIXI.GLProgram} the glProgram that belongs to the shader.
    */
  def bind(shader: Shader, dontSync: Boolean): GLProgram = js.native
  /**
    * Returns the underlying GLShade rof the currently bound shader.
    * This can be handy for when you to have a little more control over the setting of your uniforms.
    *
    * @return {PIXI.GLProgram} the glProgram for the currently bound Shader for this context
    */
  def getglProgram(): GLProgram = js.native
  /**
    * Resets ShaderSystem state, does not affect WebGL state
    */
  def reset(): Unit = js.native
  /**
    * Uploads the uniforms values to the currently bound shader.
    *
    * @param {object} uniforms - the uniforms values that be applied to the current shader
    */
  def setUniforms(uniforms: js.Any): Unit = js.native
  /**
    *
    * syncs uniforms on the group
    * @param {*} group the uniform group to sync
    * @param {*} syncData this is data that is passed to the sync function and any nested sync functions
    */
  def syncUniformGroup(group: js.Any, syncData: js.Any): Unit = js.native
}

object ShaderSystem {
  @scala.inline
  def apply(
    bind: (Shader, Boolean) => GLProgram,
    destroy: () => Unit,
    getglProgram: () => GLProgram,
    gl: WebGLRenderingContext,
    renderer: Renderer,
    reset: () => Unit,
    setUniforms: js.Any => Unit,
    syncUniformGroup: (js.Any, js.Any) => Unit
  ): ShaderSystem = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), destroy = js.Any.fromFunction0(destroy), getglProgram = js.Any.fromFunction0(getglProgram), gl = gl.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setUniforms = js.Any.fromFunction1(setUniforms), syncUniformGroup = js.Any.fromFunction2(syncUniformGroup))
    __obj.asInstanceOf[ShaderSystem]
  }
  @scala.inline
  implicit class ShaderSystemOps[Self <: ShaderSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: (Shader, Boolean) => GLProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetglProgram(value: () => GLProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getglProgram")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGl(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetUniforms(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniforms")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSyncUniformGroup(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncUniformGroup")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

