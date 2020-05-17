package typingsSlinky.phaser.Phaser.Renderer.WebGL

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLBuffer
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.Phaser.Cameras.Scene2D.Camera
import typingsSlinky.phaser.Phaser.Game
import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebGLPipeline is a class that describes the way elements will be renderered
  * in WebGL, specially focused on batching vertices (batching is not provided).
  * Pipelines are mostly used for describing 2D rendering passes but it's
  * flexible enough to be used for any type of rendering including 3D.
  * Internally WebGLPipeline will handle things like compiling shaders,
  * creating vertex buffers, assigning primitive topology and binding
  * vertex attributes.
  * 
  * The config properties are:
  * - game: Current game instance.
  * - renderer: Current WebGL renderer.
  * - gl: Current WebGL context.
  * - topology: This indicates how the primitives are rendered. The default value is GL_TRIANGLES.
  *              Here is the full list of rendering primitives (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
  * - vertShader: Source for vertex shader as a string.
  * - fragShader: Source for fragment shader as a string.
  * - vertexCapacity: The amount of vertices that shall be allocated
  * - vertexSize: The size of a single vertex in bytes.
  * - vertices: An optional buffer of vertices
  * - attributes: An array describing the vertex attributes
  * 
  * The vertex attributes properties are:
  * - name : String - Name of the attribute in the vertex shader
  * - size : integer - How many components describe the attribute. For ex: vec3 = size of 3, float = size of 1
  * - type : GLenum - WebGL type (gl.BYTE, gl.SHORT, gl.UNSIGNED_BYTE, gl.UNSIGNED_SHORT, gl.FLOAT)
  * - normalized : boolean - Is the attribute normalized
  * - offset : integer - The offset in bytes to the current attribute in the vertex. Equivalent to offsetof(vertex, attrib) in C
  * Here you can find more information of how to describe an attribute:
  * - https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer
  */
@js.native
trait WebGLPipeline extends js.Object {
  /**
    * Indicates if the current pipeline is active or not for this frame only.
    * Reset in the onRender method.
    */
  var active: Boolean = js.native
  /**
    * Array of objects that describe the vertex attributes
    */
  var attributes: js.Object = js.native
  /**
    * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
    * to the GPU.
    */
  var bytes: js.typedarray.Uint8Array = js.native
  /**
    * Indicates if the current pipeline is flushing the contents to the GPU.
    * When the variable is set the flush function will be locked.
    */
  var flushLocked: Boolean = js.native
  /**
    * The Game which owns this WebGL Pipeline.
    */
  var game: Game = js.native
  /**
    * The WebGL context this WebGL Pipeline uses.
    */
  var gl: WebGLRenderingContext = js.native
  /**
    * Height of the current viewport
    */
  var height: Double = js.native
  /**
    * Name of the Pipeline. Used for identifying
    */
  var name: String = js.native
  /**
    * The handle to a WebGL program
    */
  var program: WebGLProgram = js.native
  /**
    * The WebGL Renderer which owns this WebGL Pipeline.
    */
  var renderer: WebGLRenderer = js.native
  /**
    * Used to store the current game resolution
    */
  var resolution: Double = js.native
  /**
    * The primitive topology which the pipeline will use to submit draw calls
    */
  var topology: integer = js.native
  /**
    * The handle to a WebGL vertex buffer object.
    */
  var vertexBuffer: WebGLBuffer = js.native
  /**
    * The limit of vertices that the pipeline can hold
    */
  var vertexCapacity: integer = js.native
  /**
    * This will store the amount of components of 32 bit length
    */
  var vertexComponentCount: integer = js.native
  /**
    * How many vertices have been fed to the current pipeline.
    */
  var vertexCount: Double = js.native
  /**
    * Raw byte buffer of vertices.
    */
  var vertexData: js.typedarray.ArrayBuffer = js.native
  /**
    * The size in bytes of the vertex
    */
  var vertexSize: integer = js.native
  /**
    * The canvas which this WebGL Pipeline renders to.
    */
  var view: HTMLCanvasElement = js.native
  /**
    * Width of the current viewport
    */
  var width: Double = js.native
  /**
    * Adds a description of vertex attribute to the pipeline
    * @param name Name of the vertex attribute
    * @param size Vertex component size
    * @param type Type of the attribute
    * @param normalized Is the value normalized to a range
    * @param offset Byte offset to the beginning of the first element in the vertex
    */
  def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type = js.native
  /**
    * Binds the pipeline resources, including programs, vertex buffers and binds attributes
    */
  def bind(): this.type = js.native
  /**
    * Called when the Game has fully booted and the Renderer has finished setting up.
    * 
    * By this stage all Game level systems are now in place and you can perform any final
    * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
    */
  def boot(): Unit = js.native
  /**
    * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
    */
  def destroy(): this.type = js.native
  /**
    * Uploads the vertex data and emits a draw call
    * for the current batch of vertices.
    */
  def flush(): this.type = js.native
  /**
    * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
    * 
    * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
    */
  def onBind(): this.type = js.native
  /**
    * Called after each frame has been completely rendered and snapshots have been taken.
    */
  def onPostRender(): this.type = js.native
  /**
    * Called before each frame is rendered, but after the canvas has been cleared.
    */
  def onPreRender(): this.type = js.native
  /**
    * Called before a Scene's Camera is rendered.
    * @param scene The Scene being rendered.
    * @param camera The Scene Camera being rendered with.
    */
  def onRender(scene: Scene, camera: Camera): this.type = js.native
  /**
    * Resizes the properties used to describe the viewport
    * @param width The new width of this WebGL Pipeline.
    * @param height The new height of this WebGL Pipeline.
    * @param resolution The resolution this WebGL Pipeline should be resized to.
    */
  def resize(width: Double, height: Double, resolution: Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new value of the `float` uniform.
    */
  def setFloat1(name: String, x: Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat1v(name: String, arr: js.typedarray.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `vec2` uniform.
    * @param y The new Y component of the `vec2` uniform.
    */
  def setFloat2(name: String, x: Double, y: Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat2v(name: String, arr: js.typedarray.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `vec3` uniform.
    * @param y The new Y component of the `vec3` uniform.
    * @param z The new Z component of the `vec3` uniform.
    */
  def setFloat3(name: String, x: Double, y: Double, z: Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat3v(name: String, arr: js.typedarray.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x X component of the uniform
    * @param y Y component of the uniform
    * @param z Z component of the uniform
    * @param w W component of the uniform
    */
  def setFloat4(name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat4v(name: String, arr: js.typedarray.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new value of the `int` uniform.
    */
  def setInt1(name: String, x: integer): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `ivec2` uniform.
    * @param y The new Y component of the `ivec2` uniform.
    */
  def setInt2(name: String, x: integer, y: integer): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `ivec3` uniform.
    * @param y The new Y component of the `ivec3` uniform.
    * @param z The new Z component of the `ivec3` uniform.
    */
  def setInt3(name: String, x: integer, y: integer, z: integer): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x X component of the uniform
    * @param y Y component of the uniform
    * @param z Z component of the uniform
    * @param w W component of the uniform
    */
  def setInt4(name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose Whether to transpose the matrix. Should be `false`.
    * @param matrix The new values for the `mat2` uniform.
    */
  def setMatrix2(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose Whether to transpose the matrix. Should be `false`.
    * @param matrix The new values for the `mat3` uniform.
    */
  def setMatrix3(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose Should the matrix be transpose
    * @param matrix Matrix data
    */
  def setMatrix4(name: String, transpose: Boolean, matrix: js.typedarray.Float32Array): this.type = js.native
  /**
    * Check if the current batch of vertices is full.
    */
  def shouldFlush(): Boolean = js.native
}

object WebGLPipeline {
  @scala.inline
  def apply(
    active: Boolean,
    addAttribute: (String, integer, integer, Boolean, integer) => WebGLPipeline,
    attributes: js.Object,
    bind: () => WebGLPipeline,
    boot: () => Unit,
    bytes: js.typedarray.Uint8Array,
    destroy: () => WebGLPipeline,
    flush: () => WebGLPipeline,
    flushLocked: Boolean,
    game: Game,
    gl: WebGLRenderingContext,
    height: Double,
    name: String,
    onBind: () => WebGLPipeline,
    onPostRender: () => WebGLPipeline,
    onPreRender: () => WebGLPipeline,
    onRender: (Scene, Camera) => WebGLPipeline,
    program: WebGLProgram,
    renderer: WebGLRenderer,
    resize: (Double, Double, Double) => WebGLPipeline,
    resolution: Double,
    setFloat1: (String, Double) => WebGLPipeline,
    setFloat1v: (String, js.typedarray.Float32Array) => WebGLPipeline,
    setFloat2: (String, Double, Double) => WebGLPipeline,
    setFloat2v: (String, js.typedarray.Float32Array) => WebGLPipeline,
    setFloat3: (String, Double, Double, Double) => WebGLPipeline,
    setFloat3v: (String, js.typedarray.Float32Array) => WebGLPipeline,
    setFloat4: (String, Double, Double, Double, Double) => WebGLPipeline,
    setFloat4v: (String, js.typedarray.Float32Array) => WebGLPipeline,
    setInt1: (String, integer) => WebGLPipeline,
    setInt2: (String, integer, integer) => WebGLPipeline,
    setInt3: (String, integer, integer, integer) => WebGLPipeline,
    setInt4: (String, integer, integer, integer, integer) => WebGLPipeline,
    setMatrix2: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline,
    setMatrix3: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline,
    setMatrix4: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline,
    shouldFlush: () => Boolean,
    topology: integer,
    vertexBuffer: WebGLBuffer,
    vertexCapacity: integer,
    vertexComponentCount: integer,
    vertexCount: Double,
    vertexData: js.typedarray.ArrayBuffer,
    vertexSize: integer,
    view: HTMLCanvasElement,
    width: Double
  ): WebGLPipeline = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAttribute = js.Any.fromFunction5(addAttribute), attributes = attributes.asInstanceOf[js.Any], bind = js.Any.fromFunction0(bind), boot = js.Any.fromFunction0(boot), bytes = bytes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), flushLocked = flushLocked.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onBind = js.Any.fromFunction0(onBind), onPostRender = js.Any.fromFunction0(onPostRender), onPreRender = js.Any.fromFunction0(onPreRender), onRender = js.Any.fromFunction2(onRender), program = program.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], resize = js.Any.fromFunction3(resize), resolution = resolution.asInstanceOf[js.Any], setFloat1 = js.Any.fromFunction2(setFloat1), setFloat1v = js.Any.fromFunction2(setFloat1v), setFloat2 = js.Any.fromFunction3(setFloat2), setFloat2v = js.Any.fromFunction2(setFloat2v), setFloat3 = js.Any.fromFunction4(setFloat3), setFloat3v = js.Any.fromFunction2(setFloat3v), setFloat4 = js.Any.fromFunction5(setFloat4), setFloat4v = js.Any.fromFunction2(setFloat4v), setInt1 = js.Any.fromFunction2(setInt1), setInt2 = js.Any.fromFunction3(setInt2), setInt3 = js.Any.fromFunction4(setInt3), setInt4 = js.Any.fromFunction5(setInt4), setMatrix2 = js.Any.fromFunction3(setMatrix2), setMatrix3 = js.Any.fromFunction3(setMatrix3), setMatrix4 = js.Any.fromFunction3(setMatrix4), shouldFlush = js.Any.fromFunction0(shouldFlush), topology = topology.asInstanceOf[js.Any], vertexBuffer = vertexBuffer.asInstanceOf[js.Any], vertexCapacity = vertexCapacity.asInstanceOf[js.Any], vertexComponentCount = vertexComponentCount.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], vertexSize = vertexSize.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLPipeline]
  }
  @scala.inline
  implicit class WebGLPipelineOps[Self <: WebGLPipeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAttribute(value: (String, integer, integer, Boolean, integer) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttribute")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBind(value: () => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBoot(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBytes(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlushLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGame(value: Game): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGl(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBind(value: () => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPostRender(value: () => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPreRender(value: () => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRender(value: (Scene, Camera) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProgram(value: WebGLProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: WebGLRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double, Double) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFloat1(value: (String, Double) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat1")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloat1v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat1v")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloat2(value: (String, Double, Double) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat2")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetFloat2v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat2v")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloat3(value: (String, Double, Double, Double) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat3")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetFloat3v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat3v")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloat4(value: (String, Double, Double, Double, Double) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat4")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetFloat4v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat4v")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetInt1(value: (String, integer) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInt1")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetInt2(value: (String, integer, integer) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInt2")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetInt3(value: (String, integer, integer, integer) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInt3")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetInt4(value: (String, integer, integer, integer, integer) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInt4")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetMatrix2(value: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrix2")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetMatrix3(value: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrix3")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetMatrix4(value: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrix4")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShouldFlush(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFlush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTopology(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexBuffer(value: WebGLBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexCapacity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexComponentCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexComponentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexSize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
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

