package typingsSlinky.pixiJs.PIXI.systems

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.pixiJs.PIXI.Renderer
import typingsSlinky.pixiJs.PIXI.System
import typingsSlinky.pixiJs.anon.AnisotropicFiltering
import typingsSlinky.std.WebGLContextEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage the context.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait ContextSystem extends System {
  /**
    * Extensions being used
    * @member {object} PIXI.systems.ContextSystem#extensions
    * @readonly
    * @property {WEBGL_draw_buffers} drawBuffers - WebGL v1 extension
    * @property {WEBGL_depth_texture} depthTexture - WebGL v1 extension
    * @property {OES_texture_float} floatTexture - WebGL v1 extension
    * @property {WEBGL_lose_context} loseContext - WebGL v1 extension
    * @property {OES_vertex_array_object} vertexArrayObject - WebGL v1 extension
    * @property {EXT_texture_filter_anisotropic} anisotropicFiltering - WebGL v1 and v2 extension
    */
  val extensions: AnisotropicFiltering = js.native
  /**
    * `true` if the context is lost
    * @member {boolean}
    * @readonly
    */
  val isLost: Boolean = js.native
  /**
    * Either 1 or 2 to reflect the WebGL version being used
    * @member {number} PIXI.systems.ContextSystem#webGLVersion
    * @readonly
    */
  val webGLVersion: Double = js.native
  /**
    * Handle the context change event
    * @param {WebGLRenderingContext} gl new webgl context
    */
  def contextChange(gl: WebGLRenderingContext): Unit = js.native
  /**
    * Helper class to create a WebGL Context
    *
    * @param canvas {HTMLCanvasElement} the canvas element that we will get the context from
    * @param options {object} An options object that gets passed in to the canvas element containing the context attributes
    * @see https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement/getContext
    * @return {WebGLRenderingContext} the WebGL context
    */
  def createContext(canvas: HTMLCanvasElement, options: js.Any): WebGLRenderingContext = js.native
  /**
    * Auto-populate the extensions
    *
    * @protected
    */
  /* protected */ def getExtensions(): Unit = js.native
  /**
    * Handles a lost webgl context
    *
    * @protected
    * @param {WebGLContextEvent} event - The context lost event.
    */
  /* protected */ def handleContextLost(event: WebGLContextEvent): Unit = js.native
  /**
    * Handles a restored webgl context
    *
    * @protected
    */
  /* protected */ def handleContextRestored(): Unit = js.native
  /**
    * Initialize the context
    *
    * @protected
    * @param {WebGLRenderingContext} gl - WebGL context
    */
  /* protected */ def initFromContext(gl: WebGLRenderingContext): Unit = js.native
  /**
    * Initialize from context options
    *
    * @protected
    * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
    * @param {object} options - context attributes
    */
  /* protected */ def initFromOptions(options: js.Any): Unit = js.native
  /**
    * Handle the post-render runner event
    *
    * @protected
    */
  /* protected */ def postrender(): Unit = js.native
  /**
    * Validate context
    *
    * @protected
    * @param {WebGLRenderingContext} gl - Render context
    */
  /* protected */ def validateContext(gl: WebGLRenderingContext): Unit = js.native
}

object ContextSystem {
  @scala.inline
  def apply(
    contextChange: WebGLRenderingContext => Unit,
    createContext: (HTMLCanvasElement, js.Any) => WebGLRenderingContext,
    destroy: () => Unit,
    extensions: AnisotropicFiltering,
    getExtensions: () => Unit,
    handleContextLost: WebGLContextEvent => Unit,
    handleContextRestored: () => Unit,
    initFromContext: WebGLRenderingContext => Unit,
    initFromOptions: js.Any => Unit,
    isLost: Boolean,
    postrender: () => Unit,
    renderer: Renderer,
    validateContext: WebGLRenderingContext => Unit,
    webGLVersion: Double
  ): ContextSystem = {
    val __obj = js.Dynamic.literal(contextChange = js.Any.fromFunction1(contextChange), createContext = js.Any.fromFunction2(createContext), destroy = js.Any.fromFunction0(destroy), extensions = extensions.asInstanceOf[js.Any], getExtensions = js.Any.fromFunction0(getExtensions), handleContextLost = js.Any.fromFunction1(handleContextLost), handleContextRestored = js.Any.fromFunction0(handleContextRestored), initFromContext = js.Any.fromFunction1(initFromContext), initFromOptions = js.Any.fromFunction1(initFromOptions), isLost = isLost.asInstanceOf[js.Any], postrender = js.Any.fromFunction0(postrender), renderer = renderer.asInstanceOf[js.Any], validateContext = js.Any.fromFunction1(validateContext), webGLVersion = webGLVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSystem]
  }
  @scala.inline
  implicit class ContextSystemOps[Self <: ContextSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextChange(value: WebGLRenderingContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateContext(value: (HTMLCanvasElement, js.Any) => WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createContext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExtensions(value: AnisotropicFiltering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExtensions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleContextLost(value: WebGLContextEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleContextLost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleContextRestored(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleContextRestored")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitFromContext(value: WebGLRenderingContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFromContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitFromOptions(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFromOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostrender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postrender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidateContext(value: WebGLRenderingContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWebGLVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webGLVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

