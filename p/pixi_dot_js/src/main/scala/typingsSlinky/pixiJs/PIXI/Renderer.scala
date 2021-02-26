package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.pixiJs.PIXI.systems.BatchSystem
import typingsSlinky.pixiJs.PIXI.systems.ContextSystem
import typingsSlinky.pixiJs.PIXI.systems.FilterSystem
import typingsSlinky.pixiJs.PIXI.systems.FramebufferSystem
import typingsSlinky.pixiJs.PIXI.systems.GeometrySystem
import typingsSlinky.pixiJs.PIXI.systems.MaskSystem
import typingsSlinky.pixiJs.PIXI.systems.ProjectionSystem
import typingsSlinky.pixiJs.PIXI.systems.RenderTextureSystem
import typingsSlinky.pixiJs.PIXI.systems.ScissorSystem
import typingsSlinky.pixiJs.PIXI.systems.ShaderSystem
import typingsSlinky.pixiJs.PIXI.systems.StateSystem
import typingsSlinky.pixiJs.PIXI.systems.StencilSystem
import typingsSlinky.pixiJs.PIXI.systems.TextureGCSystem
import typingsSlinky.pixiJs.PIXI.systems.TextureSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Renderer draws the scene and all its content onto a WebGL enabled canvas.
  *
  * This renderer should be used for browsers that support WebGL.
  *
  * This renderer works by automatically managing WebGLBatchesm, so no need for Sprite Batches or Sprite Clouds.
  * Don't forget to add the view to your DOM or you will not see anything!
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.AbstractRenderer
  */
@js.native
trait Renderer extends AbstractRenderer {
  
  /**
    * Add a new system to the renderer.
    * @param {Function} ClassRef - Class reference
    * @param {string} [name] - Property name for system, if not specified
    *        will use a static `name` property on the class itself. This
    *        name will be assigned as s property on the Renderer so make
    *        sure it doesn't collide with properties on Renderer.
    * @return {PIXI.Renderer} Return instance of renderer
    */
  def addSystem(ClassRef: js.Function1[/* repeated */ js.Any, _]): Renderer = js.native
  def addSystem(ClassRef: js.Function1[/* repeated */ js.Any, _], name: String): Renderer = js.native
  
  /**
    * Batch system instance
    * @member {PIXI.systems.BatchSystem} batch
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val batch: BatchSystem = js.native
  
  /**
    * Clear the frame buffer
    */
  def clear(): Unit = js.native
  
  /**
    * Context system instance
    * @member {PIXI.systems.ContextSystem} context
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val context: ContextSystem = js.native
  
  /**
    * Collection of methods for extracting data (image, pixels, etc.) from a display object or render texture
    *
    * @member {PIXI.Extract} extract
    * @memberof PIXI.Renderer#
    * @see PIXI.Extract
    */
  var extract: Extract = js.native
  
  /**
    * Filter system instance
    * @member {PIXI.systems.FilterSystem} filter
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val filter: FilterSystem = js.native
  
  /**
    * Framebuffer system instance
    * @member {PIXI.systems.FramebufferSystem} framebuffer
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val framebuffer: FramebufferSystem = js.native
  
  /**
    * Geometry system instance
    * @member {PIXI.systems.GeometrySystem} geometry
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val geometry: GeometrySystem = js.native
  
  /**
    * WebGL context, set by the contextSystem (this.context)
    *
    * @readonly
    * @member {WebGLRenderingContext} PIXI.Renderer#gl
    */
  val gl: WebGLRenderingContext = js.native
  
  /**
    * Global uniforms
    * @member {PIXI.UniformGroup} PIXI.Renderer#globalUniforms
    */
  var globalUniforms: UniformGroup = js.native
  
  /**
    * Mask system instance
    * @member {PIXI.systems.MaskSystem} mask
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val mask: MaskSystem = js.native
  
  /**
    * Projection system instance
    * @member {PIXI.systems.ProjectionSystem} projection
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val projection: ProjectionSystem = js.native
  
  /**
    * Renders the object to its WebGL view
    *
    * @param {PIXI.DisplayObject} displayObject - The object to be rendered.
    * @param {PIXI.RenderTexture} [renderTexture] - The render texture to render to.
    * @param {boolean} [clear=true] - Should the canvas be cleared before the new render.
    * @param {PIXI.Matrix} [transform] - A transform to apply to the render texture before rendering.
    * @param {boolean} [skipUpdateTransform=false] - Should we skip the update transform pass?
    */
  def render(displayObject: DisplayObject): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: js.UndefOr[scala.Nothing],
    clear: js.UndefOr[scala.Nothing],
    transform: js.UndefOr[scala.Nothing],
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: js.UndefOr[scala.Nothing],
    clear: js.UndefOr[scala.Nothing],
    transform: Matrix
  ): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: js.UndefOr[scala.Nothing],
    clear: js.UndefOr[scala.Nothing],
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: js.UndefOr[scala.Nothing], clear: Boolean): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: js.UndefOr[scala.Nothing],
    clear: Boolean,
    transform: js.UndefOr[scala.Nothing],
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: js.UndefOr[scala.Nothing],
    clear: Boolean,
    transform: Matrix
  ): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: js.UndefOr[scala.Nothing],
    clear: Boolean,
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: js.UndefOr[scala.Nothing],
    transform: js.UndefOr[scala.Nothing],
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: js.UndefOr[scala.Nothing],
    transform: Matrix
  ): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: js.UndefOr[scala.Nothing],
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture, clear: Boolean): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: Boolean,
    transform: js.UndefOr[scala.Nothing],
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture, clear: Boolean, transform: Matrix): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: Boolean,
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  
  /**
    * RenderTexture system instance
    * @member {PIXI.systems.RenderTextureSystem} renderTexture
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val renderTexture: RenderTextureSystem = js.native
  
  /**
    * Flag if we are rendering to the screen vs renderTexture
    * @member {boolean} PIXI.Renderer#renderingToScreen
    * @readonly
    * @default true
    */
  val renderingToScreen: Boolean = js.native
  
  /**
    * Resets the WebGL state so you can render things however you fancy!
    *
    * @return {PIXI.Renderer} Returns itself.
    */
  def reset(): Renderer = js.native
  
  /**
    * Scissor system instance
    * @member {PIXI.systems.ScissorSystem} scissor
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val scissor: ScissorSystem = js.native
  
  /**
    * Shader system instance
    * @member {PIXI.systems.ShaderSystem} shader
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val shader: ShaderSystem = js.native
  
  /**
    * State system instance
    * @member {PIXI.systems.StateSystem} state
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val state: StateSystem = js.native
  
  /**
    * Stencil system instance
    * @member {PIXI.systems.StencilSystem} stencil
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val stencil: StencilSystem = js.native
  
  /**
    * Texture system instance
    * @member {PIXI.systems.TextureSystem} texture
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val texture: TextureSystem = js.native
  
  /**
    * Texture garbage collector system instance
    * @member {PIXI.systems.TextureGCSystem} textureGC
    * @memberof PIXI.Renderer#
    * @readonly
    */
  val textureGC: TextureGCSystem = js.native
}
