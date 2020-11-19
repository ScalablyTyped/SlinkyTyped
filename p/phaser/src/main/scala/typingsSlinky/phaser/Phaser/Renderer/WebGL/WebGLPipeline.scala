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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Adds a description of vertex attribute to the pipeline
    * @param name Name of the vertex attribute
    * @param size Vertex component size
    * @param type Type of the attribute
    * @param normalized Is the value normalized to a range
    * @param offset Byte offset to the beginning of the first element in the vertex
    */
  def addAttribute(name: String, size: integer, `type`: integer, normalized: Boolean, offset: integer): this.type = js.native
  
  /**
    * Array of objects that describe the vertex attributes
    */
  var attributes: js.Object = js.native
  
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
    * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
    * to the GPU.
    */
  var bytes: js.typedarray.Uint8Array = js.native
  
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
    * The handle to a WebGL program
    */
  var program: WebGLProgram = js.native
  
  /**
    * The WebGL Renderer which owns this WebGL Pipeline.
    */
  var renderer: WebGLRenderer = js.native
  
  /**
    * Resizes the properties used to describe the viewport
    * @param width The new width of this WebGL Pipeline.
    * @param height The new height of this WebGL Pipeline.
    * @param resolution The resolution this WebGL Pipeline should be resized to.
    */
  def resize(width: Double, height: Double, resolution: Double): this.type = js.native
  
  /**
    * Used to store the current game resolution
    */
  var resolution: Double = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAttribute(value: (String, integer, integer, Boolean, integer) => WebGLPipeline): Self = this.set("addAttribute", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBind(value: () => WebGLPipeline): Self = this.set("bind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBoot(value: () => Unit): Self = this.set("boot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBytes(value: js.typedarray.Uint8Array): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => WebGLPipeline): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => WebGLPipeline): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushLocked(value: Boolean): Self = this.set("flushLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGame(value: Game): Self = this.set("game", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGl(value: WebGLRenderingContext): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBind(value: () => WebGLPipeline): Self = this.set("onBind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostRender(value: () => WebGLPipeline): Self = this.set("onPostRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPreRender(value: () => WebGLPipeline): Self = this.set("onPreRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRender(value: (Scene, Camera) => WebGLPipeline): Self = this.set("onRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgram(value: WebGLProgram): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: WebGLRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: (Double, Double, Double) => WebGLPipeline): Self = this.set("resize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFloat1(value: (String, Double) => WebGLPipeline): Self = this.set("setFloat1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFloat1v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = this.set("setFloat1v", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFloat2(value: (String, Double, Double) => WebGLPipeline): Self = this.set("setFloat2", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetFloat2v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = this.set("setFloat2v", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFloat3(value: (String, Double, Double, Double) => WebGLPipeline): Self = this.set("setFloat3", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetFloat3v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = this.set("setFloat3v", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFloat4(value: (String, Double, Double, Double, Double) => WebGLPipeline): Self = this.set("setFloat4", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetFloat4v(value: (String, js.typedarray.Float32Array) => WebGLPipeline): Self = this.set("setFloat4v", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetInt1(value: (String, integer) => WebGLPipeline): Self = this.set("setInt1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetInt2(value: (String, integer, integer) => WebGLPipeline): Self = this.set("setInt2", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetInt3(value: (String, integer, integer, integer) => WebGLPipeline): Self = this.set("setInt3", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetInt4(value: (String, integer, integer, integer, integer) => WebGLPipeline): Self = this.set("setInt4", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetMatrix2(value: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline): Self = this.set("setMatrix2", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetMatrix3(value: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline): Self = this.set("setMatrix3", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetMatrix4(value: (String, Boolean, js.typedarray.Float32Array) => WebGLPipeline): Self = this.set("setMatrix4", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShouldFlush(value: () => Boolean): Self = this.set("shouldFlush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopology(value: integer): Self = this.set("topology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexBuffer(value: WebGLBuffer): Self = this.set("vertexBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexCapacity(value: integer): Self = this.set("vertexCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexComponentCount(value: integer): Self = this.set("vertexComponentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexCount(value: Double): Self = this.set("vertexCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexData(value: js.typedarray.ArrayBuffer): Self = this.set("vertexData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexSize(value: integer): Self = this.set("vertexSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: HTMLCanvasElement): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
